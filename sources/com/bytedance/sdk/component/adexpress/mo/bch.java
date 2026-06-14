package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;

/* JADX INFO: loaded from: classes6.dex */
public class bch extends FrameLayout {
    private float jpc;
    private float lnr;
    private float mml;
    private Drawable mo;
    private Drawable mzz;
    LinearLayout qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    LinearLayout f16408ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private double f16409wd;
    private static final int tvp = (com.bytedance.sdk.component.adexpress.dynamic.mzz.rq.ud("", 0.0f, true)[1] / 2) + 1;
    private static final int to = (com.bytedance.sdk.component.adexpress.dynamic.mzz.rq.ud("", 0.0f, true)[1] / 2) + 3;

    public bch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.qdl = new LinearLayout(getContext());
        this.f16408ud = new LinearLayout(getContext());
        this.qdl.setOrientation(0);
        this.qdl.setGravity(GravityCompat.START);
        this.f16408ud.setOrientation(0);
        this.f16408ud.setGravity(GravityCompat.START);
        this.mzz = com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_star_thick");
        this.mo = com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.lnr, (int) this.mml));
        imageView.setPadding(1, tvp, 1, to);
        return imageView;
    }

    public Drawable getStarEmptyDrawable() {
        return this.mzz;
    }

    public Drawable getStarFillDrawable() {
        return this.mo;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.qdl.measure(i10, i11);
        double d10 = this.f16409wd;
        float f10 = this.lnr;
        this.f16408ud.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((int) d10) * f10) + 1.0f)) + (((double) (f10 - 2.0f)) * (d10 - ((double) ((int) d10))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.qdl.getMeasuredHeight(), 1073741824));
        if (this.jpc > 0.0f) {
            this.qdl.setPadding(0, ((int) (r7.getMeasuredHeight() - this.jpc)) / 2, 0, 0);
            this.f16408ud.setPadding(0, ((int) (this.qdl.getMeasuredHeight() - this.jpc)) / 2, 0, 0);
        }
    }

    public void qdl(double d10, int i10, int i11, int i12) {
        float f10 = i11;
        this.lnr = (int) com.bytedance.sdk.component.adexpress.mml.wd.lnr(getContext(), f10);
        this.mml = (int) com.bytedance.sdk.component.adexpress.mml.wd.lnr(getContext(), f10);
        this.f16409wd = d10;
        this.jpc = i12;
        removeAllViews();
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f16408ud.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.qdl.addView(starImageView2);
        }
        addView(this.qdl);
        addView(this.f16408ud);
        requestLayout();
    }
}
