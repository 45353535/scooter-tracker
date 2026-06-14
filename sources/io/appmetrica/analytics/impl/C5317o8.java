package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5317o8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5317o8[] f77883c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f77884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5216k8 f77885b;

    public C5317o8() {
        a();
    }

    public static C5317o8[] b() {
        if (f77883c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77883c == null) {
                        f77883c = new C5317o8[0];
                    }
                } finally {
                }
            }
        }
        return f77883c;
    }

    public final C5317o8 a() {
        this.f77884a = 0;
        this.f77885b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f77884a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        C5216k8 c5216k8 = this.f77885b;
        return c5216k8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c5216k8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f77884a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        C5216k8 c5216k8 = this.f77885b;
        if (c5216k8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5216k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5317o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f77884a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f77885b == null) {
                    this.f77885b = new C5216k8();
                }
                codedInputByteBufferNano.readMessage(this.f77885b);
            }
        }
        return this;
    }

    public static C5317o8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5317o8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5317o8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5317o8) MessageNano.mergeFrom(new C5317o8(), bArr);
    }
}
