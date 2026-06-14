package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f32168e;

    AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j10) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f32164a = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f32165b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f32166c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f32167d = str4;
        this.f32168e = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutAssignment) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            if (this.f32164a.equals(rolloutAssignment.getRolloutId()) && this.f32165b.equals(rolloutAssignment.getParameterKey()) && this.f32166c.equals(rolloutAssignment.getParameterValue()) && this.f32167d.equals(rolloutAssignment.getVariantId()) && this.f32168e == rolloutAssignment.getTemplateVersion()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getParameterKey() {
        return this.f32165b;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getParameterValue() {
        return this.f32166c;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getRolloutId() {
        return this.f32164a;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public long getTemplateVersion() {
        return this.f32168e;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getVariantId() {
        return this.f32167d;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f32164a.hashCode() ^ 1000003) * 1000003) ^ this.f32165b.hashCode()) * 1000003) ^ this.f32166c.hashCode()) * 1000003) ^ this.f32167d.hashCode()) * 1000003;
        long j10 = this.f32168e;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f32164a + ", parameterKey=" + this.f32165b + ", parameterValue=" + this.f32166c + ", variantId=" + this.f32167d + ", templateVersion=" + this.f32168e + "}";
    }
}
