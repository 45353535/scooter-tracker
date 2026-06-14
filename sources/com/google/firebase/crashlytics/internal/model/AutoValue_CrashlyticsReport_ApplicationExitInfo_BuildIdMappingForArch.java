package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32417c;

    static final class Builder extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32420c;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch build() {
            String str;
            String str2;
            String str3 = this.f32418a;
            if (str3 != null && (str = this.f32419b) != null && (str2 = this.f32420c) != null) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(str3, str, str2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32418a == null) {
                sb2.append(" arch");
            }
            if (this.f32419b == null) {
                sb2.append(" libraryName");
            }
            if (this.f32420c == null) {
                sb2.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setArch(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f32418a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setBuildId(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f32420c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setLibraryName(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f32419b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) {
            CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
            if (this.f32415a.equals(buildIdMappingForArch.getArch()) && this.f32416b.equals(buildIdMappingForArch.getLibraryName()) && this.f32417c.equals(buildIdMappingForArch.getBuildId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public String getArch() {
        return this.f32415a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public String getBuildId() {
        return this.f32417c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public String getLibraryName() {
        return this.f32416b;
    }

    public int hashCode() {
        return ((((this.f32415a.hashCode() ^ 1000003) * 1000003) ^ this.f32416b.hashCode()) * 1000003) ^ this.f32417c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f32415a + ", libraryName=" + this.f32416b + ", buildId=" + this.f32417c + "}";
    }

    private AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(String str, String str2, String str3) {
        this.f32415a = str;
        this.f32416b = str2;
        this.f32417c = str3;
    }
}
