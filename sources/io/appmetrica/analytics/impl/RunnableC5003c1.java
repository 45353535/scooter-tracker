package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5003c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f76938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76939c;

    public RunnableC5003c1(C5409s1 c5409s1, String str, String str2) {
        this.f76939c = c5409s1;
        this.f76937a = str;
        this.f76938b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f76939c).b(this.f76937a, this.f76938b);
    }
}
