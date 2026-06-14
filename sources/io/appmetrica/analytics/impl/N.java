package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* JADX INFO: loaded from: classes12.dex */
public final class N implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f76147a;

    public N(@NonNull K k10) {
        this.f76147a = k10;
    }

    @Override // io.appmetrica.analytics.impl.K
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context) {
        return a(new L(this, context));
    }

    @Override // io.appmetrica.analytics.impl.K
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context, @NonNull Li li) {
        return a(new M(this, context, li));
    }

    public static AdTrackingInfoResult a(Provider provider) {
        AdTrackingInfoResult adTrackingInfoResult = (AdTrackingInfoResult) provider.get();
        AdTrackingInfo adTrackingInfo = adTrackingInfoResult.mAdTrackingInfo;
        return (adTrackingInfo == null || !"00000000-0000-0000-0000-000000000000".equals(adTrackingInfo.advId)) ? adTrackingInfoResult : new AdTrackingInfoResult(null, IdentifierStatus.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
