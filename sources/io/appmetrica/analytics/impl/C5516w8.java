package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5516w8 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5516w8[] f78492e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f78493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5242l8 f78494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f78495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5391r8 f78496d;

    public C5516w8() {
        a();
    }

    public static C5516w8[] b() {
        if (f78492e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78492e == null) {
                        f78492e = new C5516w8[0];
                    }
                } finally {
                }
            }
        }
        return f78492e;
    }

    public final C5516w8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f78493a = bArr;
        this.f78494b = null;
        this.f78495c = bArr;
        this.f78496d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f78493a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f78493a);
        }
        C5242l8 c5242l8 = this.f78494b;
        if (c5242l8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5242l8);
        }
        if (!Arrays.equals(this.f78495c, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f78495c);
        }
        C5391r8 c5391r8 = this.f78496d;
        return c5391r8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c5391r8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f78493a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f78493a);
        }
        C5242l8 c5242l8 = this.f78494b;
        if (c5242l8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5242l8);
        }
        if (!Arrays.equals(this.f78495c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f78495c);
        }
        C5391r8 c5391r8 = this.f78496d;
        if (c5391r8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5391r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5516w8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f78493a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                if (this.f78494b == null) {
                    this.f78494b = new C5242l8();
                }
                codedInputByteBufferNano.readMessage(this.f78494b);
            } else if (tag == 26) {
                this.f78495c = codedInputByteBufferNano.readBytes();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f78496d == null) {
                    this.f78496d = new C5391r8();
                }
                codedInputByteBufferNano.readMessage(this.f78496d);
            }
        }
        return this;
    }

    public static C5516w8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5516w8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5516w8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5516w8) MessageNano.mergeFrom(new C5516w8(), bArr);
    }
}
