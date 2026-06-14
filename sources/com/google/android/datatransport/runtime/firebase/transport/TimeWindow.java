package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes7.dex */
public final class TimeWindow {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final TimeWindow f24438c = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24440b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f24441a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f24442b = 0;

        Builder() {
        }

        public TimeWindow build() {
            return new TimeWindow(this.f24441a, this.f24442b);
        }

        public Builder setEndMs(long j10) {
            this.f24442b = j10;
            return this;
        }

        public Builder setStartMs(long j10) {
            this.f24441a = j10;
            return this;
        }
    }

    TimeWindow(long j10, long j11) {
        this.f24439a = j10;
        this.f24440b = j11;
    }

    public static TimeWindow getDefaultInstance() {
        return f24438c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    public long getEndMs() {
        return this.f24440b;
    }

    @Protobuf(tag = 1)
    public long getStartMs() {
        return this.f24439a;
    }
}
