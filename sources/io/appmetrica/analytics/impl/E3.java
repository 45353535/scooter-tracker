package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class E3 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile E3[] f75707b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D3[] f75708a;

    public E3() {
        a();
    }

    public static E3[] b() {
        if (f75707b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f75707b == null) {
                        f75707b = new E3[0];
                    }
                } finally {
                }
            }
        }
        return f75707b;
    }

    public final E3 a() {
        this.f75708a = D3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        D3[] d3Arr = this.f75708a;
        if (d3Arr != null && d3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                D3[] d3Arr2 = this.f75708a;
                if (i10 >= d3Arr2.length) {
                    break;
                }
                D3 d32 = d3Arr2[i10];
                if (d32 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, d32) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        D3[] d3Arr = this.f75708a;
        if (d3Arr != null && d3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                D3[] d3Arr2 = this.f75708a;
                if (i10 >= d3Arr2.length) {
                    break;
                }
                D3 d32 = d3Arr2[i10];
                if (d32 != null) {
                    codedOutputByteBufferNano.writeMessage(1, d32);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                D3[] d3Arr = this.f75708a;
                int length = d3Arr == null ? 0 : d3Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                D3[] d3Arr2 = new D3[i10];
                if (length != 0) {
                    System.arraycopy(d3Arr, 0, d3Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    D3 d32 = new D3();
                    d3Arr2[length] = d32;
                    codedInputByteBufferNano.readMessage(d32);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                D3 d33 = new D3();
                d3Arr2[length] = d33;
                codedInputByteBufferNano.readMessage(d33);
                this.f75708a = d3Arr2;
            }
        }
        return this;
    }

    public static E3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new E3().mergeFrom(codedInputByteBufferNano);
    }

    public static E3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (E3) MessageNano.mergeFrom(new E3(), bArr);
    }
}
