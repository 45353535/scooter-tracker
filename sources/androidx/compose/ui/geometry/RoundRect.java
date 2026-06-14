package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001>BP\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0019\u0010!\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0011J\u0019\u0010#\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0011J\u0019\u0010%\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0011J\u0019\u0010'\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0011J\u001e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.Jf\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J(\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H\u0002J\b\u0010;\u001a\u00020\u0000H\u0002J\b\u0010<\u001a\u00020=H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u000b\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "left", "", "top", "right", "bottom", "topLeftCornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_scaledRadiiRect", "getBottom", "()F", "getBottomLeftCornerRadius-kKHJgLs", "()J", "J", "getBottomRightCornerRadius-kKHJgLs", "height", "getHeight", "getLeft", "getRight", "getTop", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "width", "getWidth", "component1", "component2", "component3", "component4", "component5", "component5-kKHJgLs", "component6", "component6-kKHJgLs", "component7", "component7-kKHJgLs", "component8", "component8-kKHJgLs", "contains", "", "point", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", MenuActionType.COPY, "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "equals", "other", "hashCode", "", "minRadius", "min", "radius1", "radius2", "limit", "scaledRadiiRect", "toString", "", y.f66058y, "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RoundRect {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RoundRect Zero = RoundRectKt.m1425RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.INSTANCE.m1356getZerokKHJgLs());

    @Nullable
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getZero$annotations() {
        }

        @NotNull
        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RoundRect(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    /* JADX INFO: renamed from: copy-MDFrsts$default, reason: not valid java name */
    public static /* synthetic */ RoundRect m1412copyMDFrsts$default(RoundRect roundRect, float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = roundRect.left;
        }
        if ((i10 & 2) != 0) {
            f11 = roundRect.top;
        }
        if ((i10 & 4) != 0) {
            f12 = roundRect.right;
        }
        if ((i10 & 8) != 0) {
            f13 = roundRect.bottom;
        }
        if ((i10 & 16) != 0) {
            j10 = roundRect.topLeftCornerRadius;
        }
        if ((i10 & 32) != 0) {
            j11 = roundRect.topRightCornerRadius;
        }
        if ((i10 & 64) != 0) {
            j12 = roundRect.bottomRightCornerRadius;
        }
        if ((i10 & 128) != 0) {
            j13 = roundRect.bottomLeftCornerRadius;
        }
        long j14 = j13;
        long j15 = j12;
        long j16 = j11;
        long j17 = j10;
        return roundRect.m1418copyMDFrsts(f10, f11, f12, f13, j17, j16, j15, j14);
    }

    @NotNull
    public static final RoundRect getZero() {
        return INSTANCE.getZero();
    }

    private final float minRadius(float min, float radius1, float radius2, float limit) {
        float f10 = radius1 + radius2;
        return (f10 <= limit || f10 == 0.0f) ? min : Math.min(min, limit / f10);
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float fMinRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m1347getYimpl(this.bottomLeftCornerRadius), CornerRadius.m1347getYimpl(this.topLeftCornerRadius), getHeight()), CornerRadius.m1346getXimpl(this.topLeftCornerRadius), CornerRadius.m1346getXimpl(this.topRightCornerRadius), getWidth()), CornerRadius.m1347getYimpl(this.topRightCornerRadius), CornerRadius.m1347getYimpl(this.bottomRightCornerRadius), getHeight()), CornerRadius.m1346getXimpl(this.bottomRightCornerRadius), CornerRadius.m1346getXimpl(this.bottomLeftCornerRadius), getWidth());
        RoundRect roundRect2 = new RoundRect(this.left * fMinRadius, this.top * fMinRadius, this.right * fMinRadius, this.bottom * fMinRadius, CornerRadiusKt.CornerRadius(CornerRadius.m1346getXimpl(this.topLeftCornerRadius) * fMinRadius, CornerRadius.m1347getYimpl(this.topLeftCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m1346getXimpl(this.topRightCornerRadius) * fMinRadius, CornerRadius.m1347getYimpl(this.topRightCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m1346getXimpl(this.bottomRightCornerRadius) * fMinRadius, CornerRadius.m1347getYimpl(this.bottomRightCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m1346getXimpl(this.bottomLeftCornerRadius) * fMinRadius, CornerRadius.m1347getYimpl(this.bottomLeftCornerRadius) * fMinRadius), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component5-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: component6-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    /* JADX INFO: renamed from: component7-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    /* JADX INFO: renamed from: component8-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m1417containsk4lQ0M(long point) {
        float fM1371getXimpl;
        float fM1372getYimpl;
        float fM1346getXimpl;
        float fM1347getYimpl;
        if (Offset.m1371getXimpl(point) < this.left || Offset.m1371getXimpl(point) >= this.right || Offset.m1372getYimpl(point) < this.top || Offset.m1372getYimpl(point) >= this.bottom) {
            return false;
        }
        RoundRect roundRectScaledRadiiRect = scaledRadiiRect();
        if (Offset.m1371getXimpl(point) < this.left + CornerRadius.m1346getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius) && Offset.m1372getYimpl(point) < this.top + CornerRadius.m1347getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius)) {
            fM1371getXimpl = (Offset.m1371getXimpl(point) - this.left) - CornerRadius.m1346getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
            fM1372getYimpl = (Offset.m1372getYimpl(point) - this.top) - CornerRadius.m1347getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
            fM1346getXimpl = CornerRadius.m1346getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
            fM1347getYimpl = CornerRadius.m1347getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
        } else if (Offset.m1371getXimpl(point) > this.right - CornerRadius.m1346getXimpl(roundRectScaledRadiiRect.topRightCornerRadius) && Offset.m1372getYimpl(point) < this.top + CornerRadius.m1347getYimpl(roundRectScaledRadiiRect.topRightCornerRadius)) {
            fM1371getXimpl = (Offset.m1371getXimpl(point) - this.right) + CornerRadius.m1346getXimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM1372getYimpl = (Offset.m1372getYimpl(point) - this.top) - CornerRadius.m1347getYimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM1346getXimpl = CornerRadius.m1346getXimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM1347getYimpl = CornerRadius.m1347getYimpl(roundRectScaledRadiiRect.topRightCornerRadius);
        } else if (Offset.m1371getXimpl(point) > this.right - CornerRadius.m1346getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius) && Offset.m1372getYimpl(point) > this.bottom - CornerRadius.m1347getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius)) {
            fM1371getXimpl = (Offset.m1371getXimpl(point) - this.right) + CornerRadius.m1346getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
            fM1372getYimpl = (Offset.m1372getYimpl(point) - this.bottom) + CornerRadius.m1347getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
            fM1346getXimpl = CornerRadius.m1346getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
            fM1347getYimpl = CornerRadius.m1347getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
        } else {
            if (Offset.m1371getXimpl(point) >= this.left + CornerRadius.m1346getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius) || Offset.m1372getYimpl(point) <= this.bottom - CornerRadius.m1347getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius)) {
                return true;
            }
            fM1371getXimpl = (Offset.m1371getXimpl(point) - this.left) - CornerRadius.m1346getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
            fM1372getYimpl = (Offset.m1372getYimpl(point) - this.bottom) + CornerRadius.m1347getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
            fM1346getXimpl = CornerRadius.m1346getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
            fM1347getYimpl = CornerRadius.m1347getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
        }
        float f10 = fM1371getXimpl / fM1346getXimpl;
        float f11 = fM1372getYimpl / fM1347getYimpl;
        return (f10 * f10) + (f11 * f11) <= 1.0f;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m1418copyMDFrsts(float left, float top, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
        return new RoundRect(left, top, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) other;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m1345equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m1345equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m1345equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m1345equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1419getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1420getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1421getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1422getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.left) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.right)) * 31) + Float.floatToIntBits(this.bottom)) * 31) + CornerRadius.m1348hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m1348hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m1348hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m1348hashCodeimpl(this.bottomLeftCornerRadius);
    }

    @NotNull
    public String toString() {
        long j10 = this.topLeftCornerRadius;
        long j11 = this.topRightCornerRadius;
        long j12 = this.bottomRightCornerRadius;
        long j13 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m1345equalsimpl0(j10, j11) || !CornerRadius.m1345equalsimpl0(j11, j12) || !CornerRadius.m1345equalsimpl0(j12, j13)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m1352toStringimpl(j10)) + ", topRight=" + ((Object) CornerRadius.m1352toStringimpl(j11)) + ", bottomRight=" + ((Object) CornerRadius.m1352toStringimpl(j12)) + ", bottomLeft=" + ((Object) CornerRadius.m1352toStringimpl(j13)) + ')';
        }
        if (CornerRadius.m1346getXimpl(j10) == CornerRadius.m1347getYimpl(j10)) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m1346getXimpl(j10), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m1346getXimpl(j10), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m1347getYimpl(j10), 1) + ')';
    }

    private RoundRect(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
        this.topLeftCornerRadius = j10;
        this.topRightCornerRadius = j11;
        this.bottomRightCornerRadius = j12;
        this.bottomLeftCornerRadius = j13;
    }

    public /* synthetic */ RoundRect(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, (i10 & 16) != 0 ? CornerRadius.INSTANCE.m1356getZerokKHJgLs() : j10, (i10 & 32) != 0 ? CornerRadius.INSTANCE.m1356getZerokKHJgLs() : j11, (i10 & 64) != 0 ? CornerRadius.INSTANCE.m1356getZerokKHJgLs() : j12, (i10 & 128) != 0 ? CornerRadius.INSTANCE.m1356getZerokKHJgLs() : j13, null);
    }
}
