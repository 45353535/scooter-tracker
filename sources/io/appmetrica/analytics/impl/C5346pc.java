package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5346pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f77978a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5052e f77979b;

    public C5346pc(InterfaceC5105g0 interfaceC5105g0) {
        this.f77979b = new C5052e(new Kb(interfaceC5105g0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C5052e c5052e = this.f77979b;
        c5052e.f77038a.add(new InterfaceC5001c() { // from class: io.appmetrica.analytics.impl.qq
            @Override // io.appmetrica.analytics.impl.InterfaceC5001c
            public final void onAppNotResponding() {
                C5346pc.b(anrListener);
            }
        });
    }
}
