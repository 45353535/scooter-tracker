package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5268m9 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f77748d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f77749e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f77750f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C5268m9[] f77751g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5343p9 f77752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f77753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77754c;

    public C5268m9() {
        a();
    }

    public static C5268m9[] b() {
        if (f77751g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77751g == null) {
                        f77751g = new C5268m9[0];
                    }
                } finally {
                }
            }
        }
        return f77751g;
    }

    public final C5268m9 a() {
        this.f77752a = null;
        this.f77753b = "";
        this.f77754c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5343p9 c5343p9 = this.f77752a;
        if (c5343p9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5343p9);
        }
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f77753b) + iComputeSerializedSize;
        int i10 = this.f77754c;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(5, i10) + iComputeStringSize : iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5343p9 c5343p9 = this.f77752a;
        if (c5343p9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5343p9);
        }
        codedOutputByteBufferNano.writeString(2, this.f77753b);
        int i10 = this.f77754c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(5, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5268m9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f77752a == null) {
                    this.f77752a = new C5343p9();
                }
                codedInputByteBufferNano.readMessage(this.f77752a);
            } else if (tag == 18) {
                this.f77753b = codedInputByteBufferNano.readString();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f77754c = int32;
                }
            }
        }
        return this;
    }

    public static C5268m9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5268m9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5268m9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5268m9) MessageNano.mergeFrom(new C5268m9(), bArr);
    }
}
