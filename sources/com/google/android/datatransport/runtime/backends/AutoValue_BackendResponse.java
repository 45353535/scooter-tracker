package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_BackendResponse extends BackendResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BackendResponse.Status f24384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24385b;

    AutoValue_BackendResponse(BackendResponse.Status status, long j10) {
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.f24384a = status;
        this.f24385b = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackendResponse) {
            BackendResponse backendResponse = (BackendResponse) obj;
            if (this.f24384a.equals(backendResponse.getStatus()) && this.f24385b == backendResponse.getNextRequestWaitMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long getNextRequestWaitMillis() {
        return this.f24385b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status getStatus() {
        return this.f24384a;
    }

    public int hashCode() {
        int iHashCode = (this.f24384a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f24385b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f24384a + ", nextRequestWaitMillis=" + this.f24385b + "}";
    }
}
