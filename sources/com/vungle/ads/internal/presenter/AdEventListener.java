package com.vungle.ads.internal.presenter;

import com.taurusx.tax.f.y;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.util.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\"\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/presenter/AdEventListener;", "", "playAdCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "(Lcom/vungle/ads/internal/presenter/AdPlayCallback;Lcom/vungle/ads/internal/model/Placement;)V", "adRewarded", "", "onError", "", "error", "Lcom/vungle/ads/VungleError;", "placementId", "", "onNext", "s", "value", "id", y.f66058y, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class AdEventListener {

    @NotNull
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;

    @Nullable
    private Placement placement;

    @Nullable
    private final AdPlayCallback playAdCallback;

    public AdEventListener(@Nullable AdPlayCallback adPlayCallback, @Nullable Placement placement) {
        this.playAdCallback = adPlayCallback;
        this.placement = placement;
    }

    public final void onError(@NotNull VungleError error, @Nullable String placementId) {
        Intrinsics.checkNotNullParameter(error, "error");
        AdPlayCallback adPlayCallback = this.playAdCallback;
        if (adPlayCallback != null) {
            adPlayCallback.onFailure(error);
            Logger.INSTANCE.e(TAG, "AdEventListener#PlayAdCallback " + placementId, error);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void onNext(@NotNull String s10, @Nullable String value, @Nullable String id2) {
        Placement placement;
        AdPlayCallback adPlayCallback;
        AdPlayCallback adPlayCallback2;
        AdPlayCallback adPlayCallback3;
        AdPlayCallback adPlayCallback4;
        Intrinsics.checkNotNullParameter(s10, "s");
        Logger.INSTANCE.d(TAG, "s=" + s10 + ", value=" + value + ", id=" + id2);
        switch (s10.hashCode()) {
            case -1912374177:
                if (s10.equals(MRAIDPresenter.SUCCESSFUL_VIEW) && (placement = this.placement) != null && placement.isRewardedVideo() && !this.adRewarded) {
                    this.adRewarded = true;
                    AdPlayCallback adPlayCallback5 = this.playAdCallback;
                    if (adPlayCallback5 != null) {
                        adPlayCallback5.onAdRewarded(id2);
                    }
                }
                break;
            case -1627831289:
                if (s10.equals("adViewed") && (adPlayCallback = this.playAdCallback) != null) {
                    adPlayCallback.onAdImpression(id2);
                }
                break;
            case 100571:
                if (s10.equals("end") && (adPlayCallback2 = this.playAdCallback) != null) {
                    adPlayCallback2.onAdEnd(id2);
                }
                break;
            case 3417674:
                if (s10.equals("open")) {
                    if (Intrinsics.areEqual(value, "adClick")) {
                        AdPlayCallback adPlayCallback6 = this.playAdCallback;
                        if (adPlayCallback6 != null) {
                            adPlayCallback6.onAdClick(id2);
                        }
                        break;
                    } else if (Intrinsics.areEqual(value, "adLeftApplication") && (adPlayCallback3 = this.playAdCallback) != null) {
                        adPlayCallback3.onAdLeftApplication(id2);
                        break;
                    }
                }
                break;
            case 109757538:
                if (s10.equals("start") && (adPlayCallback4 = this.playAdCallback) != null) {
                    adPlayCallback4.onAdStart(id2);
                }
                break;
        }
    }
}
