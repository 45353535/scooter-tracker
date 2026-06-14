package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class Am extends MessageNano {
    public static final int D = -1;
    public static final int E = 0;
    public static final int F = 1;
    public static volatile Am[] G;
    public C5580ym A;
    public C5530wm[] B;
    public C5480um C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f75533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f75534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f75535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f75536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f75537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f75538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f75539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C5455tm[] f75540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C5505vm f75541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f75542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f75543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f75544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f75545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f75546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f75547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C5605zm f75548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f75549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f75550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f75551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f75552t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f75553u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C5555xm f75554v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f75555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f75556x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C5430sm f75557y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C5405rm f75558z;

    public Am() {
        a();
    }

    public static Am[] b() {
        if (G == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (G == null) {
                        G = new Am[0];
                    }
                } finally {
                }
            }
        }
        return G;
    }

    public final Am a() {
        this.f75533a = "";
        this.f75534b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f75535c = strArr;
        this.f75536d = "";
        this.f75537e = "";
        this.f75538f = strArr;
        this.f75539g = strArr;
        this.f75540h = C5455tm.b();
        this.f75541i = null;
        this.f75542j = "";
        this.f75543k = "";
        this.f75544l = "";
        this.f75545m = false;
        this.f75546n = "";
        this.f75547o = strArr;
        this.f75548p = null;
        this.f75549q = false;
        this.f75550r = "";
        this.f75551s = 0L;
        this.f75552t = 0L;
        this.f75553u = false;
        this.f75554v = null;
        this.f75555w = 600;
        this.f75556x = 1;
        this.f75557y = null;
        this.f75558z = null;
        this.A = null;
        this.B = C5530wm.b();
        this.C = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f75533a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f75533a);
        }
        int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f75534b) + iComputeSerializedSize;
        String[] strArr = this.f75535c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            int iComputeStringSizeNoTag = 0;
            int i12 = 0;
            while (true) {
                String[] strArr2 = this.f75535c;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    i12++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i11++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag + i12;
        }
        if (!this.f75536d.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f75536d);
        }
        if (!this.f75537e.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f75537e);
        }
        String[] strArr3 = this.f75538f;
        if (strArr3 != null && strArr3.length > 0) {
            int i13 = 0;
            int iComputeStringSizeNoTag2 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr4 = this.f75538f;
                if (i13 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i13];
                if (str2 != null) {
                    i14++;
                    iComputeStringSizeNoTag2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i13++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag2 + i14;
        }
        String[] strArr5 = this.f75539g;
        if (strArr5 != null && strArr5.length > 0) {
            int i15 = 0;
            int iComputeStringSizeNoTag3 = 0;
            int i16 = 0;
            while (true) {
                String[] strArr6 = this.f75539g;
                if (i15 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i15];
                if (str3 != null) {
                    i16++;
                    iComputeStringSizeNoTag3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i15++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag3 + i16;
        }
        C5455tm[] c5455tmArr = this.f75540h;
        if (c5455tmArr != null && c5455tmArr.length > 0) {
            int i17 = 0;
            while (true) {
                C5455tm[] c5455tmArr2 = this.f75540h;
                if (i17 >= c5455tmArr2.length) {
                    break;
                }
                C5455tm c5455tm = c5455tmArr2[i17];
                if (c5455tm != null) {
                    iComputeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c5455tm) + iComputeInt64Size;
                }
                i17++;
            }
        }
        C5505vm c5505vm = this.f75541i;
        if (c5505vm != null) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c5505vm);
        }
        if (!this.f75542j.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f75542j);
        }
        if (!this.f75543k.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f75543k);
        }
        if (!this.f75544l.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f75544l);
        }
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f75545m) + iComputeInt64Size;
        if (!this.f75546n.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f75546n);
        }
        String[] strArr7 = this.f75547o;
        if (strArr7 != null && strArr7.length > 0) {
            int i18 = 0;
            int iComputeStringSizeNoTag4 = 0;
            int i19 = 0;
            while (true) {
                String[] strArr8 = this.f75547o;
                if (i18 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i18];
                if (str4 != null) {
                    i19++;
                    iComputeStringSizeNoTag4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i18++;
            }
            iComputeBoolSize = iComputeBoolSize + iComputeStringSizeNoTag4 + i19;
        }
        C5605zm c5605zm = this.f75548p;
        if (c5605zm != null) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c5605zm);
        }
        boolean z10 = this.f75549q;
        if (z10) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z10);
        }
        if (!this.f75550r.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f75550r);
        }
        int iComputeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f75552t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f75551s) + iComputeBoolSize;
        boolean z11 = this.f75553u;
        if (z11) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z11);
        }
        C5555xm c5555xm = this.f75554v;
        if (c5555xm != null) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c5555xm);
        }
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f75556x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f75555w) + iComputeInt64Size2;
        C5430sm c5430sm = this.f75557y;
        if (c5430sm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c5430sm);
        }
        C5405rm c5405rm = this.f75558z;
        if (c5405rm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c5405rm);
        }
        C5580ym c5580ym = this.A;
        if (c5580ym != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c5580ym);
        }
        C5530wm[] c5530wmArr = this.B;
        if (c5530wmArr != null && c5530wmArr.length > 0) {
            while (true) {
                C5530wm[] c5530wmArr2 = this.B;
                if (i10 >= c5530wmArr2.length) {
                    break;
                }
                C5530wm c5530wm = c5530wmArr2[i10];
                if (c5530wm != null) {
                    iComputeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c5530wm) + iComputeInt32Size;
                }
                i10++;
            }
        }
        C5480um c5480um = this.C;
        return c5480um != null ? CodedOutputByteBufferNano.computeMessageSize(32, c5480um) + iComputeInt32Size : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f75533a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f75533a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f75534b);
        String[] strArr = this.f75535c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f75535c;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i11++;
            }
        }
        if (!this.f75536d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f75536d);
        }
        if (!this.f75537e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f75537e);
        }
        String[] strArr3 = this.f75538f;
        if (strArr3 != null && strArr3.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr4 = this.f75538f;
                if (i12 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i12];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i12++;
            }
        }
        String[] strArr5 = this.f75539g;
        if (strArr5 != null && strArr5.length > 0) {
            int i13 = 0;
            while (true) {
                String[] strArr6 = this.f75539g;
                if (i13 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i13];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i13++;
            }
        }
        C5455tm[] c5455tmArr = this.f75540h;
        if (c5455tmArr != null && c5455tmArr.length > 0) {
            int i14 = 0;
            while (true) {
                C5455tm[] c5455tmArr2 = this.f75540h;
                if (i14 >= c5455tmArr2.length) {
                    break;
                }
                C5455tm c5455tm = c5455tmArr2[i14];
                if (c5455tm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c5455tm);
                }
                i14++;
            }
        }
        C5505vm c5505vm = this.f75541i;
        if (c5505vm != null) {
            codedOutputByteBufferNano.writeMessage(9, c5505vm);
        }
        if (!this.f75542j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f75542j);
        }
        if (!this.f75543k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f75543k);
        }
        if (!this.f75544l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f75544l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f75545m);
        if (!this.f75546n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f75546n);
        }
        String[] strArr7 = this.f75547o;
        if (strArr7 != null && strArr7.length > 0) {
            int i15 = 0;
            while (true) {
                String[] strArr8 = this.f75547o;
                if (i15 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i15];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i15++;
            }
        }
        C5605zm c5605zm = this.f75548p;
        if (c5605zm != null) {
            codedOutputByteBufferNano.writeMessage(16, c5605zm);
        }
        boolean z10 = this.f75549q;
        if (z10) {
            codedOutputByteBufferNano.writeBool(17, z10);
        }
        if (!this.f75550r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f75550r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f75551s);
        codedOutputByteBufferNano.writeInt64(22, this.f75552t);
        boolean z11 = this.f75553u;
        if (z11) {
            codedOutputByteBufferNano.writeBool(23, z11);
        }
        C5555xm c5555xm = this.f75554v;
        if (c5555xm != null) {
            codedOutputByteBufferNano.writeMessage(24, c5555xm);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f75555w);
        codedOutputByteBufferNano.writeInt32(26, this.f75556x);
        C5430sm c5430sm = this.f75557y;
        if (c5430sm != null) {
            codedOutputByteBufferNano.writeMessage(27, c5430sm);
        }
        C5405rm c5405rm = this.f75558z;
        if (c5405rm != null) {
            codedOutputByteBufferNano.writeMessage(29, c5405rm);
        }
        C5580ym c5580ym = this.A;
        if (c5580ym != null) {
            codedOutputByteBufferNano.writeMessage(30, c5580ym);
        }
        C5530wm[] c5530wmArr = this.B;
        if (c5530wmArr != null && c5530wmArr.length > 0) {
            while (true) {
                C5530wm[] c5530wmArr2 = this.B;
                if (i10 >= c5530wmArr2.length) {
                    break;
                }
                C5530wm c5530wm = c5530wmArr2[i10];
                if (c5530wm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c5530wm);
                }
                i10++;
            }
        }
        C5480um c5480um = this.C;
        if (c5480um != null) {
            codedOutputByteBufferNano.writeMessage(32, c5480um);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Am b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Am().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Am mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f75533a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f75534b = codedInputByteBufferNano.readInt64();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f75535c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i10];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f75535c = strArr2;
                    break;
                case 34:
                    this.f75536d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f75537e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f75538f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i11 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i11];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i11 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f75538f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f75539g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i12 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i12];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i12 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f75539g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C5455tm[] c5455tmArr = this.f75540h;
                    int length4 = c5455tmArr == null ? 0 : c5455tmArr.length;
                    int i13 = repeatedFieldArrayLength4 + length4;
                    C5455tm[] c5455tmArr2 = new C5455tm[i13];
                    if (length4 != 0) {
                        System.arraycopy(c5455tmArr, 0, c5455tmArr2, 0, length4);
                    }
                    while (length4 < i13 - 1) {
                        C5455tm c5455tm = new C5455tm();
                        c5455tmArr2[length4] = c5455tm;
                        codedInputByteBufferNano.readMessage(c5455tm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C5455tm c5455tm2 = new C5455tm();
                    c5455tmArr2[length4] = c5455tm2;
                    codedInputByteBufferNano.readMessage(c5455tm2);
                    this.f75540h = c5455tmArr2;
                    break;
                case 74:
                    if (this.f75541i == null) {
                        this.f75541i = new C5505vm();
                    }
                    codedInputByteBufferNano.readMessage(this.f75541i);
                    break;
                case 82:
                    this.f75542j = codedInputByteBufferNano.readString();
                    break;
                case 90:
                    this.f75543k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f75544l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f75545m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f75546n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f75547o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i14 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i14];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i14 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f75547o = strArr8;
                    break;
                case 130:
                    if (this.f75548p == null) {
                        this.f75548p = new C5605zm();
                    }
                    codedInputByteBufferNano.readMessage(this.f75548p);
                    break;
                case 136:
                    this.f75549q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f75550r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f75551s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f75552t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f75553u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f75554v == null) {
                        this.f75554v = new C5555xm();
                    }
                    codedInputByteBufferNano.readMessage(this.f75554v);
                    break;
                case 200:
                    this.f75555w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f75556x = codedInputByteBufferNano.readInt32();
                    break;
                case MRAID_JS_DOES_NOT_EXIST_VALUE:
                    if (this.f75557y == null) {
                        this.f75557y = new C5430sm();
                    }
                    codedInputByteBufferNano.readMessage(this.f75557y);
                    break;
                case 234:
                    if (this.f75558z == null) {
                        this.f75558z = new C5405rm();
                    }
                    codedInputByteBufferNano.readMessage(this.f75558z);
                    break;
                case 242:
                    if (this.A == null) {
                        this.A = new C5580ym();
                    }
                    codedInputByteBufferNano.readMessage(this.A);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C5530wm[] c5530wmArr = this.B;
                    int length6 = c5530wmArr == null ? 0 : c5530wmArr.length;
                    int i15 = repeatedFieldArrayLength6 + length6;
                    C5530wm[] c5530wmArr2 = new C5530wm[i15];
                    if (length6 != 0) {
                        System.arraycopy(c5530wmArr, 0, c5530wmArr2, 0, length6);
                    }
                    while (length6 < i15 - 1) {
                        C5530wm c5530wm = new C5530wm();
                        c5530wmArr2[length6] = c5530wm;
                        codedInputByteBufferNano.readMessage(c5530wm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C5530wm c5530wm2 = new C5530wm();
                    c5530wmArr2[length6] = c5530wm2;
                    codedInputByteBufferNano.readMessage(c5530wm2);
                    this.B = c5530wmArr2;
                    break;
                case 258:
                    if (this.C == null) {
                        this.C = new C5480um();
                    }
                    codedInputByteBufferNano.readMessage(this.C);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static Am a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Am) MessageNano.mergeFrom(new Am(), bArr);
    }
}
