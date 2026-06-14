package io.appmetrica.analytics.impl;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5465u7 extends MessageNano {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile C5465u7[] f78329s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f78331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f78332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f78333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C5490v7 f78334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f78335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f78336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f78337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f78338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f78339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f78340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f78341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f78342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f78343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f78344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f78345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f78346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f78347r;

    public C5465u7() {
        a();
    }

    public static C5465u7[] b() {
        if (f78329s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f78329s == null) {
                        f78329s = new C5465u7[0];
                    }
                } finally {
                }
            }
        }
        return f78329s;
    }

    public final C5465u7 a() {
        this.f78330a = -1;
        this.f78331b = "";
        this.f78332c = "";
        this.f78333d = -1L;
        this.f78334e = null;
        this.f78335f = "";
        this.f78336g = "";
        this.f78337h = -1L;
        this.f78338i = -1;
        this.f78339j = -1;
        this.f78340k = "";
        this.f78341l = -1;
        this.f78342m = "";
        this.f78343n = -1;
        this.f78344o = -1;
        this.f78345p = -1;
        this.f78346q = -1;
        this.f78347r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f78330a;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        if (!this.f78331b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f78331b);
        }
        if (!this.f78332c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f78332c);
        }
        long j10 = this.f78333d;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j10);
        }
        C5490v7 c5490v7 = this.f78334e;
        if (c5490v7 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c5490v7);
        }
        if (!this.f78335f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f78335f);
        }
        if (!this.f78336g.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f78336g);
        }
        long j11 = this.f78337h;
        if (j11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j11);
        }
        int i11 = this.f78338i;
        if (i11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i11);
        }
        int i12 = this.f78339j;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i12);
        }
        if (!this.f78340k.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f78340k);
        }
        int i13 = this.f78341l;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i13);
        }
        if (!this.f78342m.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f78342m);
        }
        int i14 = this.f78343n;
        if (i14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i14);
        }
        int i15 = this.f78344o;
        if (i15 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i15);
        }
        int i16 = this.f78345p;
        if (i16 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i16);
        }
        int i17 = this.f78346q;
        if (i17 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i17);
        }
        return !Arrays.equals(this.f78347r, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(18, this.f78347r) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f78330a;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (!this.f78331b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f78331b);
        }
        if (!this.f78332c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f78332c);
        }
        long j10 = this.f78333d;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j10);
        }
        C5490v7 c5490v7 = this.f78334e;
        if (c5490v7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c5490v7);
        }
        if (!this.f78335f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f78335f);
        }
        if (!this.f78336g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f78336g);
        }
        long j11 = this.f78337h;
        if (j11 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j11);
        }
        int i11 = this.f78338i;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i11);
        }
        int i12 = this.f78339j;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i12);
        }
        if (!this.f78340k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f78340k);
        }
        int i13 = this.f78341l;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i13);
        }
        if (!this.f78342m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f78342m);
        }
        int i14 = this.f78343n;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i14);
        }
        int i15 = this.f78344o;
        if (i15 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i15);
        }
        int i16 = this.f78345p;
        if (i16 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i16);
        }
        int i17 = this.f78346q;
        if (i17 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i17);
        }
        if (!Arrays.equals(this.f78347r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f78347r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5465u7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5465u7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5465u7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f78330a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f78331b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.f78332c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f78333d = codedInputByteBufferNano.readInt64();
                    break;
                case 42:
                    if (this.f78334e == null) {
                        this.f78334e = new C5490v7();
                    }
                    codedInputByteBufferNano.readMessage(this.f78334e);
                    break;
                case 50:
                    this.f78335f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f78336g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.f78337h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f78338i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f78339j = codedInputByteBufferNano.readInt32();
                    break;
                case 90:
                    this.f78340k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f78341l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f78342m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f78343n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f78344o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f78345p = int32;
                    }
                    break;
                case 136:
                    this.f78346q = codedInputByteBufferNano.readInt32();
                    break;
                case POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H /* 146 */:
                    this.f78347r = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C5465u7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5465u7) MessageNano.mergeFrom(new C5465u7(), bArr);
    }
}
