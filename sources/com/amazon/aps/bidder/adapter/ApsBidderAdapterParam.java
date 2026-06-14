package com.amazon.aps.bidder.adapter;

/* JADX INFO: loaded from: classes5.dex */
public class ApsBidderAdapterParam {
    private final String accountId;

    public static class Builder {
        private String accountId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public ApsBidderAdapterParam build() {
            return new ApsBidderAdapterParam(this);
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAccountId() {
        return this.accountId;
    }

    private ApsBidderAdapterParam(Builder builder) {
        this.accountId = builder.accountId;
    }
}
