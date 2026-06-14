package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BD\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0019\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RadialGradient extends ShaderBrush {
    private final long center;

    @NotNull
    private final List<Color> colors;
    private final float radius;

    @Nullable
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j10, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j10, f10, i10);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @NotNull
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo1579createShaderuvyYCjk(long size) {
        float fM1440getWidthimpl;
        float fM1437getHeightimpl;
        if (OffsetKt.m1392isUnspecifiedk4lQ0M(this.center)) {
            long jM1450getCenteruvyYCjk = SizeKt.m1450getCenteruvyYCjk(size);
            fM1440getWidthimpl = Offset.m1371getXimpl(jM1450getCenteruvyYCjk);
            fM1437getHeightimpl = Offset.m1372getYimpl(jM1450getCenteruvyYCjk);
        } else {
            fM1440getWidthimpl = Offset.m1371getXimpl(this.center) == Float.POSITIVE_INFINITY ? Size.m1440getWidthimpl(size) : Offset.m1371getXimpl(this.center);
            fM1437getHeightimpl = Offset.m1372getYimpl(this.center) == Float.POSITIVE_INFINITY ? Size.m1437getHeightimpl(size) : Offset.m1372getYimpl(this.center);
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long jOffset = OffsetKt.Offset(fM1440getWidthimpl, fM1437getHeightimpl);
        float fM1439getMinDimensionimpl = this.radius;
        if (fM1439getMinDimensionimpl == Float.POSITIVE_INFINITY) {
            fM1439getMinDimensionimpl = Size.m1439getMinDimensionimpl(size) / 2;
        }
        return ShaderKt.m1891RadialGradientShader8uybcMk(jOffset, fM1439getMinDimensionimpl, list, list2, this.tileMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) other;
        return Intrinsics.areEqual(this.colors, radialGradient.colors) && Intrinsics.areEqual(this.stops, radialGradient.stops) && Offset.m1368equalsimpl0(this.center, radialGradient.center) && this.radius == radialGradient.radius && TileMode.m1943equalsimpl0(this.tileMode, radialGradient.tileMode);
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        float f10 = this.radius;
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            return Size.INSTANCE.m1448getUnspecifiedNHjbRc();
        }
        float f11 = this.radius;
        float f12 = 2;
        return SizeKt.Size(f11 * f12, f11 * f12);
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m1373hashCodeimpl(this.center)) * 31) + Float.floatToIntBits(this.radius)) * 31) + TileMode.m1944hashCodeimpl(this.tileMode);
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.m1390isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((Object) Offset.m1379toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        float f10 = this.radius;
        if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m1945toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j10, float f10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, f10, (i11 & 16) != 0 ? TileMode.INSTANCE.m1947getClamp3opZhB0() : i10, null);
    }

    private RadialGradient(List<Color> list, List<Float> list2, long j10, float f10, int i10) {
        this.colors = list;
        this.stops = list2;
        this.center = j10;
        this.radius = f10;
        this.tileMode = i10;
    }
}
