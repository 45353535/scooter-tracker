package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractIdleService;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C4240b4;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractIdleService implements Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Supplier f31270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Service f31271b;

    /* JADX INFO: Access modifiers changed from: private */
    final class DelegateService extends AbstractService {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ AbstractIdleService f31272p;

        public static /* synthetic */ void q(DelegateService delegateService) throws Exception {
            delegateService.getClass();
            try {
                delegateService.f31272p.e();
                delegateService.n();
            } catch (Throwable th2) {
                Platform.b(th2);
                delegateService.l(th2);
            }
        }

        public static /* synthetic */ void r(DelegateService delegateService) throws Exception {
            delegateService.getClass();
            try {
                delegateService.f31272p.f();
                delegateService.m();
            } catch (Throwable th2) {
                Platform.b(th2);
                delegateService.l(th2);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void e() {
            MoreExecutors.e(this.f31272p.c(), this.f31272p.f31270a).execute(new Runnable() { // from class: com.google.common.util.concurrent.f
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    AbstractIdleService.DelegateService.r(this.f31642b);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void f() {
            MoreExecutors.e(this.f31272p.c(), this.f31272p.f31270a).execute(new Runnable() { // from class: com.google.common.util.concurrent.e
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    AbstractIdleService.DelegateService.q(this.f31640b);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return this.f31272p.toString();
        }
    }

    private final class ThreadNameSupplier implements Supplier<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractIdleService f31273b;

        @Override // com.google.common.base.Supplier
        public String get() {
            return this.f31273b.d() + " " + this.f31273b.state();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f31271b.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f31271b.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f31271b.awaitTerminated();
    }

    protected Executor c() {
        return new Executor() { // from class: com.google.common.util.concurrent.d
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                MoreExecutors.c((String) this.f31638b.f31270a.get(), runnable).start();
            }
        };
    }

    protected String d() {
        return getClass().getSimpleName();
    }

    protected abstract void e();

    protected abstract void f();

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f31271b.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f31271b.isRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        this.f31271b.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f31271b.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.f31271b.stopAsync();
        return this;
    }

    public String toString() {
        return d() + " [" + state() + C4240b4.j.f42674e;
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f31271b.awaitRunning(j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f31271b.awaitTerminated(j10, timeUnit);
    }
}
