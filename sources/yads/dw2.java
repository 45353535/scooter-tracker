package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class dw2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dw2 f110098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dw2 f110099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dw2 f110100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ dw2[] f110101e;

    static {
        dw2 dw2Var = new dw2(0, "AD");
        f110098b = dw2Var;
        dw2 dw2Var2 = new dw2(1, "DSP");
        f110099c = dw2Var2;
        dw2 dw2Var3 = new dw2(2, "UNDEFINED");
        f110100d = dw2Var3;
        dw2[] dw2VarArr = {dw2Var, dw2Var2, dw2Var3};
        f110101e = dw2VarArr;
        qf.a.a(dw2VarArr);
    }

    public dw2(int i10, String str) {
    }

    public static dw2 valueOf(String str) {
        return (dw2) Enum.valueOf(dw2.class, str);
    }

    public static dw2[] values() {
        return (dw2[]) f110101e.clone();
    }
}
