package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes6.dex */
public class jtx extends View {
    private int lnr;
    private Drawable mml;
    private float mo;
    private Drawable mzz;
    private final Path qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final boolean f17563ud;

    public jtx(Context context) {
        this(context, false);
    }

    private void qdl() {
        Context context = getContext();
        this.mml = ljh.lnr(context, this.f17563ud ? "tt_star_thick_dark" : "tt_star_thick");
        this.mzz = ljh.lnr(context, "tt_star");
    }

    private void ud() {
        int width = getWidth();
        int height = getHeight();
        if (this.mo <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.qdl.reset();
        this.qdl.addRect(new RectF(0.0f, 0.0f, width * this.mo, height), Path.Direction.CCW);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.lnr <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i10 = 0; i10 < 5; i10++) {
            this.mml.draw(canvas);
            canvas.translate(this.lnr, 0.0f);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.qdl);
        for (int i11 = 0; i11 < 5; i11++) {
            this.mzz.draw(canvas);
            canvas.translate(this.lnr, 0.0f);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.lnr * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.lnr, 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ud();
    }

    public jtx(Context context, boolean z10) {
        super(context);
        this.qdl = new Path();
        this.f17563ud = z10;
        qdl();
    }

    public void qdl(double d10, int i10) {
        int iQdl = (int) ax.qdl(getContext(), i10, false);
        this.lnr = iQdl;
        this.mml.setBounds(0, 0, iQdl, iQdl);
        Drawable drawable = this.mzz;
        int i11 = this.lnr;
        drawable.setBounds(0, 0, i11, i11);
        this.mo = ((float) d10) / 5.0f;
        ud();
        requestLayout();
    }
}
