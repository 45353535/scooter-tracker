package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v0;
import kotlin.properties.e;
import kotlin.ranges.g;
import kotlin.reflect.KProperty;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001IB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0019\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010%\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0014¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.R+\u00105\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u00104R+\u0010<\u001a\u0002062\u0006\u0010/\u001a\u0002068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R+\u0010C\u001a\u00020=2\u0006\u0010/\u001a\u00020=8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00101\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/yandex/div/internal/widget/AspectImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/yandex/div/core/widget/AspectView;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "applyAspectRatio", "(II)V", "width", "height", "updateMatrix", "Landroid/widget/ImageView$ScaleType;", "scaleType", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "getBaseline", "()I", "onMeasure", "", "canResizeWidth", "(I)Z", "canResizeHeight", "invalidate", "()V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "oldWidth", "oldHeight", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "<set-?>", "gravity$delegate", "Lkotlin/properties/e;", "getGravity", "setGravity", "(I)V", "gravity", "", "aspectRatio$delegate", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "imageScale$delegate", "getImageScale", "()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "setImageScale", "(Lcom/yandex/div/internal/widget/AspectImageView$Scale;)V", "imageScale", "Landroid/graphics/Matrix;", "transformMatrix", "Landroid/graphics/Matrix;", "isMatrixInvalidated", "Z", RtspHeaders.SCALE, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AspectImageView extends AppCompatImageView implements AspectView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.f(new g0(AspectImageView.class, "gravity", "getGravity()I", 0)), v0.f(new g0(AspectImageView.class, "aspectRatio", "getAspectRatio()F", 0)), v0.f(new g0(AspectImageView.class, "imageScale", "getImageScale()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", 0))};

    /* JADX INFO: renamed from: aspectRatio$delegate, reason: from kotlin metadata */
    @NotNull
    private final e aspectRatio;

    /* JADX INFO: renamed from: gravity$delegate, reason: from kotlin metadata */
    @NotNull
    private final e gravity;

    /* JADX INFO: renamed from: imageScale$delegate, reason: from kotlin metadata */
    @NotNull
    private final e imageScale;
    private boolean isMatrixInvalidated;

    @NotNull
    private final Matrix transformMatrix;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "", "(Ljava/lang/String;I)V", "NO_SCALE", "FIT", "FILL", "STRETCH", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Scale {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.NO_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Scale.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Scale.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AspectImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.gravity = ViewsKt.appearanceAffecting$default(0, null, 2, null);
        this.aspectRatio = AspectView.INSTANCE.aspectRatioProperty$div_release();
        this.imageScale = ViewsKt.dimensionAffecting$default(Scale.NO_SCALE, null, 2, null);
        this.transformMatrix = new Matrix();
        this.isMatrixInvalidated = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    private final void applyAspectRatio(int widthMeasureSpec, int heightMeasureSpec) {
        float aspectRatio = getAspectRatio();
        if (aspectRatio == 0.0f) {
            return;
        }
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        boolean zCanResizeWidth = canResizeWidth(widthMeasureSpec);
        boolean zCanResizeHeight = canResizeHeight(heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!zCanResizeWidth && !zCanResizeHeight) {
            measuredHeight = zf.a.d(measuredWidth / aspectRatio);
        } else if (!zCanResizeWidth && zCanResizeHeight) {
            measuredHeight = zf.a.d(measuredWidth / aspectRatio);
        } else if (zCanResizeWidth && !zCanResizeHeight) {
            measuredWidth = zf.a.d(measuredHeight * aspectRatio);
        } else if (zCanResizeWidth && zCanResizeHeight) {
            measuredHeight = zf.a.d(measuredWidth / aspectRatio);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    private final void updateMatrix(int width, int height) {
        float fMin;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float fE = g.e((width - getPaddingLeft()) - getPaddingRight(), 0);
        float fE2 = g.e((height - getPaddingTop()) - getPaddingBottom(), 0);
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(getGravity(), ViewCompat.getLayoutDirection(this));
        Scale imageScale = getImageScale();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[imageScale.ordinal()];
        if (i10 == 1) {
            fMin = 1.0f;
        } else if (i10 == 2) {
            fMin = Math.min(fE / intrinsicWidth, fE2 / intrinsicHeight);
        } else if (i10 == 3) {
            fMin = Math.max(fE / intrinsicWidth, fE2 / intrinsicHeight);
        } else {
            if (i10 != 4) {
                throw new m();
            }
            fMin = fE / intrinsicWidth;
        }
        float f10 = iArr[getImageScale().ordinal()] == 4 ? fE2 / intrinsicHeight : fMin;
        int i11 = absoluteGravity & 7;
        float f11 = 0.0f;
        float f12 = i11 != 1 ? i11 != 5 ? 0.0f : fE - (intrinsicWidth * fMin) : (fE - (intrinsicWidth * fMin)) / 2;
        int i12 = absoluteGravity & 112;
        if (i12 == 16) {
            f11 = (fE2 - (intrinsicHeight * f10)) / 2;
        } else if (i12 == 80) {
            f11 = fE2 - (intrinsicHeight * f10);
        }
        Matrix matrix = this.transformMatrix;
        matrix.reset();
        matrix.postScale(fMin, f10);
        matrix.postTranslate(f12, f11);
        setImageMatrix(this.transformMatrix);
    }

    protected boolean canResizeHeight(int heightMeasureSpec) {
        return View.MeasureSpec.getMode(heightMeasureSpec) != 1073741824;
    }

    protected boolean canResizeWidth(int widthMeasureSpec) {
        return View.MeasureSpec.getMode(widthMeasureSpec) != 1073741824;
    }

    public final float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    @Override // android.widget.ImageView, android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    public final int getGravity() {
        return ((Number) this.gravity.getValue(this, $$delegatedProperties[0])).intValue();
    }

    @NotNull
    public final Scale getImageScale() {
        return (Scale) this.imageScale.getValue(this, $$delegatedProperties[2]);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.isMatrixInvalidated = true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        if ((getImageMatrix() == null || Intrinsics.areEqual(getImageMatrix(), this.transformMatrix)) && this.isMatrixInvalidated && getWidth() > 0 && getHeight() > 0) {
            updateMatrix(getWidth(), getHeight());
            this.isMatrixInvalidated = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.isMatrixInvalidated = true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        applyAspectRatio(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        this.isMatrixInvalidated = true;
    }

    @Override // com.yandex.div.core.widget.AspectView
    public final void setAspectRatio(float f10) {
        this.aspectRatio.setValue(this, $$delegatedProperties[1], Float.valueOf(f10));
    }

    public final void setGravity(int i10) {
        this.gravity.setValue(this, $$delegatedProperties[0], Integer.valueOf(i10));
    }

    public final void setImageScale(@NotNull Scale scale) {
        this.imageScale.setValue(this, $$delegatedProperties[2], scale);
    }

    @Override // android.widget.ImageView
    public void setScaleType(@Nullable ImageView.ScaleType scaleType) {
    }
}
