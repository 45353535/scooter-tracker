package com.appsflyer.api.models;

import androidx.collection.b;
import com.appsflyer.api.AFSerializable;
import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0014\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f0\"H\u0016J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lcom/appsflyer/api/models/PricingPhases;", "Lcom/appsflyer/api/AFSerializable;", "billingCycleCount", "", "billingPeriod", "", "formattedPrice", "priceAmountMicros", "", "priceCurrencyCode", "recurrenceMode", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;I)V", "getBillingCycleCount", "()I", "getBillingPeriod", "()Ljava/lang/String;", "getFormattedPrice", "getPriceAmountMicros", "()J", "getPriceCurrencyCode", "getRecurrenceMode", "component1", "component2", "component3", "component4", "component5", "component6", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "toJsonMap", "", "toString", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PricingPhases implements AFSerializable {
    private final int billingCycleCount;

    @NotNull
    private final String billingPeriod;

    @NotNull
    private final String formattedPrice;
    private final long priceAmountMicros;

    @NotNull
    private final String priceCurrencyCode;
    private final int recurrenceMode;

    public PricingPhases(int i10, @NotNull String billingPeriod, @NotNull String formattedPrice, long j10, @NotNull String priceCurrencyCode, int i11) {
        Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        this.billingCycleCount = i10;
        this.billingPeriod = billingPeriod;
        this.formattedPrice = formattedPrice;
        this.priceAmountMicros = j10;
        this.priceCurrencyCode = priceCurrencyCode;
        this.recurrenceMode = i11;
    }

    public static /* synthetic */ PricingPhases copy$default(PricingPhases pricingPhases, int i10, String str, String str2, long j10, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = pricingPhases.billingCycleCount;
        }
        if ((i12 & 2) != 0) {
            str = pricingPhases.billingPeriod;
        }
        if ((i12 & 4) != 0) {
            str2 = pricingPhases.formattedPrice;
        }
        if ((i12 & 8) != 0) {
            j10 = pricingPhases.priceAmountMicros;
        }
        if ((i12 & 16) != 0) {
            str3 = pricingPhases.priceCurrencyCode;
        }
        if ((i12 & 32) != 0) {
            i11 = pricingPhases.recurrenceMode;
        }
        long j11 = j10;
        String str4 = str2;
        return pricingPhases.copy(i10, str, str4, j11, str3, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBillingCycleCount() {
        return this.billingCycleCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRecurrenceMode() {
        return this.recurrenceMode;
    }

    @NotNull
    public final PricingPhases copy(int billingCycleCount, @NotNull String billingPeriod, @NotNull String formattedPrice, long priceAmountMicros, @NotNull String priceCurrencyCode, int recurrenceMode) {
        Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        return new PricingPhases(billingCycleCount, billingPeriod, formattedPrice, priceAmountMicros, priceCurrencyCode, recurrenceMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PricingPhases)) {
            return false;
        }
        PricingPhases pricingPhases = (PricingPhases) other;
        return this.billingCycleCount == pricingPhases.billingCycleCount && Intrinsics.areEqual(this.billingPeriod, pricingPhases.billingPeriod) && Intrinsics.areEqual(this.formattedPrice, pricingPhases.formattedPrice) && this.priceAmountMicros == pricingPhases.priceAmountMicros && Intrinsics.areEqual(this.priceCurrencyCode, pricingPhases.priceCurrencyCode) && this.recurrenceMode == pricingPhases.recurrenceMode;
    }

    public final int getBillingCycleCount() {
        return this.billingCycleCount;
    }

    @NotNull
    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    @NotNull
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    @NotNull
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final int getRecurrenceMode() {
        return this.recurrenceMode;
    }

    public int hashCode() {
        return (((((((((this.billingCycleCount * 31) + this.billingPeriod.hashCode()) * 31) + this.formattedPrice.hashCode()) * 31) + b.a(this.priceAmountMicros)) * 31) + this.priceCurrencyCode.hashCode()) * 31) + this.recurrenceMode;
    }

    @Override // com.appsflyer.api.AFSerializable
    @NotNull
    public Map<String, Object> toJsonMap() {
        return MapsKt.mutableMapOf(TuplesKt.to("billing_cycle_count", Integer.valueOf(this.billingCycleCount)), TuplesKt.to("billing_period", this.billingPeriod), TuplesKt.to("formatted_price", this.formattedPrice), TuplesKt.to("price_amount_micros", Long.valueOf(this.priceAmountMicros)), TuplesKt.to("price_currency_code", this.priceCurrencyCode), TuplesKt.to("recurrence_mode", Integer.valueOf(this.recurrenceMode)));
    }

    @NotNull
    public String toString() {
        return "PricingPhases(billingCycleCount=" + this.billingCycleCount + ", billingPeriod=" + this.billingPeriod + ", formattedPrice=" + this.formattedPrice + ", priceAmountMicros=" + this.priceAmountMicros + ", priceCurrencyCode=" + this.priceCurrencyCode + ", recurrenceMode=" + this.recurrenceMode + ")";
    }
}
