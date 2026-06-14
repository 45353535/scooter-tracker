package com.fyber.inneractive.sdk.ui;

import android.view.View;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f23827a;

    public a(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f23827a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f23827a.dismissAd(true);
    }
}
