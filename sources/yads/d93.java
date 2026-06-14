package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d93 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d93 f109845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d93 f109846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d93 f109847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d93 f109848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d93 f109849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d93 f109850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d93 f109851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ d93[] f109852j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109853b;

    static {
        d93 d93Var = new d93(0, "NO_AD_VIEW", "no_ad_view");
        f109845c = d93Var;
        d93 d93Var2 = new d93(1, "NO_VISIBLE_ADS", "no_visible_ads");
        f109846d = d93Var2;
        d93 d93Var3 = new d93(2, "NOT_VISIBLE_FOR_PERCENT", "not_visible_for_percent");
        f109847e = d93Var3;
        d93 d93Var4 = new d93(3, "REQUIRED_ASSET_CAN_NOT_BE_VISIBLE", "required_asset_can_not_be_visible");
        f109848f = d93Var4;
        d93 d93Var5 = new d93(4, "SUPERVIEW_NULL", "superview_null");
        f109849g = d93Var5;
        d93 d93Var6 = new d93(5, "SUPERVIEW_HIDDEN", "superview_hidden");
        f109850h = d93Var6;
        d93 d93Var7 = new d93(6, "VISIBLE_AREA_TOO_SMALL", "visible_area_too_small");
        f109851i = d93Var7;
        d93[] d93VarArr = {d93Var, d93Var2, d93Var3, d93Var4, d93Var5, d93Var6, d93Var7};
        f109852j = d93VarArr;
        qf.a.a(d93VarArr);
    }

    public d93(int i10, String str, String str2) {
        this.f109853b = str2;
    }

    public static d93 valueOf(String str) {
        return (d93) Enum.valueOf(d93.class, str);
    }

    public static d93[] values() {
        return (d93[]) f109852j.clone();
    }
}
