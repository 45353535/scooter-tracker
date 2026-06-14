package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5368q9 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f78049g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f78050h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f78051i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile C5368q9[] f78052j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5293n9[] f78053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5166i9 f78054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5088f9[] f78055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5318o9[] f78056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f78057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[][] f78058f;

    public C5368q9() {
        a();
    }

    public static C5368q9[] b() {
        if (f78052j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78052j == null) {
                        f78052j = new C5368q9[0];
                    }
                } finally {
                }
            }
        }
        return f78052j;
    }

    public final C5368q9 a() {
        this.f78053a = C5293n9.b();
        this.f78054b = null;
        this.f78055c = C5088f9.b();
        this.f78056d = C5318o9.b();
        this.f78057e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f78058f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5293n9[] c5293n9Arr = this.f78053a;
        int i10 = 0;
        if (c5293n9Arr != null && c5293n9Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C5293n9[] c5293n9Arr2 = this.f78053a;
                if (i11 >= c5293n9Arr2.length) {
                    break;
                }
                C5293n9 c5293n9 = c5293n9Arr2[i11];
                if (c5293n9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c5293n9) + iComputeSerializedSize;
                }
                i11++;
            }
        }
        C5166i9 c5166i9 = this.f78054b;
        if (c5166i9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c5166i9);
        }
        C5088f9[] c5088f9Arr = this.f78055c;
        if (c5088f9Arr != null && c5088f9Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C5088f9[] c5088f9Arr2 = this.f78055c;
                if (i12 >= c5088f9Arr2.length) {
                    break;
                }
                C5088f9 c5088f9 = c5088f9Arr2[i12];
                if (c5088f9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c5088f9) + iComputeSerializedSize;
                }
                i12++;
            }
        }
        C5318o9[] c5318o9Arr = this.f78056d;
        if (c5318o9Arr != null && c5318o9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C5318o9[] c5318o9Arr2 = this.f78056d;
                if (i13 >= c5318o9Arr2.length) {
                    break;
                }
                C5318o9 c5318o9 = c5318o9Arr2[i13];
                if (c5318o9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c5318o9) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        String[] strArr = this.f78057e;
        if (strArr != null && strArr.length > 0) {
            int i14 = 0;
            int iComputeStringSizeNoTag = 0;
            int i15 = 0;
            while (true) {
                String[] strArr2 = this.f78057e;
                if (i14 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i14];
                if (str != null) {
                    i15++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i14++;
            }
            iComputeSerializedSize = iComputeSerializedSize + iComputeStringSizeNoTag + i15;
        }
        byte[][] bArr = this.f78058f;
        if (bArr == null || bArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeBytesSizeNoTag = 0;
        int i16 = 0;
        while (true) {
            byte[][] bArr2 = this.f78058f;
            if (i10 >= bArr2.length) {
                return iComputeSerializedSize + iComputeBytesSizeNoTag + i16;
            }
            byte[] bArr3 = bArr2[i10];
            if (bArr3 != null) {
                i16++;
                iComputeBytesSizeNoTag = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + iComputeBytesSizeNoTag;
            }
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5293n9[] c5293n9Arr = this.f78053a;
        int i10 = 0;
        if (c5293n9Arr != null && c5293n9Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C5293n9[] c5293n9Arr2 = this.f78053a;
                if (i11 >= c5293n9Arr2.length) {
                    break;
                }
                C5293n9 c5293n9 = c5293n9Arr2[i11];
                if (c5293n9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c5293n9);
                }
                i11++;
            }
        }
        C5166i9 c5166i9 = this.f78054b;
        if (c5166i9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5166i9);
        }
        C5088f9[] c5088f9Arr = this.f78055c;
        if (c5088f9Arr != null && c5088f9Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C5088f9[] c5088f9Arr2 = this.f78055c;
                if (i12 >= c5088f9Arr2.length) {
                    break;
                }
                C5088f9 c5088f9 = c5088f9Arr2[i12];
                if (c5088f9 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c5088f9);
                }
                i12++;
            }
        }
        C5318o9[] c5318o9Arr = this.f78056d;
        if (c5318o9Arr != null && c5318o9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C5318o9[] c5318o9Arr2 = this.f78056d;
                if (i13 >= c5318o9Arr2.length) {
                    break;
                }
                C5318o9 c5318o9 = c5318o9Arr2[i13];
                if (c5318o9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c5318o9);
                }
                i13++;
            }
        }
        String[] strArr = this.f78057e;
        if (strArr != null && strArr.length > 0) {
            int i14 = 0;
            while (true) {
                String[] strArr2 = this.f78057e;
                if (i14 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i14];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i14++;
            }
        }
        byte[][] bArr = this.f78058f;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f78058f;
                if (i10 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i10];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(12, bArr3);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5368q9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5368q9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5368q9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C5293n9[] c5293n9Arr = this.f78053a;
                int length = c5293n9Arr == null ? 0 : c5293n9Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5293n9[] c5293n9Arr2 = new C5293n9[i10];
                if (length != 0) {
                    System.arraycopy(c5293n9Arr, 0, c5293n9Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5293n9 c5293n9 = new C5293n9();
                    c5293n9Arr2[length] = c5293n9;
                    codedInputByteBufferNano.readMessage(c5293n9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5293n9 c5293n92 = new C5293n9();
                c5293n9Arr2[length] = c5293n92;
                codedInputByteBufferNano.readMessage(c5293n92);
                this.f78053a = c5293n9Arr2;
            } else if (tag == 34) {
                if (this.f78054b == null) {
                    this.f78054b = new C5166i9();
                }
                codedInputByteBufferNano.readMessage(this.f78054b);
            } else if (tag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C5088f9[] c5088f9Arr = this.f78055c;
                int length2 = c5088f9Arr == null ? 0 : c5088f9Arr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                C5088f9[] c5088f9Arr2 = new C5088f9[i11];
                if (length2 != 0) {
                    System.arraycopy(c5088f9Arr, 0, c5088f9Arr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    C5088f9 c5088f9 = new C5088f9();
                    c5088f9Arr2[length2] = c5088f9;
                    codedInputByteBufferNano.readMessage(c5088f9);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C5088f9 c5088f92 = new C5088f9();
                c5088f9Arr2[length2] = c5088f92;
                codedInputByteBufferNano.readMessage(c5088f92);
                this.f78055c = c5088f9Arr2;
            } else if (tag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C5318o9[] c5318o9Arr = this.f78056d;
                int length3 = c5318o9Arr == null ? 0 : c5318o9Arr.length;
                int i12 = repeatedFieldArrayLength3 + length3;
                C5318o9[] c5318o9Arr2 = new C5318o9[i12];
                if (length3 != 0) {
                    System.arraycopy(c5318o9Arr, 0, c5318o9Arr2, 0, length3);
                }
                while (length3 < i12 - 1) {
                    C5318o9 c5318o9 = new C5318o9();
                    c5318o9Arr2[length3] = c5318o9;
                    codedInputByteBufferNano.readMessage(c5318o9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C5318o9 c5318o92 = new C5318o9();
                c5318o9Arr2[length3] = c5318o92;
                codedInputByteBufferNano.readMessage(c5318o92);
                this.f78056d = c5318o9Arr2;
            } else if (tag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f78057e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i13 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i13];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i13 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f78057e = strArr2;
            } else if (tag != 98) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                byte[][] bArr = this.f78058f;
                int length5 = bArr == null ? 0 : bArr.length;
                int i14 = repeatedFieldArrayLength5 + length5;
                byte[][] bArr2 = new byte[i14][];
                if (length5 != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length5);
                }
                while (length5 < i14 - 1) {
                    bArr2[length5] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length5++;
                }
                bArr2[length5] = codedInputByteBufferNano.readBytes();
                this.f78058f = bArr2;
            }
        }
        return this;
    }

    public static C5368q9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5368q9) MessageNano.mergeFrom(new C5368q9(), bArr);
    }
}
