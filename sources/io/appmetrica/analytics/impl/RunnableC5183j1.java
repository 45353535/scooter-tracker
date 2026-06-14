package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5183j1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f77456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f77457b;

    public RunnableC5183j1(C5409s1 c5409s1, ExternalAttribution externalAttribution) {
        this.f77457b = c5409s1;
        this.f77456a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f77457b).a(this.f77456a);
    }
}
