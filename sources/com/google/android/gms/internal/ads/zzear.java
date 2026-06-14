package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes8.dex */
public final class zzear extends zzfyq {
    private final SensorManager zza;
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzeaq zzi;
    private boolean zzj;

    zzear(Context context) {
        super("FlickDetector", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        this.zzc = 0.0f;
        this.zzd = Float.valueOf(0.0f);
        this.zze = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    public final void zza(zzeaq zzeaqVar) {
        this.zzi = zzeaqVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkz)).booleanValue()) {
                    if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzj = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                    }
                    if (this.zza == null || this.zzb == null) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.zzj = false;
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyq
    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkz)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (this.zze + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkB)).intValue()) < jCurrentTimeMillis) {
                this.zzf = 0;
                this.zze = jCurrentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            Float fValueOf = Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f10 = this.zzc;
            zzbgv zzbgvVar = zzbhe.zzkA;
            if (fFloatValue > f10 + ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.zze = jCurrentTimeMillis;
                int i10 = this.zzf + 1;
                this.zzf = i10;
                this.zzg = false;
                this.zzh = false;
                zzeaq zzeaqVar = this.zzi;
                if (zzeaqVar != null) {
                    if (i10 == ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkC)).intValue()) {
                        zzebf zzebfVar = (zzebf) zzeaqVar;
                        zzebfVar.zzo(new zzebd(zzebfVar), zzebe.GESTURE);
                    }
                }
            }
        }
    }
}
