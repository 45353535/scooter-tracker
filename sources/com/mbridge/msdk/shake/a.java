package com.mbridge.msdk.shake;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SensorManager f50638a;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static a f50639a = new a();
    }

    public static a a() {
        return b.f50639a;
    }

    public void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f50638a;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private a() {
    }

    public void a(SensorEventListener sensorEventListener) {
        a(sensorEventListener, null, 2);
    }

    public void a(SensorEventListener sensorEventListener, Sensor sensor, int i10) {
        Context contextD = c.n().d();
        if (contextD != null) {
            try {
                if (this.f50638a == null) {
                    this.f50638a = (SensorManager) contextD.getSystemService("sensor");
                }
                if (sensor == null) {
                    sensor = this.f50638a.getDefaultSensor(1);
                }
                this.f50638a.registerListener(sensorEventListener, sensor, i10);
            } catch (Exception e10) {
                e10.printStackTrace();
                a(contextD, e10.getMessage());
            }
        }
    }

    private static void a(Context context, String str) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C4240b4.i.W, "2000106");
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                    jSONObject.put("b", com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f48595g)) {
                    jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f48595g);
                }
                jSONObject.put("reason", str);
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b("NativeShakeManager", th2.getMessage());
            }
        }
    }
}
