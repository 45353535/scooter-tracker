package com.fyber.inneractive.sdk.web;

import android.view.KeyEvent;
import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f24047a;

    public u(i0 i0Var) {
        this.f24047a = i0Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !this.f24047a.p()) {
            return false;
        }
        IAlog.e("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
        this.f24047a.o();
        return true;
    }
}
