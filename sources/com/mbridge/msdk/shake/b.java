package com.mbridge.msdk.shake;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f50640a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f50641b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f50642c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f50643d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50645f;

    public b(int i10, int i11) {
        this.f50644e = i10;
        this.f50645f = i11;
    }

    public abstract void a();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSensorChanged(android.hardware.SensorEvent r9) {
        /*
            r8 = this;
            float[] r9 = r9.values
            r0 = 0
            r0 = r9[r0]
            float r0 = -r0
            r1 = 1
            r1 = r9[r1]
            float r1 = -r1
            r2 = 2
            r9 = r9[r2]
            float r9 = -r9
            float r2 = r8.f50641b
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L22
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r8.f50644e
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L22:
            float r2 = r8.f50642c
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L35
            float r2 = r1 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r8.f50644e
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L35:
            float r2 = r8.f50643d
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L5c
            float r2 = r9 - r2
            float r2 = java.lang.Math.abs(r2)
            int r3 = r8.f50644e
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5c
        L48:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r8.f50640a
            long r4 = r2 - r4
            int r6 = r8.f50645f
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L5c
            r8.f50640a = r2
            r8.a()
        L5c:
            r8.f50641b = r0
            r8.f50642c = r1
            r8.f50643d = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.shake.b.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
