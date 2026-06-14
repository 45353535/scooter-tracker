package com.yandex.div.internal.drawable;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0003HIJB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010F\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0016\u0010G\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010D¨\u0006K"}, d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "", "reset", "", "value", "setAlpha", "(I)V", "getOpacity", "()I", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/Picture;", "picture", "setPicture", "(Landroid/graphics/Picture;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;", "customScaleType", "Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;", "getCustomScaleType", "()Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;", "setCustomScaleType", "(Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;)V", "Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;", "alignmentHorizontal", "Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;", "getAlignmentHorizontal", "()Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;", "setAlignmentHorizontal", "(Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;)V", "Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;", "alignmentVertical", "Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;", "getAlignmentVertical", "()Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;", "setAlignmentVertical", "(Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;)V", "originalBitmap", "Landroid/graphics/Bitmap;", "originalPicture", "Landroid/graphics/Picture;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Matrix;", "thumbTransformMatrix", "Landroid/graphics/Matrix;", "", "isDirtyRect", "Z", "", "xScale", "F", "yScale", "xTranslate", "yTranslate", "AlignmentHorizontal", "AlignmentVertical", "ScaleType", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScalingDrawable extends Drawable {
    private boolean isDirtyRect;

    @Nullable
    private Bitmap originalBitmap;

    @Nullable
    private Picture originalPicture;
    private float xTranslate;
    private float yTranslate;

    @NotNull
    private ScaleType customScaleType = ScaleType.NO_SCALE;

    @NotNull
    private AlignmentHorizontal alignmentHorizontal = AlignmentHorizontal.LEFT;

    @NotNull
    private AlignmentVertical alignmentVertical = AlignmentVertical.TOP;

    @NotNull
    private final Paint paint = new Paint(3);

    @NotNull
    private Matrix thumbTransformMatrix = new Matrix();
    private float xScale = 1.0f;
    private float yScale = 1.0f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;", "", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum AlignmentHorizontal {
        LEFT,
        CENTER,
        RIGHT
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;", "", "(Ljava/lang/String;I)V", "TOP", "CENTER", "BOTTOM", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum AlignmentVertical {
        TOP,
        CENTER,
        BOTTOM
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;", "", "(Ljava/lang/String;I)V", "NO_SCALE", "FIT", "FILL", "STRETCH", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ScaleType {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.NO_SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlignmentHorizontal.values().length];
            try {
                iArr2[AlignmentHorizontal.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AlignmentHorizontal.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AlignmentVertical.values().length];
            try {
                iArr3[AlignmentVertical.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AlignmentVertical.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private final void reset() {
        this.isDirtyRect = true;
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(@org.jetbrains.annotations.NotNull android.graphics.Canvas r10) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.drawable.ScalingDrawable.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        super.onBoundsChange(bounds);
        reset();
    }

    public final void setAlignmentHorizontal(@NotNull AlignmentHorizontal alignmentHorizontal) {
        this.alignmentHorizontal = alignmentHorizontal;
    }

    public final void setAlignmentVertical(@NotNull AlignmentVertical alignmentVertical) {
        this.alignmentVertical = alignmentVertical;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int value) {
        this.paint.setAlpha(value);
        invalidateSelf();
    }

    public final void setBitmap(@NotNull Bitmap bitmap) {
        this.originalBitmap = bitmap;
        this.originalPicture = null;
        reset();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public final void setCustomScaleType(@NotNull ScaleType scaleType) {
        this.customScaleType = scaleType;
    }

    public final void setPicture(@NotNull Picture picture) {
        this.originalPicture = picture;
        this.originalBitmap = null;
        reset();
    }
}
