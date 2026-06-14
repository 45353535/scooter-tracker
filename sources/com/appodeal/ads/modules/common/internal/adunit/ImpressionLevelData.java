package com.appodeal.ads.modules.common.internal.adunit;

import androidx.compose.foundation.c;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.appodeal.ads.revenue.RevenuePrecision;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJn\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b\u000e\u0010\u001d¨\u0006;"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/adunit/ImpressionLevelData;", "", "", "id", "", "ecpm", "revenue", "currency", "Lcom/appodeal/ads/revenue/RevenuePrecision;", "precision", "demandSource", "Lorg/json/JSONObject;", "extraData", "", "isFinalIld", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/appodeal/ads/revenue/RevenuePrecision;Ljava/lang/String;Lorg/json/JSONObject;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Double;", "component3", "component4", "component5", "()Lcom/appodeal/ads/revenue/RevenuePrecision;", "component6", "component7", "()Lorg/json/JSONObject;", "component8", "()Z", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/appodeal/ads/revenue/RevenuePrecision;Ljava/lang/String;Lorg/json/JSONObject;Z)Lcom/appodeal/ads/modules/common/internal/adunit/ImpressionLevelData;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/lang/Double;", "getEcpm", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getRevenue", "d", "getCurrency", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/appodeal/ads/revenue/RevenuePrecision;", "getPrecision", InneractiveMediationDefs.GENDER_FEMALE, "getDemandSource", "g", "Lorg/json/JSONObject;", "getExtraData", "h", "Z", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ImpressionLevelData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final Double ecpm;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final Double revenue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final String currency;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final RevenuePrecision precision;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final String demandSource;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final JSONObject extraData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isFinalIld;

    public ImpressionLevelData() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    public static /* synthetic */ ImpressionLevelData copy$default(ImpressionLevelData impressionLevelData, String str, Double d10, Double d11, String str2, RevenuePrecision revenuePrecision, String str3, JSONObject jSONObject, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = impressionLevelData.id;
        }
        if ((i10 & 2) != 0) {
            d10 = impressionLevelData.ecpm;
        }
        if ((i10 & 4) != 0) {
            d11 = impressionLevelData.revenue;
        }
        if ((i10 & 8) != 0) {
            str2 = impressionLevelData.currency;
        }
        if ((i10 & 16) != 0) {
            revenuePrecision = impressionLevelData.precision;
        }
        if ((i10 & 32) != 0) {
            str3 = impressionLevelData.demandSource;
        }
        if ((i10 & 64) != 0) {
            jSONObject = impressionLevelData.extraData;
        }
        if ((i10 & 128) != 0) {
            z10 = impressionLevelData.isFinalIld;
        }
        JSONObject jSONObject2 = jSONObject;
        boolean z11 = z10;
        RevenuePrecision revenuePrecision2 = revenuePrecision;
        String str4 = str3;
        return impressionLevelData.copy(str, d10, d11, str2, revenuePrecision2, str4, jSONObject2, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getEcpm() {
        return this.ecpm;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getRevenue() {
        return this.revenue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RevenuePrecision getPrecision() {
        return this.precision;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDemandSource() {
        return this.demandSource;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final JSONObject getExtraData() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsFinalIld() {
        return this.isFinalIld;
    }

    public final ImpressionLevelData copy(String id2, Double ecpm, Double revenue, String currency, RevenuePrecision precision, String demandSource, JSONObject extraData, boolean isFinalIld) {
        return new ImpressionLevelData(id2, ecpm, revenue, currency, precision, demandSource, extraData, isFinalIld);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImpressionLevelData)) {
            return false;
        }
        ImpressionLevelData impressionLevelData = (ImpressionLevelData) other;
        return Intrinsics.areEqual(this.id, impressionLevelData.id) && Intrinsics.areEqual((Object) this.ecpm, (Object) impressionLevelData.ecpm) && Intrinsics.areEqual((Object) this.revenue, (Object) impressionLevelData.revenue) && Intrinsics.areEqual(this.currency, impressionLevelData.currency) && this.precision == impressionLevelData.precision && Intrinsics.areEqual(this.demandSource, impressionLevelData.demandSource) && Intrinsics.areEqual(this.extraData, impressionLevelData.extraData) && this.isFinalIld == impressionLevelData.isFinalIld;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDemandSource() {
        return this.demandSource;
    }

    public final Double getEcpm() {
        return this.ecpm;
    }

    public final JSONObject getExtraData() {
        return this.extraData;
    }

    public final String getId() {
        return this.id;
    }

    public final RevenuePrecision getPrecision() {
        return this.precision;
    }

    public final Double getRevenue() {
        return this.revenue;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d10 = this.ecpm;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.revenue;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RevenuePrecision revenuePrecision = this.precision;
        int iHashCode5 = (iHashCode4 + (revenuePrecision == null ? 0 : revenuePrecision.hashCode())) * 31;
        String str3 = this.demandSource;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        JSONObject jSONObject = this.extraData;
        return c.a(this.isFinalIld) + ((iHashCode6 + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31);
    }

    public final boolean isFinalIld() {
        return this.isFinalIld;
    }

    public String toString() {
        return "ImpressionLevelData(id=" + this.id + ", ecpm=" + this.ecpm + ", revenue=" + this.revenue + ", currency=" + this.currency + ", precision=" + this.precision + ", demandSource=" + this.demandSource + ", extraData=" + this.extraData + ", isFinalIld=" + this.isFinalIld + ")";
    }

    public ImpressionLevelData(String str, Double d10, Double d11, String str2, RevenuePrecision revenuePrecision, String str3, JSONObject jSONObject, boolean z10) {
        this.id = str;
        this.ecpm = d10;
        this.revenue = d11;
        this.currency = str2;
        this.precision = revenuePrecision;
        this.demandSource = str3;
        this.extraData = jSONObject;
        this.isFinalIld = z10;
    }

    public /* synthetic */ ImpressionLevelData(String str, Double d10, Double d11, String str2, RevenuePrecision revenuePrecision, String str3, JSONObject jSONObject, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : d11, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : revenuePrecision, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : jSONObject, (i10 & 128) != 0 ? true : z10);
    }
}
