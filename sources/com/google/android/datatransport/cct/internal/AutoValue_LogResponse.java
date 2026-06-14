package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_LogResponse extends LogResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24265a;

    AutoValue_LogResponse(long j10) {
        this.f24265a = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LogResponse) && this.f24265a == ((LogResponse) obj).getNextRequestWaitMillis();
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public long getNextRequestWaitMillis() {
        return this.f24265a;
    }

    public int hashCode() {
        long j10 = this.f24265a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f24265a + "}";
    }
}
