package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zh1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zh1 f118683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zh1 f118684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zh1 f118685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ zh1[] f118686e;

    static {
        zh1 zh1Var = new zh1(0, "EXACTLY");
        f118683b = zh1Var;
        zh1 zh1Var2 = new zh1(1, "AT_MOST");
        f118684c = zh1Var2;
        zh1 zh1Var3 = new zh1(2, "UNSPECIFIED");
        f118685d = zh1Var3;
        zh1[] zh1VarArr = {zh1Var, zh1Var2, zh1Var3};
        f118686e = zh1VarArr;
        qf.a.a(zh1VarArr);
    }

    public zh1(int i10, String str) {
    }

    public static zh1 valueOf(String str) {
        return (zh1) Enum.valueOf(zh1.class, str);
    }

    public static zh1[] values() {
        return (zh1[]) f118686e.clone();
    }
}
