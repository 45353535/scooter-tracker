package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class bn2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bn2 f109062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bn2 f109063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ bn2[] f109064e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109065b;

    static {
        bn2 bn2Var = new bn2(0, "LIGHT", "light");
        f109062c = bn2Var;
        bn2 bn2Var2 = new bn2(1, "DARK", "dark");
        f109063d = bn2Var2;
        bn2[] bn2VarArr = {bn2Var, bn2Var2};
        f109064e = bn2VarArr;
        qf.a.a(bn2VarArr);
    }

    public bn2(int i10, String str, String str2) {
        this.f109065b = str2;
    }

    public static bn2 valueOf(String str) {
        return (bn2) Enum.valueOf(bn2.class, str);
    }

    public static bn2[] values() {
        return (bn2[]) f109064e.clone();
    }
}
