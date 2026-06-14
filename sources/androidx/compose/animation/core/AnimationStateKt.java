package androidx.compose.animation.core;

import androidx.exifinterface.media.ExifInterface;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001ai\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\n\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u0010\u001aB\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\n\u001a\u00020\u00112\b\b\u0002\u0010\u000b\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001\u001ak\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0007*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u00022\b\b\u0002\u0010\u0014\u001a\u0002H\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u0001H\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u0016\u001aT\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0002*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001\u001a3\u0010\u0018\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0007*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\u0014\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0019\"\u001d\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u001a"}, d2 = {"isFinished", "", "Landroidx/compose/animation/core/AnimationState;", "(Landroidx/compose/animation/core/AnimationState;)Z", "AnimationState", "T", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "initialVelocity", "lastFrameTimeNanos", "", "finishedTimeNanos", "isRunning", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;JJZ)Landroidx/compose/animation/core/AnimationState;", "", "Landroidx/compose/animation/core/AnimationVector1D;", MenuActionType.COPY, "value", "velocityVector", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)Landroidx/compose/animation/core/AnimationState;", "velocity", "createZeroVectorFrom", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AnimationStateKt {
    @NotNull
    public static final AnimationState<Float, AnimationVector1D> AnimationState(float f10, float f11, long j10, long j11, boolean z10) {
        return new AnimationState<>(VectorConvertersKt.getVectorConverter(u.f93332a), Float.valueOf(f10), AnimationVectorsKt.AnimationVector(f11), j10, j11, z10);
    }

    public static /* synthetic */ AnimationState AnimationState$default(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 8) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return AnimationState(f10, f11, j10, j11, z10);
    }

    @NotNull
    public static final <T, V extends AnimationVector> AnimationState<T, V> copy(@NotNull AnimationState<T, V> animationState, T t10, @Nullable V v10, long j10, long j11, boolean z10) {
        Intrinsics.checkNotNullParameter(animationState, "<this>");
        return new AnimationState<>(animationState.getTypeConverter(), t10, v10, j10, j11, z10);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, Object obj, AnimationVector animationVector, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = animationState.getValue();
        }
        if ((i10 & 2) != 0) {
            animationVector = AnimationVectorsKt.copy(animationState.getVelocityVector());
        }
        if ((i10 & 4) != 0) {
            j10 = animationState.getLastFrameTimeNanos();
        }
        if ((i10 & 8) != 0) {
            j11 = animationState.getFinishedTimeNanos();
        }
        if ((i10 & 16) != 0) {
            z10 = animationState.getIsRunning();
        }
        boolean z11 = z10;
        long j12 = j11;
        return copy((AnimationState<Object, AnimationVector>) animationState, obj, animationVector, j10, j12, z11);
    }

    @NotNull
    public static final <T, V extends AnimationVector> V createZeroVectorFrom(@NotNull TwoWayConverter<T, V> twoWayConverter, T t10) {
        Intrinsics.checkNotNullParameter(twoWayConverter, "<this>");
        return (V) AnimationVectorsKt.newInstance(twoWayConverter.getConvertToVector().invoke(t10));
    }

    public static final boolean isFinished(@NotNull AnimationState<?, ?> animationState) {
        Intrinsics.checkNotNullParameter(animationState, "<this>");
        return animationState.getFinishedTimeNanos() != Long.MIN_VALUE;
    }

    public static /* synthetic */ AnimationState AnimationState$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, long j10, long j11, boolean z10, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return AnimationState(twoWayConverter, obj, obj2, j10, j11, z10);
    }

    @NotNull
    public static final AnimationState<Float, AnimationVector1D> copy(@NotNull AnimationState<Float, AnimationVector1D> animationState, float f10, float f11, long j10, long j11, boolean z10) {
        Intrinsics.checkNotNullParameter(animationState, "<this>");
        return new AnimationState<>(animationState.getTypeConverter(), Float.valueOf(f10), AnimationVectorsKt.AnimationVector(f11), j10, j11, z10);
    }

    @NotNull
    public static final <T, V extends AnimationVector> AnimationState<T, V> AnimationState(@NotNull TwoWayConverter<T, V> typeConverter, T t10, T t11, long j10, long j11, boolean z10) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        return new AnimationState<>(typeConverter, t10, typeConverter.getConvertToVector().invoke(t11), j10, j11, z10);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) animationState.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((AnimationVector1D) animationState.getVelocityVector()).getValue();
        }
        if ((i10 & 4) != 0) {
            j10 = animationState.getLastFrameTimeNanos();
        }
        if ((i10 & 8) != 0) {
            j11 = animationState.getFinishedTimeNanos();
        }
        if ((i10 & 16) != 0) {
            z10 = animationState.getIsRunning();
        }
        boolean z11 = z10;
        long j12 = j11;
        return copy((AnimationState<Float, AnimationVector1D>) animationState, f10, f11, j10, j12, z11);
    }
}
