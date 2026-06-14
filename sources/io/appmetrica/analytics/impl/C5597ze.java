package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5597ze implements X8, Ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S6 f78631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f78632b;

    public C5597ze(@NotNull S6 s62) {
        this.f78631a = s62;
        this.f78632b = new AtomicLong(s62.b());
        s62.a(this);
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void a(@NotNull List<Integer> list) {
        this.f78632b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void b(@NotNull List<Integer> list) {
        this.f78632b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void a() {
        this.f78632b.set(this.f78631a.b());
    }

    public final long b() {
        return this.f78632b.get();
    }
}
