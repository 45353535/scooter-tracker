package com.amazon.aps.shared.metrics.model;

import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\n\u001a\u00020\u0006J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\t\u0010\r\u001a\u00020\u0006HÂ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsTahoeDataModel;", "", "eventCategory", "", C4240b4.i.f42633j0, "eventProperties", "Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "eventSource", "toJsonObject", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", y.f66058y, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApsMetricsTahoeDataModel {

    @NotNull
    public static final String TAHOE_EVENT_CATEGORY_CRASH = "crash";

    @NotNull
    public static final String TAHOE_EVENT_CATEGORY_CUSTOM = "custom";

    @NotNull
    public static final String TAHOE_EVENT_CATEGORY_FUNNEL = "funnel";

    @NotNull
    private String eventCategory;

    @NotNull
    private String eventName;

    @NotNull
    private JSONObject eventProperties;

    @NotNull
    private final String eventSource;

    public ApsMetricsTahoeDataModel(@NotNull String eventCategory, @NotNull String eventName, @NotNull JSONObject eventProperties) {
        Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventProperties, "eventProperties");
        this.eventCategory = eventCategory;
        this.eventName = eventName;
        this.eventProperties = eventProperties;
        this.eventSource = "aps_android_sdk";
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getEventCategory() {
        return this.eventCategory;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getEventName() {
        return this.eventName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final JSONObject getEventProperties() {
        return this.eventProperties;
    }

    public static /* synthetic */ ApsMetricsTahoeDataModel copy$default(ApsMetricsTahoeDataModel apsMetricsTahoeDataModel, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apsMetricsTahoeDataModel.eventCategory;
        }
        if ((i10 & 2) != 0) {
            str2 = apsMetricsTahoeDataModel.eventName;
        }
        if ((i10 & 4) != 0) {
            jSONObject = apsMetricsTahoeDataModel.eventProperties;
        }
        return apsMetricsTahoeDataModel.copy(str, str2, jSONObject);
    }

    @NotNull
    public final ApsMetricsTahoeDataModel copy(@NotNull String eventCategory, @NotNull String eventName, @NotNull JSONObject eventProperties) {
        Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventProperties, "eventProperties");
        return new ApsMetricsTahoeDataModel(eventCategory, eventName, eventProperties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApsMetricsTahoeDataModel)) {
            return false;
        }
        ApsMetricsTahoeDataModel apsMetricsTahoeDataModel = (ApsMetricsTahoeDataModel) other;
        return Intrinsics.areEqual(this.eventCategory, apsMetricsTahoeDataModel.eventCategory) && Intrinsics.areEqual(this.eventName, apsMetricsTahoeDataModel.eventName) && Intrinsics.areEqual(this.eventProperties, apsMetricsTahoeDataModel.eventProperties);
    }

    public int hashCode() {
        return (((this.eventCategory.hashCode() * 31) + this.eventName.hashCode()) * 31) + this.eventProperties.hashCode();
    }

    @NotNull
    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("eventSource", this.eventSource);
        jSONObject2.put("eventTime", System.currentTimeMillis());
        jSONObject2.put(C4240b4.i.f42633j0, this.eventName);
        jSONObject2.put("eventCategory", this.eventCategory);
        jSONObject2.put("eventProperties", this.eventProperties);
        Unit unit = Unit.f93236a;
        jSONObject.put("Data", jSONObject2);
        jSONObject.put("PartitionKey", System.currentTimeMillis());
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsTahoeDataModel(eventCategory=" + this.eventCategory + ", eventName=" + this.eventName + ", eventProperties=" + this.eventProperties + ")";
    }
}
