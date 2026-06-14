package com.appsflyer.internal.models;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/appsflyer/internal/models/AutoRenewingPlan;", "", "autoRenewEnabled", "", "priceChangeDetails", "Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;", "(Ljava/lang/Boolean;Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;)V", "getAutoRenewEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPriceChangeDetails", "()Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;", "component1", "component2", MenuActionType.COPY, "(Ljava/lang/Boolean;Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;)Lcom/appsflyer/internal/models/AutoRenewingPlan;", "equals", "other", "hashCode", "", "toString", "", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AutoRenewingPlan {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Boolean autoRenewEnabled;

    @Nullable
    private final SubscriptionItemPriceChangeDetails priceChangeDetails;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/AutoRenewingPlan$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/AutoRenewingPlan;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<AutoRenewingPlan> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public AutoRenewingPlan fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new AutoRenewingPlan((Boolean) SubscriptionPurchaseKt.getNullable(json, "autoRenewEnabled"), (SubscriptionItemPriceChangeDetails) SubscriptionPurchaseKt.toObject(json, "priceChangeDetails", SubscriptionItemPriceChangeDetails.INSTANCE));
        }
    }

    public AutoRenewingPlan(@Nullable Boolean bool, @Nullable SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails) {
        this.autoRenewEnabled = bool;
        this.priceChangeDetails = subscriptionItemPriceChangeDetails;
    }

    public static /* synthetic */ AutoRenewingPlan copy$default(AutoRenewingPlan autoRenewingPlan, Boolean bool, SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = autoRenewingPlan.autoRenewEnabled;
        }
        if ((i10 & 2) != 0) {
            subscriptionItemPriceChangeDetails = autoRenewingPlan.priceChangeDetails;
        }
        return autoRenewingPlan.copy(bool, subscriptionItemPriceChangeDetails);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAutoRenewEnabled() {
        return this.autoRenewEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SubscriptionItemPriceChangeDetails getPriceChangeDetails() {
        return this.priceChangeDetails;
    }

    @NotNull
    public final AutoRenewingPlan copy(@Nullable Boolean autoRenewEnabled, @Nullable SubscriptionItemPriceChangeDetails priceChangeDetails) {
        return new AutoRenewingPlan(autoRenewEnabled, priceChangeDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoRenewingPlan)) {
            return false;
        }
        AutoRenewingPlan autoRenewingPlan = (AutoRenewingPlan) other;
        return Intrinsics.areEqual(this.autoRenewEnabled, autoRenewingPlan.autoRenewEnabled) && Intrinsics.areEqual(this.priceChangeDetails, autoRenewingPlan.priceChangeDetails);
    }

    @Nullable
    public final Boolean getAutoRenewEnabled() {
        return this.autoRenewEnabled;
    }

    @Nullable
    public final SubscriptionItemPriceChangeDetails getPriceChangeDetails() {
        return this.priceChangeDetails;
    }

    public int hashCode() {
        Boolean bool = this.autoRenewEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails = this.priceChangeDetails;
        return iHashCode + (subscriptionItemPriceChangeDetails != null ? subscriptionItemPriceChangeDetails.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AutoRenewingPlan(autoRenewEnabled=" + this.autoRenewEnabled + ", priceChangeDetails=" + this.priceChangeDetails + ")";
    }
}
