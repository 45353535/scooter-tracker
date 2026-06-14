package com.amazon.aps.shared.metrics;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.model.ApsMetricsCustomEventInfo;
import com.amazon.aps.shared.metrics.model.ApsMetricsCustomModel;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataModel;
import com.amazon.aps.shared.metrics.model.ApsMetricsEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsTahoeDataModel;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\b\u0010\u000f\u001a\u0004\u0018\u00010\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/aps/shared/metrics/ApsMetricsCustomEventModelBuilder;", "", "<init>", "()V", C4240b4.i.f42633j0, "", "eventValue", "extraAttrs", "Lorg/json/JSONObject;", "eventCategory", "withEventName", "withEventValue", "withEventDetail", "extraAttributes", "withEventCategory", "build", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsMetricsCustomEventModelBuilder {

    @NotNull
    private String eventCategory = "custom";

    @Nullable
    private String eventName;

    @Nullable
    private String eventValue;

    @Nullable
    private JSONObject extraAttrs;

    @Nullable
    public final JSONObject build() {
        try {
            String str = this.eventName;
            if (str != null) {
                return new ApsMetricsTahoeDataModel(this.eventCategory, str, new ApsMetricsDataModel(new ApsMetricsEvent(new ApsMetricsCustomModel(new ApsMetricsCustomEventInfo(str, this.eventValue, this.extraAttrs)))).toJsonObject()).toJsonObject();
            }
            return null;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error builing the custom metrics object from builder", e10);
            return null;
        }
    }

    @NotNull
    public final ApsMetricsCustomEventModelBuilder withEventCategory(@NotNull String eventCategory) {
        Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
        this.eventCategory = eventCategory;
        return this;
    }

    @NotNull
    public final ApsMetricsCustomEventModelBuilder withEventDetail(@NotNull JSONObject extraAttributes) {
        Intrinsics.checkNotNullParameter(extraAttributes, "extraAttributes");
        this.extraAttrs = extraAttributes;
        return this;
    }

    @NotNull
    public final ApsMetricsCustomEventModelBuilder withEventName(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
        return this;
    }

    @NotNull
    public final ApsMetricsCustomEventModelBuilder withEventValue(@NotNull String eventValue) {
        Intrinsics.checkNotNullParameter(eventValue, "eventValue");
        this.eventValue = eventValue;
        return this;
    }
}
