package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class by2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final by2 f109145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ by2[] f109146d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109147b;

    static {
        by2 by2Var = new by2(0, "NEXT", "next");
        by2 by2Var2 = new by2(1, "LAST", "last");
        f109145c = by2Var2;
        by2[] by2VarArr = {by2Var, by2Var2};
        f109146d = by2VarArr;
        qf.a.a(by2VarArr);
    }

    public by2(int i10, String str, String str2) {
        this.f109147b = str2;
    }

    public static by2 valueOf(String str) {
        return (by2) Enum.valueOf(by2.class, str);
    }

    public static by2[] values() {
        return (by2[]) f109146d.clone();
    }
}
