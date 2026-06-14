package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public class ak implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f62063a = {999999.0f, 999999.0f, 999999.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f62064b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ak f62065c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f62071i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Sensor f62066d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Sensor f62067e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Sensor f62068f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f62069g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f62070h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicReference<a> f62072j = new AtomicReference<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f62073k = 999999;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f62074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f62075b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f62076c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f62077d = null;

        public a(long j10) {
            this.f62074a = j10;
        }
    }

    private ak(Context context) {
        this.f62071i = context;
    }

    public static ak a(Context context) {
        if (f62065c == null) {
            synchronized (ak.class) {
                try {
                    if (f62065c == null) {
                        f62065c = new ak(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (f62064b) {
            f62065c.c();
        }
        return f62065c;
    }

    private void c() {
        if (this.f62070h) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.f62071i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                this.f62066d = sensorManager.getDefaultSensor(1);
                this.f62067e = sensorManager.getDefaultSensor(2);
                this.f62068f = sensorManager.getDefaultSensor(4);
            }
        } catch (Exception unused) {
        }
        this.f62070h = true;
    }

    private void e() {
        this.f62073k = -1L;
        this.f62069g = false;
        try {
            SensorManager sensorManager = (SensorManager) this.f62071i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
    }

    public Object[] b() {
        Object[] objArr = new Object[6];
        a aVar = this.f62072j.get();
        if (!f62064b || aVar == null) {
            a(objArr);
            return objArr;
        }
        int i10 = 0;
        do {
            if ((this.f62066d == null || aVar.f62075b != null) && ((this.f62067e == null || aVar.f62076c != null) && (this.f62068f == null || aVar.f62077d != null))) {
                break;
            }
            az.a(50L);
            i10++;
        } while (i10 <= 20);
        e();
        this.f62069g = false;
        a(objArr, aVar);
        this.f62072j.set(null);
        return objArr;
    }

    public boolean d() {
        if (this.f62066d != null) {
            try {
                SensorManager sensorManager = (SensorManager) this.f62071i.getApplicationContext().getSystemService("sensor");
                if (sensorManager != null) {
                    boolean zRegisterListener = sensorManager.registerListener(this, this.f62066d, 2);
                    Sensor sensor = this.f62067e;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 2);
                    }
                    Sensor sensor2 = this.f62068f;
                    if (sensor2 != null) {
                        sensorManager.registerListener(this, sensor2, 2);
                    }
                    if (zRegisterListener) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f62073k = jCurrentTimeMillis;
                        this.f62072j.set(new a(jCurrentTimeMillis));
                        this.f62069g = true;
                    } else {
                        e();
                    }
                }
            } catch (Throwable unused) {
                e();
            }
        }
        return this.f62069g;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar = this.f62072j.get();
        if (aVar == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (aVar.f62075b == null) {
                aVar.f62075b = sensorEvent.values;
            }
        } else if (type == 2) {
            if (aVar.f62076c == null) {
                aVar.f62076c = sensorEvent.values;
            }
        } else if (type == 4 && aVar.f62077d == null) {
            aVar.f62077d = sensorEvent.values;
        }
    }

    private static void a(Object[] objArr) {
        Float fValueOf = Float.valueOf(999999.0f);
        objArr[0] = fValueOf;
        objArr[1] = fValueOf;
        objArr[2] = fValueOf;
        objArr[3] = 999999L;
        float[] fArr = f62063a;
        objArr[4] = fArr;
        objArr[5] = fArr;
    }

    private static void a(Object[] objArr, a aVar) {
        float[] fArrA;
        float[] fArr = aVar.f62075b;
        if (fArr != null) {
            float[] fArr2 = aVar.f62076c;
            if (fArr2 != null) {
                fArrA = a(objArr, fArr, fArr2);
            } else {
                fArrA = a(objArr, fArr);
            }
            objArr[0] = Float.valueOf(fArrA[0]);
            objArr[1] = Float.valueOf(fArrA[1]);
            objArr[2] = Float.valueOf(fArrA[2]);
            objArr[4] = aVar.f62075b;
        } else {
            objArr[0] = Float.valueOf(999999.0f);
            objArr[1] = Float.valueOf(999999.0f);
            objArr[2] = Float.valueOf(999999.0f);
            objArr[4] = f62063a;
        }
        objArr[3] = Long.valueOf(aVar.f62074a);
        float[] fArr3 = aVar.f62077d;
        if (fArr3 != null) {
            objArr[5] = fArr3;
        } else {
            objArr[5] = f62063a;
        }
    }

    private static float[] a(Object[] objArr, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        SensorManager.getRotationMatrix(fArr3, new float[9], fArr, fArr2);
        SensorManager.getOrientation(fArr3, new float[3]);
        return new float[]{(((float) Math.toDegrees(r2[0])) + 360.0f) % 360.0f, (((float) Math.toDegrees(r2[1])) + 360.0f) % 360.0f, (((float) Math.toDegrees(r2[2])) + 360.0f) % 360.0f};
    }

    private static float[] a(Object[] objArr, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fSqrt = 1.0f / ((float) Math.sqrt(((f10 * f10) + (f11 * f11)) + (f12 * f12)));
        return new float[]{999999.0f, (((float) Math.toDegrees((float) Math.asin(-(f11 * fSqrt)))) + 360.0f) % 360.0f, (((float) Math.toDegrees((float) Math.atan2(-(f10 * fSqrt), f12 * fSqrt))) + 360.0f) % 360.0f};
    }

    public void a() {
        if (!f62064b || this.f62069g) {
            return;
        }
        d();
    }
}
