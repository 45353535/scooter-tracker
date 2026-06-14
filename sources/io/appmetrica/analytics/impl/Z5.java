package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class Z5 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Z5[] f76736d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y5 f76737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f76738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76739c;

    public Z5() {
        a();
    }

    public static Z5[] b() {
        if (f76736d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76736d == null) {
                        f76736d = new Z5[0];
                    }
                } finally {
                }
            }
        }
        return f76736d;
    }

    public final Z5 a() {
        this.f76737a = null;
        this.f76738b = "";
        this.f76739c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        Y5 y52 = this.f76737a;
        if (y52 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, y52);
        }
        if (!this.f76738b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f76738b);
        }
        int i10 = this.f76739c;
        return i10 != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Y5 y52 = this.f76737a;
        if (y52 != null) {
            codedOutputByteBufferNano.writeMessage(1, y52);
        }
        if (!this.f76738b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f76738b);
        }
        int i10 = this.f76739c;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f76737a == null) {
                    this.f76737a = new Y5();
                }
                codedInputByteBufferNano.readMessage(this.f76737a);
            } else if (tag == 18) {
                this.f76738b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f76739c = int32;
                }
            }
        }
        return this;
    }

    public static Z5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Z5().mergeFrom(codedInputByteBufferNano);
    }

    public static Z5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Z5) MessageNano.mergeFrom(new Z5(), bArr);
    }
}
