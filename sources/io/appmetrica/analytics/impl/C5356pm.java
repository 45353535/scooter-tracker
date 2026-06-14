package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5356pm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5356pm[] f78008b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f78009a;

    public C5356pm() {
        a();
    }

    public static C5356pm[] b() {
        if (f78008b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78008b == null) {
                        f78008b = new C5356pm[0];
                    }
                } finally {
                }
            }
        }
        return f78008b;
    }

    public final C5356pm a() {
        this.f78009a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !this.f78009a.equals("") ? CodedOutputByteBufferNano.computeStringSize(1, this.f78009a) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f78009a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f78009a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5356pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f78009a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C5356pm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5356pm) MessageNano.mergeFrom(new C5356pm(), bArr);
    }

    public static C5356pm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5356pm().mergeFrom(codedInputByteBufferNano);
    }
}
