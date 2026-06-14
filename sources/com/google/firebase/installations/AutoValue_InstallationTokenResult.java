package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.installations.InstallationTokenResult;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32833c;

    static final class Builder extends InstallationTokenResult.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f32835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f32836c;

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult build() {
            String str = "";
            if (this.f32834a == null) {
                str = " token";
            }
            if (this.f32835b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f32836c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_InstallationTokenResult(this.f32834a, this.f32835b.longValue(), this.f32836c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setToken(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f32834a = str;
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenCreationTimestamp(long j10) {
            this.f32836c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenExpirationTimestamp(long j10) {
            this.f32835b = Long.valueOf(j10);
            return this;
        }

        Builder() {
        }

        private Builder(InstallationTokenResult installationTokenResult) {
            this.f32834a = installationTokenResult.getToken();
            this.f32835b = Long.valueOf(installationTokenResult.getTokenExpirationTimestamp());
            this.f32836c = Long.valueOf(installationTokenResult.getTokenCreationTimestamp());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallationTokenResult) {
            InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
            if (this.f32831a.equals(installationTokenResult.getToken()) && this.f32832b == installationTokenResult.getTokenExpirationTimestamp() && this.f32833c == installationTokenResult.getTokenCreationTimestamp()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public String getToken() {
        return this.f32831a;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public long getTokenCreationTimestamp() {
        return this.f32833c;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public long getTokenExpirationTimestamp() {
        return this.f32832b;
    }

    public int hashCode() {
        int iHashCode = (this.f32831a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f32832b;
        long j11 = this.f32833c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public InstallationTokenResult.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f32831a + ", tokenExpirationTimestamp=" + this.f32832b + ", tokenCreationTimestamp=" + this.f32833c + "}";
    }

    private AutoValue_InstallationTokenResult(String str, long j10, long j11) {
        this.f32831a = str;
        this.f32832b = j10;
        this.f32833c = j11;
    }
}
