package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.pgl.ssdk.a5;
import com.pgl.ssdk.aa;
import com.pgl.ssdk.ab;
import com.pgl.ssdk.ac;
import com.pgl.ssdk.ad;
import com.pgl.ssdk.ae;
import com.pgl.ssdk.af;
import com.pgl.ssdk.ag;
import com.pgl.ssdk.ah;
import com.pgl.ssdk.aj;
import com.pgl.ssdk.ak;
import com.pgl.ssdk.al;
import com.pgl.ssdk.an;
import com.pgl.ssdk.ao;
import com.pgl.ssdk.ar;
import com.pgl.ssdk.aw;
import com.pgl.ssdk.ax;
import com.pgl.ssdk.ay;
import com.pgl.ssdk.az;
import com.pgl.ssdk.f;
import com.pgl.ssdk.u;
import com.pgl.ssdk.v;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f62116a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f62117b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, Object> f62118c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f62119d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static aw.a f62120e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f62122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f62123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f62124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f62125j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f62129n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f62121f = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f62126k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f62127l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f62128m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f62130o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f62131p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f62132q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f62133r = true;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.c();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    class RunnableC0786b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62135a;

        RunnableC0786b(String str) {
            this.f62135a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!TextUtils.isEmpty(this.f62135a) && this.f62135a.equals("AdShow")) {
                ab.b(b.this.f62122g);
            }
            al.a(b.this.f62122g).a();
            aa.b(b.this.f62122g);
        }
    }

    private b(Context context, String str) {
        this.f62122g = context;
        this.f62123h = str;
    }

    public static b a(Context context, String str, int i10, int i11, String str2) {
        if (f62116a == null) {
            synchronized (b.class) {
                try {
                    if (f62116a == null) {
                        if (context == null) {
                            context = ab.a().getApplicationContext();
                        }
                        if (context == null) {
                            f62119d = 4;
                            return null;
                        }
                        a(i10);
                        aw.a aVarB = aw.b(context, "nms");
                        if (aVarB != null) {
                            f62119d = aVarB.f62113a;
                            f62120e = aVarB;
                            return null;
                        }
                        b bVar = new b(context, str);
                        f62116a = bVar;
                        bVar.f62124i = i11;
                        f62116a.f62125j = str2;
                        f62116a.b(context);
                        f62116a.e(a(context));
                        z.a(context);
                        f62119d = 0;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f62116a;
    }

    public static String b() {
        if (e() != null) {
            return e().f62126k;
        }
        return null;
    }

    public static String c() {
        b bVarE = e();
        if (bVarE == null || !bVarE.f62128m || TextUtils.isEmpty(bVarE.f62127l)) {
            return null;
        }
        return bVarE.f62127l;
    }

    public static int d() {
        return f62119d;
    }

    public static b e() {
        return f62116a;
    }

    public static aw.a f() {
        return f62120e;
    }

    public String g() {
        return a5.a();
    }

    public void h() {
        this.f62130o = true;
        a5.a(this.f62122g, this.f62123h);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (az.a(ax.a(this.f62122g, "pgl_init_report", 0L), jCurrentTimeMillis)) {
            int i10 = f62116a.f62132q;
            if ((i10 > 0 && i10 < 100 && Math.random() * 100.0d < i10) || i10 == 100) {
                a("Start", (Map<String, Object>) null);
            }
        } else {
            a("Start", (Map<String, Object>) null);
            ax.b(this.f62122g, "pgl_init_report", jCurrentTimeMillis);
        }
        a("Start");
        if (this.f62133r) {
            ar.a(new a(), 20000L);
        }
    }

    private void b(Context context) {
        if (context == null || f62117b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.f62123h);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.f62124i));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ab.h(context));
            com.pgl.ssdk.ces.a.meta(105, null, sb2.toString());
            com.pgl.ssdk.ces.a.meta(152, null, ab.i(context));
            com.pgl.ssdk.ces.a.meta(153, null, ab.d(context));
            com.pgl.ssdk.ces.a.meta(106, null, ab.f(context));
            com.pgl.ssdk.ces.a.meta(107, null, ab.e(context));
            com.pgl.ssdk.ces.a.meta(108, null, ab.c(context));
            com.pgl.ssdk.ces.a.meta(109, null, ab.d());
            com.pgl.ssdk.ces.a.meta(110, null, ab.c());
            com.pgl.ssdk.ces.a.meta(115, null, this.f62125j);
            f62117b = true;
        } catch (Throwable unused) {
        }
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f62129n = str;
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f62127l)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.f62127l = str;
            a5.b();
        }
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f62126k)) {
            this.f62126k = str;
            com.pgl.ssdk.ces.a.meta(103, null, str);
            a5.b();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.ces.b.b(java.lang.String):void");
    }

    private static String a(Context context) {
        String strA = ax.a(context, "iid");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String string = UUID.randomUUID().toString();
        ax.b(context, "iid", string);
        return string;
    }

    public static void a(int i10) {
        an.a(i10);
    }

    public static String a() {
        if (e() != null) {
            return e().f62123h;
        }
        return null;
    }

    public void a(String str, String str2, String str3, String str4) {
        c(str2);
        d(str4);
        try {
            h();
        } catch (Throwable unused) {
        }
    }

    public Map<String, String> a(String str, byte[] bArr) {
        HashMap map = new HashMap();
        if (str == null) {
            str = "";
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        String str2 = (String) com.pgl.ssdk.ces.a.meta(224, this.f62122g, new Object[]{str, bArr});
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public void a(String str, Map<String, Object> map) {
        try {
            ar.a(new ao(this.f62122g, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, new Object[]{str, map}), "Start".equals(str) ? 10000L : 0L);
        } catch (Throwable unused) {
        }
    }

    public Object a(int i10, Object obj) {
        if (i10 == 123) {
            return af.a(this.f62122g);
        }
        if (i10 == 121) {
            return ad.a();
        }
        if (i10 == 122) {
            return ad.b();
        }
        if (i10 == 126) {
            return ad.b(this.f62122g);
        }
        if (i10 == 128) {
            return ad.c(this.f62122g);
        }
        if (i10 == 120) {
            return ac.c();
        }
        if (i10 == 124) {
            return ag.c(this.f62122g);
        }
        if (i10 == 130) {
            return ag.a(this.f62122g);
        }
        if (i10 == 145) {
            return ah.c(this.f62122g);
        }
        if (i10 == 125) {
            return ag.b(this.f62122g);
        }
        if (i10 == 129) {
            return ae.f(this.f62122g);
        }
        if (i10 == 141) {
            return ae.e(this.f62122g);
        }
        if (i10 == 134) {
            return ak.a(this.f62122g).b();
        }
        if (i10 == 140) {
            return al.a(this.f62122g).e();
        }
        if (i10 == 144) {
            return al.a(this.f62122g).d();
        }
        if (i10 == 133) {
            return a(obj);
        }
        if (i10 == 135) {
            return v.e();
        }
        if (i10 == 201) {
            return ad.a(this.f62122g);
        }
        if (i10 == 202) {
            return ad.c();
        }
        if (i10 == 236) {
            return ay.a((String) obj);
        }
        if (i10 == 142) {
            return ab.g(this.f62122g);
        }
        if (i10 == 143) {
            return ah.a(this.f62122g);
        }
        if (i10 == 146) {
            try {
                return v.b();
            } catch (Throwable unused) {
                return null;
            }
        }
        if (i10 == 147) {
            return Boolean.valueOf(ab.j(this.f62122g));
        }
        if (i10 == 148) {
            return u.b(this.f62122g);
        }
        if (i10 == 149) {
            return w.a(this.f62122g);
        }
        if (i10 == 150) {
            return Integer.valueOf(x.a());
        }
        if (i10 == 151) {
            return w.c();
        }
        if (i10 == 161) {
            return Boolean.valueOf(v.f());
        }
        if (i10 == 163) {
            return aj.a();
        }
        if (i10 == 169) {
            return Boolean.valueOf(aa.a(this.f62122g));
        }
        if (i10 == 170) {
            return Integer.valueOf(y.b((String) obj));
        }
        if (i10 == 203) {
            return ab.b();
        }
        if (i10 == 205) {
            return Integer.valueOf(ab.k(this.f62122g));
        }
        if (i10 == 204) {
            return Integer.valueOf(ae.a(this.f62122g));
        }
        if (i10 == 206) {
            return ah.b(this.f62122g);
        }
        return null;
    }

    public void a(MotionEvent motionEvent) {
        y.a(motionEvent, this.f62122g);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(java.util.Map<java.lang.String, java.lang.Object> r10) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.ces.b.a(java.util.Map):void");
    }

    private String a(Object obj) {
        Map<String, Object> map;
        if (!(obj instanceof String) || !"Start".equals((String) obj) || (map = f62118c) == null || map.isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        try {
            return new JSONObject(f62118c).toString();
        } catch (Exception unused) {
            return JsonUtils.EMPTY_JSON;
        }
    }

    public void a(String str) {
        ar.b(new RunnableC0786b(str));
    }
}
