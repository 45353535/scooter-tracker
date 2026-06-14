package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Kb implements InterfaceC5001c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5105g0 f76020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fn f76021b = new Fn();

    public Kb(@NotNull InterfaceC5105g0 interfaceC5105g0) {
        this.f76020a = interfaceC5105g0;
    }

    public static final void a(Kb kb2, V v10) {
        kb2.f76020a.a(v10);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5001c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArrB;
        Fn fn = this.f76021b;
        Thread threadA = fn.f75798a.a();
        try {
            stackTraceElementArrB = fn.f75798a.b();
            if (stackTraceElementArrB == null) {
                try {
                    stackTraceElementArrB = threadA.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrB = null;
        }
        final V v10 = new V((C5581yn) fn.f75799b.apply(threadA, stackTraceElementArrB), fn.a(threadA, null), fn.f75800c.a());
        ((G9) C5186j4.l().f77467c.a()).f75815b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.jp
            @Override // java.lang.Runnable
            public final void run() {
                Kb.a(this.f77577b, v10);
            }
        });
    }
}
