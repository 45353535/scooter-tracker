package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f22 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f22 f110586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f22 f110587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f22[] f110588e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110589b;

    static {
        f22 f22Var = new f22(0, "LoadingOnShow", "loading_on_show");
        f110586c = f22Var;
        f22 f22Var2 = new f22(1, "LoadingOnBack", "loading_on_back");
        f110587d = f22Var2;
        f22[] f22VarArr = {f22Var, f22Var2};
        f110588e = f22VarArr;
        qf.a.a(f22VarArr);
    }

    public f22(int i10, String str, String str2) {
        this.f110589b = str2;
    }

    public static f22 valueOf(String str) {
        return (f22) Enum.valueOf(f22.class, str);
    }

    public static f22[] values() {
        return (f22[]) f110588e.clone();
    }

    public final String a() {
        return this.f110589b;
    }
}
