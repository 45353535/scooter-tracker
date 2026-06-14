package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IOException f22855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f22856b;

    public l(p pVar, IOException iOException) {
        this.f22856b = pVar;
        this.f22855a = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f22856b.f22876e;
        IOException iOException = this.f22855a;
        if (((com.fyber.inneractive.sdk.player.controller.f) b0Var.f21485a.get()) != null) {
            iOException.getCause();
        }
    }
}
