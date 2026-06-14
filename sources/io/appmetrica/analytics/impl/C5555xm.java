package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5555xm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5555xm[] f78563c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f78564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f78565b;

    public C5555xm() {
        a();
    }

    public static C5555xm[] b() {
        if (f78563c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78563c == null) {
                        f78563c = new C5555xm[0];
                    }
                } finally {
                }
            }
        }
        return f78563c;
    }

    public final C5555xm a() {
        this.f78564a = 86400L;
        this.f78565b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f78565b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f78564a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f78564a);
        codedOutputByteBufferNano.writeInt64(2, this.f78565b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5555xm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f78564a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f78565b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C5555xm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5555xm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5555xm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5555xm) MessageNano.mergeFrom(new C5555xm(), bArr);
    }
}
