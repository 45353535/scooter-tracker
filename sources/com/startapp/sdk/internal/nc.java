package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes11.dex */
public final class nc implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pc f64959a;

    public nc(pc pcVar) {
        this.f64959a = pcVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            pc pcVar = this.f64959a;
            qc qcVar = pcVar.f65103d;
            if (qcVar == null || qcVar.a(sensorEvent) || !pcVar.a(8)) {
                return;
            }
            int i10 = pcVar.f65105f;
            if ((i10 & 8) != 0) {
                return;
            }
            pcVar.f65105f = i10 | 8;
            g9 g9Var = new g9(h9.f64610e);
            g9Var.f64553d = "MP";
            g9Var.f64554e = String.valueOf(8);
            g9Var.a();
        } catch (OutOfMemoryError unused) {
            pc pcVar2 = this.f64959a;
            pcVar2.getClass();
            try {
                pcVar2.d();
            } catch (Throwable th2) {
                g9.a(th2);
            }
        } catch (Throwable th3) {
            pc pcVar3 = this.f64959a;
            if (pcVar3.a(16)) {
                int i11 = pcVar3.f65105f;
                if ((i11 & 16) != 0) {
                    return;
                }
                pcVar3.f65105f = 16 | i11;
                g9.a(th3);
            }
        }
    }
}
