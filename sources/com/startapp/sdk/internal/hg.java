package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import com.startapp.sdk.adsbase.remoteconfig.BaseSensorConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f64640a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SensorManager f64642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x1 f64643d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fg f64645f = new fg(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eg f64641b = new eg();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64644e = 0;

    public hg(Context context, x1 x1Var) {
        this.f64640a = null;
        this.f64642c = (SensorManager) context.getSystemService("sensor");
        this.f64643d = x1Var;
        this.f64640a = new HashMap();
        SensorsConfig sensorsConfigT = MetaData.E().T();
        a(13, sensorsConfigT.a());
        a(9, sensorsConfigT.b());
        a(5, sensorsConfigT.d());
        a(10, sensorsConfigT.e());
        a(2, sensorsConfigT.f());
        a(6, sensorsConfigT.g());
        a(12, sensorsConfigT.i());
        a(11, sensorsConfigT.j());
        a(16, sensorsConfigT.c());
    }

    public final void a() {
        Sensor defaultSensor;
        for (Integer num : this.f64640a.keySet()) {
            int iIntValue = num.intValue();
            gg ggVar = (gg) this.f64640a.get(num);
            if (Build.VERSION.SDK_INT >= ggVar.f64575a && (defaultSensor = this.f64642c.getDefaultSensor(iIntValue)) != null) {
                this.f64642c.registerListener(this.f64645f, defaultSensor, ggVar.f64576b);
                this.f64644e++;
            }
        }
    }

    public final void b() {
        this.f64642c.unregisterListener(this.f64645f);
    }

    public final void a(int i10, BaseSensorConfig baseSensorConfig) {
        if (baseSensorConfig.c()) {
            this.f64640a.put(Integer.valueOf(i10), new gg(baseSensorConfig.b(), baseSensorConfig.a()));
        }
    }
}
