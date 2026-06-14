package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class N extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile N[] f78966b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f78967a;

    public N() {
        a();
    }

    public static N[] b() {
        if (f78966b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78966b == null) {
                        f78966b = new N[0];
                    }
                } finally {
                }
            }
        }
        return f78966b;
    }

    public final N a() {
        this.f78967a = true;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f78967a;
        return !z10 ? CodedOutputByteBufferNano.computeBoolSize(1, z10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f78967a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f78967a = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static N a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (N) MessageNano.mergeFrom(new N(), bArr);
    }

    public static N b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new N().mergeFrom(codedInputByteBufferNano);
    }
}
