package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32426b;

    static final class Builder extends CrashlyticsReport.FilesPayload.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f32427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32428b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload build() {
            List list = this.f32427a;
            if (list != null) {
                return new AutoValue_CrashlyticsReport_FilesPayload(list, this.f32428b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload.Builder setFiles(List<CrashlyticsReport.FilesPayload.File> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f32427a = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload.Builder setOrgId(String str) {
            this.f32428b = str;
            return this;
        }

        Builder() {
        }

        private Builder(CrashlyticsReport.FilesPayload filesPayload) {
            this.f32427a = filesPayload.getFiles();
            this.f32428b = filesPayload.getOrgId();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    CrashlyticsReport.FilesPayload.Builder a() {
        return new Builder(this);
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.FilesPayload) {
            CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
            if (this.f32425a.equals(filesPayload.getFiles()) && ((str = this.f32426b) != null ? str.equals(filesPayload.getOrgId()) : filesPayload.getOrgId() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    @NonNull
    public List<CrashlyticsReport.FilesPayload.File> getFiles() {
        return this.f32425a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    @Nullable
    public String getOrgId() {
        return this.f32426b;
    }

    public int hashCode() {
        int iHashCode = (this.f32425a.hashCode() ^ 1000003) * 1000003;
        String str = this.f32426b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f32425a + ", orgId=" + this.f32426b + "}";
    }

    private AutoValue_CrashlyticsReport_FilesPayload(List list, String str) {
        this.f32425a = list;
        this.f32426b = str;
    }
}
