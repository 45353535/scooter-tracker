package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y {
    public static void a(Context context, AdDisplayListener adDisplayListener, Ad ad2) {
        w6.a("adNotDisplayed", adDisplayListener != null, null, ad2 != null ? ad2.getErrorMessage() : null);
        h0.a(adDisplayListener != null ? new x(context, adDisplayListener, ad2) : null);
    }
}
