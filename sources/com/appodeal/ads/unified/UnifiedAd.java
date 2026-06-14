package com.appodeal.ads.unified;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ-\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\u001d\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0012\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u000bH&J\b\u0010 \u001a\u00020\u000bH\u0016J\u001a\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%H\u0016¨\u0006&"}, d2 = {"Lcom/appodeal/ads/unified/UnifiedAd;", "UnifiedAdParamsType", "Lcom/appodeal/ads/unified/UnifiedAdParams;", "UnifiedAdCallbackType", "Lcom/appodeal/ads/unified/UnifiedAdCallback;", "AdUnitParamsType", "Lcom/appodeal/ads/AdUnitParams;", "", "<init>", "()V", "load", "", "contextProvider", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "adTypeParams", "adUnitParams", "callback", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/unified/UnifiedAdParams;Lcom/appodeal/ads/AdUnitParams;Lcom/appodeal/ads/unified/UnifiedAdCallback;)V", "onLoaded", "onPrepareToShow", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;Lcom/appodeal/ads/unified/UnifiedAdParams;)V", "onShow", "onImpression", "onHide", "onClicked", "onFinished", "onError", "error", "Lcom/appodeal/ads/networking/LoadingError;", "onDestroy", "onMediationWin", "onMediationLoss", "demandSource", "", "ecpm", "", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class UnifiedAd<UnifiedAdParamsType extends UnifiedAdParams, UnifiedAdCallbackType extends UnifiedAdCallback, AdUnitParamsType extends AdUnitParams> {
    public abstract void load(@NotNull ContextProvider contextProvider, @NotNull UnifiedAdParamsType adTypeParams, @NotNull AdUnitParamsType adUnitParams, @NotNull UnifiedAdCallbackType callback);

    public void onClicked() {
    }

    public abstract void onDestroy();

    public void onError(@Nullable LoadingError error) {
    }

    public void onFinished() {
    }

    public void onHide() {
    }

    public void onImpression() {
    }

    public void onLoaded() {
    }

    public void onMediationLoss(@Nullable String demandSource, double ecpm) {
    }

    public void onMediationWin() {
    }

    public void onPrepareToShow(@NotNull Activity activity, @NotNull UnifiedAdParamsType adTypeParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
    }

    public void onShow() {
    }
}
