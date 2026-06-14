package com.ktwapps.speedometer.Widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public class ColorOptionView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f46203d;

    public ColorOptionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46201b = SupportMenu.CATEGORY_MASK;
        this.f46202c = false;
        this.f46203d = new Paint(1);
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        setClickable(true);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.T);
            this.f46201b = typedArrayObtainStyledAttributes.getColor(1, SupportMenu.CATEGORY_MASK);
            this.f46202c = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int getColor() {
        return this.f46201b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fMin = Math.min(getWidth(), getHeight()) / 2.0f;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        if (!this.f46202c) {
            this.f46203d.setStyle(Paint.Style.FILL);
            this.f46203d.setColor(this.f46201b);
            canvas.drawCircle(width, height, fMin, this.f46203d);
            return;
        }
        this.f46203d.setStyle(Paint.Style.STROKE);
        this.f46203d.setStrokeWidth(0.15f * fMin);
        this.f46203d.setColor(this.f46201b);
        canvas.drawCircle(width, height, fMin - (this.f46203d.getStrokeWidth() / 2.0f), this.f46203d);
        this.f46203d.setStyle(Paint.Style.FILL);
        this.f46203d.setColor(this.f46201b);
        canvas.drawCircle(width, height, fMin * 0.7f, this.f46203d);
    }

    public void setChecked(boolean z10) {
        this.f46202c = z10;
        invalidate();
    }

    public void setColor(int i10) {
        this.f46201b = i10;
        invalidate();
    }
}
