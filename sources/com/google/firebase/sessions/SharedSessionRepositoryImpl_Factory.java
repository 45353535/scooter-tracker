package com.google.firebase.sessions;

import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Background"})
@DaggerGenerated
public final class SharedSessionRepositoryImpl_Factory implements Factory<SharedSessionRepositoryImpl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f33407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf.a f33408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kf.a f33409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kf.a f33410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kf.a f33411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kf.a f33412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kf.a f33413g;

    public SharedSessionRepositoryImpl_Factory(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4, kf.a aVar5, kf.a aVar6, kf.a aVar7) {
        this.f33407a = aVar;
        this.f33408b = aVar2;
        this.f33409c = aVar3;
        this.f33410d = aVar4;
        this.f33411e = aVar5;
        this.f33412f = aVar6;
        this.f33413g = aVar7;
    }

    public static SharedSessionRepositoryImpl_Factory create(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4, kf.a aVar5, kf.a aVar6, kf.a aVar7) {
        return new SharedSessionRepositoryImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static SharedSessionRepositoryImpl newInstance(SessionsSettings sessionsSettings, SessionGenerator sessionGenerator, SessionFirelogPublisher sessionFirelogPublisher, TimeProvider timeProvider, DataStore<SessionData> dataStore, ProcessDataManager processDataManager, CoroutineContext coroutineContext) {
        return new SharedSessionRepositoryImpl(sessionsSettings, sessionGenerator, sessionFirelogPublisher, timeProvider, dataStore, processDataManager, coroutineContext);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public SharedSessionRepositoryImpl get() {
        return newInstance((SessionsSettings) this.f33407a.get(), (SessionGenerator) this.f33408b.get(), (SessionFirelogPublisher) this.f33409c.get(), (TimeProvider) this.f33410d.get(), (DataStore) this.f33411e.get(), (ProcessDataManager) this.f33412f.get(), (CoroutineContext) this.f33413g.get());
    }
}
