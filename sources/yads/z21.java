package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class z21 extends km2 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f118519y = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f118520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public pn2 f118521t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bitmap.Config f118522u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f118523v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f118524w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView.ScaleType f118525x;

    public z21(String str, o21 o21Var, int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, p21 p21Var) {
        super(0, str, p21Var);
        this.f118520s = new Object();
        a(new zd0(2.0f, 1000, 2));
        this.f118521t = o21Var;
        this.f118522u = config;
        this.f118523v = i10;
        this.f118524w = i11;
        this.f118525x = scaleType;
    }

    @Override // yads.km2
    public final void a() {
        super.a();
        synchronized (this.f118520s) {
            this.f118521t = null;
        }
    }

    public final qn2 b(r62 r62Var) {
        Bitmap bitmapDecodeByteArray;
        byte[] bArr = r62Var.f115341b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f118523v == 0 && this.f118524w == 0) {
            options.inPreferredConfig = this.f118522u;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iA = a(this.f118523v, this.f118524w, i10, i11, this.f118525x);
            int iA2 = a(this.f118524w, this.f118523v, i11, i10, this.f118525x);
            options.inJustDecodeBounds = false;
            float f10 = 1.0f;
            while (true) {
                float f11 = 2.0f * f10;
                if (f11 > Math.min(((double) i10) / ((double) iA), ((double) i11) / ((double) iA2))) {
                    break;
                }
                f10 = f11;
            }
            options.inSampleSize = (int) f10;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iA || bitmapDecodeByteArray.getHeight() > iA2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iA, iA2, true);
                bitmapDecodeByteArray.recycle();
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        return bitmapDecodeByteArray == null ? new qn2(new z92(r62Var)) : new qn2(bitmapDecodeByteArray, g01.a(r62Var));
    }

    @Override // yads.km2
    public final int f() {
        return 1;
    }

    @Override // yads.km2
    public final void a(Object obj) {
        pn2 pn2Var;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.f118520s) {
            pn2Var = this.f118521t;
        }
        if (pn2Var != null) {
            pn2Var.a(bitmap);
        }
    }

    public static int a(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 != 0 || i11 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i10 == 0) {
                    return (int) (((double) i12) * (((double) i11) / ((double) i13)));
                }
                if (i11 == 0) {
                    return i10;
                }
                double d10 = ((double) i13) / ((double) i12);
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d11 = i11;
                    return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
                }
                double d12 = i11;
                return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
            }
            if (i10 != 0) {
                return i10;
            }
        }
        return i12;
    }

    @Override // yads.km2
    public final qn2 a(r62 r62Var) {
        qn2 qn2VarB;
        synchronized (f118519y) {
            try {
                try {
                    qn2VarB = b(r62Var);
                } catch (OutOfMemoryError e10) {
                    int length = r62Var.f115341b.length;
                    boolean z10 = rj3.f115467a;
                    boolean z11 = lb1.f113032a;
                    return new qn2(new z92(e10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qn2VarB;
    }
}
