package com.appsflyer.internal.models;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B)\b\u0000\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/appsflyer/internal/models/OfferDetails;", "", "offerTags", "", "", "basePlanId", "offerId", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getBasePlanId", "()Ljava/lang/String;", "getOfferId", "getOfferTags", "()Ljava/util/List;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OfferDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String basePlanId;

    @Nullable
    private final String offerId;

    @Nullable
    private final List<String> offerTags;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/OfferDetails$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/OfferDetails;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<OfferDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public OfferDetails fromJson(@NotNull JSONObject json) {
            List list;
            Intrinsics.checkNotNullParameter(json, "json");
            JSONArray jSONArrayOptJSONArray = json.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "optJSONArray(\"offerTags\")");
                list = SubscriptionPurchaseKt.toList(jSONArrayOptJSONArray);
            } else {
                list = null;
            }
            String strOptString = json.optString("basePlanId");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(\"basePlanId\")");
            return new OfferDetails(list, strOptString, (String) SubscriptionPurchaseKt.getNullable(json, "offerId"));
        }
    }

    public OfferDetails(@Nullable List<String> list, @NotNull String basePlanId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        this.offerTags = list;
        this.basePlanId = basePlanId;
        this.offerId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfferDetails copy$default(OfferDetails offerDetails, List list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = offerDetails.offerTags;
        }
        if ((i10 & 2) != 0) {
            str = offerDetails.basePlanId;
        }
        if ((i10 & 4) != 0) {
            str2 = offerDetails.offerId;
        }
        return offerDetails.copy(list, str, str2);
    }

    @Nullable
    public final List<String> component1() {
        return this.offerTags;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    @NotNull
    public final OfferDetails copy(@Nullable List<String> offerTags, @NotNull String basePlanId, @Nullable String offerId) {
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        return new OfferDetails(offerTags, basePlanId, offerId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferDetails)) {
            return false;
        }
        OfferDetails offerDetails = (OfferDetails) other;
        return Intrinsics.areEqual(this.offerTags, offerDetails.offerTags) && Intrinsics.areEqual(this.basePlanId, offerDetails.basePlanId) && Intrinsics.areEqual(this.offerId, offerDetails.offerId);
    }

    @NotNull
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Nullable
    public final String getOfferId() {
        return this.offerId;
    }

    @Nullable
    public final List<String> getOfferTags() {
        return this.offerTags;
    }

    public int hashCode() {
        List<String> list = this.offerTags;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.basePlanId.hashCode()) * 31;
        String str = this.offerId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OfferDetails(offerTags=" + this.offerTags + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ")";
    }
}
