package com.fyber.inneractive.sdk.web;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f24030a;

    public p(i0 i0Var) {
        this.f24030a = i0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m mVar = this.f24030a.f23971b;
        if (mVar == null) {
            return false;
        }
        mVar.getViewTreeObserver().removeOnPreDrawListener(this);
        i0 i0Var = this.f24030a;
        i0Var.a(i0Var.f23971b.getContext(), true);
        return false;
    }
}
