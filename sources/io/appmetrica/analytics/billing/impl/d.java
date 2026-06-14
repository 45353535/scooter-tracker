package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f74967c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f74968d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f74969e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile d[] f74970f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c[] f74971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f74972b;

    public d() {
        a();
    }

    public static d[] b() {
        if (f74970f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f74970f == null) {
                        f74970f = new d[0];
                    }
                } finally {
                }
            }
        }
        return f74970f;
    }

    public final d a() {
        this.f74971a = c.b();
        this.f74972b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        c[] cVarArr = this.f74971a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                c[] cVarArr2 = this.f74971a;
                if (i10 >= cVarArr2.length) {
                    break;
                }
                c cVar = cVarArr2[i10];
                if (cVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, cVar) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f74972b) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        c[] cVarArr = this.f74971a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                c[] cVarArr2 = this.f74971a;
                if (i10 >= cVarArr2.length) {
                    break;
                }
                c cVar = cVarArr2[i10];
                if (cVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, cVar);
                }
                i10++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f74972b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                c[] cVarArr = this.f74971a;
                int length = cVarArr == null ? 0 : cVarArr.length;
                int i10 = repeatedFieldArrayLength + length;
                c[] cVarArr2 = new c[i10];
                if (length != 0) {
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                }
                while (length < i10 - 1) {
                    c cVar = new c();
                    cVarArr2[length] = cVar;
                    codedInputByteBufferNano.readMessage(cVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                c cVar2 = new c();
                cVarArr2[length] = cVar2;
                codedInputByteBufferNano.readMessage(cVar2);
                this.f74971a = cVarArr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f74972b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static d b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new d().mergeFrom(codedInputByteBufferNano);
    }

    public static d a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (d) MessageNano.mergeFrom(new d(), bArr);
    }
}
