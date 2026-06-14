package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Oh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f76196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5252li f76197b;

    public Oh(C5252li c5252li, Throwable th2) {
        this.f76197b = c5252li;
        this.f76196a = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76197b;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).reportUnhandledException(this.f76196a);
    }
}
