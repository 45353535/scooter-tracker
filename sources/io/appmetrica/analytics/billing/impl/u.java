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
public final class u extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile u[] f74995c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f74996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f74997b;

    public u() {
        a();
    }

    public static u[] b() {
        if (f74995c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f74995c == null) {
                        f74995c = new u[0];
                    }
                } finally {
                }
            }
        }
        return f74995c;
    }

    public final u a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f74996a = bArr;
        this.f74997b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f74996a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f74996a);
        }
        return !Arrays.equals(this.f74997b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f74997b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f74996a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f74996a);
        }
        if (!Arrays.equals(this.f74997b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f74997b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f74996a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f74997b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static u b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new u().mergeFrom(codedInputByteBufferNano);
    }

    public static u a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (u) MessageNano.mergeFrom(new u(), bArr);
    }
}
