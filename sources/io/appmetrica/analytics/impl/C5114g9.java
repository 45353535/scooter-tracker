package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5114g9 extends MessageNano {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f77234j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f77235k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f77236l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile C5114g9[] f77237m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f77238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f77239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f77240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f77241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f77244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f77245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f77246i;

    public C5114g9() {
        a();
    }

    public static C5114g9[] b() {
        if (f77237m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77237m == null) {
                        f77237m = new C5114g9[0];
                    }
                } finally {
                }
            }
        }
        return f77237m;
    }

    public final C5114g9 a() {
        this.f77238a = 0.0d;
        this.f77239b = 0.0d;
        this.f77240c = 0L;
        this.f77241d = 0;
        this.f77242e = 0;
        this.f77243f = 0;
        this.f77244g = 0;
        this.f77245h = 0;
        this.f77246i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f77239b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f77238a) + super.computeSerializedSize();
        long j10 = this.f77240c;
        if (j10 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j10);
        }
        int i10 = this.f77241d;
        if (i10 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i10);
        }
        int i11 = this.f77242e;
        if (i11 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i11);
        }
        int i12 = this.f77243f;
        if (i12 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i12);
        }
        int i13 = this.f77244g;
        if (i13 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i13);
        }
        int i14 = this.f77245h;
        if (i14 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i14);
        }
        return !this.f77246i.equals("") ? CodedOutputByteBufferNano.computeStringSize(9, this.f77246i) + iComputeDoubleSize : iComputeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.f77238a);
        codedOutputByteBufferNano.writeDouble(2, this.f77239b);
        long j10 = this.f77240c;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j10);
        }
        int i10 = this.f77241d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i10);
        }
        int i11 = this.f77242e;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i11);
        }
        int i12 = this.f77243f;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i12);
        }
        int i13 = this.f77244g;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i13);
        }
        int i14 = this.f77245h;
        if (i14 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i14);
        }
        if (!this.f77246i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f77246i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5114g9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5114g9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5114g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 9) {
                this.f77238a = codedInputByteBufferNano.readDouble();
            } else if (tag == 17) {
                this.f77239b = codedInputByteBufferNano.readDouble();
            } else if (tag == 24) {
                this.f77240c = codedInputByteBufferNano.readUInt64();
            } else if (tag == 32) {
                this.f77241d = codedInputByteBufferNano.readUInt32();
            } else if (tag == 40) {
                this.f77242e = codedInputByteBufferNano.readUInt32();
            } else if (tag == 48) {
                this.f77243f = codedInputByteBufferNano.readUInt32();
            } else if (tag == 56) {
                this.f77244g = codedInputByteBufferNano.readInt32();
            } else if (tag == 64) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f77245h = int32;
                }
            } else if (tag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f77246i = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C5114g9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5114g9) MessageNano.mergeFrom(new C5114g9(), bArr);
    }
}
