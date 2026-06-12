package com.scootertracker

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.location.Location
import android.os.Binder
import android.os.IBinder
import androidx.core.app.NotificationCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlin.math.roundToInt

class TrackingService : Service() {

    inner class LocalBinder : Binder() {
        fun getService(): TrackingService = this@TrackingService
    }

    private val binder = LocalBinder()
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private var locationCallback: LocationCallback? = null

    private var lastLocation: Location? = null
    private var totalDistanceMeters = 0f

    private val _speedKmh = MutableStateFlow(0f)
    val speedKmh: StateFlow<Float> = _speedKmh

    private val _distanceKm = MutableStateFlow(0f)
    val distanceKm: StateFlow<Float> = _distanceKm

    private val _isTracking = MutableStateFlow(false)
    val isTracking: StateFlow<Boolean> = _isTracking

    var speedThresholdKmh = 10f

    override fun onCreate() {
        super.onCreate()
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        createNotificationChannel()
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
        _isTracking.value = true
        startForeground(NOTIFICATION_ID, createNotification())
        startLocationUpdates()
    }

    private fun stop() {
        _isTracking.value = false
        totalDistanceMeters = 0f
        _distanceKm.value = 0f
        _speedKmh.value = 0f
        lastLocation = null
        stopLocationUpdates()
        stopForeground(STOP_FOREGROUND_REMOVE)
        stopSelf()
    }

    private fun startLocationUpdates() {
        val locationRequest = LocationRequest.Builder(
            Priority.PRIORITY_HIGH_ACCURACY,
            UPDATE_INTERVAL_MS
        ).apply {
            setMinUpdateIntervalMillis(FASTEST_INTERVAL_MS)
            setMaxUpdateDelayMillis(MAX_WAIT_MS)
        }.build()

        locationCallback = object : LocationCallback() {
            override fun onLocationResult(result: LocationResult) {
                result.locations.forEach { location ->
                    processLocation(location)
                }
            }
        }

        try {
            fusedLocationClient.requestLocationUpdates(
                locationRequest,
                locationCallback!!,
                mainLooper
            )
        } catch (e: SecurityException) {
            _isTracking.value = false
        }
    }

    private fun stopLocationUpdates() {
        locationCallback?.let {
            fusedLocationClient.removeLocationUpdates(it)
        }
        locationCallback = null
    }

    private fun processLocation(location: Location) {
        val speedMs = location.speed
        val speedKm = speedMs * 3.6f
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

        updateNotification()
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
            .setContentTitle(getString(R.string.tracking_active))
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
        private const val UPDATE_INTERVAL_MS = 2000L
        private const val FASTEST_INTERVAL_MS = 1000L
        private const val MAX_WAIT_MS = 5000L
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
