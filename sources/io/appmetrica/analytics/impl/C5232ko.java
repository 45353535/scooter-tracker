package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5232ko extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5232ko[] f77632b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5155ho[] f77633a;

    public C5232ko() {
        a();
    }

    public static C5232ko[] b() {
        if (f77632b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77632b == null) {
                        f77632b = new C5232ko[0];
                    }
                } finally {
                }
            }
        }
        return f77632b;
    }

    public final C5232ko a() {
        this.f77633a = C5155ho.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5155ho[] c5155hoArr = this.f77633a;
        if (c5155hoArr != null && c5155hoArr.length > 0) {
            int i10 = 0;
            while (true) {
                C5155ho[] c5155hoArr2 = this.f77633a;
                if (i10 >= c5155hoArr2.length) {
                    break;
                }
                C5155ho c5155ho = c5155hoArr2[i10];
                if (c5155ho != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5155ho) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5155ho[] c5155hoArr = this.f77633a;
        if (c5155hoArr != null && c5155hoArr.length > 0) {
            int i10 = 0;
            while (true) {
                C5155ho[] c5155hoArr2 = this.f77633a;
                if (i10 >= c5155hoArr2.length) {
                    break;
                }
                C5155ho c5155ho = c5155hoArr2[i10];
                if (c5155ho != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5155ho);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5232ko mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C5155ho[] c5155hoArr = this.f77633a;
                int length = c5155hoArr == null ? 0 : c5155hoArr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5155ho[] c5155hoArr2 = new C5155ho[i10];
                if (length != 0) {
                    System.arraycopy(c5155hoArr, 0, c5155hoArr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5155ho c5155ho = new C5155ho();
                    c5155hoArr2[length] = c5155ho;
                    codedInputByteBufferNano.readMessage(c5155ho);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5155ho c5155ho2 = new C5155ho();
                c5155hoArr2[length] = c5155ho2;
                codedInputByteBufferNano.readMessage(c5155ho2);
                this.f77633a = c5155hoArr2;
            }
        }
        return this;
    }

    public static C5232ko b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5232ko().mergeFrom(codedInputByteBufferNano);
    }

    public static C5232ko a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5232ko) MessageNano.mergeFrom(new C5232ko(), bArr);
    }
}
