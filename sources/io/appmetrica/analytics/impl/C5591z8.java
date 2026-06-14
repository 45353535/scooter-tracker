package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5591z8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5591z8[] f78609b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5516w8 f78610a;

    public C5591z8() {
        a();
    }

    public static C5591z8[] b() {
        if (f78609b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78609b == null) {
                        f78609b = new C5591z8[0];
                    }
                } finally {
                }
            }
        }
        return f78609b;
    }

    public final C5591z8 a() {
        this.f78610a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5516w8 c5516w8 = this.f78610a;
        return c5516w8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c5516w8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5516w8 c5516w8 = this.f78610a;
        if (c5516w8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5516w8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5591z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f78610a == null) {
                    this.f78610a = new C5516w8();
                }
                codedInputByteBufferNano.readMessage(this.f78610a);
            }
        }
        return this;
    }

    public static C5591z8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5591z8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5591z8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5591z8) MessageNano.mergeFrom(new C5591z8(), bArr);
    }
}
