package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/animation/ReverseInterpolator;", "Landroid/view/animation/Interpolator;", "base", "(Landroid/view/animation/Interpolator;)V", "getInterpolation", "", "input", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReverseInterpolator implements Interpolator {

    @NotNull
    private final Interpolator base;

    public ReverseInterpolator(@NotNull Interpolator interpolator) {
        this.base = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float input) {
        return this.base.getInterpolation(1.0f - input);
    }
}
