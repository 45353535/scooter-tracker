package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f32437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f32438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CrashlyticsReport.Session.Application f32439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CrashlyticsReport.Session.User f32440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CrashlyticsReport.Session.OperatingSystem f32441i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CrashlyticsReport.Session.Device f32442j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f32443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f32444l;

    static final class Builder extends CrashlyticsReport.Session.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f32448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f32449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f32450f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private CrashlyticsReport.Session.Application f32451g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CrashlyticsReport.Session.User f32452h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private CrashlyticsReport.Session.OperatingSystem f32453i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private CrashlyticsReport.Session.Device f32454j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List f32455k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f32456l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f32457m;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session build() {
            String str;
            String str2;
            CrashlyticsReport.Session.Application application;
            if (this.f32457m == 7 && (str = this.f32445a) != null && (str2 = this.f32446b) != null && (application = this.f32451g) != null) {
                return new AutoValue_CrashlyticsReport_Session(str, str2, this.f32447c, this.f32448d, this.f32449e, this.f32450f, application, this.f32452h, this.f32453i, this.f32454j, this.f32455k, this.f32456l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32445a == null) {
                sb2.append(" generator");
            }
            if (this.f32446b == null) {
                sb2.append(" identifier");
            }
            if ((this.f32457m & 1) == 0) {
                sb2.append(" startedAt");
            }
            if ((this.f32457m & 2) == 0) {
                sb2.append(" crashed");
            }
            if (this.f32451g == null) {
                sb2.append(" app");
            }
            if ((this.f32457m & 4) == 0) {
                sb2.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setApp(CrashlyticsReport.Session.Application application) {
            if (application == null) {
                throw new NullPointerException("Null app");
            }
            this.f32451g = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setAppQualitySessionId(@Nullable String str) {
            this.f32447c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setCrashed(boolean z10) {
            this.f32450f = z10;
            this.f32457m = (byte) (this.f32457m | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setDevice(CrashlyticsReport.Session.Device device) {
            this.f32454j = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setEndedAt(Long l10) {
            this.f32449e = l10;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setEvents(List<CrashlyticsReport.Session.Event> list) {
            this.f32455k = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setGenerator(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f32445a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setGeneratorType(int i10) {
            this.f32456l = i10;
            this.f32457m = (byte) (this.f32457m | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f32446b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setOs(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.f32453i = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setStartedAt(long j10) {
            this.f32448d = j10;
            this.f32457m = (byte) (this.f32457m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setUser(CrashlyticsReport.Session.User user) {
            this.f32452h = user;
            return this;
        }

        Builder() {
        }

        private Builder(CrashlyticsReport.Session session) {
            this.f32445a = session.getGenerator();
            this.f32446b = session.getIdentifier();
            this.f32447c = session.getAppQualitySessionId();
            this.f32448d = session.getStartedAt();
            this.f32449e = session.getEndedAt();
            this.f32450f = session.isCrashed();
            this.f32451g = session.getApp();
            this.f32452h = session.getUser();
            this.f32453i = session.getOs();
            this.f32454j = session.getDevice();
            this.f32455k = session.getEvents();
            this.f32456l = session.getGeneratorType();
            this.f32457m = (byte) 7;
        }
    }

    public boolean equals(Object obj) {
        String str;
        Long l10;
        CrashlyticsReport.Session.User user;
        CrashlyticsReport.Session.OperatingSystem operatingSystem;
        CrashlyticsReport.Session.Device device;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session) {
            CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
            if (this.f32433a.equals(session.getGenerator()) && this.f32434b.equals(session.getIdentifier()) && ((str = this.f32435c) != null ? str.equals(session.getAppQualitySessionId()) : session.getAppQualitySessionId() == null) && this.f32436d == session.getStartedAt() && ((l10 = this.f32437e) != null ? l10.equals(session.getEndedAt()) : session.getEndedAt() == null) && this.f32438f == session.isCrashed() && this.f32439g.equals(session.getApp()) && ((user = this.f32440h) != null ? user.equals(session.getUser()) : session.getUser() == null) && ((operatingSystem = this.f32441i) != null ? operatingSystem.equals(session.getOs()) : session.getOs() == null) && ((device = this.f32442j) != null ? device.equals(session.getDevice()) : session.getDevice() == null) && ((list = this.f32443k) != null ? list.equals(session.getEvents()) : session.getEvents() == null) && this.f32444l == session.getGeneratorType()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @NonNull
    public CrashlyticsReport.Session.Application getApp() {
        return this.f32439g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public String getAppQualitySessionId() {
        return this.f32435c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public CrashlyticsReport.Session.Device getDevice() {
        return this.f32442j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public Long getEndedAt() {
        return this.f32437e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public List<CrashlyticsReport.Session.Event> getEvents() {
        return this.f32443k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @NonNull
    public String getGenerator() {
        return this.f32433a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public int getGeneratorType() {
        return this.f32444l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @NonNull
    @Encodable.Ignore
    public String getIdentifier() {
        return this.f32434b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public CrashlyticsReport.Session.OperatingSystem getOs() {
        return this.f32441i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public long getStartedAt() {
        return this.f32436d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public CrashlyticsReport.Session.User getUser() {
        return this.f32440h;
    }

    public int hashCode() {
        int iHashCode = (((this.f32433a.hashCode() ^ 1000003) * 1000003) ^ this.f32434b.hashCode()) * 1000003;
        String str = this.f32435c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f32436d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f32437e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f32438f ? 1231 : 1237)) * 1000003) ^ this.f32439g.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user = this.f32440h;
        int iHashCode4 = (iHashCode3 ^ (user == null ? 0 : user.hashCode())) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.f32441i;
        int iHashCode5 = (iHashCode4 ^ (operatingSystem == null ? 0 : operatingSystem.hashCode())) * 1000003;
        CrashlyticsReport.Session.Device device = this.f32442j;
        int iHashCode6 = (iHashCode5 ^ (device == null ? 0 : device.hashCode())) * 1000003;
        List list = this.f32443k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f32444l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public boolean isCrashed() {
        return this.f32438f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "Session{generator=" + this.f32433a + ", identifier=" + this.f32434b + ", appQualitySessionId=" + this.f32435c + ", startedAt=" + this.f32436d + ", endedAt=" + this.f32437e + ", crashed=" + this.f32438f + ", app=" + this.f32439g + ", user=" + this.f32440h + ", os=" + this.f32441i + ", device=" + this.f32442j + ", events=" + this.f32443k + ", generatorType=" + this.f32444l + "}";
    }

    private AutoValue_CrashlyticsReport_Session(String str, String str2, String str3, long j10, Long l10, boolean z10, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device, List list, int i10) {
        this.f32433a = str;
        this.f32434b = str2;
        this.f32435c = str3;
        this.f32436d = j10;
        this.f32437e = l10;
        this.f32438f = z10;
        this.f32439g = application;
        this.f32440h = user;
        this.f32441i = operatingSystem;
        this.f32442j = device;
        this.f32443k = list;
        this.f32444l = i10;
    }
}
