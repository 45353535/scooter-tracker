package com.appodeal.ads.adapters.bidonmediation.usecases;

import com.appodeal.ads.adapters.bidonmediation.ext.AdmobErrorExtKt;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.adapter.impl.AdEventFlow;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¨\u0006\r"}, d2 = {"Lcom/appodeal/ads/adapters/bidonmediation/usecases/GetFullScreenContentCallbackUseCase;", "", "<init>", "()V", "createCallback", "Lcom/google/android/gms/ads/FullScreenContentCallback;", "adEventFlow", "Lorg/bidon/sdk/adapter/impl/AdEventFlow;", "getAd", "Lkotlin/Function0;", "Lorg/bidon/sdk/ads/Ad;", "onClosed", "", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetFullScreenContentCallbackUseCase {
    @NotNull
    public final FullScreenContentCallback createCallback(@NotNull final AdEventFlow adEventFlow, @NotNull final Function0<Ad> getAd, @NotNull final Function0<Unit> onClosed) {
        Intrinsics.checkNotNullParameter(adEventFlow, "adEventFlow");
        Intrinsics.checkNotNullParameter(getAd, "getAd");
        Intrinsics.checkNotNullParameter(onClosed, "onClosed");
        return new FullScreenContentCallback() { // from class: com.appodeal.ads.adapters.bidonmediation.usecases.GetFullScreenContentCallbackUseCase.createCallback.1
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdClicked() {
                LogExtKt.logInfo("GetFullScreenContentCallback", "onAdClicked: " + this);
                Ad adInvoke = getAd.invoke();
                if (adInvoke != null) {
                    adEventFlow.emitEvent(new AdEvent.Clicked(adInvoke));
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                LogExtKt.logInfo("GetFullScreenContentCallback", "onAdDismissedFullScreenContent: " + this);
                Ad adInvoke = getAd.invoke();
                if (adInvoke != null) {
                    adEventFlow.emitEvent(new AdEvent.Closed(adInvoke));
                }
                onClosed.invoke();
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                LogExtKt.logError("GetFullScreenContentCallback", "onAdFailedToShowFullScreenContent: " + this, AdmobErrorExtKt.asBidonError(error));
                adEventFlow.emitEvent(new AdEvent.ShowFailed(AdmobErrorExtKt.asBidonError(error)));
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdImpression() {
                LogExtKt.logInfo("GetFullScreenContentCallback", "onAdShown: " + this);
                Ad adInvoke = getAd.invoke();
                if (adInvoke != null) {
                    adEventFlow.emitEvent(new AdEvent.Shown(adInvoke));
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
            }
        };
    }
}
