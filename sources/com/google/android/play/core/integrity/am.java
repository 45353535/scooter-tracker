package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: loaded from: classes9.dex */
final class am extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f28653b;

    am() {
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f28652a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        an anVar = null;
        return new ao(str, this.f28653b, anVar, anVar);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f28653b = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f28652a = str;
        return this;
    }
}
