package com.scootertracker

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.location.GnssStatus
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Binder
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import androidx.core.app.NotificationCompat
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlin.math.roundToInt

class TrackingService : Service() {

    inner class LocalBinder : Binder() {
        fun getService(): TrackingService = this@TrackingService
    }

    private val binder = LocalBinder()
    private lateinit var locationManager: LocationManager
    private lateinit var prefs: SharedPreferences
    private var gpsListener: LocationListener? = null
    private var netListener: LocationListener? = null
    private var gnssCallback: GnssStatus.Callback? = null

    private var lastLocation: Location? = null
    private var lastSpeedCalcTime: Long = 0
    private var totalDistanceMeters = 0f

    private val _speedKmh = MutableStateFlow(0f)
    val speedKmh: StateFlow<Float> = _speedKmh

    private val _distanceKm = MutableStateFlow(0f)
    val distanceKm: StateFlow<Float> = _distanceKm

    private val _isTracking = MutableStateFlow(false)
    val isTracking: StateFlow<Boolean> = _isTracking

    private val _satelliteCount = MutableStateFlow(0)
    val satelliteCount: StateFlow<Int> = _satelliteCount

    private val _hasGpsFix = MutableStateFlow(false)
    val hasGpsFix: StateFlow<Boolean> = _hasGpsFix

    var speedThresholdKmh = 10f

    override fun onCreate() {
        super.onCreate()
        locationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
        prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        totalDistanceMeters = prefs.getFloat(PREFS_DISTANCE, 0f)
        _distanceKm.value = (totalDistanceMeters / 1000f * 100).roundToInt() / 100f
        createNotificationChannel()
        startGnss()
    }

    override fun onDestroy() {
        stopGnss()
        saveDistance()
        super.onDestroy()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_START -> {
                intent.getFloatExtra(EXTRA_THRESHOLD, speedThresholdKmh).let {
                    speedThresholdKmh = it
                }
                start()
            }
            ACTION_STOP -> stop()
            ACTION_UPDATE_THRESHOLD -> {
                speedThresholdKmh = intent.getFloatExtra(EXTRA_THRESHOLD, speedThresholdKmh)
            }
        }
        return START_STICKY
    }

    private fun start() {
        if (_isTracking.value) return
        _isTracking.value = true
        try {
            startForeground(NOTIFICATION_ID, createNotification())
            startGps()
        } catch (e: Exception) {
            _isTracking.value = false
            stopSelf()
        }
    }

    fun resetDistance() {
        totalDistanceMeters = 0f
        _distanceKm.value = 0f
        lastLocation = null
        prefs.edit().putFloat(PREFS_DISTANCE, 0f).apply()
        updateNotification()
    }

    private fun stop() {
        if (!_isTracking.value) return
        _isTracking.value = false
        _speedKmh.value = 0f
        saveDistance()
        stopGps()
        startForeground(NOTIFICATION_ID, createNotification())
    }

    private fun saveDistance() {
        prefs.edit().putFloat(PREFS_DISTANCE, totalDistanceMeters).apply()
    }

    private fun startGps() {
        val gpsListener = LocationListener { location ->
            processLocation(location)
        }
        this.gpsListener = gpsListener

        val netListener = LocationListener { location ->
            if (lastLocation == null) processLocation(location)
        }
        this.netListener = netListener

        try {
            if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                locationManager.requestLocationUpdates(
                    LocationManager.GPS_PROVIDER, 1000L, 0f, gpsListener, Looper.getMainLooper()
                )
            }
            if (locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
                locationManager.requestLocationUpdates(
                    LocationManager.NETWORK_PROVIDER, 3000L, 0f, netListener, Looper.getMainLooper()
                )
            }
        } catch (e: SecurityException) {
            _isTracking.value = false
        }
    }

    private fun stopGps() {
        gpsListener?.let { locationManager.removeUpdates(it) }
        netListener?.let { locationManager.removeUpdates(it) }
        gpsListener = null
        netListener = null
    }

    private fun startGnss() {
        gnssCallback = object : GnssStatus.Callback() {
            override fun onSatelliteStatusChanged(status: GnssStatus) {
                var used = 0
                for (i in 0 until status.satelliteCount) {
                    if (status.usedInFix(i)) used++
                }
                _satelliteCount.value = status.satelliteCount
                _hasGpsFix.value = used > 0
            }
            override fun onStarted() {}
            override fun onStopped() {}
            override fun onFirstFix(ttffMillis: Int) {}
        }
        try {
            locationManager.registerGnssStatusCallback(gnssCallback!!, Handler(Looper.getMainLooper()))
        } catch (_: SecurityException) {
        }
    }

    private fun stopGnss() {
        gnssCallback?.let { locationManager.unregisterGnssStatusCallback(it) }
        gnssCallback = null
        _satelliteCount.value = 0
        _hasGpsFix.value = false
    }

    private fun processLocation(location: Location) {
        val speedKm = calculateSpeedKmh(location)
        _speedKmh.value = (speedKm * 10).roundToInt() / 10f

        if (speedKm >= speedThresholdKmh) {
            lastLocation?.let { last ->
                val delta = last.distanceTo(location)
                if (delta > MIN_DELTA_METERS) {
                    totalDistanceMeters += delta
                    _distanceKm.value = (totalDistanceMeters / 1000f * 100).roundToInt() / 100f
                }
            }
        }
        lastLocation = location
        lastSpeedCalcTime = location.time

        updateNotification()
    }

    private fun calculateSpeedKmh(location: Location): Float {
        val gpsSpeed = location.speed
        if (gpsSpeed > 0f) return gpsSpeed * 3.6f

        if (lastLocation != null && lastSpeedCalcTime > 0) {
            val timeDelta = (location.time - lastSpeedCalcTime) / 1000f
            if (timeDelta in 0.1f..10f) {
                val distDelta = lastLocation!!.distanceTo(location)
                return (distDelta / timeDelta) * 3.6f
            }
        }
        return 0f
    }

    private fun createNotificationChannel() {
        val channel = NotificationChannel(
            CHANNEL_ID,
            getString(R.string.channel_name),
            NotificationManager.IMPORTANCE_LOW
        ).apply {
            description = getString(R.string.channel_description)
        }
        val manager = getSystemService(NotificationManager::class.java)
        manager.createNotificationChannel(channel)
    }

    private fun createNotification(): Notification {
        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle(if (_isTracking.value) getString(R.string.tracking_active) else getString(R.string.tracking_stopped))
            .setContentText(formatDistance(_distanceKm.value))
            .setSmallIcon(android.R.drawable.ic_menu_compass)
            .setOngoing(true)
            .setSilent(true)
            .build()
    }

    private fun updateNotification() {
        val manager = getSystemService(NotificationManager::class.java)
        manager.notify(NOTIFICATION_ID, createNotification())
    }

    override fun onBind(intent: Intent?): IBinder = binder

    companion object {
        const val ACTION_START = "com.scootertracker.START"
        const val ACTION_STOP = "com.scootertracker.STOP"
        const val ACTION_UPDATE_THRESHOLD = "com.scootertracker.UPDATE_THRESHOLD"
        const val EXTRA_THRESHOLD = "threshold"

        private const val CHANNEL_ID = "scooter_tracker"
        private const val NOTIFICATION_ID = 1
        private const val PREFS_NAME = "scooter_tracker_prefs"
        private const val PREFS_DISTANCE = "total_distance_meters"
        private const val MIN_DELTA_METERS = 2f

        fun formatDistance(km: Float): String {
            return if (km < 1f) {
                "${(km * 1000).roundToInt()} м"
            } else {
                "%.2f км".format(km)
            }
        }
    }
}
