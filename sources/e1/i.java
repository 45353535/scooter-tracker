package e1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f68751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Exception f68752b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f68753c = new a("INTERNAL", 0, 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f68754d = new a("SESSION_NOT_STARTED", 1, 7);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f68755e = new a("AD_ALREADY_VISIBLE", 2, 8);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f68756f = new a("INTERNET_UNAVAILABLE", 3, 25);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f68757g = new a("PRESENTATION_FAILURE", 4, 33);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f68758h = new a("NO_CACHED_AD", 5, 34);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f68759i = new a("BANNER_DISABLED", 6, 36);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f68760j = new a("BANNER_VIEW_IS_DETACHED", 7, 37);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f68761k = new a("TIMEOUT", 8, 38);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f68762l = new a("AD_EXPIRED", 9, 39);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f68763m = new a("AD_INVALIDATED", 10, 40);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f68764n = new a("NO_CONTEXT", 11, 41);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f68765o = new a("VIDEO_PLAYBACK_ERROR", 12, 42);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f68766p = new a("INVALID_CLICKTHROUGH_URL", 13, 43);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f68767q = new a("ASSET_UNAVAILABLE", 14, 44);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f68768r = new a("DISABLED", 15, 45);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ a[] f68769s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f68770t;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f68771b;

        static {
            a[] aVarArrD = d();
            f68769s = aVarArrD;
            f68770t = qf.a.a(aVarArrD);
        }

        private a(String str, int i10, int i11) {
            this.f68771b = i11;
        }

        private static final /* synthetic */ a[] d() {
            return new a[]{f68753c, f68754d, f68755e, f68756f, f68757g, f68758h, f68759i, f68760j, f68761k, f68762l, f68763m, f68764n, f68765o, f68766p, f68767q, f68768r};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f68769s.clone();
        }
    }

    public i(a code, Exception exc) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f68751a = code;
        this.f68752b = exc;
    }

    public final a a() {
        return this.f68751a;
    }

    public Exception b() {
        return this.f68752b;
    }

    public String toString() {
        return "Chartboost ShowError: " + this.f68751a.name() + " with exception " + b();
    }

    public /* synthetic */ i(a aVar, Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? null : exc);
    }
}
