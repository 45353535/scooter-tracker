package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import eg.i;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayInitializationResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "transactionEventManager", "Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "triggerInitializationCompletedRequest", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sdkScope", "Lkotlinx/coroutines/CoroutineScope;", "handleDebugSettings", "Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "getSafeguardedInitializationPolicy", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "(Lcom/unity3d/ads/core/data/manager/TransactionEventManager;Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/domain/HandleDebugSettings;Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;)V", "invoke", "", "response", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {

    @NotNull
    private final GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy;

    @NotNull
    private final HandleDebugSettings handleDebugSettings;

    @NotNull
    private final CoroutineScope sdkScope;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final TransactionEventManager transactionEventManager;

    @NotNull
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$3", f = "AndroidHandleGatewayInitializationResponse.kt", l = {44}, m = "invokeSuspend")
    static final class AnonymousClass3 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidHandleGatewayInitializationResponse.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                TriggerInitializationCompletedRequest triggerInitializationCompletedRequest = AndroidHandleGatewayInitializationResponse.this.triggerInitializationCompletedRequest;
                this.label = 1;
                if (triggerInitializationCompletedRequest.invoke(this) == objG) {
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
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public AndroidHandleGatewayInitializationResponse(@NotNull TransactionEventManager transactionEventManager, @NotNull TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, @NotNull SessionRepository sessionRepository, @NotNull CoroutineScope sdkScope, @NotNull HandleDebugSettings handleDebugSettings, @NotNull GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy) {
        Intrinsics.checkNotNullParameter(transactionEventManager, "transactionEventManager");
        Intrinsics.checkNotNullParameter(triggerInitializationCompletedRequest, "triggerInitializationCompletedRequest");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(sdkScope, "sdkScope");
        Intrinsics.checkNotNullParameter(handleDebugSettings, "handleDebugSettings");
        Intrinsics.checkNotNullParameter(getSafeguardedInitializationPolicy, "getSafeguardedInitializationPolicy");
        this.transactionEventManager = transactionEventManager;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = sdkScope;
        this.handleDebugSettings = handleDebugSettings;
        this.getSafeguardedInitializationPolicy = getSafeguardedInitializationPolicy;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    @Nullable
    public Object invoke(@NotNull InitializationResponseOuterClass.InitializationResponse initializationResponse, @NotNull Continuation continuation) throws GatewayException {
        String universalRequestUrl;
        if (initializationResponse.hasError()) {
            String errorText = initializationResponse.getError().getErrorText();
            Intrinsics.checkNotNullExpressionValue(errorText, "response.error.errorText");
            throw new GatewayException(errorText, new IllegalStateException(initializationResponse.getError().getErrorText()), "gateway_initialization", initializationResponse.getError().getErrorText());
        }
        SessionRepository sessionRepository = this.sessionRepository;
        NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
        Intrinsics.checkNotNullExpressionValue(nativeConfiguration, "response.nativeConfiguration");
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builder = nativeConfiguration.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builder);
        dsl_create.setInitPolicy(this.getSafeguardedInitializationPolicy.invoke(dsl_create.getInitPolicy()));
        sessionRepository.setNativeConfiguration(dsl_create._build());
        if (initializationResponse.hasUniversalRequestUrl() && (universalRequestUrl = initializationResponse.getUniversalRequestUrl()) != null && universalRequestUrl.length() != 0) {
            SessionRepository sessionRepository2 = this.sessionRepository;
            String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
            Intrinsics.checkNotNullExpressionValue(universalRequestUrl2, "response.universalRequestUrl");
            sessionRepository2.setGatewayUrl(universalRequestUrl2);
        }
        List<AdFormatOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
        List<AdFormatOuterClass.AdFormat> scarEligibleFormatsList = initializationResponse.getScarEligibleFormatsList();
        Intrinsics.checkNotNullExpressionValue(scarEligibleFormatsList, "response.scarEligibleFormatsList");
        scarEligibleFormats.addAll(scarEligibleFormatsList);
        if (initializationResponse.getTriggerInitializationCompletedRequest()) {
            i.d(this.sdkScope, null, null, new AnonymousClass3(null), 3, null);
        }
        if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
            this.transactionEventManager.invoke();
        }
        if (initializationResponse.getNativeConfiguration().hasDebugSettings()) {
            HandleDebugSettings handleDebugSettings = this.handleDebugSettings;
            NativeConfigurationOuterClass.DebugSettings debugSettings = initializationResponse.getNativeConfiguration().getDebugSettings();
            Intrinsics.checkNotNullExpressionValue(debugSettings, "response.nativeConfiguration.debugSettings");
            handleDebugSettings.invoke(debugSettings);
        }
        return Unit.f93236a;
    }
}
