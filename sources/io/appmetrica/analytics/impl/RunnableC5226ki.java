package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5226ki implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f77617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f77618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5252li f77619c;

    public RunnableC5226ki(C5252li c5252li, String str, String str2) {
        this.f77619c = c5252li;
        this.f77617a = str;
        this.f77618b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f77619c;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).reportEvent(this.f77617a, this.f77618b);
    }
}
