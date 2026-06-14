package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5381qm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5381qm[] f78093c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f78094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5356pm f78095b;

    public C5381qm() {
        a();
    }

    public static C5381qm[] b() {
        if (f78093c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78093c == null) {
                        f78093c = new C5381qm[0];
                    }
                } finally {
                }
            }
        }
        return f78093c;
    }

    public final C5381qm a() {
        this.f78094a = "";
        this.f78095b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f78094a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f78094a);
        }
        C5356pm c5356pm = this.f78095b;
        return c5356pm != null ? CodedOutputByteBufferNano.computeMessageSize(2, c5356pm) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f78094a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f78094a);
        }
        C5356pm c5356pm = this.f78095b;
        if (c5356pm != null) {
            codedOutputByteBufferNano.writeMessage(2, c5356pm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5381qm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f78094a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f78095b == null) {
                    this.f78095b = new C5356pm();
                }
                codedInputByteBufferNano.readMessage(this.f78095b);
            }
        }
        return this;
    }

    public static C5381qm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5381qm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5381qm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5381qm) MessageNano.mergeFrom(new C5381qm(), bArr);
    }
}
