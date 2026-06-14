package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class yy2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uy2 f118461a = new uy2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f118462b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f118463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f118464d;

    public yy2() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.f118463c = paint;
        this.f118464d = new Rect();
    }

    public final void a(ImageView imageView, Bitmap bitmap, sy2 sy2Var) {
        float f10;
        float fFloatValue;
        float fFloatValue2;
        float width = imageView.getWidth();
        float height = imageView.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        Float fValueOf = Float.valueOf(0.0f);
        if (height == 0.0f || height2 == 0.0f) {
            return;
        }
        boolean z10 = width / height > width2 / height2;
        float f11 = z10 ? width / width2 : height / height2;
        float f12 = width2 * f11;
        float f13 = height2 * f11;
        if (z10) {
            fFloatValue = 0.0f;
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            fFloatValue = (width / 2) - (((sy2Var.f115992c / 2) + sy2Var.f115990a) * f11);
            Float fValueOf2 = fFloatValue > 0.0f ? fValueOf : fFloatValue + f12 < width ? Float.valueOf(width - f12) : null;
            if (fValueOf2 != null) {
                fFloatValue = fValueOf2.floatValue();
            }
        }
        if (z10) {
            float f14 = (height / 2) - (((sy2Var.f115993d / 2) + sy2Var.f115991b) * f11);
            if (f14 <= f10) {
                fValueOf = f14 + f13 < height ? Float.valueOf(height - f13) : null;
            }
            fFloatValue2 = fValueOf != null ? fValueOf.floatValue() : f14;
        } else {
            fFloatValue2 = f10;
        }
        this.f118462b.setScale(f11, f11);
        this.f118462b.postTranslate(fFloatValue, fFloatValue2);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(this.f118462b);
        uy2 uy2Var = this.f118461a;
        Context context = imageView.getContext();
        uy2Var.getClass();
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(bitmapCopy);
            Rect rect = this.f118464d;
            int i10 = sy2Var.f115990a;
            int i11 = sy2Var.f115991b;
            rect.set(i10, i11, sy2Var.f115992c + i10, sy2Var.f115993d + i11);
            canvas.drawRect(rect, this.f118463c);
            imageView.setImageBitmap(bitmapCopy);
        }
    }
}
