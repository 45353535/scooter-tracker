package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5158i1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f77364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f77365b;

    public RunnableC5158i1(C5409s1 c5409s1, AnrListener anrListener) {
        this.f77365b = c5409s1;
        this.f77364a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f77365b).a(this.f77364a);
    }
}
