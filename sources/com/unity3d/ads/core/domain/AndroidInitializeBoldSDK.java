package com.unity3d.ads.core.domain;

import androidx.media3.extractor.ts.TsExtractor;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.taurusx.tax.f.y;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.core.configuration.ConfigurationReader;
import eg.g;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.TimeMark;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 @2\u00020\u0001:\u0001@B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020*H\u0002J,\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0002J\u0019\u00102\u001a\u00020(2\u0006\u00103\u001a\u000204H\u0082@ø\u0001\u0000¢\u0006\u0002\u00105J(\u00106\u001a\u00020(2\u0006\u00107\u001a\u0002082\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0002J!\u00109\u001a\u00020(2\u0006\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010:J)\u0010;\u001a\u00020(2\u0006\u00107\u001a\u0002082\u0006\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010<J\u0019\u0010=\u001a\u00020(2\u0006\u0010/\u001a\u00020*H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020(H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidInitializeBoldSDK;", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "initializeOM", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "getInitializeRequest", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "cleanAssets", "Lcom/unity3d/ads/core/domain/CleanAssets;", "handleGatewayInitializationResponse", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "eventObservers", "Lcom/unity3d/ads/core/domain/events/EventObservers;", "triggerInitializeListener", "Lcom/unity3d/ads/core/domain/TriggerInitializeListener;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "storageManager", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "legacyConfigurationReader", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "sdkPropertiesManager", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "getGameId", "Lcom/unity3d/ads/core/domain/GetGameId;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "handleFocusCounters", "Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;Lcom/unity3d/ads/core/domain/GetInitializationRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/CleanAssets;Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/events/EventObservers;Lcom/unity3d/ads/core/domain/TriggerInitializeListener;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/data/manager/StorageManager;Lcom/unity3d/services/core/configuration/ConfigurationReader;Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;Lcom/unity3d/ads/core/domain/GetGameId;Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;)V", "checkCanInitialize", "", "getInitLog", "", "getTags", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "source", "isRetry", "", "handleResponse", "response", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializationFailure", "startTime", "Lkotlin/time/TimeMark;", "initializationStart", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializationSuccess", "(Lkotlin/time/TimeMark;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupDiagnosticEvents", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {

    @NotNull
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";

    @NotNull
    public static final String MSG_NETWORK = "Network";

    @NotNull
    public static final String MSG_TIMEOUT = "Timeout";

    @NotNull
    public static final String MSG_UNKNOWN = "Initialization failure";

    @NotNull
    private final CleanAssets cleanAssets;

    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @NotNull
    private final DiagnosticEventRepository diagnosticEventRepository;

    @NotNull
    private final EventObservers eventObservers;

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetGameId getGameId;

    @NotNull
    private final GetInitializationRequest getInitializeRequest;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    @NotNull
    private final AndroidHandleFocusCounters handleFocusCounters;

    @NotNull
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;

    @NotNull
    private final InitializeOMSDK initializeOM;

    @NotNull
    private final ConfigurationReader legacyConfigurationReader;

    @NotNull
    private final Logger logger;

    @NotNull
    private final SDKPropertiesManager sdkPropertiesManager;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final StorageManager storageManager;

    @NotNull
    private final TriggerInitializeListener triggerInitializeListener;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", f = "AndroidInitializeBoldSDK.kt", l = {135, 136, TsExtractor.TS_STREAM_TYPE_DTS_UHD}, m = "initializationSuccess")
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
            return AndroidInitializeBoldSDK.this.initializationSuccess(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", l = {68, 85}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $source;
        int I$0;
        long J$0;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", l = {69, 71, 73, 74}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ boolean $isRetry;
            final /* synthetic */ String $source;
            int label;
            final /* synthetic */ AndroidInitializeBoldSDK this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z10, Continuation continuation) {
                super(2, continuation);
                this.this$0 = androidInitializeBoldSDK;
                this.$source = str;
                this.$isRetry = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass1(this.this$0, this.$source, this.$isRetry, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
            
                if (r1.handleResponse((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13, r12) != r0) goto L26;
             */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[PHI: r9 r13
  0x0078: PHI (r9v2 com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1) = 
  (r9v1 com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1)
  (r9v3 com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1)
 binds: [B:21:0x0075, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r13v12 java.lang.Object) = (r13v11 java.lang.Object), (r13v0 java.lang.Object) binds: [B:21:0x0075, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) throws com.unity3d.ads.core.data.model.exception.InitializationException {
                /*
                    r12 = this;
                    java.lang.Object r0 = pf.b.g()
                    int r1 = r12.label
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r5) goto L2b
                    if (r1 == r4) goto L27
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    kotlin.d.b(r13)
                    r9 = r12
                    goto L85
                L1a:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L22:
                    kotlin.d.b(r13)
                    r9 = r12
                    goto L78
                L27:
                    kotlin.d.b(r13)
                    goto L56
                L2b:
                    kotlin.d.b(r13)
                    goto L42
                L2f:
                    kotlin.d.b(r13)
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    java.lang.String r1 = r12.$source
                    boolean r6 = r12.$isRetry
                    r12.label = r5
                    java.lang.Object r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationStart(r13, r1, r6, r12)
                    if (r13 != r0) goto L42
                L40:
                    r9 = r12
                    goto L84
                L42:
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$checkCanInitialize(r13)
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetInitializationRequest r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetInitializeRequest$p(r13)
                    r12.label = r4
                    java.lang.Object r13 = r13.invoke(r12)
                    if (r13 != r0) goto L56
                    goto L40
                L56:
                    r6 = r13
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetRequestPolicy$p(r13)
                    com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGatewayClient$p(r13)
                    com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION
                    r12.label = r3
                    r5 = 0
                    r10 = 1
                    r11 = 0
                    r9 = r12
                    java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L78
                    goto L84
                L78:
                    gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r1 = r9.this$0
                    r9.label = r2
                    java.lang.Object r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$handleResponse(r1, r13, r12)
                    if (r13 != r0) goto L85
                L84:
                    return r0
                L85:
                    kotlin.Unit r13 = kotlin.Unit.f93236a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation continuation) {
            super(2, continuation);
            this.$source = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidInitializeBoldSDK.this.new AnonymousClass2(this.$source, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        
            if (r12.initializationSuccess(r5, r6, r3, r11) == r0) goto L23;
         */
        /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.time.TimeMark, kotlin.time.h$a, long] */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r11.label
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                kotlin.d.b(r12)
                goto L69
            L13:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1b:
                int r1 = r11.I$0
                long r5 = r11.J$0
                kotlin.d.b(r12)     // Catch: java.lang.Exception -> L23
                goto L55
            L23:
                r12 = move-exception
                goto L6c
            L25:
                kotlin.d.b(r12)
                kotlin.time.h r12 = kotlin.time.h.f93567a
                long r5 = r12.b()
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r12 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.this
                com.unity3d.ads.core.data.repository.SessionRepository r12 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getSessionRepository$p(r12)
                boolean r12 = r12.isFirstInitAttempt()
                r1 = r12 ^ 1
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1 r7 = new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1     // Catch: java.lang.Exception -> L23
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r8 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.this     // Catch: java.lang.Exception -> L23
                java.lang.String r9 = r11.$source     // Catch: java.lang.Exception -> L23
                r12 = r12 ^ r4
                r10 = 0
                r7.<init>(r8, r9, r12, r10)     // Catch: java.lang.Exception -> L23
                r11.J$0 = r5     // Catch: java.lang.Exception -> L23
                r11.I$0 = r1     // Catch: java.lang.Exception -> L23
                r11.label = r4     // Catch: java.lang.Exception -> L23
                r8 = 120000(0x1d4c0, double:5.9288E-319)
                java.lang.Object r12 = eg.x1.c(r8, r7, r11)     // Catch: java.lang.Exception -> L23
                if (r12 != r0) goto L55
                goto L68
            L55:
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r12 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.this
                kotlin.time.h$a r5 = kotlin.time.h.a.c(r5)
                java.lang.String r6 = r11.$source
                if (r1 == 0) goto L60
                r3 = r4
            L60:
                r11.label = r2
                java.lang.Object r12 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationSuccess(r12, r5, r6, r3, r11)
                if (r12 != r0) goto L69
            L68:
                return r0
            L69:
                kotlin.Unit r12 = kotlin.Unit.f93236a
                return r12
            L6c:
                com.unity3d.ads.core.data.model.exception.InitializationException$Companion r0 = com.unity3d.ads.core.data.model.exception.InitializationException.INSTANCE
                com.unity3d.ads.core.data.model.exception.InitializationException r0 = r0.parseFrom(r12)
                boolean r12 = r12 instanceof com.unity3d.ads.core.data.model.exception.GatewayException
                if (r12 == 0) goto L7f
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r12 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.this
                com.unity3d.ads.core.data.repository.SessionRepository r12 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getSessionRepository$p(r12)
                r12.setShouldInitialize(r3)
            L7f:
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r12 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.this
                kotlin.time.h$a r2 = kotlin.time.h.a.c(r5)
                java.lang.String r5 = r11.$source
                if (r1 == 0) goto L8a
                r3 = r4
            L8a:
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationFailure(r12, r2, r0, r5, r3)
                kotlin.Unit r12 = kotlin.Unit.f93236a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public AndroidInitializeBoldSDK(@NotNull CoroutineDispatcher defaultDispatcher, @NotNull InitializeOMSDK initializeOM, @NotNull GetInitializationRequest getInitializeRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull CleanAssets cleanAssets, @NotNull HandleGatewayInitializationResponse handleGatewayInitializationResponse, @NotNull GatewayClient gatewayClient, @NotNull SessionRepository sessionRepository, @NotNull EventObservers eventObservers, @NotNull TriggerInitializeListener triggerInitializeListener, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull DiagnosticEventRepository diagnosticEventRepository, @NotNull StorageManager storageManager, @NotNull ConfigurationReader legacyConfigurationReader, @NotNull SDKPropertiesManager sdkPropertiesManager, @NotNull GetGameId getGameId, @NotNull Logger logger, @NotNull AndroidHandleFocusCounters handleFocusCounters) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(initializeOM, "initializeOM");
        Intrinsics.checkNotNullParameter(getInitializeRequest, "getInitializeRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(cleanAssets, "cleanAssets");
        Intrinsics.checkNotNullParameter(handleGatewayInitializationResponse, "handleGatewayInitializationResponse");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(eventObservers, "eventObservers");
        Intrinsics.checkNotNullParameter(triggerInitializeListener, "triggerInitializeListener");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(legacyConfigurationReader, "legacyConfigurationReader");
        Intrinsics.checkNotNullParameter(sdkPropertiesManager, "sdkPropertiesManager");
        Intrinsics.checkNotNullParameter(getGameId, "getGameId");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(handleFocusCounters, "handleFocusCounters");
        this.defaultDispatcher = defaultDispatcher;
        this.initializeOM = initializeOM;
        this.getInitializeRequest = getInitializeRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.cleanAssets = cleanAssets;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.legacyConfigurationReader = legacyConfigurationReader;
        this.sdkPropertiesManager = sdkPropertiesManager;
        this.getGameId = getGameId;
        this.logger = logger;
        this.handleFocusCounters = handleFocusCounters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() throws InitializationException {
        if (!this.sessionRepository.getShouldInitialize()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", 2, null);
        }
        String strInvoke = this.getGameId.invoke();
        if ((strInvoke != null ? StringsKt.toIntOrNull(strInvoke) : null) != null) {
            return;
        }
        throw new InitializationException("gameId \"" + strInvoke + "\" should be a number.", null, "invalid_game_id", strInvoke, 2, null);
    }

    private final String getInitLog() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Initializing SDK 4.16.4 41604 with game id ");
        sb2.append(this.getGameId.invoke());
        sb2.append(" in ");
        sb2.append(this.sessionRepository.isTestModeEnabled() ? "test" : "production");
        sb2.append(" mode, session ");
        sb2.append(ProtobufExtensionsKt.toUUID(this.sessionRepository.getSessionId()));
        return sb2.toString();
    }

    private final Map<String, String> getTags(InitializationException e10, String source, boolean isRetry) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("operation", OperationType.INITIALIZATION.toString());
        mapCreateMapBuilder.put("reason", e10.getReason());
        mapCreateMapBuilder.put("source", source);
        mapCreateMapBuilder.put("is_retry", String.valueOf(isRetry));
        if (e10.getReasonDebug() != null) {
            mapCreateMapBuilder.put("reason_debug", e10.getReasonDebug());
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleResponse(UniversalResponseOuterClass.UniversalResponse universalResponse, Continuation continuation) throws InitializationException {
        if (universalResponse.hasError()) {
            this.sessionRepository.setShouldInitialize(false);
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", universalResponse.getError().getErrorText(), 2, null);
        }
        if (!universalResponse.hasPayload()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No payload", 2, null);
        }
        if (!universalResponse.getPayload().hasInitializationResponse()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No initialization response", 2, null);
        }
        HandleGatewayInitializationResponse handleGatewayInitializationResponse = this.handleGatewayInitializationResponse;
        InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
        Intrinsics.checkNotNullExpressionValue(initializationResponse, "response.payload.initializationResponse");
        Object objInvoke = handleGatewayInitializationResponse.invoke(initializationResponse, continuation);
        return objInvoke == b.g() ? objInvoke : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(TimeMark startTime, InitializationException e10, String source, boolean isRetry) {
        this.logger.error("Initialization failed: " + e10.getMessage(), e10);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), getTags(e10, source, isRetry), null, null, null, 56, null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, e10.getMessage());
        setupDiagnosticEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializationStart(String str, boolean z10, Continuation continuation) {
        this.logger.info(getInitLog());
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_started", null, MapsKt.mapOf(TuplesKt.to("source", str), TuplesKt.to("is_retry", String.valueOf(z10)), TuplesKt.to("kotlin_version", KotlinVersion.CURRENT.toString())), null, null, null, 58, null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object objInvoke = this.eventObservers.invoke(continuation);
        return objInvoke == b.g() ? objInvoke : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (r1.persistNativeConfiguration(r4) != r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initializationSuccess(kotlin.time.TimeMark r18, java.lang.String r19, boolean r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess(kotlin.time.TimeMark, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void setupDiagnosticEvents() {
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration config = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        Intrinsics.checkNotNullExpressionValue(config, "config");
        diagnosticEventRepository.configure(config);
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    @Nullable
    public Object invoke(@NotNull String str, @NotNull Continuation continuation) {
        Object objG = g.g(this.defaultDispatcher, new AnonymousClass2(str, null), continuation);
        return objG == b.g() ? objG : Unit.f93236a;
    }
}
