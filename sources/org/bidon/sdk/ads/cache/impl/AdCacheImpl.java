package org.bidon.sdk.ads.cache.impl;

import com.ironsource.A1;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.y.z.w.s;
import eg.i;
import hg.l0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import lf.m;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.ads.cache.AdCache;
import org.bidon.sdk.ads.cache.Cacheable;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.Auction;
import org.bidon.sdk.auction.AuctionResolver;
import org.bidon.sdk.auction.models.AuctionResult;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.di.SimpleDiStorage;
import org.bidon.sdk.utils.ext.TagKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016JF\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001c0!2\u001a\u0010#\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001c0!H\u0016J\n\u0010%\u001a\u0004\u0018\u00010\u0013H\u0016J\n\u0010&\u001a\u0004\u0018\u00010\u0013H\u0016J\u000e\u0010'\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u001cH\u0016JF\u0010*\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001c0!2\u001a\u0010#\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001c0!H\u0002J\u0014\u0010+\u001a\u00020\u001f*\u00020\u001f2\u0006\u0010,\u001a\u00020-H\u0002J\u001e\u0010.\u001a\u0004\u0018\u00010\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0002\u00100J\u0012\u00101\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lorg/bidon/sdk/ads/cache/impl/AdCacheImpl;", "Lorg/bidon/sdk/ads/cache/AdCache;", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "resolver", "Lorg/bidon/sdk/auction/AuctionResolver;", "<init>", "(Lorg/bidon/sdk/adapter/DemandAd;Lkotlinx/coroutines/CoroutineScope;Lorg/bidon/sdk/auction/AuctionResolver;)V", "getDemandAd", "()Lorg/bidon/sdk/adapter/DemandAd;", s.z.f67720z, "", "isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "results", "", "Lorg/bidon/sdk/auction/models/AuctionResult;", "previousBidStat", "Lorg/bidon/sdk/stats/models/BidStat;", "previousDemandId", "settings", "Lorg/bidon/sdk/ads/cache/Cacheable$Settings;", A1.f40171f, "Lorg/bidon/sdk/auction/Auction;", "withSettings", "", Reporting.EventType.CACHE, "adTypeParam", "Lorg/bidon/sdk/auction/AdTypeParam;", "onSuccess", "Lkotlin/Function2;", "Lorg/bidon/sdk/ads/AuctionInfo;", "onFailure", "", "peek", "pop", "poll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "load", MenuActionType.COPY, "pricefloor", "", "updateCache", "winners", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdCacheImpl implements AdCache {

    @Nullable
    private Auction auction;

    @NotNull
    private final DemandAd demandAd;

    @NotNull
    private final MutableStateFlow isLoading;

    @Nullable
    private BidStat previousBidStat;

    @Nullable
    private String previousDemandId;

    @NotNull
    private final AuctionResolver resolver;

    @NotNull
    private final MutableStateFlow results;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private Cacheable.Settings settings;

    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: org.bidon.sdk.ads.cache.impl.AdCacheImpl$poll$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.ads.cache.impl.AdCacheImpl", f = "AdCacheImpl.kt", l = {63}, m = "poll")
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdCacheImpl.this.poll(this);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.ads.cache.impl.AdCacheImpl$updateCache$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.ads.cache.impl.AdCacheImpl", f = "AdCacheImpl.kt", l = {153}, m = "updateCache")
    static final class C58071 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C58071(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdCacheImpl.this.updateCache(null, this);
        }
    }

    public AdCacheImpl(@NotNull DemandAd demandAd, @NotNull CoroutineScope scope, @NotNull AuctionResolver resolver) {
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.demandAd = demandAd;
        this.scope = scope;
        this.resolver = resolver;
        this.tag = TagKt.getTAG(this) + "_" + getDemandAd().getAdType().getCode();
        this.isLoading = l0.a(Boolean.FALSE);
        this.results = l0.a(CollectionsKt.emptyList());
        this.settings = Cacheable.INSTANCE.getDefaultSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String asString(List<? extends AuctionResult> list) {
        return "(" + list.size() + ") " + CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: org.bidon.sdk.ads.cache.impl.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdCacheImpl.asString$lambda$13((AuctionResult) obj);
            }
        }, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence asString$lambda$13(AuctionResult auctionResult) {
        Intrinsics.checkNotNullParameter(auctionResult, "auctionResult");
        BidStat stats = auctionResult.getAdSource().getStats();
        return stats.getDemandId().getDemandId() + StringUtils.PROCESS_POSTFIX_DELIMITER + stats.getPrice();
    }

    private final AdTypeParam copy(AdTypeParam adTypeParam, double d10) {
        if (adTypeParam instanceof AdTypeParam.Banner) {
            AdTypeParam.Banner banner = (AdTypeParam.Banner) adTypeParam;
            return new AdTypeParam.Banner(banner.getActivity(), d10, banner.getAuctionKey(), banner.getBannerFormat(), banner.getContainerWidth());
        }
        if (adTypeParam instanceof AdTypeParam.Interstitial) {
            AdTypeParam.Interstitial interstitial = (AdTypeParam.Interstitial) adTypeParam;
            return new AdTypeParam.Interstitial(interstitial.getActivity(), d10, interstitial.getAuctionKey());
        }
        if (!(adTypeParam instanceof AdTypeParam.Rewarded)) {
            throw new m();
        }
        AdTypeParam.Rewarded rewarded = (AdTypeParam.Rewarded) adTypeParam;
        return new AdTypeParam.Rewarded(rewarded.getActivity(), d10, rewarded.getAuctionKey());
    }

    private final void load(AdTypeParam adTypeParam, final Function2<? super AuctionResult, ? super AuctionInfo, Unit> onSuccess, final Function2<? super AuctionInfo, ? super Throwable, Unit> onFailure) {
        Object value;
        Boolean bool;
        Auction auction;
        AdSource<?> adSource;
        BidStat stats;
        LogExtKt.logInfo(this.tag, "Cache started: " + asString((List) this.results.getValue()));
        if (((List) this.results.getValue()).size() >= this.settings.getMinCacheSize()) {
            LogExtKt.logInfo(this.tag, "Cache has enough ads");
            return;
        }
        MutableStateFlow mutableStateFlow = this.isLoading;
        do {
            value = mutableStateFlow.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!mutableStateFlow.b(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            LogExtKt.logInfo(this.tag, "Ad is already loading");
            return;
        }
        LogExtKt.logInfo(this.tag, "Cache ad: " + adTypeParam);
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(Auction.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.Auction");
            }
            auction = (Auction) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Auction.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.Auction");
            }
            auction = (Auction) objBuild;
        }
        this.auction = auction;
        DemandAd demandAd = getDemandAd();
        double pricefloor = adTypeParam.getPricefloor();
        AuctionResult auctionResult = (AuctionResult) CollectionsKt.firstOrNull((List) this.results.getValue());
        auction.start(demandAd, copy(adTypeParam, Math.max(pricefloor, (auctionResult == null || (adSource = auctionResult.getAdSource()) == null || (stats = adSource.getStats()) == null) ? 0.0d : stats.getPrice())), new Function2() { // from class: org.bidon.sdk.ads.cache.impl.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AdCacheImpl.load$lambda$6(this.f97607b, onSuccess, (List) obj, (AuctionInfo) obj2);
            }
        }, new Function2() { // from class: org.bidon.sdk.ads.cache.impl.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AdCacheImpl.load$lambda$7(this.f97609b, onFailure, (AuctionInfo) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit load$lambda$6(AdCacheImpl adCacheImpl, Function2 function2, List winners, AuctionInfo auctionInfo) {
        Intrinsics.checkNotNullParameter(winners, "winners");
        Intrinsics.checkNotNullParameter(auctionInfo, "auctionInfo");
        i.d(adCacheImpl.scope, null, null, new AdCacheImpl$load$2$1(adCacheImpl, winners, function2, auctionInfo, null), 3, null);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit load$lambda$7(AdCacheImpl adCacheImpl, Function2 function2, AuctionInfo auctionInfo, Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        i.d(adCacheImpl.scope, null, null, new AdCacheImpl$load$3$1(adCacheImpl, function2, auctionInfo, cause, null), 3, null);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateCache(java.util.List<? extends org.bidon.sdk.auction.models.AuctionResult> r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.ads.cache.impl.AdCacheImpl.updateCache(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // org.bidon.sdk.ads.cache.AdCache
    public void cache(@NotNull AdTypeParam adTypeParam, @NotNull Function2<? super AuctionResult, ? super AuctionInfo, Unit> onSuccess, @NotNull Function2<? super AuctionInfo, ? super Throwable, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(adTypeParam, "adTypeParam");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        load(adTypeParam, onSuccess, onFailure);
    }

    @Override // org.bidon.sdk.ads.cache.AdCache
    public void clear() {
        Object value;
        List list;
        Object value2;
        Boolean bool;
        MutableStateFlow mutableStateFlow = this.results;
        do {
            value = mutableStateFlow.getValue();
            list = (List) value;
        } while (!mutableStateFlow.b(value, CollectionsKt.emptyList()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AuctionResult) it.next()).getAdSource().destroy();
        }
        MutableStateFlow mutableStateFlow2 = this.isLoading;
        do {
            value2 = mutableStateFlow2.getValue();
            bool = (Boolean) value2;
            bool.getClass();
        } while (!mutableStateFlow2.b(value2, Boolean.FALSE));
        if (bool.booleanValue()) {
            LogExtKt.logInfo(this.tag, "Ad is loading, cancel auction");
            Auction auction = this.auction;
            if (auction != null) {
                auction.cancel();
            }
            this.auction = null;
        }
    }

    @Override // org.bidon.sdk.ads.cache.AdCache
    @NotNull
    public DemandAd getDemandAd() {
        return this.demandAd;
    }

    @Override // org.bidon.sdk.ads.cache.AdCache
    @Nullable
    public AuctionResult peek() {
        return (AuctionResult) CollectionsKt.firstOrNull((List) this.results.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // org.bidon.sdk.ads.cache.AdCache
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object poll(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof org.bidon.sdk.ads.cache.impl.AdCacheImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            org.bidon.sdk.ads.cache.impl.AdCacheImpl$poll$1 r0 = (org.bidon.sdk.ads.cache.impl.AdCacheImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            org.bidon.sdk.ads.cache.impl.AdCacheImpl$poll$1 r0 = new org.bidon.sdk.ads.cache.impl.AdCacheImpl$poll$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            org.bidon.sdk.ads.cache.impl.AdCacheImpl r0 = (org.bidon.sdk.ads.cache.impl.AdCacheImpl) r0
            kotlin.d.b(r6)
            goto L4c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.d.b(r6)
            kotlinx.coroutines.flow.MutableStateFlow r6 = r5.results
            org.bidon.sdk.ads.cache.impl.AdCacheImpl$poll$next$1 r2 = new org.bidon.sdk.ads.cache.impl.AdCacheImpl$poll$next$1
            r4 = 0
            r2.<init>(r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = hg.i.y(r6, r2, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
        L4c:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = kotlin.collections.CollectionsKt.first(r6)
            org.bidon.sdk.auction.models.AuctionResult r6 = (org.bidon.sdk.auction.models.AuctionResult) r6
            org.bidon.sdk.adapter.AdSource r1 = r6.getAdSource()
            org.bidon.sdk.stats.models.BidStat r1 = r1.getStats()
            org.bidon.sdk.adapter.DemandId r1 = r1.getDemandId()
            java.lang.String r1 = r1.getDemandId()
            r0.previousDemandId = r1
            org.bidon.sdk.adapter.AdSource r1 = r6.getAdSource()
            org.bidon.sdk.stats.models.BidStat r1 = r1.getStats()
            r0.previousBidStat = r1
            kotlinx.coroutines.flow.MutableStateFlow r0 = r0.results
        L72:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.CollectionsKt.minus(r2, r6)
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L72
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.ads.cache.impl.AdCacheImpl.poll(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // org.bidon.sdk.ads.cache.AdCache
    @Nullable
    public AuctionResult pop() {
        Object value;
        List list;
        MutableStateFlow mutableStateFlow = this.results;
        do {
            value = mutableStateFlow.getValue();
            list = (List) value;
        } while (!mutableStateFlow.b(value, CollectionsKt.drop(list, 1)));
        return (AuctionResult) CollectionsKt.firstOrNull(list);
    }

    @Override // org.bidon.sdk.ads.cache.Cacheable
    public void withSettings(@NotNull Cacheable.Settings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.settings = settings;
    }
}
