package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Nh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f76168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f76169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5252li f76170d;

    public Nh(C5252li c5252li, String str, String str2, Throwable th2) {
        this.f76170d = c5252li;
        this.f76167a = str;
        this.f76168b = str2;
        this.f76169c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76170d;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).reportError(this.f76167a, this.f76168b, this.f76169c);
    }
}
