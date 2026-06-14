package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5217k9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5217k9[] f77596c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f77597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f77598b;

    public C5217k9() {
        a();
    }

    public static C5217k9[] b() {
        if (f77596c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77596c == null) {
                        f77596c = new C5217k9[0];
                    }
                } finally {
                }
            }
        }
        return f77596c;
    }

    public final C5217k9 a() {
        this.f77597a = 2;
        this.f77598b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f77597a;
        if (i10 != 2) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        return !this.f77598b.equals("") ? CodedOutputByteBufferNano.computeStringSize(4, this.f77598b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f77597a;
        if (i10 != 2) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!this.f77598b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f77598b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5217k9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag != 0) {
                if (tag == 24) {
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
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            this.f77597a = int32;
                            break;
                    }
                } else if (tag != 34) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                } else {
                    this.f77598b = codedInputByteBufferNano.readString();
                }
            }
        }
        return this;
    }

    public static C5217k9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5217k9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5217k9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5217k9) MessageNano.mergeFrom(new C5217k9(), bArr);
    }
}
