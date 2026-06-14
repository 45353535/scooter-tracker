package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class lx2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final lx2 f113263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lx2 f113264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final lx2 f113265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ lx2[] f113266f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113267b;

    static {
        lx2 lx2Var = new lx2(0, "FIXED", "fixed");
        f113263c = lx2Var;
        lx2 lx2Var2 = new lx2(1, "FLEXIBLE", "flexible");
        f113264d = lx2Var2;
        lx2 lx2Var3 = new lx2(2, "SCREEN", "screen");
        lx2 lx2Var4 = new lx2(3, "STICKY", "sticky");
        f113265e = lx2Var4;
        lx2[] lx2VarArr = {lx2Var, lx2Var2, lx2Var3, lx2Var4};
        f113266f = lx2VarArr;
        qf.a.a(lx2VarArr);
    }

    public lx2(int i10, String str, String str2) {
        this.f113267b = str2;
    }

    public static lx2 valueOf(String str) {
        return (lx2) Enum.valueOf(lx2.class, str);
    }

    public static lx2[] values() {
        return (lx2[]) f113266f.clone();
    }
}
