package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32806c;

    AutoValue_SdkHeartBeatResult(String str, long j10) {
        if (str == null) {
            throw new NullPointerException("Null sdkName");
        }
        this.f32805b = str;
        this.f32806c = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SdkHeartBeatResult) {
            SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
            if (this.f32805b.equals(sdkHeartBeatResult.getSdkName()) && this.f32806c == sdkHeartBeatResult.getMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long getMillis() {
        return this.f32806c;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public String getSdkName() {
        return this.f32805b;
    }

    public int hashCode() {
        int iHashCode = (this.f32805b.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f32806c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.f32805b + ", millis=" + this.f32806c + "}";
    }
}
