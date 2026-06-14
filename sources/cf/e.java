package cf;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f6808d = new e("JANUARY", 0, "Jan");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f6809e = new e("FEBRUARY", 1, "Feb");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f6810f = new e("MARCH", 2, "Mar");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f6811g = new e("APRIL", 3, "Apr");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f6812h = new e("MAY", 4, "May");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f6813i = new e("JUNE", 5, "Jun");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f6814j = new e("JULY", 6, "Jul");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f6815k = new e("AUGUST", 7, "Aug");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f6816l = new e("SEPTEMBER", 8, "Sep");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f6817m = new e("OCTOBER", 9, "Oct");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f6818n = new e("NOVEMBER", 10, "Nov");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f6819o = new e("DECEMBER", 11, "Dec");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ e[] f6820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f6821q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6822b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(int i10) {
            return (e) e.g().get(i10);
        }

        private a() {
        }
    }

    static {
        e[] eVarArrD = d();
        f6820p = eVarArrD;
        f6821q = qf.a.a(eVarArrD);
        f6807c = new a(null);
    }

    private e(String str, int i10, String str2) {
        this.f6822b = str2;
    }

    private static final /* synthetic */ e[] d() {
        return new e[]{f6808d, f6809e, f6810f, f6811g, f6812h, f6813i, f6814j, f6815k, f6816l, f6817m, f6818n, f6819o};
    }

    public static EnumEntries g() {
        return f6821q;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f6820p.clone();
    }
}
