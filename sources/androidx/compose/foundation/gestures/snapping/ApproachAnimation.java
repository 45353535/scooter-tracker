package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004JK\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Landroidx/compose/foundation/gestures/ScrollScope;", "scope", "offset", "velocity", "Lkotlin/Function1;", "", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "approachAnimation", "(Landroidx/compose/foundation/gestures/ScrollScope;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
interface ApproachAnimation<T, V extends AnimationVector> {
    @Nullable
    Object approachAnimation(@NotNull ScrollScope scrollScope, T t10, T t11, @NotNull Function1<? super T, Unit> function1, @NotNull Continuation continuation);
}
