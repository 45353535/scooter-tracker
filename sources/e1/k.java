package e1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f68774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Exception f68775b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f68776c = new a("INVALID_CREDENTIALS", 0, 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f68777d = new a("NETWORK_FAILURE", 1, 1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f68778e = new a("SERVER_ERROR", 2, 2);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f68779f = new a("INTERNAL", 3, 3);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f68780g = new a("DISABLED", 4, 4);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f68781h = new a("NO_CONTEXT", 5, 5);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f68782i = new a("INVALID_CONFIGURATION", 6, 6);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f68783j = new a("OS_VERSION_NOT_SUPPORTED", 7, 7);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f68784k = new a("PERMISSIONS_NOT_SET", 8, 8);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ a[] f68785l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f68786m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f68787b;

        static {
            a[] aVarArrD = d();
            f68785l = aVarArrD;
            f68786m = qf.a.a(aVarArrD);
        }

        private a(String str, int i10, int i11) {
            this.f68787b = i11;
        }

        private static final /* synthetic */ a[] d() {
            return new a[]{f68776c, f68777d, f68778e, f68779f, f68780g, f68781h, f68782i, f68783j, f68784k};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f68785l.clone();
        }
    }

    public k(a code, Exception exc) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f68774a = code;
        this.f68775b = exc;
    }

    public Exception a() {
        return this.f68775b;
    }

    public String toString() {
        return "Chartboost StartError: " + this.f68774a.name() + " with exception " + a();
    }
}
