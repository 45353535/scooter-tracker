package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile c[] f74961f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f74963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f74964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f74965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f74966e;

    public c() {
        a();
    }

    public static c[] b() {
        if (f74961f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f74961f == null) {
                        f74961f = new c[0];
                    }
                } finally {
                }
            }
        }
        return f74961f;
    }

    public final c a() {
        this.f74962a = 1;
        this.f74963b = "";
        this.f74964c = "";
        this.f74965d = 0L;
        this.f74966e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f74966e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f74965d) + CodedOutputByteBufferNano.computeStringSize(3, this.f74964c) + CodedOutputByteBufferNano.computeStringSize(2, this.f74963b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f74962a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.f74962a);
        codedOutputByteBufferNano.writeString(2, this.f74963b);
        codedOutputByteBufferNano.writeString(3, this.f74964c);
        codedOutputByteBufferNano.writeUInt64(4, this.f74965d);
        codedOutputByteBufferNano.writeUInt64(5, this.f74966e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static c b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new c().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f74962a = int32;
                }
            } else if (tag == 18) {
                this.f74963b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                this.f74964c = codedInputByteBufferNano.readString();
            } else if (tag == 32) {
                this.f74965d = codedInputByteBufferNano.readUInt64();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f74966e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static c a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (c) MessageNano.mergeFrom(new c(), bArr);
    }
}
