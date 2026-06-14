package i1;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f73878c = new d(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f73879d = MapsKt.mapOf(TuplesKt.to(400, "Bad Request"), TuplesKt.to(401, "Unauthorized"), TuplesKt.to(403, "Forbidden"), TuplesKt.to(404, "Not Found"), TuplesKt.to(408, "Request Timeout"), TuplesKt.to(409, "Conflict"), TuplesKt.to(429, "Too Many Requests"), TuplesKt.to(500, "Internal Server Error"), TuplesKt.to(502, "Bad Gateway"), TuplesKt.to(503, "Service Unavailable"), TuplesKt.to(504, "Gateway Timeout"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73880b;

    public static final class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f73881e = new a();

        public a() {
            super(502, b.f73878c.a(502), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1600884457;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BadGateway";
        }
    }

    /* JADX INFO: renamed from: i1.b$b, reason: collision with other inner class name */
    public static final class C0916b extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C0916b f73882e = new C0916b();

        public C0916b() {
            super(400, b.f73878c.a(400), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0916b);
        }

        public int hashCode() {
            return -316072606;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BadRequest";
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f73883e;

        public c(int i10) {
            super(i10, b.f73878c.a(i10), null);
            this.f73883e = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f73883e == ((c) obj).f73883e;
        }

        public int hashCode() {
            return this.f73883e;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ClientError(status=" + this.f73883e + ")";
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            String str = (String) b.f73879d.get(Integer.valueOf(i10));
            if (str == null) {
                str = "Unknown";
            }
            return "HTTP " + i10 + " " + str;
        }

        public final b c(int i10) {
            return i10 == 400 ? C0916b.f73882e : i10 == 401 ? n.f73893e : i10 == 403 ? f.f73885e : i10 == 404 ? i.f73888e : i10 == 408 ? j.f73889e : i10 == 409 ? e.f73884e : i10 == 429 ? m.f73892e : i10 == 500 ? h.f73887e : i10 == 502 ? a.f73881e : i10 == 503 ? l.f73891e : i10 == 504 ? g.f73886e : (400 > i10 || i10 >= 500) ? (500 > i10 || i10 >= 600) ? new o(i10) : new k(i10) : new c(i10);
        }

        public d() {
        }
    }

    public static final class e extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f73884e = new e();

        public e() {
            super(409, b.f73878c.a(409), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 488153194;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Conflict";
        }
    }

    public static final class f extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final f f73885e = new f();

        public f() {
            super(403, b.f73878c.a(403), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 258062945;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Forbidden";
        }
    }

    public static final class g extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final g f73886e = new g();

        public g() {
            super(504, b.f73878c.a(504), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -1275433707;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "GatewayTimeout";
        }
    }

    public static final class h extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h f73887e = new h();

        public h() {
            super(500, b.f73878c.a(500), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 693189104;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InternalServerError";
        }
    }

    public static final class i extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final i f73888e = new i();

        public i() {
            super(404, b.f73878c.a(404), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return -1673446137;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NotFound";
        }
    }

    public static final class j extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final j f73889e = new j();

        public j() {
            super(408, b.f73878c.a(408), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return -1845205398;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "RequestTimeout";
        }
    }

    public static final class k extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f73890e;

        public k(int i10) {
            super(i10, b.f73878c.a(i10), null);
            this.f73890e = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f73890e == ((k) obj).f73890e;
        }

        public int hashCode() {
            return this.f73890e;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ServerError(status=" + this.f73890e + ")";
        }
    }

    public static final class l extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final l f73891e = new l();

        public l() {
            super(503, b.f73878c.a(503), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public int hashCode() {
            return 315784435;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ServiceUnavailable";
        }
    }

    public static final class m extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final m f73892e = new m();

        public m() {
            super(429, b.f73878c.a(429), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public int hashCode() {
            return 1422549791;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "TooManyRequests";
        }
    }

    public static final class n extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final n f73893e = new n();

        public n() {
            super(401, b.f73878c.a(401), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return 36815244;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unauthorized";
        }
    }

    public static final class o extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f73894e;

        public o(int i10) {
            super(i10, b.f73878c.a(i10), null);
            this.f73894e = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f73894e == ((o) obj).f73894e;
        }

        public int hashCode() {
            return this.f73894e;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unknown(status=" + this.f73894e + ")";
        }
    }

    public /* synthetic */ b(int i10, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str);
    }

    public b(int i10, String str) {
        super(str);
        this.f73880b = i10;
    }
}
