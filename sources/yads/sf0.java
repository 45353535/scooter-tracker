package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class sf0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sf0 f115779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sf0 f115780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sf0 f115781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ sf0[] f115782e;

    static {
        sf0 sf0Var = new sf0(0, "PHONE");
        f115779b = sf0Var;
        sf0 sf0Var2 = new sf0(1, "TABLET");
        f115780c = sf0Var2;
        sf0 sf0Var3 = new sf0(2, "TV");
        f115781d = sf0Var3;
        sf0[] sf0VarArr = {sf0Var, sf0Var2, sf0Var3};
        f115782e = sf0VarArr;
        qf.a.a(sf0VarArr);
    }

    public sf0(int i10, String str) {
    }

    public static sf0 valueOf(String str) {
        return (sf0) Enum.valueOf(sf0.class, str);
    }

    public static sf0[] values() {
        return (sf0[]) f115782e.clone();
    }
}
