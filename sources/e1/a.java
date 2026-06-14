package e1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0857a f68673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Exception f68674b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: e1.a$a, reason: collision with other inner class name */
    public static final class EnumC0857a {
        private static final /* synthetic */ EnumC0857a[] C;
        private static final /* synthetic */ EnumEntries D;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f68699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final EnumC0857a f68675c = new EnumC0857a("INTERNAL", 0, 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final EnumC0857a f68676d = new EnumC0857a("INTERNET_UNAVAILABLE", 1, 1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final EnumC0857a f68677e = new EnumC0857a("NETWORK_FAILURE", 2, 5);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final EnumC0857a f68678f = new EnumC0857a("NO_AD_FOUND", 3, 6);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final EnumC0857a f68679g = new EnumC0857a("SESSION_NOT_STARTED", 4, 7);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final EnumC0857a f68680h = new EnumC0857a("SERVER_ERROR", 5, 8);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final EnumC0857a f68681i = new EnumC0857a("ASSET_DOWNLOAD_FAILURE", 6, 16);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final EnumC0857a f68682j = new EnumC0857a("BANNER_DISABLED", 7, 36);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final EnumC0857a f68683k = new EnumC0857a("BANNER_VIEW_IS_DETACHED", 8, 37);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final EnumC0857a f68684l = new EnumC0857a("TIMEOUT", 9, 38);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final EnumC0857a f68685m = new EnumC0857a("DISABLED", 10, 39);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final EnumC0857a f68686n = new EnumC0857a("LOAD_IN_PROGRESS", 11, 40);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final EnumC0857a f68687o = new EnumC0857a("ALREADY_LOADED", 12, 41);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final EnumC0857a f68688p = new EnumC0857a("INVALID_PLACEMENT", 13, 42);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final EnumC0857a f68689q = new EnumC0857a("RATE_LIMITED", 14, 43);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final EnumC0857a f68690r = new EnumC0857a("INVALID_REQUEST", 15, 44);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final EnumC0857a f68691s = new EnumC0857a("INVALID_RESPONSE", 16, 45);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final EnumC0857a f68692t = new EnumC0857a("INVALID_ADM", 17, 46);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final EnumC0857a f68693u = new EnumC0857a("NO_STORAGE", 18, 47);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final EnumC0857a f68694v = new EnumC0857a("NO_MRAID_JS", 19, 48);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final EnumC0857a f68695w = new EnumC0857a("INVALID_HTML", 20, 49);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final EnumC0857a f68696x = new EnumC0857a("WEBVIEW_FAILED", 21, 50);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final EnumC0857a f68697y = new EnumC0857a("WEBVIEW_CRASHED", 22, 51);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final EnumC0857a f68698z = new EnumC0857a("INVALID_ASSET_URL", 23, 52);
        public static final EnumC0857a A = new EnumC0857a("VAST_ERROR", 24, 53);
        public static final EnumC0857a B = new EnumC0857a("UNSUPPORTED_CODEC", 25, 54);

        static {
            EnumC0857a[] enumC0857aArrD = d();
            C = enumC0857aArrD;
            D = qf.a.a(enumC0857aArrD);
        }

        private EnumC0857a(String str, int i10, int i11) {
            this.f68699b = i11;
        }

        private static final /* synthetic */ EnumC0857a[] d() {
            return new EnumC0857a[]{f68675c, f68676d, f68677e, f68678f, f68679g, f68680h, f68681i, f68682j, f68683k, f68684l, f68685m, f68686n, f68687o, f68688p, f68689q, f68690r, f68691s, f68692t, f68693u, f68694v, f68695w, f68696x, f68697y, f68698z, A, B};
        }

        public static EnumC0857a valueOf(String str) {
            return (EnumC0857a) Enum.valueOf(EnumC0857a.class, str);
        }

        public static EnumC0857a[] values() {
            return (EnumC0857a[]) C.clone();
        }
    }

    public a(EnumC0857a code, Exception exc) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f68673a = code;
        this.f68674b = exc;
    }

    public final EnumC0857a a() {
        return this.f68673a;
    }

    public Exception b() {
        return this.f68674b;
    }

    public String toString() {
        return "Chartboost CacheError: " + this.f68673a.name() + " with exception " + b();
    }

    public /* synthetic */ a(EnumC0857a enumC0857a, Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC0857a, (i10 & 2) != 0 ? null : exc);
    }
}
