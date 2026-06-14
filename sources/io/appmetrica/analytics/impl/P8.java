package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class P8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile P8[] f76249c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f76250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f76251b;

    public P8() {
        a();
    }

    public static P8[] b() {
        if (f76249c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76249c == null) {
                        f76249c = new P8[0];
                    }
                } finally {
                }
            }
        }
        return f76249c;
    }

    public final P8 a() {
        this.f76250a = "";
        this.f76251b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f76250a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f76250a);
        }
        return !Arrays.equals(this.f76251b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f76251b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f76250a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f76250a);
        }
        if (!Arrays.equals(this.f76251b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f76251b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f76250a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f76251b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static P8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new P8().mergeFrom(codedInputByteBufferNano);
    }

    public static P8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (P8) MessageNano.mergeFrom(new P8(), bArr);
    }
}
