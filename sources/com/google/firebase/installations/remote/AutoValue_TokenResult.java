package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.TokenResult;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_TokenResult extends TokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TokenResult.ResponseCode f32909c;

    static final class Builder extends TokenResult.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f32911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TokenResult.ResponseCode f32912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f32913d;

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult build() {
            if (this.f32913d == 1) {
                return new AutoValue_TokenResult(this.f32910a, this.f32911b, this.f32912c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setResponseCode(TokenResult.ResponseCode responseCode) {
            this.f32912c = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setToken(String str) {
            this.f32910a = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setTokenExpirationTimestamp(long j10) {
            this.f32911b = j10;
            this.f32913d = (byte) (this.f32913d | 1);
            return this;
        }

        Builder() {
        }

        private Builder(TokenResult tokenResult) {
            this.f32910a = tokenResult.getToken();
            this.f32911b = tokenResult.getTokenExpirationTimestamp();
            this.f32912c = tokenResult.getResponseCode();
            this.f32913d = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        TokenResult.ResponseCode responseCode;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TokenResult) {
            TokenResult tokenResult = (TokenResult) obj;
            String str = this.f32907a;
            if (str != null ? str.equals(tokenResult.getToken()) : tokenResult.getToken() == null) {
                if (this.f32908b == tokenResult.getTokenExpirationTimestamp() && ((responseCode = this.f32909c) != null ? responseCode.equals(tokenResult.getResponseCode()) : tokenResult.getResponseCode() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public TokenResult.ResponseCode getResponseCode() {
        return this.f32909c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public String getToken() {
        return this.f32907a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @NonNull
    public long getTokenExpirationTimestamp() {
        return this.f32908b;
    }

    public int hashCode() {
        String str = this.f32907a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f32908b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f32909c;
        return i10 ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "TokenResult{token=" + this.f32907a + ", tokenExpirationTimestamp=" + this.f32908b + ", responseCode=" + this.f32909c + "}";
    }

    private AutoValue_TokenResult(String str, long j10, TokenResult.ResponseCode responseCode) {
        this.f32907a = str;
        this.f32908b = j10;
        this.f32909c = responseCode;
    }
}
