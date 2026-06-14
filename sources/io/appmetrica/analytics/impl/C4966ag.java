package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4966ag extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f76836e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f76837f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f76838g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile C4966ag[] f76839h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f76840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f76841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f76842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76843d;

    public C4966ag() {
        a();
    }

    public static C4966ag[] b() {
        if (f76839h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76839h == null) {
                        f76839h = new C4966ag[0];
                    }
                } finally {
                }
            }
        }
        return f76839h;
    }

    public final C4966ag a() {
        this.f76840a = WireFormatNano.EMPTY_BYTES;
        this.f76841b = 0L;
        this.f76842c = 0L;
        this.f76843d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f76840a) + super.computeSerializedSize();
        long j10 = this.f76841b;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        long j11 = this.f76842c;
        if (j11 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j11);
        }
        int i10 = this.f76843d;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i10) + iComputeBytesSize : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f76840a);
        long j10 = this.f76841b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        long j11 = this.f76842c;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j11);
        }
        int i10 = this.f76843d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4966ag mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f76840a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f76841b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f76842c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f76843d = int32;
                }
            }
        }
        return this;
    }

    public static C4966ag b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4966ag().mergeFrom(codedInputByteBufferNano);
    }

    public static C4966ag a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4966ag) MessageNano.mergeFrom(new C4966ag(), bArr);
    }
}
