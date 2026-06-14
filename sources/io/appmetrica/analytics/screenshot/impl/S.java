package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class S extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile S[] f78979c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f78980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q f78981b;

    public S() {
        a();
    }

    public static S[] b() {
        if (f78979c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78979c == null) {
                        f78979c = new S[0];
                    }
                } finally {
                }
            }
        }
        return f78979c;
    }

    public final S a() {
        this.f78980a = true;
        this.f78981b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f78980a;
        if (!z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        Q q10 = this.f78981b;
        return q10 != null ? CodedOutputByteBufferNano.computeMessageSize(2, q10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f78980a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        Q q10 = this.f78981b;
        if (q10 != null) {
            codedOutputByteBufferNano.writeMessage(2, q10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f78980a = codedInputByteBufferNano.readBool();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f78981b == null) {
                    this.f78981b = new Q();
                }
                codedInputByteBufferNano.readMessage(this.f78981b);
            }
        }
        return this;
    }

    public static S b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S().mergeFrom(codedInputByteBufferNano);
    }

    public static S a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S) MessageNano.mergeFrom(new S(), bArr);
    }
}
