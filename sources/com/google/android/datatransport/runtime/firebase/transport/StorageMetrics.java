package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes7.dex */
public final class StorageMetrics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final StorageMetrics f24433c = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24435b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f24436a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f24437b = 0;

        Builder() {
        }

        public StorageMetrics build() {
            return new StorageMetrics(this.f24436a, this.f24437b);
        }

        public Builder setCurrentCacheSizeBytes(long j10) {
            this.f24436a = j10;
            return this;
        }

        public Builder setMaxCacheSizeBytes(long j10) {
            this.f24437b = j10;
            return this;
        }
    }

    StorageMetrics(long j10, long j11) {
        this.f24434a = j10;
        this.f24435b = j11;
    }

    public static StorageMetrics getDefaultInstance() {
        return f24433c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    public long getCurrentCacheSizeBytes() {
        return this.f24434a;
    }

    @Protobuf(tag = 2)
    public long getMaxCacheSizeBytes() {
        return this.f24435b;
    }
}
