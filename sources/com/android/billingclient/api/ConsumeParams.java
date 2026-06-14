package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ConsumeParams {
    private String zza;

    public static final class Builder {
        private String zza;

        private Builder() {
            throw null;
        }

        @NonNull
        public ConsumeParams build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ConsumeParams consumeParams = new ConsumeParams(null);
            consumeParams.zza = str;
            return consumeParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.zza = str;
            return this;
        }

        /* synthetic */ Builder(zzdd zzddVar) {
        }
    }

    private ConsumeParams() {
        throw null;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getPurchaseToken() {
        return this.zza;
    }

    /* synthetic */ ConsumeParams(zzdd zzddVar) {
    }
}
