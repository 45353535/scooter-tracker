package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Ch implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Bh f75623d = new Bh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5334p0 f75624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5049dl f75625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75626c;

    public Ch(C5334p0 c5334p0, InterfaceC5049dl interfaceC5049dl) {
        this.f75624a = c5334p0;
        this.f75625b = interfaceC5049dl;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(@Nullable Throwable th2) {
    }

    @NotNull
    public final C5334p0 b() {
        return this.f75624a;
    }

    public boolean c() {
        C5334p0 c5334p0 = this.f75624a;
        synchronized (c5334p0) {
            try {
                if (c5334p0.f77943d == null) {
                    c5334p0.f77944e = new CountDownLatch(1);
                    Intent intentA = Ek.a(c5334p0.f77940a);
                    try {
                        c5334p0.f77946g.b(c5334p0.f77940a);
                        c5334p0.f77940a.bindService(intentA, c5334p0.f77948i, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f75624a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return Unit.f93236a;
    }

    public final boolean d() {
        return this.f75626c;
    }

    public final void a(boolean z10) {
        this.f75626c = z10;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f75626c) {
                return;
            }
            this.f75626c = true;
            int i10 = 0;
            do {
                C5334p0 c5334p0 = this.f75624a;
                synchronized (c5334p0) {
                    iAppMetricaService = c5334p0.f77943d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        InterfaceC5049dl interfaceC5049dl = this.f75625b;
                        if (interfaceC5049dl != null && !((C5302ni) interfaceC5049dl).a()) {
                            return;
                        }
                        this.f75624a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i10++;
                if (!c() || X1.f76650e.get()) {
                    return;
                }
            } while (i10 < 3);
        } catch (Throwable th2) {
            a(th2);
        }
    }
}
