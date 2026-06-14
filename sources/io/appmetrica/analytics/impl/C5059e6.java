package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5059e6 extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f77084l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f77085m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile C5059e6[] f77086n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static byte[] f77087o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile boolean f77088p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5163i6 f77089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y5 f77090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f77091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f77092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C5111g6[] f77093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f77094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f77095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C5034d6 f77096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f77097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f77098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C4956a6[] f77099k;

    public C5059e6() {
        if (!f77088p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f77088p) {
                        f77087o = InternalNano.bytesDefaultValue("JVM");
                        f77088p = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C5059e6[] b() {
        if (f77086n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77086n == null) {
                        f77086n = new C5059e6[0];
                    }
                } finally {
                }
            }
        }
        return f77086n;
    }

    public final C5059e6 a() {
        this.f77089a = null;
        this.f77090b = null;
        this.f77091c = "";
        this.f77092d = -1;
        this.f77093e = C5111g6.b();
        this.f77094f = "";
        this.f77095g = 0;
        this.f77096h = null;
        this.f77097i = (byte[]) f77087o.clone();
        this.f77098j = WireFormatNano.EMPTY_BYTES;
        this.f77099k = C4956a6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5163i6 c5163i6 = this.f77089a;
        if (c5163i6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5163i6);
        }
        Y5 y52 = this.f77090b;
        if (y52 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, y52);
        }
        if (!this.f77091c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f77091c);
        }
        int i10 = this.f77092d;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        C5111g6[] c5111g6Arr = this.f77093e;
        int i11 = 0;
        if (c5111g6Arr != null && c5111g6Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C5111g6[] c5111g6Arr2 = this.f77093e;
                if (i12 >= c5111g6Arr2.length) {
                    break;
                }
                C5111g6 c5111g6 = c5111g6Arr2[i12];
                if (c5111g6 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c5111g6) + iComputeSerializedSize;
                }
                i12++;
            }
        }
        if (!this.f77094f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f77094f);
        }
        int i13 = this.f77095g;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i13);
        }
        C5034d6 c5034d6 = this.f77096h;
        if (c5034d6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, c5034d6);
        }
        if (!Arrays.equals(this.f77097i, f77087o)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f77097i);
        }
        if (!Arrays.equals(this.f77098j, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f77098j);
        }
        C4956a6[] c4956a6Arr = this.f77099k;
        if (c4956a6Arr != null && c4956a6Arr.length > 0) {
            while (true) {
                C4956a6[] c4956a6Arr2 = this.f77099k;
                if (i11 >= c4956a6Arr2.length) {
                    break;
                }
                C4956a6 c4956a6 = c4956a6Arr2[i11];
                if (c4956a6 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, c4956a6) + iComputeSerializedSize;
                }
                i11++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5163i6 c5163i6 = this.f77089a;
        if (c5163i6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5163i6);
        }
        Y5 y52 = this.f77090b;
        if (y52 != null) {
            codedOutputByteBufferNano.writeMessage(2, y52);
        }
        if (!this.f77091c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f77091c);
        }
        int i10 = this.f77092d;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        C5111g6[] c5111g6Arr = this.f77093e;
        int i11 = 0;
        if (c5111g6Arr != null && c5111g6Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C5111g6[] c5111g6Arr2 = this.f77093e;
                if (i12 >= c5111g6Arr2.length) {
                    break;
                }
                C5111g6 c5111g6 = c5111g6Arr2[i12];
                if (c5111g6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c5111g6);
                }
                i12++;
            }
        }
        if (!this.f77094f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f77094f);
        }
        int i13 = this.f77095g;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i13);
        }
        C5034d6 c5034d6 = this.f77096h;
        if (c5034d6 != null) {
            codedOutputByteBufferNano.writeMessage(8, c5034d6);
        }
        if (!Arrays.equals(this.f77097i, f77087o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f77097i);
        }
        if (!Arrays.equals(this.f77098j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f77098j);
        }
        C4956a6[] c4956a6Arr = this.f77099k;
        if (c4956a6Arr != null && c4956a6Arr.length > 0) {
            while (true) {
                C4956a6[] c4956a6Arr2 = this.f77099k;
                if (i11 >= c4956a6Arr2.length) {
                    break;
                }
                C4956a6 c4956a6 = c4956a6Arr2[i11];
                if (c4956a6 != null) {
                    codedOutputByteBufferNano.writeMessage(11, c4956a6);
                }
                i11++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5059e6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5059e6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5059e6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    if (this.f77089a == null) {
                        this.f77089a = new C5163i6();
                    }
                    codedInputByteBufferNano.readMessage(this.f77089a);
                    break;
                case 18:
                    if (this.f77090b == null) {
                        this.f77090b = new Y5();
                    }
                    codedInputByteBufferNano.readMessage(this.f77090b);
                    break;
                case 26:
                    this.f77091c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f77092d = int32;
                    }
                    break;
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C5111g6[] c5111g6Arr = this.f77093e;
                    int length = c5111g6Arr == null ? 0 : c5111g6Arr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    C5111g6[] c5111g6Arr2 = new C5111g6[i10];
                    if (length != 0) {
                        System.arraycopy(c5111g6Arr, 0, c5111g6Arr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        C5111g6 c5111g6 = new C5111g6();
                        c5111g6Arr2[length] = c5111g6;
                        codedInputByteBufferNano.readMessage(c5111g6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C5111g6 c5111g62 = new C5111g6();
                    c5111g6Arr2[length] = c5111g62;
                    codedInputByteBufferNano.readMessage(c5111g62);
                    this.f77093e = c5111g6Arr2;
                    break;
                case 50:
                    this.f77094f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == 0 || int322 == 1) {
                        this.f77095g = int322;
                    }
                    break;
                case 66:
                    if (this.f77096h == null) {
                        this.f77096h = new C5034d6();
                    }
                    codedInputByteBufferNano.readMessage(this.f77096h);
                    break;
                case 74:
                    this.f77097i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f77098j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C4956a6[] c4956a6Arr = this.f77099k;
                    int length2 = c4956a6Arr == null ? 0 : c4956a6Arr.length;
                    int i11 = repeatedFieldArrayLength2 + length2;
                    C4956a6[] c4956a6Arr2 = new C4956a6[i11];
                    if (length2 != 0) {
                        System.arraycopy(c4956a6Arr, 0, c4956a6Arr2, 0, length2);
                    }
                    while (length2 < i11 - 1) {
                        C4956a6 c4956a6 = new C4956a6();
                        c4956a6Arr2[length2] = c4956a6;
                        codedInputByteBufferNano.readMessage(c4956a6);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C4956a6 c4956a62 = new C4956a6();
                    c4956a6Arr2[length2] = c4956a62;
                    codedInputByteBufferNano.readMessage(c4956a62);
                    this.f77099k = c4956a6Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C5059e6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5059e6) MessageNano.mergeFrom(new C5059e6(), bArr);
    }
}
