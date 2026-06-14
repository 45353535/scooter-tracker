package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC4951a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f76774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76775c;

    public RunnableC4951a1(C5409s1 c5409s1, String str, String str2) {
        this.f76775c = c5409s1;
        this.f76773a = str;
        this.f76774b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5533x0 c5533x0 = this.f76775c.f78196a;
        String str = this.f76773a;
        String str2 = this.f76774b;
        c5533x0.getClass();
        C5508w0.c().a(str, str2);
    }
}
