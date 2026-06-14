package com.unity3d.ads.core.domain;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.h;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010$\u001a\u0004\u0018\u00010#H\u0096Bø\u0001\u0000¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R \u0010=\u001a\u00020<8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonInitAwaitingGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getInitializationState", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "awaitInitialization", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/AwaitInitialization;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/log/Logger;)V", "", "tokenNumber", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "", "fetchToken", "(ILcom/unity3d/ads/TokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "token", "tokenSuccess", "(ILjava/lang/String;)V", "reason", "reasonDebug", "tokenFailure", "(ILjava/lang/String;Ljava/lang/String;)V", "tokenStart", "(I)V", "Lcom/unity3d/ads/IUnityAdsTokenListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "invoke", "(ILcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/ads/IUnityAdsTokenListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getGetHeaderBiddingToken", "()Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getGetInitializationState", "()Lcom/unity3d/ads/core/domain/GetInitializationState;", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "getAwaitInitialization", "()Lcom/unity3d/ads/core/domain/AwaitInitialization;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "getSessionRepository", "()Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "getSafeCallbackInvoke", "()Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lcom/unity3d/ads/core/log/Logger;", "getLogger", "()Lcom/unity3d/ads/core/log/Logger;", "Lkotlin/time/h$a;", "startTime", "J", "getStartTime-z9LOYto", "()J", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "getListener", "()Lcom/unity3d/ads/IUnityAdsTokenListener;", "setListener", "(Lcom/unity3d/ads/IUnityAdsTokenListener;)V", "", "didAwaitInit", "Z", "Lcom/unity3d/ads/core/data/model/InitializationState;", "startState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {

    @NotNull
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;

    @NotNull
    private final GetHeaderBiddingToken getHeaderBiddingToken;

    @NotNull
    private final GetInitializationState getInitializationState;

    @Nullable
    private IUnityAdsTokenListener listener;

    @NotNull
    private final Logger logger;

    @NotNull
    private final SafeCallbackInvoke safeCallbackInvoke;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @Nullable
    private InitializationState startState;
    private final long startTime;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {75}, m = "fetchToken")
    static final class AnonymousClass1 extends d {
        int I$0;
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
            return CommonInitAwaitingGetHeaderBiddingToken.this.fetchToken(0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {56, 68}, m = "invoke")
    static final class C47891 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C47891(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonInitAwaitingGetHeaderBiddingToken.this.invoke(0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {59}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return CommonInitAwaitingGetHeaderBiddingToken.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                if (ArraysKt.contains(new InitializationState[]{InitializationState.NOT_INITIALIZED, InitializationState.INITIALIZING}, GetInitializationState.DefaultImpls.invoke$default(CommonInitAwaitingGetHeaderBiddingToken.this.getGetInitializationState(), false, 1, null))) {
                    CommonInitAwaitingGetHeaderBiddingToken.this.didAwaitInit = true;
                    AwaitInitialization awaitInitialization = CommonInitAwaitingGetHeaderBiddingToken.this.getAwaitInitialization();
                    this.label = 1;
                    if (AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public CommonInitAwaitingGetHeaderBiddingToken(@NotNull GetHeaderBiddingToken getHeaderBiddingToken, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetInitializationState getInitializationState, @NotNull AwaitInitialization awaitInitialization, @NotNull SessionRepository sessionRepository, @NotNull SafeCallbackInvoke safeCallbackInvoke, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(getHeaderBiddingToken, "getHeaderBiddingToken");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        Intrinsics.checkNotNullParameter(awaitInitialization, "awaitInitialization");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        this.startTime = h.f93567a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchToken(int r6, com.unity3d.ads.TokenConfiguration r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r7 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r7
            kotlin.d.b(r8)     // Catch: java.lang.Exception -> L30
            goto L4d
        L30:
            r8 = move-exception
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.d.b(r8)
            com.unity3d.ads.core.domain.GetHeaderBiddingToken r8 = r5.getHeaderBiddingToken     // Catch: java.lang.Exception -> L53
            r0.L$0 = r5     // Catch: java.lang.Exception -> L53
            r0.I$0 = r6     // Catch: java.lang.Exception -> L53
            r0.label = r3     // Catch: java.lang.Exception -> L53
            java.lang.Object r8 = r8.invoke(r6, r7, r0)     // Catch: java.lang.Exception -> L53
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r7 = r5
        L4d:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L30
            r0 = r4
            r4 = r8
            r8 = r0
            goto L5c
        L53:
            r8 = move-exception
            r7 = r5
        L55:
            r0 = 0
            java.lang.String r8 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r8, r0, r3, r4)
            java.lang.String r0 = "uncaught_exception"
        L5c:
            if (r4 != 0) goto L62
            r7.tokenFailure(r6, r0, r8)
            goto L65
        L62:
            r7.tokenSuccess(r6, r4)
        L65:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.fetchToken(int, com.unity3d.ads.TokenConfiguration, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void tokenFailure(int tokenNumber, String reason, String reasonDebug) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Double dValueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(h.a.c(this.startTime)));
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("sync", "false");
        mapCreateMapBuilder.put("state", String.valueOf(this.startState));
        mapCreateMapBuilder.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        mapCreateMapBuilder.put("awaited_init", String.valueOf(this.didAwaitInit));
        if (reason != null) {
        }
        if (reasonDebug != null) {
            mapCreateMapBuilder.put("reason_debug", reasonDebug);
        }
        Unit unit = Unit.f93236a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_failure_time", dValueOf, MapsKt.build(mapCreateMapBuilder), null, null, Integer.valueOf(tokenNumber), 24, null);
        Logger.DefaultImpls.error$default(this.logger, "Returned nil token due to: " + reason, null, 2, null);
        this.safeCallbackInvoke.invoke(new Function0<Unit>() { // from class: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.tokenFailure.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
                if (listener != null) {
                    listener.onUnityAdsTokenReady(null);
                }
            }
        });
    }

    static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i10, str, str2);
    }

    private final void tokenStart(int tokenNumber) {
        this.logger.info("Token generation started");
        this.startState = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_started", null, MapsKt.mapOf(TuplesKt.to("sync", "false"), TuplesKt.to("state", String.valueOf(this.startState))), null, null, Integer.valueOf(tokenNumber), 26, null);
    }

    private final void tokenSuccess(int tokenNumber, final String token) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(h.a.c(this.startTime))), MapsKt.mapOf(TuplesKt.to("sync", "false"), TuplesKt.to("state", String.valueOf(this.startState)), TuplesKt.to("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), TuplesKt.to("awaited_init", String.valueOf(this.didAwaitInit))), null, null, Integer.valueOf(tokenNumber), 24, null);
        this.logger.info("Generated a valid token.");
        this.safeCallbackInvoke.invoke(new Function0<Unit>() { // from class: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.tokenSuccess.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
                if (listener != null) {
                    listener.onUnityAdsTokenReady(token);
                }
            }
        });
    }

    @NotNull
    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    @NotNull
    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    @NotNull
    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    @Nullable
    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @NotNull
    public final SafeCallbackInvoke getSafeCallbackInvoke() {
        return this.safeCallbackInvoke;
    }

    @NotNull
    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    @NotNull
    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    /* JADX INFO: renamed from: getStartTime-z9LOYto, reason: not valid java name and from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r11.fetchToken(r9, r10, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(int r9, @org.jetbrains.annotations.Nullable com.unity3d.ads.TokenConfiguration r10, @org.jetbrains.annotations.Nullable com.unity3d.ads.IUnityAdsTokenListener r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C47891
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C47891) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            java.lang.String r3 = "!sessionRepository.shouldInitialize"
            java.lang.String r4 = "gateway"
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L48
            if (r2 == r6) goto L3a
            if (r2 != r5) goto L32
            kotlin.d.b(r12)
            goto La9
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            int r9 = r0.I$0
            java.lang.Object r10 = r0.L$1
            com.unity3d.ads.TokenConfiguration r10 = (com.unity3d.ads.TokenConfiguration) r10
            java.lang.Object r11 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r11 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r11
            kotlin.d.b(r12)
            goto L8e
        L48:
            kotlin.d.b(r12)
            r8.listener = r11
            r8.tokenStart(r9)
            if (r11 != 0) goto L5c
            java.lang.String r10 = "listener_null"
            java.lang.String r11 = "IUnityAdsTokenListener is null"
            r8.tokenFailure(r9, r10, r11)
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        L5c:
            com.unity3d.ads.core.data.repository.SessionRepository r11 = r8.sessionRepository
            boolean r11 = r11.getShouldInitialize()
            if (r11 != 0) goto L6a
            r8.tokenFailure(r9, r4, r3)
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        L6a:
            com.unity3d.ads.core.data.repository.SessionRepository r11 = r8.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r11 = r11.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfiguration r11 = r11.getAdOperations()
            int r11 = r11.getGetTokenTimeoutMs()
            long r11 = (long) r11
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2 r2 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2
            r2.<init>(r7)
            r0.L$0 = r8
            r0.L$1 = r10
            r0.I$0 = r9
            r0.label = r6
            java.lang.Object r11 = eg.x1.e(r11, r2, r0)
            if (r11 != r1) goto L8d
            goto La8
        L8d:
            r11 = r8
        L8e:
            com.unity3d.ads.core.data.repository.SessionRepository r12 = r11.sessionRepository
            boolean r12 = r12.getShouldInitialize()
            if (r12 != 0) goto L9c
            r11.tokenFailure(r9, r4, r3)
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        L9c:
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r9 = r11.fetchToken(r9, r10, r0)
            if (r9 != r1) goto La9
        La8:
            return r1
        La9:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, com.unity3d.ads.IUnityAdsTokenListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setListener(@Nullable IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}
