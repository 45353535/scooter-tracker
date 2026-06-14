package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5430sm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5430sm[] f78246b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f78247a;

    public C5430sm() {
        a();
    }

    public static C5430sm[] b() {
        if (f78246b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78246b == null) {
                        f78246b = new C5430sm[0];
                    }
                } finally {
                }
            }
        }
        return f78246b;
    }

    public final C5430sm a() {
        this.f78247a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f78247a;
        return j10 != 10000 ? CodedOutputByteBufferNano.computeInt64Size(1, j10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f78247a;
        if (j10 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5430sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f78247a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C5430sm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5430sm) MessageNano.mergeFrom(new C5430sm(), bArr);
    }

    public static C5430sm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5430sm().mergeFrom(codedInputByteBufferNano);
    }
}
