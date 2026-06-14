package com.unity3d.services;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4424m2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.vungle.ads.internal.protos.Sdk;
import eg.s;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.time.h;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.i;
import lf.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\r\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0006J.\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\"\u0010\u001e\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u000e\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020.X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u0010/\u001a\u000200X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u0010/\u001a\u000200X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u000208X\u008a\u0084\u0002²\u0006\n\u00109\u001a\u00020:X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002²\u0006\n\u0010;\u001a\u00020<X\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020>X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u000208X\u008a\u0084\u0002"}, d2 = {"Lcom/unity3d/services/UnityAdsSDK;", "Lcom/unity3d/services/core/di/IServiceComponent;", "serviceProvider", "Lcom/unity3d/services/core/di/IServiceProvider;", "(Lcom/unity3d/services/core/di/IServiceProvider;)V", "fetchToken", "", "sync", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishOMIDSession", "Lkotlinx/coroutines/Job;", "opportunityId", "getServiceProvider", "getToken", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/IUnityAdsTokenListener;", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", MobileAdsBridgeBase.initializeMethodName, AndroidGetAdPlayerContext.KEY_GAME_ID, "source", "load", "placementId", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "Lcom/unity3d/ads/IUnityAdsLoadListener;", "bannerSize", "Lcom/unity3d/services/banners/UnityBannerSize;", "sendBannerDestroyed", "", C4424m2.f43623v, "showOptions", "Lcom/unity3d/ads/UnityAdsShowOptions;", "Lcom/unity3d/ads/core/data/model/Listeners;", "unity-ads_defaultRelease", "shouldAllowInitialization", "Lcom/unity3d/ads/core/domain/ShouldAllowInitialization;", "alternativeFlowReader", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "initializeSDK", "Lcom/unity3d/services/core/domain/task/InitializeSDK;", "initializeBoldSDK", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "getGameId", "Lcom/unity3d/ads/core/domain/GetGameId;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "tokenNumberProvider", "Lcom/unity3d/ads/core/domain/TokenNumberProvider;", "getAsyncHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "getAdObject", "Lcom/unity3d/ads/core/domain/GetAdObject;", "omFinishSession", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnityAdsSDK implements IServiceComponent {

    @NotNull
    private final IServiceProvider serviceProvider;

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$finishOMIDSession$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$2", f = "UnityAdsSDK.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Lazy $getAdObject$delegate;
        final /* synthetic */ Lazy $omFinishSession$delegate;
        final /* synthetic */ CoroutineScope $omidScope;
        final /* synthetic */ String $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, CoroutineScope coroutineScope, Lazy lazy, Lazy lazy2, Continuation continuation) {
            super(2, continuation);
            this.$opportunityId = str;
            this.$omidScope = coroutineScope;
            this.$getAdObject$delegate = lazy;
            this.$omFinishSession$delegate = lazy2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass2(this.$opportunityId, this.$omidScope, this.$getAdObject$delegate, this.$omFinishSession$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                AdObject adObjectInvoke = UnityAdsSDK.finishOMIDSession$lambda$19(this.$getAdObject$delegate).invoke(this.$opportunityId);
                if (adObjectInvoke != null) {
                    OmFinishSession omFinishSessionFinishOMIDSession$lambda$20 = UnityAdsSDK.finishOMIDSession$lambda$20(this.$omFinishSession$delegate);
                    this.label = 1;
                    if (omFinishSessionFinishOMIDSession$lambda$20.invoke(adObjectInvoke, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            i.f(this.$omidScope, null, 1, null);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$getToken$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.UnityAdsSDK$getToken$1", f = "UnityAdsSDK.kt", l = {136}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return UnityAdsSDK.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                return obj;
            }
            d.b(obj);
            UnityAdsSDK unityAdsSDK = UnityAdsSDK.this;
            this.label = 1;
            Object objFetchToken = unityAdsSDK.fetchToken("true", this);
            return objFetchToken == objG ? objG : objFetchToken;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$getToken$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", l = {152}, m = "invokeSuspend")
    static final class C48492 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Lazy $getAsyncHeaderBiddingToken$delegate;
        final /* synthetic */ CoroutineScope $getTokenScope;
        final /* synthetic */ IUnityAdsTokenListener $listener;
        final /* synthetic */ TokenConfiguration $tokenConfiguration;
        final /* synthetic */ Lazy $tokenNumberProvider$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C48492(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, CoroutineScope coroutineScope, Lazy lazy, Lazy lazy2, Continuation continuation) {
            super(2, continuation);
            this.$tokenConfiguration = tokenConfiguration;
            this.$listener = iUnityAdsTokenListener;
            this.$getTokenScope = coroutineScope;
            this.$getAsyncHeaderBiddingToken$delegate = lazy;
            this.$tokenNumberProvider$delegate = lazy2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C48492(this.$tokenConfiguration, this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                GetAsyncHeaderBiddingToken token$lambda$8 = UnityAdsSDK.getToken$lambda$8(this.$getAsyncHeaderBiddingToken$delegate);
                int iInvoke = UnityAdsSDK.getToken$lambda$7(this.$tokenNumberProvider$delegate).invoke();
                TokenConfiguration tokenConfiguration = this.$tokenConfiguration;
                IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
                this.label = 1;
                if (token$lambda$8.invoke(iInvoke, tokenConfiguration, iUnityAdsTokenListener, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            i.f(this.$getTokenScope, null, 1, null);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C48492) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$initialize$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.UnityAdsSDK$initialize$1", f = "UnityAdsSDK.kt", l = {89, 95}, m = "invokeSuspend")
    static final class C48501 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Lazy $alternativeFlowReader$delegate;
        final /* synthetic */ String $gameId;
        final /* synthetic */ CoroutineScope $initScope;
        final /* synthetic */ Lazy $initializeBoldSDK$delegate;
        final /* synthetic */ Lazy $initializeSDK$delegate;
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C48501(String str, String str2, CoroutineScope coroutineScope, Lazy lazy, Lazy lazy2, Lazy lazy3, Continuation continuation) {
            super(2, continuation);
            this.$source = str;
            this.$gameId = str2;
            this.$initScope = coroutineScope;
            this.$alternativeFlowReader$delegate = lazy;
            this.$initializeBoldSDK$delegate = lazy2;
            this.$initializeSDK$delegate = lazy3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C48501(this.$source, this.$gameId, this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            if (r6.invoke(r1, r5) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
        
            if (r6.mo7466invokegIAlus(r1, r5) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.d.b(r6)
                kotlin.Result r6 = (kotlin.Result) r6
                r6.l()
                goto La5
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L20:
                kotlin.d.b(r6)
                goto La5
            L25:
                kotlin.d.b(r6)
                kotlin.Lazy r6 = r5.$alternativeFlowReader$delegate
                com.unity3d.ads.core.configuration.AlternativeFlowReader r6 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$1(r6)
                boolean r6 = r6.invoke()
                if (r6 == 0) goto L45
                kotlin.Lazy r6 = r5.$initializeBoldSDK$delegate
                com.unity3d.ads.core.domain.InitializeBoldSDK r6 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$3(r6)
                java.lang.String r1 = r5.$source
                r5.label = r3
                java.lang.Object r6 = r6.invoke(r1, r5)
                if (r6 != r0) goto La5
                goto La4
            L45:
                boolean r6 = com.unity3d.services.core.properties.SdkProperties.isTestMode()
                if (r6 == 0) goto L4e
                java.lang.String r6 = "test mode"
                goto L50
            L4e:
                java.lang.String r6 = "production mode"
            L50:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Initializing Unity Services "
                r1.append(r4)
                java.lang.String r4 = com.unity3d.services.core.properties.SdkProperties.getVersionName()
                r1.append(r4)
                java.lang.String r4 = " ("
                r1.append(r4)
                int r4 = com.unity3d.services.core.properties.SdkProperties.getVersionCode()
                r1.append(r4)
                java.lang.String r4 = ") with game id "
                r1.append(r4)
                java.lang.String r4 = r5.$gameId
                r1.append(r4)
                java.lang.String r4 = " in "
                r1.append(r4)
                r1.append(r6)
                java.lang.String r6 = ", session "
                r1.append(r6)
                com.unity3d.services.core.properties.Session$Default r6 = com.unity3d.services.core.properties.Session.INSTANCE
                java.lang.String r6 = r6.getId()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                com.unity3d.services.core.log.DeviceLog.info(r6)
                kotlin.Lazy r6 = r5.$initializeSDK$delegate
                com.unity3d.services.core.domain.task.InitializeSDK r6 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$2(r6)
                com.unity3d.services.core.domain.task.EmptyParams r1 = com.unity3d.services.core.domain.task.EmptyParams.INSTANCE
                r5.label = r2
                java.lang.Object r6 = r6.mo7466invokegIAlus(r1, r5)
                if (r6 != r0) goto La5
            La4:
                return r0
            La5:
                kotlinx.coroutines.CoroutineScope r6 = r5.$initScope
                r0 = 0
                kotlinx.coroutines.i.f(r6, r0, r3, r0)
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.UnityAdsSDK.C48501.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C48501) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$load$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", l = {116}, m = "invokeSuspend")
    static final class C48511 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ Lazy $context$delegate;
        final /* synthetic */ IUnityAdsLoadListener $listener;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ CoroutineScope $loadScope;
        final /* synthetic */ String $placementId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C48511(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, CoroutineScope coroutineScope, Lazy lazy, Continuation continuation) {
            super(2, continuation);
            this.$placementId = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$listener = iUnityAdsLoadListener;
            this.$bannerSize = unityBannerSize;
            this.$loadScope = coroutineScope;
            this.$context$delegate = lazy;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return UnityAdsSDK.this.new C48511(this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C48511 c48511;
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                LegacyLoadUseCase legacyLoadUseCase = (LegacyLoadUseCase) UnityAdsSDK.this.getServiceProvider().getRegistry().getService("", v0.b(LegacyLoadUseCase.class));
                Context contextLoad$lambda$5 = UnityAdsSDK.load$lambda$5(this.$context$delegate);
                String str = this.$placementId;
                UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                IUnityAdsLoadListener iUnityAdsLoadListener = this.$listener;
                UnityBannerSize unityBannerSize = this.$bannerSize;
                this.label = 1;
                c48511 = this;
                if (legacyLoadUseCase.invoke(contextLoad$lambda$5, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, c48511) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                c48511 = this;
            }
            i.f(c48511.$loadScope, null, 1, null);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C48511) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$show$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.UnityAdsSDK$show$1", f = "UnityAdsSDK.kt", l = {126}, m = "invokeSuspend")
    static final class C48521 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Listeners $listener;
        final /* synthetic */ String $placementId;
        final /* synthetic */ LegacyShowUseCase $showBoldSDK;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        final /* synthetic */ CoroutineScope $showScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C48521(LegacyShowUseCase legacyShowUseCase, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, CoroutineScope coroutineScope, Continuation continuation) {
            super(2, continuation);
            this.$showBoldSDK = legacyShowUseCase;
            this.$placementId = str;
            this.$showOptions = unityAdsShowOptions;
            this.$listener = listeners;
            this.$showScope = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C48521(this.$showBoldSDK, this.$placementId, this.$showOptions, this.$listener, this.$showScope, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                LegacyShowUseCase legacyShowUseCase = this.$showBoldSDK;
                String str = this.$placementId;
                UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                Listeners listeners = this.$listener;
                this.label = 1;
                if (legacyShowUseCase.invoke(str, unityAdsShowOptions, listeners, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            i.f(this.$showScope, null, 1, null);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C48521) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public UnityAdsSDK() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchToken(String str, Continuation continuation) {
        String str2;
        String str3;
        String str4;
        l lVar = l.f94211d;
        final String str5 = "";
        Lazy lazyB = lf.i.b(lVar, new Function0<TokenNumberProvider>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.TokenNumberProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TokenNumberProvider invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, v0.b(TokenNumberProvider.class));
            }
        });
        Lazy lazyB2 = lf.i.b(lVar, new Function0<GetHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetHeaderBiddingToken, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetHeaderBiddingToken invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, v0.b(GetHeaderBiddingToken.class));
            }
        });
        Lazy lazyB3 = lf.i.b(lVar, new Function0<GetInitializationState>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetInitializationState, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetInitializationState invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, v0.b(GetInitializationState.class));
            }
        });
        Lazy lazyB4 = lf.i.b(lVar, new Function0<SendDiagnosticEvent>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, v0.b(SendDiagnosticEvent.class));
            }
        });
        Lazy lazyB5 = lf.i.b(lVar, new Function0<Logger>() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.log.Logger, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Logger invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, v0.b(Logger.class));
            }
        });
        long jB = h.f93567a.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$12(lazyB4), "native_gateway_token_started", null, MapsKt.mapOf(TuplesKt.to("sync", str), TuplesKt.to("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$11(lazyB3), false, 1, null).toString())), null, null, null, 58, null);
        if (GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$11(lazyB3), false, 1, null) != InitializationState.INITIALIZED) {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        } else {
            try {
                str4 = (String) eg.h.b(null, new UnityAdsSDK$fetchToken$token$1(lazyB2, lazyB, null), 1, null);
                str2 = null;
                str3 = null;
            } catch (Exception e10) {
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e10, 0, 1, null);
                str2 = "uncaught_exception";
                str3 = shortenedStackTrace$default;
                str4 = null;
            }
        }
        SendDiagnosticEvent sendDiagnosticEventFetchToken$lambda$12 = fetchToken$lambda$12(lazyB4);
        String str6 = str4 == null ? "native_gateway_token_failure_time" : "native_gateway_token_success_time";
        Double dB = kotlin.coroutines.jvm.internal.b.b(TimeExtensionsKt.elapsedMillis(h.a.c(jB)));
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("sync", str);
        mapCreateMapBuilder.put("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$11(lazyB3), false, 1, null).toString());
        if (str2 != null) {
        }
        if (str3 != null) {
            mapCreateMapBuilder.put("reason_debug", str3);
        }
        Unit unit = Unit.f93236a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEventFetchToken$lambda$12, str6, dB, MapsKt.build(mapCreateMapBuilder), null, null, kotlin.coroutines.jvm.internal.b.d(fetchToken$lambda$9(lazyB).invoke()), 24, null);
        if (str4 == null) {
            Logger.DefaultImpls.error$default(fetchToken$lambda$13(lazyB5), "Returned nil token due to: " + str2, null, 2, null);
        } else {
            fetchToken$lambda$13(lazyB5).info("Generated a valid token.");
        }
        return str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetHeaderBiddingToken fetchToken$lambda$10(Lazy lazy) {
        return (GetHeaderBiddingToken) lazy.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$11(Lazy lazy) {
        return (GetInitializationState) lazy.getValue();
    }

    private static final SendDiagnosticEvent fetchToken$lambda$12(Lazy lazy) {
        return (SendDiagnosticEvent) lazy.getValue();
    }

    private static final Logger fetchToken$lambda$13(Lazy lazy) {
        return (Logger) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider fetchToken$lambda$9(Lazy lazy) {
        return (TokenNumberProvider) lazy.getValue();
    }

    private static final AlternativeFlowReader finishOMIDSession$lambda$17(Lazy lazy) {
        return (AlternativeFlowReader) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdObject finishOMIDSession$lambda$19(Lazy lazy) {
        return (GetAdObject) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmFinishSession finishOMIDSession$lambda$20(Lazy lazy) {
        return (OmFinishSession) lazy.getValue();
    }

    private static final GetGameId getToken$lambda$6(Lazy lazy) {
        return (GetGameId) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider getToken$lambda$7(Lazy lazy) {
        return (TokenNumberProvider) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAsyncHeaderBiddingToken getToken$lambda$8(Lazy lazy) {
        return (GetAsyncHeaderBiddingToken) lazy.getValue();
    }

    public static /* synthetic */ Job initialize$default(UnityAdsSDK unityAdsSDK, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "api";
        }
        return unityAdsSDK.initialize(str, str2);
    }

    private static final ShouldAllowInitialization initialize$lambda$0(Lazy lazy) {
        return (ShouldAllowInitialization) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlternativeFlowReader initialize$lambda$1(Lazy lazy) {
        return (AlternativeFlowReader) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeSDK initialize$lambda$2(Lazy lazy) {
        return (InitializeSDK) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeBoldSDK initialize$lambda$3(Lazy lazy) {
        return (InitializeBoldSDK) lazy.getValue();
    }

    public static /* synthetic */ Job load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize);
    }

    private static final GetGameId load$lambda$4(Lazy lazy) {
        return (GetGameId) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context load$lambda$5(Lazy lazy) {
        return (Context) lazy.getValue();
    }

    private static final AlternativeFlowReader sendBannerDestroyed$lambda$21(Lazy lazy) {
        return (AlternativeFlowReader) lazy.getValue();
    }

    private static final SendDiagnosticEvent sendBannerDestroyed$lambda$22(Lazy lazy) {
        return (SendDiagnosticEvent) lazy.getValue();
    }

    @NotNull
    public final Job finishOMIDSession(@NotNull String opportunityId) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        l lVar = l.f94211d;
        final String str = "";
        if (!finishOMIDSession$lambda$17(lf.i.b(lVar, new Function0<AlternativeFlowReader>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.configuration.AlternativeFlowReader, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AlternativeFlowReader invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(AlternativeFlowReader.class));
            }
        })).invoke()) {
            s sVarB = a0.b(null, 1, null);
            sVarB.complete();
            return sVarB;
        }
        Lazy lazyB = lf.i.b(lVar, new Function0<GetAdObject>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetAdObject, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetAdObject invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(GetAdObject.class));
            }
        });
        Lazy lazyB2 = lf.i.b(lVar, new Function0<OmFinishSession>() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.om.OmFinishSession, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final OmFinishSession invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(OmFinishSession.class));
            }
        });
        CoroutineScope coroutineScope = (CoroutineScope) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_OMID_SCOPE, v0.b(CoroutineScope.class));
        return eg.i.d(coroutineScope, null, null, new AnonymousClass2(opportunityId, coroutineScope, lazyB, lazyB2, null), 3, null);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    @Nullable
    public final String getToken() {
        return (String) eg.h.b(null, new AnonymousClass1(null), 1, null);
    }

    @NotNull
    public final synchronized Job initialize(@Nullable String gameId, @NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        final String str = "";
        l lVar = l.f94211d;
        if (!initialize$lambda$0(lf.i.b(lVar, new Function0<ShouldAllowInitialization>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.ShouldAllowInitialization, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ShouldAllowInitialization invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(ShouldAllowInitialization.class));
            }
        })).invoke(gameId)) {
            return a0.b(null, 1, null);
        }
        final String str2 = "";
        Lazy lazyB = lf.i.b(lVar, new Function0<AlternativeFlowReader>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.configuration.AlternativeFlowReader, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AlternativeFlowReader invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, v0.b(AlternativeFlowReader.class));
            }
        });
        final String str3 = "";
        Lazy lazyB2 = lf.i.b(lVar, new Function0<InitializeSDK>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.core.domain.task.InitializeSDK, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InitializeSDK invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str3, v0.b(InitializeSDK.class));
            }
        });
        final String str4 = "";
        Lazy lazyB3 = lf.i.b(lVar, new Function0<InitializeBoldSDK>() { // from class: com.unity3d.services.UnityAdsSDK$initialize$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.InitializeBoldSDK, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InitializeBoldSDK invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str4, v0.b(InitializeBoldSDK.class));
            }
        });
        CoroutineScope coroutineScope = (CoroutineScope) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_INIT_SCOPE, v0.b(CoroutineScope.class));
        return eg.i.d(coroutineScope, null, null, new C48501(source, gameId, coroutineScope, lazyB, lazyB3, lazyB2, null), 3, null);
    }

    @NotNull
    public final Job load(@Nullable String placementId, @NotNull UnityAdsLoadOptions loadOptions, @Nullable IUnityAdsLoadListener listener, @Nullable UnityBannerSize bannerSize) {
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        l lVar = l.f94211d;
        final String str = "";
        initialize(load$lambda$4(lf.i.b(lVar, new Function0<GetGameId>() { // from class: com.unity3d.services.UnityAdsSDK$load$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetGameId, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetGameId invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(GetGameId.class));
            }
        })).invoke(), "load");
        CoroutineScope coroutineScope = (CoroutineScope) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_LOAD_SCOPE, v0.b(CoroutineScope.class));
        return eg.i.d(coroutineScope, null, null, new C48511(placementId, loadOptions, listener, bannerSize, coroutineScope, lf.i.b(lVar, new Function0<Context>() { // from class: com.unity3d.services.UnityAdsSDK$load$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Context invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(Context.class));
            }
        }), null), 3, null);
    }

    public final void sendBannerDestroyed() {
        l lVar = l.f94211d;
        final String str = "";
        if (sendBannerDestroyed$lambda$21(lf.i.b(lVar, new Function0<AlternativeFlowReader>() { // from class: com.unity3d.services.UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.configuration.AlternativeFlowReader, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AlternativeFlowReader invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(AlternativeFlowReader.class));
            }
        })).invoke()) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendBannerDestroyed$lambda$22(lf.i.b(lVar, new Function0<SendDiagnosticEvent>() { // from class: com.unity3d.services.UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final SendDiagnosticEvent invoke() {
                    IServiceComponent iServiceComponent = this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(SendDiagnosticEvent.class));
                }
            })), "native_banner_destroyed", null, null, null, null, null, 62, null);
        }
    }

    @NotNull
    public final Job show(@Nullable String placementId, @Nullable UnityAdsShowOptions showOptions, @NotNull Listeners listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CoroutineScope coroutineScope = (CoroutineScope) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_SHOW_SCOPE, v0.b(CoroutineScope.class));
        return eg.i.d(coroutineScope, null, null, new C48521((LegacyShowUseCase) getServiceProvider().getRegistry().getService("", v0.b(LegacyShowUseCase.class)), placementId, showOptions, listener, coroutineScope, null), 3, null);
    }

    public UnityAdsSDK(@NotNull IServiceProvider serviceProvider) {
        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        this.serviceProvider = serviceProvider;
    }

    @NotNull
    public final Job getToken(@Nullable IUnityAdsTokenListener listener) {
        return getToken(null, listener);
    }

    @NotNull
    public final Job getToken(@Nullable TokenConfiguration tokenConfiguration, @Nullable IUnityAdsTokenListener listener) {
        l lVar = l.f94211d;
        final String str = "";
        initialize(getToken$lambda$6(lf.i.b(lVar, new Function0<GetGameId>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetGameId, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetGameId invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(GetGameId.class));
            }
        })).invoke(), "get_token");
        Lazy lazyB = lf.i.b(lVar, new Function0<TokenNumberProvider>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.TokenNumberProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TokenNumberProvider invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(TokenNumberProvider.class));
            }
        });
        Lazy lazyB2 = lf.i.b(lVar, new Function0<GetAsyncHeaderBiddingToken>() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetAsyncHeaderBiddingToken invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(GetAsyncHeaderBiddingToken.class));
            }
        });
        CoroutineScope coroutineScope = (CoroutineScope) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_GET_TOKEN_SCOPE, v0.b(CoroutineScope.class));
        return eg.i.d(coroutineScope, null, null, new C48492(tokenConfiguration, listener, coroutineScope, lazyB2, lazyB, null), 3, null);
    }

    public /* synthetic */ UnityAdsSDK(IServiceProvider iServiceProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ServiceProvider.INSTANCE : iServiceProvider);
    }
}
