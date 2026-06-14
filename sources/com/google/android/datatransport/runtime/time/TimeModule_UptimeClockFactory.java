package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
public final class TimeModule_UptimeClockFactory implements Factory<Clock> {

    private static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final TimeModule_UptimeClockFactory f24616a = new TimeModule_UptimeClockFactory();
    }

    public static TimeModule_UptimeClockFactory create() {
        return InstanceHolder.f24616a;
    }

    public static Clock uptimeClock() {
        return (Clock) Preconditions.checkNotNullFromProvides(TimeModule.b());
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public Clock get() {
        return uptimeClock();
    }
}
