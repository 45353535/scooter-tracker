package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class A8 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f75501g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f75502h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f75503i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f75504j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f75505k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f75506l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f75507m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f75508n = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile A8[] f75509o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5591z8 f75511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5541x8 f75512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5566y8 f75513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C5190j8 f75514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C5342p8 f75515f;

    public A8() {
        a();
    }

    public static A8[] b() {
        if (f75509o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f75509o == null) {
                        f75509o = new A8[0];
                    }
                } finally {
                }
            }
        }
        return f75509o;
    }

    public final A8 a() {
        this.f75510a = 0;
        this.f75511b = null;
        this.f75512c = null;
        this.f75513d = null;
        this.f75514e = null;
        this.f75515f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f75510a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        C5591z8 c5591z8 = this.f75511b;
        if (c5591z8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5591z8);
        }
        C5541x8 c5541x8 = this.f75512c;
        if (c5541x8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5541x8);
        }
        C5566y8 c5566y8 = this.f75513d;
        if (c5566y8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c5566y8);
        }
        C5190j8 c5190j8 = this.f75514e;
        if (c5190j8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c5190j8);
        }
        C5342p8 c5342p8 = this.f75515f;
        return c5342p8 != null ? CodedOutputByteBufferNano.computeMessageSize(6, c5342p8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f75510a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        C5591z8 c5591z8 = this.f75511b;
        if (c5591z8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5591z8);
        }
        C5541x8 c5541x8 = this.f75512c;
        if (c5541x8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5541x8);
        }
        C5566y8 c5566y8 = this.f75513d;
        if (c5566y8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5566y8);
        }
        C5190j8 c5190j8 = this.f75514e;
        if (c5190j8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c5190j8);
        }
        C5342p8 c5342p8 = this.f75515f;
        if (c5342p8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c5342p8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static A8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new A8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag != 0) {
                if (tag == 8) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f75510a = int32;
                            break;
                    }
                } else if (tag == 18) {
                    if (this.f75511b == null) {
                        this.f75511b = new C5591z8();
                    }
                    codedInputByteBufferNano.readMessage(this.f75511b);
                } else if (tag == 26) {
                    if (this.f75512c == null) {
                        this.f75512c = new C5541x8();
                    }
                    codedInputByteBufferNano.readMessage(this.f75512c);
                } else if (tag == 34) {
                    if (this.f75513d == null) {
                        this.f75513d = new C5566y8();
                    }
                    codedInputByteBufferNano.readMessage(this.f75513d);
                } else if (tag == 42) {
                    if (this.f75514e == null) {
                        this.f75514e = new C5190j8();
                    }
                    codedInputByteBufferNano.readMessage(this.f75514e);
                } else if (tag != 50) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                } else {
                    if (this.f75515f == null) {
                        this.f75515f = new C5342p8();
                    }
                    codedInputByteBufferNano.readMessage(this.f75515f);
                }
            }
        }
        return this;
    }

    public static A8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (A8) MessageNano.mergeFrom(new A8(), bArr);
    }
}
