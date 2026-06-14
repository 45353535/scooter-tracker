package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class L0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76042b;

    public L0(C5409s1 c5409s1, String str) {
        this.f76042b = c5409s1;
        this.f76041a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76042b.d().f78070b.a(this.f76041a, false);
    }
}
