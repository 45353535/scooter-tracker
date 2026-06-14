package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_FilesPayload_File extends CrashlyticsReport.FilesPayload.File {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f32430b;

    static final class Builder extends CrashlyticsReport.FilesPayload.File.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f32432b;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File build() {
            byte[] bArr;
            String str = this.f32431a;
            if (str != null && (bArr = this.f32432b) != null) {
                return new AutoValue_CrashlyticsReport_FilesPayload_File(str, bArr);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32431a == null) {
                sb2.append(" filename");
            }
            if (this.f32432b == null) {
                sb2.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File.Builder setContents(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f32432b = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File.Builder setFilename(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f32431a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.FilesPayload.File) {
            CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
            if (this.f32429a.equals(file.getFilename())) {
                if (Arrays.equals(this.f32430b, file instanceof AutoValue_CrashlyticsReport_FilesPayload_File ? ((AutoValue_CrashlyticsReport_FilesPayload_File) file).f32430b : file.getContents())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    @NonNull
    public byte[] getContents() {
        return this.f32430b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    @NonNull
    public String getFilename() {
        return this.f32429a;
    }

    public int hashCode() {
        return ((this.f32429a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f32430b);
    }

    public String toString() {
        return "File{filename=" + this.f32429a + ", contents=" + Arrays.toString(this.f32430b) + "}";
    }

    private AutoValue_CrashlyticsReport_FilesPayload_File(String str, byte[] bArr) {
        this.f32429a = str;
        this.f32430b = bArr;
    }
}
