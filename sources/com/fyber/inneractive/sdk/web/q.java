package com.fyber.inneractive.sdk.web;

import android.view.KeyEvent;
import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f24034a;

    public q(i0 i0Var) {
        this.f24034a = i0Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !this.f24034a.p()) {
            return false;
        }
        IAlog.e("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
        this.f24034a.o();
        return true;
    }
}
