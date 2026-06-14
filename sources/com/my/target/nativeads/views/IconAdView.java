package com.my.target.nativeads.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.kb;
import com.my.target.ma;

/* JADX INFO: loaded from: classes11.dex */
public class IconAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma f60330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f60331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60332c;

    public IconAdView(@NonNull Context context) {
        this(context, null);
    }

    public final void a(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int childCount = getChildCount();
        if (size == 0 && size2 == 0) {
            setMeasuredDimension(0, 0);
        }
        this.f60330a.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int measuredWidth = this.f60330a.getMeasuredWidth();
        int measuredHeight = this.f60330a.getMeasuredHeight();
        if (mode2 != 1073741824) {
            size2 = measuredHeight;
        }
        if (mode != 1073741824) {
            size = measuredWidth;
        }
        if (childCount > 1) {
            for (int i12 = 1; i12 < childCount; i12++) {
                getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @NonNull
    public ImageView getImageView() {
        return this.f60330a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i15 = ((i12 - i10) - measuredWidth) / 2;
                    int i16 = ((i13 - i11) - measuredHeight) / 2;
                    childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13 = this.f60331b;
        if (i13 == 0 || (i12 = this.f60332c) == 0) {
            a(i10, i11);
        } else {
            a(i10, i11, i13 / i12);
        }
    }

    public void setPlaceHolderDimension(int i10, int i11) {
        this.f60331b = i10;
        this.f60332c = i11;
        this.f60330a.setPlaceholderDimensions(i10, i11);
    }

    public IconAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ma maVar = new ma(context);
        this.f60330a = maVar;
        kb.b(maVar, "nativeads_icon");
        addView(maVar);
    }

    public final void a(int i10, int i11, float f10) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int childCount = getChildCount();
        if (mode == 0 && mode2 == 0) {
            super.onMeasure(i10, i11);
            return;
        }
        if (mode == 0) {
            size = (int) (size2 * f10);
        } else if (mode2 == 0 || mode2 != 1073741824) {
            size2 = (int) (size / f10);
        }
        boolean z10 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i14 = Integer.MIN_VALUE;
                if (layoutParams != null) {
                    i12 = layoutParams.width == -1 ? 1073741824 : Integer.MIN_VALUE;
                    if (layoutParams.height == -1) {
                        i14 = 1073741824;
                    }
                } else {
                    i12 = Integer.MIN_VALUE;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i12), View.MeasureSpec.makeMeasureSpec(size2, i14));
                if (childAt.getMeasuredHeight() > 0) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }
}
