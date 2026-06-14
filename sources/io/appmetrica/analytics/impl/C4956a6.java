package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4956a6 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4956a6[] f76796c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f76797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f76798b;

    public C4956a6() {
        a();
    }

    public static C4956a6[] b() {
        if (f76796c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76796c == null) {
                        f76796c = new C4956a6[0];
                    }
                } finally {
                }
            }
        }
        return f76796c;
    }

    public final C4956a6 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f76797a = bArr;
        this.f76798b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f76797a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f76797a);
        }
        return !Arrays.equals(this.f76798b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f76798b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f76797a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f76797a);
        }
        if (!Arrays.equals(this.f76798b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f76798b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4956a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f76797a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f76798b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C4956a6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4956a6().mergeFrom(codedInputByteBufferNano);
    }

    public static C4956a6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4956a6) MessageNano.mergeFrom(new C4956a6(), bArr);
    }
}
