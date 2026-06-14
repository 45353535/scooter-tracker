package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f65628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f65629b;

    public z(Context context, AdEventListener adEventListener, Ad ad2) {
        this.f65628a = adEventListener;
        this.f65629b = ad2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onReceiveAd() of " + this.f65628a + " with parameter " + this.f65629b;
            WeakHashMap weakHashMap = vi.f65408a;
            Log.println(3, "StartAppSDK", str);
            this.f65628a.onReceiveAd(this.f65629b);
        } catch (Throwable th2) {
            String str2 = "Failed method onReceiveAd() of " + this.f65628a + " with parameter " + this.f65629b;
            WeakHashMap weakHashMap2 = vi.f65408a;
            Log.println(5, "StartAppSDK", str2);
            vi.a((Object) this.f65628a, th2);
        }
    }
}
