package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class yl2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final yl2 f118285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final yl2 f118286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final yl2 f118287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yl2[] f118288f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118289b;

    static {
        yl2 yl2Var = new yl2(0, "SUCCESS", "success");
        f118285c = yl2Var;
        yl2 yl2Var2 = new yl2(1, "ERROR", "error");
        f118286d = yl2Var2;
        yl2 yl2Var3 = new yl2(2, "NO_ADS", "no_ads");
        f118287e = yl2Var3;
        yl2[] yl2VarArr = {yl2Var, yl2Var2, yl2Var3, new yl2(3, "FILTERED", "filtered")};
        f118288f = yl2VarArr;
        qf.a.a(yl2VarArr);
    }

    public yl2(int i10, String str, String str2) {
        this.f118289b = str2;
    }

    public static yl2 valueOf(String str) {
        return (yl2) Enum.valueOf(yl2.class, str);
    }

    public static yl2[] values() {
        return (yl2[]) f118288f.clone();
    }
}
