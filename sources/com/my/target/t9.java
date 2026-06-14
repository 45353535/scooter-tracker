package com.my.target;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class t9 extends cb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ab f60843d;

    public t9(w2 w2Var, ab abVar, ab abVar2) {
        super(w2Var, abVar);
        this.f60843d = abVar2;
    }

    @Override // com.my.target.cb
    public void a(boolean z10, float f10, View view) {
    }

    @Override // com.my.target.cb
    public void c() {
    }

    public static t9 a(w2 w2Var, ab abVar, ab abVar2) {
        return new t9(w2Var, abVar, abVar2);
    }

    @Override // com.my.target.cb
    public void a(View view) {
        bb.a(this.f59393a, 1, view.getContext());
        bb.a(this.f60843d, 1, view.getContext());
        gb.b("ViewabilityTracker: RenderStatTracker", "Render tracked, kill self");
        b();
    }
}
