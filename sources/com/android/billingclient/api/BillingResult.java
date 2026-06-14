package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public final class BillingResult {
    private int zza;
    private int zzb;
    private String zzc;

    public static class Builder {
        private int zza;
        private int zzb = 0;
        private String zzc = "";

        private Builder() {
        }

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            billingResult.zzc = this.zzc;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.zzc = str;
            return this;
        }

        @NonNull
        @zzq
        public Builder setOnPurchasesUpdatedSubResponseCode(int i10) {
            this.zzb = i10;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i10) {
            this.zza = i10;
            return this;
        }

        /* synthetic */ Builder(zzdb zzdbVar) {
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getDebugMessage() {
        return this.zzc;
    }

    @zzq
    public int getOnPurchasesUpdatedSubResponseCode() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    @NonNull
    public String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.zzc.zzl(this.zza) + ", Debug Message: " + this.zzc;
    }
}
