package io.bidmachine;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdFormat;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated(since = "3.5.0")
public enum AdsFormat {
    Banner("banner", null),
    Banner_320x50("banner_320x50", Banner),
    Banner_300x250("banner_300x250", Banner),
    Banner_728x90("banner_728x90", Banner),
    Interstitial("interstitial", null),
    InterstitialVideo("interstitial_video", Interstitial),
    InterstitialStatic("interstitial_static", Interstitial),
    Rewarded("rewarded", null),
    RewardedVideo(com.appodeal.ads.modules.common.internal.Constants.REWARDED_VIDEO, Rewarded),
    RewardedStatic("rewarded_static", Rewarded),
    Native("native", null);


    @Nullable
    private final AdsFormat parent;

    @NonNull
    private final String remoteName;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f79099a;

        static {
            int[] iArr = new int[AdsFormat.values().length];
            f79099a = iArr;
            try {
                iArr[AdsFormat.Native.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79099a[AdsFormat.RewardedVideo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79099a[AdsFormat.RewardedStatic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f79099a[AdsFormat.Rewarded.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f79099a[AdsFormat.InterstitialVideo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f79099a[AdsFormat.InterstitialStatic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f79099a[AdsFormat.Interstitial.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f79099a[AdsFormat.Banner_728x90.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f79099a[AdsFormat.Banner_300x250.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f79099a[AdsFormat.Banner_320x50.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f79099a[AdsFormat.Banner.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    AdsFormat(@NonNull String str, @Nullable AdsFormat adsFormat) {
        this.remoteName = str;
        this.parent = adsFormat;
    }

    @Nullable
    public static AdsFormat byRemoteName(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (AdsFormat adsFormat : values()) {
            if (adsFormat.remoteName.equals(str)) {
                return adsFormat;
            }
        }
        return null;
    }

    @NonNull
    public static AdsFormat fromAdFormat(@Nullable AdFormat adFormat) {
        if (adFormat instanceof AdFormat.Native) {
            return Native;
        }
        if (adFormat instanceof AdFormat.Rewarded) {
            AdContentType adContentType = ((AdFormat.Rewarded) adFormat).getAdContentType();
            return adContentType.equals(AdContentType.Video) ? RewardedVideo : adContentType.equals(AdContentType.Static) ? RewardedStatic : Rewarded;
        }
        if (adFormat instanceof AdFormat.Interstitial) {
            AdContentType adContentType2 = ((AdFormat.Interstitial) adFormat).getAdContentType();
            return adContentType2.equals(AdContentType.Video) ? InterstitialVideo : adContentType2.equals(AdContentType.Static) ? InterstitialStatic : Interstitial;
        }
        if (!(adFormat instanceof AdFormat.Banner)) {
            return Banner;
        }
        BannerAdSize bannerAdSize = ((AdFormat.Banner) adFormat).getBannerAdSize();
        return bannerAdSize.equals(BannerAdSize.Leaderboard) ? Banner_728x90 : bannerAdSize.equals(BannerAdSize.MediumRectangle) ? Banner_300x250 : bannerAdSize.equals(BannerAdSize.Banner) ? Banner_320x50 : Banner;
    }

    @NonNull
    public AdsType getAdsType() {
        return toAdFormat().getAdsType();
    }

    @Nullable
    public AdsFormat getParent() {
        return this.parent;
    }

    @NonNull
    public String getRemoteName() {
        return this.remoteName;
    }

    @NonNull
    public AdFormat toAdFormat() {
        return toAdFormat(null);
    }

    @NonNull
    public AdFormat toAdFormat(@Nullable AdContentType adContentType) {
        switch (a.f79099a[ordinal()]) {
            case 1:
                return new AdFormat.Native(MediaAssetType.DEFAULT);
            case 2:
                return new AdFormat.Rewarded(AdContentType.Video);
            case 3:
                return new AdFormat.Rewarded(AdContentType.Static);
            case 4:
                if (adContentType == null) {
                    adContentType = AdContentType.All;
                }
                return new AdFormat.Rewarded(adContentType);
            case 5:
                return new AdFormat.Interstitial(AdContentType.Video);
            case 6:
                return new AdFormat.Interstitial(AdContentType.Static);
            case 7:
                if (adContentType == null) {
                    adContentType = AdContentType.All;
                }
                return new AdFormat.Interstitial(adContentType);
            case 8:
                return new AdFormat.Banner(BannerAdSize.Leaderboard);
            case 9:
                return new AdFormat.Banner(BannerAdSize.MediumRectangle);
            case 10:
                return new AdFormat.Banner(BannerAdSize.Banner);
            default:
                return new AdFormat.Banner(BannerAdSize.Undefined);
        }
    }
}
