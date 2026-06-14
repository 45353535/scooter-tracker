package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import kf.a;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f24455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f24456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f24457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f24458d;

    public SchedulingModule_WorkSchedulerFactory(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f24455a = aVar;
        this.f24456b = aVar2;
        this.f24457c = aVar3;
        this.f24458d = aVar4;
    }

    public static SchedulingModule_WorkSchedulerFactory create(a aVar, a aVar2, a aVar3, a aVar4) {
        return new SchedulingModule_WorkSchedulerFactory(aVar, aVar2, aVar3, aVar4);
    }

    public static WorkScheduler workScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.checkNotNullFromProvides(SchedulingModule.a(context, eventStore, schedulerConfig, clock));
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public WorkScheduler get() {
        return workScheduler((Context) this.f24455a.get(), (EventStore) this.f24456b.get(), (SchedulerConfig) this.f24457c.get(), (Clock) this.f24458d.get());
    }
}
