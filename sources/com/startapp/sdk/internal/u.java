package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f65326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f65327b;

    public u(Context context, AdDisplayListener adDisplayListener, Ad ad2) {
        this.f65326a = adDisplayListener;
        this.f65327b = ad2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adHidden() of " + this.f65326a + " with parameter " + this.f65327b;
            WeakHashMap weakHashMap = vi.f65408a;
            Log.println(3, "StartAppSDK", str);
            this.f65326a.adHidden(this.f65327b);
        } catch (Throwable th2) {
            String str2 = "Failed method adHidden() of " + this.f65326a + " with parameter " + this.f65327b;
            WeakHashMap weakHashMap2 = vi.f65408a;
            Log.println(5, "StartAppSDK", str2);
            vi.a((Object) this.f65326a, th2);
        }
    }
}
