package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5107g2 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C5107g2[] f77201d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5081f2[] f77202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5055e2 f77203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f77204c;

    public C5107g2() {
        a();
    }

    public static C5107g2[] b() {
        if (f77201d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77201d == null) {
                        f77201d = new C5107g2[0];
                    }
                } finally {
                }
            }
        }
        return f77201d;
    }

    public final C5107g2 a() {
        this.f77202a = C5081f2.b();
        this.f77203b = null;
        this.f77204c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5081f2[] c5081f2Arr = this.f77202a;
        int i10 = 0;
        if (c5081f2Arr != null && c5081f2Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C5081f2[] c5081f2Arr2 = this.f77202a;
                if (i11 >= c5081f2Arr2.length) {
                    break;
                }
                C5081f2 c5081f2 = c5081f2Arr2[i11];
                if (c5081f2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5081f2) + iComputeSerializedSize;
                }
                i11++;
            }
        }
        C5055e2 c5055e2 = this.f77203b;
        if (c5055e2 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5055e2);
        }
        String[] strArr = this.f77204c;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i12 = 0;
        while (true) {
            String[] strArr2 = this.f77204c;
            if (i10 >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i12;
            }
            String str = strArr2[i10];
            if (str != null) {
                i12++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5081f2[] c5081f2Arr = this.f77202a;
        int i10 = 0;
        if (c5081f2Arr != null && c5081f2Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C5081f2[] c5081f2Arr2 = this.f77202a;
                if (i11 >= c5081f2Arr2.length) {
                    break;
                }
                C5081f2 c5081f2 = c5081f2Arr2[i11];
                if (c5081f2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5081f2);
                }
                i11++;
            }
        }
        C5055e2 c5055e2 = this.f77203b;
        if (c5055e2 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5055e2);
        }
        String[] strArr = this.f77204c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f77204c;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5107g2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C5081f2[] c5081f2Arr = this.f77202a;
                int length = c5081f2Arr == null ? 0 : c5081f2Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5081f2[] c5081f2Arr2 = new C5081f2[i10];
                if (length != 0) {
                    System.arraycopy(c5081f2Arr, 0, c5081f2Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5081f2 c5081f2 = new C5081f2();
                    c5081f2Arr2[length] = c5081f2;
                    codedInputByteBufferNano.readMessage(c5081f2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5081f2 c5081f22 = new C5081f2();
                c5081f2Arr2[length] = c5081f22;
                codedInputByteBufferNano.readMessage(c5081f22);
                this.f77202a = c5081f2Arr2;
            } else if (tag == 18) {
                if (this.f77203b == null) {
                    this.f77203b = new C5055e2();
                }
                codedInputByteBufferNano.readMessage(this.f77203b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f77204c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i11];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f77204c = strArr2;
            }
        }
        return this;
    }

    public static C5107g2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5107g2().mergeFrom(codedInputByteBufferNano);
    }

    public static C5107g2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5107g2) MessageNano.mergeFrom(new C5107g2(), bArr);
    }
}
