package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.fyber.inneractive.sdk.util.r;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f20143a;

    public d(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f20143a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i10) {
        if ((i10 & 2) == 0) {
            r.f23896b.postDelayed(this.f20143a.mHideNavigationBarTask, 3000L);
        }
    }
}
