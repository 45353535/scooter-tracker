package com.inmobi.media;

import com.taurusx.tax.utils.webview.TaxBrowserActivity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class R5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R5 f37637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ R5[] f37638b;

    static {
        R5 r52 = new R5(TaxBrowserActivity.f66923n, 0);
        f37637a = r52;
        R5[] r5Arr = {r52, new R5("HTML", 1)};
        f37638b = r5Arr;
        qf.a.a(r5Arr);
    }

    public R5(String str, int i10) {
    }

    public static R5 valueOf(String str) {
        return (R5) Enum.valueOf(R5.class, str);
    }

    public static R5[] values() {
        return (R5[]) f37638b.clone();
    }
}
