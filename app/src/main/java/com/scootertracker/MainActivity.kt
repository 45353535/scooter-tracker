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
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

private val DarkBg = Color(0xFF1A1A2E)
private val CardBg = Color(0xFF16213E)
private val SpeedColor = Color(0xFF00D2FF)
private val DistanceColor = Color(0xFF00FF88)
private val WarnColor = Color(0xFFFF6B6B)
private val SliderTrack = Color(0xFF2D3561)
private val SliderActive = Color(0xFF00D2FF)
private val TextSecondary = Color(0xFF8B8FA3)

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

    val speed by trackingService?.speedKmh?.collectAsState(0f) ?: remember { mutableStateOf(0f) }
    val distance by trackingService?.distanceKm?.collectAsState(0f) ?: remember { mutableStateOf(0f) }
    val isTracking by trackingService?.isTracking?.collectAsState(false) ?: remember { mutableStateOf(false) }
    val satelliteCount by trackingService?.satelliteCount?.collectAsState(0) ?: remember { mutableStateOf(0) }
    val hasGpsFix by trackingService?.hasGpsFix?.collectAsState(false) ?: remember { mutableStateOf(false) }

    val maxSpeed = 60f
    val speedFraction = (speed / maxSpeed).coerceIn(0f, 1f)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(DarkBg, Color(0xFF0F0F23))))
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp).verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(48.dp))

            Text("Scooter Tracker", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.White)

            Spacer(modifier = Modifier.height(24.dp))

            Box(
                modifier = Modifier.size(220.dp),
                contentAlignment = Alignment.Center
            ) {
                Canvas(modifier = Modifier.size(220.dp)) {
                    val strokeW = 14.dp.toPx()
                    drawArc(SliderTrack, 135f, 270f, false, style = Stroke(strokeW, cap = StrokeCap.Round))
                    drawArc(SpeedColor, 135f, 270f * speedFraction, false, style = Stroke(strokeW, cap = StrokeCap.Round))
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "%.0f".format(speed), fontSize = 64.sp, fontWeight = FontWeight.Bold, color = Color.White)
                    Text("км/ч", fontSize = 16.sp, color = TextSecondary)
                }
            }

            Spacer(modifier = Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                val gpsTint = if (hasGpsFix && satelliteCount > 0) DistanceColor
                              else if (satelliteCount > 0) WarnColor
                              else Color(0xFF555555)
                Icon(
                    painter = painterResource(com.scootertracker.R.drawable.ic_gps),
                    contentDescription = null,
                    tint = gpsTint,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    "$satelliteCount спутников",
                    fontSize = 13.sp,
                    color = gpsTint
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    when {
                        !isTracking -> ""
                        hasGpsFix -> "— фиксация есть"
                        satelliteCount > 0 -> "(нет фиксации)"
                        else -> ""
                    },
                    fontSize = 13.sp, color = TextSecondary
                )
            }

            if (speed > 0f && speed < speedThreshold) {
                Spacer(modifier = Modifier.height(8.dp))
                Text("Медленнее порога — не учитывается", fontSize = 13.sp, color = WarnColor)
            }

            Spacer(modifier = Modifier.height(20.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = CardBg)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            TrackingService.formatDistance(distance),
                            fontSize = 28.sp, fontWeight = FontWeight.Bold, color = DistanceColor
                        )
                        Text("Дистанция", fontSize = 13.sp, color = TextSecondary)
                    }

                    Box(modifier = Modifier.width(1.dp).height(40.dp).background(SliderTrack))

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            if (isTracking) "Активен" else "Пауза",
                            fontSize = 20.sp, fontWeight = FontWeight.Bold,
                            color = if (isTracking) DistanceColor else WarnColor
                        )
                        Text("Статус", fontSize = 13.sp, color = TextSecondary)
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text("Порог скорости", fontSize = 14.sp, color = TextSecondary)
            Spacer(modifier = Modifier.height(4.dp))
            Text("%.0f км/ч".format(speedThreshold), fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
            Spacer(modifier = Modifier.height(8.dp))

            Slider(
                value = speedThreshold,
                onValueChange = { speedThreshold = it },
                valueRange = 5f..30f,
                steps = 24,
                colors = SliderDefaults.colors(
                    thumbColor = SliderActive, activeTrackColor = SliderActive, inactiveTrackColor = SliderTrack
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(28.dp))

            Button(
                onClick = { if (isTracking) onStopClick() else onStartClick(speedThreshold) },
                modifier = Modifier.fillMaxWidth().height(56.dp),
                shape = RoundedCornerShape(28.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isTracking) WarnColor else SliderActive,
                    contentColor = Color.White
                )
            ) {
                Text(
                    if (isTracking) "Остановить" else "Начать трекинг",
                    fontSize = 18.sp, fontWeight = FontWeight.Bold
                )
            }

            if (!isTracking && distance > 0f) {
                Spacer(modifier = Modifier.height(12.dp))
                OutlinedButton(
                    onClick = onResetClick,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(28.dp),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = WarnColor)
                ) {
                    Text("Сбросить дистанцию", fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.height(12.dp))
            TextButton(
                onClick = onExitClick,
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.textButtonColors(contentColor = TextSecondary)
            ) {
                Text("Выход", fontWeight = FontWeight.Bold)
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
