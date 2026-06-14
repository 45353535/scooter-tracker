package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5081f2 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5081f2[] f77143c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f77144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f77145b;

    public C5081f2() {
        a();
    }

    public static C5081f2[] b() {
        if (f77143c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77143c == null) {
                        f77143c = new C5081f2[0];
                    }
                } finally {
                }
            }
        }
        return f77143c;
    }

    public final C5081f2 a() {
        this.f77144a = "";
        this.f77145b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f77145b) + CodedOutputByteBufferNano.computeStringSize(1, this.f77144a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f77144a);
        codedOutputByteBufferNano.writeBool(2, this.f77145b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5081f2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f77144a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f77145b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C5081f2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5081f2().mergeFrom(codedInputByteBufferNano);
    }

    public static C5081f2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5081f2) MessageNano.mergeFrom(new C5081f2(), bArr);
    }
}
