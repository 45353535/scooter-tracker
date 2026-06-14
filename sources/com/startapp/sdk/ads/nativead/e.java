package com.startapp.sdk.ads.nativead;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f63838a;

    public e(NativeAdDetails nativeAdDetails) {
        this.f63838a = nativeAdDetails;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f63838a.handleClickOnView(view);
    }
}
