package com.fyber.inneractive.sdk.player.cache;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f21437a;

    public a(g gVar) {
        this.f21437a = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f21437a) {
            try {
                g gVar = this.f21437a;
                if (gVar.f21458i == null) {
                    return null;
                }
                gVar.d();
                g gVar2 = this.f21437a;
                int i10 = gVar2.f21460k;
                if (i10 >= 2000 && i10 >= gVar2.f21459j.size()) {
                    this.f21437a.c();
                    this.f21437a.f21460k = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
