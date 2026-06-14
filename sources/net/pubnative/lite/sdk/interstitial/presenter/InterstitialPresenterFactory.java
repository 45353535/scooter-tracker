package net.pubnative.lite.sdk.interstitial.presenter;

import android.content.Context;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenter;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.models.SkipOffset;
import net.pubnative.lite.sdk.utils.AdEndCardManager;
import net.pubnative.lite.sdk.utils.AdTracker;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.SkipOffsetManager;

/* JADX INFO: loaded from: classes3.dex */
public class InterstitialPresenterFactory {
    private static final String TAG = "InterstitialPresenterFactory";
    private final Context mContext;
    private final String mZoneId;

    public InterstitialPresenterFactory(Context context, String str) {
        this.mContext = context;
        this.mZoneId = str;
    }

    public InterstitialPresenter createInterstitialPresenter(Ad ad2, InterstitialPresenter.Listener listener, IntegrationType integrationType) {
        return createInterstitialPresenter(ad2, new SkipOffset(SkipOffsetManager.getDefaultHtmlInterstitialSkipOffset().intValue(), false), new SkipOffset((ad2.hasEndCard() ? SkipOffsetManager.getDefaultVideoWithEndCardSkipOffset() : SkipOffsetManager.getDefaultVideoWithoutEndCardSkipOffset()).intValue(), false), listener, integrationType);
    }

    InterstitialPresenter fromCreativeType(int i10, Ad ad2, SkipOffset skipOffset, SkipOffset skipOffset2, IntegrationType integrationType) {
        if (i10 == 15) {
            int offset = skipOffset2.getOffset();
            if (!skipOffset2.isCustom()) {
                offset = (ad2.hasEndCard() && AdEndCardManager.isEndCardEnabled(ad2).booleanValue()) ? SkipOffsetManager.getDefaultVideoWithEndCardSkipOffset().intValue() : SkipOffsetManager.getDefaultVideoWithoutEndCardSkipOffset().intValue();
            }
            return new VastInterstitialPresenter(this.mContext, ad2, this.mZoneId, offset, integrationType);
        }
        if (i10 != 27 && i10 != 29) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    Logger.e(TAG, "Incompatible asset group type: " + i10 + ", for interstitial ad format.");
                    return null;
            }
        }
        return new MraidInterstitialPresenter(this.mContext, ad2, this.mZoneId, Integer.valueOf(skipOffset.getOffset()));
    }

    public InterstitialPresenter createInterstitialPresenter(Ad ad2, SkipOffset skipOffset, SkipOffset skipOffset2, InterstitialPresenter.Listener listener, IntegrationType integrationType) {
        InterstitialPresenter interstitialPresenterFromCreativeType = fromCreativeType(ad2.assetgroupid, ad2, skipOffset, skipOffset2, integrationType);
        if (interstitialPresenterFromCreativeType == null) {
            return null;
        }
        InterstitialPresenterDecorator interstitialPresenterDecorator = new InterstitialPresenterDecorator(interstitialPresenterFromCreativeType, new AdTracker(ad2.getBeacons("impression"), ad2.getBeacons("click"), ad2.getBeacons(Ad.Beacon.SDK_EVENT), ad2.getBeacons(Ad.Beacon.COMPANION_AD_EVENT), ad2.getBeacons(Ad.Beacon.CUSTOM_ENDCARD_EVENT)), new AdTracker(ad2.getBeacons("custom_endcard_impression"), ad2.getBeacons("custom_endcard_click")), HyBid.getReportingController(), listener, integrationType);
        interstitialPresenterFromCreativeType.setListener(interstitialPresenterDecorator);
        interstitialPresenterFromCreativeType.setVideoListener(interstitialPresenterDecorator);
        interstitialPresenterFromCreativeType.setCustomEndCardListener(interstitialPresenterDecorator);
        return interstitialPresenterDecorator;
    }
}
