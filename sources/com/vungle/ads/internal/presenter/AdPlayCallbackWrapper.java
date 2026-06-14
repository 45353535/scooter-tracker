package com.vungle.ads.internal.presenter;

import com.ironsource.Df;
import com.vungle.ads.VungleError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "adPlayCallback", "(Lcom/vungle/ads/internal/presenter/AdPlayCallback;)V", "onAdClick", "", "id", "", "onAdEnd", "onAdImpression", Df.f40650k, Df.f40648i, "onAdStart", "onFailure", "error", "Lcom/vungle/ads/VungleError;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class AdPlayCallbackWrapper implements AdPlayCallback {

    @NotNull
    private final AdPlayCallback adPlayCallback;

    public AdPlayCallbackWrapper(@NotNull AdPlayCallback adPlayCallback) {
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        this.adPlayCallback = adPlayCallback;
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdClick(@Nullable String id2) {
        this.adPlayCallback.onAdClick(id2);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdEnd(@Nullable String id2) {
        this.adPlayCallback.onAdEnd(id2);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdImpression(@Nullable String id2) {
        this.adPlayCallback.onAdImpression(id2);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdLeftApplication(@Nullable String id2) {
        this.adPlayCallback.onAdLeftApplication(id2);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdRewarded(@Nullable String id2) {
        this.adPlayCallback.onAdRewarded(id2);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdStart(@Nullable String id2) {
        this.adPlayCallback.onAdStart(id2);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onFailure(@NotNull VungleError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.adPlayCallback.onFailure(error);
    }
}
