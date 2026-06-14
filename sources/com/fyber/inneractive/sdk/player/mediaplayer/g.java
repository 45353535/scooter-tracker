package com.fyber.inneractive.sdk.player.mediaplayer;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f23285a;

    public g(p pVar) {
        this.f23285a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.b(this.f23285a);
        Handler handler = this.f23285a.f23307o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f23285a.f23307o = null;
        }
        this.f23285a.f23306n = null;
        Looper.myLooper().quit();
    }
}
