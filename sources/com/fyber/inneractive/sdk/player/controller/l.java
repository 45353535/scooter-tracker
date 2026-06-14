package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f21518b;

    public l(q qVar, int i10) {
        this.f21518b = qVar;
        this.f21517a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f21518b.f21524c.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(this.f21517a);
            }
        } catch (Exception e10) {
            if (IAlog.f23840a <= 3) {
                q qVar = this.f21518b;
                qVar.getClass();
                IAlog.a("%sonPlayerProgress callback threw an exception!", e10, IAlog.a(qVar));
            }
        }
    }
}
