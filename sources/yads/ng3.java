package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ng3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ng3 f113871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ng3 f113872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ng3[] f113873d;

    static {
        ng3 ng3Var = new ng3(0, "LEFT_TOP");
        f113871b = ng3Var;
        ng3 ng3Var2 = new ng3(1, "CENTER");
        f113872c = ng3Var2;
        ng3[] ng3VarArr = {ng3Var, ng3Var2};
        f113873d = ng3VarArr;
        qf.a.a(ng3VarArr);
    }

    public ng3(int i10, String str) {
    }

    public static ng3 valueOf(String str) {
        return (ng3) Enum.valueOf(ng3.class, str);
    }

    public static ng3[] values() {
        return (ng3[]) f113873d.clone();
    }
}
