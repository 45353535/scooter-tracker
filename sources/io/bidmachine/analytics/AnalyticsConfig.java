package io.bidmachine.analytics;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.explorestack.protobuf.Struct;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/bidmachine/analytics/AnalyticsConfig;", "", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "Lio/bidmachine/analytics/MonitorConfig;", "monitorConfigList", "Lio/bidmachine/analytics/ReaderConfig;", "readerConfigList", "bpk", "Lcom/explorestack/protobuf/Struct;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/explorestack/protobuf/Struct;)V", "a", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getMonitorConfigList", "()Ljava/util/List;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getReaderConfigList", "d", "getBpk", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/explorestack/protobuf/Struct;", "getExtras", "()Lcom/explorestack/protobuf/Struct;", "bidmachine-android-sdk_bg_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AnalyticsConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List monitorConfigList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List readerConfigList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String bpk;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Struct extras;

    public AnalyticsConfig(String str, List<MonitorConfig> list, List<ReaderConfig> list2, String str2, Struct struct) {
        this.sessionId = str;
        this.monitorConfigList = list;
        this.readerConfigList = list2;
        this.bpk = str2;
        this.extras = struct;
    }

    public final String getBpk() {
        return this.bpk;
    }

    public final Struct getExtras() {
        return this.extras;
    }

    public final List<MonitorConfig> getMonitorConfigList() {
        return this.monitorConfigList;
    }

    public final List<ReaderConfig> getReaderConfigList() {
        return this.readerConfigList;
    }

    public final String getSessionId() {
        return this.sessionId;
    }
}
