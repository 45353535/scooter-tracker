package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class Qi extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f76316f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f76317g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f76318h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile Qi[] f76319i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f76320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f76321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f76323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f76324e;

    public Qi() {
        a();
    }

    public static Qi[] b() {
        if (f76319i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76319i == null) {
                        f76319i = new Qi[0];
                    }
                } finally {
                }
            }
        }
        return f76319i;
    }

    public final Qi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f76320a = bArr;
        this.f76321b = 0L;
        this.f76322c = 0;
        this.f76323d = bArr;
        this.f76324e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f76320a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f76320a);
        }
        long j10 = this.f76321b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        int i10 = this.f76322c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        if (!Arrays.equals(this.f76323d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f76323d);
        }
        long j11 = this.f76324e;
        return j11 != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f76320a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f76320a);
        }
        long j10 = this.f76321b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        int i10 = this.f76322c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!Arrays.equals(this.f76323d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f76323d);
        }
        long j11 = this.f76324e;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Qi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Qi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f76320a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f76321b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f76322c = int32;
                }
            } else if (tag == 34) {
                this.f76323d = codedInputByteBufferNano.readBytes();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f76324e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static Qi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Qi) MessageNano.mergeFrom(new Qi(), bArr);
    }
}
