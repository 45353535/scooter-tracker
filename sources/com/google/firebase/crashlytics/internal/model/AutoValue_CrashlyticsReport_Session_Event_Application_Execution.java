package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution extends CrashlyticsReport.Session.Event.Application.Execution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CrashlyticsReport.Session.Event.Application.Execution.Exception f32522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CrashlyticsReport.ApplicationExitInfo f32523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CrashlyticsReport.Session.Event.Application.Execution.Signal f32524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f32525e;

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f32526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CrashlyticsReport.Session.Event.Application.Execution.Exception f32527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CrashlyticsReport.ApplicationExitInfo f32528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CrashlyticsReport.Session.Event.Application.Execution.Signal f32529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f32530e;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution build() {
            List list;
            CrashlyticsReport.Session.Event.Application.Execution.Signal signal = this.f32529d;
            if (signal != null && (list = this.f32530e) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(this.f32526a, this.f32527b, this.f32528c, signal, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32529d == null) {
                sb2.append(" signal");
            }
            if (this.f32530e == null) {
                sb2.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setAppExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f32528c = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setBinaries(List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f32530e = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setException(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f32527b = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setSignal(CrashlyticsReport.Session.Event.Application.Execution.Signal signal) {
            if (signal == null) {
                throw new NullPointerException("Null signal");
            }
            this.f32529d = signal;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setThreads(List<CrashlyticsReport.Session.Event.Application.Execution.Thread> list) {
            this.f32526a = list;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution) {
            CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
            List list = this.f32521a;
            if (list != null ? list.equals(execution.getThreads()) : execution.getThreads() == null) {
                CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f32522b;
                if (exception != null ? exception.equals(execution.getException()) : execution.getException() == null) {
                    CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f32523c;
                    if (applicationExitInfo != null ? applicationExitInfo.equals(execution.getAppExitInfo()) : execution.getAppExitInfo() == null) {
                        if (this.f32524d.equals(execution.getSignal()) && this.f32525e.equals(execution.getBinaries())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @Nullable
    public CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.f32523c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @NonNull
    public List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> getBinaries() {
        return this.f32525e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @Nullable
    public CrashlyticsReport.Session.Event.Application.Execution.Exception getException() {
        return this.f32522b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @NonNull
    public CrashlyticsReport.Session.Event.Application.Execution.Signal getSignal() {
        return this.f32524d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @Nullable
    public List<CrashlyticsReport.Session.Event.Application.Execution.Thread> getThreads() {
        return this.f32521a;
    }

    public int hashCode() {
        List list = this.f32521a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f32522b;
        int iHashCode2 = (iHashCode ^ (exception == null ? 0 : exception.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f32523c;
        return ((((iHashCode2 ^ (applicationExitInfo != null ? applicationExitInfo.hashCode() : 0)) * 1000003) ^ this.f32524d.hashCode()) * 1000003) ^ this.f32525e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f32521a + ", exception=" + this.f32522b + ", appExitInfo=" + this.f32523c + ", signal=" + this.f32524d + ", binaries=" + this.f32525e + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution(List list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, CrashlyticsReport.ApplicationExitInfo applicationExitInfo, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, List list2) {
        this.f32521a = list;
        this.f32522b = exception;
        this.f32523c = applicationExitInfo;
        this.f32524d = signal;
        this.f32525e = list2;
    }
}
