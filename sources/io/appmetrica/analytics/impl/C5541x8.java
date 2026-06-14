package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5541x8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5541x8[] f78552c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5441t8 f78553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5516w8 f78554b;

    public C5541x8() {
        a();
    }

    public static C5541x8[] b() {
        if (f78552c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78552c == null) {
                        f78552c = new C5541x8[0];
                    }
                } finally {
                }
            }
        }
        return f78552c;
    }

    public final C5541x8 a() {
        this.f78553a = null;
        this.f78554b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5441t8 c5441t8 = this.f78553a;
        if (c5441t8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5441t8);
        }
        C5516w8 c5516w8 = this.f78554b;
        return c5516w8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c5516w8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5441t8 c5441t8 = this.f78553a;
        if (c5441t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5441t8);
        }
        C5516w8 c5516w8 = this.f78554b;
        if (c5516w8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5516w8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5541x8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f78553a == null) {
                    this.f78553a = new C5441t8();
                }
                codedInputByteBufferNano.readMessage(this.f78553a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f78554b == null) {
                    this.f78554b = new C5516w8();
                }
                codedInputByteBufferNano.readMessage(this.f78554b);
            }
        }
        return this;
    }

    public static C5541x8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5541x8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5541x8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5541x8) MessageNano.mergeFrom(new C5541x8(), bArr);
    }
}
