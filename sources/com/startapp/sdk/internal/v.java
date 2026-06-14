package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f65361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f65362b;

    public v(Context context, AdDisplayListener adDisplayListener, Ad ad2) {
        this.f65361a = adDisplayListener;
        this.f65362b = ad2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adDisplayed() of " + this.f65361a + " with parameter " + this.f65362b;
            WeakHashMap weakHashMap = vi.f65408a;
            Log.println(3, "StartAppSDK", str);
            this.f65361a.adDisplayed(this.f65362b);
        } catch (Throwable th2) {
            String str2 = "Failed method adDisplayed() of " + this.f65361a + " with parameter " + this.f65362b;
            WeakHashMap weakHashMap2 = vi.f65408a;
            Log.println(5, "StartAppSDK", str2);
            vi.a((Object) this.f65361a, th2);
        }
    }
}
