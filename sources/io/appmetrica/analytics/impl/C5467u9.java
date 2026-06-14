package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5467u9 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5467u9[] f78350b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f78351a;

    public C5467u9() {
        a();
    }

    public static C5467u9[] b() {
        if (f78350b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78350b == null) {
                        f78350b = new C5467u9[0];
                    }
                } finally {
                }
            }
        }
        return f78350b;
    }

    public final C5467u9 a() {
        this.f78351a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f78351a, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(1, this.f78351a) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f78351a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f78351a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5467u9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f78351a = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C5467u9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5467u9) MessageNano.mergeFrom(new C5467u9(), bArr);
    }

    public static C5467u9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5467u9().mergeFrom(codedInputByteBufferNano);
    }
}
