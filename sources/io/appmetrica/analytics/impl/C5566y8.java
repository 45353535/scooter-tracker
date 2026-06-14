package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5566y8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5566y8[] f78576c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5441t8 f78577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5491v8 f78578b;

    public C5566y8() {
        a();
    }

    public static C5566y8[] b() {
        if (f78576c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78576c == null) {
                        f78576c = new C5566y8[0];
                    }
                } finally {
                }
            }
        }
        return f78576c;
    }

    public final C5566y8 a() {
        this.f78577a = null;
        this.f78578b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5441t8 c5441t8 = this.f78577a;
        if (c5441t8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5441t8);
        }
        C5491v8 c5491v8 = this.f78578b;
        return c5491v8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c5491v8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5441t8 c5441t8 = this.f78577a;
        if (c5441t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5441t8);
        }
        C5491v8 c5491v8 = this.f78578b;
        if (c5491v8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5491v8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5566y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f78577a == null) {
                    this.f78577a = new C5441t8();
                }
                codedInputByteBufferNano.readMessage(this.f78577a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f78578b == null) {
                    this.f78578b = new C5491v8();
                }
                codedInputByteBufferNano.readMessage(this.f78578b);
            }
        }
        return this;
    }

    public static C5566y8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5566y8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5566y8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5566y8) MessageNano.mergeFrom(new C5566y8(), bArr);
    }
}
