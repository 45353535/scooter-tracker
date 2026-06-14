package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class dq1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dq1 f110020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dq1 f110021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ dq1[] f110022d;

    static {
        dq1 dq1Var = new dq1(0, "INFO");
        f110020b = dq1Var;
        dq1 dq1Var2 = new dq1(1, "ERROR");
        f110021c = dq1Var2;
        dq1[] dq1VarArr = {dq1Var, dq1Var2};
        f110022d = dq1VarArr;
        qf.a.a(dq1VarArr);
    }

    public dq1(int i10, String str) {
    }

    public static dq1 valueOf(String str) {
        return (dq1) Enum.valueOf(dq1.class, str);
    }

    public static dq1[] values() {
        return (dq1[]) f110022d.clone();
    }
}
