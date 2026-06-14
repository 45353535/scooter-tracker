package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.sensors.SensorsData;

/* JADX INFO: loaded from: classes11.dex */
public final class ig implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lg f64694a;

    public ig(lg lgVar) {
        this.f64694a = lgVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f64694a.f64883k.getClass();
        SensorsData sensorsDataU = MetaData.E().U();
        if (sensorsDataU != null) {
            try {
                if (sensorsDataU.h()) {
                    if (lg.a(this.f64694a, sensorEvent)) {
                        return;
                    }
                    lg lgVar = this.f64694a;
                    if (lgVar.f64874b < lgVar.f64885m) {
                        d2 d2Var = lgVar.f64877e;
                        if (d2Var != null && d2Var.f64403f != lgVar.a()) {
                        }
                        lg.a(this.f64694a, sensorEvent, sensorsDataU);
                        return;
                    }
                    lg lgVar2 = this.f64694a;
                    lgVar2.a(lgVar2.f64874b >= lgVar2.f64885m);
                    return;
                }
            } catch (Throwable th2) {
                if (this.f64694a.a(1)) {
                    g9.a(th2);
                    return;
                }
                return;
            }
        }
        this.f64694a.a(true);
    }
}
