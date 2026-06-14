package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class qf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf f65160a;

    public qf(sf sfVar) {
        this.f65160a = sfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f65160a.b();
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
