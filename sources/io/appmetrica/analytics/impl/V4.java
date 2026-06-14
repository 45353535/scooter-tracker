package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class V4 implements InterfaceC5567y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5388r5 f76582a;

    public V4(@NotNull C9 c92, @NotNull S6 s62, @NotNull Vg vg2, @NotNull X4 x42) {
        U4 u42 = new U4(s62, vg2);
        this.f76582a = new C5388r5(c92, u42.a(), u42.b(), x42);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5567y9
    public final InterfaceC5542x9 a() {
        return this.f76582a;
    }

    @NotNull
    public final C5388r5 b() {
        return this.f76582a;
    }
}
