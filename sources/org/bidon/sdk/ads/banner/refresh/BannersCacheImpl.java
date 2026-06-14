package org.bidon.sdk.ads.banner.refresh;

import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.BannerListener;
import org.bidon.sdk.ads.banner.BannerView;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.databinders.extras.Extras;
import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.ext.TagKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jn\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110\u001c2\u001a\u0010\u001d\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110\u001eH\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J>\u0010!\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f*\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000bH\u0002J,\u0010\"\u001a\u00020\u0011*\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010#\u001a\u00020\u000fH\u0002J\u0014\u0010$\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lorg/bidon/sdk/ads/banner/refresh/BannersCacheImpl;", "Lorg/bidon/sdk/ads/banner/refresh/BannersCache;", "<init>", "()V", "Tag", "", "getTag", "()Ljava/lang/String;", "isLoading", "Ljava/util/concurrent/atomic/AtomicBoolean;", Reporting.EventType.CACHE, "Ljava/util/SortedMap;", "Lkotlin/Pair;", "Lorg/bidon/sdk/ads/Ad;", "Lorg/bidon/sdk/ads/AuctionInfo;", "Lorg/bidon/sdk/ads/banner/BannerView;", "get", "", "activity", "Landroid/app/Activity;", "format", "Lorg/bidon/sdk/ads/banner/BannerFormat;", "pricefloor", "", "auctionKey", HandleInvocationsFromAdViewer.KEY_EXTRAS, "Lorg/bidon/sdk/databinders/extras/Extras;", "onLoaded", "Lkotlin/Function3;", "onFailed", "Lkotlin/Function2;", "Lorg/bidon/sdk/config/BidonError;", "clear", "pop", "removeBannerView", "banner", "setExtras", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BannersCacheImpl implements BannersCache {

    @NotNull
    private final SortedMap<Pair<Ad, AuctionInfo>, BannerView> cache;

    @NotNull
    private final AtomicBoolean isLoading = new AtomicBoolean(false);

    public BannersCacheImpl() {
        final Function2 function2 = new Function2() { // from class: org.bidon.sdk.ads.banner.refresh.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(BannersCacheImpl.cache$lambda$0((Pair) obj, (Pair) obj2));
            }
        };
        this.cache = MapsKt.sortedMapOf(new Comparator() { // from class: org.bidon.sdk.ads.banner.refresh.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BannersCacheImpl.cache$lambda$1(function2, obj, obj2);
            }
        }, new Pair[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cache$lambda$0(Pair pair, Pair pair2) {
        return (int) ((((Ad) pair2.getFirst()).getPrice() - ((Ad) pair.getFirst()).getPrice()) * ((double) 1000000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cache$lambda$1(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void get$lambda$2(Function3 function3, Pair pair, BannerView bannerView) {
        function3.invoke(pair.getFirst(), pair.getSecond(), bannerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void get$lambda$3(Activity activity, String str, final BannersCacheImpl bannersCacheImpl, Extras extras, BannerFormat bannerFormat, double d10, final Function3 function3, final Function2 function2) {
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        final BannerView bannerView = new BannerView(applicationContext, null, 0, str, null, 22, null);
        bannersCacheImpl.setExtras(bannerView, extras);
        bannerView.setBannerFormat(bannerFormat);
        bannerView.setBannerListener(new BannerListener() { // from class: org.bidon.sdk.ads.banner.refresh.BannersCacheImpl$get$2$1
            @Override // org.bidon.sdk.ads.AdListener
            public void onAdClicked(Ad ad2) {
                BannerListener.DefaultImpls.onAdClicked(this, ad2);
            }

            @Override // org.bidon.sdk.ads.AdListener
            public void onAdExpired(Ad ad2) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
                BannersCacheImpl bannersCacheImpl2 = this.this$0;
                bannersCacheImpl2.removeBannerView(bannersCacheImpl2.cache, bannerView);
            }

            @Override // org.bidon.sdk.ads.AdListener
            public void onAdLoadFailed(AuctionInfo auctionInfo, BidonError cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                LogExtKt.logInfo(this.this$0.getTag(), "Banner load failed: " + cause);
                function2.invoke(auctionInfo, cause);
                this.this$0.isLoading.set(false);
            }

            @Override // org.bidon.sdk.ads.AdListener
            public void onAdLoaded(Ad ad2, AuctionInfo auctionInfo) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
                Intrinsics.checkNotNullParameter(auctionInfo, "auctionInfo");
                LogExtKt.logInfo(this.this$0.getTag(), "Banner loaded: " + ad2);
                function3.invoke(ad2, auctionInfo, bannerView);
                this.this$0.isLoading.set(false);
            }

            @Override // org.bidon.sdk.ads.AdListener
            public void onAdShowFailed(BidonError bidonError) {
                BannerListener.DefaultImpls.onAdShowFailed(this, bidonError);
            }

            @Override // org.bidon.sdk.ads.AdListener
            public void onAdShown(Ad ad2) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
            }

            @Override // org.bidon.sdk.logs.analytic.AdRevenueListener
            public void onRevenuePaid(Ad ad2, AdValue adValue) {
                BannerListener.DefaultImpls.onRevenuePaid(this, ad2, adValue);
            }
        });
        bannerView.loadAd(activity, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTag() {
        return TagKt.getTAG(this);
    }

    private final Pair<Pair<Ad, AuctionInfo>, BannerView> pop(SortedMap<Pair<Ad, AuctionInfo>, BannerView> sortedMap) {
        Pair<Ad, AuctionInfo> pairFirstKey;
        BannerView bannerView;
        if (sortedMap.isEmpty() || (bannerView = sortedMap.get((pairFirstKey = sortedMap.firstKey()))) == null) {
            return null;
        }
        sortedMap.remove(pairFirstKey);
        LogExtKt.logInfo(getTag(), "Banner popped from cache: " + bannerView + ", " + pairFirstKey);
        return TuplesKt.to(pairFirstKey, bannerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeBannerView(SortedMap<Pair<Ad, AuctionInfo>, BannerView> sortedMap, BannerView bannerView) {
        if (sortedMap.containsValue(bannerView)) {
            LogExtKt.logInfo(getTag(), "Banner expired and will be removed from cache: " + bannerView);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Pair<Ad, AuctionInfo>, BannerView> entry : sortedMap.entrySet()) {
                if (Intrinsics.areEqual(bannerView, entry.getValue())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            sortedMap.remove((Pair) ((Map.Entry) CollectionsKt.first(linkedHashMap.entrySet())).getKey());
        }
    }

    private final void setExtras(BannerView bannerView, Extras extras) {
        for (Map.Entry<String, Object> entry : extras.getExtras().entrySet()) {
            bannerView.addExtra(entry.getKey(), entry.getValue());
        }
    }

    @Override // org.bidon.sdk.ads.banner.refresh.BannersCache
    public void clear() {
        this.cache.clear();
    }

    @Override // org.bidon.sdk.ads.banner.refresh.BannersCache
    public void get(@NotNull final Activity activity, @NotNull final BannerFormat format, final double pricefloor, @Nullable final String auctionKey, @NotNull final Extras extras, @NotNull final Function3<? super Ad, ? super AuctionInfo, ? super BannerView, Unit> onLoaded, @NotNull final Function2<? super AuctionInfo, ? super BidonError, Unit> onFailed) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(onLoaded, "onLoaded");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        if (this.cache.isEmpty()) {
            if (this.isLoading.getAndSet(true)) {
                return;
            }
            activity.runOnUiThread(new Runnable() { // from class: org.bidon.sdk.ads.banner.refresh.b
                @Override // java.lang.Runnable
                public final void run() {
                    BannersCacheImpl.get$lambda$3(activity, auctionKey, this, extras, format, pricefloor, onLoaded, onFailed);
                }
            });
        } else {
            Pair<Pair<Ad, AuctionInfo>, BannerView> pairPop = pop(this.cache);
            if (pairPop == null) {
                return;
            }
            final Pair<Ad, AuctionInfo> pairComponent1 = pairPop.component1();
            final BannerView bannerViewComponent2 = pairPop.component2();
            activity.runOnUiThread(new Runnable() { // from class: org.bidon.sdk.ads.banner.refresh.a
                @Override // java.lang.Runnable
                public final void run() {
                    BannersCacheImpl.get$lambda$2(onLoaded, pairComponent1, bannerViewComponent2);
                }
            });
        }
    }
}
