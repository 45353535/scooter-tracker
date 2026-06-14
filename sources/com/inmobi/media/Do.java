package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Do implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f36757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f36758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnWindowVisibilityChangeListener f36759c;

    public Do(ViewGroup viewGroup, ViewGroup viewGroup2, ViewTreeObserver.OnWindowVisibilityChangeListener onWindowVisibilityChangeListener) {
        this.f36757a = viewGroup;
        this.f36758b = viewGroup2;
        this.f36759c = onWindowVisibilityChangeListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f36757a.removeOnAttachStateChangeListener(this);
        this.f36758b.getViewTreeObserver().removeOnWindowVisibilityChangeListener(this.f36759c);
    }
}
