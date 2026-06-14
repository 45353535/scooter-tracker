package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile v[] f74998e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f74999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f75000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f75002d;

    public v() {
        a();
    }

    public static v[] b() {
        if (f74998e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f74998e == null) {
                        f74998e = new v[0];
                    }
                } finally {
                }
            }
        }
        return f74998e;
    }

    public final v a() {
        this.f74999a = 0L;
        this.f75000b = null;
        this.f75001c = 0;
        this.f75002d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f74999a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        w wVar = this.f75000b;
        if (wVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        int i10 = this.f75001c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i10);
        }
        return !Arrays.equals(this.f75002d, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(4, this.f75002d) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f74999a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        w wVar = this.f75000b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        int i10 = this.f75001c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i10);
        }
        if (!Arrays.equals(this.f75002d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f75002d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f74999a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f75000b == null) {
                    this.f75000b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f75000b);
            } else if (tag == 24) {
                this.f75001c = codedInputByteBufferNano.readUInt32();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f75002d = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static v b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new v().mergeFrom(codedInputByteBufferNano);
    }

    public static v a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (v) MessageNano.mergeFrom(new v(), bArr);
    }
}
