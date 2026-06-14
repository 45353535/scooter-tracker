package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5391r8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5391r8[] f78124c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5367q8[] f78125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78126b;

    public C5391r8() {
        a();
    }

    public static C5391r8[] b() {
        if (f78124c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78124c == null) {
                        f78124c = new C5391r8[0];
                    }
                } finally {
                }
            }
        }
        return f78124c;
    }

    public final C5391r8 a() {
        this.f78125a = C5367q8.b();
        this.f78126b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5367q8[] c5367q8Arr = this.f78125a;
        if (c5367q8Arr != null && c5367q8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5367q8[] c5367q8Arr2 = this.f78125a;
                if (i10 >= c5367q8Arr2.length) {
                    break;
                }
                C5367q8 c5367q8 = c5367q8Arr2[i10];
                if (c5367q8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5367q8) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        int i11 = this.f78126b;
        return i11 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(2, i11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5367q8[] c5367q8Arr = this.f78125a;
        if (c5367q8Arr != null && c5367q8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5367q8[] c5367q8Arr2 = this.f78125a;
                if (i10 >= c5367q8Arr2.length) {
                    break;
                }
                C5367q8 c5367q8 = c5367q8Arr2[i10];
                if (c5367q8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5367q8);
                }
                i10++;
            }
        }
        int i11 = this.f78126b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5391r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C5367q8[] c5367q8Arr = this.f78125a;
                int length = c5367q8Arr == null ? 0 : c5367q8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5367q8[] c5367q8Arr2 = new C5367q8[i10];
                if (length != 0) {
                    System.arraycopy(c5367q8Arr, 0, c5367q8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5367q8 c5367q8 = new C5367q8();
                    c5367q8Arr2[length] = c5367q8;
                    codedInputByteBufferNano.readMessage(c5367q8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5367q8 c5367q82 = new C5367q8();
                c5367q8Arr2[length] = c5367q82;
                codedInputByteBufferNano.readMessage(c5367q82);
                this.f78125a = c5367q8Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f78126b = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C5391r8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5391r8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5391r8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5391r8) MessageNano.mergeFrom(new C5391r8(), bArr);
    }
}
