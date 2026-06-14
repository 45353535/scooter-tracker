package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5490v7 extends MessageNano {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile C5490v7[] f78427k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f78429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f78430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f78432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f78433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f78434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f78435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f78436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f78437j;

    public C5490v7() {
        a();
    }

    public static C5490v7[] b() {
        if (f78427k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78427k == null) {
                        f78427k = new C5490v7[0];
                    }
                } finally {
                }
            }
        }
        return f78427k;
    }

    public final C5490v7 a() {
        this.f78428a = -1;
        this.f78429b = -1.0d;
        this.f78430c = -1.0d;
        this.f78431d = -1;
        this.f78432e = -1;
        this.f78433f = -1;
        this.f78434g = -1;
        this.f78435h = -1L;
        this.f78436i = "";
        this.f78437j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f78428a;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        if (Double.doubleToLongBits(this.f78429b) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f78429b);
        }
        if (Double.doubleToLongBits(this.f78430c) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f78430c);
        }
        int i11 = this.f78431d;
        if (i11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i11);
        }
        int i12 = this.f78432e;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i12);
        }
        int i13 = this.f78433f;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i13);
        }
        int i14 = this.f78434g;
        if (i14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i14);
        }
        long j10 = this.f78435h;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j10);
        }
        if (!this.f78436i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f78436i);
        }
        return !this.f78437j.equals("") ? CodedOutputByteBufferNano.computeStringSize(10, this.f78437j) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f78428a;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (Double.doubleToLongBits(this.f78429b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f78429b);
        }
        if (Double.doubleToLongBits(this.f78430c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f78430c);
        }
        int i11 = this.f78431d;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i11);
        }
        int i12 = this.f78432e;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i12);
        }
        int i13 = this.f78433f;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i13);
        }
        int i14 = this.f78434g;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i14);
        }
        long j10 = this.f78435h;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j10);
        }
        if (!this.f78436i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f78436i);
        }
        if (!this.f78437j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f78437j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5490v7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5490v7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5490v7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f78428a = int32;
                    }
                    break;
                case 17:
                    this.f78429b = codedInputByteBufferNano.readDouble();
                    break;
                case 25:
                    this.f78430c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f78431d = codedInputByteBufferNano.readInt32();
                    break;
                case 40:
                    this.f78432e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f78433f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f78434g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.f78435h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f78436i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f78437j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C5490v7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5490v7) MessageNano.mergeFrom(new C5490v7(), bArr);
    }
}
