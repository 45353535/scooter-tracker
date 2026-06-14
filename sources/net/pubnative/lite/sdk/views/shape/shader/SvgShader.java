package net.pubnative.lite.sdk.views.shape.shader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import net.pubnative.lite.sdk.R;
import net.pubnative.lite.sdk.views.shape.SvgUtil;
import net.pubnative.lite.sdk.views.shape.path.parser.PathInfo;

/* JADX INFO: loaded from: classes3.dex */
public class SvgShader extends ShaderHelper {
    public static final int BORDER_TYPE_DEFAULT = 0;
    public static final int BORDER_TYPE_FILL = 1;
    public static final int STROKE_CAP_BUTT = 0;
    public static final int STROKE_CAP_DEFAULT = -1;
    public static final int STROKE_CAP_ROUND = 1;
    public static final int STROKE_CAP_SQUARE = 2;
    public static final int STROKE_JOIN_BEVEL = 0;
    public static final int STROKE_JOIN_DEFAULT = -1;
    public static final int STROKE_JOIN_MITER = 1;
    public static final int STROKE_JOIN_ROUND = 2;
    private final Path borderPath;
    private int borderType;
    private final Path path;
    private final float[] pathDimensions;
    private final Matrix pathMatrix;
    private int resId;
    private PathInfo shapePath;
    private int strokeCap;
    private int strokeJoin;
    private int strokeMiter;

    public SvgShader() {
        this.path = new Path();
        this.borderPath = new Path();
        this.pathMatrix = new Matrix();
        this.pathDimensions = new float[2];
        this.resId = -1;
        this.borderType = 0;
        this.strokeCap = -1;
        this.strokeJoin = -1;
        this.strokeMiter = 0;
    }

    @Override // net.pubnative.lite.sdk.views.shape.shader.ShaderHelper
    public void calculate(int i10, int i11, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        this.path.reset();
        this.borderPath.reset();
        this.pathDimensions[0] = this.shapePath.getWidth();
        this.pathDimensions[1] = this.shapePath.getHeight();
        this.pathMatrix.reset();
        float[] fArr = this.pathDimensions;
        float fMin = Math.min(f10 / fArr[0], f11 / fArr[1]);
        float fRound = Math.round((f10 - (this.pathDimensions[0] * fMin)) * 0.5f);
        float fRound2 = Math.round((f11 - (this.pathDimensions[1] * fMin)) * 0.5f);
        this.pathMatrix.setScale(fMin, fMin);
        this.pathMatrix.postTranslate(fRound, fRound2);
        this.shapePath.transform(this.pathMatrix, this.path);
        Path path = this.path;
        float f18 = this.borderWidth;
        path.offset(f18, f18);
        if (this.borderWidth > 0) {
            this.pathMatrix.reset();
            if (this.borderType == 0) {
                int i12 = this.viewWidth;
                int i13 = this.borderWidth;
                f15 = i12 - i13;
                f16 = this.viewHeight - i13;
                f17 = i13 / 2.0f;
            } else {
                f15 = this.viewWidth;
                f16 = this.viewHeight;
                f17 = 0.0f;
            }
            float[] fArr2 = this.pathDimensions;
            float fMin2 = Math.min(f15 / fArr2[0], f16 / fArr2[1]);
            float fRound3 = Math.round(((f15 - (this.pathDimensions[0] * fMin2)) * 0.5f) + f17);
            float fRound4 = Math.round(((f16 - (this.pathDimensions[1] * fMin2)) * 0.5f) + f17);
            this.pathMatrix.setScale(fMin2, fMin2);
            this.pathMatrix.postTranslate(fRound3, fRound4);
            this.shapePath.transform(this.pathMatrix, this.borderPath);
        }
        this.pathMatrix.reset();
        this.matrix.invert(this.pathMatrix);
        this.path.transform(this.pathMatrix);
    }

    @Override // net.pubnative.lite.sdk.views.shape.shader.ShaderHelper
    public void draw(Canvas canvas, Paint paint, Paint paint2) {
        canvas.save();
        canvas.drawPath(this.borderPath, paint2);
        canvas.concat(this.matrix);
        canvas.drawPath(this.path, paint);
        canvas.restore();
    }

    @Override // net.pubnative.lite.sdk.views.shape.shader.ShaderHelper
    public void init(Context context, AttributeSet attributeSet, int i10) {
        super.init(context, attributeSet, i10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ShaderImageView, i10, 0);
            this.resId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ShaderImageView_siShape, this.resId);
            this.borderType = typedArrayObtainStyledAttributes.getInt(R.styleable.ShaderImageView_siBorderType, this.borderType);
            this.strokeCap = typedArrayObtainStyledAttributes.getInt(R.styleable.ShaderImageView_siStrokeCap, this.strokeCap);
            this.strokeJoin = typedArrayObtainStyledAttributes.getInt(R.styleable.ShaderImageView_siStrokeJoin, this.strokeJoin);
            this.strokeMiter = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShaderImageView_siStrokeMiter, this.strokeMiter);
            typedArrayObtainStyledAttributes.recycle();
        }
        setShapeResId(context, this.resId);
        setBorderType(this.borderType);
        setStrokeCap(this.strokeCap);
        setStrokeJoin(this.strokeJoin);
        setStrokeMiter(this.strokeMiter);
    }

    @Override // net.pubnative.lite.sdk.views.shape.shader.ShaderHelper
    public void reset() {
        this.path.reset();
        this.borderPath.reset();
    }

    public void setBorderType(int i10) {
        this.borderType = i10;
        if (i10 != 1) {
            this.borderPaint.setStyle(Paint.Style.STROKE);
        } else {
            this.borderPaint.setStyle(Paint.Style.FILL);
        }
    }

    public void setShapeResId(Context context, int i10) {
        if (i10 == -1) {
            throw new RuntimeException("No resource is defined as shape");
        }
        this.shapePath = SvgUtil.readSvg(context, i10);
    }

    public void setStrokeCap(int i10) {
        this.strokeCap = i10;
        if (i10 == 0) {
            this.borderPaint.setStrokeCap(Paint.Cap.BUTT);
        } else if (i10 == 1) {
            this.borderPaint.setStrokeCap(Paint.Cap.ROUND);
        } else {
            if (i10 != 2) {
                return;
            }
            this.borderPaint.setStrokeCap(Paint.Cap.SQUARE);
        }
    }

    public void setStrokeJoin(int i10) {
        this.strokeJoin = i10;
        if (i10 == 0) {
            this.borderPaint.setStrokeJoin(Paint.Join.BEVEL);
        } else if (i10 == 1) {
            this.borderPaint.setStrokeJoin(Paint.Join.MITER);
        } else {
            if (i10 != 2) {
                return;
            }
            this.borderPaint.setStrokeJoin(Paint.Join.ROUND);
        }
    }

    public void setStrokeMiter(int i10) {
        this.strokeMiter = i10;
        if (i10 > 0) {
            this.borderPaint.setStrokeMiter(i10);
        }
    }

    public SvgShader(int i10) {
        this.path = new Path();
        this.borderPath = new Path();
        this.pathMatrix = new Matrix();
        this.pathDimensions = new float[2];
        this.borderType = 0;
        this.strokeCap = -1;
        this.strokeJoin = -1;
        this.strokeMiter = 0;
        this.resId = i10;
    }

    public SvgShader(int i10, int i11) {
        this.path = new Path();
        this.borderPath = new Path();
        this.pathMatrix = new Matrix();
        this.pathDimensions = new float[2];
        this.strokeCap = -1;
        this.strokeJoin = -1;
        this.strokeMiter = 0;
        this.resId = i10;
        this.borderType = i11;
    }
}
