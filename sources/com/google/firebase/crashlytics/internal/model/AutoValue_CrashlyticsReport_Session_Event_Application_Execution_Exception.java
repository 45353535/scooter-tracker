package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception extends CrashlyticsReport.Session.Event.Application.Execution.Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f32542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CrashlyticsReport.Session.Event.Application.Execution.Exception f32543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32544e;

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f32547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CrashlyticsReport.Session.Event.Application.Execution.Exception f32548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f32549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f32550f;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception build() {
            String str;
            List list;
            if (this.f32550f == 1 && (str = this.f32545a) != null && (list = this.f32547c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(str, this.f32546b, list, this.f32548d, this.f32549e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32545a == null) {
                sb2.append(" type");
            }
            if (this.f32547c == null) {
                sb2.append(" frames");
            }
            if ((1 & this.f32550f) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setCausedBy(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f32548d = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setFrames(List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f32547c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setOverflowCount(int i10) {
            this.f32549e = i10;
            this.f32550f = (byte) (this.f32550f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setReason(String str) {
            this.f32546b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setType(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f32545a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Exception) {
            CrashlyticsReport.Session.Event.Application.Execution.Exception exception2 = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
            if (this.f32540a.equals(exception2.getType()) && ((str = this.f32541b) != null ? str.equals(exception2.getReason()) : exception2.getReason() == null) && this.f32542c.equals(exception2.getFrames()) && ((exception = this.f32543d) != null ? exception.equals(exception2.getCausedBy()) : exception2.getCausedBy() == null) && this.f32544e == exception2.getOverflowCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @Nullable
    public CrashlyticsReport.Session.Event.Application.Execution.Exception getCausedBy() {
        return this.f32543d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @NonNull
    public List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.f32542c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public int getOverflowCount() {
        return this.f32544e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @Nullable
    public String getReason() {
        return this.f32541b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @NonNull
    public String getType() {
        return this.f32540a;
    }

    public int hashCode() {
        int iHashCode = (this.f32540a.hashCode() ^ 1000003) * 1000003;
        String str = this.f32541b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f32542c.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f32543d;
        return ((iHashCode2 ^ (exception != null ? exception.hashCode() : 0)) * 1000003) ^ this.f32544e;
    }

    public String toString() {
        return "Exception{type=" + this.f32540a + ", reason=" + this.f32541b + ", frames=" + this.f32542c + ", causedBy=" + this.f32543d + ", overflowCount=" + this.f32544e + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(String str, String str2, List list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i10) {
        this.f32540a = str;
        this.f32541b = str2;
        this.f32542c = list;
        this.f32543d = exception;
        this.f32544e = i10;
    }
}
