package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5580ym extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5580ym[] f78586b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78587a;

    public C5580ym() {
        a();
    }

    public static C5580ym[] b() {
        if (f78586b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78586b == null) {
                        f78586b = new C5580ym[0];
                    }
                } finally {
                }
            }
        }
        return f78586b;
    }

    public final C5580ym a() {
        this.f78587a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f78587a;
        return i10 != 86400 ? CodedOutputByteBufferNano.computeUInt32Size(1, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f78587a;
        if (i10 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5580ym mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f78587a = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C5580ym a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5580ym) MessageNano.mergeFrom(new C5580ym(), bArr);
    }

    public static C5580ym b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5580ym().mergeFrom(codedInputByteBufferNano);
    }
}
