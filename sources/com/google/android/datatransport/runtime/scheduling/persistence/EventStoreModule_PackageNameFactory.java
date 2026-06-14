package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class EventStoreModule_PackageNameFactory implements Factory<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f24548a;

    public EventStoreModule_PackageNameFactory(kf.a aVar) {
        this.f24548a = aVar;
    }

    public static EventStoreModule_PackageNameFactory create(kf.a aVar) {
        return new EventStoreModule_PackageNameFactory(aVar);
    }

    public static String packageName(Context context) {
        return (String) Preconditions.checkNotNullFromProvides(EventStoreModule.b(context));
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public String get() {
        return packageName((Context) this.f24548a.get());
    }
}
