package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f23289b;

    public j(p pVar, int i10) {
        this.f23289b = pVar;
        this.f23288a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f23289b;
        int i10 = this.f23288a;
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        pVar.seekTo(i10);
        IAlog.e(strB + "timelog: seekTo took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }
}
