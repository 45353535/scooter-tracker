package com.appodeal.ads.adapters.admobnative.view;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShimmerFrameLayout f11957b;

    public b(ShimmerFrameLayout shimmerFrameLayout) {
        this.f11957b = shimmerFrameLayout;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        if (this.f11957b.f11955g.isPaused()) {
            this.f11957b.f11955g.resume();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        if (this.f11957b.f11955g.isRunning()) {
            this.f11957b.f11955g.pause();
        }
    }
}
