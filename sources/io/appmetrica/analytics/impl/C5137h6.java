package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5137h6 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C5137h6[] f77291g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f77292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f77294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f77295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C5111g6[] f77297f;

    public C5137h6() {
        a();
    }

    public static C5137h6[] b() {
        if (f77291g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77291g == null) {
                        f77291g = new C5137h6[0];
                    }
                } finally {
                }
            }
        }
        return f77291g;
    }

    public final C5137h6 a() {
        this.f77292a = "";
        this.f77293b = 0;
        this.f77294c = 0L;
        this.f77295d = "";
        this.f77296e = 0;
        this.f77297f = C5111g6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f77294c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f77293b) + CodedOutputByteBufferNano.computeStringSize(1, this.f77292a) + super.computeSerializedSize();
        if (!this.f77295d.equals("")) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f77295d);
        }
        int i10 = this.f77296e;
        if (i10 != 0) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i10);
        }
        C5111g6[] c5111g6Arr = this.f77297f;
        if (c5111g6Arr != null && c5111g6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C5111g6[] c5111g6Arr2 = this.f77297f;
                if (i11 >= c5111g6Arr2.length) {
                    break;
                }
                C5111g6 c5111g6 = c5111g6Arr2[i11];
                if (c5111g6 != null) {
                    iComputeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, c5111g6) + iComputeSInt64Size;
                }
                i11++;
            }
        }
        return iComputeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f77292a);
        codedOutputByteBufferNano.writeSInt32(2, this.f77293b);
        codedOutputByteBufferNano.writeSInt64(3, this.f77294c);
        if (!this.f77295d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f77295d);
        }
        int i10 = this.f77296e;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        C5111g6[] c5111g6Arr = this.f77297f;
        if (c5111g6Arr != null && c5111g6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C5111g6[] c5111g6Arr2 = this.f77297f;
                if (i11 >= c5111g6Arr2.length) {
                    break;
                }
                C5111g6 c5111g6 = c5111g6Arr2[i11];
                if (c5111g6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c5111g6);
                }
                i11++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5137h6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5137h6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5137h6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f77292a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f77293b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f77294c = codedInputByteBufferNano.readSInt64();
            } else if (tag == 34) {
                this.f77295d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f77296e = codedInputByteBufferNano.readUInt32();
            } else if (tag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C5111g6[] c5111g6Arr = this.f77297f;
                int length = c5111g6Arr == null ? 0 : c5111g6Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5111g6[] c5111g6Arr2 = new C5111g6[i10];
                if (length != 0) {
                    System.arraycopy(c5111g6Arr, 0, c5111g6Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5111g6 c5111g6 = new C5111g6();
                    c5111g6Arr2[length] = c5111g6;
                    codedInputByteBufferNano.readMessage(c5111g6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5111g6 c5111g62 = new C5111g6();
                c5111g6Arr2[length] = c5111g62;
                codedInputByteBufferNano.readMessage(c5111g62);
                this.f77297f = c5111g6Arr2;
            }
        }
        return this;
    }

    public static C5137h6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5137h6) MessageNano.mergeFrom(new C5137h6(), bArr);
    }
}
