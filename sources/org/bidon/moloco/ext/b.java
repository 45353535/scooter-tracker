package org.bidon.moloco.ext;

import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MolocoAdError.ErrorType.values().length];
            try {
                iArr[MolocoAdError.ErrorType.AD_LOAD_FAILED_SDK_NOT_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MolocoAdError.ErrorType.SDK_INIT_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MolocoAdError.ErrorType.AD_LOAD_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MolocoAdError.ErrorType.AD_LOAD_BID_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MolocoAdError.ErrorType.AD_SHOW_ERROR_NOT_LOADED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BannerFormat.values().length];
            try {
                iArr2[BannerFormat.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BannerFormat.LeaderBoard.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BannerFormat.MRec.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BannerFormat.Adaptive.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void b(Moloco moloco, final BannerFormat bannerSize, String adUnitId, final Function2 callback) {
        Intrinsics.checkNotNullParameter(moloco, "<this>");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Function2 function2 = new Function2() { // from class: org.bidon.moloco.ext.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return b.c(callback, bannerSize, (Banner) obj, (MolocoAdError.AdCreateError) obj2);
            }
        };
        try {
            int i10 = a.$EnumSwitchMapping$1[bannerSize.ordinal()];
            if (i10 == 1) {
                Moloco.createBanner(new MediationInfo(""), adUnitId, "", function2);
                return;
            }
            if (i10 == 2) {
                Moloco.createBannerTablet(new MediationInfo(""), adUnitId, "", function2);
            } else if (i10 == 3) {
                Moloco.createMREC(new MediationInfo(""), adUnitId, "", function2);
            } else {
                if (i10 != 4) {
                    throw new m();
                }
                callback.invoke(null, new IllegalStateException("Adaptive format should have been resolved"));
            }
        } catch (Throwable th2) {
            callback.invoke(null, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function2 function2, BannerFormat bannerFormat, Banner banner, MolocoAdError.AdCreateError adCreateError) {
        if (banner != null) {
            function2.invoke(banner, null);
        } else {
            function2.invoke(null, new Exception(bannerFormat.name() + " wasn't created. Error: " + (adCreateError != null ? adCreateError.getDescription() : null) + ", code: " + (adCreateError != null ? Integer.valueOf(adCreateError.getErrorCode()) : null)));
        }
        return Unit.f93236a;
    }

    public static final BidonError d(MolocoAdError molocoAdError) {
        Intrinsics.checkNotNullParameter(molocoAdError, "<this>");
        int i10 = a.$EnumSwitchMapping$0[molocoAdError.getErrorType().ordinal()];
        return (i10 == 1 || i10 == 2) ? BidonError.SdkNotInitialized.INSTANCE : i10 != 3 ? i10 != 4 ? i10 != 5 ? new BidonError.Unspecified(org.bidon.moloco.a.a(), null, molocoAdError.getDescription(), 2, null) : new BidonError.NoFill(org.bidon.moloco.a.a()) : new BidonError.FillTimedOut(org.bidon.moloco.a.a()) : new BidonError.NoFill(org.bidon.moloco.a.a());
    }

    public static final BidonError e(MolocoAdError molocoAdError) {
        Intrinsics.checkNotNullParameter(molocoAdError, "<this>");
        return a.$EnumSwitchMapping$0[molocoAdError.getErrorType().ordinal()] == 6 ? BidonError.AdNotReady.INSTANCE : new BidonError.Unspecified(org.bidon.moloco.a.a(), null, molocoAdError.getDescription(), 2, null);
    }
}
