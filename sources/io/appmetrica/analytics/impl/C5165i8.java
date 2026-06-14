package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5165i8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5165i8[] f77384c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f77385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5267m8 f77386b;

    public C5165i8() {
        a();
    }

    public static C5165i8[] b() {
        if (f77384c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77384c == null) {
                        f77384c = new C5165i8[0];
                    }
                } finally {
                }
            }
        }
        return f77384c;
    }

    public final C5165i8 a() {
        this.f77385a = WireFormatNano.EMPTY_BYTES;
        this.f77386b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f77385a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f77385a);
        }
        C5267m8 c5267m8 = this.f77386b;
        return c5267m8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c5267m8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f77385a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f77385a);
        }
        C5267m8 c5267m8 = this.f77386b;
        if (c5267m8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5267m8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5165i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f77385a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f77386b == null) {
                    this.f77386b = new C5267m8();
                }
                codedInputByteBufferNano.readMessage(this.f77386b);
            }
        }
        return this;
    }

    public static C5165i8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5165i8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5165i8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5165i8) MessageNano.mergeFrom(new C5165i8(), bArr);
    }
}
