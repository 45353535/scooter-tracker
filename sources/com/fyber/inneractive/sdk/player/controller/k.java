package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f21515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f21516b;

    public k(f fVar, boolean z10) {
        this.f21516b = fVar;
        this.f21515a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f21516b;
        if (qVar.f21528g) {
            return;
        }
        try {
            Iterator it = qVar.f21523b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).c(this.f21515a);
            }
        } catch (Exception e10) {
            if (IAlog.f23840a <= 3) {
                q qVar2 = this.f21516b;
                qVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", e10, IAlog.a(qVar2));
            }
        }
    }
}
