package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5111g6 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C5111g6[] f77210g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f77211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f77212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f77214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f77215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77216f;

    public C5111g6() {
        a();
    }

    public static C5111g6[] b() {
        if (f77210g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77210g == null) {
                        f77210g = new C5111g6[0];
                    }
                } finally {
                }
            }
        }
        return f77210g;
    }

    public final C5111g6 a() {
        this.f77211a = "";
        this.f77212b = "";
        this.f77213c = -1;
        this.f77214d = "";
        this.f77215e = false;
        this.f77216f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f77211a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f77211a);
        }
        if (!this.f77212b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f77212b);
        }
        int i10 = this.f77213c;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i10);
        }
        if (!this.f77214d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f77214d);
        }
        boolean z10 = this.f77215e;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z10);
        }
        int i11 = this.f77216f;
        return i11 != -1 ? CodedOutputByteBufferNano.computeSInt32Size(6, i11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f77211a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f77211a);
        }
        if (!this.f77212b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f77212b);
        }
        int i10 = this.f77213c;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i10);
        }
        if (!this.f77214d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f77214d);
        }
        boolean z10 = this.f77215e;
        if (z10) {
            codedOutputByteBufferNano.writeBool(5, z10);
        }
        int i11 = this.f77216f;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5111g6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5111g6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5111g6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f77211a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f77212b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f77213c = codedInputByteBufferNano.readSInt32();
            } else if (tag == 34) {
                this.f77214d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f77215e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f77216f = codedInputByteBufferNano.readSInt32();
            }
        }
        return this;
    }

    public static C5111g6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5111g6) MessageNano.mergeFrom(new C5111g6(), bArr);
    }
}
