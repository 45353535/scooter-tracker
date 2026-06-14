package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_User extends CrashlyticsReport.Session.User {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32624a;

    static final class Builder extends CrashlyticsReport.Session.User.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32625a;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public CrashlyticsReport.Session.User build() {
            String str = this.f32625a;
            if (str != null) {
                return new AutoValue_CrashlyticsReport_Session_User(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public CrashlyticsReport.Session.User.Builder setIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f32625a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.User) {
            return this.f32624a.equals(((CrashlyticsReport.Session.User) obj).getIdentifier());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User
    @NonNull
    public String getIdentifier() {
        return this.f32624a;
    }

    public int hashCode() {
        return this.f32624a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f32624a + "}";
    }

    private AutoValue_CrashlyticsReport_Session_User(String str) {
        this.f32624a = str;
    }
}
