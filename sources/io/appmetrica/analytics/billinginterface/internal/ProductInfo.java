package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class ProductInfo {
    public final boolean autoRenewing;
    public final int introductoryPriceCycles;
    public final long introductoryPriceMicros;

    @Nullable
    public final Period introductoryPricePeriod;

    @NonNull
    public final String priceCurrency;
    public final long priceMicros;

    @NonNull
    public final String purchaseOriginalJson;
    public final long purchaseTime;

    @NonNull
    public final String purchaseToken;
    public final int quantity;

    @NonNull
    public final String signature;

    @NonNull
    public final String sku;

    @Nullable
    public final Period subscriptionPeriod;

    @NonNull
    public final ProductType type;

    public ProductInfo(@NonNull ProductType productType, @NonNull String str, int i10, long j10, @NonNull String str2, long j11, @Nullable Period period, int i11, @Nullable Period period2, @NonNull String str3, @NonNull String str4, long j12, boolean z10, @NonNull String str5) {
        this.type = productType;
        this.sku = str;
        this.quantity = i10;
        this.priceMicros = j10;
        this.priceCurrency = str2;
        this.introductoryPriceMicros = j11;
        this.introductoryPricePeriod = period;
        this.introductoryPriceCycles = i11;
        this.subscriptionPeriod = period2;
        this.signature = str3;
        this.purchaseToken = str4;
        this.purchaseTime = j12;
        this.autoRenewing = z10;
        this.purchaseOriginalJson = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) obj;
        if (this.quantity != productInfo.quantity || this.priceMicros != productInfo.priceMicros || this.introductoryPriceMicros != productInfo.introductoryPriceMicros || this.introductoryPriceCycles != productInfo.introductoryPriceCycles || this.purchaseTime != productInfo.purchaseTime || this.autoRenewing != productInfo.autoRenewing || this.type != productInfo.type || !this.sku.equals(productInfo.sku) || !this.priceCurrency.equals(productInfo.priceCurrency)) {
            return false;
        }
        Period period = this.introductoryPricePeriod;
        if (period == null ? productInfo.introductoryPricePeriod != null : !period.equals(productInfo.introductoryPricePeriod)) {
            return false;
        }
        Period period2 = this.subscriptionPeriod;
        if (period2 == null ? productInfo.subscriptionPeriod != null : !period2.equals(productInfo.subscriptionPeriod)) {
            return false;
        }
        if (this.signature.equals(productInfo.signature) && this.purchaseToken.equals(productInfo.purchaseToken)) {
            return this.purchaseOriginalJson.equals(productInfo.purchaseOriginalJson);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.sku.hashCode() + (this.type.hashCode() * 31)) * 31) + this.quantity) * 31;
        long j10 = this.priceMicros;
        int iHashCode2 = (this.priceCurrency.hashCode() + ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31;
        long j11 = this.introductoryPriceMicros;
        int i10 = (iHashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        Period period = this.introductoryPricePeriod;
        int iHashCode3 = (((i10 + (period != null ? period.hashCode() : 0)) * 31) + this.introductoryPriceCycles) * 31;
        Period period2 = this.subscriptionPeriod;
        int iHashCode4 = (this.purchaseToken.hashCode() + ((this.signature.hashCode() + ((iHashCode3 + (period2 != null ? period2.hashCode() : 0)) * 31)) * 31)) * 31;
        long j12 = this.purchaseTime;
        return this.purchaseOriginalJson.hashCode() + ((((iHashCode4 + ((int) ((j12 >>> 32) ^ j12))) * 31) + (this.autoRenewing ? 1 : 0)) * 31);
    }

    @NonNull
    public String toString() {
        return "ProductInfo{type=" + this.type + ", sku='" + this.sku + "', quantity=" + this.quantity + ", priceMicros=" + this.priceMicros + ", priceCurrency='" + this.priceCurrency + "', introductoryPriceMicros=" + this.introductoryPriceMicros + ", introductoryPricePeriod=" + this.introductoryPricePeriod + ", introductoryPriceCycles=" + this.introductoryPriceCycles + ", subscriptionPeriod=" + this.subscriptionPeriod + ", signature='" + this.signature + "', purchaseToken='" + this.purchaseToken + "', purchaseTime=" + this.purchaseTime + ", autoRenewing=" + this.autoRenewing + ", purchaseOriginalJson='" + this.purchaseOriginalJson + "'}";
    }
}
