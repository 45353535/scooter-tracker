package com.google.firebase;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_StartupTime extends StartupTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f31674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f31676c;

    AutoValue_StartupTime(long j10, long j11, long j12) {
        this.f31674a = j10;
        this.f31675b = j11;
        this.f31676c = j12;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StartupTime) {
            StartupTime startupTime = (StartupTime) obj;
            if (this.f31674a == startupTime.getEpochMillis() && this.f31675b == startupTime.getElapsedRealtime() && this.f31676c == startupTime.getUptimeMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.StartupTime
    public long getElapsedRealtime() {
        return this.f31675b;
    }

    @Override // com.google.firebase.StartupTime
    public long getEpochMillis() {
        return this.f31674a;
    }

    @Override // com.google.firebase.StartupTime
    public long getUptimeMillis() {
        return this.f31676c;
    }

    public int hashCode() {
        long j10 = this.f31674a;
        long j11 = this.f31675b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f31676c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f31674a + ", elapsedRealtime=" + this.f31675b + ", uptimeMillis=" + this.f31676c + "}";
    }
}
