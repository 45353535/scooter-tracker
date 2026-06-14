package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u001a\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006B(\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u0018\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0010J\u0019\u0010\u001a\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0010J\u0019\u0010\u001c\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0010J\u0019\u0010\u001e\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0010J>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R'\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R'\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R'\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R'\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/unit/DpRect;", "", "origin", "Landroidx/compose/ui/unit/DpOffset;", "size", "Landroidx/compose/ui/unit/DpSize;", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "left", "Landroidx/compose/ui/unit/Dp;", "top", "right", "bottom", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM$annotations", "()V", "getBottom-D9Ej5fM", "()F", "F", "getLeft-D9Ej5fM$annotations", "getLeft-D9Ej5fM", "getRight-D9Ej5fM$annotations", "getRight-D9Ej5fM", "getTop-D9Ej5fM$annotations", "getTop-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", MenuActionType.COPY, "copy-a9UjIt4", "(FFFF)Landroidx/compose/ui/unit/DpRect;", "equals", "", "other", "hashCode", "", "toString", "", y.f66058y, "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DpRect {
    public static final int $stable = 0;
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public /* synthetic */ DpRect(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpRect m4023copya9UjIt4$default(DpRect dpRect, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = dpRect.left;
        }
        if ((i10 & 2) != 0) {
            f11 = dpRect.top;
        }
        if ((i10 & 4) != 0) {
            f12 = dpRect.right;
        }
        if ((i10 & 8) != 0) {
            f13 = dpRect.bottom;
        }
        return dpRect.m4032copya9UjIt4(f10, f11, f12, f13);
    }

    @Stable
    /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4024getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4025getLeftD9Ej5fM$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4026getRightD9Ej5fM$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4027getTopD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottom() {
        return this.bottom;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-a9UjIt4, reason: not valid java name */
    public final DpRect m4032copya9UjIt4(float left, float top, float right, float bottom) {
        return new DpRect(left, top, right, bottom, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) other;
        return Dp.m3956equalsimpl0(this.left, dpRect.left) && Dp.m3956equalsimpl0(this.top, dpRect.top) && Dp.m3956equalsimpl0(this.right, dpRect.right) && Dp.m3956equalsimpl0(this.bottom, dpRect.bottom);
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m4033getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m4034getLeftD9Ej5fM() {
        return this.left;
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m4035getRightD9Ej5fM() {
        return this.right;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m4036getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((Dp.m3957hashCodeimpl(this.left) * 31) + Dp.m3957hashCodeimpl(this.top)) * 31) + Dp.m3957hashCodeimpl(this.right)) * 31) + Dp.m3957hashCodeimpl(this.bottom);
    }

    @NotNull
    public String toString() {
        return "DpRect(left=" + ((Object) Dp.m3962toStringimpl(this.left)) + ", top=" + ((Object) Dp.m3962toStringimpl(this.top)) + ", right=" + ((Object) Dp.m3962toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m3962toStringimpl(this.bottom)) + ')';
    }

    public /* synthetic */ DpRect(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    private DpRect(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    private DpRect(long j10, long j11) {
        this(DpOffset.m4012getXD9Ej5fM(j10), DpOffset.m4014getYD9Ej5fM(j10), Dp.m3951constructorimpl(DpOffset.m4012getXD9Ej5fM(j10) + DpSize.m4049getWidthD9Ej5fM(j11)), Dp.m3951constructorimpl(DpOffset.m4014getYD9Ej5fM(j10) + DpSize.m4047getHeightD9Ej5fM(j11)), null);
    }
}
