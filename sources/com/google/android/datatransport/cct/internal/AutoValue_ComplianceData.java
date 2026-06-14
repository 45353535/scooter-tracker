package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ComplianceData;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_ComplianceData extends ComplianceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExternalPrivacyContext f24221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComplianceData.ProductIdOrigin f24222b;

    static final class Builder extends ComplianceData.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ExternalPrivacyContext f24223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ComplianceData.ProductIdOrigin f24224b;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public ComplianceData build() {
            return new AutoValue_ComplianceData(this.f24223a, this.f24224b);
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public ComplianceData.Builder setPrivacyContext(@Nullable ExternalPrivacyContext externalPrivacyContext) {
            this.f24223a = externalPrivacyContext;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public ComplianceData.Builder setProductIdOrigin(@Nullable ComplianceData.ProductIdOrigin productIdOrigin) {
            this.f24224b = productIdOrigin;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComplianceData) {
            ComplianceData complianceData = (ComplianceData) obj;
            ExternalPrivacyContext externalPrivacyContext = this.f24221a;
            if (externalPrivacyContext != null ? externalPrivacyContext.equals(complianceData.getPrivacyContext()) : complianceData.getPrivacyContext() == null) {
                ComplianceData.ProductIdOrigin productIdOrigin = this.f24222b;
                if (productIdOrigin != null ? productIdOrigin.equals(complianceData.getProductIdOrigin()) : complianceData.getProductIdOrigin() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    @Nullable
    public ExternalPrivacyContext getPrivacyContext() {
        return this.f24221a;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    @Nullable
    public ComplianceData.ProductIdOrigin getProductIdOrigin() {
        return this.f24222b;
    }

    public int hashCode() {
        ExternalPrivacyContext externalPrivacyContext = this.f24221a;
        int iHashCode = ((externalPrivacyContext == null ? 0 : externalPrivacyContext.hashCode()) ^ 1000003) * 1000003;
        ComplianceData.ProductIdOrigin productIdOrigin = this.f24222b;
        return iHashCode ^ (productIdOrigin != null ? productIdOrigin.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f24221a + ", productIdOrigin=" + this.f24222b + "}";
    }

    private AutoValue_ComplianceData(ExternalPrivacyContext externalPrivacyContext, ComplianceData.ProductIdOrigin productIdOrigin) {
        this.f24221a = externalPrivacyContext;
        this.f24222b = productIdOrigin;
    }
}
