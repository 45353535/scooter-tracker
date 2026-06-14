package com.fyber.inneractive.sdk.util;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object[] f23857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e f23858b;

    public c(com.fyber.inneractive.sdk.web.e eVar) {
        this.f23858b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23858b.getClass();
        com.fyber.inneractive.sdk.web.e eVar = this.f23858b;
        boolean z10 = eVar.f23951f;
        if (z10) {
            return;
        }
        d dVar = new d(eVar);
        eVar.f23949d = dVar;
        if (z10) {
            return;
        }
        try {
            eVar.f23946a.execute(dVar);
        } catch (NullPointerException e10) {
            IAlog.f("AsyncTaskExecutor : execute(): Unable to execute the null task: %s", e10.getMessage());
        } catch (RejectedExecutionException e11) {
            IAlog.f("AsyncTaskExecutor : execute(): Unable to execute the task: %s", e11.getMessage());
        }
    }
}
