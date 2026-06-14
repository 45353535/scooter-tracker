package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f114801a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f114802b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f114803c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f114804d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.ow1 b(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.pw1.b(byte[], int, int):yads.ow1");
    }

    public static int a(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        if (i12 < 0) {
            throw new IllegalStateException();
        }
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static mw1 a(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15 = 2;
        x92 x92Var = new x92(bArr, i10 + 2, i11);
        int i16 = 4;
        x92Var.d(4);
        int iB = x92Var.b(3);
        x92Var.f();
        int iB2 = x92Var.b(2);
        boolean zC = x92Var.c();
        int iB3 = x92Var.b(5);
        int i17 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            if (x92Var.c()) {
                i17 |= 1 << i18;
            }
        }
        int i19 = 6;
        int[] iArr = new int[6];
        for (int i20 = 0; i20 < 6; i20++) {
            iArr[i20] = x92Var.b(8);
        }
        int i21 = i17;
        int iB4 = x92Var.b(8);
        int i22 = 0;
        for (int i23 = 0; i23 < iB; i23++) {
            if (x92Var.c()) {
                i22 += 89;
            }
            if (x92Var.c()) {
                i22 += 8;
            }
        }
        x92Var.d(i22);
        if (iB > 0) {
            x92Var.d((8 - iB) * 2);
        }
        x92Var.d();
        int iD = x92Var.d();
        if (iD == 3) {
            x92Var.f();
        }
        int iD2 = x92Var.d();
        int iD3 = x92Var.d();
        if (x92Var.c()) {
            int iD4 = x92Var.d();
            int iD5 = x92Var.d();
            int iD6 = x92Var.d();
            int iD7 = x92Var.d();
            iD2 -= (iD4 + iD5) * ((iD == 1 || iD == 2) ? 2 : 1);
            iD3 -= (iD6 + iD7) * (iD == 1 ? 2 : 1);
        }
        x92Var.d();
        x92Var.d();
        int iD8 = x92Var.d();
        for (int i24 = x92Var.c() ? 0 : iB; i24 <= iB; i24++) {
            x92Var.d();
            x92Var.d();
            x92Var.d();
        }
        x92Var.d();
        x92Var.d();
        x92Var.d();
        x92Var.d();
        x92Var.d();
        x92Var.d();
        if (x92Var.c() && x92Var.c()) {
            int i25 = 0;
            while (i25 < i16) {
                int i26 = 0;
                while (i26 < i19) {
                    if (!x92Var.c()) {
                        x92Var.d();
                    } else {
                        int iMin = Math.min(64, 1 << ((i25 << 1) + 4));
                        if (i25 > 1) {
                            x92Var.e();
                        }
                        for (int i27 = 0; i27 < iMin; i27++) {
                            x92Var.e();
                        }
                    }
                    i26 += i25 == 3 ? 3 : 1;
                    i19 = 6;
                }
                i25++;
                i16 = 4;
                i19 = 6;
            }
        }
        x92Var.d(2);
        if (x92Var.c()) {
            x92Var.d(8);
            x92Var.d();
            x92Var.d();
            x92Var.f();
        }
        int iD9 = x92Var.d();
        int[] iArrCopyOf = new int[0];
        int[] iArrCopyOf2 = new int[0];
        int i28 = -1;
        int i29 = 0;
        int i30 = -1;
        while (i29 < iD9) {
            if (i29 != 0 && x92Var.c()) {
                i12 = i15;
                int i31 = i28 + i30;
                int iD10 = (1 - ((x92Var.c() ? 1 : 0) * 2)) * (x92Var.d() + 1);
                i13 = iD9;
                int i32 = i31 + 1;
                int[] iArr2 = iArrCopyOf;
                boolean[] zArr = new boolean[i32];
                for (int i33 = 0; i33 <= i31; i33++) {
                    if (!x92Var.c()) {
                        zArr[i33] = x92Var.c();
                    } else {
                        zArr[i33] = true;
                    }
                }
                int[] iArr3 = new int[i32];
                int[] iArr4 = new int[i32];
                int i34 = 0;
                for (int i35 = i30 - 1; i35 >= 0; i35--) {
                    int i36 = iArrCopyOf2[i35] + iD10;
                    if (i36 < 0 && zArr[i28 + i35]) {
                        iArr3[i34] = i36;
                        i34++;
                    }
                }
                if (iD10 < 0 && zArr[i31]) {
                    iArr3[i34] = iD10;
                    i34++;
                }
                int i37 = i34;
                i14 = iD8;
                for (int i38 = 0; i38 < i28; i38++) {
                    int i39 = iArr2[i38] + iD10;
                    if (i39 < 0 && zArr[i38]) {
                        iArr3[i37] = i39;
                        i37++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr3, i37);
                int i40 = 0;
                for (int i41 = i28 - 1; i41 >= 0; i41--) {
                    int i42 = iArr2[i41] + iD10;
                    if (i42 > 0 && zArr[i41]) {
                        iArr4[i40] = i42;
                        i40++;
                    }
                }
                if (iD10 > 0 && zArr[i31]) {
                    iArr4[i40] = iD10;
                    i40++;
                }
                int i43 = i37;
                int i44 = i40;
                for (int i45 = 0; i45 < i30; i45++) {
                    int i46 = iArrCopyOf2[i45] + iD10;
                    if (i46 > 0 && zArr[i28 + i45]) {
                        iArr4[i44] = i46;
                        i44++;
                    }
                }
                iArrCopyOf2 = Arrays.copyOf(iArr4, i44);
                i30 = i44;
                i28 = i43;
            } else {
                i12 = i15;
                i13 = iD9;
                i14 = iD8;
                int iD11 = x92Var.d();
                int iD12 = x92Var.d();
                int[] iArr5 = new int[iD11];
                for (int i47 = 0; i47 < iD11; i47++) {
                    iArr5[i47] = x92Var.d() + 1;
                    x92Var.f();
                }
                int[] iArr6 = new int[iD12];
                for (int i48 = 0; i48 < iD12; i48++) {
                    iArr6[i48] = x92Var.d() + 1;
                    x92Var.f();
                }
                i28 = iD11;
                iArrCopyOf2 = iArr6;
                iArrCopyOf = iArr5;
                i30 = iD12;
            }
            i29++;
            i15 = i12;
            iD9 = i13;
            iD8 = i14;
        }
        int i49 = i15;
        int i50 = iD8;
        if (x92Var.c()) {
            for (int i51 = 0; i51 < x92Var.d(); i51++) {
                x92Var.d(i50 + 5);
            }
        }
        x92Var.d(i49);
        float f10 = 1.0f;
        if (x92Var.c()) {
            if (x92Var.c()) {
                int iB5 = x92Var.b(8);
                if (iB5 == 255) {
                    int iB6 = x92Var.b(16);
                    int iB7 = x92Var.b(16);
                    if (iB6 != 0 && iB7 != 0) {
                        f10 = iB6 / iB7;
                    }
                } else {
                    float[] fArr = f114802b;
                    if (iB5 < 17) {
                        f10 = fArr[iB5];
                    } else {
                        vd1.a("Unexpected aspect_ratio_idc value: ", iB5, "NalUnitUtil");
                    }
                }
            }
            if (x92Var.c()) {
                x92Var.f();
            }
            if (x92Var.c()) {
                x92Var.d(4);
                if (x92Var.c()) {
                    x92Var.d(24);
                }
            }
            if (x92Var.c()) {
                x92Var.d();
                x92Var.d();
            }
            x92Var.f();
            if (x92Var.c()) {
                iD3 *= 2;
            }
        }
        return new mw1(iB2, zC, iB3, i21, iArr, iB4, iD2, iD3, f10);
    }

    public static int a(int i10, byte[] bArr) {
        int i11;
        synchronized (f114803c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f114804d;
                    if (iArr.length <= i13) {
                        f114804d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f114804d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f114804d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
