package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5441t8 extends MessageNano {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile C5441t8[] f78276h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f78277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f78278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5242l8 f78279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5391r8 f78280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C5416s8 f78281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C5416s8 f78282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C5466u8[] f78283g;

    public C5441t8() {
        a();
    }

    public static C5441t8[] b() {
        if (f78276h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78276h == null) {
                        f78276h = new C5441t8[0];
                    }
                } finally {
                }
            }
        }
        return f78276h;
    }

    public final C5441t8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f78277a = bArr;
        this.f78278b = bArr;
        this.f78279c = null;
        this.f78280d = null;
        this.f78281e = null;
        this.f78282f = null;
        this.f78283g = C5466u8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f78277a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f78277a);
        }
        if (!Arrays.equals(this.f78278b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f78278b);
        }
        C5242l8 c5242l8 = this.f78279c;
        if (c5242l8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5242l8);
        }
        C5391r8 c5391r8 = this.f78280d;
        if (c5391r8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c5391r8);
        }
        C5416s8 c5416s8 = this.f78281e;
        if (c5416s8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c5416s8);
        }
        C5416s8 c5416s82 = this.f78282f;
        if (c5416s82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c5416s82);
        }
        C5466u8[] c5466u8Arr = this.f78283g;
        if (c5466u8Arr != null && c5466u8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5466u8[] c5466u8Arr2 = this.f78283g;
                if (i10 >= c5466u8Arr2.length) {
                    break;
                }
                C5466u8 c5466u8 = c5466u8Arr2[i10];
                if (c5466u8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c5466u8) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f78277a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f78277a);
        }
        if (!Arrays.equals(this.f78278b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f78278b);
        }
        C5242l8 c5242l8 = this.f78279c;
        if (c5242l8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5242l8);
        }
        C5391r8 c5391r8 = this.f78280d;
        if (c5391r8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5391r8);
        }
        C5416s8 c5416s8 = this.f78281e;
        if (c5416s8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c5416s8);
        }
        C5416s8 c5416s82 = this.f78282f;
        if (c5416s82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c5416s82);
        }
        C5466u8[] c5466u8Arr = this.f78283g;
        if (c5466u8Arr != null && c5466u8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5466u8[] c5466u8Arr2 = this.f78283g;
                if (i10 >= c5466u8Arr2.length) {
                    break;
                }
                C5466u8 c5466u8 = c5466u8Arr2[i10];
                if (c5466u8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c5466u8);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5441t8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5441t8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5441t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f78277a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f78278b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f78279c == null) {
                    this.f78279c = new C5242l8();
                }
                codedInputByteBufferNano.readMessage(this.f78279c);
            } else if (tag == 34) {
                if (this.f78280d == null) {
                    this.f78280d = new C5391r8();
                }
                codedInputByteBufferNano.readMessage(this.f78280d);
            } else if (tag == 42) {
                if (this.f78281e == null) {
                    this.f78281e = new C5416s8();
                }
                codedInputByteBufferNano.readMessage(this.f78281e);
            } else if (tag == 50) {
                if (this.f78282f == null) {
                    this.f78282f = new C5416s8();
                }
                codedInputByteBufferNano.readMessage(this.f78282f);
            } else if (tag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C5466u8[] c5466u8Arr = this.f78283g;
                int length = c5466u8Arr == null ? 0 : c5466u8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5466u8[] c5466u8Arr2 = new C5466u8[i10];
                if (length != 0) {
                    System.arraycopy(c5466u8Arr, 0, c5466u8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5466u8 c5466u8 = new C5466u8();
                    c5466u8Arr2[length] = c5466u8;
                    codedInputByteBufferNano.readMessage(c5466u8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5466u8 c5466u82 = new C5466u8();
                c5466u8Arr2[length] = c5466u82;
                codedInputByteBufferNano.readMessage(c5466u82);
                this.f78283g = c5466u8Arr2;
            }
        }
        return this;
    }

    public static C5441t8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5441t8) MessageNano.mergeFrom(new C5441t8(), bArr);
    }
}
