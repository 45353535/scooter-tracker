package org.bidon.sdk.stats.models;

import androidx.collection.a;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/bidon/sdk/stats/models/Loss;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "demandId", "", "price", "", "<init>", "(Ljava/lang/String;D)V", "getDemandId", "()Ljava/lang/String;", "getPrice", "()D", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Loss implements Serializable {

    @JsonName(key = "demand_id")
    @NotNull
    private final String demandId;

    @JsonName(key = "price")
    private final double price;

    public Loss(@NotNull String demandId, double d10) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.demandId = demandId;
        this.price = d10;
    }

    public static /* synthetic */ Loss copy$default(Loss loss, String str, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loss.demandId;
        }
        if ((i10 & 2) != 0) {
            d10 = loss.price;
        }
        return loss.copy(str, d10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDemandId() {
        return this.demandId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    @NotNull
    public final Loss copy(@NotNull String demandId, double price) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        return new Loss(demandId, price);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Loss)) {
            return false;
        }
        Loss loss = (Loss) other;
        return Intrinsics.areEqual(this.demandId, loss.demandId) && Double.compare(this.price, loss.price) == 0;
    }

    @NotNull
    public final String getDemandId() {
        return this.demandId;
    }

    public final double getPrice() {
        return this.price;
    }

    public int hashCode() {
        return (this.demandId.hashCode() * 31) + a.a(this.price);
    }

    @NotNull
    public String toString() {
        return "Loss(demandId=" + this.demandId + ", price=" + this.price + ")";
    }
}
