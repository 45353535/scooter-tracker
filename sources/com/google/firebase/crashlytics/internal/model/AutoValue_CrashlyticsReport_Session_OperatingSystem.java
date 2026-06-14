package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_OperatingSystem extends CrashlyticsReport.Session.OperatingSystem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f32618d;

    static final class Builder extends CrashlyticsReport.Session.OperatingSystem.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f32619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f32622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f32623e;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem build() {
            String str;
            String str2;
            if (this.f32623e == 3 && (str = this.f32620b) != null && (str2 = this.f32621c) != null) {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem(this.f32619a, str, str2, this.f32622d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f32623e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f32620b == null) {
                sb2.append(" version");
            }
            if (this.f32621c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f32623e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setBuildVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f32621c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setJailbroken(boolean z10) {
            this.f32622d = z10;
            this.f32623e = (byte) (this.f32623e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setPlatform(int i10) {
            this.f32619a = i10;
            this.f32623e = (byte) (this.f32623e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f32620b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.OperatingSystem) {
            CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
            if (this.f32615a == operatingSystem.getPlatform() && this.f32616b.equals(operatingSystem.getVersion()) && this.f32617c.equals(operatingSystem.getBuildVersion()) && this.f32618d == operatingSystem.isJailbroken()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    @NonNull
    public String getBuildVersion() {
        return this.f32617c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public int getPlatform() {
        return this.f32615a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    @NonNull
    public String getVersion() {
        return this.f32616b;
    }

    public int hashCode() {
        return ((((((this.f32615a ^ 1000003) * 1000003) ^ this.f32616b.hashCode()) * 1000003) ^ this.f32617c.hashCode()) * 1000003) ^ (this.f32618d ? 1231 : 1237);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public boolean isJailbroken() {
        return this.f32618d;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f32615a + ", version=" + this.f32616b + ", buildVersion=" + this.f32617c + ", jailbroken=" + this.f32618d + "}";
    }

    private AutoValue_CrashlyticsReport_Session_OperatingSystem(int i10, String str, String str2, boolean z10) {
        this.f32615a = i10;
        this.f32616b = str;
        this.f32617c = str2;
        this.f32618d = z10;
    }
}
