package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
@DaggerGenerated
public final class EventStoreModule_DbNameFactory implements Factory<String> {

    private static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final EventStoreModule_DbNameFactory f24547a = new EventStoreModule_DbNameFactory();
    }

    public static EventStoreModule_DbNameFactory create() {
        return InstanceHolder.f24547a;
    }

    public static String dbName() {
        return (String) Preconditions.checkNotNullFromProvides(EventStoreModule.a());
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public String get() {
        return dbName();
    }
}
