package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class y extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f75015f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f75016g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f75017h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile y[] f75018i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f75019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f75020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f75022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f75023e;

    public y() {
        a();
    }

    public static y[] b() {
        if (f75018i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f75018i == null) {
                        f75018i = new y[0];
                    }
                } finally {
                }
            }
        }
        return f75018i;
    }

    public final y a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f75019a = bArr;
        this.f75020b = 0L;
        this.f75021c = 0;
        this.f75022d = bArr;
        this.f75023e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f75019a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f75019a);
        }
        long j10 = this.f75020b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        int i10 = this.f75021c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        if (!Arrays.equals(this.f75022d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f75022d);
        }
        long j11 = this.f75023e;
        return j11 != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f75019a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f75019a);
        }
        long j10 = this.f75020b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        int i10 = this.f75021c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!Arrays.equals(this.f75022d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f75022d);
        }
        long j11 = this.f75023e;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static y b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new y().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f75019a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f75020b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f75021c = int32;
                }
            } else if (tag == 34) {
                this.f75022d = codedInputByteBufferNano.readBytes();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f75023e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static y a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (y) MessageNano.mergeFrom(new y(), bArr);
    }
}
