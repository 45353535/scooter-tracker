package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_ExperimentIds extends ExperimentIds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f24225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f24226b;

    static final class Builder extends ExperimentIds.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f24227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f24228b;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds build() {
            return new AutoValue_ExperimentIds(this.f24227a, this.f24228b);
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds.Builder setClearBlob(@Nullable byte[] bArr) {
            this.f24227a = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds.Builder setEncryptedBlob(@Nullable byte[] bArr) {
            this.f24228b = bArr;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExperimentIds) {
            ExperimentIds experimentIds = (ExperimentIds) obj;
            boolean z10 = experimentIds instanceof AutoValue_ExperimentIds;
            if (Arrays.equals(this.f24225a, z10 ? ((AutoValue_ExperimentIds) experimentIds).f24225a : experimentIds.getClearBlob())) {
                if (Arrays.equals(this.f24226b, z10 ? ((AutoValue_ExperimentIds) experimentIds).f24226b : experimentIds.getEncryptedBlob())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    @Nullable
    public byte[] getClearBlob() {
        return this.f24225a;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    @Nullable
    public byte[] getEncryptedBlob() {
        return this.f24226b;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f24225a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24226b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f24225a) + ", encryptedBlob=" + Arrays.toString(this.f24226b) + "}";
    }

    private AutoValue_ExperimentIds(byte[] bArr, byte[] bArr2) {
        this.f24225a = bArr;
        this.f24226b = bArr2;
    }
}
