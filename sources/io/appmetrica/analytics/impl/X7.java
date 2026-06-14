package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class X7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Kc f76664a;

    public X7() {
        Kc kc2 = new Kc(0);
        kc2.a(Y7.f76694b, 0);
        kc2.a(Y7.f76695c, 1);
        kc2.a(Y7.f76696d, 2);
        kc2.a(Y7.f76697e, 3);
        this.f76664a = kc2;
    }

    @NotNull
    public final Kc a() {
        return this.f76664a;
    }

    public abstract boolean a(Object obj, Object obj2);
}
