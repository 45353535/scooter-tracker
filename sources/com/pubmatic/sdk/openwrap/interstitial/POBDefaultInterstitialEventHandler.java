package com.pubmatic.sdk.openwrap.interstitial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.openwrap.core.POBBid;

/* JADX INFO: loaded from: classes11.dex */
public class POBDefaultInterstitialEventHandler extends POBInterstitialEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBInterstitialEventListener f62917a;

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void destroy() {
        this.f62917a = null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void requestAd(@Nullable POBBid pOBBid) {
        if (this.f62917a != null) {
            if (pOBBid != null && pOBBid.getStatus() == 1) {
                this.f62917a.onOpenWrapPartnerWin(pOBBid.getId());
            } else {
                this.f62917a.onFailedToLoad(prepareErrorFromResponse(this.f62917a.getBidsProvider()));
            }
        }
    }

    @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEvent
    public void setEventListener(@NonNull POBInterstitialEventListener pOBInterstitialEventListener) {
        this.f62917a = pOBInterstitialEventListener;
    }
}
