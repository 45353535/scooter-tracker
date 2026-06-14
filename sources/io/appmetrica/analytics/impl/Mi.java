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
public final class Mi extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Mi[] f76138c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f76139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f76140b;

    public Mi() {
        a();
    }

    public static Mi[] b() {
        if (f76138c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76138c == null) {
                        f76138c = new Mi[0];
                    }
                } finally {
                }
            }
        }
        return f76138c;
    }

    public final Mi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f76139a = bArr;
        this.f76140b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f76139a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f76139a);
        }
        return !Arrays.equals(this.f76140b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f76140b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f76139a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f76139a);
        }
        if (!Arrays.equals(this.f76140b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f76140b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f76139a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f76140b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Mi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Mi().mergeFrom(codedInputByteBufferNano);
    }

    public static Mi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Mi) MessageNano.mergeFrom(new Mi(), bArr);
    }
}
