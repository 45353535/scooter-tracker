package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class Pi extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Pi[] f76261d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f76262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Oi f76263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ni f76264c;

    public Pi() {
        a();
    }

    public static Pi[] b() {
        if (f76261d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76261d == null) {
                        f76261d = new Pi[0];
                    }
                } finally {
                }
            }
        }
        return f76261d;
    }

    public final Pi a() {
        this.f76262a = false;
        this.f76263b = null;
        this.f76264c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f76262a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        Oi oi = this.f76263b;
        if (oi != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, oi);
        }
        Ni ni = this.f76264c;
        return ni != null ? CodedOutputByteBufferNano.computeMessageSize(3, ni) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f76262a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        Oi oi = this.f76263b;
        if (oi != null) {
            codedOutputByteBufferNano.writeMessage(2, oi);
        }
        Ni ni = this.f76264c;
        if (ni != null) {
            codedOutputByteBufferNano.writeMessage(3, ni);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Pi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f76262a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f76263b == null) {
                    this.f76263b = new Oi();
                }
                codedInputByteBufferNano.readMessage(this.f76263b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f76264c == null) {
                    this.f76264c = new Ni();
                }
                codedInputByteBufferNano.readMessage(this.f76264c);
            }
        }
        return this;
    }

    public static Pi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Pi().mergeFrom(codedInputByteBufferNano);
    }

    public static Pi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Pi) MessageNano.mergeFrom(new Pi(), bArr);
    }
}
