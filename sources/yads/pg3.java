package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class pg3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pg3 f114670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ pg3[] f114671c;

    static {
        pg3 pg3Var = new pg3(0, "FIT_XY");
        pg3 pg3Var2 = new pg3(1, "FIT_CENTER");
        f114670b = pg3Var2;
        pg3[] pg3VarArr = {pg3Var, pg3Var2, new pg3(2, "CENTER_CROP")};
        f114671c = pg3VarArr;
        qf.a.a(pg3VarArr);
    }

    public pg3(int i10, String str) {
    }

    public static pg3 valueOf(String str) {
        return (pg3) Enum.valueOf(pg3.class, str);
    }

    public static pg3[] values() {
        return (pg3[]) f114671c.clone();
    }
}
