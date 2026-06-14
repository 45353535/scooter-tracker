package com.appsflyer.internal.models;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B?\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006'"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;", "", "autoRenewingPlan", "Lcom/appsflyer/internal/models/AutoRenewingPlan;", "deferredItemReplacement", "Lcom/appsflyer/internal/models/DeferredItemReplacement;", "expiryTime", "", "offerDetails", "Lcom/appsflyer/internal/models/OfferDetails;", "prepaidPlan", "Lcom/appsflyer/internal/models/PrepaidPlan;", InAppPurchaseMetaData.KEY_PRODUCT_ID, "(Lcom/appsflyer/internal/models/AutoRenewingPlan;Lcom/appsflyer/internal/models/DeferredItemReplacement;Ljava/lang/String;Lcom/appsflyer/internal/models/OfferDetails;Lcom/appsflyer/internal/models/PrepaidPlan;Ljava/lang/String;)V", "getAutoRenewingPlan", "()Lcom/appsflyer/internal/models/AutoRenewingPlan;", "getDeferredItemReplacement", "()Lcom/appsflyer/internal/models/DeferredItemReplacement;", "getExpiryTime", "()Ljava/lang/String;", "getOfferDetails", "()Lcom/appsflyer/internal/models/OfferDetails;", "getPrepaidPlan", "()Lcom/appsflyer/internal/models/PrepaidPlan;", "getProductId", "component1", "component2", "component3", "component4", "component5", "component6", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SubscriptionPurchaseLineItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final AutoRenewingPlan autoRenewingPlan;

    @Nullable
    private final DeferredItemReplacement deferredItemReplacement;

    @NotNull
    private final String expiryTime;

    @Nullable
    private final OfferDetails offerDetails;

    @Nullable
    private final PrepaidPlan prepaidPlan;

    @NotNull
    private final String productId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<SubscriptionPurchaseLineItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public SubscriptionPurchaseLineItem fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            AutoRenewingPlan autoRenewingPlan = (AutoRenewingPlan) SubscriptionPurchaseKt.toObject(json, "autoRenewingPlan", AutoRenewingPlan.INSTANCE);
            DeferredItemReplacement deferredItemReplacement = (DeferredItemReplacement) SubscriptionPurchaseKt.toObject(json, "deferredItemReplacement", DeferredItemReplacement.INSTANCE);
            String strOptString = json.optString("expiryTime");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(\"expiryTime\")");
            OfferDetails offerDetails = (OfferDetails) SubscriptionPurchaseKt.toObject(json, "offerDetails", OfferDetails.INSTANCE);
            PrepaidPlan prepaidPlan = (PrepaidPlan) SubscriptionPurchaseKt.toObject(json, "prepaidPlan", PrepaidPlan.INSTANCE);
            String strOptString2 = json.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(\"productId\")");
            return new SubscriptionPurchaseLineItem(autoRenewingPlan, deferredItemReplacement, strOptString, offerDetails, prepaidPlan, strOptString2);
        }
    }

    public SubscriptionPurchaseLineItem(@Nullable AutoRenewingPlan autoRenewingPlan, @Nullable DeferredItemReplacement deferredItemReplacement, @NotNull String expiryTime, @Nullable OfferDetails offerDetails, @Nullable PrepaidPlan prepaidPlan, @NotNull String productId) {
        Intrinsics.checkNotNullParameter(expiryTime, "expiryTime");
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.autoRenewingPlan = autoRenewingPlan;
        this.deferredItemReplacement = deferredItemReplacement;
        this.expiryTime = expiryTime;
        this.offerDetails = offerDetails;
        this.prepaidPlan = prepaidPlan;
        this.productId = productId;
    }

    public static /* synthetic */ SubscriptionPurchaseLineItem copy$default(SubscriptionPurchaseLineItem subscriptionPurchaseLineItem, AutoRenewingPlan autoRenewingPlan, DeferredItemReplacement deferredItemReplacement, String str, OfferDetails offerDetails, PrepaidPlan prepaidPlan, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            autoRenewingPlan = subscriptionPurchaseLineItem.autoRenewingPlan;
        }
        if ((i10 & 2) != 0) {
            deferredItemReplacement = subscriptionPurchaseLineItem.deferredItemReplacement;
        }
        if ((i10 & 4) != 0) {
            str = subscriptionPurchaseLineItem.expiryTime;
        }
        if ((i10 & 8) != 0) {
            offerDetails = subscriptionPurchaseLineItem.offerDetails;
        }
        if ((i10 & 16) != 0) {
            prepaidPlan = subscriptionPurchaseLineItem.prepaidPlan;
        }
        if ((i10 & 32) != 0) {
            str2 = subscriptionPurchaseLineItem.productId;
        }
        PrepaidPlan prepaidPlan2 = prepaidPlan;
        String str3 = str2;
        return subscriptionPurchaseLineItem.copy(autoRenewingPlan, deferredItemReplacement, str, offerDetails, prepaidPlan2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AutoRenewingPlan getAutoRenewingPlan() {
        return this.autoRenewingPlan;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeferredItemReplacement getDeferredItemReplacement() {
        return this.deferredItemReplacement;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PrepaidPlan getPrepaidPlan() {
        return this.prepaidPlan;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final SubscriptionPurchaseLineItem copy(@Nullable AutoRenewingPlan autoRenewingPlan, @Nullable DeferredItemReplacement deferredItemReplacement, @NotNull String expiryTime, @Nullable OfferDetails offerDetails, @Nullable PrepaidPlan prepaidPlan, @NotNull String productId) {
        Intrinsics.checkNotNullParameter(expiryTime, "expiryTime");
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new SubscriptionPurchaseLineItem(autoRenewingPlan, deferredItemReplacement, expiryTime, offerDetails, prepaidPlan, productId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionPurchaseLineItem)) {
            return false;
        }
        SubscriptionPurchaseLineItem subscriptionPurchaseLineItem = (SubscriptionPurchaseLineItem) other;
        return Intrinsics.areEqual(this.autoRenewingPlan, subscriptionPurchaseLineItem.autoRenewingPlan) && Intrinsics.areEqual(this.deferredItemReplacement, subscriptionPurchaseLineItem.deferredItemReplacement) && Intrinsics.areEqual(this.expiryTime, subscriptionPurchaseLineItem.expiryTime) && Intrinsics.areEqual(this.offerDetails, subscriptionPurchaseLineItem.offerDetails) && Intrinsics.areEqual(this.prepaidPlan, subscriptionPurchaseLineItem.prepaidPlan) && Intrinsics.areEqual(this.productId, subscriptionPurchaseLineItem.productId);
    }

    @Nullable
    public final AutoRenewingPlan getAutoRenewingPlan() {
        return this.autoRenewingPlan;
    }

    @Nullable
    public final DeferredItemReplacement getDeferredItemReplacement() {
        return this.deferredItemReplacement;
    }

    @NotNull
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    @Nullable
    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    @Nullable
    public final PrepaidPlan getPrepaidPlan() {
        return this.prepaidPlan;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        AutoRenewingPlan autoRenewingPlan = this.autoRenewingPlan;
        int iHashCode = (autoRenewingPlan == null ? 0 : autoRenewingPlan.hashCode()) * 31;
        DeferredItemReplacement deferredItemReplacement = this.deferredItemReplacement;
        int iHashCode2 = (((iHashCode + (deferredItemReplacement == null ? 0 : deferredItemReplacement.hashCode())) * 31) + this.expiryTime.hashCode()) * 31;
        OfferDetails offerDetails = this.offerDetails;
        int iHashCode3 = (iHashCode2 + (offerDetails == null ? 0 : offerDetails.hashCode())) * 31;
        PrepaidPlan prepaidPlan = this.prepaidPlan;
        return ((iHashCode3 + (prepaidPlan != null ? prepaidPlan.hashCode() : 0)) * 31) + this.productId.hashCode();
    }

    @NotNull
    public String toString() {
        return "SubscriptionPurchaseLineItem(autoRenewingPlan=" + this.autoRenewingPlan + ", deferredItemReplacement=" + this.deferredItemReplacement + ", expiryTime=" + this.expiryTime + ", offerDetails=" + this.offerDetails + ", prepaidPlan=" + this.prepaidPlan + ", productId=" + this.productId + ")";
    }
}
