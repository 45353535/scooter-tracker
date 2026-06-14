package com.bytedance.adsdk.ugeno.qdl;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class jpc implements wd {
    private float lnr;
    private float mml;
    private float mo;
    private float mzz;
    private View qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16214ud;

    public jpc(View view) {
        this.qdl = view;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getRipple() {
        return this.lnr;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getRubIn() {
        return this.mo;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getShine() {
        return this.mml;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getStretch() {
        return this.mzz;
    }

    public void lnr(float f10) {
        View view = this.qdl;
        if (view == null) {
            return;
        }
        this.mml = f10;
        view.postInvalidate();
    }

    public void mml(float f10) {
        this.mzz = f10;
        this.qdl.postInvalidate();
    }

    public void mzz(float f10) {
        this.mo = f10;
        this.qdl.postInvalidate();
    }

    public void qdl(float f10) {
        View view = this.qdl;
        if (view == null) {
            return;
        }
        this.f16214ud = f10;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f10);
        }
    }

    public void ud(float f10) {
        View view = this.qdl;
        if (view == null) {
            return;
        }
        this.lnr = f10;
        view.postInvalidate();
    }

    public float qdl() {
        return this.f16214ud;
    }

    public void qdl(int i10) {
        View view = this.qdl;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i10);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i10);
        }
    }
}
