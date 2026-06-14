package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class j1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f64741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f64742b;

    public j1(Context context, BannerListener bannerListener, View view) {
        this.f64741a = bannerListener;
        this.f64742b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onClick() of " + this.f64741a + " with parameter " + this.f64742b;
            WeakHashMap weakHashMap = vi.f65408a;
            Log.println(3, "StartAppSDK", str);
            this.f64741a.onClick(this.f64742b);
        } catch (Throwable th2) {
            String str2 = "Calling method onClick() of " + this.f64741a + " with parameter " + this.f64742b;
            WeakHashMap weakHashMap2 = vi.f65408a;
            Log.println(5, "StartAppSDK", str2);
            vi.a((Object) this.f64741a, th2);
        }
    }
}
