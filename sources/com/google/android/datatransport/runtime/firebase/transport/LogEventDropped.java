package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes7.dex */
public final class LogEventDropped {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final LogEventDropped f24421c = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Reason f24423b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f24424a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Reason f24425b = Reason.REASON_UNKNOWN;

        Builder() {
        }

        public LogEventDropped build() {
            return new LogEventDropped(this.f24424a, this.f24425b);
        }

        public Builder setEventsDroppedCount(long j10) {
            this.f24424a = j10;
            return this;
        }

        public Builder setReason(Reason reason) {
            this.f24425b = reason;
            return this;
        }
    }

    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f24427b;

        Reason(int i10) {
            this.f24427b = i10;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.f24427b;
        }
    }

    LogEventDropped(long j10, Reason reason) {
        this.f24422a = j10;
        this.f24423b = reason;
    }

    public static LogEventDropped getDefaultInstance() {
        return f24421c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    public long getEventsDroppedCount() {
        return this.f24422a;
    }

    @Protobuf(tag = 3)
    public Reason getReason() {
        return this.f24423b;
    }
}
