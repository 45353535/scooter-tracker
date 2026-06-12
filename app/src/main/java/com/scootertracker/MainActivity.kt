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
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {

    private var trackingService: TrackingService? = null
    private var bound = false

    private val connection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            trackingService = (service as TrackingService.LocalBinder).getService()
            bound = true
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            bound = false
            trackingService = null
        }
    }

    private val permissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { _ -> }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestPermissions()

        setContent {
            MaterialTheme(
                colorScheme = lightColorScheme(
                    primary = Color(0xFF1976D2),
                    secondary = Color(0xFF26A69A),
                    background = Color(0xFFF5F5F5)
                )
            ) {
                MainScreen(trackingService)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Intent(this, TrackingService::class.java).also { intent ->
            bindService(intent, connection, Context.BIND_AUTO_CREATE)
        }
    }

    override fun onStop() {
        super.onStop()
        if (bound) {
            unbindService(connection)
            bound = false
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (bound) {
            unbindService(connection)
        }
    }

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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(trackingService: TrackingService?) {
    var speedThreshold by remember { mutableStateOf(10f) }

    val speed by trackingService?.speedKmh?.collectAsState(0f) ?: remember { mutableStateOf(0f) }
    val distance by trackingService?.distanceKm?.collectAsState(0f) ?: remember { mutableStateOf(0f) }
    val isTracking by trackingService?.isTracking?.collectAsState(false) ?: remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Scooter Tracker") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(24.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Скорость", fontSize = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "%.1f км/ч".format(speed),
                        fontSize = 48.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (speed >= speedThreshold)
                            MaterialTheme.colorScheme.primary
                        else
                            MaterialTheme.colorScheme.onSurface
                    )
                    if (speed > 0f && speed < speedThreshold) {
                        Text(
                            "Медленнее порога — не учитывается",
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.error
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Пройдено на скутере", fontSize = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = TrackingService.formatDistance(distance),
                        fontSize = 48.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.secondary
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                "Порог скорости: %.0f км/ч".format(speedThreshold),
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(8.dp))

            Slider(
                value = speedThreshold,
                onValueChange = { speedThreshold = it },
                onValueChangeFinished = {
                    trackingService?.let {
                        val intent = Intent(it, TrackingService::class.java).apply {
                            action = TrackingService.ACTION_UPDATE_THRESHOLD
                            putExtra(TrackingService.EXTRA_THRESHOLD, speedThreshold)
                        }
                        it.startService(intent)
                    }
                },
                valueRange = 5f..30f,
                steps = 24,
                modifier = Modifier.fillMaxWidth()
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("5 км/ч", fontSize = 12.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                Text("30 км/ч", fontSize = 12.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {
                    trackingService?.let { svc ->
                        val intent = Intent(svc, TrackingService::class.java).apply {
                            action = if (isTracking) TrackingService.ACTION_STOP
                            else TrackingService.ACTION_START
                            putExtra(TrackingService.EXTRA_THRESHOLD, speedThreshold)
                        }
                        if (isTracking) svc.startService(intent)
                        else ContextCompat.startForegroundService(svc, intent)
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isTracking)
                        MaterialTheme.colorScheme.error
                    else
                        MaterialTheme.colorScheme.primary
                )
            ) {
                Text(
                    if (isTracking) "Остановить" else "Начать трекинг",
                    fontSize = 18.sp
                )
            }

            if (!isTracking && distance > 0f) {
                Spacer(modifier = Modifier.height(12.dp))
                OutlinedButton(
                    onClick = { trackingService?.resetDistance() },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Сбросить дистанцию")
                }
            }
        }
    }
}
