package org.bidon.sdk.auction.models;

import androidx.collection.a;
import androidx.collection.b;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.g.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.stats.models.BidType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001d\u001a\u00020\u0003H\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÂ\u0003JQ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lorg/bidon/sdk/auction/models/AdUnit;", "", "demandId", "", "label", "pricefloor", "", e0.f66120c, "bidType", "Lorg/bidon/sdk/stats/models/BidType;", "timeout", "", "ext", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Lorg/bidon/sdk/stats/models/BidType;JLjava/lang/String;)V", "getDemandId", "()Ljava/lang/String;", "getLabel", "getPricefloor", "()D", "getUid", "getBidType", "()Lorg/bidon/sdk/stats/models/BidType;", "getTimeout", "()J", "extra", "Lorg/json/JSONObject;", "getExtra", "()Lorg/json/JSONObject;", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AdUnit {

    @NotNull
    private final BidType bidType;

    @NotNull
    private final String demandId;

    @Nullable
    private final String ext;

    @Nullable
    private final JSONObject extra;

    @NotNull
    private final String label;
    private final double pricefloor;
    private final long timeout;

    @NotNull
    private final String uid;

    public AdUnit(@NotNull String demandId, @NotNull String label, double d10, @NotNull String uid, @NotNull BidType bidType, long j10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(bidType, "bidType");
        this.demandId = demandId;
        this.label = label;
        this.pricefloor = d10;
        this.uid = uid;
        this.bidType = bidType;
        this.timeout = j10;
        this.ext = str;
        this.extra = str != null ? new JSONObject(str) : null;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final String getExt() {
        return this.ext;
    }

    public static /* synthetic */ AdUnit copy$default(AdUnit adUnit, String str, String str2, double d10, String str3, BidType bidType, long j10, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adUnit.demandId;
        }
        if ((i10 & 2) != 0) {
            str2 = adUnit.label;
        }
        if ((i10 & 4) != 0) {
            d10 = adUnit.pricefloor;
        }
        if ((i10 & 8) != 0) {
            str3 = adUnit.uid;
        }
        if ((i10 & 16) != 0) {
            bidType = adUnit.bidType;
        }
        if ((i10 & 32) != 0) {
            j10 = adUnit.timeout;
        }
        if ((i10 & 64) != 0) {
            str4 = adUnit.ext;
        }
        String str5 = str4;
        double d11 = d10;
        return adUnit.copy(str, str2, d11, str3, bidType, j10, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDemandId() {
        return this.demandId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getPricefloor() {
        return this.pricefloor;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BidType getBidType() {
        return this.bidType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    @NotNull
    public final AdUnit copy(@NotNull String demandId, @NotNull String label, double pricefloor, @NotNull String uid, @NotNull BidType bidType, long timeout, @Nullable String ext) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(bidType, "bidType");
        return new AdUnit(demandId, label, pricefloor, uid, bidType, timeout, ext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdUnit)) {
            return false;
        }
        AdUnit adUnit = (AdUnit) other;
        return Intrinsics.areEqual(this.demandId, adUnit.demandId) && Intrinsics.areEqual(this.label, adUnit.label) && Double.compare(this.pricefloor, adUnit.pricefloor) == 0 && Intrinsics.areEqual(this.uid, adUnit.uid) && this.bidType == adUnit.bidType && this.timeout == adUnit.timeout && Intrinsics.areEqual(this.ext, adUnit.ext);
    }

    @NotNull
    public final BidType getBidType() {
        return this.bidType;
    }

    @NotNull
    public final String getDemandId() {
        return this.demandId;
    }

    @Nullable
    public final JSONObject getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final double getPricefloor() {
        return this.pricefloor;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.demandId.hashCode() * 31) + this.label.hashCode()) * 31) + a.a(this.pricefloor)) * 31) + this.uid.hashCode()) * 31) + this.bidType.hashCode()) * 31) + b.a(this.timeout)) * 31;
        String str = this.ext;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "AdUnit(demandId='" + this.demandId + "', pricefloor=" + this.pricefloor + ", bidType=" + this.bidType + ", timeout=" + this.timeout + ", ext=" + this.ext + ")";
    }
}
