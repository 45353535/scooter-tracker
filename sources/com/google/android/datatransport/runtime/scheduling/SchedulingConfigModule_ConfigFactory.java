package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import kf.a;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime"})
@ScopeMetadata
@DaggerGenerated
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f24454a;

    public SchedulingConfigModule_ConfigFactory(a aVar) {
        this.f24454a = aVar;
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNullFromProvides(SchedulingConfigModule.a(clock));
    }

    public static SchedulingConfigModule_ConfigFactory create(a aVar) {
        return new SchedulingConfigModule_ConfigFactory(aVar);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public SchedulerConfig get() {
        return config((Clock) this.f24454a.get());
    }
}
