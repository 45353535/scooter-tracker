package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4982b6 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4982b6[] f76881c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f76882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5085f6 f76883b;

    public C4982b6() {
        a();
    }

    public static C4982b6[] b() {
        if (f76881c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76881c == null) {
                        f76881c = new C4982b6[0];
                    }
                } finally {
                }
            }
        }
        return f76881c;
    }

    public final C4982b6 a() {
        this.f76882a = WireFormatNano.EMPTY_BYTES;
        this.f76883b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f76882a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f76882a);
        }
        C5085f6 c5085f6 = this.f76883b;
        return c5085f6 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c5085f6) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f76882a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f76882a);
        }
        C5085f6 c5085f6 = this.f76883b;
        if (c5085f6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5085f6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4982b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f76882a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f76883b == null) {
                    this.f76883b = new C5085f6();
                }
                codedInputByteBufferNano.readMessage(this.f76883b);
            }
        }
        return this;
    }

    public static C4982b6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4982b6().mergeFrom(codedInputByteBufferNano);
    }

    public static C4982b6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4982b6) MessageNano.mergeFrom(new C4982b6(), bArr);
    }
}
