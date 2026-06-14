package com.vungle.ads;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.RewardedAdInternal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0010¢\u0006\u0002\b\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0005R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/vungle/ads/RewardedAd;", "Lcom/vungle/ads/BaseFullscreenAd;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "placementId", "", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "rewardedAdInternal", "Lcom/vungle/ads/internal/RewardedAdInternal;", "getRewardedAdInternal", "()Lcom/vungle/ads/internal/RewardedAdInternal;", "constructAdInternal", "constructAdInternal$vungle_ads_release", "setAlertBodyText", "", "bodyText", "setAlertCloseButtonText", "closeButtonText", "setAlertContinueButtonText", "continueButtonText", "setAlertTitleText", "titleText", "setUserId", "userId", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RewardedAd extends BaseFullscreenAd {
    public /* synthetic */ RewardedAd(Context context, String str, AdConfig adConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? new AdConfig() : adConfig);
    }

    private final RewardedAdInternal getRewardedAdInternal() {
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.RewardedAdInternal");
        return (RewardedAdInternal) adInternal$vungle_ads_release;
    }

    public final void setAlertBodyText(@NotNull String bodyText) {
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        getRewardedAdInternal().setAlertBodyText$vungle_ads_release(bodyText);
    }

    public final void setAlertCloseButtonText(@NotNull String closeButtonText) {
        Intrinsics.checkNotNullParameter(closeButtonText, "closeButtonText");
        getRewardedAdInternal().setAlertCloseButtonText$vungle_ads_release(closeButtonText);
    }

    public final void setAlertContinueButtonText(@NotNull String continueButtonText) {
        Intrinsics.checkNotNullParameter(continueButtonText, "continueButtonText");
        getRewardedAdInternal().setAlertContinueButtonText$vungle_ads_release(continueButtonText);
    }

    public final void setAlertTitleText(@NotNull String titleText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        getRewardedAdInternal().setAlertTitleText$vungle_ads_release(titleText);
    }

    public final void setUserId(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        getRewardedAdInternal().setUserId$vungle_ads_release(userId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAd(@NotNull Context context, @NotNull String placementId, @NotNull AdConfig adConfig) {
        super(context, placementId, adConfig);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd
    @NotNull
    public RewardedAdInternal constructAdInternal$vungle_ads_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new RewardedAdInternal(context);
    }
}
