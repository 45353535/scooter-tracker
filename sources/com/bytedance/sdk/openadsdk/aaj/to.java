package com.bytedance.sdk.openadsdk.aaj;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class to {
    public static WeakReference<qdl> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected static final float[] f16801ud = new float[3];
    protected static final float[] lnr = new float[3];
    protected static final float[] mml = new float[9];
    protected static final float[] mzz = new float[3];

    public static void lnr(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<qdl> weakReference = qdl;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            wd.qdl("SensorHub", "startListenLinearAcceleration error", th2);
        }
    }

    public static void mml(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<qdl> weakReference = qdl;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            wd.qdl("SensorHub", "startListenRotationVector err", th2);
        }
    }

    public static void qdl(Context context, SensorEventListener sensorEventListener) {
    }

    public static void ud(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<qdl> weakReference = qdl;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            wd.qdl("SensorHub", "startListenGyroscope error", th2);
        }
    }

    public static void qdl(qdl qdlVar) {
        qdl = new WeakReference<>(qdlVar);
    }

    public static void qdl(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<qdl> weakReference = qdl;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            wd.qdl("SensorHub", "startListenAccelerometer error", th2);
        }
    }

    public static void qdl(Context context, long j10) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j10);
    }
}
