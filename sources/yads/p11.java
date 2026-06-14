package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class p11 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p11 f114522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ p11[] f114523c;

    static {
        p11 p11Var = new p11(0, "PROD");
        f114522b = p11Var;
        p11[] p11VarArr = {p11Var, new p11(1, "PREDEFINED")};
        f114523c = p11VarArr;
        qf.a.a(p11VarArr);
    }

    public p11(int i10, String str) {
    }

    public static p11 valueOf(String str) {
        return (p11) Enum.valueOf(p11.class, str);
    }

    public static p11[] values() {
        return (p11[]) f114523c.clone();
    }
}
