package net.pubnative.lite.sdk.views.shape;

import android.content.Context;
import android.util.AttributeSet;
import net.pubnative.lite.sdk.views.shape.shader.ShaderHelper;
import net.pubnative.lite.sdk.views.shape.shader.SvgShader;

/* JADX INFO: loaded from: classes3.dex */
public class ShapeImageView extends ShaderImageView {
    private SvgShader shader;

    public ShapeImageView(Context context) {
        super(context);
    }

    @Override // net.pubnative.lite.sdk.views.shape.ShaderImageView
    public ShaderHelper createImageViewHelper() {
        SvgShader svgShader = new SvgShader();
        this.shader = svgShader;
        return svgShader;
    }

    public void setBorderType(int i10) {
        SvgShader svgShader = this.shader;
        if (svgShader != null) {
            svgShader.setBorderType(i10);
            invalidate();
        }
    }

    public void setShapeResId(int i10) {
        SvgShader svgShader = this.shader;
        if (svgShader != null) {
            svgShader.setShapeResId(getContext(), i10);
            invalidate();
        }
    }

    public void setStrokeCap(int i10) {
        SvgShader svgShader = this.shader;
        if (svgShader != null) {
            svgShader.setStrokeCap(i10);
            invalidate();
        }
    }

    public void setStrokeJoin(int i10) {
        SvgShader svgShader = this.shader;
        if (svgShader != null) {
            svgShader.setStrokeJoin(i10);
            invalidate();
        }
    }

    public void setStrokeMiter(int i10) {
        SvgShader svgShader = this.shader;
        if (svgShader != null) {
            svgShader.setStrokeMiter(i10);
            invalidate();
        }
    }

    public ShapeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShapeImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
