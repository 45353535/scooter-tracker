package ve;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements Comparable {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final List f106566f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Map f106568g0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f106588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f106589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f106561d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c0 f106563e = new c0(100, "Continue");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c0 f106565f = new c0(101, "Switching Protocols");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c0 f106567g = new c0(102, "Processing");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c0 f106569h = new c0(200, "OK");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final c0 f106570i = new c0(201, LogConstants.EVENT_CREATED);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final c0 f106571j = new c0(202, "Accepted");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final c0 f106572k = new c0(203, "Non-Authoritative Information");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final c0 f106573l = new c0(204, "No Content");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final c0 f106574m = new c0(205, "Reset Content");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c0 f106575n = new c0(206, "Partial Content");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final c0 f106576o = new c0(207, "Multi-Status");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final c0 f106577p = new c0(300, "Multiple Choices");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final c0 f106578q = new c0(301, "Moved Permanently");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final c0 f106579r = new c0(302, "Found");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final c0 f106580s = new c0(303, "See Other");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final c0 f106581t = new c0(304, "Not Modified");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final c0 f106582u = new c0(305, "Use Proxy");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final c0 f106583v = new c0(306, "Switch Proxy");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final c0 f106584w = new c0(307, "Temporary Redirect");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final c0 f106585x = new c0(308, "Permanent Redirect");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final c0 f106586y = new c0(400, "Bad Request");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final c0 f106587z = new c0(401, "Unauthorized");
    private static final c0 A = new c0(402, "Payment Required");
    private static final c0 B = new c0(403, "Forbidden");
    private static final c0 C = new c0(404, "Not Found");
    private static final c0 D = new c0(405, "Method Not Allowed");
    private static final c0 E = new c0(406, "Not Acceptable");
    private static final c0 F = new c0(407, "Proxy Authentication Required");
    private static final c0 G = new c0(408, "Request Timeout");
    private static final c0 H = new c0(409, "Conflict");
    private static final c0 I = new c0(410, "Gone");
    private static final c0 J = new c0(411, "Length Required");
    private static final c0 K = new c0(TTAdConstant.IMAGE_URL_CODE, "Precondition Failed");
    private static final c0 L = new c0(TTAdConstant.VIDEO_INFO_CODE, "Payload Too Large");
    private static final c0 M = new c0(TTAdConstant.VIDEO_URL_CODE, "Request-URI Too Long");
    private static final c0 N = new c0(TTAdConstant.VIDEO_COVER_URL_CODE, "Unsupported Media Type");
    private static final c0 O = new c0(416, "Requested Range Not Satisfiable");
    private static final c0 P = new c0(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, "Expectation Failed");
    private static final c0 Q = new c0(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, "Unprocessable Entity");
    private static final c0 R = new c0(TypedValues.CycleType.TYPE_WAVE_PERIOD, "Locked");
    private static final c0 S = new c0(TypedValues.CycleType.TYPE_WAVE_OFFSET, "Failed Dependency");
    private static final c0 T = new c0(TypedValues.CycleType.TYPE_WAVE_PHASE, "Too Early");
    private static final c0 U = new c0(426, "Upgrade Required");
    private static final c0 V = new c0(429, "Too Many Requests");
    private static final c0 W = new c0(431, "Request Header Fields Too Large");
    private static final c0 X = new c0(500, "Internal Server Error");
    private static final c0 Y = new c0(501, "Not Implemented");
    private static final c0 Z = new c0(502, "Bad Gateway");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final c0 f106558a0 = new c0(503, "Service Unavailable");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final c0 f106559b0 = new c0(504, "Gateway Timeout");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final c0 f106560c0 = new c0(505, "HTTP Version Not Supported");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final c0 f106562d0 = new c0(506, "Variant Also Negotiates");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final c0 f106564e0 = new c0(507, "Insufficient Storage");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c0 A() {
            return c0.f106581t;
        }

        public final c0 B() {
            return c0.f106569h;
        }

        public final c0 C() {
            return c0.f106575n;
        }

        public final c0 D() {
            return c0.L;
        }

        public final c0 E() {
            return c0.A;
        }

        public final c0 F() {
            return c0.f106585x;
        }

        public final c0 G() {
            return c0.K;
        }

        public final c0 H() {
            return c0.f106567g;
        }

        public final c0 I() {
            return c0.F;
        }

        public final c0 J() {
            return c0.W;
        }

        public final c0 K() {
            return c0.G;
        }

        public final c0 L() {
            return c0.M;
        }

        public final c0 M() {
            return c0.O;
        }

        public final c0 N() {
            return c0.f106574m;
        }

        public final c0 O() {
            return c0.f106580s;
        }

        public final c0 P() {
            return c0.f106558a0;
        }

        public final c0 Q() {
            return c0.f106583v;
        }

        public final c0 R() {
            return c0.f106565f;
        }

        public final c0 S() {
            return c0.f106584w;
        }

        public final c0 T() {
            return c0.T;
        }

        public final c0 U() {
            return c0.V;
        }

        public final c0 V() {
            return c0.f106587z;
        }

        public final c0 W() {
            return c0.Q;
        }

        public final c0 X() {
            return c0.N;
        }

        public final c0 Y() {
            return c0.U;
        }

        public final c0 Z() {
            return c0.f106582u;
        }

        public final c0 a(int i10) {
            c0 c0Var = (c0) c0.f106568g0.get(Integer.valueOf(i10));
            return c0Var == null ? new c0(i10, "Unknown Status Code") : c0Var;
        }

        public final c0 a0() {
            return c0.f106562d0;
        }

        public final c0 b() {
            return c0.f106571j;
        }

        public final c0 b0() {
            return c0.f106560c0;
        }

        public final c0 c() {
            return c0.Z;
        }

        public final c0 d() {
            return c0.f106586y;
        }

        public final c0 e() {
            return c0.H;
        }

        public final c0 f() {
            return c0.f106563e;
        }

        public final c0 g() {
            return c0.f106570i;
        }

        public final c0 h() {
            return c0.P;
        }

        public final c0 i() {
            return c0.S;
        }

        public final c0 j() {
            return c0.B;
        }

        public final c0 k() {
            return c0.f106579r;
        }

        public final c0 l() {
            return c0.f106559b0;
        }

        public final c0 m() {
            return c0.I;
        }

        public final c0 n() {
            return c0.f106564e0;
        }

        public final c0 o() {
            return c0.X;
        }

        public final c0 p() {
            return c0.J;
        }

        public final c0 q() {
            return c0.R;
        }

        public final c0 r() {
            return c0.D;
        }

        public final c0 s() {
            return c0.f106578q;
        }

        public final c0 t() {
            return c0.f106576o;
        }

        public final c0 u() {
            return c0.f106577p;
        }

        public final c0 v() {
            return c0.f106573l;
        }

        public final c0 w() {
            return c0.f106572k;
        }

        public final c0 x() {
            return c0.E;
        }

        public final c0 y() {
            return c0.C;
        }

        public final c0 z() {
            return c0.Y;
        }

        private a() {
        }
    }

    static {
        List listA = d0.a();
        f106566f0 = listA;
        List list = listA;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((c0) obj).f106588b), obj);
        }
        f106568g0 = linkedHashMap;
    }

    public c0(int i10, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f106588b = i10;
        this.f106589c = description;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public int compareTo(c0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f106588b - other.f106588b;
    }

    public final int e0() {
        return this.f106588b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c0) && ((c0) obj).f106588b == this.f106588b;
    }

    public int hashCode() {
        return this.f106588b;
    }

    public String toString() {
        return this.f106588b + ' ' + this.f106589c;
    }
}
