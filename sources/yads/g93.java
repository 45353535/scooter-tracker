package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class g93 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g93 f111117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g93 f111118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g93 f111119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g93[] f111120f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111121b;

    static {
        g93 g93Var = new g93(0, "INCONSISTENT_ASSET_VALUE", "inconsistent_asset_value");
        f111117c = g93Var;
        g93 g93Var2 = new g93(1, "NO_VISIBLE_SPONSORED_ASSET", "no_visible_sponsored_asset");
        f111118d = g93Var2;
        g93 g93Var3 = new g93(2, "NO_VISIBLE_REQUIRED_ASSETS", "no_visible_required_assets");
        f111119e = g93Var3;
        g93[] g93VarArr = {g93Var, g93Var2, g93Var3};
        f111120f = g93VarArr;
        qf.a.a(g93VarArr);
    }

    public g93(int i10, String str, String str2) {
        this.f111121b = str2;
    }

    public static g93 valueOf(String str) {
        return (g93) Enum.valueOf(g93.class, str);
    }

    public static g93[] values() {
        return (g93[]) f111120f.clone();
    }
}
