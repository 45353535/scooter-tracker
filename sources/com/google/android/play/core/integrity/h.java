package com.google.android.play.core.integrity;

import androidx.annotation.Nullable;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes9.dex */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28727a;

    /* synthetic */ h(String str, g gVar) {
        this.f28727a = str;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    @Nullable
    public final String a() {
        return this.f28727a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        String str = this.f28727a;
        return str == null ? standardIntegrityTokenRequest.a() == null : str.equals(standardIntegrityTokenRequest.a());
    }

    public final int hashCode() {
        String str = this.f28727a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f28727a + "}";
    }
}
