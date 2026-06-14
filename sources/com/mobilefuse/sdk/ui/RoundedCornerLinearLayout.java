package com.mobilefuse.sdk.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.mobilefuse.sdk.Utils;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/sdk/ui/RoundedCornerLinearLayout;", "Landroid/widget/LinearLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "cornerRadius", "", "(Landroid/content/Context;Landroid/util/AttributeSet;IF)V", "clipPath", "Landroid/graphics/Path;", "shadowPaint", "Landroid/graphics/Paint;", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "getPxFromDp", "value", "onSizeChanged", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "oldw", "oldh", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class RoundedCornerLinearLayout extends LinearLayout {
    private Path clipPath;
    private float cornerRadius;
    private final Context ctx;
    private final Paint shadowPaint;

    public RoundedCornerLinearLayout(@NotNull Context context) {
        this(context, null, 0, 0.0f, 14, null);
    }

    private final float getPxFromDp(int value) {
        return Utils.convertDpToPx(getContext(), value);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iSave = canvas.save();
        setLayerType(1, null);
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        canvas.save();
        canvas.translate(getPxFromDp(10), getPxFromDp(10));
        float f10 = this.cornerRadius;
        canvas.drawRoundRect(rectF, f10, f10, this.shadowPaint);
        canvas.restore();
        canvas.restore();
        canvas.clipPath(this.clipPath);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
        setLayerType(0, null);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        this.clipPath.reset();
        RectF rectF = new RectF(0.0f, 0.0f, w10, h10);
        Path path = this.clipPath;
        float f10 = this.cornerRadius;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        this.clipPath.close();
    }

    public RoundedCornerLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0.0f, 12, null);
    }

    public RoundedCornerLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0.0f, 8, null);
    }

    public /* synthetic */ RoundedCornerLinearLayout(Context context, AttributeSet attributeSet, int i10, float f10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? 0.0f : f10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerLinearLayout(@NotNull Context ctx, @Nullable AttributeSet attributeSet, int i10, float f10) {
        super(ctx, attributeSet, i10);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.cornerRadius = f10;
        this.clipPath = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setShadowLayer(getPxFromDp(8), getPxFromDp(4), getPxFromDp(4), Color.argb(100, 0, 0, 0));
        Unit unit = Unit.f93236a;
        this.shadowPaint = paint;
    }
}
