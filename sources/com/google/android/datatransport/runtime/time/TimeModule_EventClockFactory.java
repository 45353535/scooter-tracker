package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime"})
@ScopeMetadata
@DaggerGenerated
public final class TimeModule_EventClockFactory implements Factory<Clock> {

    private static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final TimeModule_EventClockFactory f24615a = new TimeModule_EventClockFactory();
    }

    public static TimeModule_EventClockFactory create() {
        return InstanceHolder.f24615a;
    }

    public static Clock eventClock() {
        return (Clock) Preconditions.checkNotNullFromProvides(TimeModule.a());
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public Clock get() {
        return eventClock();
    }
}
