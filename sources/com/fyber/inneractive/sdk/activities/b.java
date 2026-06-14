package com.fyber.inneractive.sdk.activities;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveBaseActivity f20141a;

    public b(InneractiveBaseActivity inneractiveBaseActivity) {
        this.f20141a = inneractiveBaseActivity;
    }

    public final void onBackInvoked() {
        this.f20141a.onBackPressed();
    }
}
