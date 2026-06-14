package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.services.core.configuration.EnvironmentCheck;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.InitMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonShouldAllowInitialization;", "Lcom/unity3d/ads/core/domain/ShouldAllowInitialization;", "alternativeFlowReader", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "checkForGameIdAndTestModeChanges", "Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "setInitializationState", "Lcom/unity3d/ads/core/domain/SetInitializationState;", "validateGameId", "Lcom/unity3d/ads/core/domain/ValidateGameId;", "(Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/SetInitializationState;Lcom/unity3d/ads/core/domain/ValidateGameId;)V", "getAlternativeFlowReader", "()Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "getCheckForGameIdAndTestModeChanges", "()Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;", "getGetInitializationState", "()Lcom/unity3d/ads/core/domain/GetInitializationState;", "getSetInitializationState", "()Lcom/unity3d/ads/core/domain/SetInitializationState;", "getValidateGameId", "()Lcom/unity3d/ads/core/domain/ValidateGameId;", "invoke", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonShouldAllowInitialization implements ShouldAllowInitialization {

    @NotNull
    private final AlternativeFlowReader alternativeFlowReader;

    @NotNull
    private final CheckForGameIdAndTestModeChanges checkForGameIdAndTestModeChanges;

    @NotNull
    private final GetInitializationState getInitializationState;

    @NotNull
    private final SetInitializationState setInitializationState;

    @NotNull
    private final ValidateGameId validateGameId;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CommonShouldAllowInitialization(@NotNull AlternativeFlowReader alternativeFlowReader, @NotNull CheckForGameIdAndTestModeChanges checkForGameIdAndTestModeChanges, @NotNull GetInitializationState getInitializationState, @NotNull SetInitializationState setInitializationState, @NotNull ValidateGameId validateGameId) {
        Intrinsics.checkNotNullParameter(alternativeFlowReader, "alternativeFlowReader");
        Intrinsics.checkNotNullParameter(checkForGameIdAndTestModeChanges, "checkForGameIdAndTestModeChanges");
        Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        Intrinsics.checkNotNullParameter(setInitializationState, "setInitializationState");
        Intrinsics.checkNotNullParameter(validateGameId, "validateGameId");
        this.alternativeFlowReader = alternativeFlowReader;
        this.checkForGameIdAndTestModeChanges = checkForGameIdAndTestModeChanges;
        this.getInitializationState = getInitializationState;
        this.setInitializationState = setInitializationState;
        this.validateGameId = validateGameId;
    }

    @NotNull
    public final AlternativeFlowReader getAlternativeFlowReader() {
        return this.alternativeFlowReader;
    }

    @NotNull
    public final CheckForGameIdAndTestModeChanges getCheckForGameIdAndTestModeChanges() {
        return this.checkForGameIdAndTestModeChanges;
    }

    @NotNull
    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    @NotNull
    public final SetInitializationState getSetInitializationState() {
        return this.setInitializationState;
    }

    @NotNull
    public final ValidateGameId getValidateGameId() {
        return this.validateGameId;
    }

    @Override // com.unity3d.ads.core.domain.ShouldAllowInitialization
    public boolean invoke(@Nullable String gameId) {
        if (!this.validateGameId.invoke(gameId)) {
            return false;
        }
        if (this.alternativeFlowReader.invoke()) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.getInitializationState.invoke(false).ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3 && i10 != 4) {
                        throw new m();
                    }
                    this.checkForGameIdAndTestModeChanges.invoke(false);
                    this.setInitializationState.invoke(InitializationState.INITIALIZING, false);
                    return true;
                }
                SdkProperties.notifyInitializationComplete();
            }
            return false;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.getInitializationState.invoke(true).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new m();
                    }
                    SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to previous failed reason");
                    return false;
                }
                if (!EnvironmentCheck.isEnvironmentOk()) {
                    DeviceLog.error("Error during Unity Services environment check, halting Unity Services init");
                    SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to environment check failed");
                    InitializeEventsMetricSender.getInstance().sendMetric(InitMetric.newInitEnvironmentNotOk());
                    return false;
                }
                DeviceLog.info("Unity Services environment check OK");
                InitializeEventsMetricSender.getInstance().sendMetric(InitMetric.newInitEnvironmentOk());
                this.checkForGameIdAndTestModeChanges.invoke(true);
                this.setInitializationState.invoke(InitializationState.INITIALIZING, true);
                return true;
            }
            SdkProperties.notifyInitializationComplete();
        }
        return false;
    }
}
