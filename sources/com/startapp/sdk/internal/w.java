package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f65417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f65418b;

    public w(Context context, AdDisplayListener adDisplayListener, Ad ad2) {
        this.f65417a = adDisplayListener;
        this.f65418b = ad2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adClicked() of " + this.f65417a + " with parameter " + this.f65418b;
            WeakHashMap weakHashMap = vi.f65408a;
            Log.println(3, "StartAppSDK", str);
            this.f65417a.adClicked(this.f65418b);
        } catch (Throwable th2) {
            String str2 = "Failed method adClicked() of " + this.f65417a + " with parameter " + this.f65418b;
            WeakHashMap weakHashMap2 = vi.f65408a;
            Log.println(5, "StartAppSDK", str2);
            vi.a((Object) this.f65417a, th2);
        }
    }
}
