package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import com.yandex.div.internal.spannable.PositionAwareReplacementSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\u000256BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010$\u001a\u00020&2\u0006\u0010#\u001a\u00020&¢\u0006\u0004\b$\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R.\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00103\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/yandex/div/core/view2/spannable/ImageSpan;", "Lcom/yandex/div/internal/spannable/PositionAwareReplacementSpan;", "Landroid/graphics/drawable/Drawable;", "image", "", "width", "height", "lineHeight", "Lcom/yandex/div/core/view2/spannable/TextVerticalAlignment;", "alignment", "Lcom/yandex/div/core/view2/spannable/ImageSpan$Accessibility;", "accessibility", "<init>", "(Landroid/graphics/drawable/Drawable;IIILcom/yandex/div/core/view2/spannable/TextVerticalAlignment;Lcom/yandex/div/core/view2/spannable/ImageSpan$Accessibility;)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "adjustSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", "x", "top", "y", "bottom", "", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "Landroid/graphics/Rect;", "rect", "getBoundsInText", "(Landroid/graphics/Rect;)Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "(Landroid/graphics/RectF;)Landroid/graphics/RectF;", "I", "Lcom/yandex/div/core/view2/spannable/TextVerticalAlignment;", "Lcom/yandex/div/core/view2/spannable/ImageSpan$Accessibility;", "getAccessibility$div_release", "()Lcom/yandex/div/core/view2/spannable/ImageSpan$Accessibility;", "value", "Landroid/graphics/drawable/Drawable;", "getImage", "()Landroid/graphics/drawable/Drawable;", "setImage", "(Landroid/graphics/drawable/Drawable;)V", "boundsInText", "Landroid/graphics/RectF;", "Accessibility", "OnAccessibilityClickAction", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ImageSpan extends PositionAwareReplacementSpan {

    @Nullable
    private final Accessibility accessibility;

    @NotNull
    private final TextVerticalAlignment alignment;

    @NotNull
    private final RectF boundsInText = new RectF();
    private final int height;

    @Nullable
    private Drawable image;
    private final int lineHeight;
    private final int width;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/view2/spannable/ImageSpan$Accessibility;", "", "accessibilityType", "", "contentDescription", "onClickAction", "Lcom/yandex/div/core/view2/spannable/ImageSpan$OnAccessibilityClickAction;", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/div/core/view2/spannable/ImageSpan$OnAccessibilityClickAction;)V", "getAccessibilityType", "()Ljava/lang/String;", "getContentDescription", "getOnClickAction", "()Lcom/yandex/div/core/view2/spannable/ImageSpan$OnAccessibilityClickAction;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Accessibility {

        @Nullable
        private final String accessibilityType;

        @Nullable
        private final String contentDescription;

        @Nullable
        private final OnAccessibilityClickAction onClickAction;

        public Accessibility(@Nullable String str, @Nullable String str2, @Nullable OnAccessibilityClickAction onAccessibilityClickAction) {
            this.accessibilityType = str;
            this.contentDescription = str2;
            this.onClickAction = onAccessibilityClickAction;
        }

        @Nullable
        public final String getAccessibilityType() {
            return this.accessibilityType;
        }

        @Nullable
        public final String getContentDescription() {
            return this.contentDescription;
        }

        @Nullable
        public final OnAccessibilityClickAction getOnClickAction() {
            return this.onClickAction;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/spannable/ImageSpan$OnAccessibilityClickAction;", "", "perform", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OnAccessibilityClickAction {
        void perform();
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextVerticalAlignment.values().length];
            try {
                iArr[TextVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextVerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextVerticalAlignment.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextVerticalAlignment.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImageSpan(@Nullable Drawable drawable, @Px int i10, @Px int i11, @Px int i12, @NotNull TextVerticalAlignment textVerticalAlignment, @Nullable Accessibility accessibility) {
        this.width = i10;
        this.height = i11;
        this.lineHeight = i12;
        this.alignment = textVerticalAlignment;
        this.accessibility = accessibility;
        this.image = drawable;
    }

    @Override // com.yandex.div.internal.spannable.PositionAwareReplacementSpan
    public int adjustSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
        Rect bounds;
        Rect bounds2;
        if (fm == null || this.lineHeight > 0) {
            return this.width;
        }
        int iD = a.d(paint.ascent());
        int iD2 = a.d(paint.descent());
        Drawable drawable = this.image;
        int iHeight = (drawable == null || (bounds2 = drawable.getBounds()) == null) ? this.height : bounds2.height();
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i10 == 1) {
            iD2 = iD + iHeight;
        } else if (i10 == 2) {
            iD2 = ((iD + iD2) + iHeight) / 2;
        } else if (i10 == 3) {
            iD2 = 0;
        } else if (i10 != 4) {
            throw new m();
        }
        int i11 = iD2 - iHeight;
        int i12 = fm.top;
        int i13 = fm.ascent;
        int i14 = fm.bottom - fm.descent;
        fm.ascent = Math.min(i11, i13);
        int iMax = Math.max(iD2, fm.descent);
        fm.descent = iMax;
        fm.top = fm.ascent + (i12 - i13);
        fm.bottom = iMax + i14;
        Drawable drawable2 = this.image;
        return (drawable2 == null || (bounds = drawable2.getBounds()) == null) ? this.width : bounds.width();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x10, int top, int y10, int bottom, @NotNull Paint paint) {
        Drawable drawable = this.image;
        if (drawable == null) {
            return;
        }
        canvas.save();
        int iHeight = drawable.getBounds().height();
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i10 == 1) {
            y10 = top + iHeight;
        } else if (i10 == 2) {
            y10 = ((top + bottom) + iHeight) / 2;
        } else if (i10 != 3) {
            if (i10 != 4) {
                throw new m();
            }
            y10 = bottom;
        }
        float f10 = y10 - iHeight;
        this.boundsInText.set(drawable.getBounds());
        this.boundsInText.offset(x10, f10);
        canvas.translate(x10, f10);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Nullable
    /* JADX INFO: renamed from: getAccessibility$div_release, reason: from getter */
    public final Accessibility getAccessibility() {
        return this.accessibility;
    }

    @NotNull
    public final Rect getBoundsInText(@NotNull Rect rect) {
        rect.set(a.d(this.boundsInText.left), a.d(this.boundsInText.top), a.d(this.boundsInText.right), a.d(this.boundsInText.bottom));
        return rect;
    }

    public final void setImage(@Nullable Drawable drawable) {
        if (Intrinsics.areEqual(this.image, drawable)) {
            return;
        }
        this.image = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, this.width, this.height);
        }
        this.boundsInText.setEmpty();
    }

    @NotNull
    public final RectF getBoundsInText(@NotNull RectF rect) {
        rect.set(this.boundsInText);
        return rect;
    }
}
