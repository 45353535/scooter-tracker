package com.appsflyer.internal.models;

import com.google.firebase.analytics.FirebaseAnalytics;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00017Bw\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0006HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017¨\u00068"}, d2 = {"Lcom/appsflyer/internal/models/ProductPurchase;", "", "kind", "", "purchaseTimeMillis", "purchaseState", "", "consumptionState", "developerPayload", "orderId", "purchaseType", "acknowledgementState", "purchaseToken", InAppPurchaseMetaData.KEY_PRODUCT_ID, FirebaseAnalytics.Param.QUANTITY, "obfuscatedExternalAccountId", "obfuscatedExternalProfileId", "regionCode", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcknowledgementState", "()I", "getConsumptionState", "getDeveloperPayload", "()Ljava/lang/String;", "getKind", "getObfuscatedExternalAccountId", "getObfuscatedExternalProfileId", "getOrderId", "getProductId", "getPurchaseState", "getPurchaseTimeMillis", "getPurchaseToken", "getPurchaseType", "getQuantity", "getRegionCode", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ProductPurchase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int acknowledgementState;
    private final int consumptionState;

    @NotNull
    private final String developerPayload;

    @NotNull
    private final String kind;

    @NotNull
    private final String obfuscatedExternalAccountId;

    @NotNull
    private final String obfuscatedExternalProfileId;

    @NotNull
    private final String orderId;

    @NotNull
    private final String productId;
    private final int purchaseState;

    @NotNull
    private final String purchaseTimeMillis;

    @NotNull
    private final String purchaseToken;
    private final int purchaseType;
    private final int quantity;

    @NotNull
    private final String regionCode;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/ProductPurchase$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/ProductPurchase;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<ProductPurchase> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public ProductPurchase fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String kind = json.optString("kind");
            String purchaseTimeMillis = json.optString("purchaseTimeMillis");
            int iOptInt = json.optInt("purchaseState", -1);
            int iOptInt2 = json.optInt("consumptionState", -1);
            String developerPayload = json.optString("developerPayload");
            String orderId = json.optString("orderId");
            int iOptInt3 = json.optInt("purchaseType", -1);
            int iOptInt4 = json.optInt("acknowledgementState", -1);
            String purchaseToken = json.optString("purchaseToken");
            String productId = json.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            int iOptInt5 = json.optInt(FirebaseAnalytics.Param.QUANTITY, -1);
            String obfuscatedExternalAccountId = json.optString("obfuscatedExternalAccountId");
            String obfuscatedExternalProfileId = json.optString("obfuscatedExternalProfileId");
            String regionCode = json.optString("regionCode");
            Intrinsics.checkNotNullExpressionValue(kind, "kind");
            Intrinsics.checkNotNullExpressionValue(purchaseTimeMillis, "purchaseTimeMillis");
            Intrinsics.checkNotNullExpressionValue(developerPayload, "developerPayload");
            Intrinsics.checkNotNullExpressionValue(orderId, "orderId");
            Intrinsics.checkNotNullExpressionValue(purchaseToken, "purchaseToken");
            Intrinsics.checkNotNullExpressionValue(productId, "productId");
            Intrinsics.checkNotNullExpressionValue(obfuscatedExternalAccountId, "obfuscatedExternalAccountId");
            Intrinsics.checkNotNullExpressionValue(obfuscatedExternalProfileId, "obfuscatedExternalProfileId");
            Intrinsics.checkNotNullExpressionValue(regionCode, "regionCode");
            return new ProductPurchase(kind, purchaseTimeMillis, iOptInt, iOptInt2, developerPayload, orderId, iOptInt3, iOptInt4, purchaseToken, productId, iOptInt5, obfuscatedExternalAccountId, obfuscatedExternalProfileId, regionCode);
        }
    }

    public ProductPurchase(@NotNull String kind, @NotNull String purchaseTimeMillis, int i10, int i11, @NotNull String developerPayload, @NotNull String orderId, int i12, int i13, @NotNull String purchaseToken, @NotNull String productId, int i14, @NotNull String obfuscatedExternalAccountId, @NotNull String obfuscatedExternalProfileId, @NotNull String regionCode) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(purchaseTimeMillis, "purchaseTimeMillis");
        Intrinsics.checkNotNullParameter(developerPayload, "developerPayload");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(obfuscatedExternalAccountId, "obfuscatedExternalAccountId");
        Intrinsics.checkNotNullParameter(obfuscatedExternalProfileId, "obfuscatedExternalProfileId");
        Intrinsics.checkNotNullParameter(regionCode, "regionCode");
        this.kind = kind;
        this.purchaseTimeMillis = purchaseTimeMillis;
        this.purchaseState = i10;
        this.consumptionState = i11;
        this.developerPayload = developerPayload;
        this.orderId = orderId;
        this.purchaseType = i12;
        this.acknowledgementState = i13;
        this.purchaseToken = purchaseToken;
        this.productId = productId;
        this.quantity = i14;
        this.obfuscatedExternalAccountId = obfuscatedExternalAccountId;
        this.obfuscatedExternalProfileId = obfuscatedExternalProfileId;
        this.regionCode = regionCode;
    }

    @NotNull
    public static ProductPurchase fromJson(@NotNull JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getObfuscatedExternalAccountId() {
        return this.obfuscatedExternalAccountId;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getObfuscatedExternalProfileId() {
        return this.obfuscatedExternalProfileId;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRegionCode() {
        return this.regionCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPurchaseTimeMillis() {
        return this.purchaseTimeMillis;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPurchaseState() {
        return this.purchaseState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getConsumptionState() {
        return this.consumptionState;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPurchaseType() {
        return this.purchaseType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getAcknowledgementState() {
        return this.acknowledgementState;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    public final ProductPurchase copy(@NotNull String kind, @NotNull String purchaseTimeMillis, int purchaseState, int consumptionState, @NotNull String developerPayload, @NotNull String orderId, int purchaseType, int acknowledgementState, @NotNull String purchaseToken, @NotNull String productId, int quantity, @NotNull String obfuscatedExternalAccountId, @NotNull String obfuscatedExternalProfileId, @NotNull String regionCode) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(purchaseTimeMillis, "purchaseTimeMillis");
        Intrinsics.checkNotNullParameter(developerPayload, "developerPayload");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(obfuscatedExternalAccountId, "obfuscatedExternalAccountId");
        Intrinsics.checkNotNullParameter(obfuscatedExternalProfileId, "obfuscatedExternalProfileId");
        Intrinsics.checkNotNullParameter(regionCode, "regionCode");
        return new ProductPurchase(kind, purchaseTimeMillis, purchaseState, consumptionState, developerPayload, orderId, purchaseType, acknowledgementState, purchaseToken, productId, quantity, obfuscatedExternalAccountId, obfuscatedExternalProfileId, regionCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductPurchase)) {
            return false;
        }
        ProductPurchase productPurchase = (ProductPurchase) other;
        return Intrinsics.areEqual(this.kind, productPurchase.kind) && Intrinsics.areEqual(this.purchaseTimeMillis, productPurchase.purchaseTimeMillis) && this.purchaseState == productPurchase.purchaseState && this.consumptionState == productPurchase.consumptionState && Intrinsics.areEqual(this.developerPayload, productPurchase.developerPayload) && Intrinsics.areEqual(this.orderId, productPurchase.orderId) && this.purchaseType == productPurchase.purchaseType && this.acknowledgementState == productPurchase.acknowledgementState && Intrinsics.areEqual(this.purchaseToken, productPurchase.purchaseToken) && Intrinsics.areEqual(this.productId, productPurchase.productId) && this.quantity == productPurchase.quantity && Intrinsics.areEqual(this.obfuscatedExternalAccountId, productPurchase.obfuscatedExternalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalProfileId, productPurchase.obfuscatedExternalProfileId) && Intrinsics.areEqual(this.regionCode, productPurchase.regionCode);
    }

    public final int getAcknowledgementState() {
        return this.acknowledgementState;
    }

    public final int getConsumptionState() {
        return this.consumptionState;
    }

    @NotNull
    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    @NotNull
    public final String getKind() {
        return this.kind;
    }

    @NotNull
    public final String getObfuscatedExternalAccountId() {
        return this.obfuscatedExternalAccountId;
    }

    @NotNull
    public final String getObfuscatedExternalProfileId() {
        return this.obfuscatedExternalProfileId;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final int getPurchaseState() {
        return this.purchaseState;
    }

    @NotNull
    public final String getPurchaseTimeMillis() {
        return this.purchaseTimeMillis;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final int getPurchaseType() {
        return this.purchaseType;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getRegionCode() {
        return this.regionCode;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.kind.hashCode() * 31) + this.purchaseTimeMillis.hashCode()) * 31) + this.purchaseState) * 31) + this.consumptionState) * 31) + this.developerPayload.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.purchaseType) * 31) + this.acknowledgementState) * 31) + this.purchaseToken.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.quantity) * 31) + this.obfuscatedExternalAccountId.hashCode()) * 31) + this.obfuscatedExternalProfileId.hashCode()) * 31) + this.regionCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "ProductPurchase(kind=" + this.kind + ", purchaseTimeMillis=" + this.purchaseTimeMillis + ", purchaseState=" + this.purchaseState + ", consumptionState=" + this.consumptionState + ", developerPayload=" + this.developerPayload + ", orderId=" + this.orderId + ", purchaseType=" + this.purchaseType + ", acknowledgementState=" + this.acknowledgementState + ", purchaseToken=" + this.purchaseToken + ", productId=" + this.productId + ", quantity=" + this.quantity + ", obfuscatedExternalAccountId=" + this.obfuscatedExternalAccountId + ", obfuscatedExternalProfileId=" + this.obfuscatedExternalProfileId + ", regionCode=" + this.regionCode + ")";
    }
}
