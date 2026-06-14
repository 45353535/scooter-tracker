package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class VerticalTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f102949a;

    public VerticalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f102949a = true;
        int gravity = getGravity();
        if (!Gravity.isVertical(gravity) || (gravity & 112) != 80) {
            this.f102949a = true;
        } else {
            setGravity((gravity & 7) | 48);
            this.f102949a = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        float f10;
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.drawableState = getDrawableState();
        canvas.save();
        if (this.f102949a) {
            canvas.translate(getWidth(), 0.0f);
            f10 = 90.0f;
        } else {
            canvas.translate(0.0f, getHeight());
            f10 = -90.0f;
        }
        canvas.rotate(f10);
        canvas.translate(getCompoundPaddingLeft(), getExtendedPaddingTop());
        getLayout().draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i11, i10);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }
}
