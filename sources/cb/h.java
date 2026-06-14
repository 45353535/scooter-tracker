package cb;

import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import n9.v;
import n9.w;
import q9.c0;
import q9.d0;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends xa.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6661b = new a() { // from class: cb.g
        @Override // cb.h.a
        public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return h.c(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f6662a;

    public interface a {
        boolean evaluate(int i10, int i11, int i12, int i13, int i14);
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f6664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6665c;

        public b(int i10, boolean z10, int i11) {
            this.f6663a = i10;
            this.f6664b = z10;
            this.f6665c = i11;
        }
    }

    public h() {
        this(null);
    }

    private static int A(d0 d0Var, int i10) {
        byte[] bArrE = d0Var.e();
        int iF = d0Var.f();
        int i11 = iF;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iF + i10) {
                return i10;
            }
            if ((bArrE[i11] & 255) == 255 && bArrE[i12] == 0) {
                System.arraycopy(bArrE, i11 + 2, bArrE, i12, (i10 - (i11 - iF)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[PHI: r3
  0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean B(q9.d0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f()
        L8:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r1.q()     // Catch: java.lang.Throwable -> L22
            long r8 = r1.J()     // Catch: java.lang.Throwable -> L22
            int r10 = r1.P()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r1.K()     // Catch: java.lang.Throwable -> L22
            int r8 = r1.K()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.W(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.W(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7e
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L7c
            goto L8e
        L7c:
            r4 = r6
            goto L8e
        L7e:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L86
            r3 = r4
            goto L87
        L86:
            r3 = r6
        L87:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7c
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.W(r2)
            return r6
        L9b:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.W(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.X(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.W(r2)
            return r4
        Lb2:
            r1.W(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.h.B(q9.d0, int, int, boolean):boolean");
    }

    public static /* synthetic */ boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? o0.f98842f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static cb.a f(d0 d0Var, int i10, int i11) {
        int iZ;
        String str;
        int iH = d0Var.H();
        Charset charsetW = w(iH);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        d0Var.l(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iZ = 2;
        } else {
            iZ = z(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i13 = bArr[iZ + 1] & 255;
        int i14 = iZ + 2;
        int iY = y(bArr, i14, iH);
        return new cb.a(str, new String(bArr, i14, iY - i14, charsetW), i13, d(bArr, iY + v(iH), i12));
    }

    private static cb.b g(d0 d0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        d0Var.l(bArr, 0, i10);
        return new cb.b(str, bArr);
    }

    private static c h(d0 d0Var, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int iF = d0Var.f();
        int iZ = z(d0Var.e(), iF);
        String str = new String(d0Var.e(), iF, iZ - iF, StandardCharsets.ISO_8859_1);
        d0Var.W(iZ + 1);
        int iQ = d0Var.q();
        int iQ2 = d0Var.q();
        long J = d0Var.J();
        if (J == 4294967295L) {
            J = -1;
        }
        long J2 = d0Var.J();
        long j10 = J2 == 4294967295L ? -1L : J2;
        ArrayList arrayList = new ArrayList();
        int i13 = iF + i10;
        while (d0Var.f() < i13) {
            i iVarK = k(i11, d0Var, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iQ, iQ2, J, j10, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(d0 d0Var, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int iF = d0Var.f();
        int iZ = z(d0Var.e(), iF);
        String str = new String(d0Var.e(), iF, iZ - iF, StandardCharsets.ISO_8859_1);
        d0Var.W(iZ + 1);
        int iH = d0Var.H();
        boolean z11 = (iH & 2) != 0;
        boolean z12 = (iH & 1) != 0;
        int iH2 = d0Var.H();
        String[] strArr = new String[iH2];
        for (int i13 = 0; i13 < iH2; i13++) {
            int iF2 = d0Var.f();
            int iZ2 = z(d0Var.e(), iF2);
            strArr[i13] = new String(d0Var.e(), iF2, iZ2 - iF2, StandardCharsets.ISO_8859_1);
            d0Var.W(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iF + i10;
        while (d0Var.f() < i14) {
            i iVarK = k(i11, d0Var, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(d0 d0Var, int i10) {
        if (i10 < 4) {
            return null;
        }
        int iH = d0Var.H();
        Charset charsetW = w(iH);
        byte[] bArr = new byte[3];
        d0Var.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        d0Var.l(bArr2, 0, i11);
        int iY = y(bArr2, 0, iH);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iH);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iH), charsetW));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0240  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [cb.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [q9.d0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [q9.d0] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [q9.d0] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static cb.i k(int r19, q9.d0 r20, boolean r21, int r22, cb.h.a r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.h.k(int, q9.d0, boolean, int, cb.h$a):cb.i");
    }

    private static f l(d0 d0Var, int i10) {
        int iH = d0Var.H();
        Charset charsetW = w(iH);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        int iZ = z(bArr, 0);
        String strU = w.u(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
        int i12 = iZ + 1;
        int iY = y(bArr, i12, iH);
        String strP = p(bArr, i12, iY, charsetW);
        int iV = iY + v(iH);
        int iY2 = y(bArr, iV, iH);
        return new f(strU, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iH), i11));
    }

    private static b m(d0 d0Var) {
        boolean z10 = false;
        if (d0Var.a() < 10) {
            u.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iK = d0Var.K();
        if (iK != 4801587) {
            u.h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iK)));
            return null;
        }
        int iH = d0Var.H();
        d0Var.X(1);
        int iH2 = d0Var.H();
        int iG = d0Var.G();
        if (iH == 2) {
            if ((iH2 & 64) != 0) {
                u.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iH == 3) {
            if ((iH2 & 64) != 0) {
                int iQ = d0Var.q();
                d0Var.X(iQ);
                iG -= iQ + 4;
            }
        } else {
            if (iH != 4) {
                u.h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iH);
                return null;
            }
            if ((iH2 & 64) != 0) {
                int iG2 = d0Var.G();
                d0Var.X(iG2 - 4);
                iG -= iG2;
            }
            if ((iH2 & 16) != 0) {
                iG -= 10;
            }
        }
        if (iH < 4 && (iH2 & 128) != 0) {
            z10 = true;
        }
        return new b(iH, z10, iG);
    }

    private static l n(d0 d0Var, int i10) {
        int iP = d0Var.P();
        int iK = d0Var.K();
        int iK2 = d0Var.K();
        int iH = d0Var.H();
        int iH2 = d0Var.H();
        c0 c0Var = new c0();
        c0Var.m(d0Var);
        int i11 = ((i10 - 10) * 8) / (iH + iH2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH3 = c0Var.h(iH);
            int iH4 = c0Var.h(iH2);
            iArr[i12] = iH3;
            iArr2[i12] = iH4;
        }
        return new l(iP, iK, iK2, iArr, iArr2);
    }

    private static m o(d0 d0Var, int i10) {
        byte[] bArr = new byte[i10];
        d0Var.l(bArr, 0, i10);
        int iZ = z(bArr, 0);
        return new m(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1), d(bArr, iZ + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static n q(d0 d0Var, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int iH = d0Var.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        return new n(str, null, r(bArr, iH, 0));
    }

    private static ImmutableList r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return ImmutableList.of("");
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int iY = y(bArr, i11, i10);
        while (i11 < iY) {
            builder.add(new String(bArr, i11, iY - i11, w(i10)));
            i11 = v(i10) + iY;
            iY = y(bArr, i11, i10);
        }
        ImmutableList immutableListBuild = builder.build();
        return immutableListBuild.isEmpty() ? ImmutableList.of("") : immutableListBuild;
    }

    private static n s(d0 d0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iH = d0Var.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        int iY = y(bArr, 0, iH);
        return new n("TXXX", new String(bArr, 0, iY, w(iH)), r(bArr, iH, iY + v(iH)));
    }

    private static o t(d0 d0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        d0Var.l(bArr, 0, i10);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static o u(d0 d0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iH = d0Var.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        int iY = y(bArr, 0, iH);
        String str = new String(bArr, 0, iY, w(iH));
        int iV = iY + v(iH);
        return new o("WXXX", str, p(bArr, iV, z(bArr, iV), StandardCharsets.ISO_8859_1));
    }

    private static int v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static Charset w(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    private static String x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int y(byte[] bArr, int i10, int i11) {
        int iZ = z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iZ;
        }
        while (iZ < bArr.length - 1) {
            if ((iZ - i10) % 2 == 0 && bArr[iZ + 1] == 0) {
                return iZ;
            }
            iZ = z(bArr, iZ + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // xa.c
    protected v b(xa.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public v e(byte[] bArr, int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        d0 d0Var = new d0(bArr, i10);
        b bVarM = m(d0Var);
        if (bVarM == null) {
            return null;
        }
        int iF = d0Var.f();
        int i11 = bVarM.f6663a == 2 ? 6 : 10;
        int iA = bVarM.f6665c;
        if (bVarM.f6664b) {
            iA = A(d0Var, bVarM.f6665c);
        }
        d0Var.V(iF + iA);
        boolean z10 = false;
        if (!B(d0Var, bVarM.f6663a, i11, false)) {
            if (bVarM.f6663a != 4 || !B(d0Var, 4, i11, true)) {
                u.h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarM.f6663a);
                return null;
            }
            z10 = true;
        }
        while (d0Var.a() >= i11) {
            i iVarK = k(bVarM.f6663a, d0Var, z10, i11, this.f6662a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new v(arrayList);
    }

    public h(a aVar) {
        this.f6662a = aVar;
    }
}
