package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FullScreenAdRequestParameters extends AdRequestParameters {
    @Deprecated(since = "3.5.0")
    public FullScreenAdRequestParameters(@NonNull AdsFormat adsFormat, @NonNull AdContentType adContentType) {
        this(new AdPlacementConfig.Builder(adsFormat.toAdFormat(adContentType)).build());
    }

    private boolean isParametersMatchedInternal(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        return isContentTypeMatch(fullScreenAdRequestParameters.getAdContentType());
    }

    @NonNull
    public AdContentType getAdContentType() {
        AdFormat adFormat = getAdPlacementConfig().getAdFormat();
        return adFormat instanceof AdFormat.Interstitial ? ((AdFormat.Interstitial) adFormat).getAdContentType() : adFormat instanceof AdFormat.Rewarded ? ((AdFormat.Rewarded) adFormat).getAdContentType() : AdContentType.All;
    }

    public boolean isContentTypeMatch(@NonNull AdContentType adContentType) {
        AdContentType adContentType2 = getAdContentType();
        return adContentType2 == AdContentType.All || adContentType2 == adContentType;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(@NonNull AdRequestParameters adRequestParameters) {
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof FullScreenAdRequestParameters) && isParametersMatchedInternal((FullScreenAdRequestParameters) adRequestParameters);
    }

    protected FullScreenAdRequestParameters(@NonNull AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
    }
}
