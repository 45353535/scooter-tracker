package com.my.target;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class wb extends cb {
    public wb(w2 w2Var, ab abVar) {
        super(w2Var, abVar);
    }

    @Override // com.my.target.cb
    public void a(View view) {
    }

    @Override // com.my.target.cb
    public void c() {
    }

    public static wb a(w2 w2Var, ab abVar) {
        return new wb(w2Var, abVar);
    }

    @Override // com.my.target.cb
    public void a(boolean z10, float f10, View view) {
        if (e2.a(f10, 0.0f) == 1) {
            bb.a(this.f59393a, 1, view.getContext());
            gb.b("ViewabilityTracker: ShowStatTracker", "ViewIn tracked, kill self");
            b();
        }
    }
}
