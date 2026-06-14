package c0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f6441a = new k();

    private k() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == a.e(config);
    }

    private final boolean c(boolean z10, Bitmap bitmap, z.i iVar, z.h hVar) {
        if (z10) {
            return true;
        }
        return q.h.c(bitmap.getWidth(), bitmap.getHeight(), z.b.a(iVar) ? bitmap.getWidth() : i.z(iVar.b(), hVar), z.b.a(iVar) ? bitmap.getHeight() : i.z(iVar.a(), hVar), hVar) == 1.0d;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, z.i iVar, z.h hVar, boolean z10) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z10, bitmap, iVar, hVar)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iP = i.p(drawableMutate);
        if (iP <= 0) {
            iP = 512;
        }
        int i10 = i.i(drawableMutate);
        int i11 = i10 > 0 ? i10 : 512;
        double dC = q.h.c(iP, i11, z.b.a(iVar) ? iP : i.z(iVar.b(), hVar), z.b.a(iVar) ? i11 : i.z(iVar.a(), hVar), hVar);
        int iC = zf.a.c(((double) iP) * dC);
        int iC2 = zf.a.c(dC * ((double) i11));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iC2, a.e(config));
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        Rect bounds = drawableMutate.getBounds();
        int i12 = bounds.left;
        int i13 = bounds.top;
        int i14 = bounds.right;
        int i15 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iC, iC2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i12, i13, i14, i15);
        return bitmapCreateBitmap;
    }
}
