package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5407s extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f78174l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f78175m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f78176n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f78177o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f78178p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f78179q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f78180r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f78181s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile C5407s[] f78182t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static byte[] f78183u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static volatile boolean f78184v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f78185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f78186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f78187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f78189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f78190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f78191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f78192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f78193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f78194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f78195k;

    public C5407s() {
        if (!f78184v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f78184v) {
                        f78183u = InternalNano.bytesDefaultValue("manual");
                        f78184v = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C5407s[] b() {
        if (f78182t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78182t == null) {
                        f78182t = new C5407s[0];
                    }
                } finally {
                }
            }
        }
        return f78182t;
    }

    public final C5407s a() {
        this.f78185a = (byte[]) f78183u.clone();
        this.f78186b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f78187c = bArr;
        this.f78188d = 0;
        this.f78189e = bArr;
        this.f78190f = bArr;
        this.f78191g = bArr;
        this.f78192h = bArr;
        this.f78193i = bArr;
        this.f78194j = bArr;
        this.f78195k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f78185a, f78183u)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f78185a);
        }
        r rVar = this.f78186b;
        if (rVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, rVar);
        }
        byte[] bArr = this.f78187c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f78187c);
        }
        int i10 = this.f78188d;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        if (!Arrays.equals(this.f78189e, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f78189e);
        }
        if (!Arrays.equals(this.f78190f, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f78190f);
        }
        if (!Arrays.equals(this.f78191g, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f78191g);
        }
        if (!Arrays.equals(this.f78192h, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f78192h);
        }
        if (!Arrays.equals(this.f78193i, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f78193i);
        }
        if (!Arrays.equals(this.f78194j, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f78194j);
        }
        return !Arrays.equals(this.f78195k, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(11, this.f78195k) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f78185a, f78183u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f78185a);
        }
        r rVar = this.f78186b;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(2, rVar);
        }
        byte[] bArr = this.f78187c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f78187c);
        }
        int i10 = this.f78188d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        if (!Arrays.equals(this.f78189e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f78189e);
        }
        if (!Arrays.equals(this.f78190f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f78190f);
        }
        if (!Arrays.equals(this.f78191g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f78191g);
        }
        if (!Arrays.equals(this.f78192h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f78192h);
        }
        if (!Arrays.equals(this.f78193i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f78193i);
        }
        if (!Arrays.equals(this.f78194j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f78194j);
        }
        if (!Arrays.equals(this.f78195k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f78195k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5407s b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5407s().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5407s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f78185a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f78186b == null) {
                        this.f78186b = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.f78186b);
                    break;
                case 26:
                    this.f78187c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f78188d = int32;
                            break;
                    }
                    break;
                case 42:
                    this.f78189e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f78190f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f78191g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f78192h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f78193i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f78194j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    this.f78195k = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C5407s a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5407s) MessageNano.mergeFrom(new C5407s(), bArr);
    }
}
