package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SurfaceHolder f23281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f23282b;

    public e(p pVar, SurfaceHolder surfaceHolder) {
        this.f23282b = pVar;
        this.f23281a = surfaceHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.f23282b, this.f23281a);
    }
}
