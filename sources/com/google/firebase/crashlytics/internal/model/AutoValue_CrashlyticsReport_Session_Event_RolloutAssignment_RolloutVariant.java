package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32610b;

    static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32612b;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant build() {
            String str;
            String str2 = this.f32611a;
            if (str2 != null && (str = this.f32612b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32611a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f32612b == null) {
                sb2.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setRolloutId(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f32611a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setVariantId(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f32612b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
            if (this.f32609a.equals(rolloutVariant.getRolloutId()) && this.f32610b.equals(rolloutVariant.getVariantId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    @NonNull
    public String getRolloutId() {
        return this.f32609a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    @NonNull
    public String getVariantId() {
        return this.f32610b;
    }

    public int hashCode() {
        return ((this.f32609a.hashCode() ^ 1000003) * 1000003) ^ this.f32610b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f32609a + ", variantId=" + this.f32610b + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(String str, String str2) {
        this.f32609a = str;
        this.f32610b = str2;
    }
}
