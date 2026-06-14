package org.bidon.sdk.stats.models;

import androidx.collection.b;
import com.ironsource.X0;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0011\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JT\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lorg/bidon/sdk/stats/models/StatsRequestBody;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "auctionId", "", "auctionConfigurationId", "", "auctionConfigurationUid", "auctionPricefloor", "", X0.f42007c, "", "Lorg/bidon/sdk/stats/models/StatsAdUnit;", "result", "Lorg/bidon/sdk/stats/models/ResultBody;", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lorg/bidon/sdk/stats/models/ResultBody;)V", "getAuctionId", "()Ljava/lang/String;", "getAuctionConfigurationId", "()J", "getAuctionConfigurationUid", "getAuctionPricefloor", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAdUnits", "()Ljava/util/List;", "getResult", "()Lorg/bidon/sdk/stats/models/ResultBody;", "component1", "component2", "component3", "component4", "component5", "component6", MenuActionType.COPY, "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lorg/bidon/sdk/stats/models/ResultBody;)Lorg/bidon/sdk/stats/models/StatsRequestBody;", "equals", "", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class StatsRequestBody implements Serializable {

    @JsonName(key = "ad_units")
    @NotNull
    private final List<StatsAdUnit> adUnits;

    @JsonName(key = "auction_configuration_id")
    private final long auctionConfigurationId;

    @JsonName(key = "auction_configuration_uid")
    @NotNull
    private final String auctionConfigurationUid;

    @JsonName(key = "auction_id")
    @NotNull
    private final String auctionId;

    @JsonName(key = "auction_pricefloor")
    @Nullable
    private final Double auctionPricefloor;

    @JsonName(key = "result")
    @NotNull
    private final ResultBody result;

    public StatsRequestBody(@NotNull String auctionId, long j10, @NotNull String auctionConfigurationUid, @Nullable Double d10, @NotNull List<StatsAdUnit> adUnits, @NotNull ResultBody result) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        Intrinsics.checkNotNullParameter(adUnits, "adUnits");
        Intrinsics.checkNotNullParameter(result, "result");
        this.auctionId = auctionId;
        this.auctionConfigurationId = j10;
        this.auctionConfigurationUid = auctionConfigurationUid;
        this.auctionPricefloor = d10;
        this.adUnits = adUnits;
        this.result = result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatsRequestBody copy$default(StatsRequestBody statsRequestBody, String str, long j10, String str2, Double d10, List list, ResultBody resultBody, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = statsRequestBody.auctionId;
        }
        if ((i10 & 2) != 0) {
            j10 = statsRequestBody.auctionConfigurationId;
        }
        if ((i10 & 4) != 0) {
            str2 = statsRequestBody.auctionConfigurationUid;
        }
        if ((i10 & 8) != 0) {
            d10 = statsRequestBody.auctionPricefloor;
        }
        if ((i10 & 16) != 0) {
            list = statsRequestBody.adUnits;
        }
        if ((i10 & 32) != 0) {
            resultBody = statsRequestBody.result;
        }
        return statsRequestBody.copy(str, j10, str2, d10, list, resultBody);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuctionId() {
        return this.auctionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAuctionConfigurationId() {
        return this.auctionConfigurationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuctionConfigurationUid() {
        return this.auctionConfigurationUid;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getAuctionPricefloor() {
        return this.auctionPricefloor;
    }

    @NotNull
    public final List<StatsAdUnit> component5() {
        return this.adUnits;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ResultBody getResult() {
        return this.result;
    }

    @NotNull
    public final StatsRequestBody copy(@NotNull String auctionId, long auctionConfigurationId, @NotNull String auctionConfigurationUid, @Nullable Double auctionPricefloor, @NotNull List<StatsAdUnit> adUnits, @NotNull ResultBody result) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        Intrinsics.checkNotNullParameter(adUnits, "adUnits");
        Intrinsics.checkNotNullParameter(result, "result");
        return new StatsRequestBody(auctionId, auctionConfigurationId, auctionConfigurationUid, auctionPricefloor, adUnits, result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatsRequestBody)) {
            return false;
        }
        StatsRequestBody statsRequestBody = (StatsRequestBody) other;
        return Intrinsics.areEqual(this.auctionId, statsRequestBody.auctionId) && this.auctionConfigurationId == statsRequestBody.auctionConfigurationId && Intrinsics.areEqual(this.auctionConfigurationUid, statsRequestBody.auctionConfigurationUid) && Intrinsics.areEqual((Object) this.auctionPricefloor, (Object) statsRequestBody.auctionPricefloor) && Intrinsics.areEqual(this.adUnits, statsRequestBody.adUnits) && Intrinsics.areEqual(this.result, statsRequestBody.result);
    }

    @NotNull
    public final List<StatsAdUnit> getAdUnits() {
        return this.adUnits;
    }

    public final long getAuctionConfigurationId() {
        return this.auctionConfigurationId;
    }

    @NotNull
    public final String getAuctionConfigurationUid() {
        return this.auctionConfigurationUid;
    }

    @NotNull
    public final String getAuctionId() {
        return this.auctionId;
    }

    @Nullable
    public final Double getAuctionPricefloor() {
        return this.auctionPricefloor;
    }

    @NotNull
    public final ResultBody getResult() {
        return this.result;
    }

    public int hashCode() {
        int iHashCode = ((((this.auctionId.hashCode() * 31) + b.a(this.auctionConfigurationId)) * 31) + this.auctionConfigurationUid.hashCode()) * 31;
        Double d10 = this.auctionPricefloor;
        return ((((iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + this.adUnits.hashCode()) * 31) + this.result.hashCode();
    }

    @NotNull
    public String toString() {
        return "StatsRequestBody(auctionId=" + this.auctionId + ", auctionConfigurationId=" + this.auctionConfigurationId + ", auctionConfigurationUid=" + this.auctionConfigurationUid + ", auctionPricefloor=" + this.auctionPricefloor + ", adUnits=" + this.adUnits + ", result=" + this.result + ")";
    }
}
