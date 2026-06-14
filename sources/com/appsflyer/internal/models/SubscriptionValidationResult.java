package com.appsflyer.internal.models;

import com.appsflyer.internal.models.SubscriptionPurchase;
import com.appsflyer.internal.models.ValidationFailureData;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionValidationResult;", "", "success", "", "subscriptionPurchase", "Lcom/appsflyer/internal/models/SubscriptionPurchase;", "failureData", "Lcom/appsflyer/internal/models/ValidationFailureData;", "(ZLcom/appsflyer/internal/models/SubscriptionPurchase;Lcom/appsflyer/internal/models/ValidationFailureData;)V", "getFailureData", "()Lcom/appsflyer/internal/models/ValidationFailureData;", "getSubscriptionPurchase", "()Lcom/appsflyer/internal/models/SubscriptionPurchase;", "getSuccess", "()Z", "component1", "component2", "component3", MenuActionType.COPY, "equals", "other", "hashCode", "", "toString", "", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SubscriptionValidationResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final ValidationFailureData failureData;

    @Nullable
    private final SubscriptionPurchase subscriptionPurchase;
    private final boolean success;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionValidationResult$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscriptionValidationResult;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<SubscriptionValidationResult> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public SubscriptionValidationResult fromJson(@NotNull JSONObject json) throws JSONException {
            SubscriptionPurchase subscriptionPurchaseFromJson;
            Intrinsics.checkNotNullParameter(json, "json");
            boolean zOptBoolean = json.optBoolean("result");
            ValidationFailureData validationFailureDataFromJson = null;
            if (json.has("subscription_purchase")) {
                SubscriptionPurchase.Companion companion = SubscriptionPurchase.INSTANCE;
                JSONObject jSONObject = json.getJSONObject("subscription_purchase");
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(\"subscription_purchase\")");
                subscriptionPurchaseFromJson = companion.fromJson(jSONObject);
            } else {
                subscriptionPurchaseFromJson = null;
            }
            if (json.has("failure_data")) {
                ValidationFailureData.Companion companion2 = ValidationFailureData.INSTANCE;
                JSONObject jSONObject2 = json.getJSONObject("failure_data");
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(\"failure_data\")");
                validationFailureDataFromJson = companion2.fromJson(jSONObject2);
            }
            return new SubscriptionValidationResult(zOptBoolean, subscriptionPurchaseFromJson, validationFailureDataFromJson);
        }
    }

    public SubscriptionValidationResult(boolean z10, @Nullable SubscriptionPurchase subscriptionPurchase, @Nullable ValidationFailureData validationFailureData) {
        this.success = z10;
        this.subscriptionPurchase = subscriptionPurchase;
        this.failureData = validationFailureData;
    }

    public static /* synthetic */ SubscriptionValidationResult copy$default(SubscriptionValidationResult subscriptionValidationResult, boolean z10, SubscriptionPurchase subscriptionPurchase, ValidationFailureData validationFailureData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = subscriptionValidationResult.success;
        }
        if ((i10 & 2) != 0) {
            subscriptionPurchase = subscriptionValidationResult.subscriptionPurchase;
        }
        if ((i10 & 4) != 0) {
            validationFailureData = subscriptionValidationResult.failureData;
        }
        return subscriptionValidationResult.copy(z10, subscriptionPurchase, validationFailureData);
    }

    @NotNull
    public static SubscriptionValidationResult fromJson(@NotNull JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SubscriptionPurchase getSubscriptionPurchase() {
        return this.subscriptionPurchase;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ValidationFailureData getFailureData() {
        return this.failureData;
    }

    @NotNull
    public final SubscriptionValidationResult copy(boolean success, @Nullable SubscriptionPurchase subscriptionPurchase, @Nullable ValidationFailureData failureData) {
        return new SubscriptionValidationResult(success, subscriptionPurchase, failureData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionValidationResult)) {
            return false;
        }
        SubscriptionValidationResult subscriptionValidationResult = (SubscriptionValidationResult) other;
        return this.success == subscriptionValidationResult.success && Intrinsics.areEqual(this.subscriptionPurchase, subscriptionValidationResult.subscriptionPurchase) && Intrinsics.areEqual(this.failureData, subscriptionValidationResult.failureData);
    }

    @Nullable
    public final ValidationFailureData getFailureData() {
        return this.failureData;
    }

    @Nullable
    public final SubscriptionPurchase getSubscriptionPurchase() {
        return this.subscriptionPurchase;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.success;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        SubscriptionPurchase subscriptionPurchase = this.subscriptionPurchase;
        int iHashCode = (i10 + (subscriptionPurchase == null ? 0 : subscriptionPurchase.hashCode())) * 31;
        ValidationFailureData validationFailureData = this.failureData;
        return iHashCode + (validationFailureData != null ? validationFailureData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubscriptionValidationResult(success=" + this.success + ", subscriptionPurchase=" + this.subscriptionPurchase + ", failureData=" + this.failureData + ")";
    }
}
