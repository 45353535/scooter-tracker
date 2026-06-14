package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class g92 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g92 f111112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g92 f111113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g92 f111114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g92[] f111115f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111116b;

    static {
        g92 g92Var = new g92(0, 2, "LANDSCAPE");
        f111112c = g92Var;
        g92 g92Var2 = new g92(1, 1, "PORTRAIT");
        f111113d = g92Var2;
        g92 g92Var3 = new g92(2, 0, "UNDEFINED");
        f111114e = g92Var3;
        g92[] g92VarArr = {g92Var, g92Var2, g92Var3};
        f111115f = g92VarArr;
        qf.a.a(g92VarArr);
    }

    public g92(int i10, int i11, String str) {
        this.f111116b = i11;
    }

    public static g92 valueOf(String str) {
        return (g92) Enum.valueOf(g92.class, str);
    }

    public static g92[] values() {
        return (g92[]) f111115f.clone();
    }
}
