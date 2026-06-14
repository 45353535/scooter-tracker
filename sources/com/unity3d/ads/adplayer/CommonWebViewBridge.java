package com.unity3d.ads.adplayer;

import androidx.media3.extractor.ts.TsExtractor;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.log.Logger;
import com.vungle.ads.internal.protos.Sdk;
import eg.e0;
import hg.c0;
import hg.l0;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J=\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001cJ'\u0010&\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0017\u0010.\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R8\u00106\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018050403028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010=\u001a\b\u0012\u0004\u0012\u0002090<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"Lcom/unity3d/ads/adplayer/CommonWebViewBridge;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webViewContainer", "Lkotlinx/coroutines/CoroutineScope;", "adPlayerScope", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/adplayer/WebViewContainer;Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;)V", "Lcom/unity3d/ads/adplayer/HandlerType;", "handlerType", "Lorg/json/JSONArray;", "arguments", "", "execute", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "callbackId", "status", "", "", "params", "respond", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "event", "sendEvent", "(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "className", "method", "request", "callbackStatus", "rawParameters", "handleCallback", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", PglCryptUtils.KEY_MESSAGE, "handleInvocation", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/log/Logger;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/Pair;", "Leg/p;", "callbacks", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/adplayer/Invocation;", "_onInvocation", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "onInvocation", "Lkotlinx/coroutines/flow/SharedFlow;", "getOnInvocation", "()Lkotlinx/coroutines/flow/SharedFlow;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonWebViewBridge implements WebViewBridge {

    @NotNull
    private final MutableSharedFlow _onInvocation;

    @NotNull
    private final MutableStateFlow callbacks;

    @NotNull
    private final Logger logger;

    @NotNull
    private final SharedFlow onInvocation;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final WebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", l = {44}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return CommonWebViewBridge.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                if (webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", l = {134, 136, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 138, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 148}, m = "invokeSuspend")
    static final class AnonymousClass7 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $callback;
        final /* synthetic */ String $location;
        final /* synthetic */ String $message;
        final /* synthetic */ JSONArray $parameters;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ CommonWebViewBridge this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1", f = "CommonWebViewBridge.kt", l = {136}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Invocation $invocation;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Invocation invocation, Continuation continuation) {
                super(2, continuation);
                this.$invocation = invocation;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass1(this.$invocation, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    d.b(obj);
                    Deferred deferredIsHandled = this.$invocation.isHandled();
                    this.label = 1;
                    if (deferredIsHandled.await(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                }
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.$location = str;
            this.$parameters = jSONArray;
            this.this$0 = commonWebViewBridge;
            this.$callback = str2;
            this.$message = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$location, this.$parameters, this.this$0, this.$callback, this.$message, continuation);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
        
            if (r6.respond(r7, "OK", r9, r14) == r4) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0112, code lost:
        
            if (r0.respond(r6, "ERROR", r8, r14) != r4) goto L53;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008f A[Catch: all -> 0x0027, PHI: r0 r6
  0x008f: PHI (r0v24 com.unity3d.ads.adplayer.Invocation) = (r0v21 com.unity3d.ads.adplayer.Invocation), (r0v27 com.unity3d.ads.adplayer.Invocation) binds: [B:28:0x008b, B:20:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r6v7 kotlinx.coroutines.CoroutineScope) = (r6v4 kotlinx.coroutines.CoroutineScope), (r6v9 kotlinx.coroutines.CoroutineScope) binds: [B:28:0x008b, B:20:0x0040] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0027, blocks: (B:11:0x0022, B:17:0x0034, B:34:0x009f, B:36:0x00a3, B:39:0x00b3, B:20:0x0040, B:30:0x008f, B:27:0x007a), top: B:64:0x000a, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a3 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:11:0x0022, B:17:0x0034, B:34:0x009f, B:36:0x00a3, B:39:0x00b3, B:20:0x0040, B:30:0x008f, B:27:0x007a), top: B:64:0x000a, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b3 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:11:0x0022, B:17:0x0034, B:34:0x009f, B:36:0x00a3, B:39:0x00b3, B:20:0x0040, B:30:0x008f, B:27:0x007a), top: B:64:0x000a, outer: #1 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 378
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.AnonymousClass7.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$request$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {77, 79}, m = "request")
    static final class C47441 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C47441(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonWebViewBridge.this.request(null, null, null, this);
        }
    }

    public CommonWebViewBridge(@NotNull CoroutineDispatcher dispatcher, @NotNull WebViewContainer webViewContainer, @NotNull CoroutineScope adPlayerScope, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        CoroutineScope coroutineScopeJ = i.j(i.j(adPlayerScope, dispatcher), new e0("CommonWebViewBridge"));
        this.scope = coroutineScopeJ;
        this.callbacks = l0.a(SetsKt.emptySet());
        MutableSharedFlow mutableSharedFlowB = c0.b(0, 64, null, 5, null);
        this._onInvocation = mutableSharedFlowB;
        this.onInvocation = hg.i.b(mutableSharedFlowB);
        eg.i.d(coroutineScopeJ, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, JSONArray jSONArray, Continuation continuation) {
        Object objEvaluateJavascript = this.webViewContainer.evaluateJavascript("window.nativebridge." + handlerType.getJsPath() + '(' + jSONArray + ");", continuation);
        return objEvaluateJavascript == pf.b.g() ? objEvaluateJavascript : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, Continuation continuation) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        Object objExecute = execute(HandlerType.CALLBACK, new JSONArray((Collection) CollectionsKt.listOf(jSONArray)), continuation);
        return objExecute == pf.b.g() ? objExecute : Unit.f93236a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @NotNull
    public SharedFlow getOnInvocation() {
        return this.onInvocation;
    }

    @NotNull
    public final CoroutineScope getScope() {
        return this.scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleCallback(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = "callbackId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "callbackStatus"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "rawParameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r6)
            java.lang.Object[] r6 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(r0)
            kotlinx.coroutines.flow.MutableStateFlow r0 = r3.callbacks
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            r2 = r1
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r2 = r2.component1()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 == 0) goto L24
            goto L3f
        L3e:
            r1 = 0
        L3f:
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 != 0) goto L45
            goto Lb0
        L45:
            java.lang.Object r4 = r1.component2()
            eg.p r4 = (eg.p) r4
            int r0 = r5.hashCode()
            r2 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r0 == r2) goto L91
            r2 = 2524(0x9dc, float:3.537E-42)
            if (r0 == r2) goto L88
            r2 = 66247144(0x3f2d9e8, float:1.42735105E-36)
            if (r0 == r2) goto L6c
            r2 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r0 == r2) goto L63
            goto L9d
        L63:
            java.lang.String r0 = "error"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L75
            goto L9d
        L6c:
            java.lang.String r0 = "ERROR"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L75
            goto L9d
        L75:
            java.lang.Exception r5 = new java.lang.Exception
            r0 = 0
            r6 = r6[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r0)
            java.lang.String r6 = (java.lang.String) r6
            r5.<init>(r6)
            r4.d(r5)
            goto L9d
        L88:
            java.lang.String r0 = "OK"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L9a
            goto L9d
        L91:
            java.lang.String r0 = "success"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L9a
            goto L9d
        L9a:
            r4.s(r6)
        L9d:
            kotlinx.coroutines.flow.MutableStateFlow r4 = r3.callbacks
        L9f:
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
            java.util.Set r6 = kotlin.collections.SetsKt.minus(r6, r1)
            boolean r5 = r4.b(r5, r6)
            if (r5 == 0) goto L9f
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.handleCallback(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            try {
                JSONArray jSONArray = new JSONArray(message);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj = jSONArray.get(i10);
                    JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
                    if (jSONArray2 == null) {
                        throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + message).toString());
                    }
                    if (jSONArray2.length() != 4) {
                        throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray2).toString());
                    }
                    Object obj2 = jSONArray2.get(0);
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str == null) {
                        throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj3 = jSONArray2.get(1);
                    String str2 = obj3 instanceof String ? (String) obj3 : null;
                    if (str2 == null) {
                        throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj4 = jSONArray2.get(2);
                    JSONArray jSONArray3 = obj4 instanceof JSONArray ? (JSONArray) obj4 : null;
                    if (jSONArray3 == null) {
                        throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj5 = jSONArray2.get(3);
                    String str3 = obj5 instanceof String ? (String) obj5 : null;
                    if (str3 == null) {
                        throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + message).toString());
                    }
                    String str4 = str + '.' + str2;
                    this.logger.debug("Unity Ads WebView calling for: " + str4 + '(' + jSONArray3 + ')');
                    eg.i.d(this.scope, null, null, new AnonymousClass7(str4, jSONArray3, this, str3, message, null), 3, null);
                }
            } catch (JSONException e10) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: " + message, e10);
            }
        } catch (Throwable th2) {
            this.logger.error("Error handling invocation from webview (" + message + ')', th2);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            String message2 = th2.getMessage();
            if (message2 == null) {
                message2 = th2.getClass().getSimpleName();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", null, MapsKt.mapOf(TuplesKt.to("reason_debug", message2), TuplesKt.to("webview_invocation", message)), null, null, null, 58, null);
            throw new IllegalArgumentException("Invalid message passed to CommonWebViewBridge: " + message, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object request(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.Object[] r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.adplayer.CommonWebViewBridge.C47441
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = (com.unity3d.ads.adplayer.CommonWebViewBridge.C47441) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = new com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            kotlin.d.b(r14)
            return r14
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            java.lang.Object r11 = r0.L$0
            eg.p r11 = (eg.p) r11
            kotlin.d.b(r14)
            goto L8b
        L3d:
            kotlin.d.b(r14)
            eg.p r14 = eg.r.c(r4, r5, r4)
            int r2 = r14.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            kotlinx.coroutines.flow.MutableStateFlow r6 = r10.callbacks
        L4e:
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            java.util.Set r8 = (java.util.Set) r8
            kotlin.Pair r9 = kotlin.TuplesKt.to(r2, r14)
            java.util.Set r8 = kotlin.collections.SetsKt.plus(r8, r9)
            boolean r7 = r6.b(r7, r8)
            if (r7 == 0) goto L4e
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            r6.put(r11)
            r6.put(r12)
            r6.put(r2)
            int r11 = r13.length
            r12 = 0
        L73:
            if (r12 >= r11) goto L7d
            r2 = r13[r12]
            r6.put(r2)
            int r12 = r12 + 1
            goto L73
        L7d:
            com.unity3d.ads.adplayer.HandlerType r11 = com.unity3d.ads.adplayer.HandlerType.INVOCATION
            r0.L$0 = r14
            r0.label = r5
            java.lang.Object r11 = r10.execute(r11, r6, r0)
            if (r11 != r1) goto L8a
            goto L95
        L8a:
            r11 = r14
        L8b:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r11 = r11.await(r0)
            if (r11 != r1) goto L96
        L95:
            return r1
        L96:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.request(java.lang.String, java.lang.String, java.lang.Object[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @Nullable
    public Object sendEvent(@NotNull WebViewEvent webViewEvent, @NotNull Continuation continuation) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        Object objExecute = execute(HandlerType.EVENT, jSONArray, continuation);
        return objExecute == pf.b.g() ? objExecute : Unit.f93236a;
    }
}
