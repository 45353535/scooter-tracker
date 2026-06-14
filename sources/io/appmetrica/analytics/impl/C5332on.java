package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.on, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C5332on implements InterfaceC5354pk, C9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final La f77929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ol f77930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f77931c = new AtomicBoolean(false);

    public C5332on(@NotNull La la2, @NotNull Ol ol) {
        this.f77929a = la2;
        this.f77930b = ol;
        Objects.toString(la2.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.f77931c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f77931c.get()) {
            return;
        }
        f();
        a();
    }

    @NotNull
    public final La d() {
        return this.f77929a;
    }

    public final boolean e() {
        return this.f77931c.get();
    }

    public void f() {
        this.f77930b.a();
    }

    public void g() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5354pk
    public final void onCreate() {
        this.f77931c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5354pk
    public final void onDestroy() {
        if (this.f77931c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(@NotNull NetworkTask networkTask) {
        C5468ua.H.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }
}
