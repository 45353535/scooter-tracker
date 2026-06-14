package yads;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public final class og2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final so f114309a;

    public /* synthetic */ og2() {
        this(new so());
    }

    public final Bitmap a(Bitmap bitmap, d31 d31Var) {
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0 || d31Var.f109731a == 0 || d31Var.f109732b == 0) {
            return bitmap;
        }
        if (bitmap.getWidth() * d31Var.f109732b == bitmap.getHeight() * d31Var.f109731a) {
            return bitmap;
        }
        this.f114309a.getClass();
        kx2 kx2Var = new kx2(bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && d31Var.f109731a != 0 && d31Var.f109732b != 0) {
            Iterator it = new IntRange(bitmap.getWidth(), Math.max(bitmap.getWidth(), Math.min(100, (d31Var.f109731a * 100) / d31Var.f109732b))).iterator();
            double d10 = 1.0d;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int iNextInt = ((IntIterator) it).nextInt();
                int i10 = d31Var.f109732b * iNextInt;
                int i11 = d31Var.f109731a;
                if (i10 % i11 == 0) {
                    kx2Var = new kx2(iNextInt, i10 / i11);
                    break;
                }
                double d11 = ((double) i10) / ((double) i11);
                int iC = zf.a.c(d11);
                double dAbs = Math.abs(((double) iC) - d11) / d11;
                if (dAbs < d10) {
                    kx2Var = new kx2(iNextInt, iC);
                    d10 = dAbs;
                }
            }
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = kx2Var.f112887b;
        kx2 kx2Var2 = new kx2(i12, (i12 * height) / width);
        int i13 = kx2Var.f112888c;
        kx2 kx2Var3 = (kx2) mf.a.k(kx2Var2, new kx2((width * i13) / height, i13));
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, kx2Var3.f112887b, kx2Var3.f112888c, false);
        int width2 = (bitmapCreateScaledBitmap.getWidth() - kx2Var.f112887b) / 2;
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int i14 = kx2Var.f112888c;
        return Bitmap.createBitmap(bitmapCreateScaledBitmap, width2, (height2 - i14) / 2, kx2Var.f112887b, i14, (Matrix) null, false);
    }

    public og2(so soVar) {
        this.f114309a = soVar;
    }
}
