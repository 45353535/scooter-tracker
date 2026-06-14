package io.bidmachine.ads.networks.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import io.bidmachine.iab.mraid.q;
import od.i;
import od.j;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class MraidFullScreenAd extends od.h {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private io.bidmachine.iab.mraid.f mraidInterstitial;

    @Nullable
    private m9.a mraidOMSDKAdMeasurer;

    @NonNull
    private final q mraidType;

    MraidFullScreenAd(@NonNull q qVar) {
        this.mraidType = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyMraidInterstitial() {
        io.bidmachine.iab.mraid.f fVar = this.mraidInterstitial;
        if (fVar != null) {
            fVar.n();
            this.mraidInterstitial = null;
        }
    }

    @Override // od.b
    public void onDestroy() {
        m9.a aVar = this.mraidOMSDKAdMeasurer;
        if (aVar == null) {
            destroyMraidInterstitial();
        } else {
            aVar.destroy(new Runnable() { // from class: io.bidmachine.ads.networks.mraid.MraidFullScreenAd.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MraidFullScreenAd.this.destroyMraidInterstitial();
                    } catch (Throwable th2) {
                        io.bidmachine.core.a.p(th2);
                    }
                }
            });
            this.mraidOMSDKAdMeasurer = null;
        }
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        io.bidmachine.iab.mraid.f fVar = this.mraidInterstitial;
        if (fVar == null) {
            iVar.onAdShowFailed(ae.a.i("MRAID fullscreen object is null"));
            return;
        }
        if (!fVar.q()) {
            iVar.onAdShowFailed(ae.a.i("MRAID fullscreen object is not ready"));
        } else if (this.mraidInterstitial.s()) {
            iVar.onAdShowFailed(ae.a.i("MRAID fullscreen object is already was shown"));
        } else {
            this.mraidInterstitial.w(contextProvider.getContext(), this.mraidType);
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull final i iVar, @NonNull j jVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        String strPrepareCreativeForMeasure;
        final MraidParams mraidParams = new MraidParams(kVar);
        if (mraidParams.isValid(iVar)) {
            final Context applicationContext = contextProvider.getApplicationContext();
            if (mraidParams.omsdkEnabled) {
                m9.a aVar = new m9.a();
                this.mraidOMSDKAdMeasurer = aVar;
                strPrepareCreativeForMeasure = aVar.prepareCreativeForMeasure(mraidParams.creativeAdm);
            } else {
                strPrepareCreativeForMeasure = mraidParams.creativeAdm;
            }
            final String str = strPrepareCreativeForMeasure;
            io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.ads.networks.mraid.MraidFullScreenAd.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MraidFullScreenAd.this.mraidInterstitial = io.bidmachine.iab.mraid.f.u().e(mraidParams.cacheControl).m(mraidParams.placeholderTimeoutSec).g(mraidParams.skipOffset).b(mraidParams.useNativeClose).k(new MraidFullScreenAdListener(applicationContext, iVar, MraidFullScreenAd.this.mraidOMSDKAdMeasurer)).p(mraidParams.f79422r1).q(mraidParams.f79423r2).i(mraidParams.progressDuration).n(mraidParams.storeUrl).f(mraidParams.closeableViewStyle).h(mraidParams.countDownStyle).o(mraidParams.progressStyle).c(MraidFullScreenAd.this.mraidOMSDKAdMeasurer).a(applicationContext);
                        MraidFullScreenAd.this.mraidInterstitial.t(str);
                    } catch (Throwable th2) {
                        io.bidmachine.core.a.p(th2);
                        iVar.onAdLoadFailed(ae.a.l("Exception loading MRAID fullscreen object", th2));
                    }
                }
            });
        }
    }
}
