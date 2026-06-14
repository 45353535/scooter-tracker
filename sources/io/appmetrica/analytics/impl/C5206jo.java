package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5206jo extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5206jo[] f77572e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f77573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f77574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f77575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f77576d;

    public C5206jo() {
        a();
    }

    public static C5206jo[] b() {
        if (f77572e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77572e == null) {
                        f77572e = new C5206jo[0];
                    }
                } finally {
                }
            }
        }
        return f77572e;
    }

    public final C5206jo a() {
        this.f77573a = WireFormatNano.EMPTY_BYTES;
        this.f77574b = 0.0d;
        this.f77575c = 0.0d;
        this.f77576d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f77573a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f77573a);
        }
        if (Double.doubleToLongBits(this.f77574b) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f77574b);
        }
        if (Double.doubleToLongBits(this.f77575c) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f77575c);
        }
        boolean z10 = this.f77576d;
        return z10 ? CodedOutputByteBufferNano.computeBoolSize(4, z10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f77573a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f77573a);
        }
        if (Double.doubleToLongBits(this.f77574b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f77574b);
        }
        if (Double.doubleToLongBits(this.f77575c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f77575c);
        }
        boolean z10 = this.f77576d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5206jo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f77573a = codedInputByteBufferNano.readBytes();
            } else if (tag == 17) {
                this.f77574b = codedInputByteBufferNano.readDouble();
            } else if (tag == 25) {
                this.f77575c = codedInputByteBufferNano.readDouble();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f77576d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C5206jo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5206jo().mergeFrom(codedInputByteBufferNano);
    }

    public static C5206jo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5206jo) MessageNano.mergeFrom(new C5206jo(), bArr);
    }
}
