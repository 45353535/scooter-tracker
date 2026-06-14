package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import com.startapp.motiondetector.AmortizedMaximum;
import com.startapp.motiondetector.Utils;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class pc {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f65099i = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vf f65101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f65102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qc f65103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f65104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f65105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Sensor f65106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nc f65107h = new nc(this);

    public pc(Context context, vf vfVar, q4 q4Var, Handler handler) {
        this.f65100a = context;
        this.f65101b = vfVar;
        this.f65102c = handler;
    }

    public final boolean a(int i10) {
        if (this.f65104e) {
            MotionMetadata motionMetadataJ = MetaData.E().J();
            if (motionMetadataJ == null || !motionMetadataJ.u()) {
                motionMetadataJ = null;
            }
            if (motionMetadataJ != null && (i10 & motionMetadataJ.j()) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (this.f65103d != null) {
            uf ufVarEdit = this.f65101b.edit();
            float fLongBitsToDouble = (float) Double.longBitsToDouble(this.f65103d.f65156d.get());
            ufVarEdit.a("e9142de3c7cc5952", Float.valueOf(fLongBitsToDouble));
            ufVarEdit.f65346a.putFloat("e9142de3c7cc5952", fLongBitsToDouble);
            long j10 = this.f65103d.f65157e.get();
            ufVarEdit.a("7783513af1730383", Long.valueOf(j10));
            ufVarEdit.f65346a.putLong("7783513af1730383", j10);
            ufVarEdit.apply();
            if (a(4)) {
                g9 g9Var = new g9(h9.f64609d);
                g9Var.f64553d = "MP.save";
                g9Var.f64554e = String.format(Locale.ENGLISH, "%.6f", Double.valueOf(a()));
                g9Var.a();
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        MotionMetadata motionMetadataJ = MetaData.E().J();
        MotionMetadata motionMetadata = (motionMetadataJ == null || !motionMetadataJ.u()) ? null : motionMetadataJ;
        if (motionMetadata == null || (sensorManager = (SensorManager) this.f65100a.getSystemService("sensor")) == null || this.f65106g != null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        int iMin = Math.min(Math.max(10000, (int) (vi.e(motionMetadata.r()) * 1000)), 100000);
        if (defaultSensor == null || !sensorManager.registerListener(this.f65107h, defaultSensor, iMin)) {
            return;
        }
        this.f65106g = defaultSensor;
        double d10 = this.f65101b.getFloat("e9142de3c7cc5952", 0.0f);
        long j10 = this.f65101b.getLong("7783513af1730383", 0L);
        qc qcVar = this.f65103d;
        if (qcVar != null) {
            qcVar.interrupt();
            this.f65103d = null;
        }
        if (this.f65103d == null) {
            qc qcVar2 = new qc("startapp-mp-" + f65099i.incrementAndGet(), motionMetadata, motionMetadata.q(), d10, j10);
            this.f65103d = qcVar2;
            qcVar2.start();
        }
        if (a(1)) {
            g9 g9Var = new g9(h9.f64609d);
            g9Var.f64553d = "MP.start";
            g9Var.f64554e = defaultSensor.getName() + StringUtils.COMMA + defaultSensor.getMinDelay() + StringUtils.COMMA + defaultSensor.getPower();
            g9Var.a();
        }
    }

    public final void d() {
        Sensor sensor;
        SensorManager sensorManager = (SensorManager) this.f65100a.getSystemService("sensor");
        if (sensorManager == null || (sensor = this.f65106g) == null) {
            return;
        }
        sensorManager.unregisterListener(this.f65107h, sensor);
        this.f65106g = null;
        b();
        qc qcVar = this.f65103d;
        if (qcVar != null) {
            qcVar.interrupt();
            this.f65103d = null;
        }
        if (a(2)) {
            g9 g9Var = new g9(h9.f64609d);
            g9Var.f64553d = "MP.stop";
            g9Var.a();
        }
    }

    public final double a() {
        MotionMetadata motionMetadataJ = MetaData.E().J();
        if (motionMetadataJ == null || !motionMetadataJ.u()) {
            motionMetadataJ = null;
        }
        if (motionMetadataJ == null) {
            return -1.0d;
        }
        qc qcVar = this.f65103d;
        if (qcVar != null) {
            return Double.longBitsToDouble(qcVar.f65155c.get());
        }
        return ((double) this.f65101b.getFloat("e9142de3c7cc5952", 0.0f)) * AmortizedMaximum.calcImpact(System.currentTimeMillis(), this.f65101b.getLong("7783513af1730383", 0L), motionMetadataJ.b(), motionMetadataJ.a(), motionMetadataJ.c(), Utils.logisticalFunction(0.0d, motionMetadataJ.a(), motionMetadataJ.c()));
    }
}
