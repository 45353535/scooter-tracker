package com.my.target.nativeads.views;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.kb;
import com.my.target.l7;
import com.my.target.ma;
import com.my.target.y2;

/* JADX INFO: loaded from: classes11.dex */
public class MediaAdView extends FrameLayout {
    public static final int COLOR_PLACEHOLDER_GRAY = -1118482;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma f60333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f60334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2 f60335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f60338f;

    public MediaAdView(@NonNull Context context) {
        super(context);
        this.f60333a = new ma(context);
        this.f60335c = new y2(context);
        this.f60334b = new ProgressBar(context, null, R.attr.progressBarStyle);
        a(context);
    }

    public final void a(Context context) {
        kb.b(this.f60333a, "media_image");
        kb.b(this.f60334b, "progress_bar");
        kb.b(this.f60335c, "play_button");
        setBackgroundColor(COLOR_PLACEHOLDER_GRAY);
        this.f60334b.setVisibility(8);
        Drawable indeterminateDrawable = this.f60334b.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setColorFilter(-16733198, PorterDuff.Mode.SRC_ATOP);
        }
        this.f60335c.a(l7.a(kb.e(context).b(80)), false);
        this.f60335c.setVisibility(8);
        addView(this.f60333a);
        addView(this.f60335c, new FrameLayout.LayoutParams(-2, -2));
        addView(this.f60334b, new FrameLayout.LayoutParams(-2, -2));
    }

    @NonNull
    public ImageView getImageView() {
        return this.f60333a;
    }

    public float getMediaAspectRatio() {
        return this.f60338f;
    }

    @NonNull
    public View getPlayButtonView() {
        return this.f60335c;
    }

    @NonNull
    public ProgressBar getProgressBarView() {
        return this.f60334b;
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
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i14 = this.f60336d;
        if (i14 == 0 || (i12 = this.f60337e) == 0) {
            if (mode != 1073741824) {
                size = 0;
            }
            if (mode2 != 1073741824) {
                size2 = 0;
            }
            setMeasuredDimension(size, size2);
            return;
        }
        float f10 = i14 / i12;
        if (mode == 0 && mode2 == 0) {
            super.onMeasure(i10, i11);
            return;
        }
        if (mode == 0) {
            size = (int) (size2 * f10);
        } else if (mode2 == 0 || mode2 != 1073741824) {
            size2 = (int) (size / f10);
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i16 = Integer.MIN_VALUE;
                if (layoutParams != null) {
                    i13 = layoutParams.width == -1 ? 1073741824 : Integer.MIN_VALUE;
                    if (layoutParams.height == -1) {
                        i16 = 1073741824;
                    }
                } else {
                    i13 = Integer.MIN_VALUE;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i13), View.MeasureSpec.makeMeasureSpec(size2, i16));
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

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f60335c.setOnClickListener(onClickListener);
    }

    public void setPlaceHolderDimension(int i10, int i11) {
        this.f60336d = i10;
        this.f60337e = i11;
        this.f60333a.setPlaceholderDimensions(i10, i11);
        float f10 = i11;
        this.f60338f = f10 != 0.0f ? i10 / f10 : 0.0f;
    }

    public MediaAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60333a = new ma(context);
        this.f60335c = new y2(context);
        this.f60334b = new ProgressBar(context, null, R.attr.progressBarStyle);
        a(context);
    }

    public MediaAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f60333a = new ma(context);
        this.f60335c = new y2(context);
        this.f60334b = new ProgressBar(context, null, R.attr.progressBarStyle);
        a(context);
    }
}
