package io.bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010&\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingAdapter;", "Lio/bidmachine/HeaderBiddingAdapter;", "<init>", "()V", "", "enabled", "", "setLogging", "(Z)V", "Lod/e;", "createBanner", "()Lod/e;", "Lod/h;", "createInterstitial", "()Lod/h;", "createRewarded", "Lio/bidmachine/ContextProvider;", "contextProvider", "isNetworkInitialized", "(Lio/bidmachine/ContextProvider;)Z", "isNetworkInitializationStatusCheckSupported", "()Z", "Lio/bidmachine/InitializationParams;", "initializationParams", "Lio/bidmachine/NetworkConfigParams;", "networkConfigParams", "Lio/bidmachine/NetworkInitializationCallback;", "callback", "onNetworkInitialize", "(Lio/bidmachine/ContextProvider;Lio/bidmachine/InitializationParams;Lio/bidmachine/NetworkConfigParams;Lio/bidmachine/NetworkInitializationCallback;)V", "Lod/d;", "adRequestParams", "Lio/bidmachine/NetworkAdUnit;", "networkAdUnit", "Lio/bidmachine/HeaderBiddingAdRequestParams;", "hbAdRequestParams", "Lio/bidmachine/HeaderBiddingCollectParamsCallback;", "collectCallback", "onCollectHeaderBiddingParams", "(Lio/bidmachine/ContextProvider;Lod/d;Lio/bidmachine/NetworkAdUnit;Lio/bidmachine/HeaderBiddingAdRequestParams;Lio/bidmachine/HeaderBiddingCollectParamsCallback;)V", com.taurusx.tax.f.y.f66058y, "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingAdapter extends HeaderBiddingAdapter {

    @NotNull
    public static final String ADAPTER_SDK_VERSION_NAME = "3.5.0";

    @NotNull
    public static final String ADAPTER_VERSION_NAME = "3.5.0.1";

    @NotNull
    public static final String KEY = "adaptive_rendering";

    public AdaptiveRenderingAdapter() {
        super(KEY, "3.5.0", "3.5.0.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    @NotNull
    public od.e createBanner() {
        return new AdaptiveRenderingBannerAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    @NotNull
    public od.h createInterstitial() {
        return new AdaptiveRenderingFullscreenAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    @NotNull
    public od.h createRewarded() {
        return new AdaptiveRenderingFullscreenAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return false;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(@NotNull ContextProvider contextProvider) throws Throwable {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        return false;
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    protected void onCollectHeaderBiddingParams(@NotNull ContextProvider contextProvider, @NotNull od.d adRequestParams, @NotNull NetworkAdUnit networkAdUnit, @NotNull HeaderBiddingAdRequestParams hbAdRequestParams, @NotNull HeaderBiddingCollectParamsCallback collectCallback) throws Throwable {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
        Intrinsics.checkNotNullParameter(networkAdUnit, "networkAdUnit");
        Intrinsics.checkNotNullParameter(hbAdRequestParams, "hbAdRequestParams");
        Intrinsics.checkNotNullParameter(collectCallback, "collectCallback");
        HashMap map = new HashMap();
        String[] strArrB = io.bidmachine.iab.mraid.j.b(contextProvider.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(strArrB, "getSupportedFeatures(con….getApplicationContext())");
        map.put(AdaptiveRenderingConfig.NATIVE_FEATURES_KEY, ArraysKt.joinToString$default(strArrB, StringUtils.COMMA, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        collectCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    protected void onNetworkInitialize(@NotNull ContextProvider contextProvider, @NotNull InitializationParams initializationParams, @NotNull NetworkConfigParams networkConfigParams, @NotNull NetworkInitializationCallback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initializationParams, "initializationParams");
        Intrinsics.checkNotNullParameter(networkConfigParams, "networkConfigParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final Context applicationContext = contextProvider.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "contextProvider.getApplicationContext()");
        m9.c.f(applicationContext);
        ec.a.f69047a.d(applicationContext, new Function0<qd.a>() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingAdapter.onNetworkInitialize.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final qd.a invoke() {
                return h9.a.b(applicationContext);
            }
        });
        callback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean enabled) throws Throwable {
        ec.a.f69047a.e(enabled);
    }
}
