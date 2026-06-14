package com.yandex.div.internal.widget.indicator.animations;

import com.yandex.div.internal.widget.indicator.IndicatorParams$Animation;
import com.yandex.div.internal.widget.indicator.Style;
import kotlin.Metadata;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"getIndicatorAnimator", "Lcom/yandex/div/internal/widget/indicator/animations/IndicatorAnimator;", "style", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class IndicatorAnimatorKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndicatorParams$Animation.values().length];
            try {
                iArr[IndicatorParams$Animation.SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndicatorParams$Animation.WORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndicatorParams$Animation.SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final IndicatorAnimator getIndicatorAnimator(@NotNull Style style) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[style.getAnimation().ordinal()];
        if (i10 == 1) {
            return new ScaleIndicatorAnimator(style);
        }
        if (i10 == 2) {
            return new WormIndicatorAnimator(style);
        }
        if (i10 == 3) {
            return new SliderIndicatorAnimator(style);
        }
        throw new m();
    }
}
