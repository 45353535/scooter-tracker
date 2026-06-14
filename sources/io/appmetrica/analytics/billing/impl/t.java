package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile t[] f74992c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f74993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f74994b;

    public t() {
        a();
    }

    public static t[] b() {
        if (f74992c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f74992c == null) {
                        f74992c = new t[0];
                    }
                } finally {
                }
            }
        }
        return f74992c;
    }

    public final t a() {
        this.f74993a = true;
        this.f74994b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f74993a;
        if (!z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        s sVar = this.f74994b;
        return sVar != null ? CodedOutputByteBufferNano.computeMessageSize(2, sVar) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f74993a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        s sVar = this.f74994b;
        if (sVar != null) {
            codedOutputByteBufferNano.writeMessage(2, sVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f74993a = codedInputByteBufferNano.readBool();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f74994b == null) {
                    this.f74994b = new s();
                }
                codedInputByteBufferNano.readMessage(this.f74994b);
            }
        }
        return this;
    }

    public static t b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new t().mergeFrom(codedInputByteBufferNano);
    }

    public static t a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (t) MessageNano.mergeFrom(new t(), bArr);
    }
}
