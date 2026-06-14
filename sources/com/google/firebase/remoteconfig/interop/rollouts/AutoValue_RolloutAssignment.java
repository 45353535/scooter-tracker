package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f33172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f33173e;

    static final class Builder extends RolloutAssignment.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f33174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f33175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f33176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f33177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f33178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f33179f;

        Builder() {
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment build() {
            if (this.f33179f == 1 && this.f33174a != null && this.f33175b != null && this.f33176c != null && this.f33177d != null) {
                return new AutoValue_RolloutAssignment(this.f33174a, this.f33175b, this.f33176c, this.f33177d, this.f33178e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f33174a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f33175b == null) {
                sb2.append(" variantId");
            }
            if (this.f33176c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f33177d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f33179f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setParameterKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f33176c = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setParameterValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f33177d = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setRolloutId(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f33174a = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setTemplateVersion(long j10) {
            this.f33178e = j10;
            this.f33179f = (byte) (this.f33179f | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setVariantId(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f33175b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutAssignment) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            if (this.f33169a.equals(rolloutAssignment.getRolloutId()) && this.f33170b.equals(rolloutAssignment.getVariantId()) && this.f33171c.equals(rolloutAssignment.getParameterKey()) && this.f33172d.equals(rolloutAssignment.getParameterValue()) && this.f33173e == rolloutAssignment.getTemplateVersion()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public String getParameterKey() {
        return this.f33171c;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public String getParameterValue() {
        return this.f33172d;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public String getRolloutId() {
        return this.f33169a;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public long getTemplateVersion() {
        return this.f33173e;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public String getVariantId() {
        return this.f33170b;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f33169a.hashCode() ^ 1000003) * 1000003) ^ this.f33170b.hashCode()) * 1000003) ^ this.f33171c.hashCode()) * 1000003) ^ this.f33172d.hashCode()) * 1000003;
        long j10 = this.f33173e;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f33169a + ", variantId=" + this.f33170b + ", parameterKey=" + this.f33171c + ", parameterValue=" + this.f33172d + ", templateVersion=" + this.f33173e + "}";
    }

    private AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j10) {
        this.f33169a = str;
        this.f33170b = str2;
        this.f33171c = str3;
        this.f33172d = str4;
        this.f33173e = j10;
    }
}
