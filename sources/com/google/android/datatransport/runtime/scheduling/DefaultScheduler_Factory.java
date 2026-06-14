package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import kf.a;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f24449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f24450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f24451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f24452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f24453e;

    public DefaultScheduler_Factory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.f24449a = aVar;
        this.f24450b = aVar2;
        this.f24451c = aVar3;
        this.f24452d = aVar4;
        this.f24453e = aVar5;
    }

    public static DefaultScheduler_Factory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new DefaultScheduler_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static DefaultScheduler newInstance(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        return new DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public DefaultScheduler get() {
        return newInstance((Executor) this.f24449a.get(), (BackendRegistry) this.f24450b.get(), (WorkScheduler) this.f24451c.get(), (EventStore) this.f24452d.get(), (SynchronizationGuard) this.f24453e.get());
    }
}
