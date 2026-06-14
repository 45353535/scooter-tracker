package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5292n8 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C5292n8[] f77811f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f77812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f77813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5391r8 f77814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5317o8[] f77815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77816e;

    public C5292n8() {
        a();
    }

    public static C5292n8[] b() {
        if (f77811f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77811f == null) {
                        f77811f = new C5292n8[0];
                    }
                } finally {
                }
            }
        }
        return f77811f;
    }

    public final C5292n8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f77812a = bArr;
        this.f77813b = bArr;
        this.f77814c = null;
        this.f77815d = C5317o8.b();
        this.f77816e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f77812a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f77812a);
        }
        if (!Arrays.equals(this.f77813b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f77813b);
        }
        C5391r8 c5391r8 = this.f77814c;
        if (c5391r8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5391r8);
        }
        C5317o8[] c5317o8Arr = this.f77815d;
        if (c5317o8Arr != null && c5317o8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5317o8[] c5317o8Arr2 = this.f77815d;
                if (i10 >= c5317o8Arr2.length) {
                    break;
                }
                C5317o8 c5317o8 = c5317o8Arr2[i10];
                if (c5317o8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c5317o8) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        int i11 = this.f77816e;
        return i11 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(5, i11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f77812a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f77812a);
        }
        if (!Arrays.equals(this.f77813b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f77813b);
        }
        C5391r8 c5391r8 = this.f77814c;
        if (c5391r8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5391r8);
        }
        C5317o8[] c5317o8Arr = this.f77815d;
        if (c5317o8Arr != null && c5317o8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5317o8[] c5317o8Arr2 = this.f77815d;
                if (i10 >= c5317o8Arr2.length) {
                    break;
                }
                C5317o8 c5317o8 = c5317o8Arr2[i10];
                if (c5317o8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c5317o8);
                }
                i10++;
            }
        }
        int i11 = this.f77816e;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5292n8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5292n8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5292n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f77812a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f77813b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f77814c == null) {
                    this.f77814c = new C5391r8();
                }
                codedInputByteBufferNano.readMessage(this.f77814c);
            } else if (tag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C5317o8[] c5317o8Arr = this.f77815d;
                int length = c5317o8Arr == null ? 0 : c5317o8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5317o8[] c5317o8Arr2 = new C5317o8[i10];
                if (length != 0) {
                    System.arraycopy(c5317o8Arr, 0, c5317o8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5317o8 c5317o8 = new C5317o8();
                    c5317o8Arr2[length] = c5317o8;
                    codedInputByteBufferNano.readMessage(c5317o8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5317o8 c5317o82 = new C5317o8();
                c5317o8Arr2[length] = c5317o82;
                codedInputByteBufferNano.readMessage(c5317o82);
                this.f77815d = c5317o8Arr2;
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f77816e = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C5292n8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5292n8) MessageNano.mergeFrom(new C5292n8(), bArr);
    }
}
