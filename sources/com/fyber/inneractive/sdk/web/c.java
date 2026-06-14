package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f23933a;

    public c(i1 i1Var) {
        this.f23933a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.e("Removing clicked state after timeout", new Object[0]);
        this.f23933a.i();
    }
}
