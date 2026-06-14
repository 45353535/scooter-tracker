package net.pubnative.lite.sdk.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import net.pubnative.lite.sdk.api.BannerRequestManager;
import net.pubnative.lite.sdk.api.OpenRTBApiClient;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.models.OpenRTBAdRequestFactory;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidBannerAdView extends HyBidAdView {
    public HyBidBannerAdView(Context context) {
        super(context);
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView
    protected String getLogTag() {
        return HyBidBannerAdView.class.getSimpleName();
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView
    RequestManager getORTBRequestManager() {
        return new BannerRequestManager(new OpenRTBApiClient(getContext()), new OpenRTBAdRequestFactory());
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView
    RequestManager getRequestManager() {
        return new BannerRequestManager();
    }

    public HyBidBannerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HyBidBannerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @TargetApi(21)
    public HyBidBannerAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
