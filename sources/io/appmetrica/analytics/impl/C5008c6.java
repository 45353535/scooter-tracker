package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5008c6 extends MessageNano {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f76944k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f76945l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile C5008c6[] f76946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static byte[] f76947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile boolean f76948o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5163i6 f76949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y5 f76950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f76951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C5111g6[] f76953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f76954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C4982b6 f76955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f76956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f76957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C4956a6[] f76958j;

    public C5008c6() {
        if (!f76948o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f76948o) {
                        f76947n = InternalNano.bytesDefaultValue("JVM");
                        f76948o = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C5008c6[] b() {
        if (f76946m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76946m == null) {
                        f76946m = new C5008c6[0];
                    }
                } finally {
                }
            }
        }
        return f76946m;
    }

    public final C5008c6 a() {
        this.f76949a = null;
        this.f76950b = null;
        this.f76951c = "";
        this.f76952d = -1;
        this.f76953e = C5111g6.b();
        this.f76954f = 0;
        this.f76955g = null;
        this.f76956h = (byte[]) f76947n.clone();
        this.f76957i = WireFormatNano.EMPTY_BYTES;
        this.f76958j = C4956a6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5163i6 c5163i6 = this.f76949a;
        if (c5163i6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5163i6);
        }
        Y5 y52 = this.f76950b;
        if (y52 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, y52);
        }
        if (!this.f76951c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f76951c);
        }
        int i10 = this.f76952d;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        C5111g6[] c5111g6Arr = this.f76953e;
        int i11 = 0;
        if (c5111g6Arr != null && c5111g6Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C5111g6[] c5111g6Arr2 = this.f76953e;
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
        int i13 = this.f76954f;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i13);
        }
        C4982b6 c4982b6 = this.f76955g;
        if (c4982b6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c4982b6);
        }
        if (!Arrays.equals(this.f76956h, f76947n)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f76956h);
        }
        if (!Arrays.equals(this.f76957i, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f76957i);
        }
        C4956a6[] c4956a6Arr = this.f76958j;
        if (c4956a6Arr != null && c4956a6Arr.length > 0) {
            while (true) {
                C4956a6[] c4956a6Arr2 = this.f76958j;
                if (i11 >= c4956a6Arr2.length) {
                    break;
                }
                C4956a6 c4956a6 = c4956a6Arr2[i11];
                if (c4956a6 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c4956a6) + iComputeSerializedSize;
                }
                i11++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5163i6 c5163i6 = this.f76949a;
        if (c5163i6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5163i6);
        }
        Y5 y52 = this.f76950b;
        if (y52 != null) {
            codedOutputByteBufferNano.writeMessage(2, y52);
        }
        if (!this.f76951c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f76951c);
        }
        int i10 = this.f76952d;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        C5111g6[] c5111g6Arr = this.f76953e;
        int i11 = 0;
        if (c5111g6Arr != null && c5111g6Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C5111g6[] c5111g6Arr2 = this.f76953e;
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
        int i13 = this.f76954f;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i13);
        }
        C4982b6 c4982b6 = this.f76955g;
        if (c4982b6 != null) {
            codedOutputByteBufferNano.writeMessage(7, c4982b6);
        }
        if (!Arrays.equals(this.f76956h, f76947n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f76956h);
        }
        if (!Arrays.equals(this.f76957i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f76957i);
        }
        C4956a6[] c4956a6Arr = this.f76958j;
        if (c4956a6Arr != null && c4956a6Arr.length > 0) {
            while (true) {
                C4956a6[] c4956a6Arr2 = this.f76958j;
                if (i11 >= c4956a6Arr2.length) {
                    break;
                }
                C4956a6 c4956a6 = c4956a6Arr2[i11];
                if (c4956a6 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c4956a6);
                }
                i11++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5008c6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5008c6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5008c6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    if (this.f76949a == null) {
                        this.f76949a = new C5163i6();
                    }
                    codedInputByteBufferNano.readMessage(this.f76949a);
                    break;
                case 18:
                    if (this.f76950b == null) {
                        this.f76950b = new Y5();
                    }
                    codedInputByteBufferNano.readMessage(this.f76950b);
                    break;
                case 26:
                    this.f76951c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f76952d = int32;
                    }
                    break;
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C5111g6[] c5111g6Arr = this.f76953e;
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
                    this.f76953e = c5111g6Arr2;
                    break;
                case 48:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == 0 || int322 == 1) {
                        this.f76954f = int322;
                    }
                    break;
                case 58:
                    if (this.f76955g == null) {
                        this.f76955g = new C4982b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f76955g);
                    break;
                case 66:
                    this.f76956h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f76957i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C4956a6[] c4956a6Arr = this.f76958j;
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
                    this.f76958j = c4956a6Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C5008c6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5008c6) MessageNano.mergeFrom(new C5008c6(), bArr);
    }
}
