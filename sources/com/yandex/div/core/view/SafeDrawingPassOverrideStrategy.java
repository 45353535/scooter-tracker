package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u000eR*\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/view/SafeDrawingPassOverrideStrategy;", "Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "<init>", "()V", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "proceed", "overrideDrawingPass", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;Z)Z", "", "frameCancelCount", "", "onFrameCancelled", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;I)V", "onFrameCancelLimitExceeded", "value", "frameCancelLimit", "I", "getFrameCancelLimit", "()I", "setFrameCancelLimit", "(I)V", y.f66058y, "div-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SafeDrawingPassOverrideStrategy implements DrawingPassOverrideStrategy {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private int frameCancelCount;
    private int frameCancelLimit = 3;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view/SafeDrawingPassOverrideStrategy$Companion;", "", "()V", "DEFAULT_FRAME_CANCEL_LIMIT", "", "div-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    protected void onFrameCancelLimitExceeded(@NotNull ViewTreeObserver.OnPreDrawListener listener, int frameCancelCount) {
    }

    protected void onFrameCancelled(@NotNull ViewTreeObserver.OnPreDrawListener listener, int frameCancelCount) {
    }

    @Override // com.yandex.div.core.view.DrawingPassOverrideStrategy
    public boolean overrideDrawingPass(@NotNull ViewTreeObserver.OnPreDrawListener listener, boolean proceed) {
        if (proceed) {
            this.frameCancelCount = 0;
            return true;
        }
        int i10 = this.frameCancelCount;
        int i11 = this.frameCancelLimit;
        if (i10 < i11) {
            int i12 = i10 + 1;
            this.frameCancelCount = i12;
            onFrameCancelled(listener, i12);
            return false;
        }
        if (i10 == i11) {
            int i13 = i10 + 1;
            this.frameCancelCount = i13;
            onFrameCancelLimitExceeded(listener, i13);
        }
        return true;
    }
}
