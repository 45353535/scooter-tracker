package com.bytedance.adsdk.ugeno.tvp.mzz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.adsdk.ugeno.mml;
import com.bytedance.adsdk.ugeno.wd.jpc;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends FrameLayout {
    private mml jpc;
    private double lnr;
    private float mml;
    private LinearLayout mo;
    private LinearLayout mzz;
    private float qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16244ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private Context f16245wd;

    public qdl(Context context) {
        super(context);
        this.f16245wd = context;
        this.mzz = new LinearLayout(context);
        this.mo = new LinearLayout(context);
        this.mzz.setOrientation(0);
        this.mzz.setGravity(GravityCompat.START);
        this.mo.setOrientation(0);
        this.mo.setGravity(GravityCompat.START);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.qdl, (int) this.f16244ud);
        float f10 = this.mml;
        layoutParams.leftMargin = (int) f10;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f10;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml mmlVar = this.jpc;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mml mmlVar = this.jpc;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mml mmlVar = this.jpc;
        if (mmlVar != null) {
            mmlVar.qdl(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        mml mmlVar = this.jpc;
        if (mmlVar != null) {
            mmlVar.qdl(i10, i11);
        }
        super.onMeasure(i10, i11);
        this.mzz.measure(i10, i11);
        double dFloor = Math.floor(this.lnr);
        float f10 = this.mml;
        float f11 = this.qdl;
        this.mo.measure(View.MeasureSpec.makeMeasureSpec((int) ((((double) (f10 + f10 + f11)) * dFloor) + ((double) f10) + ((this.lnr - dFloor) * ((double) f11))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.mzz.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        mml mmlVar = this.jpc;
        if (mmlVar != null) {
            mmlVar.ud(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void qdl(double d10, int i10, int i11, float f10, int i12) {
        removeAllViews();
        this.mzz.removeAllViews();
        this.mo.removeAllViews();
        this.qdl = (int) jpc.qdl(this.f16245wd, f10);
        this.f16244ud = (int) jpc.qdl(this.f16245wd, f10);
        this.lnr = d10;
        this.mml = i12;
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(com.bytedance.adsdk.ugeno.wd.mml.ud(this.f16245wd, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            this.mo.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(com.bytedance.adsdk.ugeno.wd.mml.ud(this.f16245wd, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i11);
            this.mzz.addView(starImageView2);
        }
        addView(this.mzz);
        addView(this.mo);
        requestLayout();
    }

    public void qdl(mml mmlVar) {
        this.jpc = mmlVar;
    }
}
