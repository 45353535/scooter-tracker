package com.pubmatic.sdk.openwrap.banner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.openwrap.core.POBBid;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class POBDefaultBannerEventHandler extends POBBannerEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBAdSize[] f62730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBBannerEventListener f62731b;

    public POBDefaultBannerEventHandler(@NonNull POBAdSize... pOBAdSizeArr) {
        this.f62730a = pOBAdSizeArr;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void destroy() {
        this.f62731b = null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void requestAd(@Nullable POBBid pOBBid) {
        if (this.f62731b != null) {
            if (pOBBid != null && pOBBid.getStatus() == 1) {
                this.f62731b.onOpenWrapPartnerWin(pOBBid.getId());
            } else {
                this.f62731b.onFailed(prepareErrorFromResponse(this.f62731b.getBidsProvider()));
            }
        }
    }

    @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEvent
    @Nullable
    public POBAdSize[] requestedAdSizes() {
        POBAdSize[] pOBAdSizeArr = this.f62730a;
        if (pOBAdSizeArr != null) {
            return (POBAdSize[]) Arrays.copyOf(pOBAdSizeArr, pOBAdSizeArr.length);
        }
        return null;
    }

    @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEvent
    public void setEventListener(@NonNull POBBannerEventListener pOBBannerEventListener) {
        this.f62731b = pOBBannerEventListener;
    }

    public POBDefaultBannerEventHandler() {
    }
}
