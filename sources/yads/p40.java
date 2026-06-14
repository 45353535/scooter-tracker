package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class p40 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p40 f114547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p40 f114548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p40 f114549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ p40[] f114550f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114551b;

    static {
        p40 p40Var = new p40(0, "BIDDING", "Bidding");
        f114547c = p40Var;
        p40 p40Var2 = new p40(1, "WATERFALL", "Waterfall");
        f114548d = p40Var2;
        p40 p40Var3 = new p40(2, "NONE", "None");
        f114549e = p40Var3;
        p40[] p40VarArr = {p40Var, p40Var2, p40Var3};
        f114550f = p40VarArr;
        qf.a.a(p40VarArr);
    }

    public p40(int i10, String str, String str2) {
        this.f114551b = str2;
    }

    public static p40 valueOf(String str) {
        return (p40) Enum.valueOf(p40.class, str);
    }

    public static p40[] values() {
        return (p40[]) f114550f.clone();
    }

    public final String a() {
        return this.f114551b;
    }
}
