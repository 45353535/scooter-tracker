package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5220kc implements InterfaceC5567y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5388r5 f77604a;

    public C5220kc(@NotNull C9 c92, @NotNull S6 s62, @NotNull Vg vg2, @NotNull C5487v4 c5487v4, @NotNull X4 x42, @NotNull C4991bf c4991bf) {
        C5194jc c5194jc = new C5194jc(s62, vg2, this, c5487v4, c4991bf);
        this.f77604a = new C5388r5(c92, c5194jc.a(), c5194jc.b(), x42);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5567y9
    public final InterfaceC5542x9 a() {
        return this.f77604a;
    }

    @NotNull
    public final C5388r5 b() {
        return this.f77604a;
    }
}
