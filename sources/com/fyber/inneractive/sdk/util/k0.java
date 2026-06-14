package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f23876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f23877b;

    public k0(n0 n0Var, Context context) {
        this.f23877b = n0Var;
        this.f23876a = context;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f23877b.a(this.f23876a);
        return true;
    }
}
