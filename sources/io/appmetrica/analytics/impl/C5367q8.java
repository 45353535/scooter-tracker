package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5367q8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5367q8[] f78046c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f78047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f78048b;

    public C5367q8() {
        a();
    }

    public static C5367q8[] b() {
        if (f78046c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78046c == null) {
                        f78046c = new C5367q8[0];
                    }
                } finally {
                }
            }
        }
        return f78046c;
    }

    public final C5367q8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f78047a = bArr;
        this.f78048b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f78047a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f78047a);
        }
        return !Arrays.equals(this.f78048b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f78048b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f78047a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f78047a);
        }
        if (!Arrays.equals(this.f78048b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f78048b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5367q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f78047a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f78048b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C5367q8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5367q8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5367q8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5367q8) MessageNano.mergeFrom(new C5367q8(), bArr);
    }
}
