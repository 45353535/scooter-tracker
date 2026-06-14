package com.yandex.mobile.ads.common;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.common.BidderTokenRequestConfiguration;
import eg.m1;
import eg.o0;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import lf.m;
import org.jetbrains.annotations.NotNull;
import yads.a92;
import yads.co3;
import yads.dr2;
import yads.er2;
import yads.gl0;
import yads.hl0;
import yads.k10;
import yads.pd;
import yads.pr3;
import yads.qz;
import yads.rs2;
import yads.v5;
import yads.vo;
import yads.wq2;
import yads.y13;
import yads.z13;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenLoader;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration;", "bidderTokenRequestConfiguration", "Lcom/yandex/mobile/ads/common/BidderTokenLoadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "loadBidderToken", "(Landroid/content/Context;Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration;Lcom/yandex/mobile/ads/common/BidderTokenLoadListener;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public abstract class BidderTokenLoader {
    public static final void loadBidderToken(@NotNull Context context, @NotNull BidderTokenRequestConfiguration bidderTokenRequestConfiguration, @NotNull BidderTokenLoadListener listener) {
        qz qzVar;
        BannerAdSize bannerAdSize;
        pr3 pr3Var = new pr3(context);
        co3 co3Var = new co3(listener);
        boolean z10 = bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.Banner;
        if (z10) {
            qzVar = qz.f115221d;
        } else if (bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.Interstitial) {
            qzVar = qz.f115222e;
        } else if (bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.Rewarded) {
            qzVar = qz.f115223f;
        } else if (bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.Native) {
            qzVar = qz.f115224g;
        } else {
            if (!(bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.AppOpenAd)) {
                throw new m();
            }
            qzVar = qz.f115226i;
        }
        vo voVar = new vo(qzVar, (!z10 || (bannerAdSize = bidderTokenRequestConfiguration.getBannerAdSize()) == null) ? null : com.yandex.mobile.ads.banner.a.a(bannerAdSize).f115879a, bidderTokenRequestConfiguration.getParameters());
        CoroutineScope coroutineScopeA = i.a(m1.b(null, 1, null).plus(o0.b()).plus(new k10(pr3Var.a())));
        Context applicationContext = context.getApplicationContext();
        v5 v5Var = new v5();
        hl0 hl0Var = hl0.f111625c;
        hl0 hl0VarA = gl0.a(applicationContext);
        pd pdVar = new pd();
        rs2 rs2Var = new rs2(applicationContext, pr3Var, coroutineScopeA, v5Var, hl0VarA, pdVar, 2097088);
        z13 z13Var = z13.f118512b;
        eg.i.d(coroutineScopeA, null, null, new dr2(new er2(coroutineScopeA, applicationContext, v5Var, hl0VarA, pdVar, rs2Var, y13.a(), new wq2(v5Var), new a92(v5Var, pr3Var.a())), voVar, co3Var, null), 3, null);
    }
}
