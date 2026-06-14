package org.bidon.sdk.utils.di;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.banner.helper.GetOrientationUseCase;
import org.bidon.sdk.auction.impl.GetAuctionRequestUseCaseImpl;
import org.bidon.sdk.auction.usecases.GetAuctionRequestUseCase;
import org.bidon.sdk.bidding.BiddingConfigSynchronizer;
import org.bidon.sdk.config.impl.GetConfigRequestUseCaseImpl;
import org.bidon.sdk.config.usecases.GetConfigRequestUseCase;
import org.bidon.sdk.segment.SegmentSynchronizer;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/utils/di/FlavoredDI;", "", "<init>", "()V", "init", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlavoredDI {

    @NotNull
    public static final FlavoredDI INSTANCE = new FlavoredDI();

    private FlavoredDI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$2(SimpleDiScope module) {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        InstanceType.Factory factory = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.w0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return FlavoredDI.init$lambda$2$lambda$0();
            }
        };
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(GetAuctionRequestUseCase.class)) != null) {
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(GetAuctionRequestUseCase.class) + " already added.").toString());
        }
        simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(GetAuctionRequestUseCase.class), factory);
        InstanceType.Factory factory2 = new InstanceType.Factory() { // from class: org.bidon.sdk.utils.di.x0
            @Override // org.bidon.sdk.utils.di.InstanceType.Factory
            public final Object build() {
                return FlavoredDI.init$lambda$2$lambda$1();
            }
        };
        if (simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(GetConfigRequestUseCase.class)) == null) {
            simpleDiStorage.getInstances().put(kotlin.jvm.internal.v0.b(GetConfigRequestUseCase.class), factory2);
            return Unit.f93236a;
        }
        throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(GetConfigRequestUseCase.class) + " already added.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAuctionRequestUseCase init$lambda$2$lambda$0() {
        CreateRequestBodyUseCase createRequestBodyUseCase;
        GetOrientationUseCase getOrientationUseCase;
        SegmentSynchronizer segmentSynchronizer;
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType<?> instanceType = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(CreateRequestBodyUseCase.class));
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
        InstanceType<?> instanceType2 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(GetOrientationUseCase.class));
        if (instanceType2 instanceof InstanceType.Singleton) {
            Object singleton2 = ((InstanceType.Singleton) instanceType2).getInstance();
            if (singleton2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.banner.helper.GetOrientationUseCase");
            }
            getOrientationUseCase = (GetOrientationUseCase) singleton2;
        } else {
            if (!(instanceType2 instanceof InstanceType.Factory)) {
                if (instanceType2 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType2 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + GetOrientationUseCase.class).toString());
            }
            Object objBuild2 = ((InstanceType.Factory) instanceType2).build();
            if (objBuild2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.banner.helper.GetOrientationUseCase");
            }
            getOrientationUseCase = (GetOrientationUseCase) objBuild2;
        }
        InstanceType<?> instanceType3 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(SegmentSynchronizer.class));
        if (instanceType3 instanceof InstanceType.Singleton) {
            Object singleton3 = ((InstanceType.Singleton) instanceType3).getInstance();
            if (singleton3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.segment.SegmentSynchronizer");
            }
            segmentSynchronizer = (SegmentSynchronizer) singleton3;
        } else {
            if (!(instanceType3 instanceof InstanceType.Factory)) {
                if (instanceType3 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType3 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + SegmentSynchronizer.class).toString());
            }
            Object objBuild3 = ((InstanceType.Factory) instanceType3).build();
            if (objBuild3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.segment.SegmentSynchronizer");
            }
            segmentSynchronizer = (SegmentSynchronizer) objBuild3;
        }
        return new GetAuctionRequestUseCaseImpl(createRequestBodyUseCase, getOrientationUseCase, segmentSynchronizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetConfigRequestUseCase init$lambda$2$lambda$1() {
        CreateRequestBodyUseCase createRequestBodyUseCase;
        SegmentSynchronizer segmentSynchronizer;
        BiddingConfigSynchronizer biddingConfigSynchronizer;
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType<?> instanceType = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(CreateRequestBodyUseCase.class));
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
        InstanceType<?> instanceType2 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(SegmentSynchronizer.class));
        if (instanceType2 instanceof InstanceType.Singleton) {
            Object singleton2 = ((InstanceType.Singleton) instanceType2).getInstance();
            if (singleton2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.segment.SegmentSynchronizer");
            }
            segmentSynchronizer = (SegmentSynchronizer) singleton2;
        } else {
            if (!(instanceType2 instanceof InstanceType.Factory)) {
                if (instanceType2 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType2 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + SegmentSynchronizer.class).toString());
            }
            Object objBuild2 = ((InstanceType.Factory) instanceType2).build();
            if (objBuild2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.segment.SegmentSynchronizer");
            }
            segmentSynchronizer = (SegmentSynchronizer) objBuild2;
        }
        InstanceType<?> instanceType3 = simpleDiStorage.getInstances().get(kotlin.jvm.internal.v0.b(BiddingConfigSynchronizer.class));
        if (instanceType3 instanceof InstanceType.Singleton) {
            Object singleton3 = ((InstanceType.Singleton) instanceType3).getInstance();
            if (singleton3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.bidding.BiddingConfigSynchronizer");
            }
            biddingConfigSynchronizer = (BiddingConfigSynchronizer) singleton3;
        } else {
            if (!(instanceType3 instanceof InstanceType.Factory)) {
                if (instanceType3 instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType3 != null) {
                    throw new lf.m();
                }
                throw new IllegalStateException(("No factory provided for class: " + BiddingConfigSynchronizer.class).toString());
            }
            Object objBuild3 = ((InstanceType.Factory) instanceType3).build();
            if (objBuild3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.bidding.BiddingConfigSynchronizer");
            }
            biddingConfigSynchronizer = (BiddingConfigSynchronizer) objBuild3;
        }
        return new GetConfigRequestUseCaseImpl(createRequestBodyUseCase, segmentSynchronizer, biddingConfigSynchronizer);
    }

    public final void init() {
        SimpleDiStorageKt.module(new Function1() { // from class: org.bidon.sdk.utils.di.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlavoredDI.init$lambda$2((SimpleDiScope) obj);
            }
        });
    }
}
