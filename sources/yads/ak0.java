package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ak0 extends rw2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jk0 f108704m;

    public ak0(List list) {
        w92 w92Var = new w92((byte[]) list.get(0));
        this.f108704m = new jk0(w92Var.r(), w92Var.r());
    }

    @Override // yads.rw2
    public final d23 a(byte[] bArr, int i10, boolean z10) {
        boolean z11;
        List listUnmodifiableList;
        char c10;
        gk0 gk0Var;
        int iA;
        int iA2;
        int i11;
        int iA3;
        if (z10) {
            ik0 ik0Var = this.f108704m.f112374f;
            ik0Var.f112026c.clear();
            ik0Var.f112027d.clear();
            ik0Var.f112028e.clear();
            ik0Var.f112029f.clear();
            ik0Var.f112030g.clear();
            ik0Var.f112031h = null;
            ik0Var.f112032i = null;
        }
        jk0 jk0Var = this.f108704m;
        jk0Var.getClass();
        v92 v92Var = new v92(i10, bArr);
        while (true) {
            z11 = true;
            if (v92Var.b() >= 48 && v92Var.a(8) == 15) {
                ik0 ik0Var2 = jk0Var.f112374f;
                int iA4 = v92Var.a(8);
                int i12 = 16;
                int iA5 = v92Var.a(16);
                int iA6 = v92Var.a(16);
                int iC = v92Var.c() + iA6;
                if (iA6 * 8 > v92Var.b()) {
                    uf1.d("DvbParser", "Data field length exceeds limit");
                    v92Var.c(v92Var.b());
                } else {
                    switch (iA4) {
                        case 16:
                            if (iA5 == ik0Var2.f112024a) {
                                ek0 ek0Var = ik0Var2.f112032i;
                                v92Var.a(8);
                                int iA7 = v92Var.a(4);
                                int iA8 = v92Var.a(2);
                                v92Var.c(2);
                                int i13 = iA6 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i13 > 0) {
                                    int iA9 = v92Var.a(8);
                                    v92Var.c(8);
                                    i13 -= 6;
                                    sparseArray.put(iA9, new fk0(v92Var.a(16), v92Var.a(16)));
                                }
                                ek0 ek0Var2 = new ek0(iA7, iA8, sparseArray);
                                if (iA8 != 0) {
                                    ik0Var2.f112032i = ek0Var2;
                                    ik0Var2.f112026c.clear();
                                    ik0Var2.f112027d.clear();
                                    ik0Var2.f112028e.clear();
                                } else if (ek0Var != null && ek0Var.f110389a != iA7) {
                                    ik0Var2.f112032i = ek0Var2;
                                }
                            }
                            break;
                        case 17:
                            ek0 ek0Var3 = ik0Var2.f112032i;
                            if (iA5 == ik0Var2.f112024a && ek0Var3 != null) {
                                int iA10 = v92Var.a(8);
                                v92Var.c(4);
                                boolean zE = v92Var.e();
                                v92Var.c(3);
                                int iA11 = v92Var.a(16);
                                int iA12 = v92Var.a(16);
                                v92Var.a(3);
                                int iA13 = v92Var.a(3);
                                v92Var.c(2);
                                int iA14 = v92Var.a(8);
                                int iA15 = v92Var.a(8);
                                int iA16 = v92Var.a(4);
                                int iA17 = v92Var.a(2);
                                v92Var.c(2);
                                int i14 = iA6 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i14 > 0) {
                                    int iA18 = v92Var.a(i12);
                                    int iA19 = v92Var.a(2);
                                    v92Var.a(2);
                                    int iA20 = v92Var.a(12);
                                    v92Var.c(4);
                                    int iA21 = v92Var.a(12);
                                    int i15 = i14 - 6;
                                    if (iA19 == 1 || iA19 == 2) {
                                        v92Var.a(8);
                                        v92Var.a(8);
                                        i14 -= 8;
                                    } else {
                                        i14 = i15;
                                    }
                                    sparseArray2.put(iA18, new hk0(iA20, iA21));
                                    i12 = 16;
                                }
                                gk0 gk0Var2 = new gk0(iA10, zE, iA11, iA12, iA13, iA14, iA15, iA16, iA17, sparseArray2);
                                if (ek0Var3.f110390b == 0 && (gk0Var = (gk0) ik0Var2.f112026c.get(iA10)) != null) {
                                    SparseArray sparseArray3 = gk0Var.f111242j;
                                    for (int i16 = 0; i16 < sparseArray3.size(); i16++) {
                                        gk0Var2.f111242j.put(sparseArray3.keyAt(i16), (hk0) sparseArray3.valueAt(i16));
                                    }
                                }
                                ik0Var2.f112026c.put(gk0Var2.f111233a, gk0Var2);
                            }
                            break;
                        case 18:
                            if (iA5 == ik0Var2.f112024a) {
                                bk0 bk0VarA = jk0.a(v92Var, iA6);
                                ik0Var2.f112027d.put(bk0VarA.f109026a, bk0VarA);
                            } else if (iA5 == ik0Var2.f112025b) {
                                bk0 bk0VarA2 = jk0.a(v92Var, iA6);
                                ik0Var2.f112029f.put(bk0VarA2.f109026a, bk0VarA2);
                            }
                            break;
                        case 19:
                            if (iA5 == ik0Var2.f112024a) {
                                dk0 dk0VarA = jk0.a(v92Var);
                                ik0Var2.f112028e.put(dk0VarA.f109939a, dk0VarA);
                            } else if (iA5 == ik0Var2.f112025b) {
                                dk0 dk0VarA2 = jk0.a(v92Var);
                                ik0Var2.f112030g.put(dk0VarA2.f109939a, dk0VarA2);
                            }
                            break;
                        case 20:
                            if (iA5 == ik0Var2.f112024a) {
                                v92Var.c(4);
                                boolean zE2 = v92Var.e();
                                v92Var.c(3);
                                int iA22 = v92Var.a(16);
                                int iA23 = v92Var.a(16);
                                if (zE2) {
                                    int iA24 = v92Var.a(16);
                                    iA = v92Var.a(16);
                                    iA3 = v92Var.a(16);
                                    i11 = iA24;
                                    iA2 = v92Var.a(16);
                                } else {
                                    iA = iA22;
                                    iA2 = iA23;
                                    i11 = 0;
                                    iA3 = 0;
                                }
                                ik0Var2.f112031h = new ck0(iA22, iA23, i11, iA, iA3, iA2);
                            }
                            break;
                    }
                    v92Var.d(iC - v92Var.c());
                }
            }
        }
        ik0 ik0Var3 = jk0Var.f112374f;
        ek0 ek0Var4 = ik0Var3.f112032i;
        if (ek0Var4 == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ck0 ck0Var = ik0Var3.f112031h;
            if (ck0Var == null) {
                ck0Var = jk0Var.f112372d;
            }
            Bitmap bitmap = jk0Var.f112375g;
            if (bitmap == null || ck0Var.f109426a + 1 != bitmap.getWidth() || ck0Var.f109427b + 1 != jk0Var.f112375g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ck0Var.f109426a + 1, ck0Var.f109427b + 1, Bitmap.Config.ARGB_8888);
                jk0Var.f112375g = bitmapCreateBitmap;
                jk0Var.f112371c.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = ek0Var4.f110391c;
            int i17 = 0;
            while (i17 < sparseArray4.size()) {
                jk0Var.f112371c.save();
                fk0 fk0Var = (fk0) sparseArray4.valueAt(i17);
                gk0 gk0Var3 = (gk0) jk0Var.f112374f.f112026c.get(sparseArray4.keyAt(i17));
                int i18 = fk0Var.f110742a + ck0Var.f109428c;
                int i19 = fk0Var.f110743b + ck0Var.f109430e;
                jk0Var.f112371c.clipRect(i18, i19, Math.min(gk0Var3.f111235c + i18, ck0Var.f109429d), Math.min(gk0Var3.f111236d + i19, ck0Var.f109431f));
                bk0 bk0Var = (bk0) jk0Var.f112374f.f112027d.get(gk0Var3.f111238f);
                if (bk0Var == null && (bk0Var = (bk0) jk0Var.f112374f.f112029f.get(gk0Var3.f111238f)) == null) {
                    bk0Var = jk0Var.f112373e;
                }
                SparseArray sparseArray5 = gk0Var3.f111242j;
                boolean z12 = z11;
                for (int i20 = 0; i20 < sparseArray5.size(); i20++) {
                    int iKeyAt = sparseArray5.keyAt(i20);
                    hk0 hk0Var = (hk0) sparseArray5.valueAt(i20);
                    dk0 dk0Var = (dk0) jk0Var.f112374f.f112028e.get(iKeyAt);
                    if (dk0Var == null) {
                        dk0Var = (dk0) jk0Var.f112374f.f112030g.get(iKeyAt);
                    }
                    if (dk0Var != null) {
                        Paint paint = dk0Var.f109940b ? null : jk0Var.f112369a;
                        int i21 = gk0Var3.f111237e;
                        int i22 = i18 + hk0Var.f111614a;
                        int i23 = i19 + hk0Var.f111615b;
                        Canvas canvas = jk0Var.f112371c;
                        int[] iArr = i21 == 3 ? bk0Var.f109029d : i21 == 2 ? bk0Var.f109028c : bk0Var.f109027b;
                        jk0.a(dk0Var.f109941c, iArr, i21, i22, i23, paint, canvas);
                        jk0.a(dk0Var.f109942d, iArr, i21, i22, i23 + 1, paint, canvas);
                    }
                }
                if (gk0Var3.f111234b) {
                    int i24 = gk0Var3.f111237e;
                    c10 = 3;
                    jk0Var.f112370b.setColor(i24 == 3 ? bk0Var.f109029d[gk0Var3.f111239g] : i24 == 2 ? bk0Var.f109028c[gk0Var3.f111240h] : bk0Var.f109027b[gk0Var3.f111241i]);
                    jk0Var.f112371c.drawRect(i18, i19, gk0Var3.f111235c + i18, gk0Var3.f111236d + i19, jk0Var.f112370b);
                } else {
                    c10 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(jk0Var.f112375g, i18, i19, gk0Var3.f111235c, gk0Var3.f111236d);
                float f10 = ck0Var.f109426a;
                float f11 = i19;
                float f12 = ck0Var.f109427b;
                arrayList.add(new a20(null, null, null, bitmapCreateBitmap2, f11 / f12, 0, 0, i18 / f10, 0, Integer.MIN_VALUE, -3.4028235E38f, gk0Var3.f111235c / f10, gk0Var3.f111236d / f12, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f));
                jk0Var.f112371c.drawColor(0, PorterDuff.Mode.CLEAR);
                jk0Var.f112371c.restore();
                i17++;
                z11 = z12;
            }
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        return new kk0(listUnmodifiableList);
    }
}
