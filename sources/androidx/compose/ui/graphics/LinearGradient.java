package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BD\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u001d\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LinearGradient extends ShaderBrush {

    @NotNull
    private final List<Color> colors;
    private final long end;
    private final long start;

    @Nullable
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j10, j11, i10);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @NotNull
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo1579createShaderuvyYCjk(long size) {
        return ShaderKt.m1889LinearGradientShaderVjE6UOU(OffsetKt.Offset(Offset.m1371getXimpl(this.start) == Float.POSITIVE_INFINITY ? Size.m1440getWidthimpl(size) : Offset.m1371getXimpl(this.start), Offset.m1372getYimpl(this.start) == Float.POSITIVE_INFINITY ? Size.m1437getHeightimpl(size) : Offset.m1372getYimpl(this.start)), OffsetKt.Offset(Offset.m1371getXimpl(this.end) == Float.POSITIVE_INFINITY ? Size.m1440getWidthimpl(size) : Offset.m1371getXimpl(this.end), Offset.m1372getYimpl(this.end) == Float.POSITIVE_INFINITY ? Size.m1437getHeightimpl(size) : Offset.m1372getYimpl(this.end)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) other;
        return Intrinsics.areEqual(this.colors, linearGradient.colors) && Intrinsics.areEqual(this.stops, linearGradient.stops) && Offset.m1368equalsimpl0(this.start, linearGradient.start) && Offset.m1368equalsimpl0(this.end, linearGradient.end) && TileMode.m1943equalsimpl0(this.tileMode, linearGradient.tileMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long getIntrinsicSize() {
        /*
            r5 = this;
            long r0 = r5.start
            float r0 = androidx.compose.ui.geometry.Offset.m1371getXimpl(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r1 != 0) goto L38
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L38
            long r0 = r5.end
            float r0 = androidx.compose.ui.geometry.Offset.m1371getXimpl(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L38
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L38
            long r0 = r5.start
            float r0 = androidx.compose.ui.geometry.Offset.m1371getXimpl(r0)
            long r3 = r5.end
            float r1 = androidx.compose.ui.geometry.Offset.m1371getXimpl(r3)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            goto L39
        L38:
            r0 = r2
        L39:
            long r3 = r5.start
            float r1 = androidx.compose.ui.geometry.Offset.m1372getYimpl(r3)
            boolean r3 = java.lang.Float.isInfinite(r1)
            if (r3 != 0) goto L6e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L6e
            long r3 = r5.end
            float r1 = androidx.compose.ui.geometry.Offset.m1372getYimpl(r3)
            boolean r3 = java.lang.Float.isInfinite(r1)
            if (r3 != 0) goto L6e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L6e
            long r1 = r5.start
            float r1 = androidx.compose.ui.geometry.Offset.m1372getYimpl(r1)
            long r2 = r5.end
            float r2 = androidx.compose.ui.geometry.Offset.m1372getYimpl(r2)
            float r1 = r1 - r2
            float r2 = java.lang.Math.abs(r1)
        L6e:
            long r0 = androidx.compose.ui.geometry.SizeKt.Size(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.LinearGradient.getIntrinsicSize():long");
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m1373hashCodeimpl(this.start)) * 31) + Offset.m1373hashCodeimpl(this.end)) * 31) + TileMode.m1944hashCodeimpl(this.tileMode);
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.m1388isFinitek4lQ0M(this.start)) {
            str = "start=" + ((Object) Offset.m1379toStringimpl(this.start)) + ", ";
        } else {
            str = "";
        }
        if (OffsetKt.m1388isFinitek4lQ0M(this.end)) {
            str2 = "end=" + ((Object) Offset.m1379toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m1945toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j10, long j11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, j11, (i11 & 16) != 0 ? TileMode.INSTANCE.m1947getClamp3opZhB0() : i10, null);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j10, long j11, int i10) {
        this.colors = list;
        this.stops = list2;
        this.start = j10;
        this.end = j11;
        this.tileMode = i10;
    }
}
