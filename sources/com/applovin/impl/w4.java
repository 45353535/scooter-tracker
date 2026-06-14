package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class w4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f11205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f11206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Sensor f11207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Sensor f11208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f11209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f11210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f11211h;

    public w4(com.applovin.impl.sdk.k kVar) {
        this.f11209f = kVar;
        f0 f0Var = new f0();
        this.f11206c = f0Var;
        this.f11207d = f0Var.a(9);
        this.f11208e = f0Var.a(4);
        this.f11204a = ((Integer) kVar.a(x4.f11327h4)).intValue();
        this.f11205b = ((Float) kVar.a(x4.f11318g4)).floatValue();
    }

    public float a() {
        if (this.f11210g == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    public float b() {
        return this.f11211h;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f11209f.n0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f11206c.b(this);
        if (((Boolean) this.f11209f.o0().a(x4.f11300e4)).booleanValue()) {
            this.f11206c.b(this, this.f11207d, (int) TimeUnit.MILLISECONDS.toMicros(this.f11204a), this.f11209f.O());
        }
        if (((Boolean) this.f11209f.o0().a(x4.f11309f4)).booleanValue()) {
            this.f11206c.b(this, this.f11208e, (int) TimeUnit.MILLISECONDS.toMicros(this.f11204a), this.f11209f.O());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f11206c.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f11210g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f11211h * this.f11205b;
            this.f11211h = f10;
            this.f11211h = f10 + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }
}
