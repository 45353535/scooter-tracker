package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class Q extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Q[] f78975d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public N f78976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public P f78977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O f78978c;

    public Q() {
        a();
    }

    public static Q[] b() {
        if (f78975d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78975d == null) {
                        f78975d = new Q[0];
                    }
                } finally {
                }
            }
        }
        return f78975d;
    }

    public final Q a() {
        this.f78976a = null;
        this.f78977b = null;
        this.f78978c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        N n10 = this.f78976a;
        if (n10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, n10);
        }
        P p10 = this.f78977b;
        if (p10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, p10);
        }
        O o10 = this.f78978c;
        return o10 != null ? CodedOutputByteBufferNano.computeMessageSize(3, o10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        N n10 = this.f78976a;
        if (n10 != null) {
            codedOutputByteBufferNano.writeMessage(1, n10);
        }
        P p10 = this.f78977b;
        if (p10 != null) {
            codedOutputByteBufferNano.writeMessage(2, p10);
        }
        O o10 = this.f78978c;
        if (o10 != null) {
            codedOutputByteBufferNano.writeMessage(3, o10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f78976a == null) {
                    this.f78976a = new N();
                }
                codedInputByteBufferNano.readMessage(this.f78976a);
            } else if (tag == 18) {
                if (this.f78977b == null) {
                    this.f78977b = new P();
                }
                codedInputByteBufferNano.readMessage(this.f78977b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f78978c == null) {
                    this.f78978c = new O();
                }
                codedInputByteBufferNano.readMessage(this.f78978c);
            }
        }
        return this;
    }

    public static Q b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Q().mergeFrom(codedInputByteBufferNano);
    }

    public static Q a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Q) MessageNano.mergeFrom(new Q(), bArr);
    }
}
