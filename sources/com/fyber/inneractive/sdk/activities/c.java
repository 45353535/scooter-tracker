package com.fyber.inneractive.sdk.activities;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f20142a;

    public c(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f20142a = inneractiveFullscreenAdActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20142a.isFinishing()) {
            return;
        }
        this.f20142a.hideNavigationBar();
    }
}
