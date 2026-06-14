package org.bidon.sdk.auction.usecases.impl;

import com.ironsource.X0;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.adapter.AdProvider;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdaptersSource;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.ads.AdType;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.ResultsCollector;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.AuctionResult;
import org.bidon.sdk.auction.models.BannerRequest;
import org.bidon.sdk.auction.models.TokenInfo;
import org.bidon.sdk.auction.usecases.ExecuteAuctionUseCase;
import org.bidon.sdk.auction.usecases.RequestAdUnitUseCase;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Regulation;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.models.BidType;
import org.bidon.sdk.stats.models.RoundStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJx\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020#0\"H\u0096B¢\u0006\u0002\u0010$J.\u0010%\u001a\u00020\u000e2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010&\u001a\u00020'H\u0002J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010#H\u0002J\u001a\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010\fH\u0002JN\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u001bH\u0002J\u001c\u00104\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101*\u0002052\u0006\u00106\u001a\u000207H\u0002J\f\u00108\u001a\u000209*\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lorg/bidon/sdk/auction/usecases/impl/ExecuteAuctionUseCaseImpl;", "Lorg/bidon/sdk/auction/usecases/ExecuteAuctionUseCase;", "adaptersSource", "Lorg/bidon/sdk/adapter/AdaptersSource;", "requestAdUnit", "Lorg/bidon/sdk/auction/usecases/RequestAdUnitUseCase;", "regulation", "Lorg/bidon/sdk/regulation/Regulation;", "<init>", "(Lorg/bidon/sdk/adapter/AdaptersSource;Lorg/bidon/sdk/auction/usecases/RequestAdUnitUseCase;Lorg/bidon/sdk/regulation/Regulation;)V", "adUnitQueue", "Ljava/util/LinkedList;", "Lorg/bidon/sdk/auction/models/AdUnit;", "invoke", "", "auctionId", "", "auctionConfigurationId", "", "auctionConfigurationUid", "externalWinNotificationsEnabled", "", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "adTypeParam", "Lorg/bidon/sdk/auction/AdTypeParam;", "pricefloor", "", "auctionTimeout", X0.f42007c, "", "resultsCollector", "Lorg/bidon/sdk/auction/ResultsCollector;", "tokens", "", "Lorg/bidon/sdk/auction/models/TokenInfo;", "(Ljava/lang/String;JLjava/lang/String;ZLorg/bidon/sdk/adapter/DemandAd;Lorg/bidon/sdk/auction/AdTypeParam;DJLjava/util/List;Lorg/bidon/sdk/auction/ResultsCollector;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishWithStatus", "status", "Lorg/bidon/sdk/stats/models/RoundStatus;", "getBelowPriceFloorResult", "Lorg/bidon/sdk/auction/models/AuctionResult;", "adUnit", "tokenInfo", "shouldRequestNext", "auctionResult", "next", "applyParams", "adSource", "Lorg/bidon/sdk/adapter/AdSource;", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "auctionPricefloor", "getAdSources", "Lorg/bidon/sdk/adapter/Adapter;", "adType", "Lorg/bidon/sdk/ads/AdType;", "asStatisticAdType", "Lorg/bidon/sdk/stats/StatisticsCollector$AdType;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExecuteAuctionUseCaseImpl implements ExecuteAuctionUseCase {

    @NotNull
    private LinkedList<AdUnit> adUnitQueue;

    @NotNull
    private final AdaptersSource adaptersSource;

    @NotNull
    private final Regulation regulation;

    @NotNull
    private final RequestAdUnitUseCase requestAdUnit;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[BidType.values().length];
            try {
                iArr[BidType.RTB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BidType.CPM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdType.values().length];
            try {
                iArr2[AdType.Interstitial.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AdType.Rewarded.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AdType.Banner.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BannerFormat.values().length];
            try {
                iArr3[BannerFormat.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[BannerFormat.LeaderBoard.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[BannerFormat.MRec.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[BannerFormat.Adaptive.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.auction.usecases.impl.ExecuteAuctionUseCaseImpl$invoke$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.auction.usecases.impl.ExecuteAuctionUseCaseImpl", f = "ExecuteAuctionUseCaseImpl.kt", l = {55}, m = "invoke")
    static final class AnonymousClass1 extends d {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return ExecuteAuctionUseCaseImpl.this.invoke(null, 0L, null, false, null, null, 0.0d, 0L, null, null, null, this);
        }
    }

    public ExecuteAuctionUseCaseImpl(@NotNull AdaptersSource adaptersSource, @NotNull RequestAdUnitUseCase requestAdUnit, @NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(adaptersSource, "adaptersSource");
        Intrinsics.checkNotNullParameter(requestAdUnit, "requestAdUnit");
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        this.adaptersSource = adaptersSource;
        this.requestAdUnit = requestAdUnit;
        this.regulation = regulation;
        this.adUnitQueue = new LinkedList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyParams(String auctionId, long auctionConfigurationId, String auctionConfigurationUid, boolean externalWinNotificationsEnabled, AdSource<AdAuctionParams> adSource, AdTypeParam adTypeParam, DemandAd demandAd, double auctionPricefloor) {
        adSource.addRoundInfo(auctionId, demandAd, auctionPricefloor);
        adSource.setStatisticAdType(asStatisticAdType(adTypeParam));
        adSource.addAuctionConfigurationId(auctionConfigurationId);
        adSource.addAuctionConfigurationUid(auctionConfigurationUid);
        adSource.addExternalWinNotificationsEnabled(externalWinNotificationsEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StatisticsCollector.AdType asStatisticAdType(AdTypeParam adTypeParam) {
        BannerRequest.StatFormat statFormat;
        if (!(adTypeParam instanceof AdTypeParam.Banner)) {
            if (adTypeParam instanceof AdTypeParam.Interstitial) {
                return StatisticsCollector.AdType.Interstitial.INSTANCE;
            }
            if (adTypeParam instanceof AdTypeParam.Rewarded) {
                return StatisticsCollector.AdType.Rewarded.INSTANCE;
            }
            throw new m();
        }
        int i10 = WhenMappings.$EnumSwitchMapping$2[((AdTypeParam.Banner) adTypeParam).getBannerFormat().ordinal()];
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
        return new StatisticsCollector.AdType.Banner(statFormat);
    }

    private final void finishWithStatus(Map<String, TokenInfo> tokens, ResultsCollector resultsCollector, RoundStatus status) {
        for (AdUnit adUnit : this.adUnitQueue) {
            resultsCollector.add(new AuctionResult.AuctionFailed(adUnit, tokens != null ? tokens.get(adUnit.getDemandId()) : null, status));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdSource<AdAuctionParams> getAdSources(Adapter adapter, AdType adType) {
        Object objB;
        Object objB2;
        Object objB3;
        DemandId demandId = adapter.getDemandId();
        int i10 = WhenMappings.$EnumSwitchMapping$1[adType.ordinal()];
        if (i10 == 1) {
            AdProvider.Interstitial interstitial = adapter instanceof AdProvider.Interstitial ? (AdProvider.Interstitial) adapter : null;
            if (interstitial == null) {
                return null;
            }
            try {
                Result.Companion companion = Result.f93230c;
                AdSource.Interstitial interstitial2 = interstitial.interstitial();
                interstitial2.addDemandId(demandId);
                objB = Result.b(interstitial2);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            Throwable thG = Result.g(objB);
            if (thG != null) {
                LogExtKt.logError("ExecuteAuctionUseCase", "Failed to create interstitial ad source", thG);
            }
            return (AdSource.Interstitial) (Result.i(objB) ? null : objB);
        }
        if (i10 == 2) {
            AdProvider.Rewarded rewarded = adapter instanceof AdProvider.Rewarded ? (AdProvider.Rewarded) adapter : null;
            if (rewarded == null) {
                return null;
            }
            try {
                Result.Companion companion3 = Result.f93230c;
                AdSource.Rewarded rewarded2 = rewarded.rewarded();
                rewarded2.addDemandId(demandId);
                objB2 = Result.b(rewarded2);
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.f93230c;
                objB2 = Result.b(kotlin.d.a(th3));
            }
            Throwable thG2 = Result.g(objB2);
            if (thG2 != null) {
                LogExtKt.logError("ExecuteAuctionUseCase", "Failed to create rewarded ad source", thG2);
            }
            return (AdSource.Rewarded) (Result.i(objB2) ? null : objB2);
        }
        if (i10 != 3) {
            throw new m();
        }
        AdProvider.Banner banner = adapter instanceof AdProvider.Banner ? (AdProvider.Banner) adapter : null;
        if (banner == null) {
            return null;
        }
        try {
            Result.Companion companion5 = Result.f93230c;
            AdSource.Banner banner2 = banner.banner();
            banner2.addDemandId(demandId);
            objB3 = Result.b(banner2);
        } catch (Throwable th4) {
            Result.Companion companion6 = Result.f93230c;
            objB3 = Result.b(kotlin.d.a(th4));
        }
        Throwable thG3 = Result.g(objB3);
        if (thG3 != null) {
            LogExtKt.logError("ExecuteAuctionUseCase", "Failed to create banner ad source", thG3);
        }
        return (AdSource.Banner) (Result.i(objB3) ? null : objB3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuctionResult getBelowPriceFloorResult(AdUnit adUnit, TokenInfo tokenInfo) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[adUnit.getBidType().ordinal()];
        if (i10 == 1) {
            return new AuctionResult.AuctionFailed(adUnit, tokenInfo, RoundStatus.Lose.INSTANCE);
        }
        if (i10 == 2) {
            return new AuctionResult.AuctionFailed(adUnit, null, RoundStatus.BelowPricefloor.INSTANCE);
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldRequestNext(AuctionResult auctionResult, AdUnit next) {
        if (next == null) {
            return false;
        }
        double price = auctionResult.getAdSource().getStat().getPrice();
        double pricefloor = next.getPricefloor();
        LogExtKt.logInfo("ExecuteAuctionUseCase", "Loaded price: " + price + ", next requested price: " + pricefloor);
        return price < pricefloor;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00af A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #5 {all -> 0x00ab, blocks: (B:32:0x009b, B:34:0x00a1, B:40:0x00af), top: B:72:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // org.bidon.sdk.auction.usecases.ExecuteAuctionUseCase
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.String r21, long r22, @org.jetbrains.annotations.NotNull java.lang.String r24, boolean r25, @org.jetbrains.annotations.NotNull org.bidon.sdk.adapter.DemandAd r26, @org.jetbrains.annotations.NotNull org.bidon.sdk.auction.AdTypeParam r27, double r28, long r30, @org.jetbrains.annotations.NotNull java.util.List<org.bidon.sdk.auction.models.AdUnit> r32, @org.jetbrains.annotations.NotNull org.bidon.sdk.auction.ResultsCollector r33, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, org.bidon.sdk.auction.models.TokenInfo> r34, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r35) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.usecases.impl.ExecuteAuctionUseCaseImpl.invoke(java.lang.String, long, java.lang.String, boolean, org.bidon.sdk.adapter.DemandAd, org.bidon.sdk.auction.AdTypeParam, double, long, java.util.List, org.bidon.sdk.auction.ResultsCollector, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
