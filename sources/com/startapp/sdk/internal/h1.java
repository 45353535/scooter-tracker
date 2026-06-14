package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f64594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerBase f64595b;

    public h1(Context context, BannerListener bannerListener, BannerBase bannerBase) {
        this.f64594a = bannerListener;
        this.f64595b = bannerBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onFailedToReceiveAd() of " + this.f64594a + " with parameter " + this.f64595b;
            WeakHashMap weakHashMap = vi.f65408a;
            Log.println(3, "StartAppSDK", str);
            this.f64594a.onFailedToReceiveAd(this.f64595b);
        } catch (Throwable th2) {
            String str2 = "Failed method onFailedToReceiveAd() of " + this.f64594a + " with parameter " + this.f64595b;
            WeakHashMap weakHashMap2 = vi.f65408a;
            Log.println(5, "StartAppSDK", str2);
            vi.a((Object) this.f64594a, th2);
        }
    }
}
