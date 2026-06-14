package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5515w7 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C5515w7[] f78488d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f78489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f78490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78491c;

    public C5515w7() {
        a();
    }

    public static C5515w7[] b() {
        if (f78488d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78488d == null) {
                        f78488d = new C5515w7[0];
                    }
                } finally {
                }
            }
        }
        return f78488d;
    }

    public final C5515w7 a() {
        this.f78489a = -1L;
        this.f78490b = -1L;
        this.f78491c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f78489a;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        long j11 = this.f78490b;
        if (j11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j11);
        }
        int i10 = this.f78491c;
        return i10 != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f78489a;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        long j11 = this.f78490b;
        if (j11 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j11);
        }
        int i10 = this.f78491c;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5515w7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f78489a = codedInputByteBufferNano.readInt64();
            } else if (tag == 16) {
                this.f78490b = codedInputByteBufferNano.readInt64();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f78491c = int32;
                }
            }
        }
        return this;
    }

    public static C5515w7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5515w7().mergeFrom(codedInputByteBufferNano);
    }

    public static C5515w7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5515w7) MessageNano.mergeFrom(new C5515w7(), bArr);
    }
}
