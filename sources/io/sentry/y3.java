package io.sentry;

import com.adjust.sdk.Constants;
import com.adjust.sdk.purchase.ADJPConstants;
import com.google.common.base.Ascii;
import io.sentry.profilemeasurements.a;
import io.sentry.z3;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class y3 implements d2 {
    private Date A;
    private final Map B;
    private String C;
    private Map D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f84466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f84467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f84468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f84469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f84470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f84471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f84472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f84473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f84474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f84475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f84476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f84477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f84478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f84479o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f84480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f84481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f84482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f84483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f84484t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f84485u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f84486v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f84487w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f84488x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f84489y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f84490z;

    public static final class b implements t1 {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y3 a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            y3 y3Var = new y3();
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                byte b10 = -1;
                switch (strNextName.hashCode()) {
                    case -2133529830:
                        if (strNextName.equals("device_manufacturer")) {
                            b10 = 0;
                        }
                        break;
                    case -1981468849:
                        if (strNextName.equals("android_api_level")) {
                            b10 = 1;
                        }
                        break;
                    case -1430655860:
                        if (strNextName.equals("build_id")) {
                            b10 = 2;
                        }
                        break;
                    case -1172160413:
                        if (strNextName.equals("device_locale")) {
                            b10 = 3;
                        }
                        break;
                    case -1102636175:
                        if (strNextName.equals("profile_id")) {
                            b10 = 4;
                        }
                        break;
                    case -716656436:
                        if (strNextName.equals("device_os_build_number")) {
                            b10 = 5;
                        }
                        break;
                    case -591076352:
                        if (strNextName.equals("device_model")) {
                            b10 = 6;
                        }
                        break;
                    case -512511455:
                        if (strNextName.equals("device_is_emulator")) {
                            b10 = 7;
                        }
                        break;
                    case -478065584:
                        if (strNextName.equals("duration_ns")) {
                            b10 = 8;
                        }
                        break;
                    case -362243017:
                        if (strNextName.equals("measurements")) {
                            b10 = 9;
                        }
                        break;
                    case -332426004:
                        if (strNextName.equals("device_physical_memory_bytes")) {
                            b10 = 10;
                        }
                        break;
                    case -212264198:
                        if (strNextName.equals("device_cpu_frequencies")) {
                            b10 = Ascii.VT;
                        }
                        break;
                    case -102985484:
                        if (strNextName.equals("version_code")) {
                            b10 = Ascii.FF;
                        }
                        break;
                    case -102670958:
                        if (strNextName.equals("version_name")) {
                            b10 = 13;
                        }
                        break;
                    case -85904877:
                        if (strNextName.equals(ADJPConstants.KEY_ENVIRONMENT)) {
                            b10 = Ascii.SO;
                        }
                        break;
                    case 55126294:
                        if (strNextName.equals("timestamp")) {
                            b10 = Ascii.SI;
                        }
                        break;
                    case 508853068:
                        if (strNextName.equals("transaction_name")) {
                            b10 = Ascii.DLE;
                        }
                        break;
                    case 796476189:
                        if (strNextName.equals("device_os_name")) {
                            b10 = 17;
                        }
                        break;
                    case 839674195:
                        if (strNextName.equals("architecture")) {
                            b10 = Ascii.DC2;
                        }
                        break;
                    case 1010584092:
                        if (strNextName.equals("transaction_id")) {
                            b10 = 19;
                        }
                        break;
                    case 1052553990:
                        if (strNextName.equals("device_os_version")) {
                            b10 = Ascii.DC4;
                        }
                        break;
                    case 1163928186:
                        if (strNextName.equals("truncation_reason")) {
                            b10 = Ascii.NAK;
                        }
                        break;
                    case 1270300245:
                        if (strNextName.equals("trace_id")) {
                            b10 = Ascii.SYN;
                        }
                        break;
                    case 1874684019:
                        if (strNextName.equals("platform")) {
                            b10 = Ascii.ETB;
                        }
                        break;
                    case 1953158756:
                        if (strNextName.equals("sampled_profile")) {
                            b10 = Ascii.CAN;
                        }
                        break;
                    case 1954122069:
                        if (strNextName.equals("transactions")) {
                            b10 = Ascii.EM;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        String strG = m3Var.G();
                        if (strG != null) {
                            y3Var.f84470f = strG;
                        }
                        break;
                    case 1:
                        Integer numD0 = m3Var.d0();
                        if (numD0 != null) {
                            y3Var.f84468d = numD0.intValue();
                        }
                        break;
                    case 2:
                        String strG2 = m3Var.G();
                        if (strG2 != null) {
                            y3Var.f84480p = strG2;
                        }
                        break;
                    case 3:
                        String strG3 = m3Var.G();
                        if (strG3 != null) {
                            y3Var.f84469e = strG3;
                        }
                        break;
                    case 4:
                        String strG4 = m3Var.G();
                        if (strG4 != null) {
                            y3Var.f84488x = strG4;
                        }
                        break;
                    case 5:
                        String strG5 = m3Var.G();
                        if (strG5 != null) {
                            y3Var.f84472h = strG5;
                        }
                        break;
                    case 6:
                        String strG6 = m3Var.G();
                        if (strG6 != null) {
                            y3Var.f84471g = strG6;
                        }
                        break;
                    case 7:
                        Boolean boolX = m3Var.x();
                        if (boolX != null) {
                            y3Var.f84475k = boolX.booleanValue();
                        }
                        break;
                    case 8:
                        String strG7 = m3Var.G();
                        if (strG7 != null) {
                            y3Var.f84483s = strG7;
                        }
                        break;
                    case 9:
                        Map mapK0 = m3Var.k0(iLogger, new a.C1010a());
                        if (mapK0 != null) {
                            y3Var.B.putAll(mapK0);
                        }
                        break;
                    case 10:
                        String strG8 = m3Var.G();
                        if (strG8 != null) {
                            y3Var.f84478n = strG8;
                        }
                        break;
                    case 11:
                        List list = (List) m3Var.p0();
                        if (list != null) {
                            y3Var.f84477m = list;
                        }
                        break;
                    case 12:
                        String strG9 = m3Var.G();
                        if (strG9 != null) {
                            y3Var.f84484t = strG9;
                        }
                        break;
                    case 13:
                        String strG10 = m3Var.G();
                        if (strG10 != null) {
                            y3Var.f84485u = strG10;
                        }
                        break;
                    case 14:
                        String strG11 = m3Var.G();
                        if (strG11 != null) {
                            y3Var.f84489y = strG11;
                        }
                        break;
                    case 15:
                        Date dateL = m3Var.l(iLogger);
                        if (dateL != null) {
                            y3Var.A = dateL;
                        }
                        break;
                    case 16:
                        String strG12 = m3Var.G();
                        if (strG12 != null) {
                            y3Var.f84482r = strG12;
                        }
                        break;
                    case 17:
                        String strG13 = m3Var.G();
                        if (strG13 != null) {
                            y3Var.f84473i = strG13;
                        }
                        break;
                    case 18:
                        String strG14 = m3Var.G();
                        if (strG14 != null) {
                            y3Var.f84476l = strG14;
                        }
                        break;
                    case 19:
                        String strG15 = m3Var.G();
                        if (strG15 != null) {
                            y3Var.f84486v = strG15;
                        }
                        break;
                    case 20:
                        String strG16 = m3Var.G();
                        if (strG16 != null) {
                            y3Var.f84474j = strG16;
                        }
                        break;
                    case 21:
                        String strG17 = m3Var.G();
                        if (strG17 != null) {
                            y3Var.f84490z = strG17;
                        }
                        break;
                    case 22:
                        String strG18 = m3Var.G();
                        if (strG18 != null) {
                            y3Var.f84487w = strG18;
                        }
                        break;
                    case 23:
                        String strG19 = m3Var.G();
                        if (strG19 != null) {
                            y3Var.f84479o = strG19;
                        }
                        break;
                    case 24:
                        String strG20 = m3Var.G();
                        if (strG20 != null) {
                            y3Var.C = strG20;
                        }
                        break;
                    case 25:
                        List listP = m3Var.P(iLogger, new z3.a());
                        if (listP != null) {
                            y3Var.f84481q.addAll(listP);
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            y3Var.G(concurrentHashMap);
            m3Var.endObject();
            return y3Var;
        }
    }

    private boolean D() {
        return this.f84490z.equals(Constants.NORMAL) || this.f84490z.equals("timeout") || this.f84490z.equals("backgrounded");
    }

    public static /* synthetic */ List a() {
        return new ArrayList();
    }

    public String B() {
        return this.f84488x;
    }

    public File C() {
        return this.f84466b;
    }

    public void E() {
        try {
            this.f84477m = (List) this.f84467c.call();
        } catch (Throwable unused) {
        }
    }

    public void F(String str) {
        this.C = str;
    }

    public void G(Map map) {
        this.D = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("android_api_level").j(iLogger, Integer.valueOf(this.f84468d));
        n3Var.e("device_locale").j(iLogger, this.f84469e);
        n3Var.e("device_manufacturer").a(this.f84470f);
        n3Var.e("device_model").a(this.f84471g);
        n3Var.e("device_os_build_number").a(this.f84472h);
        n3Var.e("device_os_name").a(this.f84473i);
        n3Var.e("device_os_version").a(this.f84474j);
        n3Var.e("device_is_emulator").d(this.f84475k);
        n3Var.e("architecture").j(iLogger, this.f84476l);
        n3Var.e("device_cpu_frequencies").j(iLogger, this.f84477m);
        n3Var.e("device_physical_memory_bytes").a(this.f84478n);
        n3Var.e("platform").a(this.f84479o);
        n3Var.e("build_id").a(this.f84480p);
        n3Var.e("transaction_name").a(this.f84482r);
        n3Var.e("duration_ns").a(this.f84483s);
        n3Var.e("version_name").a(this.f84485u);
        n3Var.e("version_code").a(this.f84484t);
        if (!this.f84481q.isEmpty()) {
            n3Var.e("transactions").j(iLogger, this.f84481q);
        }
        n3Var.e("transaction_id").a(this.f84486v);
        n3Var.e("trace_id").a(this.f84487w);
        n3Var.e("profile_id").a(this.f84488x);
        n3Var.e(ADJPConstants.KEY_ENVIRONMENT).a(this.f84489y);
        n3Var.e("truncation_reason").a(this.f84490z);
        if (this.C != null) {
            n3Var.e("sampled_profile").a(this.C);
        }
        String strF = n3Var.f();
        n3Var.h("");
        n3Var.e("measurements").j(iLogger, this.B);
        n3Var.h(strF);
        n3Var.e("timestamp").j(iLogger, this.A);
        Map map = this.D;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.D.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    private y3() {
        this(new File("dummy"), h3.s());
    }

    public y3(File file, l1 l1Var) {
        this(file, l.d(), new ArrayList(), l1Var.getName(), l1Var.getEventId().toString(), l1Var.e().p().toString(), "0", 0, "", new Callable() { // from class: io.sentry.x3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return y3.a();
            }
        }, null, null, null, null, null, null, null, null, Constants.NORMAL, new HashMap());
    }

    public y3(File file, Date date, List list, String str, String str2, String str3, String str4, int i10, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.f84477m = new ArrayList();
        this.C = null;
        this.f84466b = file;
        this.A = date;
        this.f84476l = str5;
        this.f84467c = callable;
        this.f84468d = i10;
        this.f84469e = Locale.getDefault().toString();
        this.f84470f = str6 == null ? "" : str6;
        this.f84471g = str7 == null ? "" : str7;
        this.f84474j = str8 == null ? "" : str8;
        this.f84475k = bool != null ? bool.booleanValue() : false;
        this.f84478n = str9 != null ? str9 : "0";
        this.f84472h = "";
        this.f84473i = "android";
        this.f84479o = "android";
        this.f84480p = str10 != null ? str10 : "";
        this.f84481q = list;
        this.f84482r = str.isEmpty() ? "unknown" : str;
        this.f84483s = str4;
        this.f84484t = "";
        this.f84485u = str11 != null ? str11 : "";
        this.f84486v = str2;
        this.f84487w = str3;
        this.f84488x = i8.a();
        this.f84489y = str12 != null ? str12 : "production";
        this.f84490z = str13;
        if (!D()) {
            this.f84490z = Constants.NORMAL;
        }
        this.B = map;
    }
}
