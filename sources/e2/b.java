package e2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends ProgressBar implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    h f68805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Paint f68806c;

    public b(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f68806c = paint;
        paint.setColor(0);
        a(context);
    }

    void a(Context context) {
        float f10 = getResources().getDisplayMetrics().density;
        int iK = g.k(context, 8.0f);
        setPadding(iK, iK, iK, iK);
        h hVar = new h(context);
        this.f68805b = hVar;
        hVar.q(f10 * 4.0f);
        this.f68805b.k(SupportMenu.CATEGORY_MASK);
        this.f68805b.h(Paint.Cap.ROUND);
        setIndeterminateDrawable(this.f68805b);
        setIndeterminate(true);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, this.f68806c);
        super.onDraw(canvas);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f68805b.e((Math.min((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - this.f68805b.a());
    }

    public void setColorSchemeColors(int... iArr) {
        this.f68805b.k(iArr);
    }

    public void setProgressBackgroundColor(int i10) {
        this.f68806c.setColor(i10);
    }

    @Override // e2.d
    public void setStyle(@NonNull e eVar) {
        this.f68805b.q(eVar.C(getContext()).floatValue());
        this.f68805b.k(eVar.B().intValue());
        this.f68806c.setColor(eVar.i().intValue());
        postInvalidate();
    }
}
