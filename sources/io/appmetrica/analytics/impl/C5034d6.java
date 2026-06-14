package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5034d6 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5034d6[] f77004b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f77005a;

    public C5034d6() {
        a();
    }

    public static C5034d6[] b() {
        if (f77004b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77004b == null) {
                        f77004b = new C5034d6[0];
                    }
                } finally {
                }
            }
        }
        return f77004b;
    }

    public final C5034d6 a() {
        this.f77005a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f77005a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f77005a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5034d6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f77005a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C5034d6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5034d6) MessageNano.mergeFrom(new C5034d6(), bArr);
    }

    public static C5034d6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5034d6().mergeFrom(codedInputByteBufferNano);
    }
}
