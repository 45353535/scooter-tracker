package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5491v8 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C5491v8[] f78438d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f78439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f78440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5516w8 f78441c;

    public C5491v8() {
        a();
    }

    public static C5491v8[] b() {
        if (f78438d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78438d == null) {
                        f78438d = new C5491v8[0];
                    }
                } finally {
                }
            }
        }
        return f78438d;
    }

    public final C5491v8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f78439a = bArr;
        this.f78440b = bArr;
        this.f78441c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f78439a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f78439a);
        }
        if (!Arrays.equals(this.f78440b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f78440b);
        }
        C5516w8 c5516w8 = this.f78441c;
        return c5516w8 != null ? CodedOutputByteBufferNano.computeMessageSize(3, c5516w8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f78439a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f78439a);
        }
        if (!Arrays.equals(this.f78440b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f78440b);
        }
        C5516w8 c5516w8 = this.f78441c;
        if (c5516w8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5516w8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5491v8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f78439a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f78440b = codedInputByteBufferNano.readBytes();
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f78441c == null) {
                    this.f78441c = new C5516w8();
                }
                codedInputByteBufferNano.readMessage(this.f78441c);
            }
        }
        return this;
    }

    public static C5491v8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5491v8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5491v8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5491v8) MessageNano.mergeFrom(new C5491v8(), bArr);
    }
}
