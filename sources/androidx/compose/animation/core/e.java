package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static AnimationVector a(VectorizedAnimationSpec vectorizedAnimationSpec, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return vectorizedAnimationSpec.getVelocityFromNanos(vectorizedAnimationSpec.getDurationNanos(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }
}
