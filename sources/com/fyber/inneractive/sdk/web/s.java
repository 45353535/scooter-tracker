package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f24044a;

    public s(i0 i0Var) {
        this.f24044a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            i0 i0Var = this.f24044a;
            if (i0Var.V != null) {
                IAlog.a("%sunregistering orientation broadcast receiver", IAlog.a(i0Var));
                this.f24044a.V.a();
            }
        } catch (IllegalArgumentException e10) {
            if (e10.getMessage() != null && !e10.getMessage().contains("Receiver not registered")) {
                throw e10;
            }
        }
        this.f24044a.V = null;
    }
}
