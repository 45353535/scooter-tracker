package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Xh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f76670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5252li f76671b;

    public Xh(C5252li c5252li, boolean z10) {
        this.f76671b = c5252li;
        this.f76670a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76671b;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).setDataSendingEnabled(this.f76670a);
    }
}
