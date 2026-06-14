package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5155ho extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f77350e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f77351f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f77352g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f77353h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile C5155ho[] f77354i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f77355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5180io f77357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5206jo f77358d;

    public C5155ho() {
        a();
    }

    public static C5155ho[] b() {
        if (f77354i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77354i == null) {
                        f77354i = new C5155ho[0];
                    }
                } finally {
                }
            }
        }
        return f77354i;
    }

    public final C5155ho a() {
        this.f77355a = WireFormatNano.EMPTY_BYTES;
        this.f77356b = 0;
        this.f77357c = null;
        this.f77358d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f77356b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f77355a) + super.computeSerializedSize();
        C5180io c5180io = this.f77357c;
        if (c5180io != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c5180io);
        }
        C5206jo c5206jo = this.f77358d;
        return c5206jo != null ? CodedOutputByteBufferNano.computeMessageSize(4, c5206jo) + iComputeInt32Size : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f77355a);
        codedOutputByteBufferNano.writeInt32(2, this.f77356b);
        C5180io c5180io = this.f77357c;
        if (c5180io != null) {
            codedOutputByteBufferNano.writeMessage(3, c5180io);
        }
        C5206jo c5206jo = this.f77358d;
        if (c5206jo != null) {
            codedOutputByteBufferNano.writeMessage(4, c5206jo);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5155ho mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f77355a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f77356b = int32;
                }
            } else if (tag == 26) {
                if (this.f77357c == null) {
                    this.f77357c = new C5180io();
                }
                codedInputByteBufferNano.readMessage(this.f77357c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f77358d == null) {
                    this.f77358d = new C5206jo();
                }
                codedInputByteBufferNano.readMessage(this.f77358d);
            }
        }
        return this;
    }

    public static C5155ho b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5155ho().mergeFrom(codedInputByteBufferNano);
    }

    public static C5155ho a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5155ho) MessageNano.mergeFrom(new C5155ho(), bArr);
    }
}
