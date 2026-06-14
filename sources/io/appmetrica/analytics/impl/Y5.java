package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class Y5 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Y5[] f76690d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5137h6 f76691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5137h6[] f76692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f76693c;

    public Y5() {
        a();
    }

    public static Y5[] b() {
        if (f76690d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f76690d == null) {
                        f76690d = new Y5[0];
                    }
                } finally {
                }
            }
        }
        return f76690d;
    }

    public final Y5 a() {
        this.f76691a = null;
        this.f76692b = C5137h6.b();
        this.f76693c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5137h6 c5137h6 = this.f76691a;
        if (c5137h6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5137h6);
        }
        C5137h6[] c5137h6Arr = this.f76692b;
        if (c5137h6Arr != null && c5137h6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5137h6[] c5137h6Arr2 = this.f76692b;
                if (i10 >= c5137h6Arr2.length) {
                    break;
                }
                C5137h6 c5137h62 = c5137h6Arr2[i10];
                if (c5137h62 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c5137h62) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return !this.f76693c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.f76693c) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5137h6 c5137h6 = this.f76691a;
        if (c5137h6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5137h6);
        }
        C5137h6[] c5137h6Arr = this.f76692b;
        if (c5137h6Arr != null && c5137h6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5137h6[] c5137h6Arr2 = this.f76692b;
                if (i10 >= c5137h6Arr2.length) {
                    break;
                }
                C5137h6 c5137h62 = c5137h6Arr2[i10];
                if (c5137h62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c5137h62);
                }
                i10++;
            }
        }
        if (!this.f76693c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f76693c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f76691a == null) {
                    this.f76691a = new C5137h6();
                }
                codedInputByteBufferNano.readMessage(this.f76691a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C5137h6[] c5137h6Arr = this.f76692b;
                int length = c5137h6Arr == null ? 0 : c5137h6Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5137h6[] c5137h6Arr2 = new C5137h6[i10];
                if (length != 0) {
                    System.arraycopy(c5137h6Arr, 0, c5137h6Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5137h6 c5137h6 = new C5137h6();
                    c5137h6Arr2[length] = c5137h6;
                    codedInputByteBufferNano.readMessage(c5137h6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5137h6 c5137h62 = new C5137h6();
                c5137h6Arr2[length] = c5137h62;
                codedInputByteBufferNano.readMessage(c5137h62);
                this.f76692b = c5137h6Arr2;
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f76693c = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Y5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Y5().mergeFrom(codedInputByteBufferNano);
    }

    public static Y5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Y5) MessageNano.mergeFrom(new Y5(), bArr);
    }
}
