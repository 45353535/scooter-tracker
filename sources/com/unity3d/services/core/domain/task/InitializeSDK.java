package com.unity3d.services.core.domain.task;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ<\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020&H\u0016J\u0019\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H\u0082@ø\u0001\u0002¢\u0006\u0002\u0010*R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeSDK;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/EmptyParams;", "", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "configFileFromLocalStorage", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "initializeStateReset", "Lcom/unity3d/services/core/domain/task/InitializeStateReset;", "initializeStateError", "Lcom/unity3d/services/core/domain/task/InitializeStateError;", "initializeStateConfig", "Lcom/unity3d/services/core/domain/task/InitializeStateConfig;", "initializeStateCreate", "Lcom/unity3d/services/core/domain/task/InitializeStateCreate;", "initializeStateLoadCache", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;", "initializeStateLoadWeb", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;", "initializeStateComplete", "Lcom/unity3d/services/core/domain/task/InitializeStateComplete;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;Lcom/unity3d/services/core/domain/task/InitializeStateReset;Lcom/unity3d/services/core/domain/task/InitializeStateError;Lcom/unity3d/services/core/domain/task/InitializeStateConfig;Lcom/unity3d/services/core/domain/task/InitializeStateCreate;Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;Lcom/unity3d/services/core/domain/task/InitializeStateComplete;)V", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/EmptyParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeErrorState", "errorState", "Lcom/unity3d/services/core/configuration/ErrorState;", "taskException", "", "configuration", "Lcom/unity3d/services/core/configuration/Configuration;", "executeErrorState-BWLJW6A", "(Lcom/unity3d/services/core/configuration/ErrorState;Ljava/lang/Throwable;Lcom/unity3d/services/core/configuration/Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "handleInitializationException", "exception", "Lcom/unity3d/services/core/domain/task/InitializationException;", "(Lcom/unity3d/services/core/domain/task/InitializationException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializeSDK extends MetricTask<EmptyParams, Unit> {

    @NotNull
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final InitializeStateComplete initializeStateComplete;

    @NotNull
    private final InitializeStateConfig initializeStateConfig;

    @NotNull
    private final InitializeStateCreate initializeStateCreate;

    @NotNull
    private final InitializeStateError initializeStateError;

    @NotNull
    private final InitializeStateLoadCache initializeStateLoadCache;

    @NotNull
    private final InitializeStateLoadWeb initializeStateLoadWeb;

    @NotNull
    private final InitializeStateReset initializeStateReset;

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {111}, m = "handleInitializationException")
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
            return InitializeSDK.this.handleInitializationException(null, this);
        }
    }

    public InitializeSDK(@NotNull ISDKDispatchers dispatchers, @NotNull ConfigFileFromLocalStorage configFileFromLocalStorage, @NotNull InitializeStateReset initializeStateReset, @NotNull InitializeStateError initializeStateError, @NotNull InitializeStateConfig initializeStateConfig, @NotNull InitializeStateCreate initializeStateCreate, @NotNull InitializeStateLoadCache initializeStateLoadCache, @NotNull InitializeStateLoadWeb initializeStateLoadWeb, @NotNull InitializeStateComplete initializeStateComplete) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(configFileFromLocalStorage, "configFileFromLocalStorage");
        Intrinsics.checkNotNullParameter(initializeStateReset, "initializeStateReset");
        Intrinsics.checkNotNullParameter(initializeStateError, "initializeStateError");
        Intrinsics.checkNotNullParameter(initializeStateConfig, "initializeStateConfig");
        Intrinsics.checkNotNullParameter(initializeStateCreate, "initializeStateCreate");
        Intrinsics.checkNotNullParameter(initializeStateLoadCache, "initializeStateLoadCache");
        Intrinsics.checkNotNullParameter(initializeStateLoadWeb, "initializeStateLoadWeb");
        Intrinsics.checkNotNullParameter(initializeStateComplete, "initializeStateComplete");
        this.dispatchers = dispatchers;
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.initializeStateReset = initializeStateReset;
        this.initializeStateError = initializeStateError;
        this.initializeStateConfig = initializeStateConfig;
        this.initializeStateCreate = initializeStateCreate;
        this.initializeStateLoadCache = initializeStateLoadCache;
        this.initializeStateLoadWeb = initializeStateLoadWeb;
        this.initializeStateComplete = initializeStateComplete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: executeErrorState-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7470executeErrorStateBWLJW6A(com.unity3d.services.core.configuration.ErrorState r6, java.lang.Throwable r7, com.unity3d.services.core.configuration.Configuration r8, kotlin.coroutines.Continuation r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1 r0 = (com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1 r0 = new com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.d.b(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r6 = r9.l()
            return r6
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.d.b(r9)
            com.unity3d.services.core.domain.task.InitializeStateError r9 = r5.initializeStateError
            com.unity3d.services.core.domain.task.InitializeStateError$Params r2 = new com.unity3d.services.core.domain.task.InitializeStateError$Params
            java.lang.Exception r4 = new java.lang.Exception
            if (r7 == 0) goto L47
            java.lang.String r7 = r7.getMessage()
            goto L48
        L47:
            r7 = 0
        L48:
            r4.<init>(r7)
            r2.<init>(r6, r4, r8)
            r0.label = r3
            java.lang.Object r6 = r9.mo7466invokegIAlus(r2, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK.m7470executeErrorStateBWLJW6A(com.unity3d.services.core.configuration.ErrorState, java.lang.Throwable, com.unity3d.services.core.configuration.Configuration, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleInitializationException(com.unity3d.services.core.domain.task.InitializationException r6, kotlin.coroutines.Continuation r7) throws com.unity3d.services.core.domain.task.InitializationException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeSDK.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1 r0 = (com.unity3d.services.core.domain.task.InitializeSDK.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1 r0 = new com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            java.lang.Object r6 = r0.L$0
            com.unity3d.services.core.domain.task.InitializationException r6 = (com.unity3d.services.core.domain.task.InitializationException) r6
            kotlin.d.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            r7.l()
            goto L54
        L3a:
            kotlin.d.b(r7)
            com.unity3d.services.core.configuration.ErrorState r7 = r6.getErrorState()
            java.lang.Exception r2 = r6.getOriginalException()
            com.unity3d.services.core.configuration.Configuration r4 = r6.getConfig()
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r5.m7470executeErrorStateBWLJW6A(r7, r2, r4, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK.handleInitializationException(com.unity3d.services.core.domain.task.InitializationException, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask(MobileAdsBridgeBase.initializeMethodName);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo7465doWorkgIAlus(@org.jetbrains.annotations.NotNull com.unity3d.services.core.domain.task.EmptyParams r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof com.unity3d.services.core.domain.task.InitializeSDK$doWork$1
            if (r5 == 0) goto L13
            r5 = r6
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$1 r5 = (com.unity3d.services.core.domain.task.InitializeSDK$doWork$1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.label = r0
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$1 r5 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$1
            r5.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r5.result
            java.lang.Object r0 = pf.b.g()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.d.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r6)
            com.unity3d.services.core.domain.ISDKDispatchers r6 = r4.dispatchers
            kotlinx.coroutines.CoroutineDispatcher r6 = r6.getDefault()
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$2 r1 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$2
            r3 = 0
            r1.<init>(r4, r3)
            r5.label = r2
            java.lang.Object r6 = eg.g.g(r6, r1, r5)
            if (r6 != r0) goto L49
            return r0
        L49:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.l()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK.mo7465doWorkgIAlus(com.unity3d.services.core.domain.task.EmptyParams, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
