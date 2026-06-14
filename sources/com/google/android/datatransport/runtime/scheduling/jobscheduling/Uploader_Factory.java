package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
public final class Uploader_Factory implements Factory<Uploader> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f24487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf.a f24488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kf.a f24489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kf.a f24490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kf.a f24491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kf.a f24492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kf.a f24493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final kf.a f24494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final kf.a f24495i;

    public Uploader_Factory(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4, kf.a aVar5, kf.a aVar6, kf.a aVar7, kf.a aVar8, kf.a aVar9) {
        this.f24487a = aVar;
        this.f24488b = aVar2;
        this.f24489c = aVar3;
        this.f24490d = aVar4;
        this.f24491e = aVar5;
        this.f24492f = aVar6;
        this.f24493g = aVar7;
        this.f24494h = aVar8;
        this.f24495i = aVar9;
    }

    public static Uploader_Factory create(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4, kf.a aVar5, kf.a aVar6, kf.a aVar7, kf.a aVar8, kf.a aVar9) {
        return new Uploader_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public Uploader get() {
        return newInstance((Context) this.f24487a.get(), (BackendRegistry) this.f24488b.get(), (EventStore) this.f24489c.get(), (WorkScheduler) this.f24490d.get(), (Executor) this.f24491e.get(), (SynchronizationGuard) this.f24492f.get(), (Clock) this.f24493g.get(), (Clock) this.f24494h.get(), (ClientHealthMetricsStore) this.f24495i.get());
    }
}
