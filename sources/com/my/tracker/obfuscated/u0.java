package com.my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: classes11.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t0 f61845a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f61846b = false;

    private static t0 b(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id2 = advertisingIdInfo.getId();
            x2.a("HuaweiAdInfoDataProvider: oaid: " + id2);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            x2.a("HuaweiAdInfoDataProvider: oaid tracking enabled: " + zIsLimitAdTrackingEnabled);
            return new t0(id2, zIsLimitAdTrackingEnabled);
        } catch (Throwable th2) {
            x2.b("HuaweiAdInfoDataProvider: failed to get huawei AId", th2);
            return null;
        }
    }

    public t0 a(Context context) {
        if (!this.f61846b) {
            this.f61845a = b(context);
            this.f61846b = true;
        }
        return this.f61845a;
    }
}
