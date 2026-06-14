package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_ExternalPRequestContext extends ExternalPRequestContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f24229a;

    static final class Builder extends ExternalPRequestContext.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f24230a;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public ExternalPRequestContext build() {
            return new AutoValue_ExternalPRequestContext(this.f24230a);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public ExternalPRequestContext.Builder setOriginAssociatedProductId(@Nullable Integer num) {
            this.f24230a = num;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPRequestContext)) {
            return false;
        }
        Integer num = this.f24229a;
        Integer originAssociatedProductId = ((ExternalPRequestContext) obj).getOriginAssociatedProductId();
        return num == null ? originAssociatedProductId == null : num.equals(originAssociatedProductId);
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext
    @Nullable
    public Integer getOriginAssociatedProductId() {
        return this.f24229a;
    }

    public int hashCode() {
        Integer num = this.f24229a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f24229a + "}";
    }

    private AutoValue_ExternalPRequestContext(Integer num) {
        this.f24229a = num;
    }
}
