package yads;

import androidx.core.app.NotificationCompat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class xn2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xn2 f117913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xn2 f117914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xn2 f117915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ xn2[] f117916f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117917b;

    static {
        xn2 xn2Var = new xn2(0, "CONTENT", "content");
        f117913c = xn2Var;
        xn2 xn2Var2 = new xn2(1, "APP_INSTALL", "app");
        f117914d = xn2Var2;
        xn2 xn2Var3 = new xn2(2, "IMAGE", "image");
        xn2 xn2Var4 = new xn2(3, "PROMO", NotificationCompat.CATEGORY_PROMO);
        xn2 xn2Var5 = new xn2(4, "PRODUCT_PROMO", "productPromo");
        f117915e = xn2Var5;
        xn2[] xn2VarArr = {xn2Var, xn2Var2, xn2Var3, xn2Var4, xn2Var5};
        f117916f = xn2VarArr;
        qf.a.a(xn2VarArr);
    }

    public xn2(int i10, String str, String str2) {
        this.f117917b = str2;
    }

    public static xn2 valueOf(String str) {
        return (xn2) Enum.valueOf(xn2.class, str);
    }

    public static xn2[] values() {
        return (xn2[]) f117916f.clone();
    }
}
