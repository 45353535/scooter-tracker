package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5343p9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5343p9[] f77972e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f77973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f77975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f77976d;

    public C5343p9() {
        a();
    }

    public static C5343p9[] b() {
        if (f77972e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77972e == null) {
                        f77972e = new C5343p9[0];
                    }
                } finally {
                }
            }
        }
        return f77972e;
    }

    public final C5343p9 a() {
        this.f77973a = 0L;
        this.f77974b = 0;
        this.f77975c = 0L;
        this.f77976d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f77974b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f77973a) + super.computeSerializedSize();
        long j10 = this.f77975c;
        if (j10 != 0) {
            iComputeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j10);
        }
        boolean z10 = this.f77976d;
        return z10 ? CodedOutputByteBufferNano.computeBoolSize(4, z10) + iComputeSInt32Size : iComputeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f77973a);
        codedOutputByteBufferNano.writeSInt32(2, this.f77974b);
        long j10 = this.f77975c;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j10);
        }
        boolean z10 = this.f77976d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5343p9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f77973a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 16) {
                this.f77974b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f77975c = codedInputByteBufferNano.readInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f77976d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C5343p9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5343p9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5343p9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5343p9) MessageNano.mergeFrom(new C5343p9(), bArr);
    }
}
