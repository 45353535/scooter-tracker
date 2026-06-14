package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Application_Organization extends CrashlyticsReport.Session.Application.Organization {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32472a;

    static final class Builder extends CrashlyticsReport.Session.Application.Organization.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32473a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public CrashlyticsReport.Session.Application.Organization build() {
            String str = this.f32473a;
            if (str != null) {
                return new AutoValue_CrashlyticsReport_Session_Application_Organization(str);
            }
            throw new IllegalStateException("Missing required properties: clsId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public CrashlyticsReport.Session.Application.Organization.Builder setClsId(String str) {
            if (str == null) {
                throw new NullPointerException("Null clsId");
            }
            this.f32473a = str;
            return this;
        }

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Application.Organization organization) {
            this.f32473a = organization.getClsId();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    protected CrashlyticsReport.Session.Application.Organization.Builder a() {
        return new Builder(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application.Organization) {
            return this.f32472a.equals(((CrashlyticsReport.Session.Application.Organization) obj).getClsId());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    @NonNull
    public String getClsId() {
        return this.f32472a;
    }

    public int hashCode() {
        return this.f32472a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f32472a + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Application_Organization(String str) {
        this.f32472a = str;
    }
}
