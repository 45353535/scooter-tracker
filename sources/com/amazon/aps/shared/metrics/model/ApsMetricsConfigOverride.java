package com.amazon.aps.shared.metrics.model;

import androidx.compose.foundation.c;
import com.amazon.aps.ads.ApsLog;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\nJ\u0006\u0010\u0016\u001a\u00020\u0005J\u0006\u0010\u0017\u001a\u00020\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006!"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsConfigOverride;", "", "samplingPercentage", "", ApsMetricsConfigOverride.CUSTOM_ONLY_KEY, "", "<init>", "(IZ)V", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getSamplingPercentage", "()I", "setSamplingPercentage", "(I)V", "getCustomOnly", "()Z", "setCustomOnly", "(Z)V", "value", ApsMetricsConfigOverride.HAS_CUSTOM_ONLY_FLAG_KEY, "getHasCustomOnlyFlag", "isValid", "toJsonObject", "toString", "", "component1", "component2", MenuActionType.COPY, "equals", "other", "hashCode", y.f66058y, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApsMetricsConfigOverride {

    @NotNull
    private static final String CUSTOM_ONLY_KEY = "customOnly";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String HAS_CUSTOM_ONLY_FLAG_KEY = "hasCustomOnlyFlag";

    @NotNull
    private static final String SAMPLING_PERCENTAGE_KEY = "samplingPercentage";
    private boolean customOnly;
    private boolean hasCustomOnlyFlag;
    private int samplingPercentage;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsConfigOverride$Companion;", "", "<init>", "()V", "SAMPLING_PERCENTAGE_KEY", "", "CUSTOM_ONLY_KEY", "HAS_CUSTOM_ONLY_FLAG_KEY", "fromJsonObject", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsConfigOverride;", "json", "Lorg/json/JSONObject;", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ApsMetricsConfigOverride fromJsonObject(@Nullable JSONObject json) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (json == null) {
                return null;
            }
            try {
                ApsMetricsConfigOverride apsMetricsConfigOverride = new ApsMetricsConfigOverride(0, 0 == true ? 1 : 0, 3, defaultConstructorMarker);
                if (!json.has("samplingPercentage")) {
                    return null;
                }
                apsMetricsConfigOverride.setSamplingPercentage(json.getInt("samplingPercentage"));
                apsMetricsConfigOverride.hasCustomOnlyFlag = json.optBoolean(ApsMetricsConfigOverride.HAS_CUSTOM_ONLY_FLAG_KEY, false);
                if (apsMetricsConfigOverride.getHasCustomOnlyFlag()) {
                    apsMetricsConfigOverride.setCustomOnly(json.optBoolean(ApsMetricsConfigOverride.CUSTOM_ONLY_KEY, false));
                }
                if (apsMetricsConfigOverride.isValid()) {
                    return apsMetricsConfigOverride;
                }
                return null;
            } catch (Exception e10) {
                ApsLog.e("ApsMetricsConfigOverride: Error parsing from JSON: " + e10.getMessage());
                return null;
            }
        }

        private Companion() {
        }
    }

    public ApsMetricsConfigOverride() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ ApsMetricsConfigOverride copy$default(ApsMetricsConfigOverride apsMetricsConfigOverride, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = apsMetricsConfigOverride.samplingPercentage;
        }
        if ((i11 & 2) != 0) {
            z10 = apsMetricsConfigOverride.customOnly;
        }
        return apsMetricsConfigOverride.copy(i10, z10);
    }

    @Nullable
    public static final ApsMetricsConfigOverride fromJsonObject(@Nullable JSONObject jSONObject) {
        return INSTANCE.fromJsonObject(jSONObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSamplingPercentage() {
        return this.samplingPercentage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCustomOnly() {
        return this.customOnly;
    }

    @NotNull
    public final ApsMetricsConfigOverride copy(int samplingPercentage, boolean customOnly) {
        return new ApsMetricsConfigOverride(samplingPercentage, customOnly);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApsMetricsConfigOverride)) {
            return false;
        }
        ApsMetricsConfigOverride apsMetricsConfigOverride = (ApsMetricsConfigOverride) other;
        return this.samplingPercentage == apsMetricsConfigOverride.samplingPercentage && this.customOnly == apsMetricsConfigOverride.customOnly;
    }

    public final boolean getCustomOnly() {
        return this.customOnly;
    }

    public final boolean getHasCustomOnlyFlag() {
        return this.hasCustomOnlyFlag;
    }

    public final int getSamplingPercentage() {
        return this.samplingPercentage;
    }

    public int hashCode() {
        return (this.samplingPercentage * 31) + c.a(this.customOnly);
    }

    public final boolean isValid() {
        int i10 = this.samplingPercentage;
        if (i10 >= 0 && i10 <= 100) {
            return true;
        }
        ApsLog.e("ApsMetricsConfigOverride: Invalid samplingPercentage: " + i10);
        return false;
    }

    public final void setCustomOnly(boolean z10) {
        this.customOnly = z10;
    }

    public final void setSamplingPercentage(int i10) {
        this.samplingPercentage = i10;
    }

    @NotNull
    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("samplingPercentage", this.samplingPercentage);
        jSONObject.put(HAS_CUSTOM_ONLY_FLAG_KEY, this.hasCustomOnlyFlag);
        if (this.hasCustomOnlyFlag) {
            jSONObject.put(CUSTOM_ONLY_KEY, this.customOnly);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsConfigOverride(samplingPercentage=" + this.samplingPercentage + ", customOnly=" + this.customOnly + ", hasCustomOnlyFlag=" + this.hasCustomOnlyFlag + ")";
    }

    public ApsMetricsConfigOverride(int i10, boolean z10) {
        this.samplingPercentage = i10;
        this.customOnly = z10;
    }

    public /* synthetic */ ApsMetricsConfigOverride(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? false : z10);
    }

    public ApsMetricsConfigOverride(@Nullable JSONObject jSONObject) {
        this(0, false);
        if (jSONObject != null) {
            try {
                this.samplingPercentage = jSONObject.getInt("samplingPercentage");
                if (jSONObject.has(CUSTOM_ONLY_KEY)) {
                    try {
                        this.customOnly = jSONObject.getBoolean(CUSTOM_ONLY_KEY);
                        this.hasCustomOnlyFlag = true;
                    } catch (Exception unused) {
                        throw new IllegalArgumentException("ApsMetricsConfigOverride: Invalid customOnly value type");
                    }
                }
                if (!isValid()) {
                    throw new IllegalArgumentException("ApsMetricsConfigOverride: Configuration validation failed");
                }
                return;
            } catch (Exception unused2) {
                throw new IllegalArgumentException("ApsMetricsConfigOverride: Missing or invalid samplingPercentage");
            }
        }
        throw new IllegalArgumentException("ApsMetricsConfigOverride: Invalid JSON object provided");
    }
}
