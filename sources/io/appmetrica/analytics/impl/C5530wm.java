package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5530wm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5530wm[] f78535c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f78536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f78537b;

    public C5530wm() {
        a();
    }

    public static C5530wm[] b() {
        if (f78535c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78535c == null) {
                        f78535c = new C5530wm[0];
                    }
                } finally {
                }
            }
        }
        return f78535c;
    }

    public final C5530wm a() {
        this.f78536a = "";
        this.f78537b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f78536a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f78536a);
        }
        return !Arrays.equals(this.f78537b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f78537b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f78536a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f78536a);
        }
        if (!Arrays.equals(this.f78537b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f78537b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5530wm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f78536a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f78537b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C5530wm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5530wm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5530wm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5530wm) MessageNano.mergeFrom(new C5530wm(), bArr);
    }
}
