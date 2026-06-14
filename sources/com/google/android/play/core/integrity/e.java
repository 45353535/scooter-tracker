package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes9.dex */
final class e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f28725a;

    /* synthetic */ e(long j10, int i10, d dVar) {
        this.f28725a = j10;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    final int a() {
        return 0;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final long b() {
        return this.f28725a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) {
            StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
            if (this.f28725a == prepareIntegrityTokenRequest.b()) {
                prepareIntegrityTokenRequest.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f28725a;
        return (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f28725a + ", webViewRequestMode=0}";
    }
}
