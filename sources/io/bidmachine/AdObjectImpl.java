package io.bidmachine;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdRequest;
import java.util.Map;
import od.b;
import od.c;
import od.d;
import zb.b;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AdObjectImpl<AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectParamsType extends zb.b, UnifiedAdType extends od.b, UnifiedAdCallbackType extends od.c, UnifiedAdRequestParamsType extends od.d> implements zb.a {

    @NonNull
    private final AdObjectParamsType adObjectParams;

    @NonNull
    private final AdRequestType adRequest;

    @NonNull
    private final ContextProvider contextProvider;

    @NonNull
    private final AdProcessCallback processCallback;

    @NonNull
    private final UnifiedAdType unifiedAd;

    @NonNull
    private final UnifiedAdCallbackType unifiedAdCallback;

    /* JADX INFO: Access modifiers changed from: protected */
    public static class BaseUnifiedAdCallback implements od.c {

        @NonNull
        protected final AdProcessCallback processCallback;

        public BaseUnifiedAdCallback(@NonNull AdProcessCallback adProcessCallback) {
            this.processCallback = adProcessCallback;
        }

        @Override // od.c
        public void onAdClicked() {
            this.processCallback.processClicked();
        }

        @Override // od.c
        public void onAdExpired() {
            this.processCallback.processExpired();
        }

        @Override // od.c
        public void onAdLoadFailed(@NonNull ae.a aVar) {
            this.processCallback.processLoadFail(aVar);
        }

        @Override // od.c
        public void onAdShowFailed(@NonNull ae.a aVar) {
            this.processCallback.processShowFail(aVar);
        }

        @Override // od.c
        public void onAdShown() {
            this.processCallback.processShown();
        }

        @Override // od.c
        public void onBrokenCreativeEvent(@Nullable Map<String, Object> map) {
            this.processCallback.onBrokenCreativeEvent(map);
        }

        @Override // od.c
        public void setVisibilitySource(@NonNull io.bidmachine.core.k kVar) {
            this.processCallback.setVisibilitySource(kVar);
        }
    }

    public AdObjectImpl(@NonNull ContextProvider contextProvider, @NonNull AdProcessCallback adProcessCallback, @NonNull AdRequestType adrequesttype, @NonNull AdObjectParamsType adobjectparamstype, @NonNull UnifiedAdType unifiedadtype) {
        this.contextProvider = contextProvider;
        this.processCallback = adProcessCallback;
        this.adRequest = adrequesttype;
        this.adObjectParams = adobjectparamstype;
        this.unifiedAd = unifiedadtype;
        this.unifiedAdCallback = (UnifiedAdCallbackType) createUnifiedCallback(adProcessCallback);
    }

    @NonNull
    public abstract /* synthetic */ od.c createUnifiedCallback(@NonNull AdProcessCallback adProcessCallback);

    @Nullable
    public Activity getActivity() {
        return this.contextProvider.getActivity();
    }

    @NonNull
    public AdRequestType getAdRequest() {
        return this.adRequest;
    }

    @NonNull
    public Context getApplicationContext() {
        return this.contextProvider.getApplicationContext();
    }

    @Override // zb.a
    @Nullable
    public Map<String, Object> getCustomParams() {
        return getUnifiedAd().getCustomParams();
    }

    @Override // zb.a
    @NonNull
    public AdObjectParamsType getParams() {
        return this.adObjectParams;
    }

    @NonNull
    public AdProcessCallback getProcessCallback() {
        return this.processCallback;
    }

    @NonNull
    public UnifiedAdType getUnifiedAd() {
        return this.unifiedAd;
    }

    @NonNull
    public UnifiedAdCallbackType getUnifiedAdCallback() {
        return this.unifiedAdCallback;
    }

    @Override // zb.a
    public void hide() {
    }

    @Override // zb.a
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        this.unifiedAd.load(contextProvider, this.unifiedAdCallback, unifiedadrequestparamstype, this.adObjectParams.d(), networkAdUnit);
    }

    @Override // zb.a
    @CallSuper
    public void onClicked() {
        getUnifiedAd().onClicked();
    }

    @Override // zb.a
    @CallSuper
    public void onClosed(boolean z10) {
        od.b unifiedAd = getUnifiedAd();
        if (unifiedAd instanceof od.h) {
            ((od.h) unifiedAd).onClosed(z10);
        }
    }

    @Override // zb.a
    @CallSuper
    public void onDestroy() {
        getUnifiedAd().onDestroy();
    }

    @Override // zb.a
    public void onExpired() {
        getUnifiedAd().onExpired();
    }

    @Override // zb.a
    @CallSuper
    public void onFinished() {
        od.b unifiedAd = getUnifiedAd();
        if (unifiedAd instanceof od.h) {
            ((od.h) unifiedAd).onFinished();
        }
    }

    @Override // zb.a
    @CallSuper
    public void onImpression() {
        getUnifiedAd().onImpression();
    }

    @Override // zb.a
    @CallSuper
    public void onShowFailed() {
        getUnifiedAd().onShowFailed();
    }

    @Override // zb.a
    @CallSuper
    public void onShown() {
        getUnifiedAd().onShown();
    }
}
