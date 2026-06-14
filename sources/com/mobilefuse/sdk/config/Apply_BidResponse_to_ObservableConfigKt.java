package com.mobilefuse.sdk.config;

import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.math.MathMf;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"applyConfigFromBidResponse", "", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "bidResponse", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class Apply_BidResponse_to_ObservableConfigKt {
    public static final void applyConfigFromBidResponse(@NotNull ObservableConfig applyConfigFromBidResponse, @NotNull MfxBidResponse bidResponse) {
        Float endCardCloseSeconds;
        Integer maxEndCards;
        Intrinsics.checkNotNullParameter(applyConfigFromBidResponse, "$this$applyConfigFromBidResponse");
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (bidResponse.getType() == AdmMediaType.VIDEO || bidResponse.getType() == AdmMediaType.NATIVE || bidResponse.getType() == AdmMediaType.STORYBOARD) {
                ClickthroughBehaviour clickBehavior = bidResponse.getClickBehavior();
                if (clickBehavior == null) {
                    clickBehavior = MobileFuseDefaults.DEFAULT_VIDEO_CLICKTHROUGH_BEHAVIOUR;
                }
                applyConfigFromBidResponse.setValue(ObservableConfigKey.VIDEO_CLICK_THROUGH_BEHAVIOUR, clickBehavior);
                ObservableConfigKey observableConfigKey = ObservableConfigKey.PUBLISHER_MUTED;
                if (applyConfigFromBidResponse.hasValue(observableConfigKey)) {
                    applyConfigFromBidResponse.setValue(ObservableConfigKey.AWAITING_MUTED, Boolean.valueOf(applyConfigFromBidResponse.getBooleanValue(observableConfigKey)));
                    DebuggingKt.logDebug$default(applyConfigFromBidResponse, "Muted config configured by app developer [value=" + applyConfigFromBidResponse.getValue(observableConfigKey) + ']', null, 2, null);
                } else {
                    boolean booleanValue = applyConfigFromBidResponse.getBooleanValue(ObservableConfigKey.DEFAULT_MUTED, true);
                    Boolean muted = bidResponse.getMuted();
                    boolean zBooleanValue = muted != null ? muted.booleanValue() : booleanValue;
                    DebuggingKt.logDebug$default(applyConfigFromBidResponse, "Apply muted config [appliedValue=" + zBooleanValue + ", defaultValue=" + booleanValue + ", bidResponseValue=" + bidResponse.getMuted() + ']', null, 2, null);
                    applyConfigFromBidResponse.setValue(ObservableConfigKey.AWAITING_MUTED, Boolean.valueOf(zBooleanValue));
                }
                ObservableConfigKey observableConfigKey2 = ObservableConfigKey.MAX_END_CARDS;
                if (!applyConfigFromBidResponse.hasValue(observableConfigKey2) && (maxEndCards = bidResponse.getMaxEndCards()) != null) {
                    applyConfigFromBidResponse.setValue(observableConfigKey2, Integer.valueOf(maxEndCards.intValue()));
                }
                ObservableConfigKey observableConfigKey3 = ObservableConfigKey.END_CARD_CLOSE_SECONDS;
                if (!applyConfigFromBidResponse.hasValue(observableConfigKey3) && (endCardCloseSeconds = bidResponse.getEndCardCloseSeconds()) != null) {
                    applyConfigFromBidResponse.setValue(observableConfigKey3, Float.valueOf(endCardCloseSeconds.floatValue()));
                }
            }
            float floatValue = applyConfigFromBidResponse.getFloatValue(ObservableConfigKey.DEFAULT_FORCE_SKIP_SECONDS, -1.0f);
            Float forceSkipSeconds = bidResponse.getForceSkipSeconds();
            if (forceSkipSeconds != null) {
                floatValue = MathMf.minPreferPositive(forceSkipSeconds.floatValue(), floatValue);
            }
            if (floatValue > -1.0f) {
                applyConfigFromBidResponse.setValue(ObservableConfigKey.FORCE_SKIP_SECONDS, Float.valueOf(floatValue));
            }
            Float blockSkipSeconds = bidResponse.getBlockSkipSeconds();
            if (blockSkipSeconds != null) {
                applyConfigFromBidResponse.setValue(ObservableConfigKey.BLOCK_SKIP_SECONDS, Float.valueOf(blockSkipSeconds.floatValue()));
            }
            applyConfigFromBidResponse.setValue(ObservableConfigKey.VIDEO_STREAM_ENABLED, Boolean.valueOf(bidResponse.getShouldStreamVideo()));
            Boolean allowClickthroughWithoutTap = bidResponse.getAllowClickthroughWithoutTap();
            if (allowClickthroughWithoutTap != null) {
                applyConfigFromBidResponse.setValue(ObservableConfigKey.ALLOW_CLICKTHROUGH_WITHOUT_TAP, allowClickthroughWithoutTap);
            }
        } catch (Throwable th2) {
            int i10 = Apply_BidResponse_to_ObservableConfigKt$applyConfigFromBidResponse$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }
}
