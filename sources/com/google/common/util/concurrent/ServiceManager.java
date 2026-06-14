package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Ordering;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class ServiceManager implements ServiceManagerBridge {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final LazyLogger f31557c = new LazyLogger(ServiceManager.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ListenerCallQueue.Event f31558d = new ListenerCallQueue.Event<Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.1
        public String toString() {
            return "healthy()";
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(Listener listener) {
            listener.healthy();
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ListenerCallQueue.Event f31559e = new ListenerCallQueue.Event<Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.2
        public String toString() {
            return "stopped()";
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(Listener listener) {
            listener.stopped();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ServiceManagerState f31560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableList f31561b;

    private static final class EmptyServiceManagerWarning extends Throwable {
        private EmptyServiceManagerWarning() {
        }
    }

    private static final class FailedService extends Throwable {
        FailedService(Service service) {
            super(service.toString(), service.failureCause(), false, false);
        }
    }

    public static abstract class Listener {
        public void failure(Service service) {
        }

        public void healthy() {
        }

        public void stopped() {
        }
    }

    private static final class NoOpService extends AbstractService {
        private NoOpService() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void e() throws Exception {
            m();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void f() throws Exception {
            n();
        }
    }

    private static final class ServiceListener extends Service.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Service f31562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WeakReference f31563b;

        ServiceListener(Service service, WeakReference weakReference) {
            this.f31562a = service;
            this.f31563b = weakReference;
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(Service.State state, Throwable th2) throws Exception {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f31563b.get();
            if (serviceManagerState != null) {
                if ((!(this.f31562a instanceof NoOpService)) & (state != Service.State.STARTING)) {
                    ServiceManager.f31557c.a().log(Level.SEVERE, "Service " + this.f31562a + " has failed in the " + state + " state.", th2);
                }
                serviceManagerState.n(this.f31562a, state, Service.State.FAILED);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void running() throws Exception {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f31563b.get();
            if (serviceManagerState != null) {
                serviceManagerState.n(this.f31562a, Service.State.STARTING, Service.State.RUNNING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void starting() throws Exception {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f31563b.get();
            if (serviceManagerState != null) {
                serviceManagerState.n(this.f31562a, Service.State.NEW, Service.State.STARTING);
                if (this.f31562a instanceof NoOpService) {
                    return;
                }
                ServiceManager.f31557c.a().log(Level.FINE, "Starting {0}.", this.f31562a);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void stopping(Service.State state) throws Exception {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f31563b.get();
            if (serviceManagerState != null) {
                serviceManagerState.n(this.f31562a, state, Service.State.STOPPING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(Service.State state) throws Exception {
            ServiceManagerState serviceManagerState = (ServiceManagerState) this.f31563b.get();
            if (serviceManagerState != null) {
                if (!(this.f31562a instanceof NoOpService)) {
                    ServiceManager.f31557c.a().log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.f31562a, state});
                }
                serviceManagerState.n(this.f31562a, state, Service.State.TERMINATED);
            }
        }
    }

    private static final class ServiceManagerState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Monitor f31564a = new Monitor();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SetMultimap f31565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Multiset f31566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final IdentityHashMap f31567d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f31568e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f31569f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f31570g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Monitor.Guard f31571h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final Monitor.Guard f31572i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final ListenerCallQueue f31573j;

        final class AwaitHealthGuard extends Monitor.Guard {
            AwaitHealthGuard() {
                super(ServiceManagerState.this.f31564a);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            @GuardedBy("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
                int iCount = ServiceManagerState.this.f31566c.count(Service.State.RUNNING);
                ServiceManagerState serviceManagerState = ServiceManagerState.this;
                return iCount == serviceManagerState.f31570g || serviceManagerState.f31566c.contains(Service.State.STOPPING) || ServiceManagerState.this.f31566c.contains(Service.State.TERMINATED) || ServiceManagerState.this.f31566c.contains(Service.State.FAILED);
            }
        }

        final class StoppedGuard extends Monitor.Guard {
            StoppedGuard() {
                super(ServiceManagerState.this.f31564a);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            @GuardedBy("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
                return ServiceManagerState.this.f31566c.count(Service.State.TERMINATED) + ServiceManagerState.this.f31566c.count(Service.State.FAILED) == ServiceManagerState.this.f31570g;
            }
        }

        ServiceManagerState(ImmutableCollection immutableCollection) {
            SetMultimap setMultimapBuild = MultimapBuilder.enumKeys(Service.State.class).linkedHashSetValues().build();
            this.f31565b = setMultimapBuild;
            this.f31566c = setMultimapBuild.keys();
            this.f31567d = new IdentityHashMap();
            this.f31571h = new AwaitHealthGuard();
            this.f31572i = new StoppedGuard();
            this.f31573j = new ListenerCallQueue();
            this.f31570g = immutableCollection.size();
            setMultimapBuild.putAll(Service.State.NEW, immutableCollection);
        }

        void a(Listener listener, Executor executor) {
            this.f31573j.addListener(listener, executor);
        }

        void b() {
            this.f31564a.enterWhenUninterruptibly(this.f31571h);
            try {
                f();
            } finally {
                this.f31564a.leave();
            }
        }

        void c(long j10, TimeUnit timeUnit) {
            this.f31564a.enter();
            try {
                if (this.f31564a.waitForUninterruptibly(this.f31571h, j10, timeUnit)) {
                    f();
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to become healthy. The following services have not started: " + Multimaps.filterKeys(this.f31565b, Predicates.in(ImmutableSet.of(Service.State.NEW, Service.State.STARTING))));
            } finally {
                this.f31564a.leave();
            }
        }

        void d() {
            this.f31564a.enterWhenUninterruptibly(this.f31572i);
            this.f31564a.leave();
        }

        void e(long j10, TimeUnit timeUnit) {
            this.f31564a.enter();
            try {
                if (this.f31564a.waitForUninterruptibly(this.f31572i, j10, timeUnit)) {
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to stop. The following services have not stopped: " + Multimaps.filterKeys(this.f31565b, Predicates.not(Predicates.in(EnumSet.of(Service.State.TERMINATED, Service.State.FAILED)))));
            } finally {
                this.f31564a.leave();
            }
        }

        void f() {
            Multiset multiset = this.f31566c;
            Service.State state = Service.State.RUNNING;
            if (multiset.count(state) != this.f31570g) {
                IllegalStateException illegalStateException = new IllegalStateException("Expected to be healthy after starting. The following services are not running: " + Multimaps.filterKeys(this.f31565b, Predicates.not(Predicates.equalTo(state))));
                Iterator it = this.f31565b.get(Service.State.FAILED).iterator();
                while (it.hasNext()) {
                    illegalStateException.addSuppressed(new FailedService((Service) it.next()));
                }
                throw illegalStateException;
            }
        }

        void g() throws Exception {
            Preconditions.checkState(!this.f31564a.isOccupiedByCurrentThread(), "It is incorrect to execute listeners with the monitor held.");
            this.f31573j.dispatch();
        }

        void h(final Service service) {
            this.f31573j.enqueue(new ListenerCallQueue.Event<Listener>(this) { // from class: com.google.common.util.concurrent.ServiceManager.ServiceManagerState.2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ServiceManagerState f31576b;

                {
                    this.f31576b = this;
                }

                public String toString() {
                    return "failed({service=" + service + "})";
                }

                @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
                public void call(Listener listener) {
                    listener.failure(service);
                }
            });
        }

        void i() {
            this.f31573j.enqueue(ServiceManager.f31558d);
        }

        void j() {
            this.f31573j.enqueue(ServiceManager.f31559e);
        }

        void k() {
            this.f31564a.enter();
            try {
                if (!this.f31569f) {
                    this.f31568e = true;
                    return;
                }
                ArrayList arrayListNewArrayList = Lists.newArrayList();
                UnmodifiableIterator it = l().values().iterator();
                while (it.hasNext()) {
                    Service service = (Service) it.next();
                    if (service.state() != Service.State.NEW) {
                        arrayListNewArrayList.add(service);
                    }
                }
                throw new IllegalArgumentException("Services started transitioning asynchronously before the ServiceManager was constructed: " + arrayListNewArrayList);
            } finally {
                this.f31564a.leave();
            }
        }

        ImmutableSetMultimap l() {
            ImmutableSetMultimap.Builder builder = ImmutableSetMultimap.builder();
            this.f31564a.enter();
            try {
                for (Map.Entry entry : this.f31565b.entries()) {
                    if (!(entry.getValue() instanceof NoOpService)) {
                        builder.put(entry);
                    }
                }
                this.f31564a.leave();
                return builder.build();
            } catch (Throwable th2) {
                this.f31564a.leave();
                throw th2;
            }
        }

        ImmutableMap m() {
            this.f31564a.enter();
            try {
                ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(this.f31567d.size());
                for (Map.Entry entry : this.f31567d.entrySet()) {
                    Service service = (Service) entry.getKey();
                    Stopwatch stopwatch = (Stopwatch) entry.getValue();
                    if (!stopwatch.isRunning() && !(service instanceof NoOpService)) {
                        arrayListNewArrayListWithCapacity.add(Maps.immutableEntry(service, Long.valueOf(stopwatch.elapsed(TimeUnit.MILLISECONDS))));
                    }
                }
                this.f31564a.leave();
                Collections.sort(arrayListNewArrayListWithCapacity, Ordering.natural().onResultOf(new Function<Map.Entry<Service, Long>, Long>() { // from class: com.google.common.util.concurrent.ServiceManager.ServiceManagerState.1
                    @Override // com.google.common.base.Function
                    public Long apply(Map.Entry<Service, Long> entry2) {
                        return entry2.getValue();
                    }
                }));
                return ImmutableMap.copyOf(arrayListNewArrayListWithCapacity);
            } catch (Throwable th2) {
                this.f31564a.leave();
                throw th2;
            }
        }

        void n(Service service, Service.State state, Service.State state2) throws Exception {
            Preconditions.checkNotNull(service);
            Preconditions.checkArgument(state != state2);
            this.f31564a.enter();
            try {
                this.f31569f = true;
                if (this.f31568e) {
                    Preconditions.checkState(this.f31565b.remove(state, service), "Service %s not at the expected location in the state map %s", service, state);
                    Preconditions.checkState(this.f31565b.put(state2, service), "Service %s in the state map unexpectedly at %s", service, state2);
                    Stopwatch stopwatchCreateStarted = (Stopwatch) this.f31567d.get(service);
                    if (stopwatchCreateStarted == null) {
                        stopwatchCreateStarted = Stopwatch.createStarted();
                        this.f31567d.put(service, stopwatchCreateStarted);
                    }
                    Service.State state3 = Service.State.RUNNING;
                    if (state2.compareTo(state3) >= 0 && stopwatchCreateStarted.isRunning()) {
                        stopwatchCreateStarted.stop();
                        if (!(service instanceof NoOpService)) {
                            ServiceManager.f31557c.a().log(Level.FINE, "Started {0} in {1}.", new Object[]{service, stopwatchCreateStarted});
                        }
                    }
                    Service.State state4 = Service.State.FAILED;
                    if (state2 == state4) {
                        h(service);
                    }
                    if (this.f31566c.count(state3) == this.f31570g) {
                        i();
                    } else if (this.f31566c.count(Service.State.TERMINATED) + this.f31566c.count(state4) == this.f31570g) {
                        j();
                    }
                }
                this.f31564a.leave();
                g();
            } catch (Throwable th2) {
                this.f31564a.leave();
                g();
                throw th2;
            }
        }

        void o(Service service) {
            this.f31564a.enter();
            try {
                if (((Stopwatch) this.f31567d.get(service)) == null) {
                    this.f31567d.put(service, Stopwatch.createStarted());
                }
            } finally {
                this.f31564a.leave();
            }
        }
    }

    public ServiceManager(Iterable<? extends Service> iterable) {
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(iterable);
        if (immutableListCopyOf.isEmpty()) {
            f31557c.a().log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", (Throwable) new EmptyServiceManagerWarning());
            immutableListCopyOf = ImmutableList.of(new NoOpService());
        }
        ServiceManagerState serviceManagerState = new ServiceManagerState(immutableListCopyOf);
        this.f31560a = serviceManagerState;
        this.f31561b = immutableListCopyOf;
        WeakReference weakReference = new WeakReference(serviceManagerState);
        UnmodifiableIterator it = immutableListCopyOf.iterator();
        while (it.hasNext()) {
            Service service = (Service) it.next();
            service.addListener(new ServiceListener(service, weakReference), MoreExecutors.directExecutor());
            Preconditions.checkArgument(service.state() == Service.State.NEW, "Can only manage NEW services, %s", service);
        }
        this.f31560a.k();
    }

    public void addListener(Listener listener, Executor executor) {
        this.f31560a.a(listener, executor);
    }

    public void awaitHealthy() {
        this.f31560a.b();
    }

    public void awaitStopped() {
        this.f31560a.d();
    }

    public boolean isHealthy() {
        UnmodifiableIterator it = this.f31561b.iterator();
        while (it.hasNext()) {
            if (!((Service) it.next()).isRunning()) {
                return false;
            }
        }
        return true;
    }

    @CanIgnoreReturnValue
    public ServiceManager startAsync() {
        UnmodifiableIterator it = this.f31561b.iterator();
        while (it.hasNext()) {
            Preconditions.checkState(((Service) it.next()).state() == Service.State.NEW, "Not all services are NEW, cannot start %s", this);
        }
        UnmodifiableIterator it2 = this.f31561b.iterator();
        while (it2.hasNext()) {
            Service service = (Service) it2.next();
            try {
                this.f31560a.o(service);
                service.startAsync();
            } catch (IllegalStateException e10) {
                f31557c.a().log(Level.WARNING, "Unable to start Service " + service, (Throwable) e10);
            }
        }
        return this;
    }

    public ImmutableMap<Service, Long> startupTimes() {
        return this.f31560a.m();
    }

    @CanIgnoreReturnValue
    public ServiceManager stopAsync() {
        UnmodifiableIterator it = this.f31561b.iterator();
        while (it.hasNext()) {
            ((Service) it.next()).stopAsync();
        }
        return this;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Class<?>) ServiceManager.class).add("services", Collections2.filter(this.f31561b, Predicates.not(Predicates.instanceOf(NoOpService.class)))).toString();
    }

    public void awaitHealthy(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f31560a.c(j10, timeUnit);
    }

    public void awaitStopped(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f31560a.e(j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.ServiceManagerBridge
    public ImmutableSetMultimap<Service.State, Service> servicesByState() {
        return this.f31560a.l();
    }
}
