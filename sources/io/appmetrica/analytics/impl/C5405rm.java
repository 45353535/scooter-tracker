package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5405rm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5405rm[] f78171b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5381qm[] f78172a;

    public C5405rm() {
        a();
    }

    public static C5405rm[] b() {
        if (f78171b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78171b == null) {
                        f78171b = new C5405rm[0];
                    }
                } finally {
                }
            }
        }
        return f78171b;
    }

    public final C5405rm a() {
        this.f78172a = C5381qm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5381qm[] c5381qmArr = this.f78172a;
        if (c5381qmArr != null && c5381qmArr.length > 0) {
            int i10 = 0;
            while (true) {
                C5381qm[] c5381qmArr2 = this.f78172a;
                if (i10 >= c5381qmArr2.length) {
                    break;
                }
                C5381qm c5381qm = c5381qmArr2[i10];
                if (c5381qm != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5381qm) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5381qm[] c5381qmArr = this.f78172a;
        if (c5381qmArr != null && c5381qmArr.length > 0) {
            int i10 = 0;
            while (true) {
                C5381qm[] c5381qmArr2 = this.f78172a;
                if (i10 >= c5381qmArr2.length) {
                    break;
                }
                C5381qm c5381qm = c5381qmArr2[i10];
                if (c5381qm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5381qm);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5405rm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C5381qm[] c5381qmArr = this.f78172a;
                int length = c5381qmArr == null ? 0 : c5381qmArr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5381qm[] c5381qmArr2 = new C5381qm[i10];
                if (length != 0) {
                    System.arraycopy(c5381qmArr, 0, c5381qmArr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5381qm c5381qm = new C5381qm();
                    c5381qmArr2[length] = c5381qm;
                    codedInputByteBufferNano.readMessage(c5381qm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5381qm c5381qm2 = new C5381qm();
                c5381qmArr2[length] = c5381qm2;
                codedInputByteBufferNano.readMessage(c5381qm2);
                this.f78172a = c5381qmArr2;
            }
        }
        return this;
    }

    public static C5405rm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5405rm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5405rm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5405rm) MessageNano.mergeFrom(new C5405rm(), bArr);
    }
}
