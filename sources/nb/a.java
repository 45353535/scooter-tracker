package nb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import androidx.work.WorkInfo;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import lb.k;
import lb.s;
import lb.t;
import p9.a;
import q9.c0;
import q9.d0;
import q9.l;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f95771h = {0, 7, 8, Ascii.SI};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f95772i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f95773j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f95774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f95775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Canvas f95776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f95777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1095a f95778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f95779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f95780g;

    /* JADX INFO: renamed from: nb.a$a, reason: collision with other inner class name */
    private static final class C1095a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f95782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f95783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f95784d;

        public C1095a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f95781a = i10;
            this.f95782b = iArr;
            this.f95783c = iArr2;
            this.f95784d = iArr3;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f95786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f95787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f95788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f95789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f95790f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f95785a = i10;
            this.f95786b = i11;
            this.f95787c = i12;
            this.f95788d = i13;
            this.f95789e = i14;
            this.f95790f = i15;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f95792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f95793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f95794d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f95791a = i10;
            this.f95792b = z10;
            this.f95793c = bArr;
            this.f95794d = bArr2;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f95796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f95797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray f95798d;

        public d(int i10, int i11, int i12, SparseArray sparseArray) {
            this.f95795a = i10;
            this.f95796b = i11;
            this.f95797c = i12;
            this.f95798d = sparseArray;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f95800b;

        public e(int i10, int i11) {
            this.f95799a = i10;
            this.f95800b = i11;
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f95802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f95803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f95804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f95805e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f95806f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f95807g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f95808h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f95809i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f95810j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray f95811k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray sparseArray) {
            this.f95801a = i10;
            this.f95802b = z10;
            this.f95803c = i11;
            this.f95804d = i12;
            this.f95805e = i13;
            this.f95806f = i14;
            this.f95807g = i15;
            this.f95808h = i16;
            this.f95809i = i17;
            this.f95810j = i18;
            this.f95811k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f95811k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f95811k.put(sparseArray.keyAt(i10), (g) sparseArray.valueAt(i10));
            }
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f95813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f95814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f95815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f95816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f95817f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f95812a = i10;
            this.f95813b = i11;
            this.f95814c = i12;
            this.f95815d = i13;
            this.f95816e = i14;
            this.f95817f = i15;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f95819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray f95820c = new SparseArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray f95821d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray f95822e = new SparseArray();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray f95823f = new SparseArray();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray f95824g = new SparseArray();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f95825h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f95826i;

        public h(int i10, int i11) {
            this.f95818a = i10;
            this.f95819b = i11;
        }

        public void a() {
            this.f95820c.clear();
            this.f95821d.clear();
            this.f95822e.clear();
            this.f95823f.clear();
            this.f95824g.clear();
            this.f95825h = null;
            this.f95826i = null;
        }
    }

    public a(List list) {
        d0 d0Var = new d0((byte[]) list.get(0));
        int iP = d0Var.P();
        int iP2 = d0Var.P();
        Paint paint = new Paint();
        this.f95774a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f95775b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f95776c = new Canvas();
        this.f95777d = new b(719, 575, 0, 719, 0, 575);
        this.f95778e = new C1095a(0, c(), d(), e());
        this.f95779f = new h(iP, iP2);
    }

    private static byte[] b(int i10, int i11, c0 c0Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c0Var.h(i11);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = f(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int g(c0 c0Var, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int iH;
        int iH2;
        boolean z11 = false;
        while (true) {
            int iH3 = c0Var.h(2);
            if (iH3 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (c0Var.g()) {
                    iH = c0Var.h(3) + 3;
                    iH2 = c0Var.h(2);
                } else {
                    if (c0Var.g()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int iH4 = c0Var.h(2);
                        if (iH4 == 0) {
                            z10 = true;
                        } else if (iH4 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (iH4 == 2) {
                            iH = c0Var.h(4) + 12;
                            iH2 = c0Var.h(2);
                        } else if (iH4 != 3) {
                            z10 = z11;
                        } else {
                            iH = c0Var.h(8) + 29;
                            iH2 = c0Var.h(2);
                        }
                        iH3 = 0;
                        i12 = 0;
                    }
                    iH3 = 0;
                }
                z10 = z11;
                i12 = iH;
                iH3 = iH2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i10, i11, i10 + i12, 1 + i11, paint);
            }
            i10 += i12;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    private static int h(c0 c0Var, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int iH;
        int iH2;
        boolean z11 = false;
        while (true) {
            int iH3 = c0Var.h(4);
            if (iH3 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (c0Var.g()) {
                if (c0Var.g()) {
                    int iH4 = c0Var.h(2);
                    if (iH4 == 0) {
                        z10 = z11;
                        i12 = 1;
                        iH3 = 0;
                    } else if (iH4 == 1) {
                        iH3 = 0;
                        i12 = 2;
                        z10 = z11;
                    } else if (iH4 == 2) {
                        iH = c0Var.h(4) + 9;
                        iH2 = c0Var.h(4);
                    } else if (iH4 != 3) {
                        z10 = z11;
                        iH3 = 0;
                        i12 = 0;
                    } else {
                        iH = c0Var.h(8) + 25;
                        iH2 = c0Var.h(4);
                    }
                } else {
                    iH = c0Var.h(2) + 4;
                    iH2 = c0Var.h(4);
                }
                z10 = z11;
                i12 = iH;
                iH3 = iH2;
            } else {
                int iH5 = c0Var.h(3);
                if (iH5 != 0) {
                    z10 = z11;
                    i12 = iH5 + 2;
                    iH3 = 0;
                } else {
                    z10 = true;
                    iH3 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i10, i11, i10 + i12, 1 + i11, paint);
            }
            i10 += i12;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    private static int i(c0 c0Var, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int iH;
        boolean z11 = false;
        while (true) {
            int iH2 = c0Var.h(8);
            if (iH2 != 0) {
                z10 = z11;
                iH = 1;
            } else if (c0Var.g()) {
                z10 = z11;
                iH = c0Var.h(7);
                iH2 = c0Var.h(8);
            } else {
                int iH3 = c0Var.h(7);
                if (iH3 != 0) {
                    z10 = z11;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    z10 = true;
                    iH2 = 0;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i10, i11, i10 + iH, 1 + i11, paint);
            }
            i10 += iH;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    private static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        c0 c0Var = new c0(bArr);
        byte[] bArrB = null;
        byte[] bArrB2 = null;
        int iG = i11;
        int i13 = i12;
        byte[] bArrB3 = null;
        while (c0Var.b() != 0) {
            int iH = c0Var.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        if (i10 == 3) {
                            bArr3 = bArrB3 == null ? f95772i : bArrB3;
                        } else if (i10 != 2) {
                            bArr2 = null;
                            paint2 = paint3;
                            iG = g(c0Var, iArr2, bArr2, iG, i13, paint2, canvas2);
                            c0Var.c();
                        } else {
                            bArr3 = bArrB2 == null ? f95771h : bArrB2;
                        }
                        paint2 = paint3;
                        bArr2 = bArr3;
                        iG = g(c0Var, iArr2, bArr2, iG, i13, paint2, canvas2);
                        c0Var.c();
                        break;
                    case 17:
                        iArr2 = iArr;
                        Paint paint4 = paint;
                        canvas2 = canvas;
                        paint2 = paint4;
                        iG = h(c0Var, iArr2, i10 == 3 ? bArrB == null ? f95773j : bArrB : null, iG, i13, paint2, canvas2);
                        c0Var.c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        iG = i(c0Var, iArr2, null, iG, i13, paint2, canvas2);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrB2 = b(4, 4, c0Var);
                                break;
                            case 33:
                                bArrB3 = b(4, 8, c0Var);
                                break;
                            case 34:
                                bArrB = b(16, 8, c0Var);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i13 += 2;
                iG = i11;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static void k(c cVar, C1095a c1095a, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? c1095a.f95784d : i10 == 2 ? c1095a.f95783c : c1095a.f95782b;
        j(cVar.f95793c, iArr, i10, i11, i12, paint, canvas);
        j(cVar.f95794d, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    private lb.e l(c0 c0Var) {
        SparseArray sparseArray;
        int i10;
        while (c0Var.b() >= 48 && c0Var.h(8) == 15) {
            r(c0Var, this.f95779f);
        }
        h hVar = this.f95779f;
        d dVar = hVar.f95826i;
        if (dVar == null) {
            return new lb.e(ImmutableList.of(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f95825h;
        if (bVar == null) {
            bVar = this.f95777d;
        }
        Bitmap bitmap = this.f95780g;
        if (bitmap == null || bVar.f95785a + 1 != bitmap.getWidth() || bVar.f95786b + 1 != this.f95780g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f95785a + 1, bVar.f95786b + 1, Bitmap.Config.ARGB_8888);
            this.f95780g = bitmapCreateBitmap;
            this.f95776c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.f95798d;
        int i11 = 0;
        while (i11 < sparseArray2.size()) {
            this.f95776c.save();
            e eVar = (e) sparseArray2.valueAt(i11);
            f fVar = (f) this.f95779f.f95820c.get(sparseArray2.keyAt(i11));
            int i12 = eVar.f95799a + bVar.f95787c;
            int i13 = eVar.f95800b + bVar.f95789e;
            this.f95776c.clipRect(i12, i13, Math.min(fVar.f95803c + i12, bVar.f95788d), Math.min(fVar.f95804d + i13, bVar.f95790f));
            C1095a c1095a = (C1095a) this.f95779f.f95821d.get(fVar.f95807g);
            if (c1095a == null && (c1095a = (C1095a) this.f95779f.f95823f.get(fVar.f95807g)) == null) {
                c1095a = this.f95778e;
            }
            C1095a c1095a2 = c1095a;
            SparseArray sparseArray3 = fVar.f95811k;
            int i14 = 0;
            while (i14 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i14);
                g gVar = (g) sparseArray3.valueAt(i14);
                c cVar = (c) this.f95779f.f95822e.get(iKeyAt);
                if (cVar == null) {
                    cVar = (c) this.f95779f.f95824g.get(iKeyAt);
                }
                if (cVar != null) {
                    sparseArray = sparseArray2;
                    i10 = i14;
                    k(cVar, c1095a2, fVar.f95806f, gVar.f95814c + i12, gVar.f95815d + i13, cVar.f95792b ? null : this.f95774a, this.f95776c);
                } else {
                    sparseArray = sparseArray2;
                    i10 = i14;
                }
                i14 = i10 + 1;
                sparseArray2 = sparseArray;
            }
            SparseArray sparseArray4 = sparseArray2;
            if (fVar.f95802b) {
                int i15 = fVar.f95806f;
                this.f95775b.setColor(i15 == 3 ? c1095a2.f95784d[fVar.f95808h] : i15 == 2 ? c1095a2.f95783c[fVar.f95809i] : c1095a2.f95782b[fVar.f95810j]);
                this.f95776c.drawRect(i12, i13, fVar.f95803c + i12, fVar.f95804d + i13, this.f95775b);
            }
            arrayList.add(new a.b().f(Bitmap.createBitmap(this.f95780g, i12, i13, fVar.f95803c, fVar.f95804d)).k(i12 / bVar.f95785a).l(0).h(i13 / bVar.f95786b, 0).i(0).n(fVar.f95803c / bVar.f95785a).g(fVar.f95804d / bVar.f95786b).a());
            this.f95776c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f95776c.restore();
            i11++;
            sparseArray2 = sparseArray4;
        }
        return new lb.e(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static C1095a m(c0 c0Var, int i10) {
        int iH;
        int i11;
        int iH2;
        int iH3;
        int iH4;
        int i12 = 8;
        int iH5 = c0Var.h(8);
        c0Var.r(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrC = c();
        int[] iArrD = d();
        int[] iArrE = e();
        while (i14 > 0) {
            int iH6 = c0Var.h(i12);
            int iH7 = c0Var.h(i12);
            int[] iArr = (iH7 & 128) != 0 ? iArrC : (iH7 & 64) != 0 ? iArrD : iArrE;
            if ((iH7 & 1) != 0) {
                iH3 = c0Var.h(i12);
                iH4 = c0Var.h(i12);
                iH = c0Var.h(i12);
                iH2 = c0Var.h(i12);
                i11 = i14 - 6;
            } else {
                int iH8 = c0Var.h(6) << i13;
                int iH9 = c0Var.h(4) << 4;
                iH = c0Var.h(4) << 4;
                i11 = i14 - 4;
                iH2 = c0Var.h(i13) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
                iH4 = 0;
                iH = 0;
            }
            double d10 = iH3;
            double d11 = iH4 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            double d12 = iH + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            iArr[iH6] = f((byte) (255 - (iH2 & 255)), o0.p((int) (d10 + (1.402d * d11)), 0, 255), o0.p((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), o0.p((int) (d10 + (d12 * 1.772d)), 0, 255));
            i14 = i11;
            iH5 = iH5;
            i12 = 8;
            i13 = 2;
        }
        return new C1095a(iH5, iArrC, iArrD, iArrE);
    }

    private static b n(c0 c0Var) {
        int i10;
        int i11;
        int i12;
        int iH;
        c0Var.r(4);
        boolean zG = c0Var.g();
        c0Var.r(3);
        int iH2 = c0Var.h(16);
        int iH3 = c0Var.h(16);
        if (zG) {
            int iH4 = c0Var.h(16);
            int iH5 = c0Var.h(16);
            int iH6 = c0Var.h(16);
            iH = c0Var.h(16);
            i12 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iH2;
            iH = iH3;
        }
        return new b(iH2, iH3, i10, i12, i11, iH);
    }

    private static c o(c0 c0Var) {
        byte[] bArr;
        int iH = c0Var.h(16);
        c0Var.r(4);
        int iH2 = c0Var.h(2);
        boolean zG = c0Var.g();
        c0Var.r(1);
        byte[] bArr2 = o0.f98842f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = c0Var.h(16);
                int iH4 = c0Var.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    c0Var.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    c0Var.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        c0Var.r(c0Var.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    private static d p(c0 c0Var, int i10) {
        int iH = c0Var.h(8);
        int iH2 = c0Var.h(4);
        int iH3 = c0Var.h(2);
        c0Var.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iH4 = c0Var.h(8);
            c0Var.r(8);
            i11 -= 6;
            sparseArray.put(iH4, new e(c0Var.h(16), c0Var.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    private static f q(c0 c0Var, int i10) {
        int i11;
        int iH;
        int iH2;
        char c10;
        int iH3 = c0Var.h(8);
        int i12 = 4;
        c0Var.r(4);
        boolean zG = c0Var.g();
        c0Var.r(3);
        int i13 = 16;
        int iH4 = c0Var.h(16);
        int iH5 = c0Var.h(16);
        int iH6 = c0Var.h(3);
        int iH7 = c0Var.h(3);
        int i14 = 2;
        c0Var.r(2);
        int iH8 = c0Var.h(8);
        int iH9 = c0Var.h(8);
        int iH10 = c0Var.h(4);
        int iH11 = c0Var.h(2);
        c0Var.r(2);
        int i15 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int iH12 = c0Var.h(i13);
            int iH13 = c0Var.h(i14);
            int iH14 = c0Var.h(i14);
            int iH15 = c0Var.h(12);
            c0Var.r(i12);
            int iH16 = c0Var.h(12);
            int i16 = i15 - 6;
            if (iH13 != 1) {
                i11 = 2;
                if (iH13 != 2) {
                    iH2 = 0;
                    iH = 0;
                    i15 = i16;
                    c10 = '\b';
                }
                sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
                i13 = 16;
                i14 = i11;
                i12 = 4;
            } else {
                i11 = 2;
            }
            c10 = '\b';
            i15 -= 8;
            iH2 = c0Var.h(8);
            iH = c0Var.h(8);
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
            i13 = 16;
            i14 = i11;
            i12 = 4;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    private static void r(c0 c0Var, h hVar) {
        f fVar;
        int iH = c0Var.h(8);
        int iH2 = c0Var.h(16);
        int iH3 = c0Var.h(16);
        int iD = c0Var.d() + iH3;
        if (iH3 * 8 > c0Var.b()) {
            u.h("DvbParser", "Data field length exceeds limit");
            c0Var.r(c0Var.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f95818a) {
                    d dVar = hVar.f95826i;
                    d dVarP = p(c0Var, iH3);
                    if (dVarP.f95797c != 0) {
                        hVar.f95826i = dVarP;
                        hVar.f95820c.clear();
                        hVar.f95821d.clear();
                        hVar.f95822e.clear();
                    } else if (dVar != null && dVar.f95796b != dVarP.f95796b) {
                        hVar.f95826i = dVarP;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f95826i;
                if (iH2 == hVar.f95818a && dVar2 != null) {
                    f fVarQ = q(c0Var, iH3);
                    if (dVar2.f95797c == 0 && (fVar = (f) hVar.f95820c.get(fVarQ.f95801a)) != null) {
                        fVarQ.a(fVar);
                    }
                    hVar.f95820c.put(fVarQ.f95801a, fVarQ);
                }
                break;
            case 18:
                if (iH2 == hVar.f95818a) {
                    C1095a c1095aM = m(c0Var, iH3);
                    hVar.f95821d.put(c1095aM.f95781a, c1095aM);
                } else if (iH2 == hVar.f95819b) {
                    C1095a c1095aM2 = m(c0Var, iH3);
                    hVar.f95823f.put(c1095aM2.f95781a, c1095aM2);
                }
                break;
            case 19:
                if (iH2 == hVar.f95818a) {
                    c cVarO = o(c0Var);
                    hVar.f95822e.put(cVarO.f95791a, cVarO);
                } else if (iH2 == hVar.f95819b) {
                    c cVarO2 = o(c0Var);
                    hVar.f95824g.put(cVarO2.f95791a, cVarO2);
                }
                break;
            case 20:
                if (iH2 == hVar.f95818a) {
                    hVar.f95825h = n(c0Var);
                }
                break;
        }
        c0Var.s(iD - c0Var.d());
    }

    @Override // lb.t
    public void a(byte[] bArr, int i10, int i11, t.b bVar, l lVar) {
        c0 c0Var = new c0(bArr, i11 + i10);
        c0Var.p(i10);
        lVar.accept(l(c0Var));
    }

    @Override // lb.t
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // lb.t
    public /* synthetic */ k parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return s.a(this, bArr, i10, i11);
    }

    @Override // lb.t
    public void reset() {
        this.f95779f.a();
    }
}
