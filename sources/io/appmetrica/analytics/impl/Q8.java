package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class Q8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Q8[] f76301b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P8[] f76302a;

    public Q8() {
        a();
    }

    public static Q8[] b() {
        if (f76301b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76301b == null) {
                        f76301b = new Q8[0];
                    }
                } finally {
                }
            }
        }
        return f76301b;
    }

    public final Q8 a() {
        this.f76302a = P8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        P8[] p8Arr = this.f76302a;
        if (p8Arr != null && p8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                P8[] p8Arr2 = this.f76302a;
                if (i10 >= p8Arr2.length) {
                    break;
                }
                P8 p82 = p8Arr2[i10];
                if (p82 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, p82) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        P8[] p8Arr = this.f76302a;
        if (p8Arr != null && p8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                P8[] p8Arr2 = this.f76302a;
                if (i10 >= p8Arr2.length) {
                    break;
                }
                P8 p82 = p8Arr2[i10];
                if (p82 != null) {
                    codedOutputByteBufferNano.writeMessage(1, p82);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                P8[] p8Arr = this.f76302a;
                int length = p8Arr == null ? 0 : p8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                P8[] p8Arr2 = new P8[i10];
                if (length != 0) {
                    System.arraycopy(p8Arr, 0, p8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    P8 p82 = new P8();
                    p8Arr2[length] = p82;
                    codedInputByteBufferNano.readMessage(p82);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                P8 p83 = new P8();
                p8Arr2[length] = p83;
                codedInputByteBufferNano.readMessage(p83);
                this.f76302a = p8Arr2;
            }
        }
        return this;
    }

    public static Q8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Q8().mergeFrom(codedInputByteBufferNano);
    }

    public static Q8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Q8) MessageNano.mergeFrom(new Q8(), bArr);
    }
}
