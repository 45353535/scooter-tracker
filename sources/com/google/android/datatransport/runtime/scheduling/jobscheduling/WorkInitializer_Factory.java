package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f24500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf.a f24501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kf.a f24502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kf.a f24503d;

    public WorkInitializer_Factory(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4) {
        this.f24500a = aVar;
        this.f24501b = aVar2;
        this.f24502c = aVar3;
        this.f24503d = aVar4;
    }

    public static WorkInitializer_Factory create(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4) {
        return new WorkInitializer_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public WorkInitializer get() {
        return newInstance((Executor) this.f24500a.get(), (EventStore) this.f24501b.get(), (WorkScheduler) this.f24502c.get(), (SynchronizationGuard) this.f24503d.get());
    }
}
