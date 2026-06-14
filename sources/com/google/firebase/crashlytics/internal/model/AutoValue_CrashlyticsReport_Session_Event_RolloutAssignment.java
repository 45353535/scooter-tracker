package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment extends CrashlyticsReport.Session.Event.RolloutAssignment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f32600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32603d;

    static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f32604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f32607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f32608e;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment build() {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
            String str;
            String str2;
            if (this.f32608e == 1 && (rolloutVariant = this.f32604a) != null && (str = this.f32605b) != null && (str2 = this.f32606c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(rolloutVariant, str, str2, this.f32607d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32604a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f32605b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f32606c == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f32608e) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f32605b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f32606c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setRolloutVariant(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant) {
            if (rolloutVariant == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f32604a = rolloutVariant;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setTemplateVersion(long j10) {
            this.f32607d = j10;
            this.f32608e = (byte) (this.f32608e | 1);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment) {
            CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
            if (this.f32600a.equals(rolloutAssignment.getRolloutVariant()) && this.f32601b.equals(rolloutAssignment.getParameterKey()) && this.f32602c.equals(rolloutAssignment.getParameterValue()) && this.f32603d == rolloutAssignment.getTemplateVersion()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @NonNull
    public String getParameterKey() {
        return this.f32601b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @NonNull
    public String getParameterValue() {
        return this.f32602c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @NonNull
    public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant getRolloutVariant() {
        return this.f32600a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @NonNull
    public long getTemplateVersion() {
        return this.f32603d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f32600a.hashCode() ^ 1000003) * 1000003) ^ this.f32601b.hashCode()) * 1000003) ^ this.f32602c.hashCode()) * 1000003;
        long j10 = this.f32603d;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f32600a + ", parameterKey=" + this.f32601b + ", parameterValue=" + this.f32602c + ", templateVersion=" + this.f32603d + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, String str, String str2, long j10) {
        this.f32600a = rolloutVariant;
        this.f32601b = str;
        this.f32602c = str2;
        this.f32603d = j10;
    }
}
