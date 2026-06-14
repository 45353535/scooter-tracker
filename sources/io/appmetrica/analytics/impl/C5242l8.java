package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5242l8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5242l8[] f77665b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[][] f77666a;

    public C5242l8() {
        a();
    }

    public static C5242l8[] b() {
        if (f77665b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77665b == null) {
                        f77665b = new C5242l8[0];
                    }
                } finally {
                }
            }
        }
        return f77665b;
    }

    public final C5242l8 a() {
        this.f77666a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f77666a;
        if (bArr == null || bArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i10 = 0;
        int iComputeBytesSizeNoTag = 0;
        int i11 = 0;
        while (true) {
            byte[][] bArr2 = this.f77666a;
            if (i10 >= bArr2.length) {
                return iComputeSerializedSize + iComputeBytesSizeNoTag + i11;
            }
            byte[] bArr3 = bArr2[i10];
            if (bArr3 != null) {
                i11++;
                iComputeBytesSizeNoTag = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + iComputeBytesSizeNoTag;
            }
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[][] bArr = this.f77666a;
        if (bArr != null && bArr.length > 0) {
            int i10 = 0;
            while (true) {
                byte[][] bArr2 = this.f77666a;
                if (i10 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i10];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5242l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                byte[][] bArr = this.f77666a;
                int length = bArr == null ? 0 : bArr.length;
                int i10 = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i10][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i10 - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f77666a = bArr2;
            }
        }
        return this;
    }

    public static C5242l8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5242l8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5242l8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5242l8) MessageNano.mergeFrom(new C5242l8(), bArr);
    }
}
