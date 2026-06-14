package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5398rf extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C5398rf[] f78148d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f78149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f78150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78151c;

    public C5398rf() {
        a();
    }

    public static C5398rf[] b() {
        if (f78148d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78148d == null) {
                        f78148d = new C5398rf[0];
                    }
                } finally {
                }
            }
        }
        return f78148d;
    }

    public final C5398rf a() {
        this.f78149a = "";
        this.f78150b = "";
        this.f78151c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f78149a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f78149a);
        }
        if (!this.f78150b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f78150b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f78151c) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f78149a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f78149a);
        }
        if (!this.f78150b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f78150b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f78151c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5398rf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f78149a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f78150b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f78151c = int32;
                }
            }
        }
        return this;
    }

    public static C5398rf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5398rf().mergeFrom(codedInputByteBufferNano);
    }

    public static C5398rf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5398rf) MessageNano.mergeFrom(new C5398rf(), bArr);
    }
}
