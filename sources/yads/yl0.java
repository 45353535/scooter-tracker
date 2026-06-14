package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class yl0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yl0 f118282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final yl0 f118283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ yl0[] f118284d;

    static {
        yl0 yl0Var = new yl0(0, "FRAME");
        f118282b = yl0Var;
        yl0 yl0Var2 = new yl0(1, "TRACE");
        f118283c = yl0Var2;
        yl0[] yl0VarArr = {yl0Var, yl0Var2};
        f118284d = yl0VarArr;
        qf.a.a(yl0VarArr);
    }

    public yl0(int i10, String str) {
    }

    public static yl0 valueOf(String str) {
        return (yl0) Enum.valueOf(yl0.class, str);
    }

    public static yl0[] values() {
        return (yl0[]) f118284d.clone();
    }
}
