package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;

/* JADX INFO: loaded from: classes12.dex */
interface GAMEventTracker extends nd.b {
    void trackEvent(@NonNull TrackEventType trackEventType, @NonNull AdsFormat adsFormat, @NonNull nd.a aVar, @Nullable ae.a aVar2);

    @Override // nd.b
    /* synthetic */ void trackEvent(@NonNull nd.l lVar, @NonNull TrackEventType trackEventType, @Nullable nd.j jVar, @Nullable AdsType adsType, @Nullable ae.a aVar, @Nullable nd.a aVar2);
}
