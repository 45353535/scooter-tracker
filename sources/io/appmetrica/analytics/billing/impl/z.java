package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class z extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f75024l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f75025m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f75026n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f75027o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f75028p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile z[] f75029q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f75031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f75032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f75033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f75034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f75035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f75036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f75037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f75038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f75039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x f75040k;

    public z() {
        a();
    }

    public static z[] b() {
        if (f75029q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f75029q == null) {
                        f75029q = new z[0];
                    }
                } finally {
                }
            }
        }
        return f75029q;
    }

    public final z a() {
        this.f75030a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f75031b = bArr;
        this.f75032c = bArr;
        this.f75033d = bArr;
        this.f75034e = null;
        this.f75035f = 0L;
        this.f75036g = false;
        this.f75037h = 0;
        this.f75038i = 1;
        this.f75039j = null;
        this.f75040k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f75030a;
        if (i10 != 1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f75031b) + iComputeSerializedSize;
        byte[] bArr = this.f75032c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f75032c);
        }
        if (!Arrays.equals(this.f75033d, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f75033d);
        }
        u uVar = this.f75034e;
        if (uVar != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, uVar);
        }
        long j10 = this.f75035f;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j10);
        }
        boolean z10 = this.f75036g;
        if (z10) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z10);
        }
        int i11 = this.f75037h;
        if (i11 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i11);
        }
        int i12 = this.f75038i;
        if (i12 != 1) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i12);
        }
        y yVar = this.f75039j;
        if (yVar != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, yVar);
        }
        x xVar = this.f75040k;
        return xVar != null ? CodedOutputByteBufferNano.computeMessageSize(12, xVar) + iComputeBytesSize : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f75030a;
        if (i10 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f75031b);
        byte[] bArr = this.f75032c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f75032c);
        }
        if (!Arrays.equals(this.f75033d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f75033d);
        }
        u uVar = this.f75034e;
        if (uVar != null) {
            codedOutputByteBufferNano.writeMessage(6, uVar);
        }
        long j10 = this.f75035f;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j10);
        }
        boolean z10 = this.f75036g;
        if (z10) {
            codedOutputByteBufferNano.writeBool(8, z10);
        }
        int i11 = this.f75037h;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i11);
        }
        int i12 = this.f75038i;
        if (i12 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i12);
        }
        y yVar = this.f75039j;
        if (yVar != null) {
            codedOutputByteBufferNano.writeMessage(11, yVar);
        }
        x xVar = this.f75040k;
        if (xVar != null) {
            codedOutputByteBufferNano.writeMessage(12, xVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static z b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new z().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f75030a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f75031b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f75032c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f75033d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f75034e == null) {
                        this.f75034e = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f75034e);
                    break;
                case 56:
                    this.f75035f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f75036g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f75037h = int32;
                    }
                    break;
                case 80:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == 1 || int322 == 2) {
                        this.f75038i = int322;
                    }
                    break;
                case 90:
                    if (this.f75039j == null) {
                        this.f75039j = new y();
                    }
                    codedInputByteBufferNano.readMessage(this.f75039j);
                    break;
                case 98:
                    if (this.f75040k == null) {
                        this.f75040k = new x();
                    }
                    codedInputByteBufferNano.readMessage(this.f75040k);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static z a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (z) MessageNano.mergeFrom(new z(), bArr);
    }
}
