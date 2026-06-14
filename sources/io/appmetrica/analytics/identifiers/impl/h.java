package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements b {
    @Override // io.appmetrica.analytics.identifiers.impl.b
    @NotNull
    public final c a(@NotNull Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            return new c(IdentifierStatus.OK, new a("google", advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled())), null, 4);
        } catch (GooglePlayServicesNotAvailableException unused) {
            return new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, "could not resolve google services", 2);
        } catch (Throwable th2) {
            return new c(IdentifierStatus.UNKNOWN, null, "exception while fetching google adv_id: " + th2.getMessage(), 2);
        }
    }
}
