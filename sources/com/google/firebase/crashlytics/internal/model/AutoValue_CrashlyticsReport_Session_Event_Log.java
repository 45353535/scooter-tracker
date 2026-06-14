package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Log extends CrashlyticsReport.Session.Event.Log {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32598a;

    static final class Builder extends CrashlyticsReport.Session.Event.Log.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32599a;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public CrashlyticsReport.Session.Event.Log build() {
            String str = this.f32599a;
            if (str != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Log(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public CrashlyticsReport.Session.Event.Log.Builder setContent(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f32599a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Log) {
            return this.f32598a.equals(((CrashlyticsReport.Session.Event.Log) obj).getContent());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log
    @NonNull
    public String getContent() {
        return this.f32598a;
    }

    public int hashCode() {
        return this.f32598a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f32598a + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Log(String str) {
        this.f32598a = str;
    }
}
