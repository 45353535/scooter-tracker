package com.mobilefuse.sdk.telemetry;

import com.mobilefuse.sdk.AdInstanceInfo;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.telemetry.metricslogging.MetricRecordName;
import com.mobilefuse.sdk.telemetry.metricslogging.TelemetryAdInfo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0016\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005\u001a*\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007\u001a\"\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007\u001a\u000e\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005\u001a6\u0010\u0016\u001a\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007\u001a\u001e\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d\u001a\"\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u0015H\u0007\u001a\u0016\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003\u001a0\u0010%\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'H\u0007¨\u0006("}, d2 = {"createAdClickedAction", "Lcom/mobilefuse/sdk/telemetry/TelemetryAction;", "url", "", "adInstanceInfo", "Lcom/mobilefuse/sdk/AdInstanceInfo;", "createAdErrorAction", "error", "createAdExpiryAction", "expiry", "", "createAdInstanceAction", "action", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionSdkEvents;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionParam;", "createAdInstanceCreatedAction", "createAdInstanceLoadAdAction", "createAdInstanceSetTestModeAction", "testMode", "", "createAdLifecycleAction", "lifecycleEvent", "Lkotlin/Pair;", "createBiddingTokenAction", "token", "event", "owner", "", "createMutedAdAction", "muted", "comesFromUserInteraction", "createShowAdAction", "isReady", "getAdRendererType", "className", "sendAdInstanceAction", "logLevel", "Lcom/mobilefuse/sdk/telemetry/LogLevel;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class TelemetrySdkActionFactory {
    @NotNull
    public static final TelemetryAction createAdClickedAction(@NotNull String url, @NotNull AdInstanceInfo adInstanceInfo) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.AD_CLICK_URL, url, true));
        return createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_CLICKED, adInstanceInfo, arrayList);
    }

    @NotNull
    public static final TelemetryAction createAdErrorAction(@NotNull AdInstanceInfo adInstanceInfo, @NotNull String error) {
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        Intrinsics.checkNotNullParameter(error, "error");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.AD_ERROR_REASON, error, true));
        arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.AD_INSTANCE_ID, Integer.valueOf(adInstanceInfo.getInstanceId()), true));
        return sendAdInstanceAction(TelemetryActionSdkEvents.AD_LIFECYCLE_ERROR.updateExtraMessageField(error), arrayList, adInstanceInfo, LogLevel.WARN);
    }

    @NotNull
    public static final TelemetryAction createAdExpiryAction(float f10, @NotNull AdInstanceInfo adInstanceInfo) {
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TelemetryActionParam(TelemetryBaseParamType.AD_EXPIRY, Float.valueOf(f10), true));
        return createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_EXPIRED, adInstanceInfo, arrayList);
    }

    @NotNull
    public static final TelemetryAction createAdInstanceAction(@NotNull TelemetryActionSdkEvents telemetryActionSdkEvents, @NotNull AdInstanceInfo adInstanceInfo) {
        return createAdInstanceAction$default(telemetryActionSdkEvents, adInstanceInfo, null, 4, null);
    }

    public static /* synthetic */ TelemetryAction createAdInstanceAction$default(TelemetryActionSdkEvents telemetryActionSdkEvents, AdInstanceInfo adInstanceInfo, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = null;
        }
        return createAdInstanceAction(telemetryActionSdkEvents, adInstanceInfo, list);
    }

    @NotNull
    public static final TelemetryAction createAdInstanceCreatedAction(@NotNull AdInstanceInfo adInstanceInfo) {
        return createAdInstanceCreatedAction$default(adInstanceInfo, null, 2, null);
    }

    public static /* synthetic */ TelemetryAction createAdInstanceCreatedAction$default(AdInstanceInfo adInstanceInfo, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        return createAdInstanceCreatedAction(adInstanceInfo, list);
    }

    @NotNull
    public static final TelemetryAction createAdInstanceLoadAdAction(@NotNull AdInstanceInfo adInstanceInfo) {
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.AD_INSTANCE_ID, Integer.valueOf(adInstanceInfo.getInstanceId()), true));
        TelemetrySdkParamType telemetrySdkParamType = TelemetrySdkParamType.PLACEMENT_ID;
        String placementId = adInstanceInfo.getPlacementId();
        if (placementId == null) {
            placementId = "";
        }
        Intrinsics.checkNotNullExpressionValue(placementId, "adInstanceInfo.placementId ?: \"\"");
        arrayList.add(new TelemetryActionParam(telemetrySdkParamType, placementId, true));
        return sendAdInstanceAction(TelemetryActionSdkEvents.AD_LOAD_REQUESTED.updateExtraMessageField(String.valueOf(adInstanceInfo.getPlacementId())), arrayList, adInstanceInfo, LogLevel.INFO);
    }

    @NotNull
    public static final TelemetryAction createAdInstanceSetTestModeAction(boolean z10, @NotNull AdInstanceInfo adInstanceInfo) {
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.AD_TEST_MODE, Boolean.valueOf(z10), true));
        arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.AD_INSTANCE_ID, Integer.valueOf(adInstanceInfo.getInstanceId()), true));
        return sendAdInstanceAction(TelemetryActionSdkEvents.AD_INSTANCE_SET_TEST_MODE.updateExtraMessageField(String.valueOf(z10)), arrayList, adInstanceInfo, LogLevel.INFO);
    }

    @NotNull
    public static final TelemetryAction createAdLifecycleAction(@NotNull Pair<String, String> pair, @NotNull AdInstanceInfo adInstanceInfo) {
        return createAdLifecycleAction$default(pair, adInstanceInfo, null, 4, null);
    }

    public static /* synthetic */ TelemetryAction createAdLifecycleAction$default(Pair pair, AdInstanceInfo adInstanceInfo, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = null;
        }
        return createAdLifecycleAction(pair, adInstanceInfo, list);
    }

    @NotNull
    public static final TelemetryAction createBiddingTokenAction(@NotNull String token, @NotNull TelemetryActionSdkEvents event, @NotNull Object owner) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(owner, "owner");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.BID_REQUEST_TOKEN, token, true));
        return TelemetryActionFactory.createAction(owner, event, arrayList, LogLevel.INFO);
    }

    @NotNull
    public static final TelemetryAction createMutedAdAction(boolean z10, @NotNull AdInstanceInfo adInstanceInfo) {
        return createMutedAdAction$default(z10, adInstanceInfo, false, 4, null);
    }

    public static /* synthetic */ TelemetryAction createMutedAdAction$default(boolean z10, AdInstanceInfo adInstanceInfo, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return createMutedAdAction(z10, adInstanceInfo, z11);
    }

    @NotNull
    public static final TelemetryAction createShowAdAction(boolean z10, @NotNull AdInstanceInfo adInstanceInfo) {
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        Telemetry.Companion companion = Telemetry.INSTANCE;
        TelemetryAdInfo telemetryAdInfoCreateTelemetryAdInfo = adInstanceInfo.createTelemetryAdInfo();
        Intrinsics.checkNotNullExpressionValue(telemetryAdInfoCreateTelemetryAdInfo, "adInstanceInfo.createTelemetryAdInfo()");
        companion.reportAdMetric(telemetryAdInfoCreateTelemetryAdInfo, MetricRecordName.SHOW_AD_REQUESTED);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.AD_INSTANCE_READY, Boolean.valueOf(z10), true));
        return createAdInstanceAction(TelemetryActionSdkEvents.AD_SHOW_REQUESTED, adInstanceInfo, arrayList);
    }

    @NotNull
    public static final String getAdRendererType(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt.g0(className, "Mraid", false, 2, null) ? "MRAID" : "VAST";
    }

    @NotNull
    public static final TelemetryAction sendAdInstanceAction(@NotNull TelemetryActionSdkEvents telemetryActionSdkEvents, @NotNull AdInstanceInfo adInstanceInfo, @NotNull LogLevel logLevel) {
        return sendAdInstanceAction$default(telemetryActionSdkEvents, null, adInstanceInfo, logLevel, 2, null);
    }

    public static /* synthetic */ TelemetryAction sendAdInstanceAction$default(TelemetryActionSdkEvents telemetryActionSdkEvents, List list, AdInstanceInfo adInstanceInfo, LogLevel logLevel, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = new ArrayList();
        }
        return sendAdInstanceAction(telemetryActionSdkEvents, list, adInstanceInfo, logLevel);
    }

    @NotNull
    public static final TelemetryAction createAdInstanceAction(@NotNull TelemetryActionSdkEvents action, @NotNull AdInstanceInfo adInstanceInfo, @Nullable List<TelemetryActionParam> list) {
        List arrayList;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.AD_INSTANCE_ID, Integer.valueOf(adInstanceInfo.getInstanceId()), true));
        return sendAdInstanceAction(action, arrayList, adInstanceInfo, LogLevel.INFO);
    }

    @NotNull
    public static final TelemetryAction createAdInstanceCreatedAction(@NotNull AdInstanceInfo adInstanceInfo, @Nullable List<TelemetryActionParam> list) {
        List<TelemetryActionParam> arrayList;
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList<>();
        }
        adInstanceInfo.fillTelemetryExtras(arrayList);
        return sendAdInstanceAction(TelemetryActionSdkEvents.AD_INSTANCE_CREATED.updateExtraMessageField(adInstanceInfo.getPlacementId() + " (" + adInstanceInfo.getAdType() + ')'), arrayList, adInstanceInfo, LogLevel.INFO);
    }

    @NotNull
    public static final TelemetryAction createAdLifecycleAction(@NotNull Pair<String, String> lifecycleEvent, @NotNull AdInstanceInfo adInstanceInfo, @Nullable List<TelemetryActionParam> list) {
        List arrayList;
        Intrinsics.checkNotNullParameter(lifecycleEvent, "lifecycleEvent");
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.AD_INSTANCE_ID, Integer.valueOf(adInstanceInfo.getInstanceId()), true));
        return sendAdInstanceAction(TelemetryActionSdkEvents.AD_LIFECYCLE_EVENT.updateMessagesValues(lifecycleEvent.getFirst(), lifecycleEvent.getSecond()), arrayList, adInstanceInfo, LogLevel.INFO);
    }

    @NotNull
    public static final TelemetryAction createMutedAdAction(boolean z10, @NotNull AdInstanceInfo adInstanceInfo, boolean z11) {
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        return createAdInstanceAction(z11 ? TelemetryActionSdkEvents.AD_MUTED_CALLBACK : TelemetryActionSdkEvents.AD_INSTANCE_SET_MUTED.updateExtraMessageField(String.valueOf(z10)), adInstanceInfo, CollectionsKt.listOf(new TelemetryActionParam(TelemetrySdkParamType.MUTED, Boolean.valueOf(z10), true)));
    }

    @NotNull
    public static final TelemetryAction sendAdInstanceAction(@NotNull TelemetryActionSdkEvents action, @NotNull List<TelemetryActionParam> extras, @NotNull AdInstanceInfo adInstanceInfo, @NotNull LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        return TelemetryActionFactory.createAction(adInstanceInfo.getTelemetryAgent().getOwnerSenderName(), TelemetryActionSdkEvents.copy$default(action, null, null, ("Ad Instance #" + adInstanceInfo.getInstanceId() + ' ') + action.getLogExtraMessage(), false, false, false, 59, null), extras, logLevel);
    }
}
