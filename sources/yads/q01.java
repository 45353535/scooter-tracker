package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class q01 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q01 f114837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q01[] f114838d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114839b;

    static {
        q01 q01Var = new q01(0, "ICON_HORIZONTAL_POSITION_LEFT", "left");
        q01 q01Var2 = new q01(1, "ICON_HORIZONTAL_POSITION_RIGHT", "right");
        q01 q01Var3 = new q01(2, "ICON_HORIZONTAL_POSITION_LEFT_OFFSET", "leftOffset");
        f114837c = q01Var3;
        q01[] q01VarArr = {q01Var, q01Var2, q01Var3};
        f114838d = q01VarArr;
        qf.a.a(q01VarArr);
    }

    public q01(int i10, String str, String str2) {
        this.f114839b = str2;
    }

    public static q01 valueOf(String str) {
        return (q01) Enum.valueOf(q01.class, str);
    }

    public static q01[] values() {
        return (q01[]) f114838d.clone();
    }
}
