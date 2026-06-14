package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal extends CrashlyticsReport.Session.Event.Application.Execution.Signal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32553c;

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f32556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f32557d;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal build() {
            String str;
            String str2;
            if (this.f32557d == 1 && (str = this.f32554a) != null && (str2 = this.f32555b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(str, str2, this.f32556c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32554a == null) {
                sb2.append(" name");
            }
            if (this.f32555b == null) {
                sb2.append(" code");
            }
            if ((1 & this.f32557d) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long j10) {
            this.f32556c = j10;
            this.f32557d = (byte) (this.f32557d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f32555b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f32554a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal) {
            CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
            if (this.f32551a.equals(signal.getName()) && this.f32552b.equals(signal.getCode()) && this.f32553c == signal.getAddress()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public long getAddress() {
        return this.f32553c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public String getCode() {
        return this.f32552b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public String getName() {
        return this.f32551a;
    }

    public int hashCode() {
        int iHashCode = (((this.f32551a.hashCode() ^ 1000003) * 1000003) ^ this.f32552b.hashCode()) * 1000003;
        long j10 = this.f32553c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f32551a + ", code=" + this.f32552b + ", address=" + this.f32553c + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(String str, String str2, long j10) {
        this.f32551a = str;
        this.f32552b = str2;
        this.f32553c = j10;
    }
}
