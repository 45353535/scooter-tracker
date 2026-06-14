package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ka3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ka3 f112665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ka3 f112666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ka3 f112667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ka3[] f112668e;

    static {
        ka3 ka3Var = new ka3(0, "MILLISECONDS");
        f112665b = ka3Var;
        ka3 ka3Var2 = new ka3(1, "PERCENTS");
        f112666c = ka3Var2;
        ka3 ka3Var3 = new ka3(2, "POSITION");
        f112667d = ka3Var3;
        ka3[] ka3VarArr = {ka3Var, ka3Var2, ka3Var3};
        f112668e = ka3VarArr;
        qf.a.a(ka3VarArr);
    }

    public ka3(int i10, String str) {
    }

    public static ka3 valueOf(String str) {
        return (ka3) Enum.valueOf(ka3.class, str);
    }

    public static ka3[] values() {
        return (ka3[]) f112668e.clone();
    }
}
