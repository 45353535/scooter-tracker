package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import kf.a;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f24402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f24403b;

    public MetadataBackendRegistry_Factory(a aVar, a aVar2) {
        this.f24402a = aVar;
        this.f24403b = aVar2;
    }

    public static MetadataBackendRegistry_Factory create(a aVar, a aVar2) {
        return new MetadataBackendRegistry_Factory(aVar, aVar2);
    }

    public static MetadataBackendRegistry newInstance(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public MetadataBackendRegistry get() {
        return newInstance((Context) this.f24402a.get(), this.f24403b.get());
    }
}
