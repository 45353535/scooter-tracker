package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;

/* JADX INFO: loaded from: classes11.dex */
public class ma extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f60144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f60145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f60149f;

    public ma(Context context) {
        super(context);
        a();
    }

    public final void a() {
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setAdjustViewBounds(true);
    }

    public boolean hasImage() {
        return (this.f60144a == null && this.f60145b == null) ? false : true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int intrinsicHeight = this.f60146c;
        if (intrinsicHeight == 0 || (intrinsicWidth = this.f60147d) == 0) {
            Bitmap bitmap = this.f60144a;
            if (bitmap != null) {
                intrinsicWidth = bitmap.getWidth();
                intrinsicHeight = this.f60144a.getHeight();
            } else {
                Drawable drawable = this.f60145b;
                if (drawable == null) {
                    setMeasuredDimension(0, 0);
                    return;
                } else {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                    intrinsicHeight = this.f60145b.getIntrinsicHeight();
                }
            }
        }
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            super.onMeasure(i10, i11);
            return;
        }
        float f10 = intrinsicWidth;
        float f11 = intrinsicHeight;
        float f12 = f10 / f11;
        int i12 = this.f60149f;
        if (i12 > 0) {
            size2 = Math.min(i12, size2);
        }
        int i13 = this.f60148e;
        if (i13 > 0) {
            size = Math.min(i13, size);
        }
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (mode != 0 || mode2 != 0) {
            if (mode == 0) {
                intrinsicWidth = (int) (size2 * f12);
            } else {
                if (mode2 == 0) {
                    intrinsicHeight = (int) (size / f12);
                } else {
                    float f13 = size;
                    float f14 = f13 / f10;
                    float f15 = size2;
                    if (Math.min(f14, f15 / f11) != f14 || f12 <= 0.0f) {
                        intrinsicWidth = (int) (f15 * f12);
                    } else {
                        intrinsicHeight = (int) (f13 / f12);
                    }
                }
                intrinsicWidth = size;
            }
            intrinsicHeight = size2;
        }
        setMeasuredDimension(intrinsicWidth, intrinsicHeight);
    }

    public void setImageBitmap(@Nullable Bitmap bitmap, boolean z10) {
        if (!z10) {
            setImageBitmap(bitmap);
            return;
        }
        setAlpha(0.0f);
        setImageBitmap(bitmap);
        animate().alpha(1.0f).setDuration(300L);
    }

    public void setImageData(@Nullable ImageData imageData) {
        if (imageData == null) {
            this.f60146c = 0;
            this.f60147d = 0;
            setImageBitmap(null);
        } else {
            this.f60146c = imageData.getHeight();
            this.f60147d = imageData.getWidth();
            setImageBitmap(imageData.getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        this.f60145b = drawable;
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i10) {
        this.f60149f = i10;
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i10) {
        this.f60148e = i10;
    }

    public void setPlaceholderDimensions(int i10, int i11) {
        this.f60147d = i10;
        this.f60146c = i11;
    }

    public ma(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        this.f60144a = bitmap;
        super.setImageBitmap(bitmap);
    }
}
