package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Mh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f76136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5252li f76137c;

    public Mh(C5252li c5252li, String str, Throwable th2) {
        this.f76137c = c5252li;
        this.f76135a = str;
        this.f76136b = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76137c;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).reportError(this.f76135a, this.f76136b);
    }
}
