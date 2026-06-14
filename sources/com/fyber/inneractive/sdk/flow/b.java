package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f20620a;

    public b(d dVar) {
        this.f20620a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("%s : ContentLoadTimeoutHandler Executing timeout task", IAlog.a(this.f20620a));
        this.f20620a.f20637b.a();
    }
}
