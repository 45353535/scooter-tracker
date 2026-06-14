package yads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class zj implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f118717a;

    public zj(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f118717a = onGlobalLayoutListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.f118717a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f118717a);
    }
}
