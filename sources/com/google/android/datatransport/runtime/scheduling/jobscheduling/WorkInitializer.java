package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public class WorkInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f24496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventStore f24497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WorkScheduler f24498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SynchronizationGuard f24499d;

    WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.f24496a = executor;
        this.f24497b = eventStore;
        this.f24498c = workScheduler;
        this.f24499d = synchronizationGuard;
    }

    public static /* synthetic */ Object a(WorkInitializer workInitializer) {
        Iterator<TransportContext> it = workInitializer.f24497b.loadActiveContexts().iterator();
        while (it.hasNext()) {
            workInitializer.f24498c.schedule(it.next(), 1);
        }
        return null;
    }

    public void ensureContextsScheduled() {
        this.f24496a.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.n
            @Override // java.lang.Runnable
            public final void run() {
                WorkInitializer workInitializer = this.f24531b;
                workInitializer.f24499d.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.o
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return WorkInitializer.a(workInitializer);
                    }
                });
            }
        });
    }
}
