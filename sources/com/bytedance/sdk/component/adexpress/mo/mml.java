package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mml extends View {
    private float exu;
    private float fs;
    private List<Integer> jpc;
    private float lnr;
    private int mml;
    private int mo;
    private float mzz;
    private int qdl;
    private int rdp;
    private Paint rq;
    private Paint to;
    private List<Integer> tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16427ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private boolean f16428wd;

    public mml(Context context) {
        this(context, null);
    }

    private void lnr() {
        Paint paint = new Paint();
        this.to = paint;
        paint.setAntiAlias(true);
        this.to.setStrokeWidth(this.rdp);
        this.jpc.add(255);
        this.tvp.add(0);
        Paint paint2 = new Paint();
        this.rq = paint2;
        paint2.setAntiAlias(true);
        this.rq.setColor(Color.parseColor("#0FFFFFFF"));
        this.rq.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.to.setShader(new LinearGradient(this.fs, 0.0f, this.exu, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        int i10 = 0;
        while (true) {
            if (i10 >= this.jpc.size()) {
                break;
            }
            Integer num = this.jpc.get(i10);
            this.to.setAlpha(num.intValue());
            Integer num2 = this.tvp.get(i10);
            if (this.lnr + num2.intValue() < this.mzz) {
                canvas.drawCircle(this.fs, this.exu, this.lnr + num2.intValue(), this.to);
            }
            if (num.intValue() > 0 && num2.intValue() < this.mzz) {
                this.jpc.set(i10, Integer.valueOf(num.intValue() - this.mo > 0 ? num.intValue() - (this.mo * 3) : 1));
                this.tvp.set(i10, Integer.valueOf(num2.intValue() + this.mo));
            }
            i10++;
        }
        List<Integer> list = this.tvp;
        if (list.get(list.size() - 1).intValue() >= this.mzz / this.mml) {
            this.jpc.add(255);
            this.tvp.add(0);
        }
        if (this.tvp.size() >= 3) {
            this.tvp.remove(0);
            this.jpc.remove(0);
        }
        this.to.setAlpha(255);
        this.to.setColor(this.f16427ud);
        canvas.drawCircle(this.fs, this.exu, this.lnr, this.rq);
        if (this.f16428wd) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10 / 2.0f;
        this.fs = f10;
        this.exu = i11 / 2.0f;
        float f11 = f10 - (this.rdp / 2.0f);
        this.mzz = f11;
        this.lnr = f11 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            invalidate();
        }
    }

    public void qdl() {
        this.f16428wd = true;
        invalidate();
    }

    public void setColor(int i10) {
        this.qdl = i10;
    }

    public void setCoreColor(int i10) {
        this.f16427ud = i10;
    }

    public void setCoreRadius(int i10) {
        this.lnr = i10;
    }

    public void setDiffuseSpeed(int i10) {
        this.mo = i10;
    }

    public void setDiffuseWidth(int i10) {
        this.mml = i10;
    }

    public void setMaxWidth(int i10) {
        this.mzz = i10;
    }

    public void ud() {
        this.f16428wd = false;
        this.tvp.clear();
        this.jpc.clear();
        this.jpc.add(255);
        this.tvp.add(0);
        invalidate();
    }

    public mml(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public mml(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.qdl = -1;
        this.f16427ud = SupportMenu.CATEGORY_MASK;
        this.lnr = 18.0f;
        this.mml = 3;
        this.mzz = 50.0f;
        this.mo = 2;
        this.f16428wd = false;
        this.jpc = new ArrayList();
        this.tvp = new ArrayList();
        this.rdp = 24;
        lnr();
    }
}
