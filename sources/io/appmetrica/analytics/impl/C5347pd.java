package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5347pd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5471ud f77980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f77981b;

    public C5347pd(C5471ud c5471ud, ModuleEvent moduleEvent) {
        this.f77980a = c5471ud;
        this.f77981b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5471ud.a(this.f77980a).reportEvent(this.f77981b);
    }
}
