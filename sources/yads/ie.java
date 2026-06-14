package yads;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ie extends ImageSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f111970b;

    public ie(Drawable drawable) {
        super(drawable);
        this.f111969a = -1;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (this.f111969a != -1) {
            super.draw(canvas, charSequence, i10, i11, f10, i12, i13, i14, paint);
            return;
        }
        WeakReference weakReference = this.f111970b;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f111970b = new WeakReference(drawable);
        }
        canvas.save();
        canvas.translate(f10, zf.a.d(((i12 + i14) / 2.0f) - (drawable.getBounds().height() / 2.0f)));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        WeakReference weakReference = this.f111970b;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f111970b = new WeakReference(drawable);
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
