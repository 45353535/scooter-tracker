package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class ProcessDataManagerImpl_Factory implements Factory<ProcessDataManagerImpl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f33312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf.a f33313b;

    public ProcessDataManagerImpl_Factory(kf.a aVar, kf.a aVar2) {
        this.f33312a = aVar;
        this.f33313b = aVar2;
    }

    public static ProcessDataManagerImpl_Factory create(kf.a aVar, kf.a aVar2) {
        return new ProcessDataManagerImpl_Factory(aVar, aVar2);
    }

    public static ProcessDataManagerImpl newInstance(Context context, UuidGenerator uuidGenerator) {
        return new ProcessDataManagerImpl(context, uuidGenerator);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public ProcessDataManagerImpl get() {
        return newInstance((Context) this.f33312a.get(), (UuidGenerator) this.f33313b.get());
    }
}
