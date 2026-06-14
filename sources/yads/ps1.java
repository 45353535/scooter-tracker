package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ps1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ps1 f114758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ps1 f114759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ps1 f114760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ps1[] f114761e;

    static {
        ps1 ps1Var = new ps1(0, "VERBOSE");
        ps1 ps1Var2 = new ps1(1, "DEBUG");
        ps1 ps1Var3 = new ps1(2, "INFO");
        f114758b = ps1Var3;
        ps1 ps1Var4 = new ps1(3, "WARNING");
        f114759c = ps1Var4;
        ps1 ps1Var5 = new ps1(4, "ERROR");
        f114760d = ps1Var5;
        ps1[] ps1VarArr = {ps1Var, ps1Var2, ps1Var3, ps1Var4, ps1Var5};
        f114761e = ps1VarArr;
        qf.a.a(ps1VarArr);
    }

    public ps1(int i10, String str) {
    }

    public static ps1 valueOf(String str) {
        return (ps1) Enum.valueOf(ps1.class, str);
    }

    public static ps1[] values() {
        return (ps1[]) f114761e.clone();
    }
}
