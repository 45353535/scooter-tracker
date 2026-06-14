package com.bytedance.adsdk.ugeno.tvp.mo;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.mml;
import com.bytedance.adsdk.ugeno.qdl.jpc;
import com.bytedance.adsdk.ugeno.qdl.wd;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends TextView implements IAnimation, wd {
    private jpc lnr;
    private float mml;
    private float mo;
    private float mzz;
    private mml qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16237ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private float f16238wd;

    public qdl(Context context) {
        super(context);
        this.mml = -1.0f;
        this.mo = 1.0f;
        this.f16238wd = 0.0f;
        this.lnr = new jpc(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.ud(canvas);
        }
    }

    public float getBorderRadius() {
        return this.lnr.qdl();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.qdl.wd
    public float getRipple() {
        return this.f16237ud;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getRubIn() {
        return this.lnr.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getShine() {
        return this.lnr.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getStretch() {
        return this.lnr.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.qdl(canvas, this);
            this.qdl.qdl(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.qdl(i10, i11, i12, i13);
        }
        if (z10 && this.mml > 0.0f) {
            qdl(((i12 - i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i13 - i11) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        mml mmlVar = this.qdl;
        if (mmlVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrQdl = mmlVar.qdl(i10, i11);
            super.onMeasure(iArrQdl[0], iArrQdl[1]);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.ud(i10, i11, i12, i12);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void qdl(mml mmlVar) {
        this.qdl = mmlVar;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.lnr.qdl(i10);
    }

    public void setBorderRadius(float f10) {
        jpc jpcVar = this.lnr;
        if (jpcVar != null) {
            jpcVar.qdl(f10);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.mo = f11;
        this.f16238wd = f10;
    }

    public void setMinTextSize(float f10) {
        this.mml = f10;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.f16237ud = f10;
        jpc jpcVar = this.lnr;
        if (jpcVar != null) {
            jpcVar.ud(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        jpc jpcVar = this.lnr;
        if (jpcVar != null) {
            jpcVar.mzz(f10);
        }
    }

    public void setShine(float f10) {
        jpc jpcVar = this.lnr;
        if (jpcVar != null) {
            jpcVar.lnr(f10);
        }
    }

    public void setStretch(float f10) {
        jpc jpcVar = this.lnr;
        if (jpcVar != null) {
            jpcVar.mml(f10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        super.setTextSize(f10);
        this.mzz = getTextSize();
    }

    private void qdl(int i10, int i11) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i11 <= 0 || i10 <= 0 || this.mzz == 0.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float fMax = this.mzz;
        int iQdl = qdl(text, paint, i10, fMax);
        while (iQdl > i11 && fMax > this.mml) {
            Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.mml);
            fMax = Math.max(fMax - 1.0f, this.mml);
            iQdl = qdl(text, paint, i10, fMax);
        }
        Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
        setTextSize(0, fMax);
        setLineSpacing(this.f16238wd, this.mo);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.mzz = getTextSize();
    }

    private int qdl(CharSequence charSequence, TextPaint textPaint, int i10, float f10) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f10);
        return new StaticLayout(charSequence, textPaint2, i10, Layout.Alignment.ALIGN_NORMAL, this.mo, this.f16238wd, true).getHeight();
    }
}
