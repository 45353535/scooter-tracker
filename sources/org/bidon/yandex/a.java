package org.bidon.yandex;

import android.content.Context;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.common.BidderTokenLoader;
import com.yandex.mobile.ads.common.BidderTokenRequestConfiguration;
import com.yandex.mobile.ads.common.MobileAds;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.e;
import lf.m;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: org.bidon.yandex.a$a, reason: collision with other inner class name */
    public static final class C1153a implements BidderTokenLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdType f97861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f97862b;

        C1153a(AdType adType, CancellableContinuation cancellableContinuation) {
            this.f97861a = adType;
            this.f97862b = cancellableContinuation;
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenLoadListener
        public void onBidderTokenFailedToLoad(String failureReason) {
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            LogExtKt.logError("GetYandexTokenUseCase", "Error while loading bidder token for " + this.f97861a + ": " + failureReason, BidonError.NoBid.INSTANCE);
            this.f97862b.resumeWith(Result.b(null));
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenLoadListener
        public void onBidderTokenLoaded(String bidderToken) {
            Intrinsics.checkNotNullParameter(bidderToken, "bidderToken");
            LogExtKt.logInfo("GetYandexTokenUseCase", "Loaded bidder token for " + this.f97861a);
            this.f97862b.resumeWith(Result.b(bidderToken));
        }
    }

    public final Object a(AdTypeParam adTypeParam, Continuation continuation) {
        AdType adType;
        e eVar = new e(pf.b.d(continuation), 1);
        eVar.I();
        if (adTypeParam instanceof AdTypeParam.Banner) {
            adType = AdType.BANNER;
        } else if (adTypeParam instanceof AdTypeParam.Interstitial) {
            adType = AdType.INTERSTITIAL;
        } else {
            if (!(adTypeParam instanceof AdTypeParam.Rewarded)) {
                throw new m();
            }
            adType = AdType.REWARDED;
        }
        BidderTokenRequestConfiguration.Builder builder = new BidderTokenRequestConfiguration.Builder(adType);
        Context applicationContext = adTypeParam.getActivity().getApplicationContext();
        if (adTypeParam instanceof AdTypeParam.Banner) {
            BannerFormat bannerFormat = ((AdTypeParam.Banner) adTypeParam).getBannerFormat();
            Intrinsics.checkNotNull(applicationContext);
            builder.setBannerAdSize(org.bidon.yandex.ext.a.e(bannerFormat, applicationContext));
        }
        builder.setParameters(MapsKt.mapOf(TuplesKt.to("adapter_network_name", "Bidon"), TuplesKt.to("adapter_version", MobileAds.getLibraryVersion()), TuplesKt.to("adapter_network_sdk_version", "0.13.0")));
        Intrinsics.checkNotNull(applicationContext);
        BidderTokenLoader.loadBidderToken(applicationContext, builder.build(), new C1153a(adType, eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC;
    }
}
