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
public final class Qk extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Qk[] f76325c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f76326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f76327b;

    public Qk() {
        a();
    }

    public static Qk[] b() {
        if (f76325c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76325c == null) {
                        f76325c = new Qk[0];
                    }
                } finally {
                }
            }
        }
        return f76325c;
    }

    public final Qk a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f76326a = bArr;
        this.f76327b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f76326a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f76326a);
        }
        return !Arrays.equals(this.f76327b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f76327b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f76326a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f76326a);
        }
        if (!Arrays.equals(this.f76327b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f76327b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f76326a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f76327b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Qk b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Qk().mergeFrom(codedInputByteBufferNano);
    }

    public static Qk a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Qk) MessageNano.mergeFrom(new Qk(), bArr);
    }
}
