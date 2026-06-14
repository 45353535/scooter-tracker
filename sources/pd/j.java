package pd;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final Bitmap a(Bitmap bitmap, double d10) {
        Bitmap bitmapCreateScaledBitmap;
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        if (d10 <= 1.0d) {
            return bitmap;
        }
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((double) bitmap.getWidth()) / d10), (int) (((double) bitmap.getHeight()) / d10), true);
        } catch (Throwable unused) {
            bitmapCreateScaledBitmap = null;
        }
        return bitmapCreateScaledBitmap == null ? bitmap : bitmapCreateScaledBitmap;
    }

    public static final Bitmap b(byte[] bArr, BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    public static final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        try {
            return b(bArr, options);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ Bitmap d(byte[] bArr, BitmapFactory.Options options, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            options = null;
        }
        return c(bArr, options);
    }

    public static final Bitmap e(File file, BitmapFactory.Options bitmapFactoryOptions) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath(), bitmapFactoryOptions);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeFile, "decodeFile(path, bitmapFactoryOptions)");
        return bitmapDecodeFile;
    }

    public static final Bitmap f(File file, BitmapFactory.Options bitmapFactoryOptions) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        if (!td.b.i(file)) {
            return null;
        }
        try {
            return e(file, bitmapFactoryOptions);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void g(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        try {
            bitmap.recycle();
            Unit unit = Unit.f93236a;
        } catch (Throwable unused) {
        }
    }

    public static final BitmapDrawable h(Bitmap bitmap, Context context) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return i(bitmap, resources);
    }

    public static final BitmapDrawable i(Bitmap bitmap, Resources resources) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new BitmapDrawable(resources, bitmap);
    }
}
