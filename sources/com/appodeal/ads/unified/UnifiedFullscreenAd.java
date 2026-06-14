package com.appodeal.ads.unified;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedFullscreenAdParams;
import com.ironsource.C4424m2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/unified/UnifiedFullscreenAd;", "UnifiedAdParamsType", "Lcom/appodeal/ads/unified/UnifiedFullscreenAdParams;", "UnifiedAdCallbackType", "Lcom/appodeal/ads/unified/UnifiedFullscreenAdCallback;", "NetworkRequestParams", "Lcom/appodeal/ads/AdUnitParams;", "Lcom/appodeal/ads/unified/UnifiedAd;", "<init>", "()V", C4424m2.f43623v, "", "activity", "Landroid/app/Activity;", "callback", "(Landroid/app/Activity;Lcom/appodeal/ads/unified/UnifiedFullscreenAdCallback;)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class UnifiedFullscreenAd<UnifiedAdParamsType extends UnifiedFullscreenAdParams, UnifiedAdCallbackType extends UnifiedFullscreenAdCallback, NetworkRequestParams extends AdUnitParams> extends UnifiedAd<UnifiedAdParamsType, UnifiedAdCallbackType, NetworkRequestParams> {
    public abstract void show(@NotNull Activity activity, @NotNull UnifiedAdCallbackType callback);
}
