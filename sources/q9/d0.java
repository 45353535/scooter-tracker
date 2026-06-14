package q9;

import com.applovin.shadow.okio.Utf8;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;
import com.google.common.primitives.Ints;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f98771d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f98772e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ImmutableSet f98773f = ImmutableSet.of(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f98774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f98775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f98776c;

    public d0() {
        this.f98774a = o0.f98842f;
    }

    private void Y(Charset charset) {
        if (m(charset, f98771d) == '\r') {
            m(charset, f98772e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int d(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L43
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L11
            goto L43
        L11:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L41
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L41
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2a
            goto L41
        L2a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported charset: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L41:
            r0 = 2
            goto L44
        L43:
            r0 = 1
        L44:
            int r1 = r4.f98775b
        L46:
            int r2 = r4.f98776c
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto La5
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L5e
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L69
        L5e:
            byte[] r2 = r4.f98774a
            r2 = r2[r1]
            boolean r2 = q9.o0.I0(r2)
            if (r2 == 0) goto L69
            goto La2
        L69:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L79
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8a
        L79:
            byte[] r2 = r4.f98774a
            r3 = r2[r1]
            if (r3 != 0) goto L8a
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = q9.o0.I0(r2)
            if (r2 == 0) goto L8a
            goto La2
        L8a:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto La3
            byte[] r2 = r4.f98774a
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto La3
            r2 = r2[r1]
            boolean r2 = q9.o0.I0(r2)
            if (r2 == 0) goto La3
        La2:
            return r1
        La3:
            int r1 = r1 + r0
            goto L46
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.d0.d(java.nio.charset.Charset):int");
    }

    private int i(Charset charset) {
        byte b10;
        byte b11;
        byte b12 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            b10 = this.f98774a[this.f98775b];
            b11 = 0;
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f98774a;
                int i10 = this.f98775b;
                b11 = bArr[i10];
                b10 = bArr[i10 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f98774a;
                int i11 = this.f98775b;
                b11 = bArr2[i11 + 1];
                b10 = bArr2[i11];
            }
            b12 = 2;
        }
        return Ints.fromBytes(b11, b10, (byte) 0, b12);
    }

    private char m(Charset charset, char[] cArr) {
        int i10 = i(charset);
        if (i10 == 0) {
            return (char) 0;
        }
        char c10 = (char) (i10 >> 16);
        if (!Chars.contains(cArr, c10)) {
            return (char) 0;
        }
        this.f98775b += i10 & 65535;
        return c10;
    }

    public long A() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        int i11 = i10 + 1;
        this.f98775b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f98775b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f98775b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f98775b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f98775b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f98775b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f98775b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f98775b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public String B() {
        return n((char) 0);
    }

    public String C(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f98775b;
        int i12 = (i11 + i10) - 1;
        String strI = o0.I(this.f98774a, i11, (i12 >= this.f98776c || this.f98774a[i12] != 0) ? i10 : i10 - 1);
        this.f98775b += i10;
        return strI;
    }

    public short D() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        int i11 = i10 + 1;
        this.f98775b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f98775b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String E(int i10) {
        return F(i10, StandardCharsets.UTF_8);
    }

    public String F(int i10, Charset charset) {
        String str = new String(this.f98774a, this.f98775b, i10, charset);
        this.f98775b += i10;
        return str;
    }

    public int G() {
        return (H() << 21) | (H() << 14) | (H() << 7) | H();
    }

    public int H() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        this.f98775b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int I() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        int i11 = i10 + 1;
        this.f98775b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f98775b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f98775b = i10 + 4;
        return i13;
    }

    public long J() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        int i11 = i10 + 1;
        this.f98775b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f98775b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f98775b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f98775b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public int K() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        int i11 = i10 + 1;
        this.f98775b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f98775b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f98775b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public int L() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException("Top bit not zero: " + iQ);
    }

    public int M() {
        return Ints.checkedCast(N());
    }

    public long N() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f98775b == this.f98776c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jH = H();
            j10 |= (127 & jH) << (i10 * 7);
            if ((jH & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public long O() {
        long jA = A();
        if (jA >= 0) {
            return jA;
        }
        throw new IllegalStateException("Top bit not zero: " + jA);
    }

    public int P() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        int i11 = i10 + 1;
        this.f98775b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f98775b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public long Q() {
        int i10;
        int i11;
        long j10 = this.f98774a[this.f98775b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f98774a[this.f98775b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & Utf8.REPLACEMENT_BYTE));
        }
        this.f98775b += i11;
        return j10;
    }

    public Charset R() {
        if (a() >= 3) {
            byte[] bArr = this.f98774a;
            int i10 = this.f98775b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f98775b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f98774a;
        int i11 = this.f98775b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f98775b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f98775b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void S(int i10) {
        U(b() < i10 ? new byte[i10] : this.f98774a, i10);
    }

    public void T(byte[] bArr) {
        U(bArr, bArr.length);
    }

    public void U(byte[] bArr, int i10) {
        this.f98774a = bArr;
        this.f98776c = i10;
        this.f98775b = 0;
    }

    public void V(int i10) {
        a.a(i10 >= 0 && i10 <= this.f98774a.length);
        this.f98776c = i10;
    }

    public void W(int i10) {
        a.a(i10 >= 0 && i10 <= this.f98776c);
        this.f98775b = i10;
    }

    public void X(int i10) {
        W(this.f98775b + i10);
    }

    public int a() {
        return this.f98776c - this.f98775b;
    }

    public int b() {
        return this.f98774a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f98774a = Arrays.copyOf(this.f98774a, i10);
        }
    }

    public byte[] e() {
        return this.f98774a;
    }

    public int f() {
        return this.f98775b;
    }

    public int g() {
        return this.f98776c;
    }

    public char h(Charset charset) {
        a.b(f98773f.contains(charset), "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public int j() {
        return this.f98774a[this.f98775b] & 255;
    }

    public void k(c0 c0Var, int i10) {
        l(c0Var.f98765a, 0, i10);
        c0Var.p(0);
    }

    public void l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f98774a, this.f98775b, bArr, i10, i11);
        this.f98775b += i11;
    }

    public String n(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f98775b;
        while (i10 < this.f98776c && this.f98774a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f98774a;
        int i11 = this.f98775b;
        String strI = o0.I(bArr, i11, i10 - i11);
        this.f98775b = i10;
        if (i10 < this.f98776c) {
            this.f98775b = i10 + 1;
        }
        return strI;
    }

    public double o() {
        return Double.longBitsToDouble(A());
    }

    public float p() {
        return Float.intBitsToFloat(q());
    }

    public int q() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        int i11 = i10 + 1;
        this.f98775b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f98775b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f98775b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f98775b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public int r() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        int i11 = i10 + 1;
        this.f98775b = i11;
        int i12 = ((bArr[i10] & 255) << 24) >> 8;
        int i13 = i10 + 2;
        this.f98775b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f98775b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public String s() {
        return t(StandardCharsets.UTF_8);
    }

    public String t(Charset charset) {
        a.b(f98773f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            R();
        }
        String strF = F(d(charset) - this.f98775b, charset);
        if (this.f98775b == this.f98776c) {
            return strF;
        }
        Y(charset);
        return strF;
    }

    public int u() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        int i11 = i10 + 1;
        this.f98775b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f98775b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f98775b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f98775b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public long v() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        int i11 = i10 + 1;
        this.f98775b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f98775b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f98775b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f98775b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f98775b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f98775b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f98775b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f98775b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public short w() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        int i11 = i10 + 1;
        this.f98775b = i11;
        int i12 = bArr[i10] & 255;
        this.f98775b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public long x() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        int i11 = i10 + 1;
        this.f98775b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f98775b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f98775b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f98775b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public int y() {
        int iU = u();
        if (iU >= 0) {
            return iU;
        }
        throw new IllegalStateException("Top bit not zero: " + iU);
    }

    public int z() {
        byte[] bArr = this.f98774a;
        int i10 = this.f98775b;
        int i11 = i10 + 1;
        this.f98775b = i11;
        int i12 = bArr[i10] & 255;
        this.f98775b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public d0(int i10) {
        this.f98774a = new byte[i10];
        this.f98776c = i10;
    }

    public d0(byte[] bArr) {
        this.f98774a = bArr;
        this.f98776c = bArr.length;
    }

    public d0(byte[] bArr, int i10) {
        this.f98774a = bArr;
        this.f98776c = i10;
    }
}
