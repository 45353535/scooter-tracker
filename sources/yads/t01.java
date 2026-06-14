package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class t01 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t01 f116005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ t01[] f116006d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116007b;

    static {
        t01 t01Var = new t01(0, "ICON_VERTICAL_POSITION_TOP", "top");
        t01 t01Var2 = new t01(1, "ICON_VERTICAL_POSITION_BOTTOM", "bottom");
        t01 t01Var3 = new t01(2, "ICON_VERTICAL_POSITION_TOP_OFFSET", "topOffset");
        f116005c = t01Var3;
        t01[] t01VarArr = {t01Var, t01Var2, t01Var3};
        f116006d = t01VarArr;
        qf.a.a(t01VarArr);
    }

    public t01(int i10, String str, String str2) {
        this.f116007b = str2;
    }

    public static t01 valueOf(String str) {
        return (t01) Enum.valueOf(t01.class, str);
    }

    public static t01[] values() {
        return (t01[]) f116006d.clone();
    }
}
