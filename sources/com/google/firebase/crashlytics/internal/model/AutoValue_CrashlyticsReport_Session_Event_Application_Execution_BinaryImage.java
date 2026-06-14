package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32534d;

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f32535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f32536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f32538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f32539e;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage build() {
            String str;
            if (this.f32539e == 3 && (str = this.f32537c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(this.f32535a, this.f32536b, str, this.f32538d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f32539e & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((this.f32539e & 2) == 0) {
                sb2.append(" size");
            }
            if (this.f32537c == null) {
                sb2.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setBaseAddress(long j10) {
            this.f32535a = j10;
            this.f32539e = (byte) (this.f32539e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setName(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f32537c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setSize(long j10) {
            this.f32536b = j10;
            this.f32539e = (byte) (this.f32539e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuid(@Nullable String str) {
            this.f32538d = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) {
            CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
            if (this.f32531a == binaryImage.getBaseAddress() && this.f32532b == binaryImage.getSize() && this.f32533c.equals(binaryImage.getName()) && ((str = this.f32534d) != null ? str.equals(binaryImage.getUuid()) : binaryImage.getUuid() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @NonNull
    public long getBaseAddress() {
        return this.f32531a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @NonNull
    public String getName() {
        return this.f32533c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public long getSize() {
        return this.f32532b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @Nullable
    @Encodable.Ignore
    public String getUuid() {
        return this.f32534d;
    }

    public int hashCode() {
        long j10 = this.f32531a;
        long j11 = this.f32532b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f32533c.hashCode()) * 1000003;
        String str = this.f32534d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f32531a + ", size=" + this.f32532b + ", name=" + this.f32533c + ", uuid=" + this.f32534d + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(long j10, long j11, String str, String str2) {
        this.f32531a = j10;
        this.f32532b = j11;
        this.f32533c = str;
        this.f32534d = str2;
    }
}
