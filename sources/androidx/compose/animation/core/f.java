package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static long a(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return ((long) (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis())) * 1000000;
    }
}
