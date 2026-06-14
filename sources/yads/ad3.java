package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ad3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ad3 f108644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ad3 f108645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ad3 f108646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ad3 f108647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ad3[] f108648f;

    static {
        ad3 ad3Var = new ad3(0, "PREROLL");
        f108644b = ad3Var;
        ad3 ad3Var2 = new ad3(1, "MIDROLL");
        f108645c = ad3Var2;
        ad3 ad3Var3 = new ad3(2, "POSTROLL");
        f108646d = ad3Var3;
        ad3 ad3Var4 = new ad3(3, "STANDALONE");
        f108647e = ad3Var4;
        ad3[] ad3VarArr = {ad3Var, ad3Var2, ad3Var3, ad3Var4};
        f108648f = ad3VarArr;
        qf.a.a(ad3VarArr);
    }

    public ad3(int i10, String str) {
    }

    public static ad3 valueOf(String str) {
        return (ad3) Enum.valueOf(ad3.class, str);
    }

    public static ad3[] values() {
        return (ad3[]) f108648f.clone();
    }
}
