package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5085f6 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5085f6[] f77146c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f77147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f77148b;

    public C5085f6() {
        a();
    }

    public static C5085f6[] b() {
        if (f77146c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77146c == null) {
                        f77146c = new C5085f6[0];
                    }
                } finally {
                }
            }
        }
        return f77146c;
    }

    public final C5085f6 a() {
        this.f77147a = 0;
        this.f77148b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f77147a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        return !this.f77148b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f77148b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f77147a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (!this.f77148b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f77148b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5085f6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 3) {
                    this.f77147a = int32;
                }
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f77148b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C5085f6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5085f6().mergeFrom(codedInputByteBufferNano);
    }

    public static C5085f6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5085f6) MessageNano.mergeFrom(new C5085f6(), bArr);
    }
}
