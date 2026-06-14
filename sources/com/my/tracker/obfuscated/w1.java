package com.my.tracker.obfuscated;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.inmobi.media.core.config.models.CrashConfig;
import com.my.tracker.config.AntiFraudConfig;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class w1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final e0 f61874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AntiFraudConfig f61875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Context f61876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f61877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Runnable f61878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Runnable f61879g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicInteger f61873a = new AtomicInteger();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f61880h = -1;

    w1(e0 e0Var, AntiFraudConfig antiFraudConfig, Context context) {
        this.f61874b = e0Var;
        this.f61875c = antiFraudConfig;
        this.f61876d = context.getApplicationContext();
    }

    static final class a implements SensorEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e0 f61881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SensorManager f61882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AntiFraudConfig f61883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayList f61884d = new ArrayList();

        a(e0 e0Var, SensorManager sensorManager, AntiFraudConfig antiFraudConfig) {
            this.f61881a = e0Var;
            this.f61882b = sensorManager;
            this.f61883c = antiFraudConfig;
        }

        public static a a(e0 e0Var, Context context, AntiFraudConfig antiFraudConfig) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager == null) {
                return null;
            }
            return new a(e0Var, sensorManager, antiFraudConfig);
        }

        public void b() {
            x2.a("SensorEventListenerImpl: stop()");
            ArrayList arrayList = this.f61884d;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                try {
                    this.f61882b.unregisterListener(this, (Sensor) obj);
                } catch (Throwable th2) {
                    x2.a("SensorEventListenerImpl: exception at unregister listener: " + th2);
                }
            }
            this.f61884d.clear();
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            int type = sensorEvent.sensor.getType();
            if (type == 2) {
                e0 e0Var = this.f61881a;
                float[] fArr = sensorEvent.values;
                e0Var.b(fArr[0], fArr[1], fArr[2]);
                x2.a("SensorHandler: magnetometer - " + sensorEvent.values[0] + ", " + sensorEvent.values[1] + ", " + sensorEvent.values[2]);
                return;
            }
            if (type == 8) {
                this.f61881a.c(sensorEvent.values[0]);
                x2.a("SensorHandler: proximity - " + sensorEvent.values[0]);
                return;
            }
            if (type == 4) {
                e0 e0Var2 = this.f61881a;
                float[] fArr2 = sensorEvent.values;
                e0Var2.a(fArr2[0], fArr2[1], fArr2[2]);
                x2.a("SensorHandler: gyroscope - " + sensorEvent.values[0] + ", " + sensorEvent.values[1] + ", " + sensorEvent.values[2]);
                return;
            }
            if (type == 5) {
                this.f61881a.a(sensorEvent.values[0]);
                x2.a("SensorHandler: light - " + sensorEvent.values[0]);
                return;
            }
            if (type != 6) {
                return;
            }
            this.f61881a.b(sensorEvent.values[0]);
            x2.a("SensorHandler: pressure - " + sensorEvent.values[0]);
        }

        public void a() {
            x2.a("SensorEventListenerImpl: start()");
            int[] iArr = {5, 2, 4, 6, 8};
            for (int i10 = 0; i10 < 5; i10++) {
                int i11 = iArr[i10];
                if ((i11 != 5 || this.f61883c.useLightSensor) && ((i11 != 2 || this.f61883c.useMagneticFieldSensor) && ((i11 != 4 || this.f61883c.useGyroscope) && ((i11 != 6 || this.f61883c.usePressureSensor) && (i11 != 8 || this.f61883c.useProximitySensor))))) {
                    try {
                        Sensor defaultSensor = this.f61882b.getDefaultSensor(i11);
                        if (defaultSensor != null) {
                            this.f61882b.registerListener(this, defaultSensor, 1000000);
                            this.f61884d.add(defaultSensor);
                        }
                    } catch (Throwable th2) {
                        x2.a("SensorEventListenerImpl: exception at register listener: " + th2);
                    }
                }
            }
        }
    }

    public static w1 a(e0 e0Var, AntiFraudConfig antiFraudConfig, Context context) {
        return new w1(e0Var, antiFraudConfig, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        m.a(new Runnable() { // from class: com.my.tracker.obfuscated.c7
            @Override // java.lang.Runnable
            public final void run() {
                this.f61392b.a();
            }
        });
    }

    public void c() {
        Runnable runnable = this.f61879g;
        if (runnable == null) {
            x2.a("SensorHandler: can't start, startRunnable is null");
        } else {
            m.a(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j10) {
        if (!this.f61873a.compareAndSet(1, 2)) {
            x2.a("SensorHandler: handler can't start, current state: " + this.f61873a.get());
            return;
        }
        if (this.f61877e == null) {
            x2.a("SensorHandler: handler can't start, sensor event listener is null");
        } else if (v2.a() - j10 > CrashConfig.DEFAULT_EVENT_TTL_SEC) {
            x2.a("SensorHandler: more than 259200 seconds passed since the app was installed");
        } else {
            this.f61877e.a();
            m.f61657a.postDelayed(this.f61878f, 20000L);
        }
    }

    public void a(final long j10) {
        if (j10 <= 0) {
            x2.a("SensorHandler: install timestamp is empty, do nothing");
            return;
        }
        if (!this.f61873a.compareAndSet(0, 1)) {
            x2.a("SensorHandler: handler has already been initialized");
            return;
        }
        a aVarA = a.a(this.f61874b, this.f61876d.getApplicationContext(), this.f61875c);
        this.f61877e = aVarA;
        if (aVarA == null) {
            x2.a("SensorHandler: sensor event listener is null");
            return;
        }
        this.f61878f = new Runnable() { // from class: com.my.tracker.obfuscated.d7
            @Override // java.lang.Runnable
            public final void run() {
                this.f61450b.b();
            }
        };
        this.f61879g = new Runnable() { // from class: com.my.tracker.obfuscated.e7
            @Override // java.lang.Runnable
            public final void run() {
                this.f61472b.b(j10);
            }
        };
        this.f61880h = j10;
        x2.a("SensorHandler: initialized");
        this.f61879g.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        if (!this.f61873a.compareAndSet(2, 1)) {
            x2.a("SensorHandler: handle isn't running");
        } else {
            this.f61877e.b();
            this.f61874b.a();
        }
    }
}
