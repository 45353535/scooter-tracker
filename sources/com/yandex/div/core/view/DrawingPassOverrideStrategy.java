package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bç\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\bJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "proceed", "overrideDrawingPass", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;Z)Z", "Safe", "div-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DrawingPassOverrideStrategy {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view/DrawingPassOverrideStrategy$Safe;", "Lcom/yandex/div/core/view/SafeDrawingPassOverrideStrategy;", "()V", "div-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Safe extends SafeDrawingPassOverrideStrategy {

        @NotNull
        public static final Safe INSTANCE = new Safe();

        private Safe() {
        }
    }

    boolean overrideDrawingPass(@NotNull ViewTreeObserver.OnPreDrawListener listener, boolean proceed);
}
