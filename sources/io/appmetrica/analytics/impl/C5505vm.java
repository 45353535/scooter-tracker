package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5505vm extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C5505vm[] f78465g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f78466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f78467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f78470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f78471f;

    public C5505vm() {
        a();
    }

    public static C5505vm[] b() {
        if (f78465g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78465g == null) {
                        f78465g = new C5505vm[0];
                    }
                } finally {
                }
            }
        }
        return f78465g;
    }

    public final C5505vm a() {
        this.f78466a = false;
        this.f78467b = false;
        this.f78468c = false;
        this.f78469d = false;
        this.f78470e = false;
        this.f78471f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f78469d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f78468c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f78467b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f78466a) + super.computeSerializedSize();
        boolean z10 = this.f78470e;
        if (z10) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z10);
        }
        int i10 = this.f78471f;
        return i10 != -1 ? CodedOutputByteBufferNano.computeInt32Size(6, i10) + iComputeBoolSize : iComputeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f78466a);
        codedOutputByteBufferNano.writeBool(2, this.f78467b);
        codedOutputByteBufferNano.writeBool(3, this.f78468c);
        codedOutputByteBufferNano.writeBool(4, this.f78469d);
        boolean z10 = this.f78470e;
        if (z10) {
            codedOutputByteBufferNano.writeBool(5, z10);
        }
        int i10 = this.f78471f;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5505vm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5505vm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5505vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f78466a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f78467b = codedInputByteBufferNano.readBool();
            } else if (tag == 24) {
                this.f78468c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f78469d = codedInputByteBufferNano.readBool();
            } else if (tag == 40) {
                this.f78470e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f78471f = int32;
                }
            }
        }
        return this;
    }

    public static C5505vm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5505vm) MessageNano.mergeFrom(new C5505vm(), bArr);
    }
}
