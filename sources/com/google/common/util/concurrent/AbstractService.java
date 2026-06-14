package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C4240b4;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractService implements Service {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ListenerCallQueue.Event f31302h = new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.1
        public String toString() {
            return "starting()";
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(Service.Listener listener) {
            listener.starting();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ListenerCallQueue.Event f31303i = new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.2
        public String toString() {
            return "running()";
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(Service.Listener listener) {
            listener.running();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ListenerCallQueue.Event f31304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final ListenerCallQueue.Event f31305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ListenerCallQueue.Event f31306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ListenerCallQueue.Event f31307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ListenerCallQueue.Event f31308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final ListenerCallQueue.Event f31309o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Monitor f31310a = new Monitor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Monitor.Guard f31311b = new IsStartableGuard();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Monitor.Guard f31312c = new IsStoppableGuard();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Monitor.Guard f31313d = new HasReachedRunningGuard();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Monitor.Guard f31314e = new IsStoppedGuard();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ListenerCallQueue f31315f = new ListenerCallQueue();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile StateSnapshot f31316g = new StateSnapshot(Service.State.NEW);

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31322a;

        static {
            int[] iArr = new int[Service.State.values().length];
            f31322a = iArr;
            try {
                iArr[Service.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31322a[Service.State.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31322a[Service.State.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31322a[Service.State.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31322a[Service.State.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31322a[Service.State.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private final class HasReachedRunningGuard extends Monitor.Guard {
        HasReachedRunningGuard() {
            super(AbstractService.this.f31310a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state().compareTo(Service.State.RUNNING) >= 0;
        }
    }

    private final class IsStartableGuard extends Monitor.Guard {
        IsStartableGuard() {
            super(AbstractService.this.f31310a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state() == Service.State.NEW;
        }
    }

    private final class IsStoppableGuard extends Monitor.Guard {
        IsStoppableGuard() {
            super(AbstractService.this.f31310a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state().compareTo(Service.State.RUNNING) <= 0;
        }
    }

    private final class IsStoppedGuard extends Monitor.Guard {
        IsStoppedGuard() {
            super(AbstractService.this.f31310a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state().compareTo(Service.State.TERMINATED) >= 0;
        }
    }

    private static final class StateSnapshot {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Service.State f31327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f31328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Throwable f31329c;

        StateSnapshot(Service.State state) {
            this(state, false, null);
        }

        Service.State a() {
            return (this.f31328b && this.f31327a == Service.State.STARTING) ? Service.State.STOPPING : this.f31327a;
        }

        Throwable b() {
            Service.State state = this.f31327a;
            Preconditions.checkState(state == Service.State.FAILED, "failureCause() is only valid if the service has failed, service is %s", state);
            Throwable th2 = this.f31329c;
            Objects.requireNonNull(th2);
            return th2;
        }

        StateSnapshot(Service.State state, boolean z10, Throwable th2) {
            Preconditions.checkArgument(!z10 || state == Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", state);
            Preconditions.checkArgument((th2 != null) == (state == Service.State.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th2);
            this.f31327a = state;
            this.f31328b = z10;
            this.f31329c = th2;
        }
    }

    static {
        Service.State state = Service.State.STARTING;
        f31304j = o(state);
        Service.State state2 = Service.State.RUNNING;
        f31305k = o(state2);
        f31306l = p(Service.State.NEW);
        f31307m = p(state);
        f31308n = p(state2);
        f31309o = p(Service.State.STOPPING);
    }

    protected AbstractService() {
    }

    private void b(Service.State state) {
        Service.State state2 = state();
        if (state2 != state) {
            if (state2 == Service.State.FAILED) {
                throw new IllegalStateException("Expected the service " + this + " to be " + state + ", but the service has FAILED", failureCause());
            }
            throw new IllegalStateException("Expected the service " + this + " to be " + state + ", but was " + state2);
        }
    }

    private void c() throws Exception {
        if (this.f31310a.isOccupiedByCurrentThread()) {
            return;
        }
        this.f31315f.dispatch();
    }

    private void g(final Service.State state, final Throwable th2) {
        this.f31315f.enqueue(new ListenerCallQueue.Event<Service.Listener>(this) { // from class: com.google.common.util.concurrent.AbstractService.5

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractService f31321c;

            {
                this.f31321c = this;
            }

            public String toString() {
                return "failed({from = " + state + ", cause = " + th2 + "})";
            }

            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(Service.Listener listener) {
                listener.failed(state, th2);
            }
        });
    }

    private void h() {
        this.f31315f.enqueue(f31303i);
    }

    private void i() {
        this.f31315f.enqueue(f31302h);
    }

    private void j(Service.State state) {
        if (state == Service.State.STARTING) {
            this.f31315f.enqueue(f31304j);
        } else {
            if (state != Service.State.RUNNING) {
                throw new AssertionError();
            }
            this.f31315f.enqueue(f31305k);
        }
    }

    private void k(Service.State state) {
        switch (AnonymousClass6.f31322a[state.ordinal()]) {
            case 1:
                this.f31315f.enqueue(f31306l);
                return;
            case 2:
                this.f31315f.enqueue(f31307m);
                return;
            case 3:
                this.f31315f.enqueue(f31308n);
                return;
            case 4:
                this.f31315f.enqueue(f31309o);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    private static ListenerCallQueue.Event o(final Service.State state) {
        return new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.4
            public String toString() {
                return "stopping({from = " + state + "})";
            }

            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(Service.Listener listener) {
                listener.stopping(state);
            }
        };
    }

    private static ListenerCallQueue.Event p(final Service.State state) {
        return new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.3
            public String toString() {
                return "terminated({from = " + state + "})";
            }

            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(Service.Listener listener) {
                listener.terminated(state);
            }
        };
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f31315f.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f31310a.enterWhenUninterruptibly(this.f31313d);
        try {
            b(Service.State.RUNNING);
        } finally {
            this.f31310a.leave();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f31310a.enterWhenUninterruptibly(this.f31314e);
        try {
            b(Service.State.TERMINATED);
        } finally {
            this.f31310a.leave();
        }
    }

    protected void d() {
    }

    protected abstract void e();

    protected abstract void f();

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f31316g.b();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return state() == Service.State.RUNNING;
    }

    protected final void l(Throwable th2) throws Exception {
        Preconditions.checkNotNull(th2);
        this.f31310a.enter();
        try {
            Service.State state = state();
            int i10 = AnonymousClass6.f31322a[state.ordinal()];
            if (i10 != 1) {
                if (i10 == 2 || i10 == 3 || i10 == 4) {
                    this.f31316g = new StateSnapshot(Service.State.FAILED, false, th2);
                    g(state, th2);
                } else if (i10 != 5) {
                }
                return;
            }
            throw new IllegalStateException("Failed while in state:" + state, th2);
        } finally {
            this.f31310a.leave();
            c();
        }
    }

    protected final void m() throws Exception {
        this.f31310a.enter();
        try {
            if (this.f31316g.f31327a != Service.State.STARTING) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStarted() when the service is " + this.f31316g.f31327a);
                l(illegalStateException);
                throw illegalStateException;
            }
            if (this.f31316g.f31328b) {
                this.f31316g = new StateSnapshot(Service.State.STOPPING);
                f();
            } else {
                this.f31316g = new StateSnapshot(Service.State.RUNNING);
                h();
            }
            this.f31310a.leave();
            c();
        } catch (Throwable th2) {
            this.f31310a.leave();
            c();
            throw th2;
        }
    }

    protected final void n() throws Exception {
        this.f31310a.enter();
        try {
            Service.State state = state();
            switch (AnonymousClass6.f31322a[state.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    throw new IllegalStateException("Cannot notifyStopped() when the service is " + state);
                case 2:
                case 3:
                case 4:
                    this.f31316g = new StateSnapshot(Service.State.TERMINATED);
                    k(state);
                    break;
            }
        } finally {
            this.f31310a.leave();
            c();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() throws Exception {
        if (!this.f31310a.enterIf(this.f31311b)) {
            throw new IllegalStateException("Service " + this + " has already been started");
        }
        try {
            this.f31316g = new StateSnapshot(Service.State.STARTING);
            i();
            e();
            return this;
        } catch (Throwable th2) {
            try {
                Platform.b(th2);
                l(th2);
                return this;
            } finally {
                this.f31310a.leave();
                c();
            }
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f31316g.a();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() throws Exception {
        if (this.f31310a.enterIf(this.f31312c)) {
            try {
                Service.State state = state();
                switch (AnonymousClass6.f31322a[state.ordinal()]) {
                    case 1:
                        this.f31316g = new StateSnapshot(Service.State.TERMINATED);
                        k(Service.State.NEW);
                        break;
                    case 2:
                        Service.State state2 = Service.State.STARTING;
                        this.f31316g = new StateSnapshot(state2, true, null);
                        j(state2);
                        d();
                        break;
                    case 3:
                        this.f31316g = new StateSnapshot(Service.State.STOPPING);
                        j(Service.State.RUNNING);
                        f();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        throw new AssertionError("isStoppable is incorrectly implemented, saw: " + state);
                }
                return this;
            } catch (Throwable th2) {
                try {
                    Platform.b(th2);
                    l(th2);
                } finally {
                    this.f31310a.leave();
                    c();
                }
            }
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + " [" + state() + C4240b4.j.f42674e;
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j10, TimeUnit timeUnit) throws TimeoutException {
        if (this.f31310a.enterWhenUninterruptibly(this.f31313d, j10, timeUnit)) {
            try {
                b(Service.State.RUNNING);
            } finally {
                this.f31310a.leave();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach the RUNNING state.");
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j10, TimeUnit timeUnit) throws TimeoutException {
        if (this.f31310a.enterWhenUninterruptibly(this.f31314e, j10, timeUnit)) {
            try {
                b(Service.State.TERMINATED);
            } finally {
                this.f31310a.leave();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach a terminal state. Current state: " + state());
        }
    }
}
