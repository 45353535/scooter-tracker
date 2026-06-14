package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC4968ai implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f76845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5252li f76846b;

    public RunnableC4968ai(C5252li c5252li, ModuleEvent moduleEvent) {
        this.f76846b = c5252li;
        this.f76845a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76846b;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).reportEvent(this.f76845a);
    }
}
