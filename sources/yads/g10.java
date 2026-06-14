package yads;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class g10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f111021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f111022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f111023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f111024d;

    public /* synthetic */ g10(View view, float f10, float f11, float f12, float f13) {
        this(view, f10, f11, f12, f13, new RectF(), new Path());
    }

    public static float[] a(float f10, float f11, float f12, float f13) {
        if (f10 > 0.0f || f11 > 0.0f || f12 > 0.0f || f13 > 0.0f) {
            return new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
        }
        return null;
    }

    public final void a() {
        if (this.f111024d != null) {
            int measuredWidth = this.f111021a.getMeasuredWidth();
            int measuredHeight = this.f111021a.getMeasuredHeight();
            int paddingLeft = this.f111021a.getPaddingLeft();
            int paddingTop = this.f111021a.getPaddingTop();
            int paddingRight = measuredWidth - this.f111021a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f111021a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.f111022b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.f111023c.reset();
            this.f111023c.addRoundRect(this.f111022b, this.f111024d, Path.Direction.CW);
        }
    }

    public g10(View view, float f10, float f11, float f12, float f13, RectF rectF, Path path) {
        this.f111021a = view;
        this.f111022b = rectF;
        this.f111023c = path;
        this.f111024d = a(f10, f11, f12, f13);
    }
}
