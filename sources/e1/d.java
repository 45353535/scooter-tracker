package e1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f68734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Exception f68735b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f68736c = new a("INTERNAL", 0, 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f68737d = new a("URI_INVALID", 1, 1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f68738e = new a("URI_UNRECOGNIZED", 2, 2);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f68739f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f68740g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f68741b;

        static {
            a[] aVarArrD = d();
            f68739f = aVarArrD;
            f68740g = qf.a.a(aVarArrD);
        }

        private a(String str, int i10, int i11) {
            this.f68741b = i11;
        }

        private static final /* synthetic */ a[] d() {
            return new a[]{f68736c, f68737d, f68738e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f68739f.clone();
        }
    }

    public d(a code, Exception exc) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f68734a = code;
        this.f68735b = exc;
    }

    public Exception a() {
        return this.f68735b;
    }

    public String toString() {
        return "Chartboost ClickError: " + this.f68734a.name() + " with exception " + a();
    }
}
