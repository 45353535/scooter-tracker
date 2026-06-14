package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5374qf extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C5374qf[] f78074f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f78075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f78076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f78079e;

    public C5374qf() {
        a();
    }

    public static C5374qf[] b() {
        if (f78074f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78074f == null) {
                        f78074f = new C5374qf[0];
                    }
                } finally {
                }
            }
        }
        return f78074f;
    }

    public final C5374qf a() {
        this.f78075a = "";
        this.f78076b = "";
        this.f78077c = false;
        this.f78078d = false;
        this.f78079e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f78075a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f78075a);
        }
        if (!this.f78076b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f78076b);
        }
        boolean z10 = this.f78077c;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z10);
        }
        boolean z11 = this.f78078d;
        if (z11) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z11);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f78079e) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f78075a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f78075a);
        }
        if (!this.f78076b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f78076b);
        }
        boolean z10 = this.f78077c;
        if (z10) {
            codedOutputByteBufferNano.writeBool(3, z10);
        }
        boolean z11 = this.f78078d;
        if (z11) {
            codedOutputByteBufferNano.writeBool(4, z11);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f78079e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5374qf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5374qf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5374qf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f78075a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f78076b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f78077c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f78078d = codedInputByteBufferNano.readBool();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f78079e = int32;
                }
            }
        }
        return this;
    }

    public static C5374qf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5374qf) MessageNano.mergeFrom(new C5374qf(), bArr);
    }
}
