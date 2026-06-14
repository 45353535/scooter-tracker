package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f22779b = z.a("ID3");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.l f22780a;

    public n() {
        this.f22780a = null;
    }

    public static int a(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static h b(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11, boolean z10, int i12, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) throws Throwable {
        int i13 = nVar.f23135b;
        int iB = b(i13, nVar.f23134a);
        String str = new String(nVar.f23134a, i13, iB - i13, "ISO-8859-1");
        nVar.e(iB + 1);
        int iJ = nVar.j();
        boolean z11 = (iJ & 2) != 0;
        boolean z12 = (iJ & 1) != 0;
        int iJ2 = nVar.j();
        String[] strArr = new String[iJ2];
        for (int i14 = 0; i14 < iJ2; i14++) {
            int i15 = nVar.f23135b;
            int iB2 = b(i15, nVar.f23134a);
            strArr[i14] = new String(nVar.f23134a, i15, iB2 - i15, "ISO-8859-1");
            nVar.e(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (nVar.f23135b < i16) {
            o oVarA = a(i11, nVar, z10, i12, lVar);
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        o[] oVarArr = new o[arrayList.size()];
        arrayList.toArray(oVarArr);
        return new h(str, z11, z12, strArr, oVarArr);
    }

    public static q c(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        byte[] bArr = new byte[i10];
        nVar.a(bArr, 0, i10);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i11 = iB + 1;
        return new q(str, i11 < i10 ? Arrays.copyOfRange(bArr, i11, i10) : new byte[0]);
    }

    public static s d(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (i10 < 1) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        nVar.a(bArr, 0, i11);
        int iA = a(bArr, 0, iJ);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iJ) + iA;
        return new s("TXXX", str, iA2 < i11 ? new String(bArr, iA2, a(bArr, iA2, iJ) - iA2, strB) : "");
    }

    public static u e(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (i10 < 1) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        nVar.a(bArr, 0, i11);
        int iA = a(bArr, 0, iJ);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iJ) + iA;
        return new u("WXXX", str, iA2 < i11 ? new String(bArr, iA2, b(iA2, bArr) - iA2, "ISO-8859-1") : "");
    }

    public static int f(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        byte[] bArr = nVar.f23134a;
        int i11 = nVar.f23135b;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10) {
                return i10;
            }
            if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i10 - i11) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.b a(int r14, byte[] r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.a(int, byte[]):com.fyber.inneractive.sdk.player.exoplayer2.metadata.b");
    }

    public n(com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) {
        this.f22780a = lVar;
    }

    public static u b(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        byte[] bArr = new byte[i10];
        nVar.a(bArr, 0, i10);
        return new u(str, null, new String(bArr, 0, b(0, bArr), "ISO-8859-1"));
    }

    public static l b(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iJ = nVar.j();
        String strB = b(iJ);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        nVar.a(bArr, 0, i11);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i12 = iB + 1;
        int iA = a(bArr, i12, iJ);
        String str2 = new String(bArr, i12, iA - i12, strB);
        int iA2 = a(iJ) + iA;
        int iA3 = a(bArr, iA2, iJ);
        return new l(str, str2, new String(bArr, iA2, iA3 - iA2, strB), Arrays.copyOfRange(bArr, a(iJ) + iA3, i11));
    }

    public static f a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11, boolean z10, int i12, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) throws Throwable {
        int i13 = nVar.f23135b;
        int iB = b(i13, nVar.f23134a);
        String str = new String(nVar.f23134a, i13, iB - i13, "ISO-8859-1");
        nVar.e(iB + 1);
        int iB2 = nVar.b();
        int iB3 = nVar.b();
        long jK = nVar.k();
        if (jK == 4294967295L) {
            jK = -1;
        }
        long jK2 = nVar.k();
        long j10 = jK2 == 4294967295L ? -1L : jK2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (nVar.f23135b < i14) {
            o oVarA = a(i11, nVar, z10, i12, lVar);
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        o[] oVarArr = new o[arrayList.size()];
        arrayList.toArray(oVarArr);
        return new f(str, iB2, iB3, jK, j10, oVarArr);
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x0089 A[PHI: r3
  0x0089: PHI (r3v17 int) = (r3v6 int), (r3v20 int) binds: [B:41:0x0086, B:33:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f23135b
        L6:
            int r3 = r1.f23136c     // Catch: java.lang.Throwable -> L21
            int r4 = r1.f23135b     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r4
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Laf
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L24
            int r7 = r1.b()     // Catch: java.lang.Throwable -> L21
            long r8 = r1.k()     // Catch: java.lang.Throwable -> L21
            int r10 = r1.o()     // Catch: java.lang.Throwable -> L21
            goto L2e
        L21:
            r0 = move-exception
            goto Lb3
        L24:
            int r7 = r1.l()     // Catch: java.lang.Throwable -> L21
            int r8 = r1.l()     // Catch: java.lang.Throwable -> L21
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
            int r3 = r1.f23136c     // Catch: java.lang.Throwable -> L21
            int r4 = r1.f23135b     // Catch: java.lang.Throwable -> L21
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
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.a(com.fyber.inneractive.sdk.player.exoplayer2.util.n, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e6 A[Catch: all -> 0x012a, UnsupportedEncodingException -> 0x021b, TryCatch #2 {UnsupportedEncodingException -> 0x021b, blocks: (B:93:0x0125, B:165:0x01fc, B:97:0x012f, B:105:0x0147, B:107:0x014e, B:115:0x0167, B:124:0x017c, B:135:0x0194, B:142:0x01a5, B:162:0x01e1, B:163:0x01e6), top: B:176:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fc A[Catch: all -> 0x012a, UnsupportedEncodingException -> 0x021b, TRY_LEAVE, TryCatch #2 {UnsupportedEncodingException -> 0x021b, blocks: (B:93:0x0125, B:165:0x01fc, B:97:0x012f, B:105:0x0147, B:107:0x014e, B:115:0x0167, B:124:0x017c, B:135:0x0194, B:142:0x01a5, B:162:0x01e1, B:163:0x01e6), top: B:176:0x011b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o a(int r22, com.fyber.inneractive.sdk.player.exoplayer2.util.n r23, boolean r24, int r25, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.a(int, com.fyber.inneractive.sdk.player.exoplayer2.util.n, boolean, int, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o");
    }

    public static s a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        if (i10 < 1) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        nVar.a(bArr, 0, i11);
        return new s(str, null, new String(bArr, 0, a(bArr, 0, iJ), strB));
    }

    public static b a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11) {
        int iB;
        String lowerCase;
        int iJ = nVar.j();
        String strB = b(iJ);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        nVar.a(bArr, 0, i12);
        if (i11 == 2) {
            lowerCase = "image/" + new String(bArr, 0, 3, "ISO-8859-1").toLowerCase(Locale.US);
            if (lowerCase.equals("image/jpg")) {
                lowerCase = "image/jpeg";
            }
            iB = 2;
        } else {
            iB = b(0, bArr);
            lowerCase = new String(bArr, 0, iB, "ISO-8859-1").toLowerCase(Locale.US);
            if (lowerCase.indexOf(47) == -1) {
                lowerCase = "image/".concat(lowerCase);
            }
        }
        int i13 = bArr[iB + 1] & 255;
        int i14 = iB + 2;
        int iA = a(bArr, i14, iJ);
        return new b(lowerCase, new String(bArr, i14, iA - i14, strB), i13, Arrays.copyOfRange(bArr, a(iJ) + iA, i12));
    }

    public static j a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        String str;
        if (i10 < 4) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        byte[] bArr = new byte[3];
        nVar.a(bArr, 0, 3);
        String str2 = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        nVar.a(bArr2, 0, i11);
        int iA = a(bArr2, 0, iJ);
        String str3 = new String(bArr2, 0, iA, strB);
        int iA2 = a(iJ) + iA;
        if (iA2 < i11) {
            str = new String(bArr2, iA2, a(bArr2, iA2, iJ) - iA2, strB);
        } else {
            str = "";
        }
        return new j(str2, str3, str);
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
            if (iB % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(iB + 1, bArr);
        }
        return bArr.length;
    }
}
