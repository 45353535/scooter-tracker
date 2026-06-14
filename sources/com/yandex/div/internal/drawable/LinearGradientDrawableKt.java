package com.yandex.div.internal.drawable;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0002¨\u0006\u0004"}, d2 = {"snap", "", TypedValues.TransitionType.S_TO, "sensitivity", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class LinearGradientDrawableKt {
    private static final float snap(float f10, float f11, float f12) {
        return Math.abs(f11 - f10) <= f12 ? f11 : f10;
    }

    static /* synthetic */ float snap$default(float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f12 = 1.0E-4f;
        }
        return snap(f10, f11, f12);
    }
}
