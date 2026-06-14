package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_CustomAttribute extends CrashlyticsReport.CustomAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32422b;

    static final class Builder extends CrashlyticsReport.CustomAttribute.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32424b;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute build() {
            String str;
            String str2 = this.f32423a;
            if (str2 != null && (str = this.f32424b) != null) {
                return new AutoValue_CrashlyticsReport_CustomAttribute(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32423a == null) {
                sb2.append(" key");
            }
            if (this.f32424b == null) {
                sb2.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute.Builder setKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f32423a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute.Builder setValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f32424b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.CustomAttribute) {
            CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
            if (this.f32421a.equals(customAttribute.getKey()) && this.f32422b.equals(customAttribute.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    @NonNull
    public String getKey() {
        return this.f32421a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    @NonNull
    public String getValue() {
        return this.f32422b;
    }

    public int hashCode() {
        return ((this.f32421a.hashCode() ^ 1000003) * 1000003) ^ this.f32422b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f32421a + ", value=" + this.f32422b + "}";
    }

    private AutoValue_CrashlyticsReport_CustomAttribute(String str, String str2) {
        this.f32421a = str;
        this.f32422b = str2;
    }
}
