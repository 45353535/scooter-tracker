package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4224a6 implements InterfaceC4381ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final He f42318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f42319b;

    public C4224a6(@NotNull InterfaceC4412l7 applicationLifecycleService, @NotNull He task) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        Intrinsics.checkNotNullParameter(task, "task");
        this.f42318a = task;
        applicationLifecycleService.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.f42319b;
    }

    private final void f() {
        this.f42319b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC4381ja
    public void a() {
        this.f42318a.a(Long.valueOf(e()));
        this.f42318a.run();
    }

    @Override // com.ironsource.InterfaceC4381ja
    public void b() {
        f();
    }

    @Override // com.ironsource.InterfaceC4381ja
    public void c() {
    }

    @Override // com.ironsource.InterfaceC4381ja
    public void d() {
    }
}
