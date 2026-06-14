package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class y5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y5 f118084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y5 f118085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y5 f118086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y5 f118087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y5 f118088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ y5[] f118089g;

    static {
        y5 y5Var = new y5(0, "CANCELLED");
        f118084b = y5Var;
        y5 y5Var2 = new y5(1, "NOT_STARTED");
        f118085c = y5Var2;
        y5 y5Var3 = new y5(2, "LOADING");
        f118086d = y5Var3;
        y5 y5Var4 = new y5(3, "SUCCESSFULLY_LOADED");
        f118087e = y5Var4;
        y5 y5Var5 = new y5(4, "ERRONEOUSLY_LOADED");
        f118088f = y5Var5;
        y5[] y5VarArr = {y5Var, y5Var2, y5Var3, y5Var4, y5Var5};
        f118089g = y5VarArr;
        qf.a.a(y5VarArr);
    }

    public y5(int i10, String str) {
    }

    public static y5 valueOf(String str) {
        return (y5) Enum.valueOf(y5.class, str);
    }

    public static y5[] values() {
        return (y5[]) f118089g.clone();
    }
}
