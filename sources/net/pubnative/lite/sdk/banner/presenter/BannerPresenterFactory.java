package net.pubnative.lite.sdk.banner.presenter;

import android.content.Context;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.models.ImpressionTrackingMethod;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.presenter.PresenterFactory;
import net.pubnative.lite.sdk.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class BannerPresenterFactory extends PresenterFactory {
    private static final String TAG = "BannerPresenterFactory";

    public BannerPresenterFactory(Context context, IntegrationType integrationType) {
        super(context, integrationType);
    }

    @Override // net.pubnative.lite.sdk.presenter.PresenterFactory
    public AdPresenter fromCreativeType(int i10, Ad ad2, AdSize adSize) {
        return fromCreativeType(i10, ad2, adSize, ImpressionTrackingMethod.AD_VIEWABLE);
    }

    @Override // net.pubnative.lite.sdk.presenter.PresenterFactory
    protected AdPresenter fromCreativeType(int i10, Ad ad2, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod) {
        if (ad2 != null && ad2.getImpressionTrackingMethod() != null && ImpressionTrackingMethod.fromString(ad2.getImpressionTrackingMethod()) != null) {
            impressionTrackingMethod = ImpressionTrackingMethod.fromString(ad2.getImpressionTrackingMethod());
        }
        ImpressionTrackingMethod impressionTrackingMethod2 = impressionTrackingMethod;
        if (i10 == 4) {
            return new VastAdPresenter(getContext(), ad2, adSize, impressionTrackingMethod2, this.mIntegrationType);
        }
        if (i10 != 8 && i10 != 10 && i10 != 12) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    Logger.e(TAG, "Incompatible asset group type: " + i10 + ", for banner ad format.");
                    return null;
            }
        }
        return new MraidAdPresenter(getContext(), ad2, adSize, impressionTrackingMethod2);
    }
}
