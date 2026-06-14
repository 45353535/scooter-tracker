package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport extends CrashlyticsReport {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f32376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f32377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f32378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f32379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final CrashlyticsReport.Session f32380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final CrashlyticsReport.FilesPayload f32381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CrashlyticsReport.ApplicationExitInfo f32382m;

    static final class Builder extends CrashlyticsReport.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f32385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f32386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f32387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f32388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f32389g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f32390h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f32391i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private CrashlyticsReport.Session f32392j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CrashlyticsReport.FilesPayload f32393k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CrashlyticsReport.ApplicationExitInfo f32394l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f32395m;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport build() {
            if (this.f32395m == 1 && this.f32383a != null && this.f32384b != null && this.f32386d != null && this.f32390h != null && this.f32391i != null) {
                return new AutoValue_CrashlyticsReport(this.f32383a, this.f32384b, this.f32385c, this.f32386d, this.f32387e, this.f32388f, this.f32389g, this.f32390h, this.f32391i, this.f32392j, this.f32393k, this.f32394l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32383a == null) {
                sb2.append(" sdkVersion");
            }
            if (this.f32384b == null) {
                sb2.append(" gmpAppId");
            }
            if ((1 & this.f32395m) == 0) {
                sb2.append(" platform");
            }
            if (this.f32386d == null) {
                sb2.append(" installationUuid");
            }
            if (this.f32390h == null) {
                sb2.append(" buildVersion");
            }
            if (this.f32391i == null) {
                sb2.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setAppExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f32394l = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setAppQualitySessionId(@Nullable String str) {
            this.f32389g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setBuildVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f32390h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setDisplayVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f32391i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setFirebaseAuthenticationToken(@Nullable String str) {
            this.f32388f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setFirebaseInstallationId(@Nullable String str) {
            this.f32387e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setGmpAppId(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f32384b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setInstallationUuid(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f32386d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setNdkPayload(CrashlyticsReport.FilesPayload filesPayload) {
            this.f32393k = filesPayload;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setPlatform(int i10) {
            this.f32385c = i10;
            this.f32395m = (byte) (this.f32395m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setSdkVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f32383a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setSession(CrashlyticsReport.Session session) {
            this.f32392j = session;
            return this;
        }

        Builder() {
        }

        private Builder(CrashlyticsReport crashlyticsReport) {
            this.f32383a = crashlyticsReport.getSdkVersion();
            this.f32384b = crashlyticsReport.getGmpAppId();
            this.f32385c = crashlyticsReport.getPlatform();
            this.f32386d = crashlyticsReport.getInstallationUuid();
            this.f32387e = crashlyticsReport.getFirebaseInstallationId();
            this.f32388f = crashlyticsReport.getFirebaseAuthenticationToken();
            this.f32389g = crashlyticsReport.getAppQualitySessionId();
            this.f32390h = crashlyticsReport.getBuildVersion();
            this.f32391i = crashlyticsReport.getDisplayVersion();
            this.f32392j = crashlyticsReport.getSession();
            this.f32393k = crashlyticsReport.getNdkPayload();
            this.f32394l = crashlyticsReport.getAppExitInfo();
            this.f32395m = (byte) 1;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    protected CrashlyticsReport.Builder b() {
        return new Builder(this);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        CrashlyticsReport.Session session;
        CrashlyticsReport.FilesPayload filesPayload;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport) {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            if (this.f32371b.equals(crashlyticsReport.getSdkVersion()) && this.f32372c.equals(crashlyticsReport.getGmpAppId()) && this.f32373d == crashlyticsReport.getPlatform() && this.f32374e.equals(crashlyticsReport.getInstallationUuid()) && ((str = this.f32375f) != null ? str.equals(crashlyticsReport.getFirebaseInstallationId()) : crashlyticsReport.getFirebaseInstallationId() == null) && ((str2 = this.f32376g) != null ? str2.equals(crashlyticsReport.getFirebaseAuthenticationToken()) : crashlyticsReport.getFirebaseAuthenticationToken() == null) && ((str3 = this.f32377h) != null ? str3.equals(crashlyticsReport.getAppQualitySessionId()) : crashlyticsReport.getAppQualitySessionId() == null) && this.f32378i.equals(crashlyticsReport.getBuildVersion()) && this.f32379j.equals(crashlyticsReport.getDisplayVersion()) && ((session = this.f32380k) != null ? session.equals(crashlyticsReport.getSession()) : crashlyticsReport.getSession() == null) && ((filesPayload = this.f32381l) != null ? filesPayload.equals(crashlyticsReport.getNdkPayload()) : crashlyticsReport.getNdkPayload() == null) && ((applicationExitInfo = this.f32382m) != null ? applicationExitInfo.equals(crashlyticsReport.getAppExitInfo()) : crashlyticsReport.getAppExitInfo() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.f32382m;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public String getAppQualitySessionId() {
        return this.f32377h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getBuildVersion() {
        return this.f32378i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getDisplayVersion() {
        return this.f32379j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public String getFirebaseAuthenticationToken() {
        return this.f32376g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public String getFirebaseInstallationId() {
        return this.f32375f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getGmpAppId() {
        return this.f32372c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getInstallationUuid() {
        return this.f32374e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public CrashlyticsReport.FilesPayload getNdkPayload() {
        return this.f32381l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public int getPlatform() {
        return this.f32373d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getSdkVersion() {
        return this.f32371b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public CrashlyticsReport.Session getSession() {
        return this.f32380k;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f32371b.hashCode() ^ 1000003) * 1000003) ^ this.f32372c.hashCode()) * 1000003) ^ this.f32373d) * 1000003) ^ this.f32374e.hashCode()) * 1000003;
        String str = this.f32375f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f32376g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f32377h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f32378i.hashCode()) * 1000003) ^ this.f32379j.hashCode()) * 1000003;
        CrashlyticsReport.Session session = this.f32380k;
        int iHashCode5 = (iHashCode4 ^ (session == null ? 0 : session.hashCode())) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.f32381l;
        int iHashCode6 = (iHashCode5 ^ (filesPayload == null ? 0 : filesPayload.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f32382m;
        return iHashCode6 ^ (applicationExitInfo != null ? applicationExitInfo.hashCode() : 0);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f32371b + ", gmpAppId=" + this.f32372c + ", platform=" + this.f32373d + ", installationUuid=" + this.f32374e + ", firebaseInstallationId=" + this.f32375f + ", firebaseAuthenticationToken=" + this.f32376g + ", appQualitySessionId=" + this.f32377h + ", buildVersion=" + this.f32378i + ", displayVersion=" + this.f32379j + ", session=" + this.f32380k + ", ndkPayload=" + this.f32381l + ", appExitInfo=" + this.f32382m + "}";
    }

    private AutoValue_CrashlyticsReport(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, CrashlyticsReport.Session session, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        this.f32371b = str;
        this.f32372c = str2;
        this.f32373d = i10;
        this.f32374e = str3;
        this.f32375f = str4;
        this.f32376g = str5;
        this.f32377h = str6;
        this.f32378i = str7;
        this.f32379j = str8;
        this.f32380k = session;
        this.f32381l = filesPayload;
        this.f32382m = applicationExitInfo;
    }
}
