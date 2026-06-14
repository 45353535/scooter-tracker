package ve;

import com.google.common.net.HttpHeaders;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u {
    private static final String[] V0;
    private static final List W0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f106718a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f106720b = "Accept";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f106722c = HttpHeaders.ACCEPT_CHARSET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f106724d = HttpHeaders.ACCEPT_ENCODING;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f106726e = HttpHeaders.ACCEPT_LANGUAGE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f106728f = HttpHeaders.ACCEPT_RANGES;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f106730g = HttpHeaders.AGE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f106732h = "Allow";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f106734i = "ALPN";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f106736j = "Authentication-Info";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f106738k = "Authorization";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f106740l = "Cache-Control";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f106742m = "Connection";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f106744n = HttpHeaders.CONTENT_DISPOSITION;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f106746o = "Content-Encoding";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f106748p = "Content-Language";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f106750q = "Content-Length";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f106752r = "Content-Location";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f106754s = HttpHeaders.CONTENT_RANGE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f106756t = "Content-Type";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f106758u = HttpHeaders.COOKIE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f106760v = "DASL";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f106762w = "Date";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f106764x = "DAV";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f106766y = "Depth";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f106768z = "Destination";
    private static final String A = "ETag";
    private static final String B = HttpHeaders.EXPECT;
    private static final String C = "Expires";
    private static final String D = HttpHeaders.FROM;
    private static final String E = HttpHeaders.FORWARDED;
    private static final String F = HttpHeaders.HOST;
    private static final String G = HttpHeaders.HTTP2_SETTINGS;
    private static final String H = "If";
    private static final String I = HttpHeaders.IF_MATCH;
    private static final String J = HttpHeaders.IF_MODIFIED_SINCE;
    private static final String K = HttpHeaders.IF_NONE_MATCH;
    private static final String L = HttpHeaders.IF_RANGE;
    private static final String M = "If-Schedule-Tag-Match";
    private static final String N = HttpHeaders.IF_UNMODIFIED_SINCE;
    private static final String O = HttpHeaders.LAST_MODIFIED;
    private static final String P = "Location";
    private static final String Q = "Lock-Token";
    private static final String R = HttpHeaders.LINK;
    private static final String S = HttpHeaders.MAX_FORWARDS;
    private static final String T = "MIME-Version";
    private static final String U = "Ordering-Type";
    private static final String V = HttpHeaders.ORIGIN;
    private static final String W = "Overwrite";
    private static final String X = "Position";
    private static final String Y = HttpHeaders.PRAGMA;
    private static final String Z = "Prefer";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f106719a0 = "Preference-Applied";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f106721b0 = "Proxy-Authenticate";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f106723c0 = "Proxy-Authentication-Info";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f106725d0 = HttpHeaders.PROXY_AUTHORIZATION;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String f106727e0 = HttpHeaders.PUBLIC_KEY_PINS;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final String f106729f0 = HttpHeaders.PUBLIC_KEY_PINS_REPORT_ONLY;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final String f106731g0 = "Range";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final String f106733h0 = HttpHeaders.REFERER;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final String f106735i0 = "Retry-After";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final String f106737j0 = "Schedule-Reply";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final String f106739k0 = "Schedule-Tag";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final String f106741l0 = HttpHeaders.SEC_WEBSOCKET_ACCEPT;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final String f106743m0 = HttpHeaders.SEC_WEBSOCKET_EXTENSIONS;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final String f106745n0 = HttpHeaders.SEC_WEBSOCKET_KEY;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final String f106747o0 = HttpHeaders.SEC_WEBSOCKET_PROTOCOL;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f106749p0 = HttpHeaders.SEC_WEBSOCKET_VERSION;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final String f106751q0 = HttpHeaders.SERVER;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final String f106753r0 = HttpHeaders.SET_COOKIE;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final String f106755s0 = "SLUG";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final String f106757t0 = HttpHeaders.STRICT_TRANSPORT_SECURITY;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final String f106759u0 = HttpHeaders.TE;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final String f106761v0 = AndroidInitializeBoldSDK.MSG_TIMEOUT;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final String f106763w0 = HttpHeaders.TRAILER;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final String f106765x0 = HttpHeaders.TRANSFER_ENCODING;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final String f106767y0 = HttpHeaders.UPGRADE;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final String f106769z0 = "User-Agent";
    private static final String A0 = HttpHeaders.VARY;
    private static final String B0 = "Via";
    private static final String C0 = "Warning";
    private static final String D0 = "WWW-Authenticate";
    private static final String E0 = HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN;
    private static final String F0 = HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS;
    private static final String G0 = HttpHeaders.ACCESS_CONTROL_ALLOW_CREDENTIALS;
    private static final String H0 = HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS;
    private static final String I0 = HttpHeaders.ACCESS_CONTROL_REQUEST_METHOD;
    private static final String J0 = HttpHeaders.ACCESS_CONTROL_REQUEST_HEADERS;
    private static final String K0 = HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS;
    private static final String L0 = HttpHeaders.ACCESS_CONTROL_MAX_AGE;
    private static final String M0 = "X-Http-Method-Override";
    private static final String N0 = HttpHeaders.X_FORWARDED_HOST;
    private static final String O0 = "X-Forwarded-Server";
    private static final String P0 = HttpHeaders.X_FORWARDED_PROTO;
    private static final String Q0 = HttpHeaders.X_FORWARDED_FOR;
    private static final String R0 = HttpHeaders.X_FORWARDED_PORT;
    private static final String S0 = HttpHeaders.X_REQUEST_ID;
    private static final String T0 = "X-Correlation-ID";
    private static final String U0 = "X-Total-Count";

    static {
        String[] strArr = {HttpHeaders.TRANSFER_ENCODING, HttpHeaders.UPGRADE};
        V0 = strArr;
        W0 = ArraysKt.asList(strArr);
    }

    private u() {
    }

    public final void a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i10 = 0;
        int i11 = 0;
        while (i10 < name.length()) {
            char cCharAt = name.charAt(i10);
            int i12 = i11 + 1;
            if (Intrinsics.compare((int) cCharAt, 32) <= 0 || v.b(cCharAt)) {
                throw new e0(name, i11);
            }
            i10++;
            i11 = i12;
        }
    }

    public final void b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = 0;
        int i11 = 0;
        while (i10 < value.length()) {
            char cCharAt = value.charAt(i10);
            int i12 = i11 + 1;
            if (Intrinsics.compare((int) cCharAt, 32) < 0 && cCharAt != '\t') {
                throw new f0(value, i11);
            }
            i10++;
            i11 = i12;
        }
    }

    public final String c() {
        return f106720b;
    }

    public final String d() {
        return f106722c;
    }

    public final String e() {
        return f106738k;
    }

    public final String f() {
        return f106746o;
    }

    public final String g() {
        return f106750q;
    }

    public final String h() {
        return f106754s;
    }

    public final String i() {
        return f106756t;
    }

    public final String j() {
        return f106758u;
    }

    public final String k() {
        return f106762w;
    }

    public final String l() {
        return A;
    }

    public final String m() {
        return C;
    }

    public final String n() {
        return F;
    }

    public final String o() {
        return J;
    }

    public final String p() {
        return L;
    }

    public final String q() {
        return N;
    }

    public final String r() {
        return O;
    }

    public final String s() {
        return P;
    }

    public final String t() {
        return f106731g0;
    }

    public final String u() {
        return f106735i0;
    }

    public final String v() {
        return f106765x0;
    }

    public final List w() {
        return W0;
    }

    public final String x() {
        return f106769z0;
    }
}
