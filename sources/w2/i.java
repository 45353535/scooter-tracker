package w2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f106969a = new i();

    private i() {
    }

    public static final void a(a x10, a b10) {
        if (e3.a.d(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(b10, "b");
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            int iB3 = x10.b(2);
            float[] fArrA = x10.a();
            float[] fArrA2 = b10.a();
            for (int i10 = 0; i10 < iB; i10++) {
                for (int i11 = 0; i11 < iB2; i11++) {
                    for (int i12 = 0; i12 < iB3; i12++) {
                        int i13 = (i10 * iB2 * iB3) + (i11 * iB3) + i12;
                        fArrA[i13] = fArrA[i13] + fArrA2[i12];
                    }
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, i.class);
        }
    }

    public static final a b(a[] tensors) {
        if (e3.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(tensors, "tensors");
            int iB = tensors[0].b(0);
            int iB2 = 0;
            for (a aVar : tensors) {
                iB2 += aVar.b(1);
            }
            a aVar2 = new a(new int[]{iB, iB2});
            float[] fArrA = aVar2.a();
            for (int i10 = 0; i10 < iB; i10++) {
                int i11 = i10 * iB2;
                int length = tensors.length;
                for (int i12 = 0; i12 < length; i12++) {
                    float[] fArrA2 = tensors[i12].a();
                    int iB3 = tensors[i12].b(1);
                    System.arraycopy(fArrA2, i10 * iB3, fArrA, i11, iB3);
                    i11 += iB3;
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            e3.a.b(th2, i.class);
            return null;
        }
    }

    public static final a c(a x10, a w10) {
        a aVar;
        a aVar2 = null;
        if (e3.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            int i10 = 0;
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            int iB3 = x10.b(2);
            int iB4 = w10.b(0);
            int i11 = (iB2 - iB4) + 1;
            int iB5 = w10.b(2);
            a aVar3 = new a(new int[]{iB, i11, iB5});
            float[] fArrA = x10.a();
            float[] fArrA2 = aVar3.a();
            float[] fArrA3 = w10.a();
            int i12 = 0;
            while (i12 < iB) {
                int i13 = i10;
                while (i13 < iB5) {
                    int i14 = i10;
                    while (i14 < i11) {
                        float f10 = 0.0f;
                        while (i10 < iB4) {
                            aVar = aVar2;
                            for (int i15 = 0; i15 < iB3; i15++) {
                                try {
                                    f10 += fArrA[(iB2 * iB3 * i12) + ((i10 + i14) * iB3) + i15] * fArrA3[(((i10 * iB3) + i15) * iB5) + i13];
                                } catch (Throwable th2) {
                                    th = th2;
                                    e3.a.b(th, i.class);
                                    return aVar;
                                }
                            }
                            i10++;
                            aVar2 = aVar;
                        }
                        a aVar4 = aVar2;
                        fArrA2[(i11 * iB5 * i12) + (i14 * iB5) + i13] = f10;
                        i14++;
                        aVar2 = aVar4;
                        i10 = 0;
                    }
                    i13++;
                    i10 = 0;
                }
                i12++;
                i10 = 0;
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar = null;
        }
    }

    public static final a d(a x10, a w10, a b10) {
        if (e3.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            Intrinsics.checkNotNullParameter(b10, "b");
            int iB = x10.b(0);
            int iB2 = b10.b(0);
            a aVarH = h(x10, w10);
            float[] fArrA = b10.a();
            float[] fArrA2 = aVarH.a();
            for (int i10 = 0; i10 < iB; i10++) {
                for (int i11 = 0; i11 < iB2; i11++) {
                    int i12 = (i10 * iB2) + i11;
                    fArrA2[i12] = fArrA2[i12] + fArrA[i11];
                }
            }
            return aVarH;
        } catch (Throwable th2) {
            e3.a.b(th2, i.class);
            return null;
        }
    }

    public static final a e(String[] texts, int i10, a w10) {
        if (e3.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(w10, "w");
            int length = texts.length;
            int iB = w10.b(1);
            a aVar = new a(new int[]{length, i10, iB});
            float[] fArrA = aVar.a();
            float[] fArrA2 = w10.a();
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArrD = j.f106970a.d(texts[i11], i10);
                for (int i12 = 0; i12 < i10; i12++) {
                    System.arraycopy(fArrA2, iArrD[i12] * iB, fArrA, (iB * i10 * i11) + (iB * i12), iB);
                }
            }
            return aVar;
        } catch (Throwable th2) {
            e3.a.b(th2, i.class);
            return null;
        }
    }

    public static final void f(a x10, int i10) {
        if (e3.a.d(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            if (i10 >= x10.c()) {
                return;
            }
            int iC = x10.c();
            int iB = 1;
            for (int i11 = i10; i11 < iC; i11++) {
                iB *= x10.b(i11);
            }
            int[] iArr = new int[i10 + 1];
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = x10.b(i12);
            }
            iArr[i10] = iB;
            x10.d(iArr);
        } catch (Throwable th2) {
            e3.a.b(th2, i.class);
        }
    }

    public static final a g(a x10, int i10) {
        a aVar;
        a aVar2 = null;
        if (e3.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int i11 = 0;
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            int iB3 = x10.b(2);
            int i12 = (iB2 - i10) + 1;
            a aVar3 = new a(new int[]{iB, i12, iB3});
            float[] fArrA = x10.a();
            float[] fArrA2 = aVar3.a();
            int i13 = 0;
            while (i13 < iB) {
                int i14 = i11;
                while (i14 < iB3) {
                    int i15 = i11;
                    while (i15 < i12) {
                        int i16 = i15 * iB3;
                        int i17 = (i13 * i12 * iB3) + i16 + i14;
                        int i18 = (i13 * iB2 * iB3) + i16 + i14;
                        fArrA2[i17] = Float.MIN_VALUE;
                        int i19 = i11;
                        while (i19 < i10) {
                            aVar = aVar2;
                            try {
                                fArrA2[i17] = Math.max(fArrA2[i17], fArrA[i18 + (i19 * iB3)]);
                                i19++;
                                aVar2 = aVar;
                            } catch (Throwable th2) {
                                th = th2;
                                e3.a.b(th, i.class);
                                return aVar;
                            }
                        }
                        i15++;
                        i11 = 0;
                    }
                    i14++;
                    i11 = 0;
                }
                i13++;
                i11 = 0;
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar = aVar2;
        }
    }

    public static final a h(a x10, a w10) {
        if (e3.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            int iB = x10.b(0);
            int iB2 = w10.b(0);
            int iB3 = w10.b(1);
            a aVar = new a(new int[]{iB, iB3});
            float[] fArrA = x10.a();
            float[] fArrA2 = w10.a();
            float[] fArrA3 = aVar.a();
            for (int i10 = 0; i10 < iB; i10++) {
                for (int i11 = 0; i11 < iB3; i11++) {
                    int i12 = (i10 * iB3) + i11;
                    fArrA3[i12] = 0.0f;
                    for (int i13 = 0; i13 < iB2; i13++) {
                        fArrA3[i12] = fArrA3[i12] + (fArrA[(i10 * iB2) + i13] * fArrA2[(i13 * iB3) + i11]);
                    }
                }
            }
            return aVar;
        } catch (Throwable th2) {
            e3.a.b(th2, i.class);
            return null;
        }
    }

    public static final void i(a x10) {
        if (e3.a.d(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            float[] fArrA = x10.a();
            int length = fArrA.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (fArrA[i10] < 0.0f) {
                    fArrA[i10] = 0.0f;
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, i.class);
        }
    }

    public static final void j(a x10) {
        if (e3.a.d(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            float[] fArrA = x10.a();
            for (int i10 = 0; i10 < iB; i10++) {
                int i11 = i10 * iB2;
                int i12 = i11 + iB2;
                float f10 = Float.MIN_VALUE;
                for (int i13 = i11; i13 < i12; i13++) {
                    float f11 = fArrA[i13];
                    if (f11 > f10) {
                        f10 = f11;
                    }
                }
                float f12 = 0.0f;
                for (int i14 = i11; i14 < i12; i14++) {
                    float fExp = (float) Math.exp(fArrA[i14] - f10);
                    fArrA[i14] = fExp;
                    f12 += fExp;
                }
                while (i11 < i12) {
                    fArrA[i11] = fArrA[i11] / f12;
                    i11++;
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, i.class);
        }
    }

    public static final a k(a x10) {
        if (e3.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            a aVar = new a(new int[]{iB2, iB});
            float[] fArrA = x10.a();
            float[] fArrA2 = aVar.a();
            for (int i10 = 0; i10 < iB; i10++) {
                for (int i11 = 0; i11 < iB2; i11++) {
                    fArrA2[(i11 * iB) + i10] = fArrA[(i10 * iB2) + i11];
                }
            }
            return aVar;
        } catch (Throwable th2) {
            e3.a.b(th2, i.class);
            return null;
        }
    }

    public static final a l(a x10) {
        if (e3.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            int iB3 = x10.b(2);
            a aVar = new a(new int[]{iB3, iB2, iB});
            float[] fArrA = x10.a();
            float[] fArrA2 = aVar.a();
            for (int i10 = 0; i10 < iB; i10++) {
                for (int i11 = 0; i11 < iB2; i11++) {
                    for (int i12 = 0; i12 < iB3; i12++) {
                        fArrA2[(i12 * iB * iB2) + (i11 * iB) + i10] = fArrA[(i10 * iB2 * iB3) + (i11 * iB3) + i12];
                    }
                }
            }
            return aVar;
        } catch (Throwable th2) {
            e3.a.b(th2, i.class);
            return null;
        }
    }
}
