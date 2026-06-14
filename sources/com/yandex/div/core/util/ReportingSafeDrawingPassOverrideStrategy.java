package com.yandex.div.core.util;

import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.view.SafeDrawingPassOverrideStrategy;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/util/ReportingSafeDrawingPassOverrideStrategy;", "Lcom/yandex/div/core/view/SafeDrawingPassOverrideStrategy;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "logger", "Lcom/yandex/div/core/Div2Logger;", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/Div2Logger;)V", "onFrameCancelLimitExceeded", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "frameCancelCount", "", "onFrameCancelled", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReportingSafeDrawingPassOverrideStrategy extends SafeDrawingPassOverrideStrategy {

    @NotNull
    private final Div2View divView;

    @NotNull
    private final Div2Logger logger;

    public ReportingSafeDrawingPassOverrideStrategy(@NotNull Div2View div2View, @NotNull Div2Logger div2Logger) {
        this.divView = div2View;
        this.logger = div2Logger;
    }

    @Override // com.yandex.div.core.view.SafeDrawingPassOverrideStrategy
    protected void onFrameCancelLimitExceeded(@NotNull ViewTreeObserver.OnPreDrawListener listener, int frameCancelCount) {
        this.logger.logFrameCancelLimitExceeded(this.divView, "Frame cancellation limit exceeded by " + listener + ". Forcing frame drawing.");
    }

    @Override // com.yandex.div.core.view.SafeDrawingPassOverrideStrategy
    protected void onFrameCancelled(@NotNull ViewTreeObserver.OnPreDrawListener listener, int frameCancelCount) {
        this.logger.logFrameCancelled(this.divView, "Frame cancelled by " + listener);
    }
}
