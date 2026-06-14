package com.startapp.sdk.ads.nativead;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f63841a;

    public h(NativeAdDetails nativeAdDetails) {
        this.f63841a = nativeAdDetails;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f63841a.startOmAdSession();
        this.f63841a.startCheckingVisibility();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f63841a.stopCheckingVisibility();
        this.f63841a.finishOmAdSession();
    }
}
