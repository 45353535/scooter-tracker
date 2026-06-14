package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes7.dex */
public final class GlobalMetrics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final GlobalMetrics f24418b = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StorageMetrics f24419a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private StorageMetrics f24420a = null;

        Builder() {
        }

        public GlobalMetrics build() {
            return new GlobalMetrics(this.f24420a);
        }

        public Builder setStorageMetrics(StorageMetrics storageMetrics) {
            this.f24420a = storageMetrics;
            return this;
        }
    }

    GlobalMetrics(StorageMetrics storageMetrics) {
        this.f24419a = storageMetrics;
    }

    public static GlobalMetrics getDefaultInstance() {
        return f24418b;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Encodable.Ignore
    public StorageMetrics getStorageMetrics() {
        StorageMetrics storageMetrics = this.f24419a;
        return storageMetrics == null ? StorageMetrics.getDefaultInstance() : storageMetrics;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "storageMetrics")
    public StorageMetrics getStorageMetricsInternal() {
        return this.f24419a;
    }
}
