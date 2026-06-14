package t5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final /* synthetic */ int a(Drawable drawable) {
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 0;
    }

    public static final /* synthetic */ int b(Drawable[] drawableArr) {
        Intrinsics.checkNotNullParameter(drawableArr, "<this>");
        return g.e(a(drawableArr[0]), a(drawableArr[2]));
    }

    public static final /* synthetic */ int c(Drawable[] drawableArr) {
        Intrinsics.checkNotNullParameter(drawableArr, "<this>");
        return d(drawableArr[0]) + d(drawableArr[2]);
    }

    public static final /* synthetic */ int d(Drawable drawable) {
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 0;
    }

    public static final /* synthetic */ boolean e(Drawable[] drawableArr) {
        Intrinsics.checkNotNullParameter(drawableArr, "<this>");
        return (drawableArr[0] == null && drawableArr[2] == null) ? false : true;
    }

    public static final /* synthetic */ Drawable f(Drawable drawable, Context context, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (num == null || num2 == null) {
            return drawable;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(num.intValue(), num2.intValue(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, num.intValue(), num2.intValue());
        drawable.draw(canvas);
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    public static final /* synthetic */ Drawable g(Drawable drawable, Integer num) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        if (num != null) {
            DrawableCompat.setTintList(DrawableCompat.wrap(drawable), ColorStateList.valueOf(num.intValue()));
        }
        return drawable;
    }
}
