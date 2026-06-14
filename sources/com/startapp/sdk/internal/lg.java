package com.startapp.sdk.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Display;
import com.google.firebase.remoteconfig.internal.Personalization;
import com.ironsource.C4240b4;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.sensors.SensorsData;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class lg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f64874b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f64876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d2 f64877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SensorManager f64878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lb f64879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f64880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Pair f64881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lb f64882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s4 f64883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f64884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f64885m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64873a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f64875c = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ig f64886n = new ig(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final kg f64887o = new kg(this);

    public lg(lb lbVar, lb lbVar2, s4 s4Var, Context context) {
        this.f64882j = lbVar;
        this.f64883k = s4Var;
        this.f64879g = lbVar2;
        this.f64880h = context;
        this.f64881i = new Pair(Integer.valueOf(((vf) lbVar2.a()).getInt("last_collected_day", 0)), Integer.valueOf(((vf) lbVar2.a()).getInt("daily_collected", 0)));
        SensorsData sensorsDataU = MetaData.E().U();
        if (sensorsDataU == null) {
            return;
        }
        this.f64876d = (long) (((double) (1000 / sensorsDataU.d())) * 0.95d);
        this.f64885m = sensorsDataU.e();
    }

    public static boolean a(lg lgVar, SensorEvent sensorEvent) {
        lgVar.getClass();
        int type = sensorEvent.sensor.getType();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l10 = (Long) lgVar.f64875c.get(Integer.valueOf(type));
        if (jCurrentTimeMillis - (l10 == null ? 0L : l10.longValue()) < lgVar.f64876d) {
            return true;
        }
        lgVar.f64875c.put(Integer.valueOf(type), Long.valueOf(jCurrentTimeMillis));
        return false;
    }

    public final void a(Context context, SensorsData sensorsData) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f64878f = sensorManager;
        if (sensorManager == null) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            context.registerReceiver(this.f64887o, intentFilter);
        } catch (Throwable th2) {
            if (a(8)) {
                g9.a(th2);
            }
        }
        SensorManager sensorManager2 = this.f64878f;
        if (sensorManager2 != null) {
            sensorManager2.unregisterListener(this.f64886n);
        }
        int iD = 1000000 / sensorsData.d();
        Sensor defaultSensor = this.f64878f.getDefaultSensor(1);
        Sensor defaultSensor2 = this.f64878f.getDefaultSensor(4);
        Sensor defaultSensor3 = this.f64878f.getDefaultSensor(2);
        this.f64878f.registerListener(this.f64886n, defaultSensor, iD);
        this.f64878f.registerListener(this.f64886n, defaultSensor2, iD);
        this.f64878f.registerListener(this.f64886n, defaultSensor3, iD);
    }

    public static void a(lg lgVar, SensorEvent sensorEvent, SensorsData sensorsData) {
        Object obj;
        lgVar.f64874b = ((vf) lgVar.f64879g.a()).getInt("total_collected", 0);
        d2 d2Var = lgVar.f64877e;
        if (d2Var == null || d2Var.f64404g.size() >= d2Var.f64405h) {
            lgVar.f64877e = new d2(((com.startapp.sdk.common.advertisingid.b) lgVar.f64882j.a()).a().f64842a, lgVar.f64880h.getPackageName(), System.currentTimeMillis() + "", UUID.randomUUID().toString(), lgVar.f64884l, lgVar.a(), sensorsData.c());
            lgVar.f64873a = 0;
        }
        int i10 = lgVar.f64873a;
        lgVar.f64873a = i10 + 1;
        wf wfVar = new wf(i10, sensorEvent.sensor.getType(), System.currentTimeMillis(), Arrays.copyOf(sensorEvent.values, 3));
        d2 d2Var2 = lgVar.f64877e;
        d2Var2.f64404g.add(wfVar);
        if (d2Var2.f64404g.size() >= d2Var2.f64405h) {
            int i11 = Calendar.getInstance().get(6);
            if (((Integer) lgVar.f64881i.first).intValue() == i11) {
                Pair pair = lgVar.f64881i;
                lgVar.f64881i = new Pair((Integer) pair.first, Integer.valueOf(((Integer) pair.second).intValue() + 1));
            } else {
                lgVar.f64881i = new Pair(Integer.valueOf(i11), 1);
            }
            d2 d2Var3 = lgVar.f64877e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("advertisingId", d2Var3.f64398a);
                jSONObject.put("bId", d2Var3.f64401d);
                jSONObject.put("batchTimestamp", d2Var3.f64400c);
                jSONObject.put(Personalization.ANALYTICS_ORIGIN_PERSONALIZATION, d2Var3.f64399b);
                jSONObject.put(C4240b4.j.f42687k0, d2Var3.f64402e);
                jSONObject.put("isScreenOn", d2Var3.f64403f);
                JSONArray jSONArray = new JSONArray();
                for (wf wfVar2 : d2Var3.f64404g) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sId", wfVar2.f65474a);
                    jSONObject2.put("n", wfVar2.f65475b);
                    jSONObject2.put("ts", wfVar2.f65476c);
                    JSONArray jSONArray2 = new JSONArray();
                    int length = wfVar2.f65477d.length;
                    for (int i12 = 0; i12 < length; i12++) {
                        jSONArray2.put(r5[i12]);
                    }
                    jSONObject2.put("v", jSONArray2);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("valueList", jSONArray);
                obj = jSONObject;
            } catch (Throwable th2) {
                if (lgVar.a(16)) {
                    g9.a(th2);
                }
                obj = null;
            }
            if (sensorsData.g()) {
                g9 g9Var = new g9(h9.f64621p);
                g9Var.f64554e = String.valueOf(obj);
                g9Var.a();
            } else {
                g9 g9Var2 = new g9(h9.f64621p);
                g9Var2.f64555f = obj;
                g9Var2.a();
            }
            uf ufVarEdit = ((vf) lgVar.f64879g.a()).edit();
            int i13 = lgVar.f64874b + 1;
            lgVar.f64874b = i13;
            ufVarEdit.putInt("total_collected", i13);
            ufVarEdit.putLong("sensor_last_collected_time", System.currentTimeMillis());
            Integer num = (Integer) lgVar.f64881i.first;
            int iIntValue = num.intValue();
            ufVarEdit.a("last_collected_day", num);
            ufVarEdit.f65346a.putInt("last_collected_day", iIntValue);
            Integer num2 = (Integer) lgVar.f64881i.second;
            int iIntValue2 = num2.intValue();
            ufVarEdit.a("daily_collected", num2);
            ufVarEdit.f65346a.putInt("daily_collected", iIntValue2);
            ufVarEdit.apply();
            lgVar.a(lgVar.f64874b == sensorsData.e());
        }
    }

    public final boolean a() {
        for (Display display : ((DisplayManager) this.f64880h.getSystemService("display")).getDisplays()) {
            if (display.getState() == 2) {
                return true;
            }
        }
        return false;
    }

    public final void a(boolean z10) {
        try {
            SensorManager sensorManager = this.f64878f;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f64886n);
            }
            this.f64883k.getClass();
            SensorsData sensorsDataU = MetaData.E().U();
            this.f64877e = null;
            if (!z10 && sensorsDataU != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new jg(this), ((long) sensorsDataU.a()) * 1000);
            }
            this.f64880h.unregisterReceiver(this.f64887o);
        } catch (Throwable th2) {
            if (a(32)) {
                g9.a(th2);
            }
        }
    }

    public final void a(Context context) {
        int iA;
        try {
            this.f64883k.getClass();
            SensorsData sensorsDataU = MetaData.E().U();
            String str = ((com.startapp.sdk.common.advertisingid.b) this.f64882j.a()).a().f64842a;
            if (sensorsDataU != null) {
                this.f64883k.getClass();
                SensorsData sensorsDataU2 = MetaData.E().U();
                if (sensorsDataU2 != null && ((vf) this.f64879g.a()).getInt("total_collected", 0) != sensorsDataU2.e() && !str.equals("0") && !str.equals("00000000-0000-0000-0000-000000000000")) {
                    long j10 = ((vf) this.f64879g.a()).getLong("sensor_last_collected_time", 0L);
                    if ((((Integer) this.f64881i.first).intValue() != Calendar.getInstance().get(6) || ((Integer) this.f64881i.second).intValue() != sensorsDataU.f()) && (System.currentTimeMillis() - j10) / 1000 >= sensorsDataU.a()) {
                        a(context, sensorsDataU);
                        return;
                    }
                    if (((Integer) this.f64881i.first).intValue() == Calendar.getInstance().get(6) && ((Integer) this.f64881i.second).intValue() == sensorsDataU.f()) {
                        iA = (24 - Calendar.getInstance().get(11)) * 3600;
                    } else {
                        iA = sensorsDataU.a();
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new jg(this), ((long) iA) * 1000);
                }
            }
        } catch (Throwable th2) {
            if (a(4)) {
                g9.a(th2);
            }
        }
    }

    public final boolean a(int i10) {
        this.f64883k.getClass();
        SensorsData sensorsDataU = MetaData.E().U();
        ComponentInfoEventConfig componentInfoEventConfigB = sensorsDataU != null ? sensorsDataU.b() : null;
        return componentInfoEventConfigB != null && componentInfoEventConfigB.a((long) i10);
    }
}
