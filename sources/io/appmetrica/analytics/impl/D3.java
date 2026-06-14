package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class D3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile D3[] f75650c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f75651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f75652b;

    public D3() {
        a();
    }

    public static D3[] b() {
        if (f75650c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f75650c == null) {
                        f75650c = new D3[0];
                    }
                } finally {
                }
            }
        }
        return f75650c;
    }

    public final D3 a() {
        this.f75651a = "";
        this.f75652b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f75651a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f75651a);
        }
        return !this.f75652b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f75652b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f75651a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f75651a);
        }
        if (!this.f75652b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f75652b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f75651a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f75652b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static D3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new D3().mergeFrom(codedInputByteBufferNano);
    }

    public static D3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (D3) MessageNano.mergeFrom(new D3(), bArr);
    }
}
