package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class oc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pc f65015a;

    public oc(pc pcVar) {
        this.f65015a = pcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f65015a.c();
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
