package f1;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f70496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f70497d = new n("NONE", 0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f70498e = new n("TOP", 1, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f70499f = new n("LEFT", 2, 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f70500g = new n("BOTTOM", 3, 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f70501h = new n("RIGHT", 4, 8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f70502i = new n("ALL", 5, 15);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ n[] f70503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f70504k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70505b;

    public static final class a {
        public a() {
        }

        public final boolean a(int i10) {
            return (i10 & n.f70500g.g()) != 0;
        }

        public final boolean b(int i10) {
            return (i10 & n.f70499f.g()) != 0;
        }

        public final boolean c(int i10) {
            return (i10 & n.f70501h.g()) != 0;
        }

        public final boolean d(int i10) {
            return (i10 & n.f70498e.g()) != 0;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        n[] nVarArrD = d();
        f70503j = nVarArrD;
        f70504k = qf.a.a(nVarArrD);
        f70496c = new a(null);
    }

    public n(String str, int i10, int i11) {
        this.f70505b = i11;
    }

    public static final /* synthetic */ n[] d() {
        return new n[]{f70497d, f70498e, f70499f, f70500g, f70501h, f70502i};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f70503j.clone();
    }

    public final int g() {
        return this.f70505b;
    }
}
