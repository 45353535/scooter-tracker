package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5416s8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5416s8[] f78219c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5165i8 f78220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5165i8[] f78221b;

    public C5416s8() {
        a();
    }

    public static C5416s8[] b() {
        if (f78219c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78219c == null) {
                        f78219c = new C5416s8[0];
                    }
                } finally {
                }
            }
        }
        return f78219c;
    }

    public final C5416s8 a() {
        this.f78220a = null;
        this.f78221b = C5165i8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5165i8 c5165i8 = this.f78220a;
        if (c5165i8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5165i8);
        }
        C5165i8[] c5165i8Arr = this.f78221b;
        if (c5165i8Arr != null && c5165i8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5165i8[] c5165i8Arr2 = this.f78221b;
                if (i10 >= c5165i8Arr2.length) {
                    break;
                }
                C5165i8 c5165i82 = c5165i8Arr2[i10];
                if (c5165i82 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c5165i82) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5165i8 c5165i8 = this.f78220a;
        if (c5165i8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5165i8);
        }
        C5165i8[] c5165i8Arr = this.f78221b;
        if (c5165i8Arr != null && c5165i8Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5165i8[] c5165i8Arr2 = this.f78221b;
                if (i10 >= c5165i8Arr2.length) {
                    break;
                }
                C5165i8 c5165i82 = c5165i8Arr2[i10];
                if (c5165i82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c5165i82);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5416s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f78220a == null) {
                    this.f78220a = new C5165i8();
                }
                codedInputByteBufferNano.readMessage(this.f78220a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C5165i8[] c5165i8Arr = this.f78221b;
                int length = c5165i8Arr == null ? 0 : c5165i8Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5165i8[] c5165i8Arr2 = new C5165i8[i10];
                if (length != 0) {
                    System.arraycopy(c5165i8Arr, 0, c5165i8Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5165i8 c5165i8 = new C5165i8();
                    c5165i8Arr2[length] = c5165i8;
                    codedInputByteBufferNano.readMessage(c5165i8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5165i8 c5165i82 = new C5165i8();
                c5165i8Arr2[length] = c5165i82;
                codedInputByteBufferNano.readMessage(c5165i82);
                this.f78221b = c5165i8Arr2;
            }
        }
        return this;
    }

    public static C5416s8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5416s8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5416s8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5416s8) MessageNano.mergeFrom(new C5416s8(), bArr);
    }
}
