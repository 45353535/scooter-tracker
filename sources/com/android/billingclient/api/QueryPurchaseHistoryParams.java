package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public final class QueryPurchaseHistoryParams {

    public static class Builder {
        private String zza;

        private Builder() {
            throw null;
        }

        @NonNull
        public QueryPurchaseHistoryParams build() {
            if (this.zza != null) {
                return new QueryPurchaseHistoryParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.zza = str;
            return this;
        }

        /* synthetic */ Builder(zzec zzecVar) {
        }
    }

    /* synthetic */ QueryPurchaseHistoryParams(Builder builder, zzec zzecVar) {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }
}
