package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class RoundRectImageViewC extends ComponentImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f47434c;

    public RoundRectImageViewC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47434c = new Paint();
    }

    private Bitmap a(Bitmap bitmap) {
        Bitmap bitmap2;
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap;
        }
        try {
            int width = getWidth();
            float height = getHeight() / bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.postScale(width / bitmap.getWidth(), height);
            bitmap2 = bitmap;
            try {
                return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (Exception e10) {
                e = e10;
                q0.b("MBRoundRectImageViewC", e.getMessage());
                return bitmap2;
            }
        } catch (Exception e11) {
            e = e11;
            bitmap2 = bitmap;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            Drawable drawable = getDrawable();
            if (drawable == null) {
                super.onDraw(canvas);
                return;
            }
            Bitmap bitmapA = a(((BitmapDrawable) drawable).getBitmap());
            if (bitmapA != null && !bitmapA.isRecycled()) {
                Bitmap bitmapA2 = a(bitmapA, 30);
                if (bitmapA2 != null && !bitmapA2.isRecycled()) {
                    Rect rect = new Rect(0, 0, bitmapA2.getWidth(), bitmapA2.getHeight());
                    this.f47434c.reset();
                    canvas.drawBitmap(bitmapA2, rect, rect, this.f47434c);
                    return;
                }
                super.onDraw(canvas);
                return;
            }
            super.onDraw(canvas);
        } catch (Exception e10) {
            q0.b("MBRoundRectImageViewC", e10.getMessage());
        }
    }

    private Bitmap a(Bitmap bitmap, int i10) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(bitmapShader);
                float f10 = i10;
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), f10, f10, paint);
                return bitmapCreateBitmap;
            } catch (Exception e10) {
                q0.b("MBRoundRectImageViewC", e10.getMessage());
            }
        }
        return bitmap;
    }
}
