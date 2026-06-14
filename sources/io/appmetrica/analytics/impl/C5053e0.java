package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5053e0 implements En {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5079f0 f77044a;

    public C5053e0(C5079f0 c5079f0) {
        this.f77044a = c5079f0;
    }

    @Override // io.appmetrica.analytics.impl.En
    @NotNull
    public final Thread a() {
        return this.f77044a.f77140b;
    }

    @Override // io.appmetrica.analytics.impl.En
    @Nullable
    public final StackTraceElement[] b() {
        C5079f0 c5079f0 = this.f77044a;
        return (StackTraceElement[]) c5079f0.f77139a.get(c5079f0.f77140b);
    }

    @Override // io.appmetrica.analytics.impl.En
    @NotNull
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f77044a.f77139a;
    }
}
