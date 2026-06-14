package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public final class QueryPurchasesParams {
    private final String zza;
    private final boolean zzb;

    public static class Builder {
        private String zza;
        private boolean zzb = false;

        private Builder() {
        }

        @NonNull
        public QueryPurchasesParams build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Product type must be set");
            }
            if (!this.zzb || str.equals("subs")) {
                return new QueryPurchasesParams(this, null);
            }
            throw new IllegalArgumentException("includeSuspendedSubscriptions is only supported for subscription purchases");
        }

        @NonNull
        public Builder includeSuspendedSubscriptions(boolean z10) {
            this.zzb = z10;
            return this;
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.zza = str;
            return this;
        }

        /* synthetic */ Builder(zzed zzedVar) {
        }
    }

    /* synthetic */ QueryPurchasesParams(Builder builder, zzed zzedVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean getIncludeSuspendedSubscriptions() {
        return this.zzb;
    }

    @NonNull
    public final String zza() {
        return this.zza;
    }
}
