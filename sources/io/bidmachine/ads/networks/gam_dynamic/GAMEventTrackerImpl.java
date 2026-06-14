package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;

/* JADX INFO: loaded from: classes12.dex */
class GAMEventTrackerImpl extends nd.e implements GAMEventTracker {
    GAMEventTrackerImpl(@NonNull AdExtension.EventConfiguration eventConfiguration) {
        super(eventConfiguration);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMEventTracker
    public void trackEvent(@NonNull TrackEventType trackEventType, @NonNull AdsFormat adsFormat, @NonNull nd.a aVar, @Nullable ae.a aVar2) {
        trackEvent(new nd.i(), trackEventType, null, adsFormat.getAdsType(), aVar2, aVar);
    }
}
