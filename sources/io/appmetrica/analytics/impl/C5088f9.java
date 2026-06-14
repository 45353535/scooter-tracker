package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5088f9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5088f9[] f77152c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f77153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f77154b;

    public C5088f9() {
        a();
    }

    public static C5088f9[] b() {
        if (f77152c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77152c == null) {
                        f77152c = new C5088f9[0];
                    }
                } finally {
                }
            }
        }
        return f77152c;
    }

    public final C5088f9 a() {
        this.f77153a = "";
        this.f77154b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f77154b) + CodedOutputByteBufferNano.computeStringSize(1, this.f77153a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f77153a);
        codedOutputByteBufferNano.writeString(2, this.f77154b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5088f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f77153a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f77154b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C5088f9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5088f9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5088f9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5088f9) MessageNano.mergeFrom(new C5088f9(), bArr);
    }
}
