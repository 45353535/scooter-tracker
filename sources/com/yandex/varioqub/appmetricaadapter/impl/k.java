package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends MessageNano {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f68311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f68312b;

    public k() {
        a();
    }

    public final void a() {
        this.f68311a = "";
        this.f68312b = WireFormatNano.EMPTY_LONG_ARRAY;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f68311a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f68311a);
        }
        long[] jArr = this.f68312b;
        if (jArr == null || jArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i10 = 0;
        int iComputeInt64SizeNoTag = 0;
        while (true) {
            long[] jArr2 = this.f68312b;
            if (i10 >= jArr2.length) {
                return iComputeSerializedSize + iComputeInt64SizeNoTag + jArr2.length;
            }
            iComputeInt64SizeNoTag += CodedOutputByteBufferNano.computeInt64SizeNoTag(jArr2[i10]);
            i10++;
        }
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f68311a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                long[] jArr = this.f68312b;
                int length = jArr == null ? 0 : jArr.length;
                int i10 = repeatedFieldArrayLength + length;
                long[] jArr2 = new long[i10];
                if (length != 0) {
                    System.arraycopy(jArr, 0, jArr2, 0, length);
                }
                while (length < i10 - 1) {
                    jArr2[length] = codedInputByteBufferNano.readInt64();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                jArr2[length] = codedInputByteBufferNano.readInt64();
                this.f68312b = jArr2;
            } else if (tag == 18) {
                int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i11 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt64();
                    i11++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                long[] jArr3 = this.f68312b;
                int length2 = jArr3 == null ? 0 : jArr3.length;
                int i12 = i11 + length2;
                long[] jArr4 = new long[i12];
                if (length2 != 0) {
                    System.arraycopy(jArr3, 0, jArr4, 0, length2);
                }
                while (length2 < i12) {
                    jArr4[length2] = codedInputByteBufferNano.readInt64();
                    length2++;
                }
                this.f68312b = jArr4;
                codedInputByteBufferNano.popLimit(iPushLimit);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f68311a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f68311a);
        }
        long[] jArr = this.f68312b;
        if (jArr != null && jArr.length > 0) {
            int i10 = 0;
            while (true) {
                long[] jArr2 = this.f68312b;
                if (i10 >= jArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt64(2, jArr2[i10]);
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
