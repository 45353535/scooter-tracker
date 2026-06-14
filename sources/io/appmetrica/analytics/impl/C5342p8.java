package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5342p8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5342p8[] f77970b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5292n8 f77971a;

    public C5342p8() {
        a();
    }

    public static C5342p8[] b() {
        if (f77970b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77970b == null) {
                        f77970b = new C5342p8[0];
                    }
                } finally {
                }
            }
        }
        return f77970b;
    }

    public final C5342p8 a() {
        this.f77971a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5292n8 c5292n8 = this.f77971a;
        return c5292n8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c5292n8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5292n8 c5292n8 = this.f77971a;
        if (c5292n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5292n8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5342p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f77971a == null) {
                    this.f77971a = new C5292n8();
                }
                codedInputByteBufferNano.readMessage(this.f77971a);
            }
        }
        return this;
    }

    public static C5342p8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5342p8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5342p8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5342p8) MessageNano.mergeFrom(new C5342p8(), bArr);
    }
}
