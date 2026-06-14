package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5293n9 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f77817d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f77818e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f77819f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f77820g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f77821h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f77822i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f77823j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f77824k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f77825l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f77826m = 9;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f77827n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f77828o = 11;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f77829p = 12;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile C5293n9[] f77830q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f77831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5268m9 f77832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5243l9[] f77833c;

    public C5293n9() {
        a();
    }

    public static C5293n9[] b() {
        if (f77830q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77830q == null) {
                        f77830q = new C5293n9[0];
                    }
                } finally {
                }
            }
        }
        return f77830q;
    }

    public final C5293n9 a() {
        this.f77831a = 0L;
        this.f77832b = null;
        this.f77833c = C5243l9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f77831a) + super.computeSerializedSize();
        C5268m9 c5268m9 = this.f77832b;
        if (c5268m9 != null) {
            iComputeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c5268m9);
        }
        C5243l9[] c5243l9Arr = this.f77833c;
        if (c5243l9Arr != null && c5243l9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5243l9[] c5243l9Arr2 = this.f77833c;
                if (i10 >= c5243l9Arr2.length) {
                    break;
                }
                C5243l9 c5243l9 = c5243l9Arr2[i10];
                if (c5243l9 != null) {
                    iComputeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c5243l9) + iComputeUInt64Size;
                }
                i10++;
            }
        }
        return iComputeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f77831a);
        C5268m9 c5268m9 = this.f77832b;
        if (c5268m9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5268m9);
        }
        C5243l9[] c5243l9Arr = this.f77833c;
        if (c5243l9Arr != null && c5243l9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5243l9[] c5243l9Arr2 = this.f77833c;
                if (i10 >= c5243l9Arr2.length) {
                    break;
                }
                C5243l9 c5243l9 = c5243l9Arr2[i10];
                if (c5243l9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c5243l9);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5293n9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f77831a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 18) {
                if (this.f77832b == null) {
                    this.f77832b = new C5268m9();
                }
                codedInputByteBufferNano.readMessage(this.f77832b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C5243l9[] c5243l9Arr = this.f77833c;
                int length = c5243l9Arr == null ? 0 : c5243l9Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5243l9[] c5243l9Arr2 = new C5243l9[i10];
                if (length != 0) {
                    System.arraycopy(c5243l9Arr, 0, c5243l9Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5243l9 c5243l9 = new C5243l9();
                    c5243l9Arr2[length] = c5243l9;
                    codedInputByteBufferNano.readMessage(c5243l9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5243l9 c5243l92 = new C5243l9();
                c5243l9Arr2[length] = c5243l92;
                codedInputByteBufferNano.readMessage(c5243l92);
                this.f77833c = c5243l9Arr2;
            }
        }
        return this;
    }

    public static C5293n9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5293n9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5293n9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5293n9) MessageNano.mergeFrom(new C5293n9(), bArr);
    }
}
