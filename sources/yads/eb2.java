package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class eb2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eb2 f110296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eb2 f110297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eb2 f110298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ eb2[] f110299e;

    static {
        eb2 eb2Var = new eb2(0, "SCREEN_ON");
        f110296b = eb2Var;
        eb2 eb2Var2 = new eb2(1, "SCREEN_OFF");
        f110297c = eb2Var2;
        eb2 eb2Var3 = new eb2(2, "USER_PRESENT");
        f110298d = eb2Var3;
        eb2[] eb2VarArr = {eb2Var, eb2Var2, eb2Var3};
        f110299e = eb2VarArr;
        qf.a.a(eb2VarArr);
    }

    public eb2(int i10, String str) {
    }

    public static eb2 valueOf(String str) {
        return (eb2) Enum.valueOf(eb2.class, str);
    }

    public static eb2[] values() {
        return (eb2[]) f110299e.clone();
    }
}
