package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5190j8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5190j8[] f77505b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5216k8 f77506a;

    public C5190j8() {
        a();
    }

    public static C5190j8[] b() {
        if (f77505b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77505b == null) {
                        f77505b = new C5190j8[0];
                    }
                } finally {
                }
            }
        }
        return f77505b;
    }

    public final C5190j8 a() {
        this.f77506a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5216k8 c5216k8 = this.f77506a;
        return c5216k8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c5216k8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5216k8 c5216k8 = this.f77506a;
        if (c5216k8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5216k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5190j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f77506a == null) {
                    this.f77506a = new C5216k8();
                }
                codedInputByteBufferNano.readMessage(this.f77506a);
            }
        }
        return this;
    }

    public static C5190j8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5190j8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5190j8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5190j8) MessageNano.mergeFrom(new C5190j8(), bArr);
    }
}
