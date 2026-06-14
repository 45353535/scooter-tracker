package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5423sf extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f78229c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f78230d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f78231e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f78232f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C5423sf[] f78233g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5374qf f78234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5398rf[] f78235b;

    public C5423sf() {
        a();
    }

    public static C5423sf[] b() {
        if (f78233g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78233g == null) {
                        f78233g = new C5423sf[0];
                    }
                } finally {
                }
            }
        }
        return f78233g;
    }

    public final C5423sf a() {
        this.f78234a = null;
        this.f78235b = C5398rf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5374qf c5374qf = this.f78234a;
        if (c5374qf != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5374qf);
        }
        C5398rf[] c5398rfArr = this.f78235b;
        if (c5398rfArr != null && c5398rfArr.length > 0) {
            int i10 = 0;
            while (true) {
                C5398rf[] c5398rfArr2 = this.f78235b;
                if (i10 >= c5398rfArr2.length) {
                    break;
                }
                C5398rf c5398rf = c5398rfArr2[i10];
                if (c5398rf != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c5398rf) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5374qf c5374qf = this.f78234a;
        if (c5374qf != null) {
            codedOutputByteBufferNano.writeMessage(1, c5374qf);
        }
        C5398rf[] c5398rfArr = this.f78235b;
        if (c5398rfArr != null && c5398rfArr.length > 0) {
            int i10 = 0;
            while (true) {
                C5398rf[] c5398rfArr2 = this.f78235b;
                if (i10 >= c5398rfArr2.length) {
                    break;
                }
                C5398rf c5398rf = c5398rfArr2[i10];
                if (c5398rf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c5398rf);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5423sf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f78234a == null) {
                    this.f78234a = new C5374qf();
                }
                codedInputByteBufferNano.readMessage(this.f78234a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C5398rf[] c5398rfArr = this.f78235b;
                int length = c5398rfArr == null ? 0 : c5398rfArr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5398rf[] c5398rfArr2 = new C5398rf[i10];
                if (length != 0) {
                    System.arraycopy(c5398rfArr, 0, c5398rfArr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5398rf c5398rf = new C5398rf();
                    c5398rfArr2[length] = c5398rf;
                    codedInputByteBufferNano.readMessage(c5398rf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5398rf c5398rf2 = new C5398rf();
                c5398rfArr2[length] = c5398rf2;
                codedInputByteBufferNano.readMessage(c5398rf2);
                this.f78235b = c5398rfArr2;
            }
        }
        return this;
    }

    public static C5423sf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5423sf().mergeFrom(codedInputByteBufferNano);
    }

    public static C5423sf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5423sf) MessageNano.mergeFrom(new C5423sf(), bArr);
    }
}
