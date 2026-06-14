package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5166i9 extends MessageNano {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile C5166i9[] f77387n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f77388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f77389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f77390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f77391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f77392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f77393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f77394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f77395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f77396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f77397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f77398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C5140h9[] f77399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f77400m;

    public C5166i9() {
        a();
    }

    public static C5166i9[] b() {
        if (f77387n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f77387n == null) {
                        f77387n = new C5166i9[0];
                    }
                } finally {
                }
            }
        }
        return f77387n;
    }

    public final C5166i9 a() {
        this.f77388a = "";
        this.f77389b = "";
        this.f77390c = "";
        this.f77391d = 0;
        this.f77392e = "";
        this.f77393f = "";
        this.f77394g = false;
        this.f77395h = 0;
        this.f77396i = "";
        this.f77397j = "";
        this.f77398k = 0;
        this.f77399l = C5140h9.b();
        this.f77400m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f77388a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f77388a);
        }
        if (!this.f77389b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f77389b);
        }
        if (!this.f77390c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f77390c);
        }
        int i10 = this.f77391d;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i10);
        }
        if (!this.f77392e.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f77392e);
        }
        if (!this.f77393f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f77393f);
        }
        boolean z10 = this.f77394g;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z10);
        }
        int i11 = this.f77395h;
        if (i11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i11);
        }
        if (!this.f77396i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f77396i);
        }
        if (!this.f77397j.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f77397j);
        }
        int i12 = this.f77398k;
        if (i12 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i12);
        }
        C5140h9[] c5140h9Arr = this.f77399l;
        if (c5140h9Arr != null && c5140h9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C5140h9[] c5140h9Arr2 = this.f77399l;
                if (i13 >= c5140h9Arr2.length) {
                    break;
                }
                C5140h9 c5140h9 = c5140h9Arr2[i13];
                if (c5140h9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c5140h9) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        return !this.f77400m.equals("") ? CodedOutputByteBufferNano.computeStringSize(24, this.f77400m) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f77388a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f77388a);
        }
        if (!this.f77389b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f77389b);
        }
        if (!this.f77390c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f77390c);
        }
        int i10 = this.f77391d;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        if (!this.f77392e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f77392e);
        }
        if (!this.f77393f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f77393f);
        }
        boolean z10 = this.f77394g;
        if (z10) {
            codedOutputByteBufferNano.writeBool(17, z10);
        }
        int i11 = this.f77395h;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i11);
        }
        if (!this.f77396i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f77396i);
        }
        if (!this.f77397j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f77397j);
        }
        int i12 = this.f77398k;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i12);
        }
        C5140h9[] c5140h9Arr = this.f77399l;
        if (c5140h9Arr != null && c5140h9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C5140h9[] c5140h9Arr2 = this.f77399l;
                if (i13 >= c5140h9Arr2.length) {
                    break;
                }
                C5140h9 c5140h9 = c5140h9Arr2[i13];
                if (c5140h9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c5140h9);
                }
                i13++;
            }
        }
        if (!this.f77400m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f77400m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5166i9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5166i9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5166i9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f77388a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f77389b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f77390c = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.f77391d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f77392e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f77393f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f77394g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f77395h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f77396i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f77397j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f77398k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C5140h9[] c5140h9Arr = this.f77399l;
                    int length = c5140h9Arr == null ? 0 : c5140h9Arr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    C5140h9[] c5140h9Arr2 = new C5140h9[i10];
                    if (length != 0) {
                        System.arraycopy(c5140h9Arr, 0, c5140h9Arr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        C5140h9 c5140h9 = new C5140h9();
                        c5140h9Arr2[length] = c5140h9;
                        codedInputByteBufferNano.readMessage(c5140h9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C5140h9 c5140h92 = new C5140h9();
                    c5140h9Arr2[length] = c5140h92;
                    codedInputByteBufferNano.readMessage(c5140h92);
                    this.f77399l = c5140h9Arr2;
                    break;
                case 194:
                    this.f77400m = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C5166i9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5166i9) MessageNano.mergeFrom(new C5166i9(), bArr);
    }
}
