package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import kf.a;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Background"})
@DaggerGenerated
public final class SettingsCacheImpl_Factory implements Factory<SettingsCacheImpl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f33514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f33515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f33516c;

    public SettingsCacheImpl_Factory(a aVar, a aVar2, a aVar3) {
        this.f33514a = aVar;
        this.f33515b = aVar2;
        this.f33516c = aVar3;
    }

    public static SettingsCacheImpl_Factory create(a aVar, a aVar2, a aVar3) {
        return new SettingsCacheImpl_Factory(aVar, aVar2, aVar3);
    }

    public static SettingsCacheImpl newInstance(CoroutineContext coroutineContext, TimeProvider timeProvider, DataStore<SessionConfigs> dataStore) {
        return new SettingsCacheImpl(coroutineContext, timeProvider, dataStore);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public SettingsCacheImpl get() {
        return newInstance((CoroutineContext) this.f33514a.get(), (TimeProvider) this.f33515b.get(), (DataStore) this.f33516c.get());
    }
}
