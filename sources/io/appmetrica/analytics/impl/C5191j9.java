package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5191j9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5191j9[] f77507c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f77508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f77509b;

    public C5191j9() {
        a();
    }

    public static C5191j9[] b() {
        if (f77507c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77507c == null) {
                        f77507c = new C5191j9[0];
                    }
                } finally {
                }
            }
        }
        return f77507c;
    }

    public final C5191j9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f77508a = bArr;
        this.f77509b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f77508a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f77508a);
        }
        return !Arrays.equals(this.f77509b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f77509b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f77508a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f77508a);
        }
        if (!Arrays.equals(this.f77509b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f77509b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5191j9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f77508a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f77509b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C5191j9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5191j9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5191j9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5191j9) MessageNano.mergeFrom(new C5191j9(), bArr);
    }
}
