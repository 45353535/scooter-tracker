package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes4.dex */
public final class dq extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf0 f110015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wh1 f110016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f110018d;

    public dq(Context context, wf0 wf0Var, wh1 wh1Var) {
        super(context);
        this.f110015a = wf0Var;
        this.f110016b = wh1Var;
        wf0Var.getClass();
        this.f110017c = wf0.a(context, 0.5f);
        this.f110018d = new Paint();
        a(context);
    }

    public final void a(Context context) {
        this.f110015a.getClass();
        int iA = wf0.a(context, 1.0f);
        this.f110018d.setStyle(Paint.Style.STROKE);
        this.f110018d.setStrokeWidth(iA);
        this.f110018d.setColor(SupportMenu.CATEGORY_MASK);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f110017c;
        canvas.drawRect(f10, f10, getWidth() - this.f110017c, getHeight() - this.f110017c, this.f110018d);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object parent = getParent();
        if (!(parent instanceof View)) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        View view = (View) parent;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        setLeft(0);
        setTop(0);
        setRight(measuredWidth);
        setBottom(measuredHeight);
        super.onLayout(z10, 0, 0, measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        vh1 vh1VarA = this.f110016b.a(i10, i11);
        super.onMeasure(vh1VarA.f117010a, vh1VarA.f117011b);
    }

    public final void setColor(int i10) {
        if (this.f110018d.getColor() != i10) {
            this.f110018d.setColor(i10);
            requestLayout();
        }
    }
}
