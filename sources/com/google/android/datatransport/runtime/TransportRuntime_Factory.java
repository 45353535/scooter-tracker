package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f24375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf.a f24376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kf.a f24377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kf.a f24378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kf.a f24379e;

    public TransportRuntime_Factory(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4, kf.a aVar5) {
        this.f24375a = aVar;
        this.f24376b = aVar2;
        this.f24377c = aVar3;
        this.f24378d = aVar4;
        this.f24379e = aVar5;
    }

    public static TransportRuntime_Factory create(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4, kf.a aVar5) {
        return new TransportRuntime_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public TransportRuntime get() {
        return newInstance((Clock) this.f24375a.get(), (Clock) this.f24376b.get(), (Scheduler) this.f24377c.get(), (Uploader) this.f24378d.get(), (WorkInitializer) this.f24379e.get());
    }
}
