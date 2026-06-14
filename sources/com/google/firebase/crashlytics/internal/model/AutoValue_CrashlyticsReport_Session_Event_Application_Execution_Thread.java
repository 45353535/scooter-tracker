package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread extends CrashlyticsReport.Session.Event.Application.Execution.Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f32560c;

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f32562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f32563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f32564d;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread build() {
            String str;
            List list;
            if (this.f32564d == 1 && (str = this.f32561a) != null && (list = this.f32563c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(str, this.f32562b, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32561a == null) {
                sb2.append(" name");
            }
            if ((1 & this.f32564d) == 0) {
                sb2.append(" importance");
            }
            if (this.f32563c == null) {
                sb2.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setFrames(List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f32563c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setImportance(int i10) {
            this.f32562b = i10;
            this.f32564d = (byte) (this.f32564d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setName(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f32561a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
            if (this.f32558a.equals(thread.getName()) && this.f32559b == thread.getImportance() && this.f32560c.equals(thread.getFrames())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    @NonNull
    public List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.f32560c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public int getImportance() {
        return this.f32559b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    @NonNull
    public String getName() {
        return this.f32558a;
    }

    public int hashCode() {
        return ((((this.f32558a.hashCode() ^ 1000003) * 1000003) ^ this.f32559b) * 1000003) ^ this.f32560c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f32558a + ", importance=" + this.f32559b + ", frames=" + this.f32560c + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(String str, int i10, List list) {
        this.f32558a = str;
        this.f32559b = i10;
        this.f32560c = list;
    }
}
