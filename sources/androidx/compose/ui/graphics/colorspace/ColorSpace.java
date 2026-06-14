package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 72\u00020\u0001:\u00017B\u001a\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006B\"\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0013\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH&J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\bH&J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\bH&J\b\u0010#\u001a\u00020\bH\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J%\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001cH\u0010¢\u0006\u0002\b*J\u001e\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001cJ\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH&J%\u0010/\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001cH\u0010¢\u0006\u0002\b0J@\u00101\u001a\u0002022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u0000H\u0010ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "model", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "id", "", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "componentCount", "getComponentCount", "()I", "getId$ui_graphics_release", "isSrgb", "", "()Z", "isWideGamut", "getModel-xdoWZVw", "()J", "J", "getName", "()Ljava/lang/String;", "equals", "other", "fromXyz", "", "x", "", "y", "z", "v", "getMaxValue", "component", "getMinValue", "hashCode", "toString", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "r", "g", "b", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", y.f66058y, "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ColorSpace {
    public static final int MaxId = 63;
    public static final int MinId = -1;
    private final int id;
    private final long model;

    @NotNull
    private final String name;

    public /* synthetic */ ColorSpace(String str, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, i10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) other;
        if (this.id == colorSpace.id && Intrinsics.areEqual(this.name, colorSpace.name)) {
            return ColorModel.m1981equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    @NotNull
    public final float[] fromXyz(float x10, float y10, float z10) {
        float[] fArr = new float[ColorModel.m1982getComponentCountimpl(this.model)];
        fArr[0] = x10;
        fArr[1] = y10;
        fArr[2] = z10;
        return fromXyz(fArr);
    }

    @NotNull
    public abstract float[] fromXyz(@NotNull float[] v10);

    public final int getComponentCount() {
        return ColorModel.m1982getComponentCountimpl(this.model);
    }

    /* JADX INFO: renamed from: getId$ui_graphics_release, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public abstract float getMaxValue(int component);

    public abstract float getMinValue(int component);

    /* JADX INFO: renamed from: getModel-xdoWZVw, reason: not valid java name and from getter */
    public final long getModel() {
        return this.model;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m1983hashCodeimpl(this.model)) * 31) + this.id;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    @NotNull
    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.m1984toStringimpl(this.model)) + ')';
    }

    public long toXy$ui_graphics_release(float v02, float v12, float v22) {
        float[] xyz = toXyz(v02, v12, v22);
        float f10 = xyz[0];
        float f11 = xyz[1];
        return (((long) Float.floatToIntBits(f10)) << 32) | (((long) Float.floatToIntBits(f11)) & 4294967295L);
    }

    @NotNull
    public final float[] toXyz(float r10, float g10, float b10) {
        return toXyz(new float[]{r10, g10, b10});
    }

    @NotNull
    public abstract float[] toXyz(@NotNull float[] v10);

    public float toZ$ui_graphics_release(float v02, float v12, float v22) {
        return toXyz(v02, v12, v22)[2];
    }

    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release, reason: not valid java name */
    public long mo1991xyzaToColorJlNiLsg$ui_graphics_release(float x10, float y10, float z10, float a10, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float[] fArrFromXyz = fromXyz(x10, y10, z10);
        return ColorKt.Color(fArrFromXyz[0], fArrFromXyz[1], fArrFromXyz[2], a10, colorSpace);
    }

    public /* synthetic */ ColorSpace(String str, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10);
    }

    private ColorSpace(String str, long j10, int i10) {
        this.name = str;
        this.model = j10;
        this.id = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    private ColorSpace(String str, long j10) {
        this(str, j10, -1, null);
    }
}
