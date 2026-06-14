package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile s[] f74989c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74991b;

    public s() {
        a();
    }

    public static s[] b() {
        if (f74989c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f74989c == null) {
                        f74989c = new s[0];
                    }
                } finally {
                }
            }
        }
        return f74989c;
    }

    public final s a() {
        this.f74990a = 86400;
        this.f74991b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f74990a;
        if (i10 != 86400) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        int i11 = this.f74991b;
        return i11 != 86400 ? CodedOutputByteBufferNano.computeInt32Size(2, i11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f74990a;
        if (i10 != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        int i11 = this.f74991b;
        if (i11 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f74990a = codedInputByteBufferNano.readInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f74991b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static s b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new s().mergeFrom(codedInputByteBufferNano);
    }

    public static s a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (s) MessageNano.mergeFrom(new s(), bArr);
    }
}
