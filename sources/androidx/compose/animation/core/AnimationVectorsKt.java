package androidx.compose.animation.core;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a&\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003\u001a\u001b\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0000¢\u0006\u0002\u0010\r\u001a#\u0010\u000e\u001a\u00020\u000f\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000b2\u0006\u0010\u0010\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\u0011\u001a\u001b\u0010\u0012\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0000¢\u0006\u0002\u0010\r¨\u0006\u0013"}, d2 = {"AnimationVector", "Landroidx/compose/animation/core/AnimationVector1D;", "v1", "", "Landroidx/compose/animation/core/AnimationVector2D;", "v2", "Landroidx/compose/animation/core/AnimationVector3D;", "v3", "Landroidx/compose/animation/core/AnimationVector4D;", "v4", MenuActionType.COPY, "T", "Landroidx/compose/animation/core/AnimationVector;", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "copyFrom", "", "source", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "newInstance", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AnimationVectorsKt {
    @NotNull
    public static final AnimationVector1D AnimationVector(float f10) {
        return new AnimationVector1D(f10);
    }

    @NotNull
    public static final <T extends AnimationVector> T copy(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        T t11 = (T) newInstance(t10);
        int size = t11.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            t11.set$animation_core_release(i10, t10.get$animation_core_release(i10));
        }
        return t11;
    }

    public static final <T extends AnimationVector> void copyFrom(@NotNull T t10, @NotNull T source) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int size = t10.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            t10.set$animation_core_release(i10, source.get$animation_core_release(i10));
        }
    }

    @NotNull
    public static final <T extends AnimationVector> T newInstance(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        T t11 = (T) t10.newVector$animation_core_release();
        Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t11;
    }

    @NotNull
    public static final AnimationVector2D AnimationVector(float f10, float f11) {
        return new AnimationVector2D(f10, f11);
    }

    @NotNull
    public static final AnimationVector3D AnimationVector(float f10, float f11, float f12) {
        return new AnimationVector3D(f10, f11, f12);
    }

    @NotNull
    public static final AnimationVector4D AnimationVector(float f10, float f11, float f12, float f13) {
        return new AnimationVector4D(f10, f11, f12, f13);
    }
}
