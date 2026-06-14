package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.core.content.ContextCompat;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.internal.Assert;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0013J/\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0014¢\u0006\u0004\b#\u0010\u001aJ\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R*\u00102\u001a\u00020.2\u0006\u00101\u001a\u00020.8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00100\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00106\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010\u0013R2\u0010;\u001a\u00020\u00062\b\b\u0001\u0010;\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b;\u00107\u0012\u0004\b>\u0010\f\u001a\u0004\b<\u00109\"\u0004\b=\u0010\u0013R\u0014\u0010?\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u00103R$\u0010C\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u00109\"\u0004\bB\u0010\u0013¨\u0006D"}, d2 = {"Lcom/yandex/div/internal/widget/SeparatorView;", "Landroid/view/View;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "updateDividerRect", "()V", "size", "measureSpec", "calcSize", "(II)I", "resId", "setDividerColorResource", "(I)V", "setDividerHeightResource", "left", "top", "right", "bottom", "setPadding", "(IIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "width", "height", "oldWidth", "oldHeight", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "dividerPaint", "Landroid/graphics/Paint;", "Landroid/graphics/Rect;", "dividerRect", "Landroid/graphics/Rect;", "", "isDividerRectChanged", "Z", "value", "isHorizontal", "()Z", "setHorizontal", "(Z)V", "dividerThickness", "I", "getDividerThickness", "()I", "setDividerThickness", "dividerGravity", "getDividerGravity", "setDividerGravity", "getDividerGravity$annotations", "isDividerVisible", "color", "getDividerColor", "setDividerColor", "dividerColor", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SeparatorView extends View {
    private int dividerGravity;

    @NotNull
    private final Paint dividerPaint;

    @NotNull
    private final Rect dividerRect;
    private int dividerThickness;
    private boolean isDividerRectChanged;
    private boolean isHorizontal;

    public SeparatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Paint paint = new Paint();
        paint.setColor(0);
        this.dividerPaint = paint;
        this.dividerRect = new Rect();
        this.isHorizontal = true;
        this.dividerGravity = 17;
    }

    private final int calcSize(int size, int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size2 = View.MeasureSpec.getSize(measureSpec);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? size : size2 : Math.min(size, size2);
    }

    public static /* synthetic */ void getDividerGravity$annotations() {
    }

    private final boolean isDividerVisible() {
        return Color.alpha(this.dividerPaint.getColor()) > 0;
    }

    private final void updateDividerRect() {
        if (this.isDividerRectChanged) {
            int paddingTop = this.isHorizontal ? getPaddingTop() : getPaddingLeft();
            int paddingBottom = this.isHorizontal ? getPaddingBottom() : getPaddingRight();
            int height = this.isHorizontal ? getHeight() : getWidth();
            int i10 = (height - paddingTop) - paddingBottom;
            int i11 = this.dividerGravity;
            if (i11 == 17) {
                paddingTop += (i10 - this.dividerThickness) / 2;
            } else if (i11 != 8388611) {
                if (i11 != 8388613) {
                    Assert.fail("Unknown divider gravity value");
                    paddingTop = 0;
                } else {
                    paddingTop = (height - paddingBottom) - this.dividerThickness;
                }
            }
            if (this.isHorizontal) {
                Rect rect = this.dividerRect;
                rect.top = paddingTop;
                rect.bottom = paddingTop + Math.min(i10, this.dividerThickness);
                this.dividerRect.left = getPaddingLeft();
                this.dividerRect.right = getWidth() - getPaddingRight();
            } else {
                Rect rect2 = this.dividerRect;
                rect2.left = paddingTop;
                rect2.right = paddingTop + Math.min(i10, this.dividerThickness);
                this.dividerRect.top = getPaddingTop();
                this.dividerRect.bottom = getHeight() - getPaddingBottom();
            }
            this.isDividerRectChanged = false;
        }
    }

    public final int getDividerColor() {
        return this.dividerPaint.getColor();
    }

    public final int getDividerGravity() {
        return this.dividerGravity;
    }

    public final int getDividerThickness() {
        return this.dividerThickness;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (isDividerVisible()) {
            updateDividerRect();
            canvas.drawRect(this.dividerRect, this.dividerPaint);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.isHorizontal) {
            paddingTop += this.dividerThickness;
        } else {
            paddingLeft += this.dividerThickness;
        }
        setMeasuredDimension(calcSize(Math.max(paddingLeft, getSuggestedMinimumWidth()), widthMeasureSpec), calcSize(Math.max(paddingTop, getSuggestedMinimumHeight()), heightMeasureSpec));
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        this.isDividerRectChanged = true;
    }

    public final void setDividerColor(int i10) {
        if (this.dividerPaint.getColor() != i10) {
            this.dividerPaint.setColor(i10);
            invalidate();
        }
    }

    public final void setDividerColorResource(@ColorRes int resId) {
        setDividerColor(ContextCompat.getColor(getContext(), resId));
    }

    public final void setDividerGravity(int i10) {
        if (this.dividerGravity != i10) {
            this.dividerGravity = i10;
            this.isDividerRectChanged = true;
            invalidate();
        }
    }

    public final void setDividerHeightResource(@DimenRes int resId) {
        setDividerThickness(getResources().getDimensionPixelSize(resId));
    }

    public final void setDividerThickness(int i10) {
        if (this.dividerThickness != i10) {
            this.dividerThickness = i10;
            this.isDividerRectChanged = true;
            requestLayout();
        }
    }

    public final void setHorizontal(boolean z10) {
        if (this.isHorizontal != z10) {
            this.isHorizontal = z10;
            this.isDividerRectChanged = true;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(left, top, right, bottom);
        this.isDividerRectChanged = true;
    }
}
