package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f65494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f65495b;

    public x(Context context, AdDisplayListener adDisplayListener, Ad ad2) {
        this.f65494a = adDisplayListener;
        this.f65495b = ad2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adNotDisplayed() of " + this.f65494a + " with parameter " + this.f65495b;
            WeakHashMap weakHashMap = vi.f65408a;
            Log.println(3, "StartAppSDK", str);
            this.f65494a.adNotDisplayed(this.f65495b);
        } catch (Throwable th2) {
            String str2 = "Failed method adNotDisplayed() of " + this.f65494a + " with parameter " + this.f65495b;
            WeakHashMap weakHashMap2 = vi.f65408a;
            Log.println(5, "StartAppSDK", str2);
            vi.a((Object) this.f65494a, th2);
        }
    }
}
