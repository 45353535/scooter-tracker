package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j7 f112248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j7[] f112249d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112250b;

    static {
        j7 j7Var = new j7(0, "AUTOMATIC", "automatic");
        j7 j7Var2 = new j7(1, "MANUAL", "manual");
        f112248c = j7Var2;
        j7[] j7VarArr = {j7Var, j7Var2};
        f112249d = j7VarArr;
        qf.a.a(j7VarArr);
    }

    public j7(int i10, String str, String str2) {
        this.f112250b = str2;
    }

    public static j7 valueOf(String str) {
        return (j7) Enum.valueOf(j7.class, str);
    }

    public static j7[] values() {
        return (j7[]) f112249d.clone();
    }
}
