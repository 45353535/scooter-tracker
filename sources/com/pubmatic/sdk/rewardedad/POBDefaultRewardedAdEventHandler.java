package com.pubmatic.sdk.rewardedad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.openwrap.core.POBBid;
import com.pubmatic.sdk.openwrap.core.POBReward;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class POBDefaultRewardedAdEventHandler extends POBRewardedAdEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBRewardedAdEventListener f62946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBBid f62947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f62948c;

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void destroy() {
        this.f62947b = null;
        this.f62946a = null;
        this.f62948c = null;
    }

    @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEvent
    @Nullable
    public Map<String, String> getAdServerConfig() {
        HashMap map = new HashMap(1);
        map.put(POBRewardedAdEvent.KEY_ALLOW_MULTIPLE_INSTANCES_FOR_ADUNIT_ID, "true");
        return map;
    }

    @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEvent
    @Nullable
    public List<POBReward> getAdServerRewards() {
        POBBid pOBBid = this.f62947b;
        if (pOBBid != null) {
            return pOBBid.getAllRewards();
        }
        return null;
    }

    @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEvent
    @Nullable
    public POBReward getSelectedReward() {
        POBBid pOBBid = this.f62947b;
        POBReward firstReward = pOBBid != null ? pOBBid.getFirstReward() : null;
        Map map = this.f62948c;
        if (map != null) {
            Object obj = map.get(OpenWrapSDK.KEY_SELECTED_REWARD);
            List<POBReward> adServerRewards = getAdServerRewards();
            if (adServerRewards != null && obj != null) {
                Iterator<POBReward> it = adServerRewards.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(obj)) {
                        return (POBReward) obj;
                    }
                }
            }
        }
        return firstReward;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void requestAd(@Nullable POBBid pOBBid) {
        this.f62948c = null;
        if (this.f62946a != null) {
            if (pOBBid != null && pOBBid.getStatus() == 1) {
                this.f62947b = pOBBid;
                this.f62946a.onOpenWrapPartnerWin(pOBBid.getId());
            } else {
                this.f62947b = null;
                this.f62946a.onFailedToLoad(prepareErrorFromResponse(this.f62946a.getBidsProvider()));
            }
        }
    }

    @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEvent
    public void setCustomData(@Nullable Map<String, Object> map) {
        this.f62948c = map;
    }

    @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEvent
    public void setEventListener(@NonNull POBRewardedAdEventListener pOBRewardedAdEventListener) {
        this.f62946a = pOBRewardedAdEventListener;
    }
}
