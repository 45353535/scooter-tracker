package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view.OnPreDrawListeners;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "overrideStrategy", "Lkotlin/Function0;", "", "action", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDrawListener", "(Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;Lkotlin/jvm/functions/Function0;)Landroid/view/ViewTreeObserver$OnPreDrawListener;", "div-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class OnPreDrawListeners {
    @NotNull
    public static final ViewTreeObserver.OnPreDrawListener onPreDrawListener(@NotNull DrawingPassOverrideStrategy drawingPassOverrideStrategy, @NotNull final Function0<Boolean> function0) {
        return new OverridableOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: k7.a
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return OnPreDrawListeners.onPreDrawListener$lambda$0(function0);
            }
        }, drawingPassOverrideStrategy);
    }

    public static /* synthetic */ ViewTreeObserver.OnPreDrawListener onPreDrawListener$default(DrawingPassOverrideStrategy drawingPassOverrideStrategy, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawingPassOverrideStrategy = DrawingPassOverrideStrategy.Safe.INSTANCE;
        }
        return onPreDrawListener(drawingPassOverrideStrategy, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPreDrawListener$lambda$0(Function0 function0) {
        return ((Boolean) function0.invoke()).booleanValue();
    }
}
