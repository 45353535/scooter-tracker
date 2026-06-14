package io.sentry.protocol;

import androidx.browser.customtabs.CustomTabsCallback;
import com.google.common.base.Ascii;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import net.pubnative.lite.sdk.models.AdExperience;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements d2 {
    private TimeZone A;
    private String B;
    private String C;
    private String D;
    private Float E;
    private Integer F;
    private Double G;
    private String H;
    private String I;
    private Map J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f83899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f83902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f83903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String[] f83904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Float f83905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Boolean f83906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f83907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f83908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f83909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Long f83910n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Long f83911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Long f83912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Boolean f83913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Long f83914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Long f83915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Long f83916t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Long f83917u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f83918v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f83919w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Float f83920x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Integer f83921y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Date f83922z;

    public static final class a implements t1 {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            e eVar = new e();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                byte b10 = -1;
                switch (strNextName.hashCode()) {
                    case -2076227591:
                        if (strNextName.equals("timezone")) {
                            b10 = 0;
                        }
                        break;
                    case -2012489734:
                        if (strNextName.equals("boot_time")) {
                            b10 = 1;
                        }
                        break;
                    case -1981332476:
                        if (strNextName.equals("simulator")) {
                            b10 = 2;
                        }
                        break;
                    case -1969347631:
                        if (strNextName.equals(CommonUrlParts.MANUFACTURER)) {
                            b10 = 3;
                        }
                        break;
                    case -1608004830:
                        if (strNextName.equals("processor_count")) {
                            b10 = 4;
                        }
                        break;
                    case -1439500848:
                        if (strNextName.equals("orientation")) {
                            b10 = 5;
                        }
                        break;
                    case -1410521534:
                        if (strNextName.equals("battery_temperature")) {
                            b10 = 6;
                        }
                        break;
                    case -1281860764:
                        if (strNextName.equals("family")) {
                            b10 = 7;
                        }
                        break;
                    case -1097462182:
                        if (strNextName.equals(CommonUrlParts.LOCALE)) {
                            b10 = 8;
                        }
                        break;
                    case -1012222381:
                        if (strNextName.equals(CustomTabsCallback.ONLINE_EXTRAS_KEY)) {
                            b10 = 9;
                        }
                        break;
                    case -877252910:
                        if (strNextName.equals("battery_level")) {
                            b10 = 10;
                        }
                        break;
                    case -619038223:
                        if (strNextName.equals("model_id")) {
                            b10 = Ascii.VT;
                        }
                        break;
                    case -568274923:
                        if (strNextName.equals("screen_density")) {
                            b10 = Ascii.FF;
                        }
                        break;
                    case -417046774:
                        if (strNextName.equals(CommonUrlParts.SCREEN_DPI)) {
                            b10 = 13;
                        }
                        break;
                    case -136523212:
                        if (strNextName.equals("free_memory")) {
                            b10 = Ascii.SO;
                        }
                        break;
                    case 3355:
                        if (strNextName.equals("id")) {
                            b10 = Ascii.SI;
                        }
                        break;
                    case 3373707:
                        if (strNextName.equals("name")) {
                            b10 = Ascii.DLE;
                        }
                        break;
                    case 59142220:
                        if (strNextName.equals("low_memory")) {
                            b10 = 17;
                        }
                        break;
                    case 93076189:
                        if (strNextName.equals("archs")) {
                            b10 = Ascii.DC2;
                        }
                        break;
                    case 93997959:
                        if (strNextName.equals(AdExperience.BRAND)) {
                            b10 = 19;
                        }
                        break;
                    case 104069929:
                        if (strNextName.equals("model")) {
                            b10 = Ascii.DC4;
                        }
                        break;
                    case 115746789:
                        if (strNextName.equals("cpu_description")) {
                            b10 = Ascii.NAK;
                        }
                        break;
                    case 244497903:
                        if (strNextName.equals("processor_frequency")) {
                            b10 = Ascii.SYN;
                        }
                        break;
                    case 731866107:
                        if (strNextName.equals("connection_type")) {
                            b10 = Ascii.ETB;
                        }
                        break;
                    case 746402966:
                        if (strNextName.equals("chipset")) {
                            b10 = Ascii.CAN;
                        }
                        break;
                    case 817830969:
                        if (strNextName.equals("screen_width_pixels")) {
                            b10 = Ascii.EM;
                        }
                        break;
                    case 823882553:
                        if (strNextName.equals("external_storage_size")) {
                            b10 = Ascii.SUB;
                        }
                        break;
                    case 897428293:
                        if (strNextName.equals("storage_size")) {
                            b10 = Ascii.ESC;
                        }
                        break;
                    case 1331465768:
                        if (strNextName.equals("usable_memory")) {
                            b10 = Ascii.FS;
                        }
                        break;
                    case 1418777727:
                        if (strNextName.equals("memory_size")) {
                            b10 = Ascii.GS;
                        }
                        break;
                    case 1436115569:
                        if (strNextName.equals("charging")) {
                            b10 = Ascii.RS;
                        }
                        break;
                    case 1450613660:
                        if (strNextName.equals("external_free_storage")) {
                            b10 = Ascii.US;
                        }
                        break;
                    case 1524159400:
                        if (strNextName.equals("free_storage")) {
                            b10 = 32;
                        }
                        break;
                    case 1556284978:
                        if (strNextName.equals("screen_height_pixels")) {
                            b10 = 33;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        eVar.A = m3Var.S(iLogger);
                        break;
                    case 1:
                        if (m3Var.peek() == io.sentry.vendor.gson.stream.b.STRING) {
                            eVar.f83922z = m3Var.l(iLogger);
                        }
                        break;
                    case 2:
                        eVar.f83909m = m3Var.x();
                        break;
                    case 3:
                        eVar.f83899c = m3Var.G();
                        break;
                    case 4:
                        eVar.F = m3Var.d0();
                        break;
                    case 5:
                        eVar.f83908l = (b) m3Var.B(iLogger, new b.a());
                        break;
                    case 6:
                        eVar.E = m3Var.K();
                        break;
                    case 7:
                        eVar.f83901e = m3Var.G();
                        break;
                    case 8:
                        eVar.C = m3Var.G();
                        break;
                    case 9:
                        eVar.f83907k = m3Var.x();
                        break;
                    case 10:
                        eVar.f83905i = m3Var.K();
                        break;
                    case 11:
                        eVar.f83903g = m3Var.G();
                        break;
                    case 12:
                        eVar.f83920x = m3Var.K();
                        break;
                    case 13:
                        eVar.f83921y = m3Var.d0();
                        break;
                    case 14:
                        eVar.f83911o = m3Var.g0();
                        break;
                    case 15:
                        eVar.B = m3Var.G();
                        break;
                    case 16:
                        eVar.f83898b = m3Var.G();
                        break;
                    case 17:
                        eVar.f83913q = m3Var.x();
                        break;
                    case 18:
                        List list = (List) m3Var.p0();
                        if (list != null) {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            eVar.f83904h = strArr;
                        }
                        break;
                    case 19:
                        eVar.f83900d = m3Var.G();
                        break;
                    case 20:
                        eVar.f83902f = m3Var.G();
                        break;
                    case 21:
                        eVar.H = m3Var.G();
                        break;
                    case 22:
                        eVar.G = m3Var.X();
                        break;
                    case 23:
                        eVar.D = m3Var.G();
                        break;
                    case 24:
                        eVar.I = m3Var.G();
                        break;
                    case 25:
                        eVar.f83918v = m3Var.d0();
                        break;
                    case 26:
                        eVar.f83916t = m3Var.g0();
                        break;
                    case 27:
                        eVar.f83914r = m3Var.g0();
                        break;
                    case 28:
                        eVar.f83912p = m3Var.g0();
                        break;
                    case 29:
                        eVar.f83910n = m3Var.g0();
                        break;
                    case 30:
                        eVar.f83906j = m3Var.x();
                        break;
                    case 31:
                        eVar.f83917u = m3Var.g0();
                        break;
                    case 32:
                        eVar.f83915s = m3Var.g0();
                        break;
                    case 33:
                        eVar.f83919w = m3Var.d0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            eVar.u0(concurrentHashMap);
            m3Var.endObject();
            return eVar;
        }
    }

    public enum b implements d2 {
        PORTRAIT,
        LANDSCAPE;

        public static final class a implements t1 {
            @Override // io.sentry.t1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(m3 m3Var, ILogger iLogger) {
                return b.valueOf(m3Var.nextString().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.d2
        public void serialize(@NotNull n3 n3Var, @NotNull ILogger iLogger) throws IOException {
            n3Var.a(toString().toLowerCase(Locale.ROOT));
        }
    }

    public e() {
    }

    public String I() {
        return this.D;
    }

    public Long J() {
        return this.f83911o;
    }

    public Long K() {
        return this.f83915s;
    }

    public String L() {
        return this.B;
    }

    public String M() {
        return this.C;
    }

    public Long N() {
        return this.f83910n;
    }

    public Long O() {
        return this.f83914r;
    }

    public void P(String[] strArr) {
        this.f83904h = strArr;
    }

    public void Q(Float f10) {
        this.f83905i = f10;
    }

    public void R(Float f10) {
        this.E = f10;
    }

    public void S(Date date) {
        this.f83922z = date;
    }

    public void T(String str) {
        this.f83900d = str;
    }

    public void U(Boolean bool) {
        this.f83906j = bool;
    }

    public void V(String str) {
        this.I = str;
    }

    public void W(String str) {
        this.D = str;
    }

    public void X(Long l10) {
        this.f83917u = l10;
    }

    public void Y(Long l10) {
        this.f83916t = l10;
    }

    public void Z(String str) {
        this.f83901e = str;
    }

    public void a0(Long l10) {
        this.f83911o = l10;
    }

    public void b0(Long l10) {
        this.f83915s = l10;
    }

    public void c0(String str) {
        this.B = str;
    }

    public void d0(String str) {
        this.C = str;
    }

    public void e0(Boolean bool) {
        this.f83913q = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (io.sentry.util.w.a(this.f83898b, eVar.f83898b) && io.sentry.util.w.a(this.f83899c, eVar.f83899c) && io.sentry.util.w.a(this.f83900d, eVar.f83900d) && io.sentry.util.w.a(this.f83901e, eVar.f83901e) && io.sentry.util.w.a(this.f83902f, eVar.f83902f) && io.sentry.util.w.a(this.f83903g, eVar.f83903g) && Arrays.equals(this.f83904h, eVar.f83904h) && io.sentry.util.w.a(this.f83905i, eVar.f83905i) && io.sentry.util.w.a(this.f83906j, eVar.f83906j) && io.sentry.util.w.a(this.f83907k, eVar.f83907k) && this.f83908l == eVar.f83908l && io.sentry.util.w.a(this.f83909m, eVar.f83909m) && io.sentry.util.w.a(this.f83910n, eVar.f83910n) && io.sentry.util.w.a(this.f83911o, eVar.f83911o) && io.sentry.util.w.a(this.f83912p, eVar.f83912p) && io.sentry.util.w.a(this.f83913q, eVar.f83913q) && io.sentry.util.w.a(this.f83914r, eVar.f83914r) && io.sentry.util.w.a(this.f83915s, eVar.f83915s) && io.sentry.util.w.a(this.f83916t, eVar.f83916t) && io.sentry.util.w.a(this.f83917u, eVar.f83917u) && io.sentry.util.w.a(this.f83918v, eVar.f83918v) && io.sentry.util.w.a(this.f83919w, eVar.f83919w) && io.sentry.util.w.a(this.f83920x, eVar.f83920x) && io.sentry.util.w.a(this.f83921y, eVar.f83921y) && io.sentry.util.w.a(this.f83922z, eVar.f83922z) && io.sentry.util.w.a(this.B, eVar.B) && io.sentry.util.w.a(this.C, eVar.C) && io.sentry.util.w.a(this.D, eVar.D) && io.sentry.util.w.a(this.E, eVar.E) && io.sentry.util.w.a(this.F, eVar.F) && io.sentry.util.w.a(this.G, eVar.G) && io.sentry.util.w.a(this.H, eVar.H) && io.sentry.util.w.a(this.I, eVar.I)) {
                return true;
            }
        }
        return false;
    }

    public void f0(String str) {
        this.f83899c = str;
    }

    public void g0(Long l10) {
        this.f83910n = l10;
    }

    public void h0(String str) {
        this.f83902f = str;
    }

    public int hashCode() {
        return (io.sentry.util.w.b(this.f83898b, this.f83899c, this.f83900d, this.f83901e, this.f83902f, this.f83903g, this.f83905i, this.f83906j, this.f83907k, this.f83908l, this.f83909m, this.f83910n, this.f83911o, this.f83912p, this.f83913q, this.f83914r, this.f83915s, this.f83916t, this.f83917u, this.f83918v, this.f83919w, this.f83920x, this.f83921y, this.f83922z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I) * 31) + Arrays.hashCode(this.f83904h);
    }

    public void i0(String str) {
        this.f83903g = str;
    }

    public void j0(Boolean bool) {
        this.f83907k = bool;
    }

    public void k0(b bVar) {
        this.f83908l = bVar;
    }

    public void l0(Integer num) {
        this.F = num;
    }

    public void m0(Double d10) {
        this.G = d10;
    }

    public void n0(Float f10) {
        this.f83920x = f10;
    }

    public void o0(Integer num) {
        this.f83921y = num;
    }

    public void p0(Integer num) {
        this.f83919w = num;
    }

    public void q0(Integer num) {
        this.f83918v = num;
    }

    public void r0(Boolean bool) {
        this.f83909m = bool;
    }

    public void s0(Long l10) {
        this.f83914r = l10;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83898b != null) {
            n3Var.e("name").a(this.f83898b);
        }
        if (this.f83899c != null) {
            n3Var.e(CommonUrlParts.MANUFACTURER).a(this.f83899c);
        }
        if (this.f83900d != null) {
            n3Var.e(AdExperience.BRAND).a(this.f83900d);
        }
        if (this.f83901e != null) {
            n3Var.e("family").a(this.f83901e);
        }
        if (this.f83902f != null) {
            n3Var.e("model").a(this.f83902f);
        }
        if (this.f83903g != null) {
            n3Var.e("model_id").a(this.f83903g);
        }
        if (this.f83904h != null) {
            n3Var.e("archs").j(iLogger, this.f83904h);
        }
        if (this.f83905i != null) {
            n3Var.e("battery_level").i(this.f83905i);
        }
        if (this.f83906j != null) {
            n3Var.e("charging").k(this.f83906j);
        }
        if (this.f83907k != null) {
            n3Var.e(CustomTabsCallback.ONLINE_EXTRAS_KEY).k(this.f83907k);
        }
        if (this.f83908l != null) {
            n3Var.e("orientation").j(iLogger, this.f83908l);
        }
        if (this.f83909m != null) {
            n3Var.e("simulator").k(this.f83909m);
        }
        if (this.f83910n != null) {
            n3Var.e("memory_size").i(this.f83910n);
        }
        if (this.f83911o != null) {
            n3Var.e("free_memory").i(this.f83911o);
        }
        if (this.f83912p != null) {
            n3Var.e("usable_memory").i(this.f83912p);
        }
        if (this.f83913q != null) {
            n3Var.e("low_memory").k(this.f83913q);
        }
        if (this.f83914r != null) {
            n3Var.e("storage_size").i(this.f83914r);
        }
        if (this.f83915s != null) {
            n3Var.e("free_storage").i(this.f83915s);
        }
        if (this.f83916t != null) {
            n3Var.e("external_storage_size").i(this.f83916t);
        }
        if (this.f83917u != null) {
            n3Var.e("external_free_storage").i(this.f83917u);
        }
        if (this.f83918v != null) {
            n3Var.e("screen_width_pixels").i(this.f83918v);
        }
        if (this.f83919w != null) {
            n3Var.e("screen_height_pixels").i(this.f83919w);
        }
        if (this.f83920x != null) {
            n3Var.e("screen_density").i(this.f83920x);
        }
        if (this.f83921y != null) {
            n3Var.e(CommonUrlParts.SCREEN_DPI).i(this.f83921y);
        }
        if (this.f83922z != null) {
            n3Var.e("boot_time").j(iLogger, this.f83922z);
        }
        if (this.A != null) {
            n3Var.e("timezone").j(iLogger, this.A);
        }
        if (this.B != null) {
            n3Var.e("id").a(this.B);
        }
        if (this.D != null) {
            n3Var.e("connection_type").a(this.D);
        }
        if (this.E != null) {
            n3Var.e("battery_temperature").i(this.E);
        }
        if (this.C != null) {
            n3Var.e(CommonUrlParts.LOCALE).a(this.C);
        }
        if (this.F != null) {
            n3Var.e("processor_count").i(this.F);
        }
        if (this.G != null) {
            n3Var.e("processor_frequency").i(this.G);
        }
        if (this.H != null) {
            n3Var.e("cpu_description").a(this.H);
        }
        if (this.I != null) {
            n3Var.e("chipset").a(this.I);
        }
        Map map = this.J;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.J.get(str));
            }
        }
        n3Var.endObject();
    }

    public void t0(TimeZone timeZone) {
        this.A = timeZone;
    }

    public void u0(Map map) {
        this.J = map;
    }

    e(e eVar) {
        this.f83898b = eVar.f83898b;
        this.f83899c = eVar.f83899c;
        this.f83900d = eVar.f83900d;
        this.f83901e = eVar.f83901e;
        this.f83902f = eVar.f83902f;
        this.f83903g = eVar.f83903g;
        this.f83906j = eVar.f83906j;
        this.f83907k = eVar.f83907k;
        this.f83908l = eVar.f83908l;
        this.f83909m = eVar.f83909m;
        this.f83910n = eVar.f83910n;
        this.f83911o = eVar.f83911o;
        this.f83912p = eVar.f83912p;
        this.f83913q = eVar.f83913q;
        this.f83914r = eVar.f83914r;
        this.f83915s = eVar.f83915s;
        this.f83916t = eVar.f83916t;
        this.f83917u = eVar.f83917u;
        this.f83918v = eVar.f83918v;
        this.f83919w = eVar.f83919w;
        this.f83920x = eVar.f83920x;
        this.f83921y = eVar.f83921y;
        this.f83922z = eVar.f83922z;
        this.B = eVar.B;
        this.D = eVar.D;
        this.E = eVar.E;
        this.f83905i = eVar.f83905i;
        String[] strArr = eVar.f83904h;
        this.f83904h = strArr != null ? (String[]) strArr.clone() : null;
        this.C = eVar.C;
        TimeZone timeZone = eVar.A;
        this.A = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
        this.I = eVar.I;
        this.J = io.sentry.util.c.b(eVar.J);
    }
}
