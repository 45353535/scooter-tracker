package com.my.tracker.obfuscated;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k0 f61631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f61632b = false;

    private static k0 b(Context context) {
        x2.a("GoogleAdInfoDataProvider: get google AId");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id2 = advertisingIdInfo.getId();
            x2.a("GoogleAdInfoDataProvider: AId: " + id2);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            x2.a("GoogleAdInfoDataProvider: AId ad tracking enabled: " + zIsLimitAdTrackingEnabled);
            return new k0(id2, zIsLimitAdTrackingEnabled);
        } catch (Throwable th2) {
            x2.b("GoogleAdInfoDataProvider: failed to get google AId", th2);
            return null;
        }
    }

    public k0 a(Context context) {
        if (!this.f61632b) {
            this.f61631a = b(context);
            this.f61632b = true;
        }
        return this.f61631a;
    }
}
