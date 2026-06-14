package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class s33 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s33 f115680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s33 f115681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s33 f115682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s33 f115683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s33 f115684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ s33[] f115685g;

    static {
        s33 s33Var = new s33(0, "TIME");
        f115680b = s33Var;
        s33 s33Var2 = new s33(1, "PERCENTAGE");
        f115681c = s33Var2;
        s33 s33Var3 = new s33(2, "START");
        f115682d = s33Var3;
        s33 s33Var4 = new s33(3, "END");
        f115683e = s33Var4;
        s33 s33Var5 = new s33(4, "POSITION");
        f115684f = s33Var5;
        s33[] s33VarArr = {s33Var, s33Var2, s33Var3, s33Var4, s33Var5};
        f115685g = s33VarArr;
        qf.a.a(s33VarArr);
    }

    public s33(int i10, String str) {
    }

    public static s33 valueOf(String str) {
        return (s33) Enum.valueOf(s33.class, str);
    }

    public static s33[] values() {
        return (s33[]) f115685g.clone();
    }
}
