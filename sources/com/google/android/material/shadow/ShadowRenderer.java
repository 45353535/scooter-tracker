package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ShadowRenderer {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f27446i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f27447j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f27448k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f27449l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f27450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f27451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f27452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f27456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f27457h;

    public ShadowRenderer() {
        this(ViewCompat.MEASURED_STATE_MASK);
    }

    public void drawCornerShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f27456g;
        if (z10) {
            int[] iArr = f27448k;
            iArr[0] = 0;
            iArr[1] = this.f27455f;
            iArr[2] = this.f27454e;
            iArr[3] = this.f27453d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f27448k;
            iArr2[0] = 0;
            iArr2[1] = this.f27453d;
            iArr2[2] = this.f27454e;
            iArr2[3] = this.f27455f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f27449l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f27451b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f27448k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f27457h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f27451b);
        canvas.restore();
    }

    public void drawEdgeShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f27446i;
        iArr[0] = this.f27455f;
        iArr[1] = this.f27454e;
        iArr[2] = this.f27453d;
        Paint paint = this.f27452c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f27447j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f27452c);
        canvas.restore();
    }

    public void drawInnerCornerShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i10, float f10, float f11, @NonNull float[] fArr) {
        if (f11 > 0.0f) {
            f10 += f11;
            f11 = -f11;
        }
        float f12 = f10;
        float f13 = f11;
        drawCornerShadow(canvas, matrix, rectF, i10, f12, f13);
        Path path = this.f27456g;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f12, f13);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.f27457h);
        canvas.drawPath(path, this.f27450a);
        canvas.restore();
    }

    @NonNull
    public Paint getShadowPaint() {
        return this.f27450a;
    }

    public void setShadowColor(int i10) {
        this.f27453d = ColorUtils.setAlphaComponent(i10, 68);
        this.f27454e = ColorUtils.setAlphaComponent(i10, 20);
        this.f27455f = ColorUtils.setAlphaComponent(i10, 0);
        this.f27450a.setColor(this.f27453d);
    }

    public ShadowRenderer(int i10) {
        this.f27456g = new Path();
        Paint paint = new Paint();
        this.f27457h = paint;
        this.f27450a = new Paint();
        setShadowColor(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f27451b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f27452c = new Paint(paint2);
    }
}
