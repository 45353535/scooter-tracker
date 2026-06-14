package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends CrashlyticsReport.ApplicationExitInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f32400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f32401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f32402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f32403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f32404i;

    static final class Builder extends CrashlyticsReport.ApplicationExitInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f32405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f32407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f32408d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f32409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f32410f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f32411g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f32412h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List f32413i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f32414j;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo build() {
            String str;
            if (this.f32414j == 63 && (str = this.f32406b) != null) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo(this.f32405a, str, this.f32407c, this.f32408d, this.f32409e, this.f32410f, this.f32411g, this.f32412h, this.f32413i);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f32414j & 1) == 0) {
                sb2.append(" pid");
            }
            if (this.f32406b == null) {
                sb2.append(" processName");
            }
            if ((this.f32414j & 2) == 0) {
                sb2.append(" reasonCode");
            }
            if ((this.f32414j & 4) == 0) {
                sb2.append(" importance");
            }
            if ((this.f32414j & 8) == 0) {
                sb2.append(" pss");
            }
            if ((this.f32414j & Ascii.DLE) == 0) {
                sb2.append(" rss");
            }
            if ((this.f32414j & 32) == 0) {
                sb2.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setBuildIdMappingForArch(@Nullable List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
            this.f32413i = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int i10) {
            this.f32408d = i10;
            this.f32414j = (byte) (this.f32414j | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPid(int i10) {
            this.f32405a = i10;
            this.f32414j = (byte) (this.f32414j | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f32406b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPss(long j10) {
            this.f32409e = j10;
            this.f32414j = (byte) (this.f32414j | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int i10) {
            this.f32407c = i10;
            this.f32414j = (byte) (this.f32414j | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setRss(long j10) {
            this.f32410f = j10;
            this.f32414j = (byte) (this.f32414j | Ascii.DLE);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long j10) {
            this.f32411g = j10;
            this.f32414j = (byte) (this.f32414j | 32);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(@Nullable String str) {
            this.f32412h = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.ApplicationExitInfo) {
            CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
            if (this.f32396a == applicationExitInfo.getPid() && this.f32397b.equals(applicationExitInfo.getProcessName()) && this.f32398c == applicationExitInfo.getReasonCode() && this.f32399d == applicationExitInfo.getImportance() && this.f32400e == applicationExitInfo.getPss() && this.f32401f == applicationExitInfo.getRss() && this.f32402g == applicationExitInfo.getTimestamp() && ((str = this.f32403h) != null ? str.equals(applicationExitInfo.getTraceFile()) : applicationExitInfo.getTraceFile() == null) && ((list = this.f32404i) != null ? list.equals(applicationExitInfo.getBuildIdMappingForArch()) : applicationExitInfo.getBuildIdMappingForArch() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @Nullable
    public List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> getBuildIdMappingForArch() {
        return this.f32404i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public int getImportance() {
        return this.f32399d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public int getPid() {
        return this.f32396a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public String getProcessName() {
        return this.f32397b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public long getPss() {
        return this.f32400e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public int getReasonCode() {
        return this.f32398c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public long getRss() {
        return this.f32401f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public long getTimestamp() {
        return this.f32402g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @Nullable
    public String getTraceFile() {
        return this.f32403h;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f32396a ^ 1000003) * 1000003) ^ this.f32397b.hashCode()) * 1000003) ^ this.f32398c) * 1000003) ^ this.f32399d) * 1000003;
        long j10 = this.f32400e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f32401f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f32402g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f32403h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f32404i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f32396a + ", processName=" + this.f32397b + ", reasonCode=" + this.f32398c + ", importance=" + this.f32399d + ", pss=" + this.f32400e + ", rss=" + this.f32401f + ", timestamp=" + this.f32402g + ", traceFile=" + this.f32403h + ", buildIdMappingForArch=" + this.f32404i + "}";
    }

    private AutoValue_CrashlyticsReport_ApplicationExitInfo(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f32396a = i10;
        this.f32397b = str;
        this.f32398c = i11;
        this.f32399d = i12;
        this.f32400e = j10;
        this.f32401f = j11;
        this.f32402g = j12;
        this.f32403h = str2;
        this.f32404i = list;
    }
}
