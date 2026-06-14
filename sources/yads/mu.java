package yads;

import com.ironsource.C4240b4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class mu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final lu f113605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mu f113606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ mu[] f113607e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113608b;

    static {
        mu muVar = new mu(0, "BROWSER", "browser");
        mu muVar2 = new mu(1, "WEBVIEW", C4240b4.i.K);
        f113606d = muVar2;
        mu[] muVarArr = {muVar, muVar2};
        f113607e = muVarArr;
        qf.a.a(muVarArr);
        f113605c = new lu();
    }

    public mu(int i10, String str, String str2) {
        this.f113608b = str2;
    }

    public static mu valueOf(String str) {
        return (mu) Enum.valueOf(mu.class, str);
    }

    public static mu[] values() {
        return (mu[]) f113607e.clone();
    }
}
