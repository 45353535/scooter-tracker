package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* JADX INFO: loaded from: classes12.dex */
public final class Kj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f76028a;

    public Kj(ModuleEvent moduleEvent) {
        this.f76028a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.reportEvent(this.f76028a);
    }
}
