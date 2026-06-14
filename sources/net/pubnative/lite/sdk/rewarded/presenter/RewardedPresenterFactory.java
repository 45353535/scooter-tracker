package net.pubnative.lite.sdk.rewarded.presenter;

import android.content.Context;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter;
import net.pubnative.lite.sdk.utils.AdTracker;
import net.pubnative.lite.sdk.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class RewardedPresenterFactory {
    private static final String TAG = "RewardedPresenterFactory";
    private final Context mContext;
    private final String mZoneId;

    public RewardedPresenterFactory(Context context, String str) {
        this.mContext = context;
        this.mZoneId = str;
    }

    public RewardedPresenter createRewardedPresenter(Ad ad2, RewardedPresenter.Listener listener, IntegrationType integrationType) {
        RewardedPresenter rewardedPresenterFromCreativeType = fromCreativeType(ad2.assetgroupid, ad2, integrationType);
        if (rewardedPresenterFromCreativeType == null) {
            return null;
        }
        RewardedPresenterDecorator rewardedPresenterDecorator = new RewardedPresenterDecorator(rewardedPresenterFromCreativeType, new AdTracker(ad2.getBeacons("impression"), ad2.getBeacons("click"), ad2.getBeacons(Ad.Beacon.SDK_EVENT), ad2.getBeacons(Ad.Beacon.COMPANION_AD_EVENT), ad2.getBeacons(Ad.Beacon.CUSTOM_ENDCARD_EVENT)), new AdTracker(ad2.getBeacons("custom_endcard_impression"), ad2.getBeacons("custom_endcard_click")), HyBid.getReportingController(), listener, integrationType);
        rewardedPresenterFromCreativeType.setListener(rewardedPresenterDecorator);
        rewardedPresenterFromCreativeType.setCustomEndCardListener(rewardedPresenterDecorator);
        return rewardedPresenterDecorator;
    }

    RewardedPresenter fromCreativeType(int i10, Ad ad2, IntegrationType integrationType) {
        if (i10 == 15) {
            return new VastRewardedPresenter(this.mContext, ad2, this.mZoneId, integrationType);
        }
        if (i10 != 27 && i10 != 29) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    Logger.e(TAG, "Incompatible asset group type: " + i10 + ", for rewarded ad format.");
                    return null;
            }
        }
        return new MraidRewardedPresenter(this.mContext, ad2, this.mZoneId);
    }
}
