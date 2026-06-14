package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class P extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile P[] f78972c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f78973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f78974b;

    public P() {
        a();
    }

    public static P[] b() {
        if (f78972c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78972c == null) {
                        f78972c = new P[0];
                    }
                } finally {
                }
            }
        }
        return f78972c;
    }

    public final P a() {
        this.f78973a = true;
        this.f78974b = 1L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f78973a;
        if (!z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        long j10 = this.f78974b;
        return j10 != 1 ? CodedOutputByteBufferNano.computeInt64Size(2, j10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f78973a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        long j10 = this.f78974b;
        if (j10 != 1) {
            codedOutputByteBufferNano.writeInt64(2, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f78973a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f78974b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static P b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new P().mergeFrom(codedInputByteBufferNano);
    }

    public static P a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (P) MessageNano.mergeFrom(new P(), bArr);
    }
}
