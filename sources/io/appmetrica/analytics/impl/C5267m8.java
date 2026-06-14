package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5267m8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5267m8[] f77745c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f77746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77747b;

    public C5267m8() {
        a();
    }

    public static C5267m8[] b() {
        if (f77745c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77745c == null) {
                        f77745c = new C5267m8[0];
                    }
                } finally {
                }
            }
        }
        return f77745c;
    }

    public final C5267m8 a() {
        this.f77746a = 0L;
        this.f77747b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f77746a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        int i10 = this.f77747b;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f77746a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        int i10 = this.f77747b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5267m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f77746a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f77747b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static C5267m8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5267m8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5267m8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5267m8) MessageNano.mergeFrom(new C5267m8(), bArr);
    }
}
