package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile x[] f75011d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f75012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f75013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f75014c;

    public x() {
        a();
    }

    public static x[] b() {
        if (f75011d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f75011d == null) {
                        f75011d = new x[0];
                    }
                } finally {
                }
            }
        }
        return f75011d;
    }

    public final x a() {
        this.f75012a = false;
        this.f75013b = null;
        this.f75014c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f75012a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        w wVar = this.f75013b;
        if (wVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        v vVar = this.f75014c;
        return vVar != null ? CodedOutputByteBufferNano.computeMessageSize(3, vVar) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f75012a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        w wVar = this.f75013b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        v vVar = this.f75014c;
        if (vVar != null) {
            codedOutputByteBufferNano.writeMessage(3, vVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f75012a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f75013b == null) {
                    this.f75013b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f75013b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f75014c == null) {
                    this.f75014c = new v();
                }
                codedInputByteBufferNano.readMessage(this.f75014c);
            }
        }
        return this;
    }

    public static x b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new x().mergeFrom(codedInputByteBufferNano);
    }

    public static x a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (x) MessageNano.mergeFrom(new x(), bArr);
    }
}
