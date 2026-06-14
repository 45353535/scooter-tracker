package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile l[] f75415b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75416a;

    public l() {
        a();
    }

    public static l[] b() {
        if (f75415b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f75415b == null) {
                        f75415b = new l[0];
                    }
                } finally {
                }
            }
        }
        return f75415b;
    }

    public final l a() {
        this.f75416a = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f75416a;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(1, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f75416a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1) {
                    this.f75416a = int32;
                }
            }
        }
        return this;
    }

    public static l a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (l) MessageNano.mergeFrom(new l(), bArr);
    }

    public static l b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new l().mergeFrom(codedInputByteBufferNano);
    }
}
