package com.mobilefuse.sdk.telemetry.metricslogging;

import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.helpers.StringExtensionsKt;
import com.mobilefuse.sdk.telemetry.BuildConfig;
import com.mobilefuse.sdk.telemetry.TelemetryEventsMfxService;
import com.mobilefuse.sdk.telemetry.TelemetryHelpersKt;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import com.mobilefuse.sdk.telemetry.loggers.MfxRequestManager;
import com.mobilefuse.sdk.telemetry.loggers.TelemetryDebouncer;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0017J5\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0001¢\u0006\u0002\b\"J\u0016\u0010#\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0002J\u001f\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020(H\u0001¢\u0006\u0002\b)J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010.\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010/\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u00100\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u00101\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,H\u0016J\u0016\u00102\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016J\u0016\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020'2\u0006\u00105\u001a\u00020(R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricsMfxImpl;", "Lcom/mobilefuse/sdk/telemetry/TelemetryEventsMfxService;", "Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricRecord;", "Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricsMfxService;", "()V", "TIME_DEBOUNCE_MILLISECONDS", "", "getTIME_DEBOUNCE_MILLISECONDS", "()J", "debouncer", "Lcom/mobilefuse/sdk/telemetry/loggers/TelemetryDebouncer;", "metricsLogs", "", "getMetricsLogs$mobilefuse_sdk_telemetry_release$annotations", "getMetricsLogs$mobilefuse_sdk_telemetry_release", "()Ljava/util/List;", "metricsRecords", "Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricRecordTime;", "requestManager", "Lcom/mobilefuse/sdk/telemetry/loggers/MfxRequestManager;", "addVideoStreamEnabledTag", "", "tags", "", "", "createJsonLines", "data", "", "createMetricLog", "event", "Lcom/mobilefuse/sdk/telemetry/metricslogging/Metrics;", "value", "", "renderMap", "createMetricLog$mobilefuse_sdk_telemetry_release", "deleteLogs", "listCopy", "getSpecificMetric", "id", "", "Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricRecordName;", "getSpecificMetric$mobilefuse_sdk_telemetry_release", "onAdIsReady", "adInfo", "Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo;", "onAdRendered", "onAdvertisingIdRequestFailed", "onBidTokenCreated", "onBidTokenCreatedWithJIT", "onVideoReady", "reportEvents", "reportMetric", "instanceId", "events", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class MetricsMfxImpl implements TelemetryEventsMfxService<MetricRecord>, MetricsMfxService {

    @NotNull
    private final List<MetricRecord> metricsLogs = new ArrayList();
    private final MfxRequestManager requestManager = new MfxRequestManager();
    private final List<MetricRecordTime> metricsRecords = new ArrayList();
    private final long TIME_DEBOUNCE_MILLISECONDS = 30000;
    private final TelemetryDebouncer debouncer = new TelemetryDebouncer(30000);

    private final void addVideoStreamEnabledTag(Map<String, String> tags) {
        tags.put(Metrics.INSTANCE.getVIDEO_STREAM_ENABLED_METRIC(), "1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createMetricLog$mobilefuse_sdk_telemetry_release$default(MetricsMfxImpl metricsMfxImpl, Metrics metrics, float f10, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = null;
        }
        metricsMfxImpl.createMetricLog$mobilefuse_sdk_telemetry_release(metrics, f10, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteLogs(List<MetricRecord> listCopy) {
        this.metricsLogs.removeAll(listCopy);
    }

    @VisibleForTesting
    public static /* synthetic */ void getMetricsLogs$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryEventsMfxService
    @Nullable
    public JSONObject createJson(@NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return TelemetryEventsMfxService.DefaultImpls.createJson(this, data);
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryEventsMfxService
    @VisibleForTesting
    @Nullable
    public String createJsonLines(@NotNull List<? extends MetricRecord> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                arrayList.add(((MetricRecord) it.next()).toJsonObject());
            }
            return CollectionsKt.joinToString$default(arrayList, IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, new Function1<JSONObject, CharSequence>() { // from class: com.mobilefuse.sdk.telemetry.metricslogging.MetricsMfxImpl.createJsonLines.2
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull JSONObject it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    String string = it2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "it.toString()");
                    return StringExtensionsKt.sanitizeJsonString(string);
                }
            }, 30, null);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @VisibleForTesting
    public final void createMetricLog$mobilefuse_sdk_telemetry_release(@NotNull Metrics event, float value, @Nullable Map<String, String> renderMap) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (renderMap == null) {
            renderMap = new LinkedHashMap<>();
        }
        renderMap.put("os", "android");
        renderMap.put("version", TelemetryManager.INSTANCE.getReleaseVersion());
        this.metricsLogs.add(new MetricRecord(event.getMessage(), value, new JSONObject(MapsKt.toMap(renderMap))));
        reportEvents(this.metricsLogs);
    }

    @NotNull
    public final List<MetricRecord> getMetricsLogs$mobilefuse_sdk_telemetry_release() {
        return this.metricsLogs;
    }

    @VisibleForTesting
    @Nullable
    public final MetricRecordTime getSpecificMetric$mobilefuse_sdk_telemetry_release(int id2, @NotNull MetricRecordName event) {
        Object next;
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator it = CollectionsKt.toList(this.metricsRecords).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            MetricRecordTime metricRecordTime = (MetricRecordTime) next;
            if (metricRecordTime.getName() == event && metricRecordTime.getId() == id2) {
                break;
            }
        }
        return (MetricRecordTime) next;
    }

    public final long getTIME_DEBOUNCE_MILLISECONDS() {
        return this.TIME_DEBOUNCE_MILLISECONDS;
    }

    @Override // com.mobilefuse.sdk.telemetry.metricslogging.MetricsMfxService
    public void onAdIsReady(@NotNull TelemetryAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        MetricRecordTime specificMetric$mobilefuse_sdk_telemetry_release = getSpecificMetric$mobilefuse_sdk_telemetry_release(adInfo.getAdInstanceId(), MetricRecordName.ON_AD_LOADED);
        MetricRecordTime specificMetric$mobilefuse_sdk_telemetry_release2 = getSpecificMetric$mobilefuse_sdk_telemetry_release(adInfo.getAdInstanceId(), MetricRecordName.ON_AD_READY);
        if (specificMetric$mobilefuse_sdk_telemetry_release == null || specificMetric$mobilefuse_sdk_telemetry_release2 == null) {
            return;
        }
        String renderType = adInfo.getRenderType();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        String lowerCase = renderType.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        createMetricLog$mobilefuse_sdk_telemetry_release(Metrics.INSTANCE.getLOAD_TO_READY(), TelemetryHelpersKt.getTimeDiffSeconds(specificMetric$mobilefuse_sdk_telemetry_release.getTimeStamp(), specificMetric$mobilefuse_sdk_telemetry_release2.getTimeStamp()), MapsKt.mutableMapOf(TuplesKt.to("renderer", lowerCase)));
    }

    @Override // com.mobilefuse.sdk.telemetry.metricslogging.MetricsMfxService
    public void onAdRendered(@NotNull TelemetryAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        MetricRecordTime specificMetric$mobilefuse_sdk_telemetry_release = getSpecificMetric$mobilefuse_sdk_telemetry_release(adInfo.getAdInstanceId(), MetricRecordName.SHOW_AD_REQUESTED);
        MetricRecordTime specificMetric$mobilefuse_sdk_telemetry_release2 = getSpecificMetric$mobilefuse_sdk_telemetry_release(adInfo.getAdInstanceId(), MetricRecordName.ON_AD_RENDERED);
        if (specificMetric$mobilefuse_sdk_telemetry_release == null || specificMetric$mobilefuse_sdk_telemetry_release2 == null) {
            return;
        }
        String renderType = adInfo.getRenderType();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        String lowerCase = renderType.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        Map<String, String> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("renderer", lowerCase));
        Boolean videoStreamEnabled = adInfo.getVideoStreamEnabled();
        if (videoStreamEnabled != null) {
            if (!videoStreamEnabled.booleanValue()) {
                videoStreamEnabled = null;
            }
            if (videoStreamEnabled != null) {
                addVideoStreamEnabledTag(mapMutableMapOf);
            }
        }
        createMetricLog$mobilefuse_sdk_telemetry_release(Metrics.INSTANCE.getSHOW_TO_RENDERED(), TelemetryHelpersKt.getTimeDiffSeconds(specificMetric$mobilefuse_sdk_telemetry_release.getTimeStamp(), specificMetric$mobilefuse_sdk_telemetry_release2.getTimeStamp()), mapMutableMapOf);
    }

    @Override // com.mobilefuse.sdk.telemetry.metricslogging.MetricsMfxService
    public void onAdvertisingIdRequestFailed(@NotNull TelemetryAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        MetricRecordTime specificMetric$mobilefuse_sdk_telemetry_release = getSpecificMetric$mobilefuse_sdk_telemetry_release(adInfo.getAdInstanceId(), MetricRecordName.ADVERTISING_ID_REQUESTED);
        MetricRecordTime specificMetric$mobilefuse_sdk_telemetry_release2 = getSpecificMetric$mobilefuse_sdk_telemetry_release(adInfo.getAdInstanceId(), MetricRecordName.ADVERTISING_ID_REQUEST_FAILED);
        if (specificMetric$mobilefuse_sdk_telemetry_release == null || specificMetric$mobilefuse_sdk_telemetry_release2 == null) {
            return;
        }
        createMetricLog$mobilefuse_sdk_telemetry_release$default(this, Metrics.INSTANCE.getADVERTISING_ID_REQUESTED_TO_FAILED(), TelemetryHelpersKt.getTimeDiffSeconds(specificMetric$mobilefuse_sdk_telemetry_release.getTimeStamp(), specificMetric$mobilefuse_sdk_telemetry_release2.getTimeStamp()), null, 4, null);
    }

    @Override // com.mobilefuse.sdk.telemetry.metricslogging.MetricsMfxService
    public void onBidTokenCreated(@NotNull TelemetryAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        MetricRecordTime specificMetric$mobilefuse_sdk_telemetry_release = getSpecificMetric$mobilefuse_sdk_telemetry_release(adInfo.getAdInstanceId(), MetricRecordName.BID_TOKEN_REQUESTED);
        MetricRecordTime specificMetric$mobilefuse_sdk_telemetry_release2 = getSpecificMetric$mobilefuse_sdk_telemetry_release(adInfo.getAdInstanceId(), MetricRecordName.BID_TOKEN_GENERATED);
        if (specificMetric$mobilefuse_sdk_telemetry_release == null || specificMetric$mobilefuse_sdk_telemetry_release2 == null) {
            return;
        }
        createMetricLog$mobilefuse_sdk_telemetry_release$default(this, Metrics.INSTANCE.getBIDDING_TOKEN_GENERATED(), TelemetryHelpersKt.getTimeDiffSeconds(specificMetric$mobilefuse_sdk_telemetry_release.getTimeStamp(), specificMetric$mobilefuse_sdk_telemetry_release2.getTimeStamp()), null, 4, null);
    }

    @Override // com.mobilefuse.sdk.telemetry.metricslogging.MetricsMfxService
    public void onBidTokenCreatedWithJIT(@NotNull TelemetryAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        MetricRecordTime specificMetric$mobilefuse_sdk_telemetry_release = getSpecificMetric$mobilefuse_sdk_telemetry_release(adInfo.getAdInstanceId(), MetricRecordName.BID_TOKEN_REQUESTED_WITH_JIT);
        MetricRecordTime specificMetric$mobilefuse_sdk_telemetry_release2 = getSpecificMetric$mobilefuse_sdk_telemetry_release(adInfo.getAdInstanceId(), MetricRecordName.BID_TOKEN_GENERATED);
        if (specificMetric$mobilefuse_sdk_telemetry_release == null || specificMetric$mobilefuse_sdk_telemetry_release2 == null) {
            return;
        }
        createMetricLog$mobilefuse_sdk_telemetry_release$default(this, Metrics.INSTANCE.getBIDDING_TOKEN_GENERATED_WITH_JIT(), TelemetryHelpersKt.getTimeDiffSeconds(specificMetric$mobilefuse_sdk_telemetry_release.getTimeStamp(), specificMetric$mobilefuse_sdk_telemetry_release2.getTimeStamp()), null, 4, null);
    }

    @Override // com.mobilefuse.sdk.telemetry.metricslogging.MetricsMfxService
    public void onVideoReady(@NotNull TelemetryAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        MetricRecordTime specificMetric$mobilefuse_sdk_telemetry_release = getSpecificMetric$mobilefuse_sdk_telemetry_release(adInfo.getAdInstanceId(), MetricRecordName.ON_VIDEO_PLAYER_CREATED);
        MetricRecordTime specificMetric$mobilefuse_sdk_telemetry_release2 = getSpecificMetric$mobilefuse_sdk_telemetry_release(adInfo.getAdInstanceId(), MetricRecordName.VIDEO_CACHED);
        if (specificMetric$mobilefuse_sdk_telemetry_release == null || specificMetric$mobilefuse_sdk_telemetry_release2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean videoStreamEnabled = adInfo.getVideoStreamEnabled();
        if (videoStreamEnabled != null) {
            if (!videoStreamEnabled.booleanValue()) {
                videoStreamEnabled = null;
            }
            if (videoStreamEnabled != null) {
                addVideoStreamEnabledTag(linkedHashMap);
            }
        }
        createMetricLog$mobilefuse_sdk_telemetry_release(Metrics.INSTANCE.getPLAYER_CREATED_TO_RENDER(), TelemetryHelpersKt.getTimeDiffSeconds(specificMetric$mobilefuse_sdk_telemetry_release.getTimeStamp(), specificMetric$mobilefuse_sdk_telemetry_release2.getTimeStamp()), linkedHashMap);
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryEventsMfxService
    public void reportEvents(@NotNull final List<? extends MetricRecord> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.debouncer.debounce(new Function0<Unit>() { // from class: com.mobilefuse.sdk.telemetry.metricslogging.MetricsMfxImpl.reportEvents.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String strCreateJsonLines;
                if (data.isEmpty() || (strCreateJsonLines = MetricsMfxImpl.this.createJsonLines(data)) == null) {
                    return;
                }
                MetricsMfxImpl.this.requestManager.sendRequest(BuildConfig.METRICS_SERVICE, strCreateJsonLines, new Function0<Unit>() { // from class: com.mobilefuse.sdk.telemetry.metricslogging.MetricsMfxImpl.reportEvents.1.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        MetricsMfxImpl.this.deleteLogs(data);
                    }
                });
            }
        });
    }

    public final void reportMetric(int instanceId, @NotNull MetricRecordName events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.metricsRecords.add(new MetricRecordTime(events, instanceId, 0L, 4, null));
    }
}
