package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f75428c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f75429d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile o[] f75430e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f75431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f75432b;

    public o() {
        a();
    }

    public static o[] b() {
        if (f75430e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f75430e == null) {
                        f75430e = new o[0];
                    }
                } finally {
                }
            }
        }
        return f75430e;
    }

    public final o a() {
        this.f75431a = false;
        this.f75432b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f75431a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        n nVar = this.f75432b;
        return nVar != null ? CodedOutputByteBufferNano.computeMessageSize(2, nVar) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f75431a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        n nVar = this.f75432b;
        if (nVar != null) {
            codedOutputByteBufferNano.writeMessage(2, nVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f75431a = codedInputByteBufferNano.readBool();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f75432b == null) {
                    this.f75432b = new n();
                }
                codedInputByteBufferNano.readMessage(this.f75432b);
            }
        }
        return this;
    }

    public static o b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new o().mergeFrom(codedInputByteBufferNano);
    }

    public static o a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (o) MessageNano.mergeFrom(new o(), bArr);
    }
}
