package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5200ji implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f77530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5252li f77531b;

    public RunnableC5200ji(C5252li c5252li, String str) {
        this.f77531b = c5252li;
        this.f77530a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f77531b;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).reportEvent(this.f77530a);
    }
}
