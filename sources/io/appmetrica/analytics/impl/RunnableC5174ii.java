package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5174ii implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5252li f77436a;

    public RunnableC5174ii(C5252li c5252li) {
        this.f77436a = c5252li;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f77436a;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).clearAppEnvironment();
    }
}
