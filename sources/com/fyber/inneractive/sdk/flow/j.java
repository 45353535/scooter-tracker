package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f20751a;

    public j(k kVar) {
        this.f20751a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.f20751a;
        kVar.getClass();
        IAlog.a("%s : IAAdContentLoaderImpl : retry load ad task started execution", IAlog.a(kVar));
        this.f20751a.b();
    }
}
