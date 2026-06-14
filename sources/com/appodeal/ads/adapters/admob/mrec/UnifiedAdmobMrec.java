package com.appodeal.ads.adapters.admob.mrec;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobAdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UnifiedAdmobMrec<AdViewType extends BaseAdView, AdRequestType extends AdRequest> extends UnifiedMrec<UnifiedAdmobAdUnitParams<AdRequestType>> {

    @Nullable
    private AdViewType adView;

    @NonNull
    public abstract AdViewType createAdView(@NonNull Context context);

    @NonNull
    public AdListener createListener(AdViewType adviewtype, UnifiedMrecCallback unifiedMrecCallback) {
        return new a(adviewtype, unifiedMrecCallback);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public void onDestroy() {
        AdViewType adviewtype = this.adView;
        if (adviewtype != null) {
            adviewtype.destroy();
            this.adView = null;
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedMrecParams unifiedMrecParams, @NonNull UnifiedAdmobAdUnitParams<AdRequestType> unifiedAdmobAdUnitParams, @NonNull UnifiedMrecCallback unifiedMrecCallback) {
        Context resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            resumedActivity = contextProvider.getApplicationContext();
        }
        AdViewType adviewtype = (AdViewType) createAdView(resumedActivity);
        this.adView = adviewtype;
        adviewtype.setAdUnitId(unifiedAdmobAdUnitParams.getKey());
        this.adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
        AdViewType adviewtype2 = this.adView;
        adviewtype2.setAdListener(createListener(adviewtype2, unifiedMrecCallback));
        this.adView.loadAd(unifiedAdmobAdUnitParams.getRequest());
    }
}
