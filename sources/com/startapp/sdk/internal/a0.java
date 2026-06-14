package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a0 {
    public static void a(final Context context, final AdEventListener adEventListener, final Ad ad2, boolean z10) {
        if (!z10) {
            w6.a("onLoadFailed", adEventListener != null, null, ad2 != null ? ad2.getErrorMessage() : null);
        }
        h0.a(adEventListener != null ? new Runnable() { // from class: com.startapp.sdk.internal.cl
            @Override // java.lang.Runnable
            public final void run() {
                a0.a(context, adEventListener, ad2);
            }
        } : null);
    }

    public static void b(Context context, AdEventListener adEventListener, Ad ad2, boolean z10) {
        if (!z10) {
            w6.a("onLoad", adEventListener != null, null, null);
        }
        h0.a(adEventListener != null ? new z(context, adEventListener, ad2) : null);
    }

    public static void a(Context context, AdEventListener adEventListener, Ad ad2) {
        try {
            WeakHashMap weakHashMap = vi.f65408a;
            Log.println(3, "StartAppSDK", "Calling method onFailedToReceiveAd() of " + adEventListener + " with parameter " + ad2);
            adEventListener.onFailedToReceiveAd(ad2);
        } catch (Throwable th2) {
            WeakHashMap weakHashMap2 = vi.f65408a;
            Log.println(5, "StartAppSDK", "Calling method onFailedToReceiveAd() of " + adEventListener + " with parameter " + ad2);
            vi.a((Object) adEventListener, th2);
        }
    }
}
