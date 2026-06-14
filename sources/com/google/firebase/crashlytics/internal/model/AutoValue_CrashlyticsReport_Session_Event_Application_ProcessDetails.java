package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails extends CrashlyticsReport.Session.Event.Application.ProcessDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f32579d;

    static final class Builder extends CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f32581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f32582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f32583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f32584e;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails build() {
            String str;
            if (this.f32584e == 7 && (str = this.f32580a) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(str, this.f32581b, this.f32582c, this.f32583d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32580a == null) {
                sb2.append(" processName");
            }
            if ((this.f32584e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f32584e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f32584e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setDefaultProcess(boolean z10) {
            this.f32583d = z10;
            this.f32584e = (byte) (this.f32584e | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setImportance(int i10) {
            this.f32582c = i10;
            this.f32584e = (byte) (this.f32584e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setPid(int i10) {
            this.f32581b = i10;
            this.f32584e = (byte) (this.f32584e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setProcessName(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f32580a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.ProcessDetails) {
            CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
            if (this.f32576a.equals(processDetails.getProcessName()) && this.f32577b == processDetails.getPid() && this.f32578c == processDetails.getImportance() && this.f32579d == processDetails.isDefaultProcess()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public int getImportance() {
        return this.f32578c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public int getPid() {
        return this.f32577b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    @NonNull
    public String getProcessName() {
        return this.f32576a;
    }

    public int hashCode() {
        return ((((((this.f32576a.hashCode() ^ 1000003) * 1000003) ^ this.f32577b) * 1000003) ^ this.f32578c) * 1000003) ^ (this.f32579d ? 1231 : 1237);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public boolean isDefaultProcess() {
        return this.f32579d;
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f32576a + ", pid=" + this.f32577b + ", importance=" + this.f32578c + ", defaultProcess=" + this.f32579d + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(String str, int i10, int i11, boolean z10) {
        this.f32576a = str;
        this.f32577b = i10;
        this.f32578c = i11;
        this.f32579d = z10;
    }
}
