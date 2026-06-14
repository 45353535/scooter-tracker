package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class i0 extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f9025w = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f9026x = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f9027y = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f9028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f9029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Paint f9030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Paint f9031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f9032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f9033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f9034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f9036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f9037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f9038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f9039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f9040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f9041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f9042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f9043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f9044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f9045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f9046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f9047t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f9048u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f9049v;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f10) {
            return (f10 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f10) {
            return f10 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public i0(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.f9037j) * 360.0f;
    }

    protected void a() {
        this.f9038k = f9025w;
        this.f9034g = f9026x;
        this.f9033f = this.f9047t;
        setMax(100);
        setProgress(0);
        this.f9039l = this.f9046s;
        this.f9040m = 0;
        this.f9043p = this.f9048u;
        this.f9035h = f9027y;
    }

    protected void b() {
        TextPaint textPaint = new TextPaint();
        this.f9030c = textPaint;
        textPaint.setColor(this.f9034g);
        this.f9030c.setTextSize(this.f9033f);
        this.f9030c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f9031d = textPaint2;
        textPaint2.setColor(this.f9035h);
        this.f9031d.setTextSize(this.f9043p);
        this.f9031d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f9028a = paint;
        paint.setColor(this.f9038k);
        this.f9028a.setStyle(Paint.Style.STROKE);
        this.f9028a.setAntiAlias(true);
        this.f9028a.setStrokeWidth(this.f9039l);
        Paint paint2 = new Paint();
        this.f9029b = paint2;
        paint2.setColor(this.f9040m);
        this.f9029b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f9038k;
    }

    public float getFinishedStrokeWidth() {
        return this.f9039l;
    }

    public int getInnerBackgroundColor() {
        return this.f9040m;
    }

    public String getInnerBottomText() {
        return this.f9044q;
    }

    public int getInnerBottomTextColor() {
        return this.f9035h;
    }

    public float getInnerBottomTextSize() {
        return this.f9043p;
    }

    public int getMax() {
        return this.f9037j;
    }

    public String getPrefixText() {
        return this.f9041n;
    }

    public int getProgress() {
        return this.f9036i;
    }

    public String getSuffixText() {
        return this.f9042o;
    }

    public int getTextColor() {
        return this.f9034g;
    }

    public float getTextSize() {
        return this.f9033f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f9039l;
        this.f9032e.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float width = getWidth();
        float f11 = this.f9039l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f11) + f11) / 2.0f, this.f9029b);
        canvas.drawArc(this.f9032e, 270.0f, -getProgressAngle(), false, this.f9028a);
        String str = this.f9041n + this.f9036i + this.f9042o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f9030c.measureText(str)) / 2.0f, (getWidth() - (this.f9030c.descent() + this.f9030c.ascent())) / 2.0f, this.f9030c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f9031d.setTextSize(this.f9043p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f9031d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f9045r) - ((this.f9030c.descent() + this.f9030c.ascent()) / 2.0f), this.f9031d);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(i10), a(i11));
        this.f9045r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f9034g = bundle.getInt("text_color");
        this.f9033f = bundle.getFloat("text_size");
        this.f9043p = bundle.getFloat("inner_bottom_text_size");
        this.f9044q = bundle.getString("inner_bottom_text");
        this.f9035h = bundle.getInt("inner_bottom_text_color");
        this.f9038k = bundle.getInt("finished_stroke_color");
        this.f9039l = bundle.getFloat("finished_stroke_width");
        this.f9040m = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt("max"));
        setProgress(bundle.getInt("progress"));
        this.f9041n = bundle.getString("prefix");
        this.f9042o = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt("max", getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i10) {
        this.f9038k = i10;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f9039l = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i10) {
        this.f9040m = i10;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f9044q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i10) {
        this.f9035h = i10;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f9043p = f10;
        invalidate();
    }

    public void setMax(int i10) {
        if (i10 > 0) {
            this.f9037j = i10;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f9041n = str;
        invalidate();
    }

    public void setProgress(int i10) {
        this.f9036i = i10;
        if (i10 > getMax()) {
            this.f9036i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f9042o = str;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f9034g = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f9033f = f10;
        invalidate();
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9032e = new RectF();
        this.f9036i = 0;
        this.f9041n = "";
        this.f9042o = "";
        this.f9044q = "";
        this.f9047t = a.d(getResources(), 14.0f);
        this.f9049v = (int) a.c(getResources(), 100.0f);
        this.f9046s = a.c(getResources(), 4.0f);
        this.f9048u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int i11 = this.f9049v;
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }
}
