package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class fg implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg f64510a;

    public fg(hg hgVar) {
        this.f64510a = hgVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        JSONArray jSONArrayA;
        int iA = this.f64510a.f64641b.a(sensorEvent);
        hg hgVar = this.f64510a;
        if (iA == hgVar.f64644e) {
            hgVar.b();
            hg hgVar2 = this.f64510a;
            x1 x1Var = hgVar2.f64643d;
            if (x1Var != null) {
                try {
                    jSONArrayA = hgVar2.f64641b.a();
                } catch (Exception unused) {
                    jSONArrayA = null;
                }
                x1Var.a(jSONArrayA);
            }
        }
    }
}
