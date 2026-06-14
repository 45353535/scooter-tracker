package io.bidmachine.ads.networks.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import io.bidmachine.iab.mraid.s;
import java.util.concurrent.atomic.AtomicBoolean;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class MraidBannerAd extends od.e {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @NonNull
    private final AtomicBoolean isPrepareToShowExecuted = new AtomicBoolean(false);

    @Nullable
    private m9.a mraidOMSDKAdMeasurer;

    @Nullable
    @VisibleForTesting
    s mraidView;

    MraidBannerAd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyMraidView() {
        s sVar = this.mraidView;
        if (sVar != null) {
            sVar.W();
            this.mraidView = null;
        }
    }

    @Override // od.b
    public void onDestroy() {
        m9.a aVar = this.mraidOMSDKAdMeasurer;
        if (aVar == null) {
            destroyMraidView();
        } else {
            aVar.destroy(new Runnable() { // from class: io.bidmachine.ads.networks.mraid.MraidBannerAd.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MraidBannerAd.this.destroyMraidView();
                    } catch (Throwable th2) {
                        io.bidmachine.core.a.p(th2);
                    }
                }
            });
            this.mraidOMSDKAdMeasurer = null;
        }
    }

    @Override // od.b
    public void onShown() {
        super.onShown();
        m9.a aVar = this.mraidOMSDKAdMeasurer;
        if (aVar != null) {
            aVar.t();
        }
    }

    @Override // od.p
    public void prepareToShow(@Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        s sVar;
        super.prepareToShow(rendererConfiguration);
        if (this.isPrepareToShowExecuted.compareAndSet(false, true) && (sVar = this.mraidView) != null) {
            sVar.u0(null);
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull final od.f fVar, @NonNull od.g gVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        String strPrepareCreativeForMeasure;
        final MraidParams mraidParams = new MraidParams(kVar);
        if (mraidParams.isValid(fVar)) {
            fVar.setVisibilitySource(mraidParams.cacheControl == y8.a.FullLoad ? io.bidmachine.core.k.BidMachine : io.bidmachine.core.k.All);
            final Context applicationContext = contextProvider.getApplicationContext();
            if (mraidParams.omsdkEnabled) {
                m9.a aVar = new m9.a(true);
                this.mraidOMSDKAdMeasurer = aVar;
                strPrepareCreativeForMeasure = aVar.prepareCreativeForMeasure(mraidParams.creativeAdm);
            } else {
                strPrepareCreativeForMeasure = mraidParams.creativeAdm;
            }
            final String str = strPrepareCreativeForMeasure;
            io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.ads.networks.mraid.MraidBannerAd.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MraidBannerAd.this.mraidView = new s.a().v(mraidParams.cacheControl).D(mraidParams.placeholderTimeoutSec).B(new MraidBannerAdListener(fVar)).t(MraidBannerAd.this.mraidOMSDKAdMeasurer).c(applicationContext);
                        MraidBannerAd.this.mraidView.o0(str);
                    } catch (Throwable th2) {
                        io.bidmachine.core.a.p(th2);
                        fVar.onAdLoadFailed(ae.a.l("Exception loading MRAID banner object", th2));
                    }
                }
            });
        }
    }
}
