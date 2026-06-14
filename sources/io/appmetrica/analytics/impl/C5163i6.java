package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5163i6 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C5163i6[] f77376f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f77377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f77378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5111g6[] f77379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5163i6 f77380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C5163i6[] f77381e;

    public C5163i6() {
        a();
    }

    public static C5163i6[] b() {
        if (f77376f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77376f == null) {
                        f77376f = new C5163i6[0];
                    }
                } finally {
                }
            }
        }
        return f77376f;
    }

    public final C5163i6 a() {
        this.f77377a = "";
        this.f77378b = "";
        this.f77379c = C5111g6.b();
        this.f77380d = null;
        this.f77381e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f77377a) + super.computeSerializedSize();
        if (!this.f77378b.equals("")) {
            iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f77378b);
        }
        C5111g6[] c5111g6Arr = this.f77379c;
        int i10 = 0;
        if (c5111g6Arr != null && c5111g6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C5111g6[] c5111g6Arr2 = this.f77379c;
                if (i11 >= c5111g6Arr2.length) {
                    break;
                }
                C5111g6 c5111g6 = c5111g6Arr2[i11];
                if (c5111g6 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c5111g6) + iComputeStringSize;
                }
                i11++;
            }
        }
        C5163i6 c5163i6 = this.f77380d;
        if (c5163i6 != null) {
            iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c5163i6);
        }
        C5163i6[] c5163i6Arr = this.f77381e;
        if (c5163i6Arr != null && c5163i6Arr.length > 0) {
            while (true) {
                C5163i6[] c5163i6Arr2 = this.f77381e;
                if (i10 >= c5163i6Arr2.length) {
                    break;
                }
                C5163i6 c5163i62 = c5163i6Arr2[i10];
                if (c5163i62 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c5163i62) + iComputeStringSize;
                }
                i10++;
            }
        }
        return iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f77377a);
        if (!this.f77378b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f77378b);
        }
        C5111g6[] c5111g6Arr = this.f77379c;
        int i10 = 0;
        if (c5111g6Arr != null && c5111g6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C5111g6[] c5111g6Arr2 = this.f77379c;
                if (i11 >= c5111g6Arr2.length) {
                    break;
                }
                C5111g6 c5111g6 = c5111g6Arr2[i11];
                if (c5111g6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c5111g6);
                }
                i11++;
            }
        }
        C5163i6 c5163i6 = this.f77380d;
        if (c5163i6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5163i6);
        }
        C5163i6[] c5163i6Arr = this.f77381e;
        if (c5163i6Arr != null && c5163i6Arr.length > 0) {
            while (true) {
                C5163i6[] c5163i6Arr2 = this.f77381e;
                if (i10 >= c5163i6Arr2.length) {
                    break;
                }
                C5163i6 c5163i62 = c5163i6Arr2[i10];
                if (c5163i62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c5163i62);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5163i6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5163i6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5163i6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f77377a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f77378b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C5111g6[] c5111g6Arr = this.f77379c;
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
                this.f77379c = c5111g6Arr2;
            } else if (tag == 34) {
                if (this.f77380d == null) {
                    this.f77380d = new C5163i6();
                }
                codedInputByteBufferNano.readMessage(this.f77380d);
            } else if (tag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C5163i6[] c5163i6Arr = this.f77381e;
                int length2 = c5163i6Arr == null ? 0 : c5163i6Arr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                C5163i6[] c5163i6Arr2 = new C5163i6[i11];
                if (length2 != 0) {
                    System.arraycopy(c5163i6Arr, 0, c5163i6Arr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    C5163i6 c5163i6 = new C5163i6();
                    c5163i6Arr2[length2] = c5163i6;
                    codedInputByteBufferNano.readMessage(c5163i6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C5163i6 c5163i62 = new C5163i6();
                c5163i6Arr2[length2] = c5163i62;
                codedInputByteBufferNano.readMessage(c5163i62);
                this.f77381e = c5163i6Arr2;
            }
        }
        return this;
    }

    public static C5163i6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5163i6) MessageNano.mergeFrom(new C5163i6(), bArr);
    }
}
