package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Ph implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5252li f76260a;

    public Ph(C5252li c5252li) {
        this.f76260a = c5252li;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76260a;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).resumeSession();
    }
}
