package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_ExternalPrivacyContext extends ExternalPrivacyContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExternalPRequestContext f24231a;

    static final class Builder extends ExternalPrivacyContext.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ExternalPRequestContext f24232a;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public ExternalPrivacyContext build() {
            return new AutoValue_ExternalPrivacyContext(this.f24232a);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public ExternalPrivacyContext.Builder setPrequest(@Nullable ExternalPRequestContext externalPRequestContext) {
            this.f24232a = externalPRequestContext;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPrivacyContext)) {
            return false;
        }
        ExternalPRequestContext externalPRequestContext = this.f24231a;
        ExternalPRequestContext prequest = ((ExternalPrivacyContext) obj).getPrequest();
        return externalPRequestContext == null ? prequest == null : externalPRequestContext.equals(prequest);
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext
    @Nullable
    public ExternalPRequestContext getPrequest() {
        return this.f24231a;
    }

    public int hashCode() {
        ExternalPRequestContext externalPRequestContext = this.f24231a;
        return (externalPRequestContext == null ? 0 : externalPRequestContext.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f24231a + "}";
    }

    private AutoValue_ExternalPrivacyContext(ExternalPRequestContext externalPRequestContext) {
        this.f24231a = externalPRequestContext;
    }
}
