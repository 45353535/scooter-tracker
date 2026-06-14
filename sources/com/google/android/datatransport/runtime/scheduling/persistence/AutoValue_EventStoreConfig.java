package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_EventStoreConfig extends EventStoreConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f24536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f24537f;

    static final class Builder extends EventStoreConfig.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f24538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f24539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f24540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f24541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f24542e;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        EventStoreConfig a() {
            String str = "";
            if (this.f24538a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f24539b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f24540c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f24541d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f24542e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new AutoValue_EventStoreConfig(this.f24538a.longValue(), this.f24539b.intValue(), this.f24540c.intValue(), this.f24541d.longValue(), this.f24542e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        EventStoreConfig.Builder b(int i10) {
            this.f24540c = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        EventStoreConfig.Builder c(long j10) {
            this.f24541d = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        EventStoreConfig.Builder d(int i10) {
            this.f24539b = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        EventStoreConfig.Builder e(int i10) {
            this.f24542e = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        EventStoreConfig.Builder f(long j10) {
            this.f24538a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    int b() {
        return this.f24535d;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    long c() {
        return this.f24536e;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    int d() {
        return this.f24534c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    int e() {
        return this.f24537f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventStoreConfig) {
            EventStoreConfig eventStoreConfig = (EventStoreConfig) obj;
            if (this.f24533b == eventStoreConfig.f() && this.f24534c == eventStoreConfig.d() && this.f24535d == eventStoreConfig.b() && this.f24536e == eventStoreConfig.c() && this.f24537f == eventStoreConfig.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    long f() {
        return this.f24533b;
    }

    public int hashCode() {
        long j10 = this.f24533b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f24534c) * 1000003) ^ this.f24535d) * 1000003;
        long j11 = this.f24536e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f24537f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f24533b + ", loadBatchSize=" + this.f24534c + ", criticalSectionEnterTimeoutMs=" + this.f24535d + ", eventCleanUpAge=" + this.f24536e + ", maxBlobByteSizePerRow=" + this.f24537f + "}";
    }

    private AutoValue_EventStoreConfig(long j10, int i10, int i11, long j11, int i12) {
        this.f24533b = j10;
        this.f24534c = i10;
        this.f24535d = i11;
        this.f24536e = j11;
        this.f24537f = i12;
    }
}
