package net.pubnative.lite.sdk.presenter;

import android.content.Context;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.models.ImpressionTrackingMethod;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.utils.AdTracker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PresenterFactory {
    private final Context mContext;
    protected final IntegrationType mIntegrationType;

    public PresenterFactory(Context context, IntegrationType integrationType) {
        this.mContext = context;
        this.mIntegrationType = integrationType;
    }

    public AdPresenter createPresenter(Ad ad2, AdSize adSize, AdPresenter.Listener listener) {
        return createPresenter(ad2, adSize, listener, null);
    }

    protected abstract AdPresenter fromCreativeType(int i10, Ad ad2, AdSize adSize);

    protected abstract AdPresenter fromCreativeType(int i10, Ad ad2, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod);

    protected Context getContext() {
        return this.mContext;
    }

    public AdPresenter createPresenter(Ad ad2, AdSize adSize, AdPresenter.Listener listener, AdPresenter.ImpressionListener impressionListener) {
        return createPresenter(ad2, null, adSize, ImpressionTrackingMethod.AD_VIEWABLE, listener, impressionListener);
    }

    public AdPresenter createPresenter(Ad ad2, AdTracker adTracker, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod, AdPresenter.Listener listener, AdPresenter.ImpressionListener impressionListener) {
        AdPresenter adPresenterFromCreativeType;
        if (ad2 == null || (adPresenterFromCreativeType = fromCreativeType(ad2.assetgroupid, ad2, adSize, impressionTrackingMethod)) == null) {
            return null;
        }
        AdPresenterDecorator adPresenterDecorator = new AdPresenterDecorator(adPresenterFromCreativeType, adTracker != null ? adTracker : new AdTracker(ad2.getBeacons("impression"), ad2.getBeacons("click"), ad2.getBeacons(Ad.Beacon.SDK_EVENT), ad2.getBeacons(Ad.Beacon.COMPANION_AD_EVENT), ad2.getBeacons(Ad.Beacon.CUSTOM_ENDCARD_EVENT)), HyBid.getReportingController(), listener, impressionListener, this.mIntegrationType);
        adPresenterFromCreativeType.setListener(adPresenterDecorator);
        adPresenterFromCreativeType.setImpressionListener(adPresenterDecorator);
        adPresenterFromCreativeType.setVideoListener(adPresenterDecorator);
        adPresenterFromCreativeType.setMRaidListener(adPresenterDecorator);
        return adPresenterDecorator;
    }
}
