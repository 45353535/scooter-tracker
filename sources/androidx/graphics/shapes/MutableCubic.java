package androidx.graphics.shapes;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Landroidx/graphics/shapes/MutableCubic;", "Landroidx/graphics/shapes/Cubic;", "()V", "interpolate", "", "c1", "c2", "progress", "", "transform", InneractiveMediationDefs.GENDER_FEMALE, "Landroidx/graphics/shapes/PointTransformer;", "transformOnePoint", "ix", "", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableCubic extends Cubic {
    public MutableCubic() {
        super(null, 1, null);
    }

    private final void transformOnePoint(PointTransformer f10, int ix) {
        int i10 = ix + 1;
        long jMo4230transformXgqJiTY = f10.mo4230transformXgqJiTY(getPoints()[ix], getPoints()[i10]);
        getPoints()[ix] = Float.intBitsToFloat((int) (jMo4230transformXgqJiTY >> 32));
        getPoints()[i10] = Float.intBitsToFloat((int) (jMo4230transformXgqJiTY & 4294967295L));
    }

    public final void interpolate(@NotNull Cubic c12, @NotNull Cubic c22, float progress) {
        Intrinsics.checkNotNullParameter(c12, "c1");
        Intrinsics.checkNotNullParameter(c22, "c2");
        for (int i10 = 0; i10 < 8; i10++) {
            getPoints()[i10] = Utils.interpolate(c12.getPoints()[i10], c22.getPoints()[i10], progress);
        }
    }

    public final void transform(@NotNull PointTransformer f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        transformOnePoint(f10, 0);
        transformOnePoint(f10, 2);
        transformOnePoint(f10, 4);
        transformOnePoint(f10, 6);
    }
}
