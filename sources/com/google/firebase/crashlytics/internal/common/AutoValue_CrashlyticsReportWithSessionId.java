package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReportWithSessionId extends CrashlyticsReportWithSessionId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CrashlyticsReport f31972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f31974c;

    AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport == null) {
            throw new NullPointerException("Null report");
        }
        this.f31972a = crashlyticsReport;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f31973b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f31974c = file;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReportWithSessionId) {
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
            if (this.f31972a.equals(crashlyticsReportWithSessionId.getReport()) && this.f31973b.equals(crashlyticsReportWithSessionId.getSessionId()) && this.f31974c.equals(crashlyticsReportWithSessionId.getReportFile())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public CrashlyticsReport getReport() {
        return this.f31972a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public File getReportFile() {
        return this.f31974c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public String getSessionId() {
        return this.f31973b;
    }

    public int hashCode() {
        return ((((this.f31972a.hashCode() ^ 1000003) * 1000003) ^ this.f31973b.hashCode()) * 1000003) ^ this.f31974c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f31972a + ", sessionId=" + this.f31973b + ", reportFile=" + this.f31974c + "}";
    }
}
