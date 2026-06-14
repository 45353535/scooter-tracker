package com.appodeal.ads.utils;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f15030b;

    public l(o oVar) {
        this.f15030b = oVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f15030b.e();
    }
}
