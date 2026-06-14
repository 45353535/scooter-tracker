package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class H9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f75845c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f75846d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f75847e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f75848f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f75849g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f75850h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f75851i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile H9[] f75852j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f75854b;

    public H9() {
        a();
    }

    public static H9[] b() {
        if (f75852j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f75852j == null) {
                        f75852j = new H9[0];
                    }
                } finally {
                }
            }
        }
        return f75852j;
    }

    public final H9 a() {
        this.f75853a = 0;
        this.f75854b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f75853a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        return !Arrays.equals(this.f75854b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f75854b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f75853a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (!Arrays.equals(this.f75854b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f75854b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag != 0) {
                if (tag == 8) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f75853a = int32;
                            break;
                    }
                } else if (tag != 18) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                } else {
                    this.f75854b = codedInputByteBufferNano.readBytes();
                }
            }
        }
        return this;
    }

    public static H9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new H9().mergeFrom(codedInputByteBufferNano);
    }

    public static H9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (H9) MessageNano.mergeFrom(new H9(), bArr);
    }
}
