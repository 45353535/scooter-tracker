package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class va3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final va3 f116946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final va3 f116947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ va3[] f116948e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116949b;

    static {
        va3 va3Var = new va3(0, 1, "VERIFICATION_REJECTED");
        va3 va3Var2 = new va3(1, 2, "VERIFICATION_NOT_SUPPORTED");
        f116946c = va3Var2;
        va3 va3Var3 = new va3(2, 3, "ERROR_RESOURCE_LOAD");
        f116947d = va3Var3;
        va3[] va3VarArr = {va3Var, va3Var2, va3Var3};
        f116948e = va3VarArr;
        qf.a.a(va3VarArr);
    }

    public va3(int i10, int i11, String str) {
        this.f116949b = i11;
    }

    public static va3 valueOf(String str) {
        return (va3) Enum.valueOf(va3.class, str);
    }

    public static va3[] values() {
        return (va3[]) f116948e.clone();
    }
}
