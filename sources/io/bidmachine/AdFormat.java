package io.bidmachine;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00192\u00020\u0001:\u0006\u001a\u0019\u001b\u001c\u001d\u001eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118 X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0004\u001f !\"¨\u0006#"}, d2 = {"Lio/bidmachine/AdFormat;", "", "Lio/bidmachine/AdsType;", "adsType", "<init>", "(Lio/bidmachine/AdsType;)V", "Lod/d;", "T", "adRequestParams", "Lio/bidmachine/AdContentType;", "adContentType", "", "isMatch", "(Lio/bidmachine/AdsType;Lod/d;Lio/bidmachine/AdContentType;)Z", "Lio/bidmachine/AdsType;", "getAdsType", "()Lio/bidmachine/AdsType;", "Lio/bidmachine/AdFormat$Matcher;", "getMatcher$bidmachine_android_sdk_bh_3_5_0", "()Lio/bidmachine/AdFormat$Matcher;", "matcher", "", "getRemoteName", "()Ljava/lang/String;", "remoteName", com.taurusx.tax.f.y.f66058y, "Banner", "Interstitial", "Matcher", LogConstants.KEY_NATIVE, "Rewarded", "Lio/bidmachine/AdFormat$Banner;", "Lio/bidmachine/AdFormat$Interstitial;", "Lio/bidmachine/AdFormat$Native;", "Lio/bidmachine/AdFormat$Rewarded;", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AdFormat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AdsType adsType;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lio/bidmachine/AdFormat$Banner;", "Lio/bidmachine/AdFormat;", com.ironsource.mediationsdk.l.f44068h, "Lio/bidmachine/BannerAdSize;", "(Lio/bidmachine/BannerAdSize;)V", "getBannerAdSize", "()Lio/bidmachine/BannerAdSize;", "matcher", "Lio/bidmachine/AdFormat$Matcher;", "getMatcher$bidmachine_android_sdk_bh_3_5_0", "()Lio/bidmachine/AdFormat$Matcher;", "remoteName", "", "getRemoteName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Banner extends AdFormat {

        @NotNull
        private final BannerAdSize bannerAdSize;

        @NotNull
        private final Matcher matcher;

        @NotNull
        private final String remoteName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Banner(@NotNull BannerAdSize bannerAdSize) {
            super(AdsType.Banner, null);
            Intrinsics.checkNotNullParameter(bannerAdSize, "bannerAdSize");
            this.bannerAdSize = bannerAdSize;
            final AdsType adsType = getAdsType();
            this.matcher = new Matcher(adsType) { // from class: io.bidmachine.AdFormat$Banner$matcher$1
                @Override // io.bidmachine.AdFormat.Matcher
                public <T extends od.d> boolean isMatch(@NotNull T adRequestParams, @NotNull AdContentType adContentType) {
                    Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
                    Intrinsics.checkNotNullParameter(adContentType, "adContentType");
                    if (adRequestParams instanceof od.g) {
                        return Intrinsics.areEqual(this.this$0.getBannerAdSize(), BannerAdSize.Undefined) || Intrinsics.areEqual(this.this$0.getBannerAdSize().toSize(), ((od.g) adRequestParams).getAdRequestParameters().a().toSize());
                    }
                    return false;
                }
            };
            this.remoteName = Intrinsics.areEqual(bannerAdSize, BannerAdSize.Leaderboard) ? "banner_728x90" : Intrinsics.areEqual(bannerAdSize, BannerAdSize.MediumRectangle) ? "banner_300x250" : Intrinsics.areEqual(bannerAdSize, BannerAdSize.Banner) ? "banner_320x50" : "banner";
        }

        public static /* synthetic */ Banner copy$default(Banner banner, BannerAdSize bannerAdSize, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bannerAdSize = banner.bannerAdSize;
            }
            return banner.copy(bannerAdSize);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BannerAdSize getBannerAdSize() {
            return this.bannerAdSize;
        }

        @NotNull
        public final Banner copy(@NotNull BannerAdSize bannerAdSize) {
            Intrinsics.checkNotNullParameter(bannerAdSize, "bannerAdSize");
            return new Banner(bannerAdSize);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Banner) && Intrinsics.areEqual(this.bannerAdSize, ((Banner) other).bannerAdSize);
        }

        @NotNull
        public final BannerAdSize getBannerAdSize() {
            return this.bannerAdSize;
        }

        @Override // io.bidmachine.AdFormat
        @NotNull
        /* JADX INFO: renamed from: getMatcher$bidmachine_android_sdk_bh_3_5_0, reason: from getter */
        public Matcher getMatcher() {
            return this.matcher;
        }

        @Override // io.bidmachine.AdFormat
        @NotNull
        public String getRemoteName() {
            return this.remoteName;
        }

        public int hashCode() {
            return this.bannerAdSize.hashCode();
        }

        @NotNull
        public String toString() {
            return "Banner(bannerAdSize=" + this.bannerAdSize + ')';
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u0012"}, d2 = {"Lio/bidmachine/AdFormat$Companion;", "", "()V", "byRemoteName", "Lio/bidmachine/AdFormat;", "remoteName", "", "createBanner", com.ironsource.mediationsdk.l.f44068h, "Lio/bidmachine/BannerAdSize;", "createInterstitial", "adContentType", "Lio/bidmachine/AdContentType;", "createNative", "mediaAssetTypes", "", "Lio/bidmachine/MediaAssetType;", "createRewarded", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Nullable
        public final AdFormat byRemoteName(@NotNull String remoteName) {
            Intrinsics.checkNotNullParameter(remoteName, "remoteName");
            switch (remoteName.hashCode()) {
                case -1396342996:
                    if (remoteName.equals("banner")) {
                        return createBanner(BannerAdSize.Undefined);
                    }
                    return null;
                case -1364000502:
                    if (remoteName.equals(com.appodeal.ads.modules.common.internal.Constants.REWARDED_VIDEO)) {
                        return createRewarded(AdContentType.Video);
                    }
                    return null;
                case -1052618729:
                    if (!remoteName.equals("native")) {
                        return null;
                    }
                    List<MediaAssetType> DEFAULT = MediaAssetType.DEFAULT;
                    Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
                    return createNative(DEFAULT);
                case -421482955:
                    if (remoteName.equals("banner_320x50")) {
                        return createBanner(BannerAdSize.Banner);
                    }
                    return null;
                case -306727899:
                    if (remoteName.equals("banner_728x90")) {
                        return createBanner(BannerAdSize.Leaderboard);
                    }
                    return null;
                case -239580146:
                    if (remoteName.equals("rewarded")) {
                        return createRewarded(AdContentType.All);
                    }
                    return null;
                case -238330699:
                    if (remoteName.equals("banner_300x250")) {
                        return createBanner(BannerAdSize.MediumRectangle);
                    }
                    return null;
                case 302042536:
                    if (remoteName.equals("interstitial_video")) {
                        return createInterstitial(AdContentType.Video);
                    }
                    return null;
                case 589853631:
                    if (remoteName.equals("rewarded_static")) {
                        return createRewarded(AdContentType.Static);
                    }
                    return null;
                case 604727084:
                    if (remoteName.equals("interstitial")) {
                        return createInterstitial(AdContentType.All);
                    }
                    return null;
                case 697580257:
                    if (remoteName.equals("interstitial_static")) {
                        return createInterstitial(AdContentType.Static);
                    }
                    return null;
                default:
                    return null;
            }
        }

        @NotNull
        public final AdFormat createBanner(@NotNull BannerAdSize bannerAdSize) {
            Intrinsics.checkNotNullParameter(bannerAdSize, "bannerAdSize");
            return new Banner(bannerAdSize);
        }

        @NotNull
        public final AdFormat createInterstitial(@NotNull AdContentType adContentType) {
            Intrinsics.checkNotNullParameter(adContentType, "adContentType");
            return new Interstitial(adContentType);
        }

        @NotNull
        public final AdFormat createNative(@NotNull List<? extends MediaAssetType> mediaAssetTypes) {
            Intrinsics.checkNotNullParameter(mediaAssetTypes, "mediaAssetTypes");
            return new Native(mediaAssetTypes);
        }

        @NotNull
        public final AdFormat createRewarded(@NotNull AdContentType adContentType) {
            Intrinsics.checkNotNullParameter(adContentType, "adContentType");
            return new Rewarded(adContentType);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lio/bidmachine/AdFormat$Interstitial;", "Lio/bidmachine/AdFormat;", "adContentType", "Lio/bidmachine/AdContentType;", "(Lio/bidmachine/AdContentType;)V", "getAdContentType", "()Lio/bidmachine/AdContentType;", "matcher", "Lio/bidmachine/AdFormat$Matcher;", "getMatcher$bidmachine_android_sdk_bh_3_5_0", "()Lio/bidmachine/AdFormat$Matcher;", "remoteName", "", "getRemoteName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Interstitial extends AdFormat {

        @NotNull
        private final AdContentType adContentType;

        @NotNull
        private final Matcher matcher;

        @NotNull
        private final String remoteName;

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AdContentType.values().length];
                try {
                    iArr[AdContentType.Video.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdContentType.Static.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Interstitial(@NotNull AdContentType adContentType) {
            super(AdsType.Interstitial, null);
            Intrinsics.checkNotNullParameter(adContentType, "adContentType");
            this.adContentType = adContentType;
            final AdsType adsType = getAdsType();
            this.matcher = new Matcher(adsType) { // from class: io.bidmachine.AdFormat$Interstitial$matcher$1
                @Override // io.bidmachine.AdFormat.Matcher
                public <T extends od.d> boolean isMatch(@NotNull T adRequestParams, @NotNull AdContentType adContentType2) {
                    Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
                    Intrinsics.checkNotNullParameter(adContentType2, "adContentType");
                    AdContentType adContentType3 = this.this$0.getAdContentType();
                    return adContentType3 == AdContentType.All || adContentType3 == adContentType2;
                }
            };
            int i10 = WhenMappings.$EnumSwitchMapping$0[adContentType.ordinal()];
            this.remoteName = i10 != 1 ? i10 != 2 ? "interstitial" : "interstitial_static" : "interstitial_video";
        }

        public static /* synthetic */ Interstitial copy$default(Interstitial interstitial, AdContentType adContentType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adContentType = interstitial.adContentType;
            }
            return interstitial.copy(adContentType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdContentType getAdContentType() {
            return this.adContentType;
        }

        @NotNull
        public final Interstitial copy(@NotNull AdContentType adContentType) {
            Intrinsics.checkNotNullParameter(adContentType, "adContentType");
            return new Interstitial(adContentType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Interstitial) && this.adContentType == ((Interstitial) other).adContentType;
        }

        @NotNull
        public final AdContentType getAdContentType() {
            return this.adContentType;
        }

        @Override // io.bidmachine.AdFormat
        @NotNull
        /* JADX INFO: renamed from: getMatcher$bidmachine_android_sdk_bh_3_5_0, reason: from getter */
        public Matcher getMatcher() {
            return this.matcher;
        }

        @Override // io.bidmachine.AdFormat
        @NotNull
        public String getRemoteName() {
            return this.remoteName;
        }

        public int hashCode() {
            return this.adContentType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Interstitial(adContentType=" + this.adContentType + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ/\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/AdFormat$Matcher;", "", "Lio/bidmachine/AdsType;", "adsType", "<init>", "(Lio/bidmachine/AdsType;)V", "Lod/d;", "T", "adRequestParams", "Lio/bidmachine/AdContentType;", "adContentType", "", "isMatch", "(Lod/d;Lio/bidmachine/AdContentType;)Z", "(Lio/bidmachine/AdsType;Lod/d;Lio/bidmachine/AdContentType;)Z", "Lio/bidmachine/AdsType;", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Matcher {

        @NotNull
        private final AdsType adsType;

        public Matcher(@NotNull AdsType adsType) {
            Intrinsics.checkNotNullParameter(adsType, "adsType");
            this.adsType = adsType;
        }

        public final <T extends od.d> boolean isMatch(@NotNull AdsType adsType, @NotNull T adRequestParams, @NotNull AdContentType adContentType) {
            Intrinsics.checkNotNullParameter(adsType, "adsType");
            Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
            Intrinsics.checkNotNullParameter(adContentType, "adContentType");
            return adsType == this.adsType && isMatch(adRequestParams, adContentType);
        }

        public abstract <T extends od.d> boolean isMatch(@NotNull T adRequestParams, @NotNull AdContentType adContentType);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lio/bidmachine/AdFormat$Native;", "Lio/bidmachine/AdFormat;", "mediaAssetTypes", "", "Lio/bidmachine/MediaAssetType;", "(Ljava/util/List;)V", "matcher", "Lio/bidmachine/AdFormat$Matcher;", "getMatcher$bidmachine_android_sdk_bh_3_5_0", "()Lio/bidmachine/AdFormat$Matcher;", "getMediaAssetTypes", "()Ljava/util/List;", "remoteName", "", "getRemoteName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Native extends AdFormat {

        @NotNull
        private final Matcher matcher;

        @NotNull
        private final List<MediaAssetType> mediaAssetTypes;

        @NotNull
        private final String remoteName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Native(@NotNull List<? extends MediaAssetType> mediaAssetTypes) {
            super(AdsType.Native, null);
            Intrinsics.checkNotNullParameter(mediaAssetTypes, "mediaAssetTypes");
            this.mediaAssetTypes = mediaAssetTypes;
            final AdsType adsType = getAdsType();
            this.matcher = new Matcher(adsType) { // from class: io.bidmachine.AdFormat$Native$matcher$1
                @Override // io.bidmachine.AdFormat.Matcher
                public <T extends od.d> boolean isMatch(@NotNull T adRequestParams, @NotNull AdContentType adContentType) {
                    Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
                    Intrinsics.checkNotNullParameter(adContentType, "adContentType");
                    return true;
                }
            };
            this.remoteName = "native";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Native copy$default(Native r02, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = r02.mediaAssetTypes;
            }
            return r02.copy(list);
        }

        @NotNull
        public final List<MediaAssetType> component1() {
            return this.mediaAssetTypes;
        }

        @NotNull
        public final Native copy(@NotNull List<? extends MediaAssetType> mediaAssetTypes) {
            Intrinsics.checkNotNullParameter(mediaAssetTypes, "mediaAssetTypes");
            return new Native(mediaAssetTypes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Native) && Intrinsics.areEqual(this.mediaAssetTypes, ((Native) other).mediaAssetTypes);
        }

        @Override // io.bidmachine.AdFormat
        @NotNull
        /* JADX INFO: renamed from: getMatcher$bidmachine_android_sdk_bh_3_5_0, reason: from getter */
        public Matcher getMatcher() {
            return this.matcher;
        }

        @NotNull
        public final List<MediaAssetType> getMediaAssetTypes() {
            return this.mediaAssetTypes;
        }

        @Override // io.bidmachine.AdFormat
        @NotNull
        public String getRemoteName() {
            return this.remoteName;
        }

        public int hashCode() {
            return this.mediaAssetTypes.hashCode();
        }

        @NotNull
        public String toString() {
            return "Native(mediaAssetTypes=" + this.mediaAssetTypes + ')';
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lio/bidmachine/AdFormat$Rewarded;", "Lio/bidmachine/AdFormat;", "adContentType", "Lio/bidmachine/AdContentType;", "(Lio/bidmachine/AdContentType;)V", "getAdContentType", "()Lio/bidmachine/AdContentType;", "matcher", "Lio/bidmachine/AdFormat$Matcher;", "getMatcher$bidmachine_android_sdk_bh_3_5_0", "()Lio/bidmachine/AdFormat$Matcher;", "remoteName", "", "getRemoteName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Rewarded extends AdFormat {

        @NotNull
        private final AdContentType adContentType;

        @NotNull
        private final Matcher matcher;

        @NotNull
        private final String remoteName;

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AdContentType.values().length];
                try {
                    iArr[AdContentType.Video.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdContentType.Static.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rewarded(@NotNull AdContentType adContentType) {
            super(AdsType.Rewarded, null);
            Intrinsics.checkNotNullParameter(adContentType, "adContentType");
            this.adContentType = adContentType;
            final AdsType adsType = getAdsType();
            this.matcher = new Matcher(adsType) { // from class: io.bidmachine.AdFormat$Rewarded$matcher$1
                @Override // io.bidmachine.AdFormat.Matcher
                public <T extends od.d> boolean isMatch(@NotNull T adRequestParams, @NotNull AdContentType adContentType2) {
                    Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
                    Intrinsics.checkNotNullParameter(adContentType2, "adContentType");
                    AdContentType adContentType3 = this.this$0.getAdContentType();
                    return adContentType3 == AdContentType.All || adContentType3 == adContentType2;
                }
            };
            int i10 = WhenMappings.$EnumSwitchMapping$0[adContentType.ordinal()];
            this.remoteName = i10 != 1 ? i10 != 2 ? "rewarded" : "rewarded_static" : com.appodeal.ads.modules.common.internal.Constants.REWARDED_VIDEO;
        }

        public static /* synthetic */ Rewarded copy$default(Rewarded rewarded, AdContentType adContentType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adContentType = rewarded.adContentType;
            }
            return rewarded.copy(adContentType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AdContentType getAdContentType() {
            return this.adContentType;
        }

        @NotNull
        public final Rewarded copy(@NotNull AdContentType adContentType) {
            Intrinsics.checkNotNullParameter(adContentType, "adContentType");
            return new Rewarded(adContentType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Rewarded) && this.adContentType == ((Rewarded) other).adContentType;
        }

        @NotNull
        public final AdContentType getAdContentType() {
            return this.adContentType;
        }

        @Override // io.bidmachine.AdFormat
        @NotNull
        /* JADX INFO: renamed from: getMatcher$bidmachine_android_sdk_bh_3_5_0, reason: from getter */
        public Matcher getMatcher() {
            return this.matcher;
        }

        @Override // io.bidmachine.AdFormat
        @NotNull
        public String getRemoteName() {
            return this.remoteName;
        }

        public int hashCode() {
            return this.adContentType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Rewarded(adContentType=" + this.adContentType + ')';
        }
    }

    public /* synthetic */ AdFormat(AdsType adsType, DefaultConstructorMarker defaultConstructorMarker) {
        this(adsType);
    }

    @Nullable
    public static final AdFormat byRemoteName(@NotNull String str) {
        return INSTANCE.byRemoteName(str);
    }

    @NotNull
    public static final AdFormat createBanner(@NotNull BannerAdSize bannerAdSize) {
        return INSTANCE.createBanner(bannerAdSize);
    }

    @NotNull
    public static final AdFormat createInterstitial(@NotNull AdContentType adContentType) {
        return INSTANCE.createInterstitial(adContentType);
    }

    @NotNull
    public static final AdFormat createNative(@NotNull List<? extends MediaAssetType> list) {
        return INSTANCE.createNative(list);
    }

    @NotNull
    public static final AdFormat createRewarded(@NotNull AdContentType adContentType) {
        return INSTANCE.createRewarded(adContentType);
    }

    @NotNull
    public final AdsType getAdsType() {
        return this.adsType;
    }

    @NotNull
    /* JADX INFO: renamed from: getMatcher$bidmachine_android_sdk_bh_3_5_0 */
    public abstract Matcher getMatcher();

    @NotNull
    public abstract String getRemoteName();

    public final <T extends od.d> boolean isMatch(@NotNull AdsType adsType, @NotNull T adRequestParams, @NotNull AdContentType adContentType) {
        Intrinsics.checkNotNullParameter(adsType, "adsType");
        Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
        Intrinsics.checkNotNullParameter(adContentType, "adContentType");
        return getMatcher().isMatch(adsType, adRequestParams, adContentType);
    }

    private AdFormat(AdsType adsType) {
        this.adsType = adsType;
    }
}
