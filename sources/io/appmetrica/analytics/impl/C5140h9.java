package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5140h9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5140h9[] f77301c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f77302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f77303b;

    public C5140h9() {
        a();
    }

    public static C5140h9[] b() {
        if (f77301c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77301c == null) {
                        f77301c = new C5140h9[0];
                    }
                } finally {
                }
            }
        }
        return f77301c;
    }

    public final C5140h9 a() {
        this.f77302a = "";
        this.f77303b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f77303b) + CodedOutputByteBufferNano.computeStringSize(1, this.f77302a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f77302a);
        codedOutputByteBufferNano.writeUInt64(2, this.f77303b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5140h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f77302a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f77303b = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static C5140h9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5140h9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5140h9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5140h9) MessageNano.mergeFrom(new C5140h9(), bArr);
    }
}
