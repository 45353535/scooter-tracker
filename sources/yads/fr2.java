package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class fr2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fr2 f110836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fr2 f110837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ fr2[] f110838e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110839b;

    static {
        fr2 fr2Var = new fr2(0, "CONFIGURATION_FAILED", "configuration_failed");
        f110836c = fr2Var;
        fr2 fr2Var2 = new fr2(1, "TIMEOUT", "timeout");
        f110837d = fr2Var2;
        fr2[] fr2VarArr = {fr2Var, fr2Var2};
        f110838e = fr2VarArr;
        qf.a.a(fr2VarArr);
    }

    public fr2(int i10, String str, String str2) {
        this.f110839b = str2;
    }

    public static fr2 valueOf(String str) {
        return (fr2) Enum.valueOf(fr2.class, str);
    }

    public static fr2[] values() {
        return (fr2[]) f110838e.clone();
    }
}
