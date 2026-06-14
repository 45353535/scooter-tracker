package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5480um extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5480um[] f78397b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f78398a;

    public C5480um() {
        a();
    }

    public static C5480um[] b() {
        if (f78397b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78397b == null) {
                        f78397b = new C5480um[0];
                    }
                } finally {
                }
            }
        }
        return f78397b;
    }

    public final C5480um a() {
        this.f78398a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f78398a;
        return j10 != 864000000 ? CodedOutputByteBufferNano.computeInt64Size(1, j10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f78398a;
        if (j10 != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5480um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f78398a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C5480um a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5480um) MessageNano.mergeFrom(new C5480um(), bArr);
    }

    public static C5480um b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5480um().mergeFrom(codedInputByteBufferNano);
    }
}
