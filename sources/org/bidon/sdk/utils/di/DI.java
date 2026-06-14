package org.bidon.sdk.utils.di;

import android.app.Application;
import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.adapter.AdaptersSource;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.adapter.impl.AdaptersSourceImpl;
import org.bidon.sdk.ads.banner.helper.CountDownTimer;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.ads.banner.helper.GetOrientationUseCase;
import org.bidon.sdk.ads.banner.helper.PauseResumeObserver;
import org.bidon.sdk.ads.banner.helper.impl.ActivityLifecycleObserver;
import org.bidon.sdk.ads.banner.helper.impl.GetOrientationUseCaseImpl;
import org.bidon.sdk.ads.banner.helper.impl.PauseResumeObserverImpl;
import org.bidon.sdk.ads.banner.render.AdRenderer;
import org.bidon.sdk.ads.banner.render.AdRendererImpl;
import org.bidon.sdk.ads.banner.render.CalculateAdContainerParamsUseCase;
import org.bidon.sdk.ads.banner.render.RenderInspectorImpl;
import org.bidon.sdk.ads.cache.AdCache;
import org.bidon.sdk.ads.cache.impl.AdCacheImpl;
import org.bidon.sdk.auction.Auction;
import org.bidon.sdk.auction.AuctionResolver;
import org.bidon.sdk.auction.ResultsCollector;
import org.bidon.sdk.auction.impl.AuctionImpl;
import org.bidon.sdk.auction.impl.PriceAuctionResolverKt;
import org.bidon.sdk.auction.impl.ResultsCollectorImpl;
import org.bidon.sdk.auction.usecases.AuctionStat;
import org.bidon.sdk.auction.usecases.ExecuteAuctionUseCase;
import org.bidon.sdk.auction.usecases.GetAuctionRequestUseCase;
import org.bidon.sdk.auction.usecases.GetTokensUseCase;
import org.bidon.sdk.auction.usecases.RequestAdUnitUseCase;
import org.bidon.sdk.auction.usecases.impl.AuctionStatImpl;
import org.bidon.sdk.auction.usecases.impl.ExecuteAuctionUseCaseImpl;
import org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl;
import org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl;
import org.bidon.sdk.bidding.BiddingConfig;
import org.bidon.sdk.bidding.BiddingConfigImpl;
import org.bidon.sdk.bidding.BiddingConfigSynchronizer;
import org.bidon.sdk.config.AdapterInstanceCreator;
import org.bidon.sdk.config.impl.AdapterInstanceCreatorImpl;
import org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl;
import org.bidon.sdk.config.usecases.InitAndRegisterAdaptersUseCase;
import org.bidon.sdk.databinders.DataProvider;
import org.bidon.sdk.databinders.DataProviderImpl;
import org.bidon.sdk.databinders.adapters.AdaptersBinder;
import org.bidon.sdk.databinders.app.AppBinder;
import org.bidon.sdk.databinders.app.AppDataSource;
import org.bidon.sdk.databinders.app.AppDataSourceImpl;
import org.bidon.sdk.databinders.device.DeviceBinder;
import org.bidon.sdk.databinders.device.DeviceDataSource;
import org.bidon.sdk.databinders.device.DeviceDataSourceImpl;
import org.bidon.sdk.databinders.location.LocationDataSource;
import org.bidon.sdk.databinders.location.LocationDataSourceImpl;
import org.bidon.sdk.databinders.placement.PlacementBinder;
import org.bidon.sdk.databinders.placement.PlacementDataSource;
import org.bidon.sdk.databinders.placement.PlacementDataSourceImpl;
import org.bidon.sdk.databinders.reg.RegulationDataSource;
import org.bidon.sdk.databinders.reg.RegulationDataSourceImpl;
import org.bidon.sdk.databinders.reg.RegulationsBinder;
import org.bidon.sdk.databinders.segment.SegmentBinder;
import org.bidon.sdk.databinders.session.SessionBinder;
import org.bidon.sdk.databinders.session.SessionDataSource;
import org.bidon.sdk.databinders.session.SessionDataSourceImpl;
import org.bidon.sdk.databinders.session.SessionTracker;
import org.bidon.sdk.databinders.session.SessionTrackerImpl;
import org.bidon.sdk.databinders.test.TestModeBinder;
import org.bidon.sdk.databinders.token.TokenBinder;
import org.bidon.sdk.databinders.token.TokenDataSource;
import org.bidon.sdk.databinders.token.TokenDataSourceImpl;
import org.bidon.sdk.databinders.user.AdvertisingData;
import org.bidon.sdk.databinders.user.UserBinder;
import org.bidon.sdk.databinders.user.UserDataSource;
import org.bidon.sdk.databinders.user.impl.AdvertisingDataImpl;
import org.bidon.sdk.databinders.user.impl.AppSetIdReceiver;
import org.bidon.sdk.databinders.user.impl.UserDataSourceImpl;
import org.bidon.sdk.regulation.IabConsent;
import org.bidon.sdk.regulation.Regulation;
import org.bidon.sdk.regulation.impl.IabConsentImpl;
import org.bidon.sdk.regulation.impl.RegulationImpl;
import org.bidon.sdk.segment.Segment;
import org.bidon.sdk.segment.SegmentSynchronizer;
import org.bidon.sdk.segment.impl.SegmentImpl;
import org.bidon.sdk.stats.impl.SendImpressionRequestUseCaseImpl;
import org.bidon.sdk.stats.impl.SendWinLossRequestUseCaseImpl;
import org.bidon.sdk.stats.impl.StatsRequestUseCaseImpl;
import org.bidon.sdk.stats.usecases.SendImpressionRequestUseCase;
import org.bidon.sdk.stats.usecases.SendWinLossRequestUseCase;
import org.bidon.sdk.stats.usecases.StatsRequestUseCase;
import org.bidon.sdk.utils.SdkDispatchers;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage;
import org.bidon.sdk.utils.keyvaluestorage.KeyValueStorageImpl;
import org.bidon.sdk.utils.networking.BidonEndpoints;
import org.bidon.sdk.utils.networking.JsonHttpRequest;
import org.bidon.sdk.utils.networking.NetworkStateObserver;
import org.bidon.sdk.utils.networking.impl.BidonEndpointsImpl;
import org.bidon.sdk.utils.networking.impl.NetworkStateObserverImpl;
import org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCase;
import org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCaseImpl;
import org.bidon.sdk.utils.visibilitytracker.VisibilityTracker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/utils/di/DI;", "", "<init>", "()V", "init", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "setFactories", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DI {

    @NotNull
    public static final DI INSTANCE = new DI();

    private DI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$1(final Context context, SimpleDiScope module) {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        InstanceType.Factory factory = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.l
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.init$lambda$1$lambda$0(context);
            }
        };
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType.Singleton singleton = new InstanceType.Singleton(factory);
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(Context.class)) == null) {
            simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(Context.class), singleton);
            return Unit.f93236a;
        }
        throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(Context.class) + " already added.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context init$lambda$1$lambda$0(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFactories$lambda$46(SimpleDiScope module) {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        InstanceType.Factory factory = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.w
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$2();
            }
        };
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType.Singleton singleton = new InstanceType.Singleton(factory);
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AdaptersSource.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(AdaptersSource.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(AdaptersSource.class), singleton);
        InstanceType.Singleton singleton2 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.e
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$3();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(BidonEndpoints.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(BidonEndpoints.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(BidonEndpoints.class), singleton2);
        InstanceType.Singleton singleton3 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.q
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$4();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(KeyValueStorage.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(KeyValueStorage.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(KeyValueStorage.class), singleton3);
        InstanceType.Singleton singleton4 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.c0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$5();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(PauseResumeObserver.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(PauseResumeObserver.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(PauseResumeObserver.class), singleton4);
        InstanceType.Singleton singleton5 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.i0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$6();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AdvertisingData.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(AdvertisingData.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(AdvertisingData.class), singleton5);
        InstanceType.Singleton singleton6 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.j0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$7();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AppSetIdReceiver.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(AppSetIdReceiver.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(AppSetIdReceiver.class), singleton6);
        InstanceType.Singleton singleton7 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.k0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$8();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(LocationDataSource.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(LocationDataSource.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(LocationDataSource.class), singleton7);
        InstanceType.Singleton singleton8 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.l0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$9();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(SessionDataSource.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(SessionDataSource.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(SessionDataSource.class), singleton8);
        InstanceType.Singleton singleton9 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.m0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$10();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(SessionTracker.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(SessionTracker.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(SessionTracker.class), singleton9);
        InstanceType.Singleton singleton10 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.n0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$11();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(NetworkStateObserver.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(NetworkStateObserver.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(NetworkStateObserver.class), singleton10);
        InstanceType.Singleton singleton11 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.h0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$12();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(TokenDataSource.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(TokenDataSource.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(TokenDataSource.class), singleton11);
        InstanceType.Singleton singleton12 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.p0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$13();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(Regulation.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(Regulation.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(Regulation.class), singleton12);
        InstanceType.Singleton singleton13 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.q0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$14();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(Segment.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(Segment.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(Segment.class), singleton13);
        InstanceType.Singleton singleton14 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.r0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$15();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(BiddingConfig.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(BiddingConfig.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(BiddingConfig.class), singleton14);
        InstanceType.Singleton singleton15 = new InstanceType.Singleton(new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.s0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$16();
            }
        });
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(GetTokensUseCase.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(GetTokensUseCase.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(GetTokensUseCase.class), singleton15);
        InstanceType.Factory factory2 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.t0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$17();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(SegmentSynchronizer.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(SegmentSynchronizer.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(SegmentSynchronizer.class), factory2);
        InstanceType.Factory factory3 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.u0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$18();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(BiddingConfigSynchronizer.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(BiddingConfigSynchronizer.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(BiddingConfigSynchronizer.class), factory3);
        InstanceType.Factory factory4 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.b
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$19();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(InitAndRegisterAdaptersUseCase.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(InitAndRegisterAdaptersUseCase.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(InitAndRegisterAdaptersUseCase.class), factory4);
        InstanceType.Factory factory5 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.c
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$20();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AdapterInstanceCreator.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(AdapterInstanceCreator.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(AdapterInstanceCreator.class), factory5);
        InstanceType.Factory factory6 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.d
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return PriceAuctionResolverKt.getMaxPriceAuctionResolver();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AuctionResolver.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(AuctionResolver.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(AuctionResolver.class), factory6);
        InstanceType.Factory factory7 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.f
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$22();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(Auction.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(Auction.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(Auction.class), factory7);
        InstanceType.Factory factory8 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.g
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$23();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AuctionStat.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(AuctionStat.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(AuctionStat.class), factory8);
        InstanceType.ParamFactory paramFactory = new InstanceType.ParamFactory() { // from class: org.bidon.sdk.utils.di.h
            @Override // org.bidon.sdk.utils.di.InstanceType.ParamFactory
            public final Object build(Object[] objArr) {
                return DI.setFactories$lambda$46$lambda$24(objArr);
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(CountDownTimer.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(CountDownTimer.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(CountDownTimer.class), paramFactory);
        InstanceType.Factory factory9 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.i
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$25();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(GetOrientationUseCase.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(GetOrientationUseCase.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(GetOrientationUseCase.class), factory9);
        InstanceType.Factory factory10 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.j
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$26();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(JsonHttpRequest.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(JsonHttpRequest.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(JsonHttpRequest.class), factory10);
        InstanceType.Factory factory11 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.k
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$27();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(RequestAdUnitUseCase.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(RequestAdUnitUseCase.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(RequestAdUnitUseCase.class), factory11);
        InstanceType.Factory factory12 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.m
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$28();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(ExecuteAuctionUseCase.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(ExecuteAuctionUseCase.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(ExecuteAuctionUseCase.class), factory12);
        InstanceType.Factory factory13 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.n
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$29();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(StatsRequestUseCase.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(StatsRequestUseCase.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(StatsRequestUseCase.class), factory13);
        InstanceType.Factory factory14 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.o
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$30();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(SendImpressionRequestUseCase.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(SendImpressionRequestUseCase.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(SendImpressionRequestUseCase.class), factory14);
        InstanceType.Factory factory15 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.p
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$31();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AppDataSource.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(AppDataSource.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(AppDataSource.class), factory15);
        InstanceType.Factory factory16 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.r
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$32();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(DeviceDataSource.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(DeviceDataSource.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(DeviceDataSource.class), factory16);
        InstanceType.Factory factory17 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.s
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$33();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(UserDataSource.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(UserDataSource.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(UserDataSource.class), factory17);
        InstanceType.Factory factory18 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.t
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$34();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(PlacementDataSource.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(PlacementDataSource.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(PlacementDataSource.class), factory18);
        InstanceType.Factory factory19 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.u
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$35();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(CreateRequestBodyUseCase.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(CreateRequestBodyUseCase.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(CreateRequestBodyUseCase.class), factory19);
        InstanceType.Factory factory20 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.v
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$36();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(DataProvider.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(DataProvider.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(DataProvider.class), factory20);
        InstanceType.Factory factory21 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.x
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$37();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(IabConsent.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(IabConsent.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(IabConsent.class), factory21);
        InstanceType.Factory factory22 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.y
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$38();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(VisibilityTracker.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(VisibilityTracker.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(VisibilityTracker.class), factory22);
        InstanceType.Factory factory23 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.z
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$39();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(RegulationDataSource.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(RegulationDataSource.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(RegulationDataSource.class), factory23);
        InstanceType.Factory factory24 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.a0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$40();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(SendWinLossRequestUseCase.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(SendWinLossRequestUseCase.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(SendWinLossRequestUseCase.class), factory24);
        InstanceType.Factory factory25 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.b0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$41();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(ResultsCollector.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(ResultsCollector.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(ResultsCollector.class), factory25);
        InstanceType.Factory factory26 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.d0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$42();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AdRenderer.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(AdRenderer.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(AdRenderer.class), factory26);
        InstanceType.Factory factory27 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.e0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$43();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AdRenderer.RenderInspector.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(AdRenderer.RenderInspector.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(AdRenderer.RenderInspector.class), factory27);
        InstanceType.Factory factory28 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.f0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return DI.setFactories$lambda$46$lambda$44();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(CalculateAdContainerParamsUseCase.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(CalculateAdContainerParamsUseCase.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(CalculateAdContainerParamsUseCase.class), factory28);
        InstanceType.ParamFactory paramFactory2 = new InstanceType.ParamFactory() { // from class: org.bidon.sdk.utils.di.g0
            @Override // org.bidon.sdk.utils.di.InstanceType.ParamFactory
            public final Object build(Object[] objArr) {
                return DI.setFactories$lambda$46$lambda$45(objArr);
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AdCache.class)) == null) {
            simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(AdCache.class), paramFactory2);
            return Unit.f93236a;
        }
        throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(AdCache.class) + " already added.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionTracker setFactories$lambda$46$lambda$10() {
        Context context;
        PauseResumeObserver pauseResumeObserver;
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType<?> instanceType = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(Context.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Context.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) objBuild;
        }
        InstanceType<?> instanceType2 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(PauseResumeObserver.class));
        if (instanceType2 instanceof InstanceType.Singleton) {
            Object singleton2 = ((InstanceType.Singleton) instanceType2).getInstance();
            if (singleton2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.banner.helper.PauseResumeObserver");
            }
            pauseResumeObserver = (PauseResumeObserver) singleton2;
        } else {
            if (!(instanceType2 instanceof InstanceType.Factory)) {
                if (instanceType2 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType2 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + PauseResumeObserver.class).toString());
            }
            Object objBuild2 = ((InstanceType.Factory) instanceType2).build();
            if (objBuild2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.banner.helper.PauseResumeObserver");
            }
            pauseResumeObserver = (PauseResumeObserver) objBuild2;
        }
        return new SessionTrackerImpl(pauseResumeObserver, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkStateObserver setFactories$lambda$46$lambda$11() {
        return new NetworkStateObserverImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenDataSource setFactories$lambda$46$lambda$12() {
        KeyValueStorage keyValueStorage;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(KeyValueStorage.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage");
            }
            keyValueStorage = (KeyValueStorage) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + KeyValueStorage.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage");
            }
            keyValueStorage = (KeyValueStorage) objBuild;
        }
        return new TokenDataSourceImpl(keyValueStorage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regulation setFactories$lambda$46$lambda$13() {
        return new RegulationImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Segment setFactories$lambda$46$lambda$14() {
        return new SegmentImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BiddingConfig setFactories$lambda$46$lambda$15() {
        return new BiddingConfigImpl(0L, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetTokensUseCase setFactories$lambda$46$lambda$16() {
        return new GetTokensUseCaseImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SegmentSynchronizer setFactories$lambda$46$lambda$17() {
        Segment segment;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(Segment.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.segment.Segment");
            }
            segment = (Segment) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Segment.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.segment.Segment");
            }
            segment = (Segment) objBuild;
        }
        Intrinsics.checkNotNull(segment, "null cannot be cast to non-null type org.bidon.sdk.segment.SegmentSynchronizer");
        return (SegmentSynchronizer) segment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BiddingConfigSynchronizer setFactories$lambda$46$lambda$18() {
        BiddingConfig biddingConfig;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(BiddingConfig.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.bidding.BiddingConfig");
            }
            biddingConfig = (BiddingConfig) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + BiddingConfig.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.bidding.BiddingConfig");
            }
            biddingConfig = (BiddingConfig) objBuild;
        }
        Intrinsics.checkNotNull(biddingConfig, "null cannot be cast to non-null type org.bidon.sdk.bidding.BiddingConfigSynchronizer");
        return (BiddingConfigSynchronizer) biddingConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitAndRegisterAdaptersUseCase setFactories$lambda$46$lambda$19() {
        AdaptersSource adaptersSource;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(AdaptersSource.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.adapter.AdaptersSource");
            }
            adaptersSource = (AdaptersSource) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + AdaptersSource.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.adapter.AdaptersSource");
            }
            adaptersSource = (AdaptersSource) objBuild;
        }
        return new InitAndRegisterAdaptersUseCaseImpl(adaptersSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdaptersSource setFactories$lambda$46$lambda$2() {
        return new AdaptersSourceImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdapterInstanceCreator setFactories$lambda$46$lambda$20() {
        return new AdapterInstanceCreatorImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Auction setFactories$lambda$46$lambda$22() {
        AdaptersSource adaptersSource;
        GetTokensUseCase getTokensUseCase;
        GetAuctionRequestUseCase getAuctionRequestUseCase;
        ExecuteAuctionUseCase executeAuctionUseCase;
        AuctionStat auctionStat;
        BiddingConfig biddingConfig;
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType<?> instanceType = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AdaptersSource.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.adapter.AdaptersSource");
            }
            adaptersSource = (AdaptersSource) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + AdaptersSource.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.adapter.AdaptersSource");
            }
            adaptersSource = (AdaptersSource) objBuild;
        }
        InstanceType<?> instanceType2 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(GetTokensUseCase.class));
        if (instanceType2 instanceof InstanceType.Singleton) {
            Object singleton2 = ((InstanceType.Singleton) instanceType2).getInstance();
            if (singleton2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.usecases.GetTokensUseCase");
            }
            getTokensUseCase = (GetTokensUseCase) singleton2;
        } else {
            if (!(instanceType2 instanceof InstanceType.Factory)) {
                if (instanceType2 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType2 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + GetTokensUseCase.class).toString());
            }
            Object objBuild2 = ((InstanceType.Factory) instanceType2).build();
            if (objBuild2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.usecases.GetTokensUseCase");
            }
            getTokensUseCase = (GetTokensUseCase) objBuild2;
        }
        InstanceType<?> instanceType3 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(GetAuctionRequestUseCase.class));
        if (instanceType3 instanceof InstanceType.Singleton) {
            Object singleton3 = ((InstanceType.Singleton) instanceType3).getInstance();
            if (singleton3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.usecases.GetAuctionRequestUseCase");
            }
            getAuctionRequestUseCase = (GetAuctionRequestUseCase) singleton3;
        } else {
            if (!(instanceType3 instanceof InstanceType.Factory)) {
                if (instanceType3 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType3 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + GetAuctionRequestUseCase.class).toString());
            }
            Object objBuild3 = ((InstanceType.Factory) instanceType3).build();
            if (objBuild3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.usecases.GetAuctionRequestUseCase");
            }
            getAuctionRequestUseCase = (GetAuctionRequestUseCase) objBuild3;
        }
        InstanceType<?> instanceType4 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(ExecuteAuctionUseCase.class));
        if (instanceType4 instanceof InstanceType.Singleton) {
            Object singleton4 = ((InstanceType.Singleton) instanceType4).getInstance();
            if (singleton4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.usecases.ExecuteAuctionUseCase");
            }
            executeAuctionUseCase = (ExecuteAuctionUseCase) singleton4;
        } else {
            if (!(instanceType4 instanceof InstanceType.Factory)) {
                if (instanceType4 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType4 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + ExecuteAuctionUseCase.class).toString());
            }
            Object objBuild4 = ((InstanceType.Factory) instanceType4).build();
            if (objBuild4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.usecases.ExecuteAuctionUseCase");
            }
            executeAuctionUseCase = (ExecuteAuctionUseCase) objBuild4;
        }
        InstanceType<?> instanceType5 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AuctionStat.class));
        if (instanceType5 instanceof InstanceType.Singleton) {
            Object singleton5 = ((InstanceType.Singleton) instanceType5).getInstance();
            if (singleton5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.usecases.AuctionStat");
            }
            auctionStat = (AuctionStat) singleton5;
        } else {
            if (!(instanceType5 instanceof InstanceType.Factory)) {
                if (instanceType5 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType5 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + AuctionStat.class).toString());
            }
            Object objBuild5 = ((InstanceType.Factory) instanceType5).build();
            if (objBuild5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.usecases.AuctionStat");
            }
            auctionStat = (AuctionStat) objBuild5;
        }
        InstanceType<?> instanceType6 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(BiddingConfig.class));
        if (instanceType6 instanceof InstanceType.Singleton) {
            Object singleton6 = ((InstanceType.Singleton) instanceType6).getInstance();
            if (singleton6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.bidding.BiddingConfig");
            }
            biddingConfig = (BiddingConfig) singleton6;
        } else {
            if (!(instanceType6 instanceof InstanceType.Factory)) {
                if (instanceType6 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType6 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + BiddingConfig.class).toString());
            }
            Object objBuild6 = ((InstanceType.Factory) instanceType6).build();
            if (objBuild6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.bidding.BiddingConfig");
            }
            biddingConfig = (BiddingConfig) objBuild6;
        }
        return new AuctionImpl(adaptersSource, getTokensUseCase, getAuctionRequestUseCase, executeAuctionUseCase, auctionStat, biddingConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuctionStat setFactories$lambda$46$lambda$23() {
        StatsRequestUseCase statsRequestUseCase;
        AuctionResolver auctionResolver;
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType<?> instanceType = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(StatsRequestUseCase.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.stats.usecases.StatsRequestUseCase");
            }
            statsRequestUseCase = (StatsRequestUseCase) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + StatsRequestUseCase.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.stats.usecases.StatsRequestUseCase");
            }
            statsRequestUseCase = (StatsRequestUseCase) objBuild;
        }
        InstanceType<?> instanceType2 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AuctionResolver.class));
        if (instanceType2 instanceof InstanceType.Singleton) {
            Object singleton2 = ((InstanceType.Singleton) instanceType2).getInstance();
            if (singleton2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.AuctionResolver");
            }
            auctionResolver = (AuctionResolver) singleton2;
        } else {
            if (!(instanceType2 instanceof InstanceType.Factory)) {
                if (instanceType2 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType2 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + AuctionResolver.class).toString());
            }
            Object objBuild2 = ((InstanceType.Factory) instanceType2).build();
            if (objBuild2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.AuctionResolver");
            }
            auctionResolver = (AuctionResolver) objBuild2;
        }
        return new AuctionStatImpl(statsRequestUseCase, auctionResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CountDownTimer setFactories$lambda$46$lambda$24(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
        Object obj = objArr[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.bidon.sdk.ads.banner.helper.impl.ActivityLifecycleObserver");
        return new CountDownTimer((ActivityLifecycleObserver) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetOrientationUseCase setFactories$lambda$46$lambda$25() {
        Context context;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(Context.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Context.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) objBuild;
        }
        return new GetOrientationUseCaseImpl(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonHttpRequest setFactories$lambda$46$lambda$26() {
        TokenDataSource tokenDataSource;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(TokenDataSource.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.token.TokenDataSource");
            }
            tokenDataSource = (TokenDataSource) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + TokenDataSource.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.token.TokenDataSource");
            }
            tokenDataSource = (TokenDataSource) objBuild;
        }
        return new JsonHttpRequest(tokenDataSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestAdUnitUseCase setFactories$lambda$46$lambda$27() {
        return new RequestAdUnitUseCaseImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecuteAuctionUseCase setFactories$lambda$46$lambda$28() {
        RequestAdUnitUseCase requestAdUnitUseCase;
        AdaptersSource adaptersSource;
        Regulation regulation;
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType<?> instanceType = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(RequestAdUnitUseCase.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.usecases.RequestAdUnitUseCase");
            }
            requestAdUnitUseCase = (RequestAdUnitUseCase) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + RequestAdUnitUseCase.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.usecases.RequestAdUnitUseCase");
            }
            requestAdUnitUseCase = (RequestAdUnitUseCase) objBuild;
        }
        InstanceType<?> instanceType2 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AdaptersSource.class));
        if (instanceType2 instanceof InstanceType.Singleton) {
            Object singleton2 = ((InstanceType.Singleton) instanceType2).getInstance();
            if (singleton2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.adapter.AdaptersSource");
            }
            adaptersSource = (AdaptersSource) singleton2;
        } else {
            if (!(instanceType2 instanceof InstanceType.Factory)) {
                if (instanceType2 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType2 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + AdaptersSource.class).toString());
            }
            Object objBuild2 = ((InstanceType.Factory) instanceType2).build();
            if (objBuild2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.adapter.AdaptersSource");
            }
            adaptersSource = (AdaptersSource) objBuild2;
        }
        InstanceType<?> instanceType3 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(Regulation.class));
        if (instanceType3 instanceof InstanceType.Singleton) {
            Object singleton3 = ((InstanceType.Singleton) instanceType3).getInstance();
            if (singleton3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.regulation.Regulation");
            }
            regulation = (Regulation) singleton3;
        } else {
            if (!(instanceType3 instanceof InstanceType.Factory)) {
                if (instanceType3 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType3 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Regulation.class).toString());
            }
            Object objBuild3 = ((InstanceType.Factory) instanceType3).build();
            if (objBuild3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.regulation.Regulation");
            }
            regulation = (Regulation) objBuild3;
        }
        return new ExecuteAuctionUseCaseImpl(adaptersSource, requestAdUnitUseCase, regulation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StatsRequestUseCase setFactories$lambda$46$lambda$29() {
        CreateRequestBodyUseCase createRequestBodyUseCase;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(CreateRequestBodyUseCase.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCase");
            }
            createRequestBodyUseCase = (CreateRequestBodyUseCase) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + CreateRequestBodyUseCase.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCase");
            }
            createRequestBodyUseCase = (CreateRequestBodyUseCase) objBuild;
        }
        return new StatsRequestUseCaseImpl(createRequestBodyUseCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BidonEndpoints setFactories$lambda$46$lambda$3() {
        return new BidonEndpointsImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SendImpressionRequestUseCase setFactories$lambda$46$lambda$30() {
        CreateRequestBodyUseCase createRequestBodyUseCase;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(CreateRequestBodyUseCase.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCase");
            }
            createRequestBodyUseCase = (CreateRequestBodyUseCase) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + CreateRequestBodyUseCase.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCase");
            }
            createRequestBodyUseCase = (CreateRequestBodyUseCase) objBuild;
        }
        return new SendImpressionRequestUseCaseImpl(createRequestBodyUseCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppDataSource setFactories$lambda$46$lambda$31() {
        Context context;
        KeyValueStorage keyValueStorage;
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType<?> instanceType = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(Context.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Context.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) objBuild;
        }
        InstanceType<?> instanceType2 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(KeyValueStorage.class));
        if (instanceType2 instanceof InstanceType.Singleton) {
            Object singleton2 = ((InstanceType.Singleton) instanceType2).getInstance();
            if (singleton2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage");
            }
            keyValueStorage = (KeyValueStorage) singleton2;
        } else {
            if (!(instanceType2 instanceof InstanceType.Factory)) {
                if (instanceType2 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType2 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + KeyValueStorage.class).toString());
            }
            Object objBuild2 = ((InstanceType.Factory) instanceType2).build();
            if (objBuild2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage");
            }
            keyValueStorage = (KeyValueStorage) objBuild2;
        }
        return new AppDataSourceImpl(context, keyValueStorage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceDataSource setFactories$lambda$46$lambda$32() {
        Context context;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(Context.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Context.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) objBuild;
        }
        return new DeviceDataSourceImpl(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserDataSource setFactories$lambda$46$lambda$33() {
        KeyValueStorage keyValueStorage;
        AdvertisingData advertisingData;
        AppSetIdReceiver appSetIdReceiver;
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType<?> instanceType = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(KeyValueStorage.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage");
            }
            keyValueStorage = (KeyValueStorage) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + KeyValueStorage.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage");
            }
            keyValueStorage = (KeyValueStorage) objBuild;
        }
        InstanceType<?> instanceType2 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AdvertisingData.class));
        if (instanceType2 instanceof InstanceType.Singleton) {
            Object singleton2 = ((InstanceType.Singleton) instanceType2).getInstance();
            if (singleton2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.user.AdvertisingData");
            }
            advertisingData = (AdvertisingData) singleton2;
        } else {
            if (!(instanceType2 instanceof InstanceType.Factory)) {
                if (instanceType2 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType2 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + AdvertisingData.class).toString());
            }
            Object objBuild2 = ((InstanceType.Factory) instanceType2).build();
            if (objBuild2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.user.AdvertisingData");
            }
            advertisingData = (AdvertisingData) objBuild2;
        }
        InstanceType<?> instanceType3 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AppSetIdReceiver.class));
        if (instanceType3 instanceof InstanceType.Singleton) {
            Object singleton3 = ((InstanceType.Singleton) instanceType3).getInstance();
            if (singleton3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.user.impl.AppSetIdReceiver");
            }
            appSetIdReceiver = (AppSetIdReceiver) singleton3;
        } else {
            if (!(instanceType3 instanceof InstanceType.Factory)) {
                if (instanceType3 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType3 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + AppSetIdReceiver.class).toString());
            }
            Object objBuild3 = ((InstanceType.Factory) instanceType3).build();
            if (objBuild3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.user.impl.AppSetIdReceiver");
            }
            appSetIdReceiver = (AppSetIdReceiver) objBuild3;
        }
        return new UserDataSourceImpl(keyValueStorage, advertisingData, appSetIdReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlacementDataSource setFactories$lambda$46$lambda$34() {
        return new PlacementDataSourceImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateRequestBodyUseCase setFactories$lambda$46$lambda$35() {
        DataProvider dataProvider;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(DataProvider.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.DataProvider");
            }
            dataProvider = (DataProvider) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + DataProvider.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.DataProvider");
            }
            dataProvider = (DataProvider) objBuild;
        }
        return new CreateRequestBodyUseCaseImpl(dataProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataProvider setFactories$lambda$46$lambda$36() {
        DeviceDataSource deviceDataSource;
        LocationDataSource locationDataSource;
        AppDataSource appDataSource;
        SessionDataSource sessionDataSource;
        TokenDataSource tokenDataSource;
        UserDataSource userDataSource;
        PlacementDataSource placementDataSource;
        AdaptersSource adaptersSource;
        RegulationDataSource regulationDataSource;
        SegmentSynchronizer segmentSynchronizer;
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType<?> instanceType = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(DeviceDataSource.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.device.DeviceDataSource");
            }
            deviceDataSource = (DeviceDataSource) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + DeviceDataSource.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.device.DeviceDataSource");
            }
            deviceDataSource = (DeviceDataSource) objBuild;
        }
        InstanceType<?> instanceType2 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(LocationDataSource.class));
        if (instanceType2 instanceof InstanceType.Singleton) {
            Object singleton2 = ((InstanceType.Singleton) instanceType2).getInstance();
            if (singleton2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.location.LocationDataSource");
            }
            locationDataSource = (LocationDataSource) singleton2;
        } else {
            if (!(instanceType2 instanceof InstanceType.Factory)) {
                if (instanceType2 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType2 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + LocationDataSource.class).toString());
            }
            Object objBuild2 = ((InstanceType.Factory) instanceType2).build();
            if (objBuild2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.location.LocationDataSource");
            }
            locationDataSource = (LocationDataSource) objBuild2;
        }
        DeviceBinder deviceBinder = new DeviceBinder(deviceDataSource, locationDataSource);
        InstanceType<?> instanceType3 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AppDataSource.class));
        if (instanceType3 instanceof InstanceType.Singleton) {
            Object singleton3 = ((InstanceType.Singleton) instanceType3).getInstance();
            if (singleton3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.app.AppDataSource");
            }
            appDataSource = (AppDataSource) singleton3;
        } else {
            if (!(instanceType3 instanceof InstanceType.Factory)) {
                if (instanceType3 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType3 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + AppDataSource.class).toString());
            }
            Object objBuild3 = ((InstanceType.Factory) instanceType3).build();
            if (objBuild3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.app.AppDataSource");
            }
            appDataSource = (AppDataSource) objBuild3;
        }
        AppBinder appBinder = new AppBinder(appDataSource);
        InstanceType<?> instanceType4 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(SessionDataSource.class));
        if (instanceType4 instanceof InstanceType.Singleton) {
            Object singleton4 = ((InstanceType.Singleton) instanceType4).getInstance();
            if (singleton4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.session.SessionDataSource");
            }
            sessionDataSource = (SessionDataSource) singleton4;
        } else {
            if (!(instanceType4 instanceof InstanceType.Factory)) {
                if (instanceType4 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType4 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + SessionDataSource.class).toString());
            }
            Object objBuild4 = ((InstanceType.Factory) instanceType4).build();
            if (objBuild4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.session.SessionDataSource");
            }
            sessionDataSource = (SessionDataSource) objBuild4;
        }
        SessionBinder sessionBinder = new SessionBinder(sessionDataSource);
        InstanceType<?> instanceType5 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(TokenDataSource.class));
        if (instanceType5 instanceof InstanceType.Singleton) {
            Object singleton5 = ((InstanceType.Singleton) instanceType5).getInstance();
            if (singleton5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.token.TokenDataSource");
            }
            tokenDataSource = (TokenDataSource) singleton5;
        } else {
            if (!(instanceType5 instanceof InstanceType.Factory)) {
                if (instanceType5 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType5 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + TokenDataSource.class).toString());
            }
            Object objBuild5 = ((InstanceType.Factory) instanceType5).build();
            if (objBuild5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.token.TokenDataSource");
            }
            tokenDataSource = (TokenDataSource) objBuild5;
        }
        TokenBinder tokenBinder = new TokenBinder(tokenDataSource);
        InstanceType<?> instanceType6 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(UserDataSource.class));
        if (instanceType6 instanceof InstanceType.Singleton) {
            Object singleton6 = ((InstanceType.Singleton) instanceType6).getInstance();
            if (singleton6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.user.UserDataSource");
            }
            userDataSource = (UserDataSource) singleton6;
        } else {
            if (!(instanceType6 instanceof InstanceType.Factory)) {
                if (instanceType6 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType6 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + UserDataSource.class).toString());
            }
            Object objBuild6 = ((InstanceType.Factory) instanceType6).build();
            if (objBuild6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.user.UserDataSource");
            }
            userDataSource = (UserDataSource) objBuild6;
        }
        UserBinder userBinder = new UserBinder(userDataSource);
        InstanceType<?> instanceType7 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(PlacementDataSource.class));
        if (instanceType7 instanceof InstanceType.Singleton) {
            Object singleton7 = ((InstanceType.Singleton) instanceType7).getInstance();
            if (singleton7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.placement.PlacementDataSource");
            }
            placementDataSource = (PlacementDataSource) singleton7;
        } else {
            if (!(instanceType7 instanceof InstanceType.Factory)) {
                if (instanceType7 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType7 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + PlacementDataSource.class).toString());
            }
            Object objBuild7 = ((InstanceType.Factory) instanceType7).build();
            if (objBuild7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.placement.PlacementDataSource");
            }
            placementDataSource = (PlacementDataSource) objBuild7;
        }
        PlacementBinder placementBinder = new PlacementBinder(placementDataSource);
        InstanceType<?> instanceType8 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AdaptersSource.class));
        if (instanceType8 instanceof InstanceType.Singleton) {
            Object singleton8 = ((InstanceType.Singleton) instanceType8).getInstance();
            if (singleton8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.adapter.AdaptersSource");
            }
            adaptersSource = (AdaptersSource) singleton8;
        } else {
            if (!(instanceType8 instanceof InstanceType.Factory)) {
                if (instanceType8 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType8 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + AdaptersSource.class).toString());
            }
            Object objBuild8 = ((InstanceType.Factory) instanceType8).build();
            if (objBuild8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.adapter.AdaptersSource");
            }
            adaptersSource = (AdaptersSource) objBuild8;
        }
        AdaptersBinder adaptersBinder = new AdaptersBinder(adaptersSource);
        InstanceType<?> instanceType9 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(RegulationDataSource.class));
        if (instanceType9 instanceof InstanceType.Singleton) {
            Object singleton9 = ((InstanceType.Singleton) instanceType9).getInstance();
            if (singleton9 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.reg.RegulationDataSource");
            }
            regulationDataSource = (RegulationDataSource) singleton9;
        } else {
            if (!(instanceType9 instanceof InstanceType.Factory)) {
                if (instanceType9 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType9 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + RegulationDataSource.class).toString());
            }
            Object objBuild9 = ((InstanceType.Factory) instanceType9).build();
            if (objBuild9 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.reg.RegulationDataSource");
            }
            regulationDataSource = (RegulationDataSource) objBuild9;
        }
        RegulationsBinder regulationsBinder = new RegulationsBinder(regulationDataSource);
        TestModeBinder testModeBinder = new TestModeBinder();
        InstanceType<?> instanceType10 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(SegmentSynchronizer.class));
        if (instanceType10 instanceof InstanceType.Singleton) {
            Object singleton10 = ((InstanceType.Singleton) instanceType10).getInstance();
            if (singleton10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.segment.SegmentSynchronizer");
            }
            segmentSynchronizer = (SegmentSynchronizer) singleton10;
        } else {
            if (!(instanceType10 instanceof InstanceType.Factory)) {
                if (instanceType10 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType10 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + SegmentSynchronizer.class).toString());
            }
            Object objBuild10 = ((InstanceType.Factory) instanceType10).build();
            if (objBuild10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.segment.SegmentSynchronizer");
            }
            segmentSynchronizer = (SegmentSynchronizer) objBuild10;
        }
        return new DataProviderImpl(deviceBinder, appBinder, sessionBinder, userBinder, tokenBinder, placementBinder, adaptersBinder, new SegmentBinder(segmentSynchronizer), regulationsBinder, testModeBinder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IabConsent setFactories$lambda$46$lambda$37() {
        return new IabConsentImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VisibilityTracker setFactories$lambda$46$lambda$38() {
        return new VisibilityTracker(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RegulationDataSource setFactories$lambda$46$lambda$39() {
        Regulation regulation;
        IabConsent iabConsent;
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType<?> instanceType = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(Regulation.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.regulation.Regulation");
            }
            regulation = (Regulation) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Regulation.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.regulation.Regulation");
            }
            regulation = (Regulation) objBuild;
        }
        InstanceType<?> instanceType2 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(IabConsent.class));
        if (instanceType2 instanceof InstanceType.Singleton) {
            Object singleton2 = ((InstanceType.Singleton) instanceType2).getInstance();
            if (singleton2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.regulation.IabConsent");
            }
            iabConsent = (IabConsent) singleton2;
        } else {
            if (!(instanceType2 instanceof InstanceType.Factory)) {
                if (instanceType2 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType2 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + IabConsent.class).toString());
            }
            Object objBuild2 = ((InstanceType.Factory) instanceType2).build();
            if (objBuild2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.regulation.IabConsent");
            }
            iabConsent = (IabConsent) objBuild2;
        }
        return new RegulationDataSourceImpl(regulation, iabConsent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyValueStorage setFactories$lambda$46$lambda$4() {
        Context context;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(Context.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Context.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) objBuild;
        }
        return new KeyValueStorageImpl(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SendWinLossRequestUseCase setFactories$lambda$46$lambda$40() {
        CreateRequestBodyUseCase createRequestBodyUseCase;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(CreateRequestBodyUseCase.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCase");
            }
            createRequestBodyUseCase = (CreateRequestBodyUseCase) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + CreateRequestBodyUseCase.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCase");
            }
            createRequestBodyUseCase = (CreateRequestBodyUseCase) objBuild;
        }
        return new SendWinLossRequestUseCaseImpl(createRequestBodyUseCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResultsCollector setFactories$lambda$46$lambda$41() {
        AuctionResolver auctionResolver;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(AuctionResolver.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.AuctionResolver");
            }
            auctionResolver = (AuctionResolver) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + AuctionResolver.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.AuctionResolver");
            }
            auctionResolver = (AuctionResolver) objBuild;
        }
        return new ResultsCollectorImpl(auctionResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdRenderer setFactories$lambda$46$lambda$42() {
        AdRenderer.RenderInspector renderInspector;
        CalculateAdContainerParamsUseCase calculateAdContainerParamsUseCase;
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType<?> instanceType = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(AdRenderer.RenderInspector.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.banner.render.AdRenderer.RenderInspector");
            }
            renderInspector = (AdRenderer.RenderInspector) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + AdRenderer.RenderInspector.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.banner.render.AdRenderer.RenderInspector");
            }
            renderInspector = (AdRenderer.RenderInspector) objBuild;
        }
        InstanceType<?> instanceType2 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(CalculateAdContainerParamsUseCase.class));
        if (instanceType2 instanceof InstanceType.Singleton) {
            Object singleton2 = ((InstanceType.Singleton) instanceType2).getInstance();
            if (singleton2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.banner.render.CalculateAdContainerParamsUseCase");
            }
            calculateAdContainerParamsUseCase = (CalculateAdContainerParamsUseCase) singleton2;
        } else {
            if (!(instanceType2 instanceof InstanceType.Factory)) {
                if (instanceType2 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType2 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + CalculateAdContainerParamsUseCase.class).toString());
            }
            Object objBuild2 = ((InstanceType.Factory) instanceType2).build();
            if (objBuild2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.banner.render.CalculateAdContainerParamsUseCase");
            }
            calculateAdContainerParamsUseCase = (CalculateAdContainerParamsUseCase) objBuild2;
        }
        return new AdRendererImpl(renderInspector, calculateAdContainerParamsUseCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdRenderer.RenderInspector setFactories$lambda$46$lambda$43() {
        return new RenderInspectorImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CalculateAdContainerParamsUseCase setFactories$lambda$46$lambda$44() {
        return new CalculateAdContainerParamsUseCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdCache setFactories$lambda$46$lambda$45(Object[] objArr) {
        AuctionResolver auctionResolver;
        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
        Object obj = objArr[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.bidon.sdk.adapter.DemandAd");
        DemandAd demandAd = (DemandAd) obj;
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(SdkDispatchers.INSTANCE.getMain());
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(AuctionResolver.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.AuctionResolver");
            }
            auctionResolver = (AuctionResolver) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + AuctionResolver.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.AuctionResolver");
            }
            auctionResolver = (AuctionResolver) objBuild;
        }
        return new AdCacheImpl(demandAd, coroutineScopeA, auctionResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PauseResumeObserver setFactories$lambda$46$lambda$5() {
        Context context;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(Context.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Context.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) objBuild;
        }
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        return new PauseResumeObserverImpl((Application) context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvertisingData setFactories$lambda$46$lambda$6() {
        Context context;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(Context.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Context.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) objBuild;
        }
        return new AdvertisingDataImpl(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppSetIdReceiver setFactories$lambda$46$lambda$7() {
        Context context;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(Context.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Context.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) objBuild;
        }
        return new AppSetIdReceiver(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationDataSource setFactories$lambda$46$lambda$8() {
        Context context;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(kotlin.jvm.internal.v0.b(Context.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Context.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) objBuild;
        }
        return new LocationDataSourceImpl(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionDataSource setFactories$lambda$46$lambda$9() {
        Context context;
        SessionTracker sessionTracker;
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType<?> instanceType = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(Context.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + Context.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            context = (Context) objBuild;
        }
        InstanceType<?> instanceType2 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(SessionTracker.class));
        if (instanceType2 instanceof InstanceType.Singleton) {
            Object singleton2 = ((InstanceType.Singleton) instanceType2).getInstance();
            if (singleton2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.session.SessionTracker");
            }
            sessionTracker = (SessionTracker) singleton2;
        } else {
            if (!(instanceType2 instanceof InstanceType.Factory)) {
                if (instanceType2 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType2 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + SessionTracker.class).toString());
            }
            Object objBuild2 = ((InstanceType.Factory) instanceType2).build();
            if (objBuild2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.session.SessionTracker");
            }
            sessionTracker = (SessionTracker) objBuild2;
        }
        return new SessionDataSourceImpl(context, sessionTracker);
    }

    public final void init(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SimpleDiStorageKt.module(new Function1() { // from class: org.bidon.sdk.utils.di.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DI.init$lambda$1(context, (SimpleDiScope) obj);
            }
        });
        DeviceInfo.INSTANCE.init(context);
        FlavoredDI.INSTANCE.init();
    }

    public final void setFactories() {
        SimpleDiStorageKt.module(new Function1() { // from class: org.bidon.sdk.utils.di.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DI.setFactories$lambda$46((SimpleDiScope) obj);
            }
        });
    }
}
