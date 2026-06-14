package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class fs1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fs1 f110844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fs1 f110845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fs1 f110846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ fs1[] f110847e;

    static {
        fs1 fs1Var = new fs1(0, "INITIALIZATION_NOT_STARTED");
        f110844b = fs1Var;
        fs1 fs1Var2 = new fs1(1, "INITIALIZING");
        f110845c = fs1Var2;
        fs1 fs1Var3 = new fs1(2, "INITIALIZED");
        f110846d = fs1Var3;
        fs1[] fs1VarArr = {fs1Var, fs1Var2, fs1Var3};
        f110847e = fs1VarArr;
        qf.a.a(fs1VarArr);
    }

    public fs1(int i10, String str) {
    }

    public static fs1 valueOf(String str) {
        return (fs1) Enum.valueOf(fs1.class, str);
    }

    public static fs1[] values() {
        return (fs1[]) f110847e.clone();
    }
}
