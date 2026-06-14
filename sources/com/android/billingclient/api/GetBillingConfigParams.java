package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
@zzm
public final class GetBillingConfigParams {

    @zzm
    public static final class Builder {
        private Builder() {
        }

        @NonNull
        public GetBillingConfigParams build() {
            return new GetBillingConfigParams();
        }
    }

    private GetBillingConfigParams() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }
}
