package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class k1 {
    public static void a(Context context, BannerListener bannerListener, View view) {
        try {
            WeakHashMap weakHashMap = vi.f65408a;
            Log.println(3, "StartAppSDK", "Calling method onReceiveAd() of " + bannerListener + " with parameter " + view);
            bannerListener.onReceiveAd(view);
        } catch (Throwable th2) {
            WeakHashMap weakHashMap2 = vi.f65408a;
            Log.println(5, "StartAppSDK", "Failed method onReceiveAd() of " + bannerListener + " with parameter " + view);
            vi.a((Object) bannerListener, th2);
        }
    }

    public static void b(final Context context, final BannerListener bannerListener, final View view, String str) {
        w6.a("onLoad", bannerListener != null, str, null);
        h0.a(bannerListener != null ? new Runnable() { // from class: com.startapp.sdk.internal.hm
            @Override // java.lang.Runnable
            public final void run() {
                k1.a(context, bannerListener, view);
            }
        } : null);
    }

    public static void a(Context context, BannerListener bannerListener, BannerBase bannerBase, String str) {
        w6.a("onLoadFailed", bannerListener != null, str, null);
        h0.a(bannerListener != null ? new h1(context, bannerListener, bannerBase) : null);
    }

    public static void a(Context context, BannerListener bannerListener, View view, String str) {
        w6.a("onClicked", bannerListener != null, str, null);
        h0.a(bannerListener != null ? new j1(context, bannerListener, view) : null);
    }
}
