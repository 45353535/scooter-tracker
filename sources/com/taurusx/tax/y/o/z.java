package com.taurusx.tax.y.o;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.s.s;
import com.taurusx.tax.y.s.a;
import com.taurusx.tax.y.z.z;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f67630e = "DataFlyer";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67632c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w f67633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f67634g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.taurusx.tax.y.z.z f67635i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.taurusx.tax.y.w.y f67636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f67637m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f67639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.taurusx.tax.y.y.z f67640p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f67641s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f67642t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.taurusx.tax.y.w.w f67643v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f67644w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f67645y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Context f67646z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67631a = 10000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f67638n = 10;

    public z(Context context) {
        a.w().z(context);
        p();
    }

    private void p() {
        if (a.w().y(com.taurusx.tax.y.w.z.f67704w) == 0) {
            a.w().w(com.taurusx.tax.y.w.z.f67704w, System.currentTimeMillis());
        }
    }

    public void a(String str) {
        this.f67641s = str;
    }

    public void c(String str) {
        this.f67634g = str;
    }

    public String f() {
        return this.f67639o;
    }

    public int g() {
        return this.f67632c;
    }

    public boolean m() {
        return this.f67637m;
    }

    public void n(String str) {
        this.f67639o = str;
    }

    public void o(String str) {
        this.f67642t = str;
    }

    public void s(String str) {
        this.f67645y = str;
    }

    public y t() {
        return this.f67640p;
    }

    public void w(int i10) {
        this.f67638n = i10;
    }

    public String y() {
        return this.f67645y;
    }

    public void z(int i10) {
        this.f67631a = i10;
    }

    public String a() {
        return this.f67641s;
    }

    public Context c() {
        return this.f67646z;
    }

    public int n() {
        return this.f67638n;
    }

    public w o() {
        return this.f67633f;
    }

    public int s() {
        return this.f67631a;
    }

    public String w() {
        return this.f67642t;
    }

    public void y(int i10) {
        this.f67632c = i10;
    }

    public String z() {
        return this.f67634g;
    }

    public synchronized void w(Context context) {
        if (this.f67644w) {
            return;
        }
        if (context == null) {
            Log.e("DataFlyer", "Can't start with null context");
            return;
        }
        Log.d("DataFlyer", "Start");
        this.f67646z = context.getApplicationContext();
        com.taurusx.tax.y.y.w wVar = new com.taurusx.tax.y.y.w();
        this.f67640p = wVar;
        wVar.o(this.f67646z);
        com.taurusx.tax.y.z.z zVar = new com.taurusx.tax.y.z.z();
        this.f67635i = zVar;
        zVar.z(this.f67646z);
        com.taurusx.tax.y.w.w wVar2 = new com.taurusx.tax.y.w.w(this, this.f67635i);
        this.f67643v = wVar2;
        wVar2.y(this.f67646z);
        com.taurusx.tax.y.w.y yVar = new com.taurusx.tax.y.w.y(this, this.f67635i);
        this.f67636l = yVar;
        yVar.w(this.f67646z);
        this.f67644w = true;
    }

    public void y(String str) {
        if (this.f67643v == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            z(jSONObject);
            str = jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        this.f67643v.y(str);
    }

    public void z(w wVar) {
        this.f67633f = wVar;
    }

    public void z(boolean z10) {
        this.f67637m = z10;
    }

    public JSONObject z(Context context) {
        com.taurusx.tax.y.w.w wVar = this.f67643v;
        if (wVar == null || context == null) {
            return null;
        }
        return wVar.w(context);
    }

    public void z(Map<String, Object> map) {
        if (this.f67643v == null || map == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            try {
                jSONObject.put(str, map.get(str));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        z(jSONObject);
        this.f67643v.y(jSONObject.toString());
    }

    public static void z(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!jSONObject.has("ts")) {
                    jSONObject.put("ts", jCurrentTimeMillis);
                }
                if (jSONObject.has("us")) {
                    return;
                }
                jSONObject.put("us", jCurrentTimeMillis * 1000);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    public void w(JSONObject jSONObject) {
        if (jSONObject != null) {
            LogUtil.d("DataFlyer", "cache event: " + jSONObject.optString(s.I, "0"));
            if (this.f67643v != null) {
                z(jSONObject);
                this.f67643v.z(jSONObject.toString(), jSONObject.optString(s.I, "").equals(s.f67513s));
            }
        }
    }

    public void z(String str, String str2) {
        com.taurusx.tax.y.z.z zVar = this.f67635i;
        if (zVar != null) {
            zVar.z(str, str2);
        }
    }

    public void w(String str) {
        com.taurusx.tax.y.z.z zVar = this.f67635i;
        if (zVar != null) {
            zVar.c(str);
        }
    }

    public List<z.c> z(String str) {
        com.taurusx.tax.y.z.z zVar = this.f67635i;
        if (zVar != null) {
            List<z.c> listZ = zVar.z(str);
            w(String.valueOf(System.currentTimeMillis() - SignalManager.TWENTY_FOUR_HOURS_MILLIS));
            return listZ;
        }
        return new ArrayList();
    }

    public void z(String str, String str2, String str3) {
        com.taurusx.tax.y.z.z zVar = this.f67635i;
        if (zVar != null) {
            zVar.z(str, str2, str3);
        }
    }
}
