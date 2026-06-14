package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5055e2 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f77048c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f77049d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f77050e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f77051f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f77052g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f77053h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f77054i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f77055j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f77056k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile C5055e2[] f77057l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f77058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77059b;

    public C5055e2() {
        a();
    }

    public static C5055e2[] b() {
        if (f77057l == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77057l == null) {
                        f77057l = new C5055e2[0];
                    }
                } finally {
                }
            }
        }
        return f77057l;
    }

    public final C5055e2 a() {
        this.f77058a = 0;
        this.f77059b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f77059b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f77058a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(2, this.f77058a);
        codedOutputByteBufferNano.writeInt32(3, this.f77059b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5055e2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4 || int32 == 5) {
                    this.f77058a = int32;
                }
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int322 = codedInputByteBufferNano.readInt32();
                if (int322 == -1 || int322 == 0 || int322 == 1) {
                    this.f77059b = int322;
                }
            }
        }
        return this;
    }

    public static C5055e2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5055e2().mergeFrom(codedInputByteBufferNano);
    }

    public static C5055e2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5055e2) MessageNano.mergeFrom(new C5055e2(), bArr);
    }
}
