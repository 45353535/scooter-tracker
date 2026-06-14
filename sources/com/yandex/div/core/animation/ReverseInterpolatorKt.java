package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"reversed", "Landroid/view/animation/Interpolator;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ReverseInterpolatorKt {
    @NotNull
    public static final Interpolator reversed(@NotNull Interpolator interpolator) {
        return new ReverseInterpolator(interpolator);
    }
}
