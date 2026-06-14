package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB&\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR'\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000fR'\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/graphics/Shadow;", "", "color", "Landroidx/compose/ui/graphics/Color;", "offset", "Landroidx/compose/ui/geometry/Offset;", "blurRadius", "", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBlurRadius$annotations", "()V", "getBlurRadius", "()F", "getColor-0d7_KjU$annotations", "getColor-0d7_KjU", "()J", "J", "getOffset-F1C5BW0$annotations", "getOffset-F1C5BW0", MenuActionType.COPY, "copy-qcb84PM", "(JJF)Landroidx/compose/ui/graphics/Shadow;", "equals", "", "other", "hashCode", "", "toString", "", com.taurusx.tax.f.y.f66058y, "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Shadow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Shadow None = new Shadow(0, 0, 0.0f, 7, null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/Shadow$Companion;", "", "()V", "None", "Landroidx/compose/ui/graphics/Shadow;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/graphics/Shadow;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        @NotNull
        public final Shadow getNone() {
            return Shadow.None;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Shadow(long j10, long j11, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, f10);
    }

    /* JADX INFO: renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ Shadow m1895copyqcb84PM$default(Shadow shadow, long j10, long j11, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = shadow.color;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = shadow.offset;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            f10 = shadow.blurRadius;
        }
        return shadow.m1898copyqcb84PM(j12, j13, f10);
    }

    @Stable
    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m1896getColor0d7_KjU$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m1897getOffsetF1C5BW0$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: copy-qcb84PM, reason: not valid java name */
    public final Shadow m1898copyqcb84PM(long color, long offset, float blurRadius) {
        return new Shadow(color, offset, blurRadius, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) other;
        return Color.m1605equalsimpl0(this.color, shadow.color) && Offset.m1368equalsimpl0(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: getOffset-F1C5BW0, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return (((Color.m1611hashCodeimpl(this.color) * 31) + Offset.m1373hashCodeimpl(this.offset)) * 31) + Float.floatToIntBits(this.blurRadius);
    }

    @NotNull
    public String toString() {
        return "Shadow(color=" + ((Object) Color.m1612toStringimpl(this.color)) + ", offset=" + ((Object) Offset.m1379toStringimpl(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }

    private Shadow(long j10, long j11, float f10) {
        this.color = j10;
        this.offset = j11;
        this.blurRadius = f10;
    }

    public /* synthetic */ Shadow(long j10, long j11, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ColorKt.Color(4278190080L) : j10, (i10 & 2) != 0 ? Offset.INSTANCE.m1387getZeroF1C5BW0() : j11, (i10 & 4) != 0 ? 0.0f : f10, null);
    }
}
