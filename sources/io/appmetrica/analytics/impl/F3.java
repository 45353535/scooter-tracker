package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class F3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f75758c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f75759d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f75760e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f75761f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile F3[] f75762g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3 f75763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3[] f75764b;

    public F3() {
        a();
    }

    public static F3[] b() {
        if (f75762g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f75762g == null) {
                        f75762g = new F3[0];
                    }
                } finally {
                }
            }
        }
        return f75762g;
    }

    public final F3 a() {
        this.f75763a = null;
        this.f75764b = C3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C3 c32 = this.f75763a;
        if (c32 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c32);
        }
        C3[] c3Arr = this.f75764b;
        if (c3Arr != null && c3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C3[] c3Arr2 = this.f75764b;
                if (i10 >= c3Arr2.length) {
                    break;
                }
                C3 c33 = c3Arr2[i10];
                if (c33 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c33) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3 c32 = this.f75763a;
        if (c32 != null) {
            codedOutputByteBufferNano.writeMessage(1, c32);
        }
        C3[] c3Arr = this.f75764b;
        if (c3Arr != null && c3Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C3[] c3Arr2 = this.f75764b;
                if (i10 >= c3Arr2.length) {
                    break;
                }
                C3 c33 = c3Arr2[i10];
                if (c33 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c33);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f75763a == null) {
                    this.f75763a = new C3();
                }
                codedInputByteBufferNano.readMessage(this.f75763a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3[] c3Arr = this.f75764b;
                int length = c3Arr == null ? 0 : c3Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C3[] c3Arr2 = new C3[i10];
                if (length != 0) {
                    System.arraycopy(c3Arr, 0, c3Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C3 c32 = new C3();
                    c3Arr2[length] = c32;
                    codedInputByteBufferNano.readMessage(c32);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3 c33 = new C3();
                c3Arr2[length] = c33;
                codedInputByteBufferNano.readMessage(c33);
                this.f75764b = c3Arr2;
            }
        }
        return this;
    }

    public static F3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new F3().mergeFrom(codedInputByteBufferNano);
    }

    public static F3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (F3) MessageNano.mergeFrom(new F3(), bArr);
    }
}
