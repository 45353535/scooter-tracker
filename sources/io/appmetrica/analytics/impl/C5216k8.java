package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5216k8 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5216k8[] f77591e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5441t8 f77592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5491v8 f77593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5267m8 f77594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5416s8 f77595d;

    public C5216k8() {
        a();
    }

    public static C5216k8[] b() {
        if (f77591e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77591e == null) {
                        f77591e = new C5216k8[0];
                    }
                } finally {
                }
            }
        }
        return f77591e;
    }

    public final C5216k8 a() {
        this.f77592a = null;
        this.f77593b = null;
        this.f77594c = null;
        this.f77595d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5441t8 c5441t8 = this.f77592a;
        if (c5441t8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5441t8);
        }
        C5491v8 c5491v8 = this.f77593b;
        if (c5491v8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5491v8);
        }
        C5267m8 c5267m8 = this.f77594c;
        if (c5267m8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5267m8);
        }
        C5416s8 c5416s8 = this.f77595d;
        return c5416s8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c5416s8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5441t8 c5441t8 = this.f77592a;
        if (c5441t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5441t8);
        }
        C5491v8 c5491v8 = this.f77593b;
        if (c5491v8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5491v8);
        }
        C5267m8 c5267m8 = this.f77594c;
        if (c5267m8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5267m8);
        }
        C5416s8 c5416s8 = this.f77595d;
        if (c5416s8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5416s8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5216k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f77592a == null) {
                    this.f77592a = new C5441t8();
                }
                codedInputByteBufferNano.readMessage(this.f77592a);
            } else if (tag == 18) {
                if (this.f77593b == null) {
                    this.f77593b = new C5491v8();
                }
                codedInputByteBufferNano.readMessage(this.f77593b);
            } else if (tag == 26) {
                if (this.f77594c == null) {
                    this.f77594c = new C5267m8();
                }
                codedInputByteBufferNano.readMessage(this.f77594c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f77595d == null) {
                    this.f77595d = new C5416s8();
                }
                codedInputByteBufferNano.readMessage(this.f77595d);
            }
        }
        return this;
    }

    public static C5216k8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5216k8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5216k8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5216k8) MessageNano.mergeFrom(new C5216k8(), bArr);
    }
}
