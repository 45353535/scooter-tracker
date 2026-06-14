package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Application extends CrashlyticsReport.Session.Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CrashlyticsReport.Session.Application.Organization f32461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f32464g;

    static final class Builder extends CrashlyticsReport.Session.Application.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CrashlyticsReport.Session.Application.Organization f32468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f32469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f32470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f32471g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application build() {
            String str;
            String str2 = this.f32465a;
            if (str2 != null && (str = this.f32466b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Application(str2, str, this.f32467c, this.f32468d, this.f32469e, this.f32470f, this.f32471g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32465a == null) {
                sb2.append(" identifier");
            }
            if (this.f32466b == null) {
                sb2.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setDevelopmentPlatform(@Nullable String str) {
            this.f32470f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setDevelopmentPlatformVersion(@Nullable String str) {
            this.f32471g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setDisplayVersion(String str) {
            this.f32467c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f32465a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setInstallationUuid(String str) {
            this.f32469e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setOrganization(CrashlyticsReport.Session.Application.Organization organization) {
            this.f32468d = organization;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f32466b = str;
            return this;
        }

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Application application) {
            this.f32465a = application.getIdentifier();
            this.f32466b = application.getVersion();
            this.f32467c = application.getDisplayVersion();
            this.f32468d = application.getOrganization();
            this.f32469e = application.getInstallationUuid();
            this.f32470f = application.getDevelopmentPlatform();
            this.f32471g = application.getDevelopmentPlatformVersion();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    protected CrashlyticsReport.Session.Application.Builder a() {
        return new Builder(this);
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Application.Organization organization;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application) {
            CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
            if (this.f32458a.equals(application.getIdentifier()) && this.f32459b.equals(application.getVersion()) && ((str = this.f32460c) != null ? str.equals(application.getDisplayVersion()) : application.getDisplayVersion() == null) && ((organization = this.f32461d) != null ? organization.equals(application.getOrganization()) : application.getOrganization() == null) && ((str2 = this.f32462e) != null ? str2.equals(application.getInstallationUuid()) : application.getInstallationUuid() == null) && ((str3 = this.f32463f) != null ? str3.equals(application.getDevelopmentPlatform()) : application.getDevelopmentPlatform() == null) && ((str4 = this.f32464g) != null ? str4.equals(application.getDevelopmentPlatformVersion()) : application.getDevelopmentPlatformVersion() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public String getDevelopmentPlatform() {
        return this.f32463f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public String getDevelopmentPlatformVersion() {
        return this.f32464g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public String getDisplayVersion() {
        return this.f32460c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @NonNull
    public String getIdentifier() {
        return this.f32458a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public String getInstallationUuid() {
        return this.f32462e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public CrashlyticsReport.Session.Application.Organization getOrganization() {
        return this.f32461d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @NonNull
    public String getVersion() {
        return this.f32459b;
    }

    public int hashCode() {
        int iHashCode = (((this.f32458a.hashCode() ^ 1000003) * 1000003) ^ this.f32459b.hashCode()) * 1000003;
        String str = this.f32460c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.Session.Application.Organization organization = this.f32461d;
        int iHashCode3 = (iHashCode2 ^ (organization == null ? 0 : organization.hashCode())) * 1000003;
        String str2 = this.f32462e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f32463f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f32464g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f32458a + ", version=" + this.f32459b + ", displayVersion=" + this.f32460c + ", organization=" + this.f32461d + ", installationUuid=" + this.f32462e + ", developmentPlatform=" + this.f32463f + ", developmentPlatformVersion=" + this.f32464g + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Application(String str, String str2, String str3, CrashlyticsReport.Session.Application.Organization organization, String str4, String str5, String str6) {
        this.f32458a = str;
        this.f32459b = str2;
        this.f32460c = str3;
        this.f32461d = organization;
        this.f32462e = str4;
        this.f32463f = str5;
        this.f32464g = str6;
    }
}
