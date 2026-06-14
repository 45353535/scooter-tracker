package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class i extends ma {
    public static final int DEFAULT_HEIGHT = 20;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f59837g;

    public i(Context context) {
        this(context, null);
    }

    @Override // com.my.target.ma, android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f59837g >= 0) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setFixedHeight(int i10) {
        this.f59837g = i10;
    }

    @Override // com.my.target.ma, android.widget.ImageView
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        int paddingTop;
        int width;
        int i10 = this.f59837g;
        int height = 0;
        if (i10 >= 0) {
            paddingTop = (i10 - getPaddingTop()) - getPaddingBottom();
            if (paddingTop < 0) {
                paddingTop = 0;
            }
        } else {
            paddingTop = -1;
        }
        if (paddingTop >= 0) {
            if (bitmap != null) {
                width = bitmap.getWidth();
                height = bitmap.getHeight();
            } else {
                width = 0;
            }
            setMeasuredDimension(((int) (paddingTop * (height > 0 ? width / height : 0.0f))) + getPaddingLeft() + getPaddingRight(), this.f59837g);
        }
        super.setImageBitmap(bitmap);
    }

    @Override // com.my.target.ma, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        int paddingTop;
        int intrinsicWidth;
        int i10 = this.f59837g;
        int intrinsicHeight = 0;
        if (i10 >= 0) {
            paddingTop = (i10 - getPaddingTop()) - getPaddingBottom();
            if (paddingTop < 0) {
                paddingTop = 0;
            }
        } else {
            paddingTop = -1;
        }
        if (paddingTop >= 0) {
            if (drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
                intrinsicHeight = drawable.getIntrinsicHeight();
            } else {
                intrinsicWidth = 0;
            }
            setMeasuredDimension(((int) (paddingTop * (intrinsicHeight > 0 ? intrinsicWidth / intrinsicHeight : 0.0f))) + getPaddingLeft() + getPaddingRight(), this.f59837g);
        }
        super.setImageDrawable(drawable);
    }

    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f59837g = -1;
        this.f59837g = kb.a(20, context);
    }
}
