package yads;

import com.ironsource.C4240b4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class dm1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dm1 f109974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dm1 f109975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final dm1 f109976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final dm1 f109977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final dm1 f109978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ dm1[] f109979h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109980b;

    static {
        dm1 dm1Var = new dm1(0, "WEB_VIEW", C4240b4.i.K);
        f109974c = dm1Var;
        dm1 dm1Var2 = new dm1(1, "VIDEO", "video");
        f109975d = dm1Var2;
        dm1 dm1Var3 = new dm1(2, "MULTIBANNER", "multibanner");
        f109976e = dm1Var3;
        dm1 dm1Var4 = new dm1(3, "IMAGE", "image");
        f109977f = dm1Var4;
        dm1 dm1Var5 = new dm1(4, "MEDIATION", "mediation");
        f109978g = dm1Var5;
        dm1[] dm1VarArr = {dm1Var, dm1Var2, dm1Var3, dm1Var4, dm1Var5};
        f109979h = dm1VarArr;
        qf.a.a(dm1VarArr);
    }

    public dm1(int i10, String str, String str2) {
        this.f109980b = str2;
    }

    public static dm1 valueOf(String str) {
        return (dm1) Enum.valueOf(dm1.class, str);
    }

    public static dm1[] values() {
        return (dm1[]) f109979h.clone();
    }
}
