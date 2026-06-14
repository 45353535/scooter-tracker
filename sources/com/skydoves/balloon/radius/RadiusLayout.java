package com.skydoves.balloon.radius;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Px;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.b;
import u5.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R+\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/skydoves/balloon/radius/RadiusLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attr", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Path;", "b", "Landroid/graphics/Path;", "path", "", "<set-?>", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lu5/b;", "getRadius", "()F", "setRadius", "(F)V", "radius", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RadiusLayout extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f63655d = {v0.f(new g0(RadiusLayout.class, "radius", "getRadius()F", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Path path;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b radius;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadiusLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
    }

    @Px
    public final float getRadius() {
        return ((Number) this.radius.getValue(this, f63655d[0])).floatValue();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        this.path.addRoundRect(new RectF(0.0f, 0.0f, w10, h10), getRadius(), getRadius(), Path.Direction.CW);
    }

    public final void setRadius(float f10) {
        this.radius.setValue(this, f63655d[0], Float.valueOf(f10));
    }

    public /* synthetic */ RadiusLayout(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadiusLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.path = new Path();
        this.radius = c.a(this, Float.valueOf(0.0f));
    }
}
