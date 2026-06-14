package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event extends CrashlyticsReport.Session.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CrashlyticsReport.Session.Event.Application f32495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CrashlyticsReport.Session.Event.Device f32496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CrashlyticsReport.Session.Event.Log f32497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CrashlyticsReport.Session.Event.RolloutsState f32498f;

    static final class Builder extends CrashlyticsReport.Session.Event.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f32499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CrashlyticsReport.Session.Event.Application f32501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CrashlyticsReport.Session.Event.Device f32502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CrashlyticsReport.Session.Event.Log f32503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CrashlyticsReport.Session.Event.RolloutsState f32504f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f32505g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event build() {
            String str;
            CrashlyticsReport.Session.Event.Application application;
            CrashlyticsReport.Session.Event.Device device;
            if (this.f32505g == 1 && (str = this.f32500b) != null && (application = this.f32501c) != null && (device = this.f32502d) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event(this.f32499a, str, application, device, this.f32503e, this.f32504f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((1 & this.f32505g) == 0) {
                sb2.append(" timestamp");
            }
            if (this.f32500b == null) {
                sb2.append(" type");
            }
            if (this.f32501c == null) {
                sb2.append(" app");
            }
            if (this.f32502d == null) {
                sb2.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setApp(CrashlyticsReport.Session.Event.Application application) {
            if (application == null) {
                throw new NullPointerException("Null app");
            }
            this.f32501c = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setDevice(CrashlyticsReport.Session.Event.Device device) {
            if (device == null) {
                throw new NullPointerException("Null device");
            }
            this.f32502d = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setLog(CrashlyticsReport.Session.Event.Log log) {
            this.f32503e = log;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setRollouts(CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
            this.f32504f = rolloutsState;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setTimestamp(long j10) {
            this.f32499a = j10;
            this.f32505g = (byte) (this.f32505g | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setType(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f32500b = str;
            return this;
        }

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event event) {
            this.f32499a = event.getTimestamp();
            this.f32500b = event.getType();
            this.f32501c = event.getApp();
            this.f32502d = event.getDevice();
            this.f32503e = event.getLog();
            this.f32504f = event.getRollouts();
            this.f32505g = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.Session.Event.Log log;
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event) {
            CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
            if (this.f32493a == event.getTimestamp() && this.f32494b.equals(event.getType()) && this.f32495c.equals(event.getApp()) && this.f32496d.equals(event.getDevice()) && ((log = this.f32497e) != null ? log.equals(event.getLog()) : event.getLog() == null) && ((rolloutsState = this.f32498f) != null ? rolloutsState.equals(event.getRollouts()) : event.getRollouts() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @NonNull
    public CrashlyticsReport.Session.Event.Application getApp() {
        return this.f32495c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @NonNull
    public CrashlyticsReport.Session.Event.Device getDevice() {
        return this.f32496d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @Nullable
    public CrashlyticsReport.Session.Event.Log getLog() {
        return this.f32497e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @Nullable
    public CrashlyticsReport.Session.Event.RolloutsState getRollouts() {
        return this.f32498f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public long getTimestamp() {
        return this.f32493a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @NonNull
    public String getType() {
        return this.f32494b;
    }

    public int hashCode() {
        long j10 = this.f32493a;
        int iHashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f32494b.hashCode()) * 1000003) ^ this.f32495c.hashCode()) * 1000003) ^ this.f32496d.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Log log = this.f32497e;
        int iHashCode2 = (iHashCode ^ (log == null ? 0 : log.hashCode())) * 1000003;
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f32498f;
        return iHashCode2 ^ (rolloutsState != null ? rolloutsState.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public CrashlyticsReport.Session.Event.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "Event{timestamp=" + this.f32493a + ", type=" + this.f32494b + ", app=" + this.f32495c + ", device=" + this.f32496d + ", log=" + this.f32497e + ", rollouts=" + this.f32498f + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event(long j10, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device, CrashlyticsReport.Session.Event.Log log, CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
        this.f32493a = j10;
        this.f32494b = str;
        this.f32495c = application;
        this.f32496d = device;
        this.f32497e = log;
        this.f32498f = rolloutsState;
    }
}
