package net.pubnative.lite.sdk.views.shape;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import net.pubnative.lite.sdk.views.shape.shader.ShaderHelper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ShaderImageView extends ImageView {
    private static final boolean DEBUG = false;
    private ShaderHelper pathHelper;

    public ShaderImageView(Context context) {
        super(context);
        setup(context, null, 0);
    }

    private void setup(Context context, AttributeSet attributeSet, int i10) {
        getPathHelper().init(context, attributeSet, i10);
    }

    protected abstract ShaderHelper createImageViewHelper();

    public float getBorderAlpha() {
        return getPathHelper().getBorderAlpha();
    }

    public int getBorderWidth() {
        return getPathHelper().getBorderWidth();
    }

    protected ShaderHelper getPathHelper() {
        if (this.pathHelper == null) {
            this.pathHelper = createImageViewHelper();
        }
        return this.pathHelper;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getPathHelper().onDraw(canvas)) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (getPathHelper().isSquare()) {
            super.onMeasure(i10, i10);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        getPathHelper().onSizeChanged(i10, i11);
    }

    public void setBorderAlpha(float f10) {
        getPathHelper().setBorderAlpha(f10);
        invalidate();
    }

    public void setBorderColor(int i10) {
        getPathHelper().setBorderColor(i10);
        invalidate();
    }

    public void setBorderWidth(int i10) {
        getPathHelper().setBorderWidth(i10);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        getPathHelper().onImageDrawableReset(getDrawable());
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getPathHelper().onImageDrawableReset(getDrawable());
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        getPathHelper().onImageDrawableReset(getDrawable());
    }

    public void setSquare(boolean z10) {
        getPathHelper().setSquare(z10);
        invalidate();
    }

    public ShaderImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setup(context, attributeSet, 0);
    }

    public ShaderImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setup(context, attributeSet, i10);
    }
}
