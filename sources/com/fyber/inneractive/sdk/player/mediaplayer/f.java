package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.Surface;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Surface f23283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f23284b;

    public f(p pVar, Surface surface) {
        this.f23284b = pVar;
        this.f23283a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.f23284b, this.f23283a);
    }
}
