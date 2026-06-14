package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile f[] f78938b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[][] f78939a;

    public f() {
        a();
    }

    public static f[] b() {
        if (f78938b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78938b == null) {
                        f78938b = new f[0];
                    }
                } finally {
                }
            }
        }
        return f78938b;
    }

    public final f a() {
        this.f78939a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f78939a;
        if (bArr == null || bArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i10 = 0;
        int iComputeBytesSizeNoTag = 0;
        int i11 = 0;
        while (true) {
            byte[][] bArr2 = this.f78939a;
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
        byte[][] bArr = this.f78939a;
        if (bArr != null && bArr.length > 0) {
            int i10 = 0;
            while (true) {
                byte[][] bArr2 = this.f78939a;
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
    public final f mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                byte[][] bArr = this.f78939a;
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
                this.f78939a = bArr2;
            }
        }
        return this;
    }

    public static f b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new f().mergeFrom(codedInputByteBufferNano);
    }

    public static f a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (f) MessageNano.mergeFrom(new f(), bArr);
    }
}
