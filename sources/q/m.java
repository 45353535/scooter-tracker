package q;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f98584a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Paint f98585b = new Paint(3);

    private m() {
    }

    public final j a(String str, vh.g gVar, l lVar) {
        if (!n.c(lVar, str)) {
            return j.f98575d;
        }
        ExifInterface exifInterface = new ExifInterface(new k(gVar.peek().inputStream()));
        return new j(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
    }

    public final Bitmap b(Bitmap bitmap, j jVar) {
        Bitmap bitmapCreateBitmap;
        if (!jVar.b() && !n.a(jVar)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (jVar.b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (n.a(jVar)) {
            matrix.postRotate(jVar.a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (f10 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        if (n.b(jVar)) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), c0.a.c(bitmap));
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), c0.a.c(bitmap));
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        }
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, f98585b);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}
