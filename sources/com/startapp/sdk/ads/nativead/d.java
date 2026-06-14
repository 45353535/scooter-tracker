package com.startapp.sdk.ads.nativead;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f63837a;

    public d(NativeAdDetails nativeAdDetails) {
        this.f63837a = nativeAdDetails;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f63837a.handleClickOnView(view);
    }
}
