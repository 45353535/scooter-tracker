package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004J-\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/Brush;", "value", "Landroidx/compose/ui/graphics/Color;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getValue-0d7_KjU", "()J", "J", "applyTo", "", "size", "Landroidx/compose/ui/geometry/Size;", "p", "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SolidColor extends Brush {
    private final long value;

    public /* synthetic */ SolidColor(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public void mo1557applyToPq9zytI(long size, @NotNull Paint p10, float alpha) {
        long jM1603copywmQWz5c$default;
        Intrinsics.checkNotNullParameter(p10, "p");
        p10.setAlpha(1.0f);
        if (alpha == 1.0f) {
            jM1603copywmQWz5c$default = this.value;
        } else {
            long j10 = this.value;
            jM1603copywmQWz5c$default = Color.m1603copywmQWz5c$default(j10, Color.m1606getAlphaimpl(j10) * alpha, 0.0f, 0.0f, 0.0f, 14, null);
        }
        p10.mo1492setColor8_81llA(jM1603copywmQWz5c$default);
        if (p10.getShader() != null) {
            p10.setShader(null);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SolidColor) && Color.m1605equalsimpl0(this.value, ((SolidColor) other).value);
    }

    /* JADX INFO: renamed from: getValue-0d7_KjU, reason: not valid java name and from getter */
    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Color.m1611hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m1612toStringimpl(this.value)) + ')';
    }

    private SolidColor(long j10) {
        super(null);
        this.value = j10;
    }
}
