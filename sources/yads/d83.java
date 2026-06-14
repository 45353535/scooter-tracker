package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d83 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d83 f109836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d83 f109837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d83[] f109838d;

    static {
        d83 d83Var = new d83(0, "AD");
        f109836b = d83Var;
        d83 d83Var2 = new d83(1, "PASSBACK");
        f109837c = d83Var2;
        d83[] d83VarArr = {d83Var, d83Var2};
        f109838d = d83VarArr;
        qf.a.a(d83VarArr);
    }

    public d83(int i10, String str) {
    }

    public static d83 valueOf(String str) {
        return (d83) Enum.valueOf(d83.class, str);
    }

    public static d83[] values() {
        return (d83[]) f109838d.clone();
    }
}
