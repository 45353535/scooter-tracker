package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32569e;

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f32570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f32573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f32574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f32575f;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame build() {
            String str;
            if (this.f32575f == 7 && (str = this.f32571b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(this.f32570a, str, this.f32572c, this.f32573d, this.f32574e);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f32575f & 1) == 0) {
                sb2.append(" pc");
            }
            if (this.f32571b == null) {
                sb2.append(" symbol");
            }
            if ((this.f32575f & 2) == 0) {
                sb2.append(" offset");
            }
            if ((this.f32575f & 4) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(String str) {
            this.f32572c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int i10) {
            this.f32574e = i10;
            this.f32575f = (byte) (this.f32575f | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long j10) {
            this.f32573d = j10;
            this.f32575f = (byte) (this.f32575f | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long j10) {
            this.f32570a = j10;
            this.f32575f = (byte) (this.f32575f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f32571b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
            if (this.f32565a == frame.getPc() && this.f32566b.equals(frame.getSymbol()) && ((str = this.f32567c) != null ? str.equals(frame.getFile()) : frame.getFile() == null) && this.f32568d == frame.getOffset() && this.f32569e == frame.getImportance()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    @Nullable
    public String getFile() {
        return this.f32567c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public int getImportance() {
        return this.f32569e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getOffset() {
        return this.f32568d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getPc() {
        return this.f32565a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    @NonNull
    public String getSymbol() {
        return this.f32566b;
    }

    public int hashCode() {
        long j10 = this.f32565a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f32566b.hashCode()) * 1000003;
        String str = this.f32567c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f32568d;
        return ((iHashCode2 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f32569e;
    }

    public String toString() {
        return "Frame{pc=" + this.f32565a + ", symbol=" + this.f32566b + ", file=" + this.f32567c + ", offset=" + this.f32568d + ", importance=" + this.f32569e + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(long j10, String str, String str2, long j11, int i10) {
        this.f32565a = j10;
        this.f32566b = str;
        this.f32567c = str2;
        this.f32568d = j11;
        this.f32569e = i10;
    }
}
