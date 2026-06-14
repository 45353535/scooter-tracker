package b9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends ProgressBar implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f5861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Paint f5862c;

    public c(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f5862c = paint;
        paint.setColor(0);
        a(context);
    }

    void a(Context context) {
        float f10 = getResources().getDisplayMetrics().density;
        int iP = u.p(context, 8.0f);
        setPadding(iP, iP, iP, iP);
        d dVar = new d(context);
        this.f5861b = dVar;
        dVar.q(f10 * 4.0f);
        this.f5861b.o(SupportMenu.CATEGORY_MASK);
        this.f5861b.p(Paint.Cap.ROUND);
        setIndeterminateDrawable(this.f5861b);
        setIndeterminate(true);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, this.f5862c);
        super.onDraw(canvas);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f5861b.n((Math.min((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - this.f5861b.m());
    }

    public void setColorSchemeColors(int... iArr) {
        this.f5861b.o(iArr);
    }

    public void setProgressBackgroundColor(int i10) {
        this.f5862c.setColor(i10);
    }

    @Override // b9.j
    public void setStyle(@NonNull k kVar) {
        this.f5861b.q(kVar.C(getContext()).floatValue());
        this.f5861b.o(kVar.B().intValue());
        this.f5862c.setColor(kVar.i().intValue());
        postInvalidate();
    }
}
