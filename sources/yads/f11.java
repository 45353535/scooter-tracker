package yads;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class f11 extends pw2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d11 f110580b = new d11() { // from class: yads.o6
        @Override // yads.d11
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return f11.b(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d11 f110581a;

    public f11(d11 d11Var) {
        this.f110581a = d11Var;
    }

    public static int a(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static /* synthetic */ boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    public static wr1 c(int i10, w92 w92Var) {
        int iR = w92Var.r();
        int iO = w92Var.o();
        int iO2 = w92Var.o();
        int iM = w92Var.m();
        int iM2 = w92Var.m();
        v92 v92Var = new v92();
        v92Var.a(w92Var.f117358c, w92Var.f117356a);
        v92Var.b(w92Var.f117357b * 8);
        int i11 = ((i10 - 10) * 8) / (iM + iM2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iA = v92Var.a(iM);
            int iA2 = v92Var.a(iM2);
            iArr[i12] = iA;
            iArr2[i12] = iA2;
        }
        return new wr1(iR, iO, iO2, iArr, iArr2);
    }

    public static qg2 d(int i10, w92 w92Var) {
        byte[] bArr = new byte[i10];
        w92Var.a(bArr, 0, i10);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i11 = iB + 1;
        return new qg2(str, i10 <= i11 ? w83.f117346f : Arrays.copyOfRange(bArr, i11, i10));
    }

    public static k33 e(int i10, w92 w92Var) {
        if (i10 < 1) {
            return null;
        }
        int iM = w92Var.m();
        String strB = b(iM);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        w92Var.a(bArr, 0, i11);
        int iA = a(bArr, 0, iM);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iM) + iA;
        return new k33("TXXX", str, a(iA2, a(bArr, iA2, iM), strB, bArr));
    }

    public static h83 f(int i10, w92 w92Var) {
        if (i10 < 1) {
            return null;
        }
        int iM = w92Var.m();
        String strB = b(iM);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        w92Var.a(bArr, 0, i11);
        int iA = a(bArr, 0, iM);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iM) + iA;
        return new h83("WXXX", str, a(iA2, b(iA2, bArr), "ISO-8859-1", bArr));
    }

    public static int g(int i10, w92 w92Var) {
        byte[] bArr = w92Var.f117356a;
        int i11 = w92Var.f117357b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    public static nt b(w92 w92Var, int i10, int i11, boolean z10, int i12, d11 d11Var) throws Throwable {
        int i13 = w92Var.f117357b;
        int iB = b(i13, w92Var.f117356a);
        String str = new String(w92Var.f117356a, i13, iB - i13, "ISO-8859-1");
        w92Var.e(iB + 1);
        int iM = w92Var.m();
        boolean z11 = (iM & 2) != 0;
        boolean z12 = (iM & 1) != 0;
        int iM2 = w92Var.m();
        String[] strArr = new String[iM2];
        for (int i14 = 0; i14 < iM2; i14++) {
            int i15 = w92Var.f117357b;
            int iB2 = b(i15, w92Var.f117356a);
            strArr[i14] = new String(w92Var.f117356a, i15, iB2 - i15, "ISO-8859-1");
            w92Var.e(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (w92Var.f117357b < i16) {
            g11 g11VarA = a(i11, w92Var, z10, i12, d11Var);
            if (g11VarA != null) {
                arrayList.add(g11VarA);
            }
        }
        return new nt(str, z11, z12, strArr, (g11[]) arrayList.toArray(new g11[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.fr1 a(int r14, byte[] r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.f11.a(int, byte[]):yads.fr1");
    }

    public static nx0 b(int i10, w92 w92Var) {
        byte[] bArrCopyOfRange;
        int iM = w92Var.m();
        String strB = b(iM);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        w92Var.a(bArr, 0, i11);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i12 = iB + 1;
        int iA = a(bArr, i12, iM);
        String strA = a(i12, iA, strB, bArr);
        int iA2 = a(iM) + iA;
        int iA3 = a(bArr, iA2, iM);
        String strA2 = a(iA2, iA3, strB, bArr);
        int iA4 = a(iM) + iA3;
        if (i11 <= iA4) {
            bArrCopyOfRange = w83.f117346f;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iA4, i11);
        }
        return new nx0(str, strA, strA2, bArrCopyOfRange);
    }

    @Override // yads.pw2
    public final fr1 a(ir1 ir1Var, ByteBuffer byteBuffer) {
        return a(byteBuffer.limit(), byteBuffer.array());
    }

    public static tf a(int i10, int i11, w92 w92Var) {
        int iB;
        String strA;
        byte[] bArrCopyOfRange;
        int iM = w92Var.m();
        String strB = b(iM);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        w92Var.a(bArr, 0, i12);
        if (i11 == 2) {
            String str = "image/" + ci.a(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            strA = str;
            iB = 2;
        } else {
            iB = b(0, bArr);
            strA = ci.a(new String(bArr, 0, iB, "ISO-8859-1"));
            if (strA.indexOf(47) == -1) {
                strA = "image/".concat(strA);
            }
        }
        int i13 = bArr[iB + 1] & 255;
        int i14 = iB + 2;
        int iA = a(bArr, i14, iM);
        String str2 = new String(bArr, i14, iA - i14, strB);
        int iA2 = a(iM) + iA;
        if (i12 <= iA2) {
            bArrCopyOfRange = w83.f117346f;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iA2, i12);
        }
        return new tf(strA, str2, i13, bArrCopyOfRange);
    }

    public static h83 b(int i10, w92 w92Var, String str) {
        byte[] bArr = new byte[i10];
        w92Var.a(bArr, 0, i10);
        return new h83(str, null, new String(bArr, 0, b(0, bArr), "ISO-8859-1"));
    }

    public static String b(int i10) {
        if (i10 == 1) {
            return "UTF-16";
        }
        if (i10 == 2) {
            return CharEncoding.UTF_16BE;
        }
        if (i10 != 3) {
            return "ISO-8859-1";
        }
        return "UTF-8";
    }

    public static int b(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static lt a(w92 w92Var, int i10, int i11, boolean z10, int i12, d11 d11Var) throws Throwable {
        int i13 = w92Var.f117357b;
        int iB = b(i13, w92Var.f117356a);
        String str = new String(w92Var.f117356a, i13, iB - i13, "ISO-8859-1");
        w92Var.e(iB + 1);
        int iB2 = w92Var.b();
        int iB3 = w92Var.b();
        long jN = w92Var.n();
        if (jN == 4294967295L) {
            jN = -1;
        }
        long jN2 = w92Var.n();
        long j10 = jN2 == 4294967295L ? -1L : jN2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (w92Var.f117357b < i14) {
            g11 g11VarA = a(i11, w92Var, z10, i12, d11Var);
            if (g11VarA != null) {
                arrayList.add(g11VarA);
            }
        }
        return new lt(str, iB2, iB3, jN, j10, (g11[]) arrayList.toArray(new g11[0]));
    }

    public static zw a(int i10, w92 w92Var) {
        if (i10 < 4) {
            return null;
        }
        int iM = w92Var.m();
        String strB = b(iM);
        byte[] bArr = new byte[3];
        w92Var.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        w92Var.a(bArr2, 0, i11);
        int iA = a(bArr2, 0, iM);
        String str2 = new String(bArr2, 0, iA, strB);
        int iA2 = a(iM) + iA;
        return new zw(str, str2, a(iA2, a(bArr2, iA2, iM), strB, bArr2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0225 A[Catch: all -> 0x020e, UnsupportedEncodingException -> 0x0256, TryCatch #2 {UnsupportedEncodingException -> 0x0256, blocks: (B:175:0x0237, B:162:0x0209, B:172:0x0220, B:173:0x0225), top: B:188:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0237 A[Catch: all -> 0x020e, UnsupportedEncodingException -> 0x0256, TRY_LEAVE, TryCatch #2 {UnsupportedEncodingException -> 0x0256, blocks: (B:175:0x0237, B:162:0x0209, B:172:0x0220, B:173:0x0225), top: B:188:0x011c }] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11, types: [yads.g11] */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [yads.w92] */
    /* JADX WARN: Type inference failed for: r1v13, types: [yads.w92] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [yads.w92] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.g11 a(int r19, yads.w92 r20, boolean r21, int r22, yads.d11 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.f11.a(int, yads.w92, boolean, int, yads.d11):yads.g11");
    }

    public static String a(int i10, int i11, String str, byte[] bArr) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, str);
        }
        return "";
    }

    public static k33 a(int i10, w92 w92Var, String str) {
        if (i10 < 1) {
            return null;
        }
        int iM = w92Var.m();
        String strB = b(iM);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        w92Var.a(bArr, 0, i11);
        return new k33(str, null, new String(bArr, 0, a(bArr, 0, iM), strB));
    }

    public static String a(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int a(byte[] bArr, int i10, int i11) {
        int iB = b(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if ((iB - i10) % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(iB + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0089 A[PHI: r3
  0x0089: PHI (r3v17 int) = (r3v6 int), (r3v20 int) binds: [B:41:0x0086, B:33:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(yads.w92 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f117357b
        L6:
            int r3 = r1.f117358c     // Catch: java.lang.Throwable -> L21
            int r4 = r1.f117357b     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r4
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Laf
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L24
            int r7 = r1.b()     // Catch: java.lang.Throwable -> L21
            long r8 = r1.n()     // Catch: java.lang.Throwable -> L21
            int r10 = r1.r()     // Catch: java.lang.Throwable -> L21
            goto L2e
        L21:
            r0 = move-exception
            goto Lb3
        L24:
            int r7 = r1.o()     // Catch: java.lang.Throwable -> L21
            int r8 = r1.o()     // Catch: java.lang.Throwable -> L21
            long r8 = (long) r8
            r10 = r6
        L2e:
            r11 = 0
            if (r7 != 0) goto L3c
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3c
            if (r10 != 0) goto L3c
            r1.e(r2)
            return r4
        L3c:
            r7 = 4
            if (r0 != r7) goto L6d
            if (r21 != 0) goto L6d
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4d
            r1.e(r2)
            return r6
        L4d:
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
        L6d:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L75
            r3 = r4
            goto L76
        L75:
            r3 = r6
        L76:
            r7 = r10 & 1
            if (r7 == 0) goto L89
            goto L8d
        L7b:
            if (r0 != r3) goto L8b
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L89
            goto L8d
        L89:
            r4 = r6
            goto L8d
        L8b:
            r3 = r6
            r4 = r3
        L8d:
            if (r4 == 0) goto L91
            int r3 = r3 + 4
        L91:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9a
            r1.e(r2)
            return r6
        L9a:
            int r3 = r1.f117358c     // Catch: java.lang.Throwable -> L21
            int r4 = r1.f117357b     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r4
            long r10 = (long) r3
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.e(r2)
            return r6
        La8:
            int r3 = (int) r8
            int r4 = r4 + r3
            r1.e(r4)     // Catch: java.lang.Throwable -> L21
            goto L6
        Laf:
            r1.e(r2)
            return r4
        Lb3:
            r1.e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.f11.a(yads.w92, int, int, boolean):boolean");
    }
}
