package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class Ri extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f76357l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f76358m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f76359n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f76360o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f76361p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile Ri[] f76362q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f76364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f76365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f76366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Mi f76367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f76368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f76369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f76370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f76371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Qi f76372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Pi f76373k;

    public Ri() {
        a();
    }

    public static Ri[] b() {
        if (f76362q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76362q == null) {
                        f76362q = new Ri[0];
                    }
                } finally {
                }
            }
        }
        return f76362q;
    }

    public final Ri a() {
        this.f76363a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f76364b = bArr;
        this.f76365c = bArr;
        this.f76366d = bArr;
        this.f76367e = null;
        this.f76368f = 0L;
        this.f76369g = false;
        this.f76370h = 0;
        this.f76371i = 1;
        this.f76372j = null;
        this.f76373k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f76363a;
        if (i10 != 1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f76364b) + iComputeSerializedSize;
        byte[] bArr = this.f76365c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f76365c);
        }
        if (!Arrays.equals(this.f76366d, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f76366d);
        }
        Mi mi = this.f76367e;
        if (mi != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, mi);
        }
        long j10 = this.f76368f;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j10);
        }
        boolean z10 = this.f76369g;
        if (z10) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z10);
        }
        int i11 = this.f76370h;
        if (i11 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i11);
        }
        int i12 = this.f76371i;
        if (i12 != 1) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i12);
        }
        Qi qi = this.f76372j;
        if (qi != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, qi);
        }
        Pi pi = this.f76373k;
        return pi != null ? CodedOutputByteBufferNano.computeMessageSize(12, pi) + iComputeBytesSize : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f76363a;
        if (i10 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f76364b);
        byte[] bArr = this.f76365c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f76365c);
        }
        if (!Arrays.equals(this.f76366d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f76366d);
        }
        Mi mi = this.f76367e;
        if (mi != null) {
            codedOutputByteBufferNano.writeMessage(6, mi);
        }
        long j10 = this.f76368f;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j10);
        }
        boolean z10 = this.f76369g;
        if (z10) {
            codedOutputByteBufferNano.writeBool(8, z10);
        }
        int i11 = this.f76370h;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i11);
        }
        int i12 = this.f76371i;
        if (i12 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i12);
        }
        Qi qi = this.f76372j;
        if (qi != null) {
            codedOutputByteBufferNano.writeMessage(11, qi);
        }
        Pi pi = this.f76373k;
        if (pi != null) {
            codedOutputByteBufferNano.writeMessage(12, pi);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Ri b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ri().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ri mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f76363a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f76364b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f76365c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f76366d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f76367e == null) {
                        this.f76367e = new Mi();
                    }
                    codedInputByteBufferNano.readMessage(this.f76367e);
                    break;
                case 56:
                    this.f76368f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f76369g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f76370h = int32;
                    }
                    break;
                case 80:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == 1 || int322 == 2) {
                        this.f76371i = int322;
                    }
                    break;
                case 90:
                    if (this.f76372j == null) {
                        this.f76372j = new Qi();
                    }
                    codedInputByteBufferNano.readMessage(this.f76372j);
                    break;
                case 98:
                    if (this.f76373k == null) {
                        this.f76373k = new Pi();
                    }
                    codedInputByteBufferNano.readMessage(this.f76373k);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static Ri a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ri) MessageNano.mergeFrom(new Ri(), bArr);
    }
}
