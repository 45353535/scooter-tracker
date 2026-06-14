package com.appodeal.ads.unified;

import com.appodeal.ads.MediaAssets;
import com.appodeal.ads.nativead.NativeAdView;
import com.appodeal.ads.unified.AdNetworkConnector;
import com.ironsource.sdk.controller.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/appodeal/ads/unified/UnifiedNativeAd;", "Lcom/appodeal/ads/unified/AdNetworkConnector;", "title", "", "description", "callToAction", "mediaAssets", "Lcom/appodeal/ads/MediaAssets;", "rating", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/appodeal/ads/MediaAssets;Ljava/lang/Float;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getCallToAction", "getMediaAssets", "()Lcom/appodeal/ads/MediaAssets;", "getRating", "()Ljava/lang/Float;", "Ljava/lang/Float;", f.b.f45109c, "", "getAdId", "()I", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class UnifiedNativeAd implements AdNetworkConnector {
    private final int adId;

    @NotNull
    private final String callToAction;

    @Nullable
    private final String description;

    @NotNull
    private final MediaAssets mediaAssets;

    @Nullable
    private final Float rating;

    @NotNull
    private final String title;

    public UnifiedNativeAd(@NotNull String title, @Nullable String str, @NotNull String callToAction, @NotNull MediaAssets mediaAssets, @Nullable Float f10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(callToAction, "callToAction");
        Intrinsics.checkNotNullParameter(mediaAssets, "mediaAssets");
        this.title = title;
        this.description = str;
        this.callToAction = callToAction;
        this.mediaAssets = mediaAssets;
        this.rating = f10;
        this.adId = hashCode();
    }

    public final int getAdId() {
        return this.adId;
    }

    @NotNull
    public final String getCallToAction() {
        return this.callToAction;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final MediaAssets getMediaAssets() {
        return this.mediaAssets;
    }

    @Nullable
    public final Float getRating() {
        return this.rating;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public void onRegisterForInteraction(@NotNull NativeAdView nativeAdView) {
        AdNetworkConnector.DefaultImpls.onRegisterForInteraction(this, nativeAdView);
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public void onUnregisterForInteraction(@NotNull NativeAdView nativeAdView) {
        AdNetworkConnector.DefaultImpls.onUnregisterForInteraction(this, nativeAdView);
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public void processClick(@NotNull Function1<? super UnifiedAdCallbackClickTrackListener, Unit> function1) {
        AdNetworkConnector.DefaultImpls.processClick(this, function1);
    }

    public /* synthetic */ UnifiedNativeAd(String str, String str2, String str3, MediaAssets mediaAssets, Float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? new MediaAssets(null, null, null, 7, null) : mediaAssets, (i10 & 16) != 0 ? null : f10);
    }
}
