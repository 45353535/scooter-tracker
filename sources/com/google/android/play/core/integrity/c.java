package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes9.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f28723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f28724b;

    c() {
    }

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i10) {
        this.f28724b = (byte) (this.f28724b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f28724b == 3) {
            return new e(this.f28723a, 0, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f28724b & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.f28724b & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f28723a = j10;
        this.f28724b = (byte) (this.f28724b | 1);
        return this;
    }
}
