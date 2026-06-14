package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i80 f111914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i80 f111915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i80 f111916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i80[] f111917e;

    static {
        i80 i80Var = new i80(0, "SUCCESS");
        f111914b = i80Var;
        i80 i80Var2 = new i80(1, "WARNING");
        f111915c = i80Var2;
        i80 i80Var3 = new i80(2, "ERROR");
        f111916d = i80Var3;
        i80[] i80VarArr = {i80Var, i80Var2, i80Var3};
        f111917e = i80VarArr;
        qf.a.a(i80VarArr);
    }

    public i80(int i10, String str) {
    }

    public static i80 valueOf(String str) {
        return (i80) Enum.valueOf(i80.class, str);
    }

    public static i80[] values() {
        return (i80[]) f111917e.clone();
    }
}
