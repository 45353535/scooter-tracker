package io.bidmachine;

import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB%\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\nHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0012\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lio/bidmachine/AdPlacementConfig;", "", "adsFormat", "Lio/bidmachine/AdsFormat;", "placementId", "", "customParams", "Lio/bidmachine/CustomParams;", "(Lio/bidmachine/AdsFormat;Ljava/lang/String;Lio/bidmachine/CustomParams;)V", "adFormat", "Lio/bidmachine/AdFormat;", "(Lio/bidmachine/AdFormat;Ljava/lang/String;Lio/bidmachine/CustomParams;)V", "getAdFormat", "()Lio/bidmachine/AdFormat;", "getCustomParams", "()Lio/bidmachine/CustomParams;", "getPlacementId", "()Ljava/lang/String;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "newBuilder", "Lio/bidmachine/AdPlacementConfig$Builder;", "toString", "Builder", com.taurusx.tax.f.y.f66058y, "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class AdPlacementConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AdFormat adFormat;

    @Nullable
    private final CustomParams customParams;

    @Nullable
    private final String placementId;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/bidmachine/AdPlacementConfig$Builder;", "", "adsFormat", "Lio/bidmachine/AdsFormat;", "(Lio/bidmachine/AdsFormat;)V", "adFormat", "Lio/bidmachine/AdFormat;", "(Lio/bidmachine/AdFormat;)V", "customParams", "Lio/bidmachine/CustomParams;", "placementId", "", "build", "Lio/bidmachine/AdPlacementConfig;", "withCustomParams", "withPlacementId", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @NotNull
        private final AdFormat adFormat;

        @Nullable
        private CustomParams customParams;

        @Nullable
        private String placementId;

        public Builder(@NotNull AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.adFormat = adFormat;
        }

        @NotNull
        public final AdPlacementConfig build() {
            return new AdPlacementConfig(this.adFormat, this.placementId, this.customParams);
        }

        @NotNull
        public final Builder withCustomParams(@Nullable CustomParams customParams) {
            this.customParams = customParams;
            return this;
        }

        @NotNull
        public final Builder withPlacementId(@Nullable String placementId) {
            this.placementId = placementId;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(@NotNull AdsFormat adsFormat) {
            Intrinsics.checkNotNullParameter(adsFormat, "adsFormat");
            AdFormat adFormat = adsFormat.toAdFormat();
            Intrinsics.checkNotNullExpressionValue(adFormat, "adsFormat.toAdFormat()");
            this(adFormat);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u0012\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¨\u0006\u000f"}, d2 = {"Lio/bidmachine/AdPlacementConfig$Companion;", "", "()V", "bannerBuilder", "Lio/bidmachine/AdPlacementConfig$Builder;", com.ironsource.mediationsdk.l.f44068h, "Lio/bidmachine/BannerAdSize;", "interstitialBuilder", "adContentType", "Lio/bidmachine/AdContentType;", "nativeBuilder", "mediaAssetTypes", "", "Lio/bidmachine/MediaAssetType;", "rewardedBuilder", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Builder bannerBuilder$default(Companion companion, BannerAdSize bannerAdSize, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bannerAdSize = BannerAdSize.Banner;
            }
            return companion.bannerBuilder(bannerAdSize);
        }

        public static /* synthetic */ Builder interstitialBuilder$default(Companion companion, AdContentType adContentType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adContentType = AdContentType.All;
            }
            return companion.interstitialBuilder(adContentType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder nativeBuilder$default(Companion companion, List DEFAULT, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                DEFAULT = MediaAssetType.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            }
            return companion.nativeBuilder(DEFAULT);
        }

        public static /* synthetic */ Builder rewardedBuilder$default(Companion companion, AdContentType adContentType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adContentType = AdContentType.All;
            }
            return companion.rewardedBuilder(adContentType);
        }

        @NotNull
        public final Builder bannerBuilder() {
            return bannerBuilder$default(this, null, 1, null);
        }

        @NotNull
        public final Builder interstitialBuilder() {
            return interstitialBuilder$default(this, null, 1, null);
        }

        @NotNull
        public final Builder nativeBuilder() {
            return nativeBuilder$default(this, null, 1, null);
        }

        @NotNull
        public final Builder rewardedBuilder() {
            return rewardedBuilder$default(this, null, 1, null);
        }

        private Companion() {
        }

        @NotNull
        public final Builder bannerBuilder(@NotNull BannerAdSize bannerAdSize) {
            Intrinsics.checkNotNullParameter(bannerAdSize, "bannerAdSize");
            return new Builder(AdFormat.INSTANCE.createBanner(bannerAdSize));
        }

        @NotNull
        public final Builder interstitialBuilder(@NotNull AdContentType adContentType) {
            Intrinsics.checkNotNullParameter(adContentType, "adContentType");
            return new Builder(AdFormat.INSTANCE.createInterstitial(adContentType));
        }

        @NotNull
        public final Builder nativeBuilder(@NotNull List<? extends MediaAssetType> mediaAssetTypes) {
            Intrinsics.checkNotNullParameter(mediaAssetTypes, "mediaAssetTypes");
            return new Builder(AdFormat.INSTANCE.createNative(mediaAssetTypes));
        }

        @NotNull
        public final Builder rewardedBuilder(@NotNull AdContentType adContentType) {
            Intrinsics.checkNotNullParameter(adContentType, "adContentType");
            return new Builder(AdFormat.INSTANCE.createRewarded(adContentType));
        }
    }

    public AdPlacementConfig(@NotNull AdFormat adFormat, @Nullable String str, @Nullable CustomParams customParams) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.adFormat = adFormat;
        this.placementId = str;
        this.customParams = customParams;
    }

    @NotNull
    public static final Builder bannerBuilder() {
        return INSTANCE.bannerBuilder();
    }

    public static /* synthetic */ AdPlacementConfig copy$default(AdPlacementConfig adPlacementConfig, AdFormat adFormat, String str, CustomParams customParams, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            adFormat = adPlacementConfig.adFormat;
        }
        if ((i10 & 2) != 0) {
            str = adPlacementConfig.placementId;
        }
        if ((i10 & 4) != 0) {
            customParams = adPlacementConfig.customParams;
        }
        return adPlacementConfig.copy(adFormat, str, customParams);
    }

    @NotNull
    public static final Builder interstitialBuilder() {
        return INSTANCE.interstitialBuilder();
    }

    @NotNull
    public static final Builder nativeBuilder() {
        return INSTANCE.nativeBuilder();
    }

    public static /* synthetic */ Builder newBuilder$default(AdPlacementConfig adPlacementConfig, AdFormat adFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            adFormat = adPlacementConfig.adFormat;
        }
        return adPlacementConfig.newBuilder(adFormat);
    }

    @NotNull
    public static final Builder rewardedBuilder() {
        return INSTANCE.rewardedBuilder();
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CustomParams getCustomParams() {
        return this.customParams;
    }

    @NotNull
    public final AdPlacementConfig copy(@NotNull AdFormat adFormat, @Nullable String placementId, @Nullable CustomParams customParams) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return new AdPlacementConfig(adFormat, placementId, customParams);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdPlacementConfig)) {
            return false;
        }
        AdPlacementConfig adPlacementConfig = (AdPlacementConfig) other;
        return Intrinsics.areEqual(this.adFormat, adPlacementConfig.adFormat) && Intrinsics.areEqual(this.placementId, adPlacementConfig.placementId) && Intrinsics.areEqual(this.customParams, adPlacementConfig.customParams);
    }

    @NotNull
    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    @Nullable
    public final CustomParams getCustomParams() {
        return this.customParams;
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
    }

    public int hashCode() {
        int iHashCode = this.adFormat.hashCode() * 31;
        String str = this.placementId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CustomParams customParams = this.customParams;
        return iHashCode2 + (customParams != null ? customParams.hashCode() : 0);
    }

    @NotNull
    public final Builder newBuilder() {
        return newBuilder$default(this, null, 1, null);
    }

    @NotNull
    public String toString() {
        return "AdPlacementConfig(adFormat=" + this.adFormat + ", placementId=" + this.placementId + ", customParams=" + this.customParams + ')';
    }

    @NotNull
    public static final Builder bannerBuilder(@NotNull BannerAdSize bannerAdSize) {
        return INSTANCE.bannerBuilder(bannerAdSize);
    }

    @NotNull
    public static final Builder interstitialBuilder(@NotNull AdContentType adContentType) {
        return INSTANCE.interstitialBuilder(adContentType);
    }

    @NotNull
    public static final Builder nativeBuilder(@NotNull List<? extends MediaAssetType> list) {
        return INSTANCE.nativeBuilder(list);
    }

    @NotNull
    public static final Builder rewardedBuilder(@NotNull AdContentType adContentType) {
        return INSTANCE.rewardedBuilder(adContentType);
    }

    @NotNull
    public final Builder newBuilder(@NotNull AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return new Builder(adFormat).withPlacementId(this.placementId).withCustomParams(this.customParams);
    }

    public /* synthetic */ AdPlacementConfig(AdFormat adFormat, String str, CustomParams customParams, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : customParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdPlacementConfig(@NotNull AdsFormat adsFormat, @Nullable String str, @Nullable CustomParams customParams) {
        Intrinsics.checkNotNullParameter(adsFormat, "adsFormat");
        AdFormat adFormat = adsFormat.toAdFormat();
        Intrinsics.checkNotNullExpressionValue(adFormat, "adsFormat.toAdFormat()");
        this(adFormat, str, customParams);
    }
}
