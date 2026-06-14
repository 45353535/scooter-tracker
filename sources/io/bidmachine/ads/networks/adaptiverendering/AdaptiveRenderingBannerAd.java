package io.bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
import android.graphics.drawable.Drawable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0003R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingBannerAd;", "Lod/e;", "<init>", "()V", "Lio/bidmachine/ContextProvider;", "contextProvider", "Lod/f;", "callback", "Lod/g;", "requestParams", "Lod/k;", "unifiedMediationParams", "Lio/bidmachine/NetworkAdUnit;", "networkAdUnit", "", "load", "(Lio/bidmachine/ContextProvider;Lod/f;Lod/g;Lod/k;Lio/bidmachine/NetworkAdUnit;)V", "Lio/bidmachine/RendererConfiguration;", "rendererConfiguration", "prepareToShow", "(Lio/bidmachine/RendererConfiguration;)V", "onDestroy", "Lhc/r;", "adView", "Lhc/r;", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingBannerAd extends od.e {

    @Nullable
    private hc.r adView;

    @Override // od.b
    public void onDestroy() {
        hc.r rVar = this.adView;
        if (rVar != null) {
            rVar.m0();
        }
        this.adView = null;
    }

    @Override // od.p
    public void prepareToShow(@Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        super.prepareToShow(rendererConfiguration);
        hc.r rVar = this.adView;
        if (rVar == null || rendererConfiguration == null) {
            return;
        }
        Context context = rVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "adView.context");
        Drawable watermarkDrawable = rendererConfiguration.getWatermarkDrawable(context);
        if (watermarkDrawable != null) {
            rVar.setWatermark(watermarkDrawable);
        }
    }

    @Override // od.b
    public void load(@NotNull ContextProvider contextProvider, @NotNull od.f callback, @NotNull od.g requestParams, @NotNull od.k unifiedMediationParams, @NotNull NetworkAdUnit networkAdUnit) throws Throwable {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        Intrinsics.checkNotNullParameter(unifiedMediationParams, "unifiedMediationParams");
        Intrinsics.checkNotNullParameter(networkAdUnit, "networkAdUnit");
        Context applicationContext = contextProvider.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "contextProvider.getApplicationContext()");
        AdaptiveRenderingParams adaptiveRenderingParams = new AdaptiveRenderingParams(unifiedMediationParams);
        if (adaptiveRenderingParams.isValid(callback)) {
            if (adaptiveRenderingParams.getAdParams() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            callback.setVisibilitySource(adaptiveRenderingParams.getAdParams().c() == id.u.FullLoad ? io.bidmachine.core.k.BidMachine : io.bidmachine.core.k.All);
            hc.r rVar = new hc.r(applicationContext, adaptiveRenderingParams.getAdParams());
            rVar.setAdViewListener(new AdaptiveRenderingBannerAdListener(callback));
            this.adView = rVar;
            rVar.C0();
        }
    }
}
