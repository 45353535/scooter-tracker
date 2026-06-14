package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PersistedInstallation.RegistrationStatus f32877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f32880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f32881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f32882g;

    static final class Builder extends PersistedInstallationEntry.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PersistedInstallation.RegistrationStatus f32884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f32886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f32887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f32888f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f32889g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f32890h;

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry build() {
            if (this.f32890h == 3 && this.f32884b != null) {
                return new AutoValue_PersistedInstallationEntry(this.f32883a, this.f32884b, this.f32885c, this.f32886d, this.f32887e, this.f32888f, this.f32889g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32884b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f32890h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f32890h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setAuthToken(@Nullable String str) {
            this.f32885c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setExpiresInSecs(long j10) {
            this.f32887e = j10;
            this.f32890h = (byte) (this.f32890h | 1);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setFirebaseInstallationId(String str) {
            this.f32883a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setFisError(@Nullable String str) {
            this.f32889g = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setRefreshToken(@Nullable String str) {
            this.f32886d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f32884b = registrationStatus;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j10) {
            this.f32888f = j10;
            this.f32890h = (byte) (this.f32890h | 2);
            return this;
        }

        Builder() {
        }

        private Builder(PersistedInstallationEntry persistedInstallationEntry) {
            this.f32883a = persistedInstallationEntry.getFirebaseInstallationId();
            this.f32884b = persistedInstallationEntry.getRegistrationStatus();
            this.f32885c = persistedInstallationEntry.getAuthToken();
            this.f32886d = persistedInstallationEntry.getRefreshToken();
            this.f32887e = persistedInstallationEntry.getExpiresInSecs();
            this.f32888f = persistedInstallationEntry.getTokenCreationEpochInSecs();
            this.f32889g = persistedInstallationEntry.getFisError();
            this.f32890h = (byte) 3;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PersistedInstallationEntry) {
            PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
            String str4 = this.f32876a;
            if (str4 != null ? str4.equals(persistedInstallationEntry.getFirebaseInstallationId()) : persistedInstallationEntry.getFirebaseInstallationId() == null) {
                if (this.f32877b.equals(persistedInstallationEntry.getRegistrationStatus()) && ((str = this.f32878c) != null ? str.equals(persistedInstallationEntry.getAuthToken()) : persistedInstallationEntry.getAuthToken() == null) && ((str2 = this.f32879d) != null ? str2.equals(persistedInstallationEntry.getRefreshToken()) : persistedInstallationEntry.getRefreshToken() == null) && this.f32880e == persistedInstallationEntry.getExpiresInSecs() && this.f32881f == persistedInstallationEntry.getTokenCreationEpochInSecs() && ((str3 = this.f32882g) != null ? str3.equals(persistedInstallationEntry.getFisError()) : persistedInstallationEntry.getFisError() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getAuthToken() {
        return this.f32878c;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getExpiresInSecs() {
        return this.f32880e;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getFirebaseInstallationId() {
        return this.f32876a;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getFisError() {
        return this.f32882g;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getRefreshToken() {
        return this.f32879d;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @NonNull
    public PersistedInstallation.RegistrationStatus getRegistrationStatus() {
        return this.f32877b;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getTokenCreationEpochInSecs() {
        return this.f32881f;
    }

    public int hashCode() {
        String str = this.f32876a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f32877b.hashCode()) * 1000003;
        String str2 = this.f32878c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f32879d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f32880e;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f32881f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f32882g;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public PersistedInstallationEntry.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f32876a + ", registrationStatus=" + this.f32877b + ", authToken=" + this.f32878c + ", refreshToken=" + this.f32879d + ", expiresInSecs=" + this.f32880e + ", tokenCreationEpochInSecs=" + this.f32881f + ", fisError=" + this.f32882g + "}";
    }

    private AutoValue_PersistedInstallationEntry(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j10, long j11, String str4) {
        this.f32876a = str;
        this.f32877b = registrationStatus;
        this.f32878c = str2;
        this.f32879d = str3;
        this.f32880e = j10;
        this.f32881f = j11;
        this.f32882g = str4;
    }
}
