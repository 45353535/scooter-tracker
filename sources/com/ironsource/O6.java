package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class O6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4634y7 f41506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f41507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f41508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f41509d;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41510a;

        a(Context context) {
            this.f41510a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                O6.this.e(this.f41510a);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            O6.this.f41508c.set(false);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static volatile O6 f41512a = new O6();

        private b() {
        }
    }

    private void d(Context context) {
        if (context == null || this.f41509d.getAndSet(true)) {
            return;
        }
        a("auid", this.f41506a.d(context));
        a("model", this.f41506a.l());
        a(N6.f41422t, this.f41506a.q());
        a("os", this.f41506a.f());
        a(N6.f41410p, this.f41506a.L(context));
        String adQualitySdkVersion = AdQualityBridge.getAdQualitySdkVersion();
        if (!TextUtils.isEmpty(adQualitySdkVersion)) {
            a(N6.C1, adQualitySdkVersion);
        }
        String strI = this.f41506a.i();
        if (strI != null) {
            a(N6.G, strI.replaceAll("[^0-9/.]", ""));
            a(N6.J, strI);
        }
        a(N6.f41365a, String.valueOf(this.f41506a.e()));
        String strU = this.f41506a.u(context);
        if (!TextUtils.isEmpty(strU)) {
            a(N6.Q0, strU);
        }
        String strE = B1.e(context);
        if (!TextUtils.isEmpty(strE)) {
            a(N6.f41407o, strE);
        }
        String strR = this.f41506a.r(context);
        if (!TextUtils.isEmpty(strR)) {
            a("dt", strR);
        }
        a("bid", context.getPackageName());
        a("mem", String.valueOf(this.f41506a.q(context)));
        a(N6.f41369b0, "2.0");
        a(N6.f41372c0, Long.valueOf(B1.f(context)));
        a(N6.f41366a0, Long.valueOf(B1.d(context)));
        a(N6.f41374d, B1.b(context));
        a(N6.O, Integer.valueOf(X3.f(context)));
        a(N6.Y, X3.g(context));
        a("stid", Yc.d(context));
        a("platform", "android");
        a(N6.f41440z, this.f41506a.t());
        a("mThreshold", this.f41506a.a(this.f41506a.n(context)));
        a(N6.f41387h0, KotlinVersion.CURRENT.toString());
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String strI = this.f41506a.I(context);
            if (!TextUtils.isEmpty(strI)) {
                a(N6.V0, strI);
            }
            String strB = this.f41506a.b(context);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            a(N6.f41419s, Boolean.valueOf(Boolean.parseBoolean(strB)));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void f(Context context) {
        if (context == null) {
            return;
        }
        a(context);
        String strY = this.f41506a.y(context);
        if (!TextUtils.isEmpty(strY)) {
            a(N6.L0, strY);
        } else if (a(N6.L0)) {
            b(N6.L0);
        }
        a("idfi", this.f41506a.i(context));
        String strC = this.f41506a.c(context);
        if (!TextUtils.isEmpty(strC)) {
            a(N6.f41413q, strC.toUpperCase(Locale.getDefault()));
        }
        a(N6.f41416r, this.f41506a.A(context));
        String strD = this.f41506a.d();
        if (!TextUtils.isEmpty(strD)) {
            a("tz", strD);
        }
        String strB = Y3.b(context);
        if (!TextUtils.isEmpty(strB) && !strB.equals("none")) {
            a(N6.f41392j, strB);
        }
        String strD2 = Y3.d(context);
        if (!TextUtils.isEmpty(strD2)) {
            a(N6.f41395k, strD2);
        }
        a("vpn", Boolean.valueOf(Y3.e(context)));
        String strG = this.f41506a.G(context);
        if (!TextUtils.isEmpty(strG)) {
            a("icc", strG);
        }
        int iS = this.f41506a.s(context);
        if (iS >= 0) {
            a(N6.f41397k1, Integer.valueOf(iS));
        }
        a(N6.f41400l1, this.f41506a.v(context));
        a(N6.f41403m1, this.f41506a.F(context));
        a(N6.f41390i0, Float.valueOf(this.f41506a.E(context)));
        a(N6.f41401m, String.valueOf(this.f41506a.h()));
        a(N6.R, Integer.valueOf(this.f41506a.k()));
        a(N6.Q, Integer.valueOf(this.f41506a.c()));
        a(N6.Y0, String.valueOf(this.f41506a.a()));
        a(N6.f41388h1, String.valueOf(this.f41506a.m()));
        a("mcc", Integer.valueOf(X3.b(context)));
        a("mnc", Integer.valueOf(X3.c(context)));
        a(N6.T, Boolean.valueOf(this.f41506a.j()));
        a(N6.f41383g, Boolean.valueOf(this.f41506a.C(context)));
        a(N6.f41386h, Integer.valueOf(this.f41506a.D(context)));
        a(N6.f41368b, Boolean.valueOf(this.f41506a.e(context)));
        a(N6.K, Boolean.valueOf(this.f41506a.h(context)));
        a("rt", Boolean.valueOf(this.f41506a.p()));
        a(N6.Z, String.valueOf(this.f41506a.r()));
        a(N6.f41377e, Integer.valueOf(this.f41506a.k(context)));
        a(N6.Z0, Boolean.valueOf(this.f41506a.J(context)));
        a(N6.f41371c, this.f41506a.m(context));
        a(N6.f41375d0, this.f41506a.s());
        C4626y c4626y = new C4626y(Ib.U().s());
        HashMap map = new HashMap();
        c4626y.a(map);
        a(N6.E0, map);
        a(N6.L, ConfigFile.getConfigFile().getPluginType());
        a(N6.M, ConfigFile.getConfigFile().getPluginVersion());
        a(N6.N, ConfigFile.getConfigFile().getPluginFrameworkVersion());
    }

    protected void c(Context context) {
        try {
            d(context);
            f(context);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private O6() {
        this.f41508c = new AtomicBoolean(false);
        this.f41509d = new AtomicBoolean(false);
        this.f41506a = Ib.U().i();
        this.f41507b = new ConcurrentHashMap<>();
    }

    static O6 b() {
        return b.f41512a;
    }

    protected void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                if (map.containsKey(str)) {
                    a(str, map.get(str));
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    protected void b(String str, Object obj) {
        a(str, obj);
    }

    protected void b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.f41507b.remove(str);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    protected JSONObject b(Context context) throws JSONException {
        f(context);
        return new JSONObject(Q6.a(this.f41507b));
    }

    protected void a(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            Object obj = this.f41507b.get(str);
            if (!(obj instanceof JSONArray)) {
                a(str, (Object) jSONArray);
                return;
            }
            JSONArray jSONArray2 = (JSONArray) obj;
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                jSONArray2.put(jSONArray.get(i10));
            }
            a(str, (Object) jSONArray2);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    protected void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.f41507b.get(str);
            if (!(obj instanceof JSONObject)) {
                a(str, (Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            a(str, (Object) jSONObject2);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.f41507b.put(str, obj);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private boolean a(String str) {
        return str != null && this.f41507b.containsKey(str);
    }

    private void a(Context context) {
        if (this.f41508c.get()) {
            return;
        }
        try {
            this.f41508c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            this.f41508c.set(false);
        }
    }

    private void a() {
        String strA = Vf.f41912a.a();
        if (strA != null) {
            HashMap map = new HashMap();
            map.put("sdk", strA);
            HashMap map2 = new HashMap();
            map2.put(N6.H1, map);
            Map<String, Object> map3 = new HashMap<>();
            map3.put(N6.E1, map2);
            a(map3);
        }
    }
}
