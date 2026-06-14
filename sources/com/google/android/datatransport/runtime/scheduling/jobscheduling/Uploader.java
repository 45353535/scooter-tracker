package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public class Uploader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BackendRegistry f24479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventStore f24480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WorkScheduler f24481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f24482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SynchronizationGuard f24483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Clock f24484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Clock f24485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ClientHealthMetricsStore f24486i;

    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, @WallTime Clock clock, @Monotonic Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.f24478a = context;
        this.f24479b = backendRegistry;
        this.f24480c = eventStore;
        this.f24481d = workScheduler;
        this.f24482e = executor;
        this.f24483f = synchronizationGuard;
        this.f24484g = clock;
        this.f24485h = clock2;
        this.f24486i = clientHealthMetricsStore;
    }

    public static /* synthetic */ Object b(Uploader uploader, Iterable iterable, TransportContext transportContext, long j10) {
        uploader.f24480c.recordFailure(iterable);
        uploader.f24480c.recordNextCallTime(transportContext, uploader.f24484g.getTime() + j10);
        return null;
    }

    public static /* synthetic */ Object c(Uploader uploader) {
        uploader.f24486i.resetClientMetrics();
        return null;
    }

    public static /* synthetic */ Object e(Uploader uploader, Iterable iterable) {
        uploader.f24480c.recordSuccess(iterable);
        return null;
    }

    public static /* synthetic */ Object f(Uploader uploader, TransportContext transportContext, int i10) {
        uploader.f24481d.schedule(transportContext, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(Uploader uploader, TransportContext transportContext, long j10) {
        uploader.f24480c.recordNextCallTime(transportContext, uploader.f24484g.getTime() + j10);
        return null;
    }

    public static /* synthetic */ Object h(Uploader uploader, Map map) {
        uploader.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            uploader.f24486i.recordLogEventDropped(((Integer) r0.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final Uploader uploader, final TransportContext transportContext, final int i10, Runnable runnable) {
        uploader.getClass();
        try {
            try {
                SynchronizationGuard synchronizationGuard = uploader.f24483f;
                final EventStore eventStore = uploader.f24480c;
                Objects.requireNonNull(eventStore);
                synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.m
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Integer.valueOf(eventStore.cleanUp());
                    }
                });
                if (uploader.j()) {
                    uploader.logAndUpdateState(transportContext, i10);
                } else {
                    uploader.f24483f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.d
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return Uploader.f(this.f24510a, transportContext, i10);
                        }
                    });
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                uploader.f24481d.schedule(transportContext, i10 + 1);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    @VisibleForTesting
    public EventInternal createMetricsEvent(TransportBackend transportBackend) {
        SynchronizationGuard synchronizationGuard = this.f24483f;
        final ClientHealthMetricsStore clientHealthMetricsStore = this.f24486i;
        Objects.requireNonNull(clientHealthMetricsStore);
        return transportBackend.decorate(EventInternal.builder().setEventMillis(this.f24484g.getTime()).setUptimeMillis(this.f24485h.getTime()).setTransportName("GDT_CLIENT_METRICS").setEncodedPayload(new EncodedPayload(Encoding.of("proto"), ((ClientMetrics) synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.e
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return clientHealthMetricsStore.loadClientMetrics();
            }
        })).toByteArray())).build());
    }

    boolean j() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f24478a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @CanIgnoreReturnValue
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public BackendResponse logAndUpdateState(final TransportContext transportContext, int i10) {
        BackendResponse backendResponseSend;
        TransportBackend transportBackend = this.f24479b.get(transportContext.getBackendName());
        BackendResponse backendResponseOk = BackendResponse.ok(0L);
        final long j10 = 0;
        while (((Boolean) this.f24483f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return Boolean.valueOf(this.f24514a.f24480c.hasPendingEventsFor(transportContext));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f24483f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return this.f24516a.f24480c.loadBatch(transportContext);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return backendResponseOk;
            }
            if (transportBackend == null) {
                Logging.d("Uploader", "Unknown backend for %s, deleting event batch for it...", transportContext);
                backendResponseSend = BackendResponse.fatalError();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PersistedEvent) it.next()).getEvent());
                }
                if (transportContext.shouldUploadClientHealthMetrics()) {
                    arrayList.add(createMetricsEvent(transportBackend));
                }
                backendResponseSend = transportBackend.send(BackendRequest.builder().setEvents(arrayList).setExtras(transportContext.getExtras()).build());
            }
            backendResponseOk = backendResponseSend;
            if (backendResponseOk.getStatus() == BackendResponse.Status.TRANSIENT_ERROR) {
                final TransportContext transportContext2 = transportContext;
                this.f24483f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.b(this.f24518a, iterable, transportContext2, j10);
                    }
                });
                this.f24481d.schedule(transportContext2, i10 + 1, true);
                return backendResponseOk;
            }
            TransportContext transportContext3 = transportContext;
            this.f24483f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return Uploader.e(this.f24522a, iterable);
                }
            });
            if (backendResponseOk.getStatus() == BackendResponse.Status.OK) {
                long jMax = Math.max(j10, backendResponseOk.getNextRequestWaitMillis());
                if (transportContext3.shouldUploadClientHealthMetrics()) {
                    this.f24483f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.j
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return Uploader.c(this.f24524a);
                        }
                    });
                }
                j10 = jMax;
            } else if (backendResponseOk.getStatus() == BackendResponse.Status.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String transportName = ((PersistedEvent) it2.next()).getEvent().getTransportName();
                    if (map.containsKey(transportName)) {
                        map.put(transportName, Integer.valueOf(((Integer) map.get(transportName)).intValue() + 1));
                    } else {
                        map.put(transportName, 1);
                    }
                }
                this.f24483f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.k
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.h(this.f24525a, map);
                    }
                });
            }
            transportContext = transportContext3;
        }
        final TransportContext transportContext4 = transportContext;
        this.f24483f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.l
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return Uploader.g(this.f24527a, transportContext4, j10);
            }
        });
        return backendResponseOk;
    }

    public void upload(final TransportContext transportContext, final int i10, final Runnable runnable) {
        this.f24482e.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.c
            @Override // java.lang.Runnable
            public final void run() {
                Uploader.i(this.f24506b, transportContext, i10, runnable);
            }
        });
    }
}
