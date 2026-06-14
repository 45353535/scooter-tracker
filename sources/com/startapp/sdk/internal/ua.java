package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class ua implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f65341a;

    public ua(za zaVar) {
        this.f65341a = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f65341a.J;
        if (runnable != null) {
            runnable.run();
        }
    }
}
