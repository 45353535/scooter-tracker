package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
@DaggerGenerated
public final class EventStoreModule_SchemaVersionFactory implements Factory<Integer> {

    private static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final EventStoreModule_SchemaVersionFactory f24549a = new EventStoreModule_SchemaVersionFactory();
    }

    public static EventStoreModule_SchemaVersionFactory create() {
        return InstanceHolder.f24549a;
    }

    public static int schemaVersion() {
        return EventStoreModule.c();
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public Integer get() {
        return Integer.valueOf(schemaVersion());
    }
}
