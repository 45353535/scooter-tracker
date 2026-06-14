package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Bo implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f36646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f36647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnWindowFocusChangeListener f36648c;

    public Bo(ViewGroup viewGroup, ViewGroup viewGroup2, ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener) {
        this.f36646a = viewGroup;
        this.f36647b = viewGroup2;
        this.f36648c = onWindowFocusChangeListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f36646a.removeOnAttachStateChangeListener(this);
        this.f36647b.getViewTreeObserver().removeOnWindowFocusChangeListener(this.f36648c);
    }
}
