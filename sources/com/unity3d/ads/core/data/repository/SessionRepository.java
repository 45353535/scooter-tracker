package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0017\bf\u0018\u00002\u00020\u0001J\u0010\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0016H&J\u0011\u0010V\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010WJ\u0011\u0010X\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010WJ\u0011\u0010Y\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010WJ\b\u0010Z\u001a\u00020TH&J\b\u0010[\u001a\u00020TH&J\b\u0010\\\u001a\u00020TH&J\b\u0010]\u001a\u00020TH&J\b\u0010^\u001a\u00020TH&J\b\u0010_\u001a\u00020TH&J\b\u0010`\u001a\u00020TH&J\b\u0010a\u001a\u00020TH&J\b\u0010b\u001a\u00020TH&J\b\u0010c\u001a\u00020TH&J\u0011\u0010d\u001a\u00020TH¦@ø\u0001\u0000¢\u0006\u0002\u0010WJ\b\u0010e\u001a\u00020TH&J\u0019\u0010f\u001a\u00020T2\u0006\u0010g\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010hJ\u0019\u0010i\u001a\u00020T2\u0006\u0010g\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010hJ\u0019\u0010j\u001a\u00020T2\u0006\u0010g\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010hR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\u001aX¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010!R\u0012\u0010\"\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010!R\u0012\u0010#\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0012\u0010$\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0012\u0010%\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0018\u0010&\u001a\u00020'X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001a0-X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0018\u00100\u001a\b\u0012\u0004\u0012\u00020201X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0018\u00105\u001a\b\u0012\u0004\u0012\u00020706X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0018\u0010:\u001a\u00020;X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0012\u0010@\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u000fR\u0018\u0010B\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\bC\u0010\u000f\"\u0004\bD\u0010\u0011R\u0018\u0010E\u001a\u00020 X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010!\"\u0004\bG\u0010HR\u0018\u0010I\u001a\u00020JX¦\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010O\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\tR\u0014\u0010Q\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006k"}, d2 = {"Lcom/unity3d/ads/core/data/repository/SessionRepository;", "", "featureFlags", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "getGameId", "()Ljava/lang/String;", "setGameId", "(Ljava/lang/String;)V", "gatewayState", "Lcom/google/protobuf/ByteString;", "getGatewayState", "()Lcom/google/protobuf/ByteString;", "setGatewayState", "(Lcom/google/protobuf/ByteString;)V", "gatewayUrl", "getGatewayUrl", "setGatewayUrl", "headerBiddingTokenCounter", "", "getHeaderBiddingTokenCounter", "()I", "initializationState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "getInitializationState", "()Lcom/unity3d/ads/core/data/model/InitializationState;", "setInitializationState", "(Lcom/unity3d/ads/core/data/model/InitializationState;)V", "isDiagnosticsEnabled", "", "()Z", "isFirstInitAttempt", "isOmEnabled", "isSdkInitialized", "isTestModeEnabled", "nativeConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "observeInitializationState", "Lkotlinx/coroutines/flow/Flow;", "getObserveInitializationState", "()Lkotlinx/coroutines/flow/Flow;", "onChange", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "getOnChange", "()Lkotlinx/coroutines/flow/SharedFlow;", "scarEligibleFormats", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "getScarEligibleFormats", "()Ljava/util/List;", "sessionCounters", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", JsonStorageKeyNames.SESSION_ID_KEY, "getSessionId", "sessionToken", "getSessionToken", "setSessionToken", "shouldInitialize", "getShouldInitialize", "setShouldInitialize", "(Z)V", "tokenCounters", "Lcom/unity3d/ads/core/data/model/TokenCounters;", "getTokenCounters", "()Lcom/unity3d/ads/core/data/model/TokenCounters;", "setTokenCounters", "(Lcom/unity3d/ads/core/data/model/TokenCounters;)V", "unityInstallationId", "getUnityInstallationId", "unityMegaSessionId", "getUnityMegaSessionId", "addTimeToGlobalAdsFocusTime", "", "timeMs", "getGatewayCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrivacy", "getPrivacyFsm", "incrementBannerImpressionCount", "incrementBannerLoadRequestAdmCount", "incrementBannerLoadRequestCount", "incrementFocusChangeCount", "incrementGlobalAdsFocusChangeCount", "incrementLoadRequestAdmCount", "incrementLoadRequestCount", "incrementTokenSequenceNumber", "incrementTokenStartsCount", "incrementTokenWinsCount", "persistNativeConfiguration", "resetTokenCounters", "setGatewayCache", "value", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPrivacy", "setPrivacyFsm", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SessionRepository {
    void addTimeToGlobalAdsFocusTime(int timeMs);

    @NotNull
    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    @Nullable
    String getGameId();

    @Nullable
    Object getGatewayCache(@NotNull Continuation continuation);

    @NotNull
    ByteString getGatewayState();

    @NotNull
    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    @NotNull
    InitializationState getInitializationState();

    @NotNull
    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    @NotNull
    Flow getObserveInitializationState();

    @NotNull
    SharedFlow getOnChange();

    @Nullable
    Object getPrivacy(@NotNull Continuation continuation);

    @Nullable
    Object getPrivacyFsm(@NotNull Continuation continuation);

    @NotNull
    List<AdFormatOuterClass.AdFormat> getScarEligibleFormats();

    @NotNull
    SessionCountersOuterClass.SessionCounters getSessionCounters();

    @NotNull
    ByteString getSessionId();

    @NotNull
    ByteString getSessionToken();

    boolean getShouldInitialize();

    @NotNull
    TokenCounters getTokenCounters();

    @Nullable
    String getUnityInstallationId();

    @Nullable
    String getUnityMegaSessionId();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementFocusChangeCount();

    void incrementGlobalAdsFocusChangeCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    @Nullable
    Object persistNativeConfiguration(@NotNull Continuation continuation);

    void resetTokenCounters();

    void setGameId(@Nullable String str);

    @Nullable
    Object setGatewayCache(@NotNull ByteString byteString, @NotNull Continuation continuation);

    void setGatewayState(@NotNull ByteString byteString);

    void setGatewayUrl(@NotNull String str);

    void setInitializationState(@NotNull InitializationState initializationState);

    void setNativeConfiguration(@NotNull NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    @Nullable
    Object setPrivacy(@NotNull ByteString byteString, @NotNull Continuation continuation);

    @Nullable
    Object setPrivacyFsm(@NotNull ByteString byteString, @NotNull Continuation continuation);

    void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(@NotNull ByteString byteString);

    void setShouldInitialize(boolean z10);

    void setTokenCounters(@NotNull TokenCounters tokenCounters);
}
