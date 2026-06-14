package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class iv1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final iv1 f112158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final iv1 f112159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ iv1[] f112160d;

    static {
        iv1 iv1Var = new iv1(0, "LEFT");
        f112158b = iv1Var;
        iv1 iv1Var2 = new iv1(1, "RIGHT");
        f112159c = iv1Var2;
        iv1[] iv1VarArr = {iv1Var, iv1Var2};
        f112160d = iv1VarArr;
        qf.a.a(iv1VarArr);
    }

    public iv1(int i10, String str) {
    }

    public static iv1 valueOf(String str) {
        return (iv1) Enum.valueOf(iv1.class, str);
    }

    public static iv1[] values() {
        return (iv1[]) f112160d.clone();
    }
}
