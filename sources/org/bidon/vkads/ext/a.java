package org.bidon.vkads.ext;

import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: org.bidon.vkads.ext.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1151a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerFormat.values().length];
            try {
                iArr[BannerFormat.LeaderBoard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerFormat.MRec.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerFormat.Banner.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerFormat.Adaptive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BidonError a(IAdLoadingError iAdLoadingError, BannerFormat bannerFormat) {
        Intrinsics.checkNotNullParameter(iAdLoadingError, "<this>");
        int code = iAdLoadingError.getCode();
        if (code != 1500 && code != 2000) {
            if (code == 2005) {
                DemandId demandIdA = org.bidon.vkads.a.a();
                String message = iAdLoadingError.getMessage();
                Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
                return new BidonError.IncorrectAdUnit(demandIdA, message);
            }
            if (code != 3000) {
                if (code == 3004) {
                    return bannerFormat != null ? new BidonError.AdFormatIsNotSupported(org.bidon.vkads.a.a().getDemandId(), bannerFormat) : new BidonError.Unspecified(org.bidon.vkads.a.a(), new Throwable(iAdLoadingError.getMessage()), null, 4, null);
                }
                switch (code) {
                    case 1001:
                        break;
                    case 1002:
                        return new BidonError.NetworkError(org.bidon.vkads.a.a(), null, 2, null);
                    case 1003:
                        return new BidonError.FillTimedOut(org.bidon.vkads.a.a());
                    default:
                        return new BidonError.NoFill(org.bidon.vkads.a.a());
                }
            }
        }
        return new BidonError.Unspecified(org.bidon.vkads.a.a(), new Throwable(iAdLoadingError.getMessage()), null, 4, null);
    }

    public static /* synthetic */ BidonError b(IAdLoadingError iAdLoadingError, BannerFormat bannerFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bannerFormat = null;
        }
        return a(iAdLoadingError, bannerFormat);
    }

    public static final MyTargetView.AdSize c(BannerFormat bannerFormat) {
        Intrinsics.checkNotNullParameter(bannerFormat, "<this>");
        int i10 = C1151a.$EnumSwitchMapping$0[bannerFormat.ordinal()];
        if (i10 == 1) {
            return MyTargetView.AdSize.ADSIZE_728x90;
        }
        if (i10 == 2) {
            return MyTargetView.AdSize.ADSIZE_300x250;
        }
        if (i10 == 3) {
            return MyTargetView.AdSize.ADSIZE_320x50;
        }
        if (i10 == 4) {
            return DeviceInfo.INSTANCE.isTablet() ? MyTargetView.AdSize.ADSIZE_728x90 : MyTargetView.AdSize.ADSIZE_320x50;
        }
        throw new m();
    }
}
