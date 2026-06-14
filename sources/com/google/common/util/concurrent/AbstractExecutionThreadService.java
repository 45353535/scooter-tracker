package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractExecutionThreadService;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C4240b4;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractExecutionThreadService implements Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final LazyLogger f31234b = new LazyLogger(AbstractExecutionThreadService.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Service f31235a;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractService {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ AbstractExecutionThreadService f31236p;

        public static /* synthetic */ void r(AnonymousClass1 anonymousClass1) throws Exception {
            anonymousClass1.getClass();
            try {
                anonymousClass1.f31236p.g();
                anonymousClass1.m();
                if (anonymousClass1.isRunning()) {
                    try {
                        anonymousClass1.f31236p.d();
                    } catch (Throwable th2) {
                        Platform.b(th2);
                        try {
                            anonymousClass1.f31236p.f();
                        } catch (Exception e10) {
                            Platform.b(e10);
                            AbstractExecutionThreadService.f31234b.a().log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e10);
                        }
                        anonymousClass1.l(th2);
                        return;
                    }
                }
                anonymousClass1.f31236p.f();
                anonymousClass1.n();
            } catch (Throwable th3) {
                Platform.b(th3);
                anonymousClass1.l(th3);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void e() {
            MoreExecutors.e(this.f31236p.c(), new Supplier() { // from class: com.google.common.util.concurrent.b
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return this.f31636b.f31236p.e();
                }
            }).execute(new Runnable() { // from class: com.google.common.util.concurrent.c
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    AbstractExecutionThreadService.AnonymousClass1.r(this.f31637b);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void f() {
            this.f31236p.h();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return this.f31236p.toString();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f31235a.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f31235a.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f31235a.awaitTerminated();
    }

    protected Executor c() {
        return new Executor() { // from class: com.google.common.util.concurrent.a
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                MoreExecutors.c(this.f31632b.e(), runnable).start();
            }
        };
    }

    protected abstract void d();

    /* JADX INFO: Access modifiers changed from: protected */
    public String e() {
        return getClass().getSimpleName();
    }

    protected void f() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f31235a.failureCause();
    }

    protected void g() {
    }

    protected void h() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f31235a.isRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        this.f31235a.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f31235a.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.f31235a.stopAsync();
        return this;
    }

    public String toString() {
        return e() + " [" + state() + C4240b4.j.f42674e;
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f31235a.awaitRunning(j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f31235a.awaitTerminated(j10, timeUnit);
    }
}
