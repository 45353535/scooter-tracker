package com.appodeal.ads.adapters.bidonmediation.usecases;

import com.appodeal.ads.adapters.bidonmediation.AdmobBannerAuctionParams;
import com.appodeal.ads.adapters.bidonmediation.AdmobFullscreenAdAuctionParams;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.adapter.AdAuctionParamSource;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.ads.AdType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/appodeal/ads/adapters/bidonmediation/usecases/GetAdAuctionParamsUseCase;", "", "<init>", "()V", "invoke", "Lkotlin/Result;", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "auctionParamsScope", "Lorg/bidon/sdk/adapter/AdAuctionParamSource;", "adType", "Lorg/bidon/sdk/ads/AdType;", "invoke-gIAlu-s", "(Lorg/bidon/sdk/adapter/AdAuctionParamSource;Lorg/bidon/sdk/ads/AdType;)Ljava/lang/Object;", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetAdAuctionParamsUseCase {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdType.values().length];
            try {
                iArr[AdType.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdType.Interstitial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdType.Rewarded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdAuctionParams invoke_gIAlu_s$lambda$0(AdType adType, AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        int i10 = WhenMappings.$EnumSwitchMapping$0[adType.ordinal()];
        if (i10 == 1) {
            return new AdmobBannerAuctionParams(auctionParamsScope.getActivity(), auctionParamsScope.getBannerFormat(), auctionParamsScope.getAdUnit());
        }
        if (i10 == 2 || i10 == 3) {
            return new AdmobFullscreenAdAuctionParams(auctionParamsScope.getActivity(), auctionParamsScope.getAdUnit());
        }
        throw new m();
    }

    @NotNull
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4426invokegIAlus(@NotNull AdAuctionParamSource auctionParamsScope, @NotNull final AdType adType) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        Intrinsics.checkNotNullParameter(adType, "adType");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: com.appodeal.ads.adapters.bidonmediation.usecases.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GetAdAuctionParamsUseCase.invoke_gIAlu_s$lambda$0(adType, (AdAuctionParamSource) obj);
            }
        });
    }
}
