package com.taurusx.tax.w.o;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.taurusx.tax.a.z.y;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.c.o;
import com.taurusx.tax.c.w;
import com.taurusx.tax.c.y;
import com.taurusx.tax.g.a;
import com.taurusx.tax.g.a0;
import com.taurusx.tax.g.b;
import com.taurusx.tax.g.c;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.m;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.s.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f67354a = "instream";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f67356c = "reward";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f67358f = "tax_ad_cfg_file.cfg";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f67359g = 204;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f67360h = "f_e288abc5";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static JSONObject f67362j = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f67365m = "nath_tax_cfg";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f67366n = "exception";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f67367o = "banner";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f67369r = "f_f9b9824b";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f67370s = "splash";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f67371t = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f67374w = "native";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f67376y = "interstitial";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f67377z = "config";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f67368p = c.w(new byte[]{-123, Ascii.SI, -59, -85, -87, 66, -23, -67, -30, -2, Ascii.SUB, Ascii.RS, -104, -47, 123, 123, -23, -27, 0, 8, -126, -116, 122, 39, -7, -6, SignedBytes.MAX_POWER_OF_TWO, Ascii.SUB, -118, -109, 39, 39, -6, -92, 13, 1, -122, -60, 39, 39, -6, -91, Ascii.CAN, 95, -60, -120, 59, 58, -20, -29, 9});

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f67361i = c.w(new byte[]{95, -18, -50, 111, 60, 36, 35, 120, -39, -59, -43, -47, 107, 34, 116, 116, -46, -34, -49, -57, 113, Ascii.DEL, 117, 40, -62, -63, -113, -43, 121, 96, 40, Utf8.REPLACEMENT_BYTE, -38, -97, -62, -50, 117, 55, 40, 40, -63, -98, -41, -112, 55, 123, 52, 53, -41, -40, -58});

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f67373v = c.w(new byte[]{104, 116, -127, -62, 121, -58, 43, 101, 116, 104, 55, 51, -52, -123, 97, 97, Ascii.DEL, 115, 45, 37, -42, -40, 96, 61, 111, 108, 109, 55, -34, -57, 61, 42, 119, 123, 44, 109, -36, -48, 35, 97, 111, 111, 51, 108, -55, -114, 97, 45, 115, 114, 37, 42, -40});

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f67364l = c.w(new byte[]{Ascii.ESC, 74, -6, -116, 49, -69, -11, -54, 57, 37, 2, 6, -7, -80, Ascii.DLE, Ascii.DLE, 34, 53, Ascii.GS, 88, -7, -7, 79, 17, 37, 48, Ascii.SO, 5, -7, -6, 17, 92, 62, 60, 89, 5, -7, -6, Ascii.DLE, 73, 96, 126, Ascii.ETB, Ascii.DC2});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f67357e = c.w(new byte[]{-74, -96, 32, 5, 48, 40, 66, -37, 126, 98, 81, 85, 107, 34, -74, -74, 101, 101, 85, SignedBytes.MAX_POWER_OF_TWO, 96, 123, -73, -19, 119, 110, 86, 86, 104, 54, -6, -10, 123, 57, 86, 86, 104, 55, -17, -88, 57, 115, 93, 70});

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f67363k = c.w(new byte[]{-51, -75, 10, -67, 44, -127, -16, 106, Ascii.DLE, Ascii.FF, -61, -57, -34, -105, -75, -75, Ascii.GS, Ascii.SO, -46, -39, -39, -125, -23, -23, 8, 86, -61, -42, -43, -34, -23, -22, 86, Ascii.ESC, -40, -38, -126, -37, -85, -75, Ascii.GS, Ascii.SO, -46, -39, -39});

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f67372u = c.w(new byte[]{-57, -101, 104, 71, -49, 85, -3, -88, 2, 52, 91, 91, -22, -23, 111, 122, 115, 46, 91, 77, -18, -24, 52, 54, 55, 113, 116, 78, -73, -32, Ascii.DC4, 120, 6, 108, 2, Ascii.SYN, -73, -57, 126, 9, 114, 46, 91, 77, -10, -5, 55, 9, 114, 50, 74, 91, -75, -13, 56, 37, 116, 7, 0, Ascii.DLE, -71, -57, 123, Ascii.DEL, 117, 99, Ascii.VT});

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f67375x = c.w(new byte[]{103, Ascii.GS, -113, -54, -83, -92, -70, -48, Ascii.DC2, Ascii.SO, 49, 53, 51, 38, 69, 91, 67, 72, 107, 113, Utf8.REPLACEMENT_BYTE, 39, 88, 88, 79, 84, 116, 124, 48, 38, Ascii.EM, Ascii.EM, 10, 85, 51, 116, 38, 104, Ascii.SO});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AtomicInteger f67355b = new AtomicInteger(0);

    public class z implements y.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f67378c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String[] f67379o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f67380s;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ com.taurusx.tax.y.o.z f67381w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ y f67382y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Context f67383z;

        /* JADX INFO: renamed from: com.taurusx.tax.w.o.w$z$z, reason: collision with other inner class name */
        public class RunnableC0826z implements Runnable {
            public RunnableC0826z() {
            }

            @Override // java.lang.Runnable
            public void run() {
                z zVar = z.this;
                w.w(zVar.f67379o, zVar.f67378c, zVar.f67383z, zVar.f67380s, zVar.f67381w, zVar.f67382y);
            }
        }

        public z(Context context, com.taurusx.tax.y.o.z zVar, y yVar, AtomicInteger atomicInteger, String[] strArr, String str) {
            this.f67383z = context;
            this.f67381w = zVar;
            this.f67382y = yVar;
            this.f67378c = atomicInteger;
            this.f67379o = strArr;
            this.f67380s = str;
        }

        @Override // com.taurusx.tax.c.y.w
        public void onResult(int i10, int i11, String str, String str2) {
            if (w.y(str2)) {
                w.c(str2);
                b.z().z(this.f67383z, b.f66094p, System.currentTimeMillis());
                this.f67381w.a(w.E());
                w.y(this.f67383z);
                y yVar = this.f67382y;
                if (yVar != null) {
                    yVar.z(true, com.taurusx.tax.w.w.SUCCESS);
                }
                com.taurusx.tax.g.n0.z.w(this.f67383z);
                if (TextUtils.isEmpty(w.h0())) {
                    return;
                }
                com.taurusx.tax.g.o0.z.z(2, w.h0(), null);
                return;
            }
            try {
                AtomicInteger atomicInteger = this.f67378c;
                atomicInteger.set(atomicInteger.get() + 1);
                if (this.f67378c.get() < this.f67379o.length) {
                    m.z(new RunnableC0826z(), ((long) this.f67378c.get()) * 3000);
                    return;
                }
                y yVar2 = this.f67382y;
                if (yVar2 != null) {
                    yVar2.z(true, com.taurusx.tax.w.w.convertFromRequestStatus(i10, i11, str, str2));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static JSONObject A() {
        return (JSONObject) z(com.taurusx.tax.w.o.z.H1, new JSONObject());
    }

    public static int B() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67435q1, 3)).intValue();
    }

    public static long C() {
        return ((Long) z(com.taurusx.tax.w.o.z.B0, 3000L)).longValue();
    }

    public static JSONArray D() {
        return (JSONArray) z(com.taurusx.tax.w.o.z.F1, new JSONArray());
    }

    public static String E() {
        return (String) z("f_f9b9824b", f67363k);
    }

    public static String F() {
        String str = f67357e;
        String str2 = (String) z(com.taurusx.tax.w.o.z.D1, str);
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    public static String G() {
        return (String) z(com.taurusx.tax.w.o.z.f67416k0, "");
    }

    public static String H() {
        return (String) z(com.taurusx.tax.w.o.z.f67456x1, f67372u);
    }

    public static long I() {
        return ((Long) z(com.taurusx.tax.w.o.z.D0, 5000L)).longValue();
    }

    public static long J() {
        return ((Long) z(com.taurusx.tax.w.o.z.C0, 30000L)).longValue();
    }

    public static float K() {
        return ((Float) z(com.taurusx.tax.w.o.z.V0, Float.valueOf(1.0f))).floatValue();
    }

    public static long L() {
        return ((Long) z(com.taurusx.tax.w.o.z.U0, 10000L)).longValue();
    }

    public static int M() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67417k1, 0)).intValue();
    }

    public static float N() {
        return ((Float) z(com.taurusx.tax.w.o.z.W0, Float.valueOf(1.0f))).floatValue();
    }

    public static long O() {
        return ((Long) z(com.taurusx.tax.w.o.z.T0, 5000L)).longValue();
    }

    public static int P() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67408h1, 1)).intValue();
    }

    public static int Q() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67390b1, 2)).intValue();
    }

    public static int R() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67399e1, 30)).intValue();
    }

    public static int S() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67402f1, 50)).intValue();
    }

    public static long T() {
        return ((Long) z(com.taurusx.tax.w.o.z.f67405g1, 10000L)).longValue();
    }

    public static boolean U() {
        return ((Boolean) z(com.taurusx.tax.w.o.z.f67393c1, Boolean.FALSE)).booleanValue();
    }

    public static boolean V() {
        return ((Boolean) z(com.taurusx.tax.w.o.z.f67396d1, Boolean.FALSE)).booleanValue();
    }

    public static int W() {
        if (((Integer) z(com.taurusx.tax.w.o.z.B1, 100)).intValue() > 0) {
            return ((Integer) z(com.taurusx.tax.w.o.z.B1, 100)).intValue();
        }
        return 100;
    }

    public static int X() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67423m1, 0)).intValue();
    }

    public static int Y() {
        return f67355b.get();
    }

    public static String Z() {
        return (String) z(com.taurusx.tax.w.o.z.f67422m0, "coin");
    }

    public static boolean a() {
        return ((Boolean) z(com.taurusx.tax.w.o.z.Q0, Boolean.FALSE)).booleanValue();
    }

    public static int a0() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67411i1, 1)).intValue();
    }

    public static float b() {
        return ((Float) z("f_ea980fc9.f_b773d261", Float.valueOf(0.5f))).floatValue();
    }

    public static int b0() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67425n0, 1)).intValue();
    }

    public static JSONObject c() {
        if (TaurusXAds.getContext() == null) {
            Log.v("taurusx", "get ad config error : context is null");
            return null;
        }
        String strO = o();
        if (TextUtils.isEmpty(strO)) {
            Log.v("taurusx", "get ad config error : tax file path is null");
            return null;
        }
        String strA = j0.a(strO);
        try {
            if (!TextUtils.isEmpty(strA)) {
                return new JSONObject(com.taurusx.tax.g.z.z(strA, a.y(), a.c()));
            }
        } catch (Exception e10) {
            Log.v("taurusx", "get ad config error : " + e10);
        }
        return null;
    }

    public static long c0() {
        return ((Long) z(com.taurusx.tax.w.o.z.f67461z0, 30000L)).longValue();
    }

    public static float d() {
        return ((Float) z(com.taurusx.tax.w.o.z.f67458y0, Float.valueOf(1.0f))).floatValue();
    }

    public static long d0() {
        return ((Long) z(com.taurusx.tax.w.o.z.A0, 70000L)).longValue();
    }

    public static float e() {
        return ((Float) z(com.taurusx.tax.w.o.z.K0, Float.valueOf(1.0f))).floatValue();
    }

    public static int e0() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67414j1, 0)).intValue();
    }

    public static int f() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67437r0, 5000)).intValue();
    }

    public static String f0() {
        return (String) z(com.taurusx.tax.w.o.z.A1, "");
    }

    public static boolean g() {
        return ((Boolean) z(com.taurusx.tax.w.o.z.P0, Boolean.FALSE)).booleanValue();
    }

    public static String g0() {
        return (String) z(com.taurusx.tax.w.o.z.f67387a1, "");
    }

    public static long h() {
        return ((Long) z("f_ea980fc9.f_9b39f6b2", Long.valueOf(TimeUnit.SECONDS.toMillis(3L)))).longValue();
    }

    public static String h0() {
        return (String) z(com.taurusx.tax.w.o.z.Z0, "");
    }

    public static int i() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67443t0, 1)).intValue();
    }

    public static int i0() {
        return ((Integer) z(com.taurusx.tax.w.o.z.S0, 100)).intValue();
    }

    public static long j() {
        return ((Long) z("f_ea980fc9.f_ae1fbfc5", Long.valueOf(TimeUnit.SECONDS.toMillis(1L)))).longValue();
    }

    public static boolean j0() {
        return ((Boolean) z(com.taurusx.tax.w.o.z.Y0, Boolean.FALSE)).booleanValue();
    }

    public static long k() {
        return ((Long) z(com.taurusx.tax.w.o.z.M0, 5000L)).longValue();
    }

    public static int k0() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67432p1, 3)).intValue();
    }

    public static boolean l() {
        return ((Boolean) z(com.taurusx.tax.w.o.z.J0, Boolean.TRUE)).booleanValue();
    }

    public static boolean l0() {
        return ((Boolean) z(com.taurusx.tax.w.o.z.f67438r1, Boolean.FALSE)).booleanValue();
    }

    public static boolean m() {
        return ((Boolean) z(com.taurusx.tax.w.o.z.f67426n1, Boolean.FALSE)).booleanValue();
    }

    public static boolean m0() {
        return ((Boolean) z(com.taurusx.tax.w.o.z.f67429o1, Boolean.TRUE)).booleanValue();
    }

    public static int n() {
        return ((Integer) z(com.taurusx.tax.w.o.z.R0, 60)).intValue();
    }

    public static boolean n0() {
        return ((Boolean) z(com.taurusx.tax.w.o.z.F0, Boolean.FALSE)).booleanValue();
    }

    public static String o() {
        Context context = TaurusXAds.getContext();
        if (context == null) {
            Log.v("taurusx", "get ad config xml path error : context is null");
            return null;
        }
        File file = new File(context.getFilesDir(), f67365m);
        file.mkdirs();
        return new File(file, f67358f).getAbsolutePath();
    }

    public static String p() {
        return (String) z("f_e288abc5", f67364l);
    }

    public static long q() {
        return ((Long) z(com.taurusx.tax.w.o.z.f67434q0, Long.valueOf(TimeUnit.SECONDS.toMillis(300L)))).longValue();
    }

    public static int r() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67420l1, 0)).intValue();
    }

    public static int s() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67459y1, 20000)).intValue();
    }

    public static int t() {
        return ((Integer) z(com.taurusx.tax.w.o.z.f67462z1, 10000)).intValue();
    }

    public static boolean u() {
        return ((Boolean) z(com.taurusx.tax.w.o.z.O0, Boolean.TRUE)).booleanValue();
    }

    public static long v() {
        return ((Long) z(com.taurusx.tax.w.o.z.L0, 0L)).longValue();
    }

    public static long w() {
        return ((Long) z(com.taurusx.tax.w.o.z.f67440s0, Long.valueOf(TimeUnit.SECONDS.toMillis(1800L)))).longValue();
    }

    public static long x() {
        return ((Long) z(com.taurusx.tax.w.o.z.N0, 10000L)).longValue();
    }

    public static String y() {
        return (String) z(com.taurusx.tax.w.o.z.J1, "");
    }

    public static boolean w(Context context) {
        try {
            long jW = b.z().w(context, b.f66092n);
            long jQ = q();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (jQ <= timeUnit.toMillis(300L)) {
                jQ = timeUnit.toMillis(300L);
            }
            boolean z10 = System.currentTimeMillis() - jW > jQ;
            LogUtil.v("taurusx", "global config expired : " + z10);
            return z10;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean y(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("f_f9b9824b")) {
                    if (jSONObject.has("f_e288abc5")) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public static <T> T z(String str, T t10) {
        z(false);
        T t11 = (T) z(str, f67362j, t10);
        return t11 != null ? t11 : t10;
    }

    public static void z(boolean z10) {
        if (f67362j == null || z10) {
            f67362j = c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void y(android.content.Context r9) {
        /*
            org.json.JSONObject r0 = A()     // Catch: org.json.JSONException -> La4
            if (r0 == 0) goto L92
            int r1 = r0.length()     // Catch: org.json.JSONException -> La4
            if (r1 <= 0) goto L92
            java.lang.String r1 = r0.toString()     // Catch: org.json.JSONException -> La4
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> La4
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L31
            com.taurusx.tax.g.b r2 = com.taurusx.tax.g.b.z()     // Catch: org.json.JSONException -> La4
            java.lang.String r5 = com.taurusx.tax.g.b.f66089g     // Catch: org.json.JSONException -> La4
            java.lang.String r2 = r2.y(r9, r5)     // Catch: org.json.JSONException -> La4
            boolean r2 = r1.equals(r2)     // Catch: org.json.JSONException -> La4
            if (r2 != 0) goto L31
            com.taurusx.tax.g.b r2 = com.taurusx.tax.g.b.z()     // Catch: org.json.JSONException -> La4
            r2.y(r9, r5, r1)     // Catch: org.json.JSONException -> La4
            r1 = r3
            goto L32
        L31:
            r1 = r4
        L32:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> La4
            com.taurusx.tax.g.b r2 = com.taurusx.tax.g.b.z()     // Catch: org.json.JSONException -> La4
            java.lang.String r7 = com.taurusx.tax.g.b.f66096t     // Catch: org.json.JSONException -> La4
            long r7 = r2.w(r9, r7)     // Catch: org.json.JSONException -> La4
            long r5 = r5 - r7
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L49
            goto L4a
        L49:
            r3 = r4
        L4a:
            if (r1 != 0) goto L4e
            if (r3 == 0) goto La4
        L4e:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> La4
            r1.<init>()     // Catch: org.json.JSONException -> La4
            java.util.Iterator r2 = r0.keys()     // Catch: org.json.JSONException -> La4
        L57:
            boolean r3 = r2.hasNext()     // Catch: org.json.JSONException -> La4
            if (r3 == 0) goto L77
            java.lang.Object r3 = r2.next()     // Catch: org.json.JSONException -> La4
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> La4
            java.lang.String r4 = ""
            java.lang.String r4 = r0.optString(r3, r4)     // Catch: org.json.JSONException -> La4
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: org.json.JSONException -> La4
            if (r5 != 0) goto L57
            boolean r3 = com.taurusx.tax.y.s.w.y(r9, r3)     // Catch: org.json.JSONException -> La4
            r1.put(r4, r3)     // Catch: org.json.JSONException -> La4
            goto L57
        L77:
            com.taurusx.tax.g.b r0 = com.taurusx.tax.g.b.z()     // Catch: org.json.JSONException -> La4
            java.lang.String r2 = com.taurusx.tax.g.b.f66096t     // Catch: org.json.JSONException -> La4
            long r3 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> La4
            r0.z(r9, r2, r3)     // Catch: org.json.JSONException -> La4
            com.taurusx.tax.g.b r0 = com.taurusx.tax.g.b.z()     // Catch: org.json.JSONException -> La4
            java.lang.String r2 = com.taurusx.tax.g.b.f66088f     // Catch: org.json.JSONException -> La4
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> La4
            r0.y(r9, r2, r1)     // Catch: org.json.JSONException -> La4
            return
        L92:
            com.taurusx.tax.g.b r0 = com.taurusx.tax.g.b.z()     // Catch: org.json.JSONException -> La4
            java.lang.String r1 = com.taurusx.tax.g.b.f66088f     // Catch: org.json.JSONException -> La4
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> La4
            r2.<init>()     // Catch: org.json.JSONException -> La4
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> La4
            r0.y(r9, r1, r2)     // Catch: org.json.JSONException -> La4
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.w.o.w.y(android.content.Context):void");
    }

    public static boolean w(String str) {
        JSONArray jSONArrayD = D();
        for (int i10 = 0; i10 < jSONArrayD.length(); i10++) {
            if (str.equalsIgnoreCase(jSONArrayD.getString(i10))) {
                return true;
            }
        }
        return false;
    }

    public static Object z(String str, JSONObject jSONObject, Object obj) {
        Object objOpt = null;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                String[] strArrSplit = str.split("\\.");
                if (strArrSplit != null && strArrSplit.length > 0) {
                    for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                        if (jSONObject.has(strArrSplit[i10])) {
                            if (i10 == strArrSplit.length - 1) {
                                if (obj instanceof Boolean) {
                                    objOpt = Boolean.valueOf(jSONObject.optBoolean(strArrSplit[i10]));
                                } else if (obj instanceof Long) {
                                    objOpt = Long.valueOf(jSONObject.optLong(strArrSplit[i10]));
                                } else if (obj instanceof Float) {
                                    objOpt = Float.valueOf(Double.valueOf(jSONObject.optDouble(strArrSplit[i10])).floatValue());
                                } else if (obj instanceof Integer) {
                                    objOpt = Integer.valueOf(jSONObject.optInt(strArrSplit[i10]));
                                } else if (obj instanceof String) {
                                    objOpt = jSONObject.optString(strArrSplit[i10]);
                                } else if (obj instanceof Boolean) {
                                    objOpt = Boolean.valueOf(jSONObject.optBoolean(strArrSplit[i10]));
                                } else {
                                    objOpt = jSONObject.opt(strArrSplit[i10]);
                                }
                            } else {
                                jSONObject = jSONObject.getJSONObject(strArrSplit[i10]);
                            }
                        }
                    }
                }
                return objOpt;
            } catch (Exception e10) {
                Log.v("taurusx", "parse ad config error : " + e10);
                return objOpt;
            }
        }
        Log.v("taurusx", "parse ad config error : key or json object is null" + LogUtil.getCallClassAndMethod());
        return null;
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.v("taurusx", "save config error : ad config is empty");
            return;
        }
        if (TaurusXAds.getContext() == null) {
            LogUtil.v("taurusx", "save config error : context is null");
            return;
        }
        String strO = o();
        if (TextUtils.isEmpty(strO)) {
            LogUtil.v("taurusx", "save config error : nathTaxFilePath is null");
            return;
        }
        try {
            String strW = com.taurusx.tax.g.z.w(str, a.y(), a.c());
            FileOutputStream fileOutputStream = new FileOutputStream(strO);
            fileOutputStream.write(strW.getBytes());
            fileOutputStream.close();
            z(true);
            LogUtil.v("taurusx", "update ad config success");
        } catch (Exception e10) {
            LogUtil.v("taurusx", "save config error : " + e10);
        }
    }

    public static void w(String[] strArr, AtomicInteger atomicInteger, Context context, String str, com.taurusx.tax.y.o.z zVar, y yVar) {
        String str2;
        String str3;
        String str4 = strArr[atomicInteger.get() % strArr.length];
        c(context);
        LogUtil.v("taurusx", "config url : " + str4 + " with index " + atomicInteger.get());
        o oVar = new o(w.y.z.POST);
        oVar.w(str4);
        oVar.z(com.taurusx.tax.a.z.w.c());
        y.w wVarZ = com.taurusx.tax.a.z.z.z(context, str, null);
        try {
            JSONObject jSONObject = new JSONObject();
            String strZ = j0.z(context);
            str2 = "";
            if (TextUtils.isEmpty(strZ) || !strZ.contains(StringUtils.COMMA)) {
                str3 = "";
            } else {
                String[] strArrSplit = strZ.split(StringUtils.COMMA);
                String str5 = strArrSplit.length > 0 ? strArrSplit[0] : "";
                str3 = strArrSplit.length > 1 ? strArrSplit[1] : "";
                str2 = str5;
            }
            String strW = j0.w();
            String strY = j0.y();
            String strZ2 = j0.z();
            String strO = j0.o();
            String strC = j0.c();
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ap_ver", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("ap_adp_ver", str3);
            }
            if (!TextUtils.isEmpty(strW)) {
                jSONObject.put("is_adp_ver", strW);
            }
            if (!TextUtils.isEmpty(strY)) {
                jSONObject.put("pg_adp_ver", strY);
            }
            if (!TextUtils.isEmpty(strZ2)) {
                jSONObject.put("am_adp_ver", strZ2);
            }
            if (!TextUtils.isEmpty(strO)) {
                jSONObject.put("tp_adp_ver", strO);
            }
            if (!TextUtils.isEmpty(strC)) {
                jSONObject.put("to_adp_ver", strC);
            }
            wVarZ.c(jSONObject);
        } catch (Exception unused) {
        }
        oVar.z(wVarZ);
        oVar.z("config");
        com.taurusx.tax.c.y.w(oVar, 1, new z(context, zVar, yVar, atomicInteger, strArr, str));
    }

    public static void c(Context context) {
        b.z().z(context, b.f66092n, System.currentTimeMillis());
    }

    public static void z(boolean z10, boolean z11, int i10, int i11, long j10) {
        JSONObject jSONObject = f67362j;
        if (jSONObject != null) {
            try {
                jSONObject.put(com.taurusx.tax.w.o.z.f67393c1, z10);
                f67362j.put(com.taurusx.tax.w.o.z.f67396d1, z11);
                f67362j.put(com.taurusx.tax.w.o.z.f67399e1, i10);
                f67362j.put(com.taurusx.tax.w.o.z.f67402f1, i11);
                f67362j.put(com.taurusx.tax.w.o.z.f67405g1, j10);
                c(f67362j.toString());
            } catch (Exception unused) {
            }
        }
    }

    public static boolean z() {
        return ((Boolean) z(com.taurusx.tax.w.o.z.E0, Boolean.TRUE)).booleanValue();
    }

    public static void z(Context context, String str, com.taurusx.tax.y.o.z zVar, y yVar) {
        if (w(context)) {
            f67355b = new AtomicInteger(0);
            w(com.taurusx.tax.a.z.w.y(context), f67355b, context, str, zVar, yVar);
        } else if (yVar != null) {
            yVar.z(false, com.taurusx.tax.w.w.SUCCESS);
        }
    }

    public static void z(Context context, com.taurusx.tax.y.o.z zVar) {
        zVar.a(E());
        zVar.s(com.taurusx.tax.w.z.t().w());
        zVar.y(com.taurusx.tax.z.f67752c);
        zVar.n("1.12.2");
        zVar.o(a.o());
        zVar.c(a.s());
        zVar.w(context);
        if (w(s.f67503i)) {
            return;
        }
        a0.z().z(context);
    }
}
