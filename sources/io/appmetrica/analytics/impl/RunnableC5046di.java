package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5046di implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sn f77019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5252li f77020b;

    public RunnableC5046di(C5252li c5252li, Sn sn) {
        this.f77020b = c5252li;
        this.f77019a = sn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f77020b;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).a(this.f77019a);
    }
}
