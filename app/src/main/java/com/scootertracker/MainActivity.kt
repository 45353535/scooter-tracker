package com.scootertracker

import android.Manifest
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.os.IBinder
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : ComponentActivity() {

    private val _serviceFlow = MutableStateFlow<TrackingService?>(null)
    val serviceFlow: StateFlow<TrackingService?> = _serviceFlow

    private var bound = false

    private val connection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            _serviceFlow.value = (service as TrackingService.LocalBinder).getService()
            bound = true
        }
        override fun onServiceDisconnected(name: ComponentName?) {
            bound = false
            _serviceFlow.value = null
        }
    }

    private val permissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { _ ->
        _serviceFlow.value?.retryGpsIfNeeded()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestPermissions()

        setContent {
            val svc by serviceFlow.collectAsState()

            MainScreen(
                trackingService = svc,
                onStartClick = { threshold ->
                    if (hasLocationPermission()) {
                        val i = Intent(this@MainActivity, TrackingService::class.java).apply {
                            action = TrackingService.ACTION_START
                            putExtra(TrackingService.EXTRA_THRESHOLD, threshold)
                        }
                        ContextCompat.startForegroundService(this@MainActivity, i)
                    }
                },
                onStopClick = {
                    val i = Intent(this@MainActivity, TrackingService::class.java).apply {
                        action = TrackingService.ACTION_STOP
                    }
                    ContextCompat.startForegroundService(this@MainActivity, i)
                },
                onResetClick = { svc?.resetDistance() },
                onExitClick = {
                    val i = Intent(this@MainActivity, TrackingService::class.java).apply {
                        action = TrackingService.ACTION_EXIT
                    }
                    ContextCompat.startForegroundService(this@MainActivity, i)
                    finishAndRemoveTask()
                }
            )
        }
    }

    override fun onStart() {
        super.onStart()
        Intent(this, TrackingService::class.java).also { intent ->
            ContextCompat.startForegroundService(this, intent)
            bindService(intent, connection, Context.BIND_AUTO_CREATE)
        }
    }

    override fun onStop() {
        super.onStop()
        if (bound) {
            unbindService(connection)
            bound = false
            _serviceFlow.value = null
        }
    }

    private fun hasLocationPermission(): Boolean =
        ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED

    private fun requestPermissions() {
        val permissions = mutableListOf(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION
        )
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            permissions.add(Manifest.permission.POST_NOTIFICATIONS)
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            permissions.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION)
        }
        val needed = permissions.filter {
            ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED
        }
        if (needed.isNotEmpty()) {
            permissionLauncher.launch(needed.toTypedArray())
        }
    }
}

private val DarkBg = Color(0xFF1A1A1A)
private val CardBg = Color(0xFF2A2A2A)
private val CyanNeon = Color(0xFF00D4FF)
private val PinkNeon = Color(0xFFFF00AA)
private val ButtonTeal = Color(0xFF00BCD4)
private val SliderTrack = Color(0xFF3A3A3A)
private val SliderActive = Color(0xFFCCCCCC)
private val TextSecondary = Color(0xFF999999)
private val TextWhite = Color(0xFFFFFFFF)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    trackingService: TrackingService?,
    onStartClick: (Float) -> Unit,
    onStopClick: () -> Unit,
    onResetClick: () -> Unit,
    onExitClick: () -> Unit
) {
    var speedThreshold by remember { mutableStateOf(10f) }
    var showHistory by remember { mutableStateOf(false) }

    val speed by trackingService?.speedKmh?.collectAsState(0f) ?: remember { mutableStateOf(0f) }
    val distance by trackingService?.distanceKm?.collectAsState(0f) ?: remember { mutableStateOf(0f) }
    val isTracking by trackingService?.isTracking?.collectAsState(false) ?: remember { mutableStateOf(false) }
    val satelliteCount by trackingService?.satelliteCount?.collectAsState(0) ?: remember { mutableStateOf(0) }
    val hasGpsFix by trackingService?.hasGpsFix?.collectAsState(false) ?: remember { mutableStateOf(false) }

    val maxSpeed = 60f
    val speedFraction = (speed / maxSpeed).coerceIn(0f, 1f)

    if (showHistory) {
        HistoryDialog(
            service = trackingService,
            onDismiss = { showHistory = false }
        )
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkBg)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(52.dp))

            Text(
                "Wenbox U2",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                color = TextWhite,
                letterSpacing = 2.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier.size(200.dp),
                contentAlignment = Alignment.Center
            ) {
                Canvas(modifier = Modifier.size(200.dp)) {
                    val strokeW = 12.dp.toPx()
                    val halfSize = size.minDimension / 2f
                    val arcBrush = Brush.sweepGradient(
                        colors = listOf(CyanNeon, PinkNeon, CyanNeon),
                        center = Offset(halfSize, halfSize)
                    )
                    drawArc(
                        SliderTrack, 135f, 270f, false,
                        style = Stroke(strokeW, cap = StrokeCap.Round)
                    )
                    drawArc(
                        arcBrush, 135f, 270f * speedFraction, false,
                        style = Stroke(strokeW, cap = StrokeCap.Round)
                    )
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "%.0f".format(speed),
                        fontSize = 56.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextWhite
                    )
                    Text("км/ч", fontSize = 14.sp, color = TextSecondary)
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                val gpsTint = if (hasGpsFix && satelliteCount > 0) Color(0xFF00FF88)
                              else if (satelliteCount > 0) Color(0xFFFF6B6B)
                              else Color(0xFF555555)
                Icon(
                    painter = painterResource(com.scootertracker.R.drawable.ic_gps),
                    contentDescription = null,
                    tint = gpsTint,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        "$satelliteCount спутников",
                        fontSize = 16.sp,
                        color = gpsTint
                    )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Card(
                    modifier = Modifier.weight(1f).height(80.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = CardBg)
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                TrackingService.formatDistance(distance),
                                fontSize = 22.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextWhite
                            )
                            Text("Дистанция", fontSize = 12.sp, color = TextSecondary)
                        }
                    }
                }

                Card(
                    modifier = Modifier.weight(1f).height(80.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = CardBg)
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                if (isTracking) "▶" else "||",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextWhite
                            )
                            Text("Статус", fontSize = 12.sp, color = TextSecondary)
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Порог скорости", fontSize = 13.sp, color = TextSecondary)
                    Text("%.0f км/ч".format(speedThreshold), fontSize = 13.sp, color = TextWhite)
            }

            Spacer(modifier = Modifier.height(4.dp))

            Slider(
                value = speedThreshold,
                onValueChange = { speedThreshold = it },
                valueRange = 5f..30f,
                steps = 24,
                colors = SliderDefaults.colors(
                    thumbColor = SliderActive,
                    activeTrackColor = SliderActive,
                    inactiveTrackColor = SliderTrack
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(28.dp))

            Button(
                onClick = { if (isTracking) onStopClick() else onStartClick(speedThreshold) },
                modifier = Modifier.fillMaxWidth().height(52.dp),
                shape = RoundedCornerShape(26.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ButtonTeal,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    if (isTracking) "Остановить" else "Начать трекинг",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            if (!isTracking && distance > 0f) {
                Spacer(modifier = Modifier.height(12.dp))
                OutlinedButton(
                    onClick = onResetClick,
                    modifier = Modifier.fillMaxWidth().height(48.dp),
                    shape = RoundedCornerShape(24.dp),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = TextSecondary)
                ) {
                    Text("Сбросить", fontSize = 14.sp)
                }
            }

            Spacer(modifier = Modifier.height(12.dp))
            OutlinedButton(
                onClick = { showHistory = true },
                modifier = Modifier.fillMaxWidth().height(48.dp),
                shape = RoundedCornerShape(24.dp),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = TextWhite)
            ) {
                Text("История поездок", fontSize = 14.sp)
            }

            Spacer(modifier = Modifier.height(8.dp))
            TextButton(
                onClick = onExitClick,
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.textButtonColors(contentColor = TextSecondary)
            ) {
                Text("Выход", fontSize = 13.sp, fontWeight = FontWeight.Normal)
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun HistoryDialog(
    service: TrackingService?,
    onDismiss: () -> Unit
) {
    var trips by remember { mutableStateOf(service?.getTripHistory() ?: emptyList()) }
    val timeFormat = remember { SimpleDateFormat("HH:mm", Locale.getDefault()) }
    val dateFormat = remember { SimpleDateFormat("dd.MM.yy", Locale.getDefault()) }

    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = CardBg,
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("История поездок", fontWeight = FontWeight.Bold, color = TextWhite)
                if (trips.isNotEmpty()) {
                    TextButton(
                        onClick = {
                            service?.clearTripHistory()
                            trips = emptyList()
                        },
                        colors = ButtonDefaults.textButtonColors(contentColor = Color(0xFFFF6B6B))
                    ) {
                        Text("Очистить", fontWeight = FontWeight.Bold)
                    }
                }
            }
        },
        text = {
            if (trips.isEmpty()) {
                Text("Нет записей", color = TextSecondary)
            } else {
                Column(
                    modifier = Modifier
                        .heightIn(max = 360.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    trips.reversed().forEachIndexed { index, trip ->
                        val startStr = dateFormat.format(Date(trip.startTime)) + " " + timeFormat.format(Date(trip.startTime))
                        val endStr = timeFormat.format(Date(trip.endTime))
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp)
                        ) {
                            Text(
                                "$startStr → $endStr",
                                fontSize = 13.sp,
                                color = TextSecondary
                            )
                            Text(
                                TrackingService.formatDistance(trip.distanceMeters / 1000f),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextWhite
                            )
                        }
                        if (index < trips.size - 1) {
                            Box(modifier = Modifier.fillMaxWidth().height(0.5.dp).background(SliderTrack))
                        }
                    }
                }
            }
        },
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text("Закрыть", color = CyanNeon, fontWeight = FontWeight.Bold)
            }
        }
    )
}
