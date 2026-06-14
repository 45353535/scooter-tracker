package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class fh0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fh0 f110723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fh0 f110724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ fh0[] f110725d;

    static {
        fh0 fh0Var = new fh0(0, "BLOCK");
        f110723b = fh0Var;
        fh0 fh0Var2 = new fh0(1, "BLOCK_INNER_AD");
        f110724c = fh0Var2;
        fh0[] fh0VarArr = {fh0Var, fh0Var2};
        f110725d = fh0VarArr;
        qf.a.a(fh0VarArr);
    }

    public fh0(int i10, String str) {
    }

    public static fh0 valueOf(String str) {
        return (fh0) Enum.valueOf(fh0.class, str);
    }

    public static fh0[] values() {
        return (fh0[]) f110725d.clone();
    }
}
