package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5318o9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5318o9[] f77886e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f77887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f77889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f77890d;

    public C5318o9() {
        a();
    }

    public static C5318o9[] b() {
        if (f77886e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77886e == null) {
                        f77886e = new C5318o9[0];
                    }
                } finally {
                }
            }
        }
        return f77886e;
    }

    public final C5318o9 a() {
        this.f77887a = 0;
        this.f77888b = 0;
        this.f77889c = "";
        this.f77890d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f77887a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int i11 = this.f77888b;
        if (i11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i11);
        }
        if (!this.f77889c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f77889c);
        }
        boolean z10 = this.f77890d;
        return z10 ? CodedOutputByteBufferNano.computeBoolSize(4, z10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f77887a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        int i11 = this.f77888b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i11);
        }
        if (!this.f77889c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f77889c);
        }
        boolean z10 = this.f77890d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5318o9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f77887a = codedInputByteBufferNano.readUInt32();
            } else if (tag == 16) {
                this.f77888b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 26) {
                this.f77889c = codedInputByteBufferNano.readString();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f77890d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C5318o9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5318o9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5318o9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5318o9) MessageNano.mergeFrom(new C5318o9(), bArr);
    }
}
