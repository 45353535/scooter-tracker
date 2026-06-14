package io.bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ironsource.C4424m2;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0003R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingFullscreenAd;", "Lod/h;", "<init>", "()V", "Lio/bidmachine/ContextProvider;", "contextProvider", "Lod/i;", "callback", "Lod/j;", "requestParams", "Lod/k;", "unifiedMediationParams", "Lio/bidmachine/NetworkAdUnit;", "networkAdUnit", "", "load", "(Lio/bidmachine/ContextProvider;Lod/i;Lod/j;Lod/k;Lio/bidmachine/NetworkAdUnit;)V", "Lio/bidmachine/RendererConfiguration;", "rendererConfiguration", C4424m2.f43623v, "(Lio/bidmachine/ContextProvider;Lod/i;Lio/bidmachine/RendererConfiguration;)V", "onDestroy", "Lgc/m;", "fullScreenAd", "Lgc/m;", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingFullscreenAd extends od.h {

    @Nullable
    private gc.m fullScreenAd;

    @Override // od.b
    public void onDestroy() {
        gc.m mVar = this.fullScreenAd;
        if (mVar != null) {
            mVar.J();
        }
        this.fullScreenAd = null;
    }

    @Override // od.h
    public void show(@NotNull ContextProvider contextProvider, @NotNull od.i callback, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(callback, "callback");
        gc.m mVar = this.fullScreenAd;
        if (mVar == null) {
            callback.onAdShowFailed(ae.a.i("AdaptiveRendering fullscreen object is null"));
            return;
        }
        if (!mVar.S()) {
            callback.onAdShowFailed(ae.a.i("AdaptiveRendering fullscreen object not loaded"));
            return;
        }
        if (mVar.R()) {
            callback.onAdShowFailed(ae.a.i("AdaptiveRendering fullscreen object already is finished"));
            return;
        }
        if (rendererConfiguration != null) {
            Context applicationContext = contextProvider.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "contextProvider.applicationContext");
            Drawable watermarkDrawable = rendererConfiguration.getWatermarkDrawable(applicationContext);
            if (watermarkDrawable != null) {
                mVar.X(watermarkDrawable);
            }
        }
        Context applicationContext2 = contextProvider.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "contextProvider.getApplicationContext()");
        mVar.Y(applicationContext2);
    }

    @Override // od.b
    public void load(@NotNull ContextProvider contextProvider, @NotNull od.i callback, @NotNull od.j requestParams, @NotNull od.k unifiedMediationParams, @NotNull NetworkAdUnit networkAdUnit) throws Throwable {
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
            gc.m mVar = new gc.m(applicationContext, adaptiveRenderingParams.getAdParams());
            mVar.W(new AdaptiveRenderingFullscreenAdListener(applicationContext, callback));
            this.fullScreenAd = mVar;
            mVar.T();
        }
    }
}
