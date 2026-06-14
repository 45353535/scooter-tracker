package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
public final class EventStoreModule_StoreConfigFactory implements Factory<EventStoreConfig> {

    private static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final EventStoreModule_StoreConfigFactory f24550a = new EventStoreModule_StoreConfigFactory();
    }

    public static EventStoreModule_StoreConfigFactory create() {
        return InstanceHolder.f24550a;
    }

    public static EventStoreConfig storeConfig() {
        return (EventStoreConfig) Preconditions.checkNotNullFromProvides(EventStoreModule.d());
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public EventStoreConfig get() {
        return storeConfig();
    }
}
