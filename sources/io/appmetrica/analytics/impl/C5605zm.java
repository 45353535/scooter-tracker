package io.appmetrica.analytics.impl;

import androidx.work.WorkRequest;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5605zm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5605zm[] f78661b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f78662a;

    public C5605zm() {
        a();
    }

    public static C5605zm[] b() {
        if (f78661b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78661b == null) {
                        f78661b = new C5605zm[0];
                    }
                } finally {
                }
            }
        }
        return f78661b;
    }

    public final C5605zm a() {
        this.f78662a = WorkRequest.MAX_BACKOFF_MILLIS;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f78662a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f78662a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5605zm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f78662a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C5605zm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5605zm) MessageNano.mergeFrom(new C5605zm(), bArr);
    }

    public static C5605zm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5605zm().mergeFrom(codedInputByteBufferNano);
    }
}
