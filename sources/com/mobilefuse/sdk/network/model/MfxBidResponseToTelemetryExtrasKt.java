package com.mobilefuse.sdk.network.model;

import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"toTelemetryExtras", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionParam;", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class MfxBidResponseToTelemetryExtrasKt {
    @NotNull
    public static final List<TelemetryActionParam> toTelemetryExtras(@NotNull MfxBidResponse toTelemetryExtras) {
        Intrinsics.checkNotNullParameter(toTelemetryExtras, "$this$toTelemetryExtras");
        List<TelemetryActionParam> listMutableListOf = CollectionsKt.mutableListOf(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_ID, toTelemetryExtras.getId(), true), new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_CRID, toTelemetryExtras.getCrid(), true), new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_CPM, Double.valueOf(toTelemetryExtras.getCpm()), true), new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_TYPE, toTelemetryExtras.getType().getValue(), true), new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_EXPIRES, Integer.valueOf(toTelemetryExtras.getExpires()), true));
        AdmCreativeFormat creativeFormat = toTelemetryExtras.getCreativeFormat();
        if (creativeFormat != null) {
            listMutableListOf.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_CREATIVE_FORMAT, creativeFormat, true));
        }
        String lossUrl = toTelemetryExtras.getLossUrl();
        if (lossUrl != null) {
            listMutableListOf.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_LOSS_URL, lossUrl, false));
        }
        Boolean muted = toTelemetryExtras.getMuted();
        if (muted != null) {
            listMutableListOf.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_MUTED, muted, false));
        }
        ClickthroughBehaviour clickBehavior = toTelemetryExtras.getClickBehavior();
        if (clickBehavior != null) {
            listMutableListOf.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_CLICK_BEHAVIOR, clickBehavior, false));
        }
        Integer maxEndCards = toTelemetryExtras.getMaxEndCards();
        if (maxEndCards != null) {
            listMutableListOf.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_MX_END_CARDS, Integer.valueOf(maxEndCards.intValue()), false));
        }
        Float endCardCloseSeconds = toTelemetryExtras.getEndCardCloseSeconds();
        if (endCardCloseSeconds != null) {
            listMutableListOf.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_END_CARD_CLOSE_SECONDS, Float.valueOf(endCardCloseSeconds.floatValue()), false));
        }
        Float forceSkipSeconds = toTelemetryExtras.getForceSkipSeconds();
        if (forceSkipSeconds != null) {
            listMutableListOf.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_FORCE_SKIP_SECONDS, Float.valueOf(forceSkipSeconds.floatValue()), false));
        }
        Float blockSkipSeconds = toTelemetryExtras.getBlockSkipSeconds();
        if (blockSkipSeconds != null) {
            listMutableListOf.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_BLOCK_SKIP_SECONDS, Float.valueOf(blockSkipSeconds.floatValue()), false));
        }
        return listMutableListOf;
    }
}
