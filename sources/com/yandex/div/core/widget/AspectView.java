package com.yandex.div.core.widget;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.properties.e;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/widget/AspectView;", "", "", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AspectView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/widget/AspectView$Companion;", "", "<init>", "()V", "Lkotlin/properties/e;", "Landroid/view/View;", "", "aspectRatioProperty$div_release", "()Lkotlin/properties/e;", "aspectRatioProperty", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final e aspectRatioProperty$div_release() {
            return ViewsKt.dimensionAffecting(Float.valueOf(0.0f), new Function1<Float, Float>() { // from class: com.yandex.div.core.widget.AspectView$Companion$aspectRatioProperty$1
                @NotNull
                public final Float invoke(float f10) {
                    return Float.valueOf(g.d(f10, 0.0f));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                    return invoke(f10.floatValue());
                }
            });
        }
    }

    void setAspectRatio(float f10);
}
