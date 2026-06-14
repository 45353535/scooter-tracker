package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class dh3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dh3 f109926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dh3 f109927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dh3 f109928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ dh3[] f109929e;

    static {
        dh3 dh3Var = new dh3(0, "FIRST_QUARTILE");
        f109926b = dh3Var;
        dh3 dh3Var2 = new dh3(1, "MIDPOINT");
        f109927c = dh3Var2;
        dh3 dh3Var3 = new dh3(2, "THIRD_QUARTILE");
        f109928d = dh3Var3;
        dh3[] dh3VarArr = {dh3Var, dh3Var2, dh3Var3};
        f109929e = dh3VarArr;
        qf.a.a(dh3VarArr);
    }

    public dh3(int i10, String str) {
    }

    public static dh3 valueOf(String str) {
        return (dh3) Enum.valueOf(dh3.class, str);
    }

    public static dh3[] values() {
        return (dh3[]) f109929e.clone();
    }
}
