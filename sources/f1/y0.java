package f1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f71581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f71584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1.e f71585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f71586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public xc f71587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f71588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f71589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f71590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f71591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f71592l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f71593b = new a("LOW", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f71594c = new a("HIGH", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f71595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71596e;

        static {
            a[] aVarArrD = d();
            f71595d = aVarArrD;
            f71596e = qf.a.a(aVarArrD);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] d() {
            return new a[]{f71593b, f71594c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f71595d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f71597b = new b("INFO", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f71598c = new b("CRITICAL", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f71599d = new b("ERROR", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ b[] f71600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71601f;

        static {
            b[] bVarArrD = d();
            f71600e = bVarArrD;
            f71601f = qf.a.a(bVarArrD);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] d() {
            return new b[]{f71597b, f71598c, f71599d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f71600e.clone();
        }
    }

    public y0(z2 z2Var, String str, String str2, String str3, b1.e eVar, b bVar, xc xcVar, boolean z10, boolean z11, long j10, float f10, a aVar) {
        this.f71581a = z2Var;
        this.f71582b = str;
        this.f71583c = str2;
        this.f71584d = str3;
        this.f71585e = eVar;
        this.f71586f = bVar;
        this.f71587g = xcVar;
        this.f71588h = z10;
        this.f71589i = z11;
        this.f71590j = j10;
        this.f71591k = f10;
        this.f71592l = aVar;
    }

    public final String a() {
        return this.f71583c;
    }

    public final void b(float f10) {
        this.f71591k = f10;
    }

    public final void c(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f71592l = aVar;
    }

    public final void d(xc xcVar) {
        this.f71587g = xcVar;
    }

    public final void e(boolean z10) {
        this.f71588h = z10;
    }

    public final float f() {
        return this.f71591k;
    }

    public final void g(boolean z10) {
        this.f71589i = z10;
    }

    public final String h() {
        return this.f71584d;
    }

    public final b1.e i() {
        return this.f71585e;
    }

    public final String j() {
        return this.f71582b;
    }

    public final z2 k() {
        return this.f71581a;
    }

    public final a l() {
        return this.f71592l;
    }

    public final boolean m() {
        return this.f71589i;
    }

    public final long n() {
        return this.f71590j;
    }

    public final long o() {
        return o3.b(this.f71590j);
    }

    public final xc p() {
        return this.f71587g;
    }

    public final b q() {
        return this.f71586f;
    }

    public final boolean r() {
        return this.f71588h;
    }

    public String toString() {
        return "TrackingEvent(name=" + this.f71581a.getValue() + ", message='" + this.f71582b + "', impressionAdType='" + this.f71583c + "', location='" + this.f71584d + "', mediation=" + this.f71585e + ", type=" + this.f71586f + ", trackAd=" + this.f71587g + ", isLatencyEvent=" + this.f71588h + ", shouldCalculateLatency=" + this.f71589i + ", timestamp=" + this.f71590j + ", latency=" + this.f71591k + ", priority=" + this.f71592l + ", timestampInSeconds=" + o() + ")";
    }

    public /* synthetic */ y0(z2 z2Var, String str, String str2, String str3, b1.e eVar, b bVar, xc xcVar, boolean z10, boolean z11, long j10, float f10, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2Var, str, str2, str3, eVar, bVar, (i10 & 64) != 0 ? new xc(null, null, null, null, null, null, null, null, 255, null) : xcVar, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? true : z11, (i10 & 512) != 0 ? System.currentTimeMillis() : j10, (i10 & 1024) != 0 ? 0.0f : f10, aVar, null);
    }

    public /* synthetic */ y0(z2 z2Var, String str, String str2, String str3, b1.e eVar, b bVar, xc xcVar, boolean z10, boolean z11, long j10, float f10, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2Var, str, str2, str3, eVar, bVar, xcVar, z10, z11, j10, f10, aVar);
    }
}
