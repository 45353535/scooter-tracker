package org.bidon.sdk.ads.ext;

import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.models.BannerRequest;
import org.bidon.sdk.auction.models.InterstitialRequest;
import org.bidon.sdk.auction.models.RewardedRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"asAdRequestBody", "Lkotlin/Triple;", "Lorg/bidon/sdk/auction/models/BannerRequest;", "Lorg/bidon/sdk/auction/models/InterstitialRequest;", "Lorg/bidon/sdk/auction/models/RewardedRequest;", "Lorg/bidon/sdk/auction/AdTypeParam;", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AdTypeParamExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerFormat.values().length];
            try {
                iArr[BannerFormat.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerFormat.LeaderBoard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerFormat.MRec.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerFormat.Adaptive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Triple asAdRequestBody(@NotNull AdTypeParam adTypeParam) {
        BannerRequest.StatFormat statFormat;
        Intrinsics.checkNotNullParameter(adTypeParam, "<this>");
        if (!(adTypeParam instanceof AdTypeParam.Banner)) {
            if (adTypeParam instanceof AdTypeParam.Interstitial) {
                return new Triple(null, InterstitialRequest.INSTANCE, null);
            }
            if (adTypeParam instanceof AdTypeParam.Rewarded) {
                return new Triple(null, null, RewardedRequest.INSTANCE);
            }
            throw new m();
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[((AdTypeParam.Banner) adTypeParam).getBannerFormat().ordinal()];
        if (i10 == 1) {
            statFormat = BannerRequest.StatFormat.BANNER_320x50;
        } else if (i10 == 2) {
            statFormat = BannerRequest.StatFormat.LEADERBOARD_728x90;
        } else if (i10 == 3) {
            statFormat = BannerRequest.StatFormat.MREC_300x250;
        } else {
            if (i10 != 4) {
                throw new m();
            }
            statFormat = BannerRequest.StatFormat.ADAPTIVE_BANNER;
        }
        return new Triple(new BannerRequest(statFormat.getCode()), null, null);
    }
}
