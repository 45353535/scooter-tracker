package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.vungle.ads.internal.protos.Sdk;
import eg.h;
import eg.i;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import hg.c0;
import hg.l0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020\u0017H\u0016J\u0011\u0010v\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010wJ\u0011\u0010x\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010wJ\u0011\u0010y\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010wJ\b\u0010z\u001a\u00020tH\u0016J\b\u0010{\u001a\u00020tH\u0016J\b\u0010|\u001a\u00020tH\u0016J\b\u0010}\u001a\u00020tH\u0016J\b\u0010~\u001a\u00020tH\u0016J\b\u0010\u007f\u001a\u00020tH\u0016J\t\u0010\u0080\u0001\u001a\u00020tH\u0016J\t\u0010\u0081\u0001\u001a\u00020tH\u0016J\t\u0010\u0082\u0001\u001a\u00020tH\u0016J\t\u0010\u0083\u0001\u001a\u00020tH\u0016J\u0012\u0010\u0084\u0001\u001a\u00020tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010wJ\t\u0010\u0085\u0001\u001a\u00020tH\u0016J\u001b\u0010\u0086\u0001\u001a\u00020t2\u0006\u0010,\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0087\u0001J\u001b\u0010\u0088\u0001\u001a\u00020t2\u0006\u0010,\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0087\u0001J\u001b\u0010\u0089\u0001\u001a\u00020t2\u0006\u0010,\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0087\u0001R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010-\u001a\u0004\u0018\u00010\u00142\b\u0010,\u001a\u0004\u0018\u00010\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u00102\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\u0014\u0010:\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R$\u0010=\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010CR\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010F\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010CR\u0014\u0010G\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010CR\u0014\u0010H\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010CR\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010I\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00190O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001f0SX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0014\u0010V\u001a\b\u0012\u0004\u0012\u00020\n0OX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020Y0XX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R$\u0010\\\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u00104R$\u0010c\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bd\u00104\"\u0004\be\u00106R$\u0010f\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bg\u0010C\"\u0004\bh\u0010iR$\u0010j\u001a\u00020'2\u0006\u0010,\u001a\u00020'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010o\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010/R\u0016\u0010q\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008a\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidSessionRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "gatewayCacheDataSource", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "privacyDataSource", "fsmDataSource", "nativeConfigDataSource", "unityInfoDataSource", "Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "defaultNativeConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "_currentState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/google/protobuf/ByteString;", "_gameId", "", "_gatewayUrl", "_headerBiddingTokenCounter", "", "_initializationState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "_isFirstInitAttempt", "", "_isTestModeEnabled", "_onChange", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "_sdkConfiguration", "_sessionCounters", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "_sessionId", "_sessionToken", "_shouldInitialize", "_tokenCounters", "Lcom/unity3d/ads/core/data/model/TokenCounters;", "featureFlags", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "value", AndroidGetAdPlayerContext.KEY_GAME_ID, "getGameId", "()Ljava/lang/String;", "setGameId", "(Ljava/lang/String;)V", "gatewayState", "getGatewayState", "()Lcom/google/protobuf/ByteString;", "setGatewayState", "(Lcom/google/protobuf/ByteString;)V", "gatewayUrl", "getGatewayUrl", "setGatewayUrl", "headerBiddingTokenCounter", "getHeaderBiddingTokenCounter", "()I", "initializationState", "getInitializationState", "()Lcom/unity3d/ads/core/data/model/InitializationState;", "setInitializationState", "(Lcom/unity3d/ads/core/data/model/InitializationState;)V", "isDiagnosticsEnabled", "()Z", "isFirstInitAttempt", "isInit", "isOmEnabled", "isSdkInitialized", "isTestModeEnabled", "nativeConfiguration", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "observeInitializationState", "Lkotlinx/coroutines/flow/Flow;", "getObserveInitializationState", "()Lkotlinx/coroutines/flow/Flow;", "onChange", "Lkotlinx/coroutines/flow/SharedFlow;", "getOnChange", "()Lkotlinx/coroutines/flow/SharedFlow;", "persistedNativeConfiguration", "scarEligibleFormats", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "getScarEligibleFormats", "()Ljava/util/List;", "sessionCounters", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", JsonStorageKeyNames.SESSION_ID_KEY, "getSessionId", "sessionToken", "getSessionToken", "setSessionToken", "shouldInitialize", "getShouldInitialize", "setShouldInitialize", "(Z)V", "tokenCounters", "getTokenCounters", "()Lcom/unity3d/ads/core/data/model/TokenCounters;", "setTokenCounters", "(Lcom/unity3d/ads/core/data/model/TokenCounters;)V", "unityInstallationId", "getUnityInstallationId", "unityMegaSessionId", "getUnityMegaSessionId", "addTimeToGlobalAdsFocusTime", "", "timeMs", "getGatewayCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrivacy", "getPrivacyFsm", "incrementBannerImpressionCount", "incrementBannerLoadRequestAdmCount", "incrementBannerLoadRequestCount", "incrementFocusChangeCount", "incrementGlobalAdsFocusChangeCount", "incrementLoadRequestAdmCount", "incrementLoadRequestCount", "incrementTokenSequenceNumber", "incrementTokenStartsCount", "incrementTokenWinsCount", "persistNativeConfiguration", "resetTokenCounters", "setGatewayCache", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPrivacy", "setPrivacyFsm", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidSessionRepository implements SessionRepository {

    @NotNull
    private final MutableStateFlow _currentState;

    @NotNull
    private MutableStateFlow _gameId;

    @NotNull
    private final MutableStateFlow _gatewayUrl;

    @NotNull
    private final MutableStateFlow _headerBiddingTokenCounter;

    @NotNull
    private final MutableStateFlow _initializationState;

    @NotNull
    private final MutableStateFlow _isFirstInitAttempt;

    @NotNull
    private final MutableStateFlow _isTestModeEnabled;

    @NotNull
    private MutableSharedFlow _onChange;

    @NotNull
    private final MutableStateFlow _sdkConfiguration;

    @NotNull
    private final MutableStateFlow _sessionCounters;

    @NotNull
    private final MutableStateFlow _sessionId;

    @NotNull
    private final MutableStateFlow _sessionToken;

    @NotNull
    private final MutableStateFlow _shouldInitialize;

    @NotNull
    private final MutableStateFlow _tokenCounters;

    @NotNull
    private final ByteStringDataSource fsmDataSource;

    @NotNull
    private final ByteStringDataSource gatewayCacheDataSource;

    @NotNull
    private final MutableStateFlow isInit;

    @NotNull
    private final ByteStringDataSource nativeConfigDataSource;

    @NotNull
    private final SharedFlow onChange;

    @NotNull
    private final Flow persistedNativeConfiguration;

    @NotNull
    private final ByteStringDataSource privacyDataSource;

    @NotNull
    private final List<AdFormatOuterClass.AdFormat> scarEligibleFormats;

    @NotNull
    private final AndroidUnityInfoDataSource unityInfoDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", l = {44}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SendDiagnosticEvent sendDiagnosticEvent, Continuation continuation) {
            super(2, continuation);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidSessionRepository.this.new AnonymousClass1(this.$sendDiagnosticEvent, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    d.b(obj);
                    ByteStringDataSource byteStringDataSource = AndroidSessionRepository.this.nativeConfigDataSource;
                    this.label = 1;
                    obj = byteStringDataSource.get(this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    MutableStateFlow mutableStateFlow = AndroidSessionRepository.this._sdkConfiguration;
                    NativeConfigurationOuterClass.NativeConfiguration from = NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data);
                    Intrinsics.checkNotNullExpressionValue(from, "parseFrom(data)");
                    mutableStateFlow.setValue(from);
                }
            } catch (Exception e10) {
                SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                String message = e10.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", null, MapsKt.mapOf(TuplesKt.to("debugReason", message)), null, null, null, 58, null);
            }
            AndroidSessionRepository.this.isInit.setValue(kotlin.coroutines.jvm.internal.b.a(true));
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {210}, m = "getGatewayCache")
    static final class C47831 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C47831(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getGatewayCache(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "getPrivacy")
    static final class C47841 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C47841(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE}, m = "getPrivacyFsm")
    static final class C47851 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C47851(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacyFsm(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE}, m = "setPrivacy")
    static final class C47861 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C47861(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacy(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE}, m = "setPrivacyFsm")
    static final class C47871 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C47871(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacyFsm(null, this);
        }
    }

    public AndroidSessionRepository(@NotNull ByteStringDataSource gatewayCacheDataSource, @NotNull ByteStringDataSource privacyDataSource, @NotNull ByteStringDataSource fsmDataSource, @NotNull ByteStringDataSource nativeConfigDataSource, @NotNull AndroidUnityInfoDataSource unityInfoDataSource, @NotNull NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration, @NotNull CoroutineDispatcher dispatcher, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(gatewayCacheDataSource, "gatewayCacheDataSource");
        Intrinsics.checkNotNullParameter(privacyDataSource, "privacyDataSource");
        Intrinsics.checkNotNullParameter(fsmDataSource, "fsmDataSource");
        Intrinsics.checkNotNullParameter(nativeConfigDataSource, "nativeConfigDataSource");
        Intrinsics.checkNotNullParameter(unityInfoDataSource, "unityInfoDataSource");
        Intrinsics.checkNotNullParameter(defaultNativeConfiguration, "defaultNativeConfiguration");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.gatewayCacheDataSource = gatewayCacheDataSource;
        this.privacyDataSource = privacyDataSource;
        this.fsmDataSource = fsmDataSource;
        this.nativeConfigDataSource = nativeConfigDataSource;
        this.unityInfoDataSource = unityInfoDataSource;
        MutableStateFlow mutableStateFlowA = l0.a(defaultNativeConfiguration);
        this._sdkConfiguration = mutableStateFlowA;
        MutableStateFlow mutableStateFlowA2 = l0.a(Boolean.FALSE);
        this.isInit = mutableStateFlowA2;
        i.d(kotlinx.coroutines.i.a(dispatcher), null, null, new AnonymousClass1(sendDiagnosticEvent, null), 3, null);
        final Flow flowC = hg.i.C(mutableStateFlowA, mutableStateFlowA2, new AndroidSessionRepository$persistedNativeConfiguration$1(null));
        final Flow flow = new Flow() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r6)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.d.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        r2 = r5
                        kotlin.Pair r2 = (kotlin.Pair) r2
                        java.lang.Object r2 = r2.getSecond()
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L4e
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4e
                        return r1
                    L4e:
                        kotlin.Unit r5 = kotlin.Unit.f93236a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowC.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == b.g() ? objCollect : Unit.f93236a;
            }
        };
        this.persistedNativeConfiguration = new Flow() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.d.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        kotlin.Pair r5 = (kotlin.Pair) r5
                        java.lang.Object r5 = r5.getFirst()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        kotlin.Unit r5 = kotlin.Unit.f93236a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == b.g() ? objCollect : Unit.f93236a;
            }
        };
        this.scarEligibleFormats = new ArrayList();
        MutableSharedFlow mutableSharedFlowB = c0.b(0, 0, null, 7, null);
        this._onChange = mutableSharedFlowB;
        this.onChange = hg.i.b(mutableSharedFlowB);
        String gameId = ClientProperties.getGameId();
        this._gameId = l0.a(gameId != null ? gameId : null);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        this._sessionId = l0.a(ProtobufExtensionsKt.toByteString(uuidRandomUUID));
        this._isTestModeEnabled = l0.a(Boolean.valueOf(SdkProperties.isTestMode()));
        SessionCountersOuterClass.SessionCounters sessionCountersBuild = SessionCountersOuterClass.SessionCounters.newBuilder().build();
        Intrinsics.checkNotNullExpressionValue(sessionCountersBuild, "newBuilder().build()");
        this._sessionCounters = l0.a(sessionCountersBuild);
        this._tokenCounters = l0.a(new TokenCounters(0, 0, 0));
        ByteString EMPTY = ByteString.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        this._sessionToken = l0.a(EMPTY);
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        this._currentState = l0.a(EMPTY);
        this._gatewayUrl = l0.a(UnityAdsConstants.DefaultUrls.GATEWAY_URL);
        this._initializationState = l0.a(InitializationState.NOT_INITIALIZED);
        this._headerBiddingTokenCounter = l0.a(0);
        Boolean bool = Boolean.TRUE;
        this._shouldInitialize = l0.a(bool);
        this._isFirstInitAttempt = l0.a(bool);
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void addTimeToGlobalAdsFocusTime(int timeMs) {
        Object value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setGlobalAdsFocusTime(dsl_create.getGlobalAdsFocusTime() + timeMs);
        } while (!mutableStateFlow.b(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        NativeConfigurationOuterClass.FeatureFlags featureFlags = getNativeConfiguration().getFeatureFlags();
        Intrinsics.checkNotNullExpressionValue(featureFlags, "nativeConfiguration.featureFlags");
        return featureFlags;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public String getGameId() {
        Object value;
        String gameId;
        MutableStateFlow mutableStateFlow = this._gameId;
        do {
            value = mutableStateFlow.getValue();
            gameId = ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!mutableStateFlow.b(value, gameId));
        return gameId;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getGatewayCache(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C47831
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C47831) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.d.b(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.gatewayCacheDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "gatewayCacheDataSource.get().data"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getGatewayCache(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public ByteString getGatewayState() {
        return (ByteString) this._currentState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public String getGatewayUrl() {
        return (String) this._gatewayUrl.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        Object value;
        Number number;
        MutableStateFlow mutableStateFlow = this._headerBiddingTokenCounter;
        do {
            value = mutableStateFlow.getValue();
            number = (Number) value;
        } while (!mutableStateFlow.b(value, Integer.valueOf(number.intValue() + 1)));
        return number.intValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public InitializationState getInitializationState() {
        return (InitializationState) this._initializationState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        return !((Boolean) this.isInit.getValue()).booleanValue() ? (NativeConfigurationOuterClass.NativeConfiguration) h.b(null, new AndroidSessionRepository$nativeConfiguration$1(this, null), 1, null) : (NativeConfigurationOuterClass.NativeConfiguration) this._sdkConfiguration.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public Flow getObserveInitializationState() {
        return this._initializationState;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public SharedFlow getOnChange() {
        return this.onChange;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getPrivacy(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C47841
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C47841) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.d.b(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.privacyDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "privacyDataSource.get().data"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacy(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getPrivacyFsm(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C47851
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C47851) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.d.b(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.fsmDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "fsmDataSource.get().data"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacyFsm(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public List<AdFormatOuterClass.AdFormat> getScarEligibleFormats() {
        return this.scarEligibleFormats;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return (SessionCountersOuterClass.SessionCounters) this._sessionCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public ByteString getSessionId() {
        return (ByteString) this._sessionId.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public ByteString getSessionToken() {
        return (ByteString) this._sessionToken.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return ((Boolean) this._shouldInitialize.getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public TokenCounters getTokenCounters() {
        return (TokenCounters) this._tokenCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public String getUnityInstallationId() {
        return this.unityInfoDataSource.getUnityInstallationId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public String getUnityMegaSessionId() {
        return this.unityInfoDataSource.getUnityMegaSessionId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        Object value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerImpressions(dsl_create.getBannerImpressions() + 1);
        } while (!mutableStateFlow.b(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        Object value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerRequestsAdm(dsl_create.getBannerRequestsAdm() + 1);
        } while (!mutableStateFlow.b(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        Object value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerLoadRequests(dsl_create.getBannerLoadRequests() + 1);
        } while (!mutableStateFlow.b(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementFocusChangeCount() {
        Object value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setFocusChangeCount(dsl_create.getFocusChangeCount() + 1);
        } while (!mutableStateFlow.b(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementGlobalAdsFocusChangeCount() {
        Object value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setGlobalAdsFocusChangeCount(dsl_create.getGlobalAdsFocusChangeCount() + 1);
        } while (!mutableStateFlow.b(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        Object value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequestsAdm(dsl_create.getLoadRequestsAdm() + 1);
        } while (!mutableStateFlow.b(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        Object value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequests(dsl_create.getLoadRequests() + 1);
        } while (!mutableStateFlow.b(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        Object value;
        TokenCounters tokenCounters;
        MutableStateFlow mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!mutableStateFlow.b(value, TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        Object value;
        TokenCounters tokenCounters;
        MutableStateFlow mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!mutableStateFlow.b(value, TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        Object value;
        TokenCounters tokenCounters;
        MutableStateFlow mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!mutableStateFlow.b(value, TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isFirstInitAttempt() {
        Object value;
        Boolean bool;
        MutableStateFlow mutableStateFlow = this._isFirstInitAttempt;
        do {
            value = mutableStateFlow.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!mutableStateFlow.b(value, Boolean.FALSE));
        return bool.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        return getInitializationState() == InitializationState.INITIALIZED;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        Object value;
        boolean zIsTestMode;
        MutableStateFlow mutableStateFlow = this._isTestModeEnabled;
        do {
            value = mutableStateFlow.getValue();
            ((Boolean) value).getClass();
            zIsTestMode = SdkProperties.isTestMode();
        } while (!mutableStateFlow.b(value, Boolean.valueOf(zIsTestMode)));
        return zIsTestMode;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public Object persistNativeConfiguration(@NotNull Continuation continuation) {
        ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        ByteString byteString = getNativeConfiguration().toByteString();
        Intrinsics.checkNotNullExpressionValue(byteString, "nativeConfiguration.toByteString()");
        Object obj = byteStringDataSource.set(byteString, continuation);
        return obj == b.g() ? obj : Unit.f93236a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        Object value;
        MutableStateFlow mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, new TokenCounters(0, 0, 0)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(@Nullable String str) {
        Object value;
        MutableStateFlow mutableStateFlow = this._gameId;
        do {
            value = mutableStateFlow.getValue();
            ClientProperties.setGameId(str);
        } while (!mutableStateFlow.b(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public Object setGatewayCache(@NotNull ByteString byteString, @NotNull Continuation continuation) {
        Object obj = this.gatewayCacheDataSource.set(byteString, continuation);
        return obj == b.g() ? obj : Unit.f93236a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(@NotNull ByteString value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._currentState;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(@NotNull String value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._gatewayUrl;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(@NotNull InitializationState value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._initializationState;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(@NotNull NativeConfigurationOuterClass.NativeConfiguration value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._sdkConfiguration;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value2, value));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r7.emit(r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object setPrivacy(@org.jetbrains.annotations.NotNull com.google.protobuf.ByteString r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C47861
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C47861) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r7)
            goto L68
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r2 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r2
            kotlin.d.b(r7)
            goto L53
        L40:
            kotlin.d.b(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.privacyDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r1) goto L52
            goto L67
        L52:
            r2 = r5
        L53:
            kotlinx.coroutines.flow.MutableSharedFlow r7 = r2._onChange
            com.unity3d.ads.core.data.model.SessionChange$UserConsentChange r2 = new com.unity3d.ads.core.data.model.SessionChange$UserConsentChange
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacy(com.google.protobuf.ByteString, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r7.emit(r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object setPrivacyFsm(@org.jetbrains.annotations.NotNull com.google.protobuf.ByteString r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C47871
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C47871) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r7)
            goto L68
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r2 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r2
            kotlin.d.b(r7)
            goto L53
        L40:
            kotlin.d.b(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.fsmDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r1) goto L52
            goto L67
        L52:
            r2 = r5
        L53:
            kotlinx.coroutines.flow.MutableSharedFlow r7 = r2._onChange
            com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange r2 = new com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacyFsm(com.google.protobuf.ByteString, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._sessionCounters;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(@NotNull ByteString value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._sessionToken;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z10) {
        Object value;
        MutableStateFlow mutableStateFlow = this._shouldInitialize;
        do {
            value = mutableStateFlow.getValue();
            ((Boolean) value).getClass();
        } while (!mutableStateFlow.b(value, Boolean.valueOf(z10)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(@NotNull TokenCounters value) {
        Object value2;
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow mutableStateFlow = this._tokenCounters;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value2, value));
    }
}
