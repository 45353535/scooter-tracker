package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f20151a;

    public l(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f20151a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f20151a.finish();
    }
}
