package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class Ni extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Ni[] f76171e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f76172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Oi f76173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f76175d;

    public Ni() {
        a();
    }

    public static Ni[] b() {
        if (f76171e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76171e == null) {
                        f76171e = new Ni[0];
                    }
                } finally {
                }
            }
        }
        return f76171e;
    }

    public final Ni a() {
        this.f76172a = 0L;
        this.f76173b = null;
        this.f76174c = 0;
        this.f76175d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f76172a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        Oi oi = this.f76173b;
        if (oi != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, oi);
        }
        int i10 = this.f76174c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i10);
        }
        return !Arrays.equals(this.f76175d, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(4, this.f76175d) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f76172a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        Oi oi = this.f76173b;
        if (oi != null) {
            codedOutputByteBufferNano.writeMessage(2, oi);
        }
        int i10 = this.f76174c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i10);
        }
        if (!Arrays.equals(this.f76175d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f76175d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f76172a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f76173b == null) {
                    this.f76173b = new Oi();
                }
                codedInputByteBufferNano.readMessage(this.f76173b);
            } else if (tag == 24) {
                this.f76174c = codedInputByteBufferNano.readUInt32();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f76175d = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Ni b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ni().mergeFrom(codedInputByteBufferNano);
    }

    public static Ni a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ni) MessageNano.mergeFrom(new Ni(), bArr);
    }
}
