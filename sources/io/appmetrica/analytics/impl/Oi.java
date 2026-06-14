package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class Oi extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f76198c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f76199d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f76200e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f76201f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f76202g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Oi[] f76203h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f76205b;

    public Oi() {
        a();
    }

    public static Oi[] b() {
        if (f76203h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76203h == null) {
                        f76203h = new Oi[0];
                    }
                } finally {
                }
            }
        }
        return f76203h;
    }

    public final Oi a() {
        this.f76204a = 0;
        this.f76205b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f76204a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int i11 = this.f76205b;
        return i11 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f76204a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        int i11 = this.f76205b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Oi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f76204a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                    this.f76205b = int32;
                }
            }
        }
        return this;
    }

    public static Oi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Oi().mergeFrom(codedInputByteBufferNano);
    }

    public static Oi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Oi) MessageNano.mergeFrom(new Oi(), bArr);
    }
}
