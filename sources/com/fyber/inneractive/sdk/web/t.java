package com.fyber.inneractive.sdk.web;

import android.window.OnBackInvokedCallback;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f24046a;

    public t(i0 i0Var) {
        this.f24046a = i0Var;
    }

    public final void onBackInvoked() {
        i0 i0Var = this.f24046a;
        if (i0Var.p()) {
            IAlog.e("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
            i0Var.o();
        }
    }
}
