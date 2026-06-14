package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class la2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final la2 f113023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final la2 f113024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final la2 f113025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ la2[] f113026e;

    static {
        la2 la2Var = new la2(0, "INVALIDATED");
        f113023b = la2Var;
        la2 la2Var2 = new la2(1, "ACTIVE");
        f113024c = la2Var2;
        la2 la2Var3 = new la2(2, "PAUSED");
        f113025d = la2Var3;
        la2[] la2VarArr = {la2Var, la2Var2, la2Var3};
        f113026e = la2VarArr;
        qf.a.a(la2VarArr);
    }

    public la2(int i10, String str) {
    }

    public static la2 valueOf(String str) {
        return (la2) Enum.valueOf(la2.class, str);
    }

    public static la2[] values() {
        return (la2[]) f113026e.clone();
    }
}
