package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5243l9 extends MessageNano {
    public static final int A = 17;
    public static final int B = 18;
    public static final int C = 19;
    public static final int D = 20;
    public static final int E = 21;
    public static final int F = 25;
    public static final int G = 26;
    public static final int H = 27;
    public static final int I = 29;
    public static final int J = 35;
    public static final int K = 38;
    public static final int L = 40;
    public static final int M = 42;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static volatile C5243l9[] T = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f77667t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f77668u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f77669v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f77670w = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f77671x = 7;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f77672y = 13;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f77673z = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f77674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f77675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f77677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f77678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C5114g9 f77679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C5217k9 f77680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f77681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f77682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f77683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f77684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f77685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f77686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f77687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f77688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f77689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f77690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f77691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C5191j9[] f77692s;

    public C5243l9() {
        a();
    }

    public static C5243l9[] b() {
        if (T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (T == null) {
                        T = new C5243l9[0];
                    }
                } finally {
                }
            }
        }
        return T;
    }

    public final C5243l9 a() {
        this.f77674a = 0L;
        this.f77675b = 0L;
        this.f77676c = 0;
        this.f77677d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f77678e = bArr;
        this.f77679f = null;
        this.f77680g = null;
        this.f77681h = "";
        this.f77682i = 0;
        this.f77683j = 0;
        this.f77684k = -1;
        this.f77685l = bArr;
        this.f77686m = -1;
        this.f77687n = 0L;
        this.f77688o = 0L;
        this.f77689p = 0;
        this.f77690q = false;
        this.f77691r = 1L;
        this.f77692s = C5191j9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f77676c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f77675b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f77674a) + super.computeSerializedSize();
        if (!this.f77677d.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f77677d);
        }
        byte[] bArr = this.f77678e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f77678e);
        }
        C5114g9 c5114g9 = this.f77679f;
        if (c5114g9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c5114g9);
        }
        C5217k9 c5217k9 = this.f77680g;
        if (c5217k9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c5217k9);
        }
        if (!this.f77681h.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f77681h);
        }
        int i10 = this.f77682i;
        if (i10 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i10);
        }
        int i11 = this.f77683j;
        if (i11 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i11);
        }
        int i12 = this.f77684k;
        if (i12 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i12);
        }
        if (!Arrays.equals(this.f77685l, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f77685l);
        }
        int i13 = this.f77686m;
        if (i13 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i13);
        }
        long j10 = this.f77687n;
        if (j10 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j10);
        }
        long j11 = this.f77688o;
        if (j11 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j11);
        }
        int i14 = this.f77689p;
        if (i14 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i14);
        }
        boolean z10 = this.f77690q;
        if (z10) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z10);
        }
        long j12 = this.f77691r;
        if (j12 != 1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j12);
        }
        C5191j9[] c5191j9Arr = this.f77692s;
        if (c5191j9Arr != null && c5191j9Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C5191j9[] c5191j9Arr2 = this.f77692s;
                if (i15 >= c5191j9Arr2.length) {
                    break;
                }
                C5191j9 c5191j9 = c5191j9Arr2[i15];
                if (c5191j9 != null) {
                    iComputeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c5191j9) + iComputeUInt32Size;
                }
                i15++;
            }
        }
        return iComputeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f77674a);
        codedOutputByteBufferNano.writeUInt64(2, this.f77675b);
        codedOutputByteBufferNano.writeUInt32(3, this.f77676c);
        if (!this.f77677d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f77677d);
        }
        byte[] bArr = this.f77678e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f77678e);
        }
        C5114g9 c5114g9 = this.f77679f;
        if (c5114g9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c5114g9);
        }
        C5217k9 c5217k9 = this.f77680g;
        if (c5217k9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c5217k9);
        }
        if (!this.f77681h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f77681h);
        }
        int i10 = this.f77682i;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i10);
        }
        int i11 = this.f77683j;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i11);
        }
        int i12 = this.f77684k;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i12);
        }
        if (!Arrays.equals(this.f77685l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f77685l);
        }
        int i13 = this.f77686m;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i13);
        }
        long j10 = this.f77687n;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j10);
        }
        long j11 = this.f77688o;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j11);
        }
        int i14 = this.f77689p;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i14);
        }
        boolean z10 = this.f77690q;
        if (z10) {
            codedOutputByteBufferNano.writeBool(23, z10);
        }
        long j12 = this.f77691r;
        if (j12 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j12);
        }
        C5191j9[] c5191j9Arr = this.f77692s;
        if (c5191j9Arr != null && c5191j9Arr.length > 0) {
            int i15 = 0;
            while (true) {
                C5191j9[] c5191j9Arr2 = this.f77692s;
                if (i15 >= c5191j9Arr2.length) {
                    break;
                }
                C5191j9 c5191j9 = c5191j9Arr2[i15];
                if (c5191j9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c5191j9);
                }
                i15++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5243l9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5243l9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5243l9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f77674a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f77675b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f77676c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f77677d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f77678e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f77679f == null) {
                        this.f77679f = new C5114g9();
                    }
                    codedInputByteBufferNano.readMessage(this.f77679f);
                    break;
                case 58:
                    if (this.f77680g == null) {
                        this.f77680g = new C5217k9();
                    }
                    codedInputByteBufferNano.readMessage(this.f77680g);
                    break;
                case 66:
                    this.f77681h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f77682i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f77683j = int32;
                    }
                    break;
                case 104:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == -1 || int322 == 0 || int322 == 1) {
                        this.f77684k = int322;
                    }
                    break;
                case 114:
                    this.f77685l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int int323 = codedInputByteBufferNano.readInt32();
                    if (int323 == -1 || int323 == 0 || int323 == 1) {
                        this.f77686m = int323;
                    }
                    break;
                case 128:
                    this.f77687n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f77688o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int int324 = codedInputByteBufferNano.readInt32();
                    if (int324 == 0 || int324 == 1 || int324 == 2) {
                        this.f77689p = int324;
                    }
                    break;
                case 184:
                    this.f77690q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f77691r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C5191j9[] c5191j9Arr = this.f77692s;
                    int length = c5191j9Arr == null ? 0 : c5191j9Arr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    C5191j9[] c5191j9Arr2 = new C5191j9[i10];
                    if (length != 0) {
                        System.arraycopy(c5191j9Arr, 0, c5191j9Arr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        C5191j9 c5191j9 = new C5191j9();
                        c5191j9Arr2[length] = c5191j9;
                        codedInputByteBufferNano.readMessage(c5191j9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C5191j9 c5191j92 = new C5191j9();
                    c5191j9Arr2[length] = c5191j92;
                    codedInputByteBufferNano.readMessage(c5191j92);
                    this.f77692s = c5191j9Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C5243l9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5243l9) MessageNano.mergeFrom(new C5243l9(), bArr);
    }
}
