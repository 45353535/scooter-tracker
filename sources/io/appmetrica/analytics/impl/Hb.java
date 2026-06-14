package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class Hb extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile Hb[] f75855f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f75856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f75857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f75859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f75860e;

    public Hb() {
        a();
    }

    public static Hb[] b() {
        if (f75855f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f75855f == null) {
                        f75855f = new Hb[0];
                    }
                } finally {
                }
            }
        }
        return f75855f;
    }

    public final Hb a() {
        this.f75856a = "";
        this.f75857b = "";
        this.f75858c = false;
        this.f75859d = "";
        this.f75860e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f75856a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f75856a);
        }
        if (!this.f75857b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f75857b);
        }
        boolean z10 = this.f75858c;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z10);
        }
        if (!this.f75859d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f75859d);
        }
        return !this.f75860e.equals("") ? CodedOutputByteBufferNano.computeStringSize(26, this.f75860e) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f75856a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f75856a);
        }
        if (!this.f75857b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f75857b);
        }
        boolean z10 = this.f75858c;
        if (z10) {
            codedOutputByteBufferNano.writeBool(22, z10);
        }
        if (!this.f75859d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f75859d);
        }
        if (!this.f75860e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f75860e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Hb b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Hb().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Hb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f75856a = codedInputByteBufferNano.readString();
            } else if (tag == 154) {
                this.f75857b = codedInputByteBufferNano.readString();
            } else if (tag == 176) {
                this.f75858c = codedInputByteBufferNano.readBool();
            } else if (tag == 202) {
                this.f75859d = codedInputByteBufferNano.readString();
            } else if (tag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f75860e = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Hb a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Hb) MessageNano.mergeFrom(new Hb(), bArr);
    }
}
