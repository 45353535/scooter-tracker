package org.bidon.sdk.stats.models;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003J¨\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001cR\u001a\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b!\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b%\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006>"}, d2 = {"Lorg/bidon/sdk/stats/models/StatsAdUnit;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "demandId", "", "status", "price", "", "tokenStartTs", "", "tokenFinishTs", "bidType", "fillStartTs", "fillFinishTs", "adUnitUid", "adUnitLabel", "errorMessage", "timeout", "ext", "Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lorg/json/JSONObject;)V", "getDemandId", "()Ljava/lang/String;", "getStatus", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTokenStartTs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTokenFinishTs", "getBidType", "getFillStartTs", "getFillFinishTs", "getAdUnitUid", "getAdUnitLabel", "getErrorMessage", "getTimeout", "getExt", "()Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lorg/json/JSONObject;)Lorg/bidon/sdk/stats/models/StatsAdUnit;", "equals", "", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class StatsAdUnit implements Serializable {

    @JsonName(key = "ad_unit_label")
    @Nullable
    private final String adUnitLabel;

    @JsonName(key = "ad_unit_uid")
    @Nullable
    private final String adUnitUid;

    @JsonName(key = "bid_type")
    @Nullable
    private final String bidType;

    @JsonName(key = "demand_id")
    @NotNull
    private final String demandId;

    @JsonName(key = "error_message")
    @Nullable
    private final String errorMessage;

    @Nullable
    private final JSONObject ext;

    @JsonName(key = "fill_finish_ts")
    @Nullable
    private final Long fillFinishTs;

    @JsonName(key = "fill_start_ts")
    @Nullable
    private final Long fillStartTs;

    @JsonName(key = "price")
    @Nullable
    private final Double price;

    @JsonName(key = "status")
    @Nullable
    private final String status;

    @Nullable
    private final Long timeout;

    @JsonName(key = "token_finish_ts")
    @Nullable
    private final Long tokenFinishTs;

    @JsonName(key = "token_start_ts")
    @Nullable
    private final Long tokenStartTs;

    public StatsAdUnit(@NotNull String demandId, @Nullable String str, @Nullable Double d10, @Nullable Long l10, @Nullable Long l11, @Nullable String str2, @Nullable Long l12, @Nullable Long l13, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l14, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.demandId = demandId;
        this.status = str;
        this.price = d10;
        this.tokenStartTs = l10;
        this.tokenFinishTs = l11;
        this.bidType = str2;
        this.fillStartTs = l12;
        this.fillFinishTs = l13;
        this.adUnitUid = str3;
        this.adUnitLabel = str4;
        this.errorMessage = str5;
        this.timeout = l14;
        this.ext = jSONObject;
    }

    public static /* synthetic */ StatsAdUnit copy$default(StatsAdUnit statsAdUnit, String str, String str2, Double d10, Long l10, Long l11, String str3, Long l12, Long l13, String str4, String str5, String str6, Long l14, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = statsAdUnit.demandId;
        }
        return statsAdUnit.copy(str, (i10 & 2) != 0 ? statsAdUnit.status : str2, (i10 & 4) != 0 ? statsAdUnit.price : d10, (i10 & 8) != 0 ? statsAdUnit.tokenStartTs : l10, (i10 & 16) != 0 ? statsAdUnit.tokenFinishTs : l11, (i10 & 32) != 0 ? statsAdUnit.bidType : str3, (i10 & 64) != 0 ? statsAdUnit.fillStartTs : l12, (i10 & 128) != 0 ? statsAdUnit.fillFinishTs : l13, (i10 & 256) != 0 ? statsAdUnit.adUnitUid : str4, (i10 & 512) != 0 ? statsAdUnit.adUnitLabel : str5, (i10 & 1024) != 0 ? statsAdUnit.errorMessage : str6, (i10 & 2048) != 0 ? statsAdUnit.timeout : l14, (i10 & 4096) != 0 ? statsAdUnit.ext : jSONObject);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDemandId() {
        return this.demandId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAdUnitLabel() {
        return this.adUnitLabel;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getTimeout() {
        return this.timeout;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final JSONObject getExt() {
        return this.ext;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTokenStartTs() {
        return this.tokenStartTs;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTokenFinishTs() {
        return this.tokenFinishTs;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBidType() {
        return this.bidType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getFillStartTs() {
        return this.fillStartTs;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getFillFinishTs() {
        return this.fillFinishTs;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAdUnitUid() {
        return this.adUnitUid;
    }

    @NotNull
    public final StatsAdUnit copy(@NotNull String demandId, @Nullable String status, @Nullable Double price, @Nullable Long tokenStartTs, @Nullable Long tokenFinishTs, @Nullable String bidType, @Nullable Long fillStartTs, @Nullable Long fillFinishTs, @Nullable String adUnitUid, @Nullable String adUnitLabel, @Nullable String errorMessage, @Nullable Long timeout, @Nullable JSONObject ext) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        return new StatsAdUnit(demandId, status, price, tokenStartTs, tokenFinishTs, bidType, fillStartTs, fillFinishTs, adUnitUid, adUnitLabel, errorMessage, timeout, ext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatsAdUnit)) {
            return false;
        }
        StatsAdUnit statsAdUnit = (StatsAdUnit) other;
        return Intrinsics.areEqual(this.demandId, statsAdUnit.demandId) && Intrinsics.areEqual(this.status, statsAdUnit.status) && Intrinsics.areEqual((Object) this.price, (Object) statsAdUnit.price) && Intrinsics.areEqual(this.tokenStartTs, statsAdUnit.tokenStartTs) && Intrinsics.areEqual(this.tokenFinishTs, statsAdUnit.tokenFinishTs) && Intrinsics.areEqual(this.bidType, statsAdUnit.bidType) && Intrinsics.areEqual(this.fillStartTs, statsAdUnit.fillStartTs) && Intrinsics.areEqual(this.fillFinishTs, statsAdUnit.fillFinishTs) && Intrinsics.areEqual(this.adUnitUid, statsAdUnit.adUnitUid) && Intrinsics.areEqual(this.adUnitLabel, statsAdUnit.adUnitLabel) && Intrinsics.areEqual(this.errorMessage, statsAdUnit.errorMessage) && Intrinsics.areEqual(this.timeout, statsAdUnit.timeout) && Intrinsics.areEqual(this.ext, statsAdUnit.ext);
    }

    @Nullable
    public final String getAdUnitLabel() {
        return this.adUnitLabel;
    }

    @Nullable
    public final String getAdUnitUid() {
        return this.adUnitUid;
    }

    @Nullable
    public final String getBidType() {
        return this.bidType;
    }

    @NotNull
    public final String getDemandId() {
        return this.demandId;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final JSONObject getExt() {
        return this.ext;
    }

    @Nullable
    public final Long getFillFinishTs() {
        return this.fillFinishTs;
    }

    @Nullable
    public final Long getFillStartTs() {
        return this.fillStartTs;
    }

    @Nullable
    public final Double getPrice() {
        return this.price;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Long getTimeout() {
        return this.timeout;
    }

    @Nullable
    public final Long getTokenFinishTs() {
        return this.tokenFinishTs;
    }

    @Nullable
    public final Long getTokenStartTs() {
        return this.tokenStartTs;
    }

    public int hashCode() {
        int iHashCode = this.demandId.hashCode() * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d10 = this.price;
        int iHashCode3 = (iHashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Long l10 = this.tokenStartTs;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.tokenFinishTs;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.bidType;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.fillStartTs;
        int iHashCode7 = (iHashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.fillFinishTs;
        int iHashCode8 = (iHashCode7 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str3 = this.adUnitUid;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adUnitLabel;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errorMessage;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l14 = this.timeout;
        int iHashCode12 = (iHashCode11 + (l14 == null ? 0 : l14.hashCode())) * 31;
        JSONObject jSONObject = this.ext;
        return iHashCode12 + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StatsAdUnit(demandId=" + this.demandId + ", status=" + this.status + ", price=" + this.price + ", tokenStartTs=" + this.tokenStartTs + ", tokenFinishTs=" + this.tokenFinishTs + ", bidType=" + this.bidType + ", fillStartTs=" + this.fillStartTs + ", fillFinishTs=" + this.fillFinishTs + ", adUnitUid=" + this.adUnitUid + ", adUnitLabel=" + this.adUnitLabel + ", errorMessage=" + this.errorMessage + ", timeout=" + this.timeout + ", ext=" + this.ext + ")";
    }

    public /* synthetic */ StatsAdUnit(String str, String str2, Double d10, Long l10, Long l11, String str3, Long l12, Long l13, String str4, String str5, String str6, Long l14, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d10, l10, l11, str3, l12, l13, str4, str5, (i10 & 1024) != 0 ? null : str6, l14, jSONObject);
    }
}
