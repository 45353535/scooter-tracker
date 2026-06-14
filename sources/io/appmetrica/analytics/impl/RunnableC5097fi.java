package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5097fi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f77166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5252li f77167b;

    public RunnableC5097fi(C5252li c5252li, V v10) {
        this.f77167b = c5252li;
        this.f77166a = v10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f77167b;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).a(this.f77166a);
    }
}
