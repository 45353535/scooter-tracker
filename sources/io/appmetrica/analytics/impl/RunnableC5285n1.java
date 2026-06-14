package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5285n1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f77803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f77804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f77805c;

    public RunnableC5285n1(C5409s1 c5409s1, String str, String str2) {
        this.f77805c = c5409s1;
        this.f77803a = str;
        this.f77804b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f77805c).reportEvent(this.f77803a, this.f77804b);
    }
}
