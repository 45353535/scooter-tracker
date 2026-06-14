package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5449tg extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f78294e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f78295f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f78296g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile C5449tg[] f78297h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f78298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f78299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f78300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78301d;

    public C5449tg() {
        a();
    }

    public static C5449tg[] b() {
        if (f78297h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78297h == null) {
                        f78297h = new C5449tg[0];
                    }
                } finally {
                }
            }
        }
        return f78297h;
    }

    public final C5449tg a() {
        this.f78298a = "";
        this.f78299b = 0L;
        this.f78300c = 0L;
        this.f78301d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f78298a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f78298a);
        }
        long j10 = this.f78299b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        long j11 = this.f78300c;
        if (j11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j11);
        }
        int i10 = this.f78301d;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f78298a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f78298a);
        }
        long j10 = this.f78299b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        long j11 = this.f78300c;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j11);
        }
        int i10 = this.f78301d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5449tg mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f78298a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f78299b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f78300c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f78301d = int32;
                }
            }
        }
        return this;
    }

    public static C5449tg b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5449tg().mergeFrom(codedInputByteBufferNano);
    }

    public static C5449tg a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5449tg) MessageNano.mergeFrom(new C5449tg(), bArr);
    }
}
