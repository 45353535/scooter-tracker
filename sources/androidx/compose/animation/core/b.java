package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static float a(FloatAnimationSpec floatAnimationSpec, float f10, float f11, float f12) {
        return floatAnimationSpec.getVelocityFromNanos(floatAnimationSpec.getDurationNanos(f10, f11, f12), f10, f11, f12);
    }

    public static VectorizedFloatAnimationSpec c(FloatAnimationSpec floatAnimationSpec, TwoWayConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new VectorizedFloatAnimationSpec(floatAnimationSpec);
    }
}
