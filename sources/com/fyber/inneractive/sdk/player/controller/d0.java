package com.fyber.inneractive.sdk.player.controller;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f21494a;

    public d0(f0 f0Var) {
        this.f21494a = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f21494a.f21509b.dismiss();
        v vVar = this.f21494a.f21508a;
        vVar.f21542b.d(vVar.f21541a);
    }
}
