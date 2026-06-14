package com.google.firebase.installations.remote;

import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.InstallationResponse;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_InstallationResponse extends InstallationResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TokenResult f32900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InstallationResponse.ResponseCode f32901e;

    static final class Builder extends InstallationResponse.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private TokenResult f32905d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private InstallationResponse.ResponseCode f32906e;

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse build() {
            return new AutoValue_InstallationResponse(this.f32902a, this.f32903b, this.f32904c, this.f32905d, this.f32906e);
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setAuthToken(TokenResult tokenResult) {
            this.f32905d = tokenResult;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setFid(String str) {
            this.f32903b = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setRefreshToken(String str) {
            this.f32904c = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setResponseCode(InstallationResponse.ResponseCode responseCode) {
            this.f32906e = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setUri(String str) {
            this.f32902a = str;
            return this;
        }

        Builder() {
        }

        private Builder(InstallationResponse installationResponse) {
            this.f32902a = installationResponse.getUri();
            this.f32903b = installationResponse.getFid();
            this.f32904c = installationResponse.getRefreshToken();
            this.f32905d = installationResponse.getAuthToken();
            this.f32906e = installationResponse.getResponseCode();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallationResponse) {
            InstallationResponse installationResponse = (InstallationResponse) obj;
            String str = this.f32897a;
            if (str != null ? str.equals(installationResponse.getUri()) : installationResponse.getUri() == null) {
                String str2 = this.f32898b;
                if (str2 != null ? str2.equals(installationResponse.getFid()) : installationResponse.getFid() == null) {
                    String str3 = this.f32899c;
                    if (str3 != null ? str3.equals(installationResponse.getRefreshToken()) : installationResponse.getRefreshToken() == null) {
                        TokenResult tokenResult = this.f32900d;
                        if (tokenResult != null ? tokenResult.equals(installationResponse.getAuthToken()) : installationResponse.getAuthToken() == null) {
                            InstallationResponse.ResponseCode responseCode = this.f32901e;
                            if (responseCode != null ? responseCode.equals(installationResponse.getResponseCode()) : installationResponse.getResponseCode() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public TokenResult getAuthToken() {
        return this.f32900d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public String getFid() {
        return this.f32898b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public String getRefreshToken() {
        return this.f32899c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public InstallationResponse.ResponseCode getResponseCode() {
        return this.f32901e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public String getUri() {
        return this.f32897a;
    }

    public int hashCode() {
        String str = this.f32897a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f32898b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f32899c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f32900d;
        int iHashCode4 = (iHashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f32901e;
        return iHashCode4 ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public InstallationResponse.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f32897a + ", fid=" + this.f32898b + ", refreshToken=" + this.f32899c + ", authToken=" + this.f32900d + ", responseCode=" + this.f32901e + "}";
    }

    private AutoValue_InstallationResponse(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f32897a = str;
        this.f32898b = str2;
        this.f32899c = str3;
        this.f32900d = tokenResult;
        this.f32901e = responseCode;
    }
}
