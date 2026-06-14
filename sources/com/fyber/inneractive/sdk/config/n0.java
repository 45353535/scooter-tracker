package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n0 {
    public static void a(Context context, w wVar) {
        boolean zIsLimitAdTrackingEnabled;
        String id2 = null;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            try {
                IAlog.e("limit ad tracking: %s", Boolean.valueOf(zIsLimitAdTrackingEnabled));
                if (zIsLimitAdTrackingEnabled) {
                    IAlog.e("user has opt out of Ads Personalization. not accessing Advertising ID.", new Object[0]);
                } else {
                    id2 = advertisingIdInfo.getId();
                    IAlog.e("advertising id: %s", id2);
                }
            } catch (Throwable th2) {
                th = th2;
                IAlog.e("Handled Exception:", new Object[0]);
                IAlog.e(com.fyber.inneractive.sdk.util.v.b(th), new Object[0]);
                IAlog.c("Advertising ID is not available. Please add Google Play Services library to improve your ad targeting.", new Object[0]);
            }
        } catch (Throwable th3) {
            th = th3;
            zIsLimitAdTrackingEnabled = false;
        }
        synchronized (wVar) {
            v vVar = wVar.f20508b;
            vVar.f20504a = id2;
            vVar.f20505b = zIsLimitAdTrackingEnabled;
            vVar.f20506c = false;
        }
    }
}
