package yads;

import com.ironsource.C4240b4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h1 f111430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h1 f111431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h1 f111432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h1[] f111433f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111434b;

    static {
        h1 h1Var = new h1(0, "BROWSER", "browser");
        f111430c = h1Var;
        h1 h1Var2 = new h1(1, "WEBVIEW", C4240b4.i.K);
        f111431d = h1Var2;
        h1 h1Var3 = new h1(2, "CUSTOM", "custom");
        f111432e = h1Var3;
        h1[] h1VarArr = {h1Var, h1Var2, h1Var3};
        f111433f = h1VarArr;
        qf.a.a(h1VarArr);
    }

    public h1(int i10, String str, String str2) {
        this.f111434b = str2;
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) f111433f.clone();
    }
}
