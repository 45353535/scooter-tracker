package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class C3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C3[] f75603c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E3 f75604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75605b;

    public C3() {
        a();
    }

    public static C3[] b() {
        if (f75603c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f75603c == null) {
                        f75603c = new C3[0];
                    }
                } finally {
                }
            }
        }
        return f75603c;
    }

    public final C3 a() {
        this.f75604a = null;
        this.f75605b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        E3 e32 = this.f75604a;
        if (e32 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, e32);
        }
        int i10 = this.f75605b;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        E3 e32 = this.f75604a;
        if (e32 != null) {
            codedOutputByteBufferNano.writeMessage(1, e32);
        }
        int i10 = this.f75605b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f75604a == null) {
                    this.f75604a = new E3();
                }
                codedInputByteBufferNano.readMessage(this.f75604a);
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f75605b = int32;
                }
            }
        }
        return this;
    }

    public static C3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3().mergeFrom(codedInputByteBufferNano);
    }

    public static C3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3) MessageNano.mergeFrom(new C3(), bArr);
    }
}
