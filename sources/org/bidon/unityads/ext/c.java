package org.bidon.unityads.ext;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[UnityAds.UnityAdsLoadError.values().length];
            try {
                iArr[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[UnityAds.UnityAdsShowError.values().length];
            try {
                iArr2[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BannerErrorCode.values().length];
            try {
                iArr3[BannerErrorCode.NATIVE_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[BannerErrorCode.NO_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final BidonError a(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i10 = unityAdsLoadError == null ? -1 : a.$EnumSwitchMapping$0[unityAdsLoadError.ordinal()];
        return i10 != -1 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new BidonError.Unspecified(org.bidon.unityads.a.a(), new Throwable(unityAdsLoadError.name()), null, 4, null) : BidonError.NoAppropriateAdUnitId.INSTANCE : new BidonError.BidTimedOut(org.bidon.unityads.a.a()) : new BidonError.NoFill(org.bidon.unityads.a.a()) : new BidonError.InternalServerSdkError("UnityAdsLoadError.INTERNAL_ERROR") : new BidonError.Unspecified(org.bidon.unityads.a.a(), null, null, 6, null);
    }

    public static final BidonError b(UnityAds.UnityAdsShowError unityAdsShowError) {
        int i10 = unityAdsShowError == null ? -1 : a.$EnumSwitchMapping$1[unityAdsShowError.ordinal()];
        return i10 != -1 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new BidonError.Unspecified(org.bidon.unityads.a.a(), new Throwable(unityAdsShowError.name()), null, 4, null) : new BidonError.FillTimedOut(org.bidon.unityads.a.a()) : BidonError.NoAppropriateAdUnitId.INSTANCE : new BidonError.NetworkError(org.bidon.unityads.a.a(), null, 2, null) : BidonError.AdNotReady.INSTANCE : new BidonError.Unspecified(org.bidon.unityads.a.a(), null, null, 6, null);
    }

    public static final BidonError c(BannerErrorInfo bannerErrorInfo) {
        BannerErrorCode bannerErrorCode = bannerErrorInfo != null ? bannerErrorInfo.errorCode : null;
        int i10 = bannerErrorCode == null ? -1 : a.$EnumSwitchMapping$2[bannerErrorCode.ordinal()];
        if (i10 == -1) {
            return new BidonError.Unspecified(org.bidon.unityads.a.a(), null, null, 6, null);
        }
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return new BidonError.NoFill(org.bidon.unityads.a.a());
        }
        return new BidonError.Unspecified(org.bidon.unityads.a.a(), new Throwable("Message: " + bannerErrorInfo.errorMessage + ". Code: " + bannerErrorInfo.errorCode), null, 4, null);
    }
}
