package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class tc1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tc1 f116191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f116192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final tc1 f116193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ tc1[] f116194e;

    static {
        tc1 tc1Var = new tc1(0, "LOAD");
        f116191b = tc1Var;
        tc1 tc1Var2 = new tc1(1, "SHOW");
        f116192c = tc1Var2;
        tc1 tc1Var3 = new tc1(2, "RETURN_TO_APP");
        f116193d = tc1Var3;
        tc1[] tc1VarArr = {tc1Var, tc1Var2, tc1Var3};
        f116194e = tc1VarArr;
        qf.a.a(tc1VarArr);
    }

    public tc1(int i10, String str) {
    }

    public static tc1 valueOf(String str) {
        return (tc1) Enum.valueOf(tc1.class, str);
    }

    public static tc1[] values() {
        return (tc1[]) f116194e.clone();
    }
}
