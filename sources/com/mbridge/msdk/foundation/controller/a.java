package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.setting.h;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f48254q = com.mbridge.msdk.foundation.controller.c.class.getSimpleName();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static HashMap<String, String> f48255r = new HashMap<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static com.mbridge.msdk.config.component.status.b f48256s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f48258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f48259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f48260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f48261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f48262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f48263g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f48266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f48267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f48268l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference<Context> f48270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private JSONObject f48271o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f48257a = new s();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f48264h = new JSONObject();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f48265i = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f48269m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f48272p = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    class RunnableC0508a implements Runnable {
        RunnableC0508a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.e.a(a.this.f48259c).a();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.d.c();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f48258b = (String) y0.a(aVar.f48259c, "sp_appId", "");
            } catch (Throwable th2) {
                q0.b(a.f48254q, th2.getMessage());
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f48266j = (String) y0.a(aVar.f48259c, "sp_appKey", "");
            } catch (Throwable th2) {
                q0.b(a.f48254q, th2.getMessage());
            }
        }
    }

    public interface e {
    }

    private void m() {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object objA = y0.a(this.f48259c, MBridgeConstans.SP_GA_ID, "");
                Object objA2 = y0.a(this.f48259c, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (objA instanceof String) {
                    String str = (String) objA;
                    if (TextUtils.isEmpty(str)) {
                        g.d();
                    } else {
                        g.a(str);
                    }
                    if (objA2 instanceof Integer) {
                        g.a(((Integer) objA2).intValue());
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(f48254q, e10.getMessage());
        }
    }

    protected abstract void a(e eVar);

    public void b(int i10) {
        this.f48268l = i10;
    }

    public void c(int i10) {
        this.f48272p = i10;
    }

    public Context d() {
        return this.f48259c;
    }

    public s e() {
        return this.f48257a;
    }

    public Context f() {
        WeakReference<Context> weakReference = this.f48270n;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int g() {
        return this.f48263g;
    }

    public String h() {
        return !TextUtils.isEmpty(this.f48267k) ? this.f48267k : "";
    }

    public String i() {
        try {
            if (!TextUtils.isEmpty(this.f48260d)) {
                return this.f48260d;
            }
            Context context = this.f48259c;
            if (context == null) {
                return null;
            }
            String packageName = context.getPackageName();
            this.f48260d = packageName;
            return packageName;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String j() {
        if (!TextUtils.isEmpty(this.f48267k)) {
            return this.f48267k;
        }
        Context context = this.f48259c;
        if (context != null) {
            return (String) y0.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public JSONObject k() {
        return this.f48271o;
    }

    public int l() {
        return this.f48272p;
    }

    public WeakReference<Activity> a() {
        return this.f48261e;
    }

    public void b(e eVar) {
        try {
            m0.C(this.f48259c);
            a(eVar);
            h.a(this.f48259c, this.f48258b);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                try {
                    try {
                        m0.d(this.f48259c.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled ? 1 : 2);
                    } catch (PackageManager.NameNotFoundException unused) {
                        m0.d(0);
                    }
                } catch (Throwable th2) {
                    q0.b(f48254q, th2.getMessage());
                }
            }
            try {
                com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = h.b().a();
                }
                s sVarE = com.mbridge.msdk.foundation.controller.c.n().e();
                if (sVarE != null && sVarE.b() && gVarD != null && gVarD.E() == 1) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0508a());
                }
                if (sVarE == null || !sVarE.a()) {
                    return;
                }
                com.mbridge.msdk.foundation.same.threadpool.a.c().post(new b());
            } catch (Throwable th3) {
                q0.b(f48254q, th3.getMessage());
            }
        } catch (Exception e10) {
            q0.b(f48254q, e10.getMessage());
        }
    }

    public void c(e eVar) {
        if (this.f48265i) {
            return;
        }
        m();
        try {
            JSONObject jSONObject = new JSONObject();
            this.f48271o = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e10) {
            q0.b(f48254q, e10.getMessage());
        }
        b(eVar);
    }

    public void d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f48267k = str;
            Context context = this.f48259c;
            if (context != null) {
                y0.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void e(String str) {
        Context context;
        try {
            this.f48258b = str;
            if (TextUtils.isEmpty(str) || (context = this.f48259c) == null) {
                return;
            }
            y0.b(context, "sp_appId", str);
        } catch (Exception e10) {
            q0.b(f48254q, e10.getMessage());
        }
    }

    public void f(String str) {
        Context context;
        try {
            this.f48266j = str;
            if (TextUtils.isEmpty(str) || (context = this.f48259c) == null) {
                return;
            }
            y0.b(context, "sp_appKey", str);
        } catch (Exception e10) {
            q0.b(f48254q, e10.getMessage());
        }
    }

    public void a(WeakReference<Activity> weakReference) {
        this.f48261e = weakReference;
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f48270n = new WeakReference<>(context);
        }
    }

    public void a(int i10) {
        this.f48263g = i10;
    }

    public BitmapDrawable a(String str, int i10) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        int i11;
        String str2;
        int i12;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f48269m) == null || !concurrentHashMap.containsKey(str) || !s0.a().a("w_m_r_l", true)) {
            return null;
        }
        String str3 = this.f48269m.get(str);
        BitmapDrawable bitmapDrawableN = v0.n(str3);
        int i13 = TextUtils.isEmpty(str3) ? 2 : 1;
        String str4 = TextUtils.isEmpty(str3) ? "get watermark failed" : bitmapDrawableN != null ? "" : "str to bitmap failed";
        if (bitmapDrawableN == null) {
            i11 = 2;
            i12 = i10;
            str2 = str;
        } else {
            i11 = 1;
            str2 = str;
            i12 = i10;
        }
        j.a(str2, i12, i13, str4, i11, str3);
        return bitmapDrawableN;
    }

    public String c() {
        try {
            if (!TextUtils.isEmpty(this.f48266j)) {
                return this.f48266j;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new d());
            return "";
        } catch (Throwable th2) {
            q0.b(f48254q, th2.getMessage());
            return "";
        }
    }

    public void a(JSONObject jSONObject) {
        this.f48271o = jSONObject;
    }

    public void a(String str) {
        try {
            if (this.f48269m != null && !TextUtils.isEmpty(str) && this.f48269m.containsKey(str)) {
                this.f48269m.remove(str);
            }
        } catch (Exception e10) {
            q0.b(f48254q, e10.getMessage());
        }
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f48260d = str;
    }

    public void a(String str, JSONObject jSONObject) {
        if (s0.a().a("w_m_r_l", true)) {
            try {
                if (this.f48264h == null) {
                    this.f48264h = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        this.f48264h.put(next, jSONObject.get(next));
                    }
                }
                if (this.f48264h.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.f48269m == null) {
                        this.f48269m = new ConcurrentHashMap<>();
                    }
                    this.f48269m.put(str, this.f48264h.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e10) {
                q0.b(f48254q, e10.getMessage());
            }
        }
    }

    public String b() {
        try {
            if (!TextUtils.isEmpty(this.f48258b)) {
                return this.f48258b;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            return "";
        } catch (Exception e10) {
            q0.b(f48254q, e10.getMessage());
            return "";
        }
    }

    public void b(String str) {
        Context context;
        try {
            this.f48262f = str;
            if (TextUtils.isEmpty(str) || (context = this.f48259c) == null) {
                return;
            }
            y0.b(context, "applicationIds", str);
        } catch (Exception e10) {
            q0.b(f48254q, e10.getMessage());
        }
    }

    public void b(Context context) {
        this.f48259c = context;
    }
}
