package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultScheduler implements Scheduler {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f24443f = Logger.getLogger(TransportRuntime.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkScheduler f24444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f24445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BackendRegistry f24446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EventStore f24447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SynchronizationGuard f24448e;

    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.f24445b = executor;
        this.f24446c = backendRegistry;
        this.f24444a = workScheduler;
        this.f24447d = eventStore;
        this.f24448e = synchronizationGuard;
    }

    public static /* synthetic */ Object a(DefaultScheduler defaultScheduler, TransportContext transportContext, EventInternal eventInternal) {
        defaultScheduler.f24447d.persist(transportContext, eventInternal);
        defaultScheduler.f24444a.schedule(transportContext, 1);
        return null;
    }

    public static /* synthetic */ void b(final DefaultScheduler defaultScheduler, final TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        defaultScheduler.getClass();
        try {
            TransportBackend transportBackend = defaultScheduler.f24446c.get(transportContext.getBackendName());
            if (transportBackend == null) {
                String str = String.format("Transport backend '%s' is not registered", transportContext.getBackendName());
                f24443f.warning(str);
                transportScheduleCallback.onSchedule(new IllegalArgumentException(str));
            } else {
                final EventInternal eventInternalDecorate = transportBackend.decorate(eventInternal);
                defaultScheduler.f24448e.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: o3.b
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return DefaultScheduler.a(this.f96326a, transportContext, eventInternalDecorate);
                    }
                });
                transportScheduleCallback.onSchedule(null);
            }
        } catch (Exception e10) {
            f24443f.warning("Error scheduling event " + e10.getMessage());
            transportScheduleCallback.onSchedule(e10);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(final TransportContext transportContext, final EventInternal eventInternal, final TransportScheduleCallback transportScheduleCallback) {
        this.f24445b.execute(new Runnable() { // from class: o3.a
            @Override // java.lang.Runnable
            public final void run() {
                DefaultScheduler.b(this.f96322b, transportContext, transportScheduleCallback, eventInternal);
            }
        });
    }
}
