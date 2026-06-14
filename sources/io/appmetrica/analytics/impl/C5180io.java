package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5180io extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5180io[] f77444c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f77445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f77446b;

    public C5180io() {
        a();
    }

    public static C5180io[] b() {
        if (f77444c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77444c == null) {
                        f77444c = new C5180io[0];
                    }
                } finally {
                }
            }
        }
        return f77444c;
    }

    public final C5180io a() {
        this.f77445a = false;
        this.f77446b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f77445a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        boolean z11 = this.f77446b;
        return z11 ? CodedOutputByteBufferNano.computeBoolSize(2, z11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f77445a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        boolean z11 = this.f77446b;
        if (z11) {
            codedOutputByteBufferNano.writeBool(2, z11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5180io mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f77445a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f77446b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C5180io b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5180io().mergeFrom(codedInputByteBufferNano);
    }

    public static C5180io a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5180io) MessageNano.mergeFrom(new C5180io(), bArr);
    }
}
