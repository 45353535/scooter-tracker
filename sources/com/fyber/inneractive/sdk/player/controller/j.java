package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f21513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f21514b;

    public j(q qVar, com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
        this.f21514b = qVar;
        this.f21513a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f21514b;
        if (qVar.f21528g) {
            return;
        }
        try {
            Iterator it = qVar.f21523b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a((com.fyber.inneractive.sdk.player.mediaplayer.o) this.f21513a);
            }
        } catch (Exception e10) {
            if (IAlog.f23840a <= 3) {
                q qVar2 = this.f21514b;
                qVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", e10, IAlog.a(qVar2));
            }
        }
    }
}
