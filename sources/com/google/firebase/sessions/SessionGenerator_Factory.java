package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class SessionGenerator_Factory implements Factory<SessionGenerator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f33359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf.a f33360b;

    public SessionGenerator_Factory(kf.a aVar, kf.a aVar2) {
        this.f33359a = aVar;
        this.f33360b = aVar2;
    }

    public static SessionGenerator_Factory create(kf.a aVar, kf.a aVar2) {
        return new SessionGenerator_Factory(aVar, aVar2);
    }

    public static SessionGenerator newInstance(TimeProvider timeProvider, UuidGenerator uuidGenerator) {
        return new SessionGenerator(timeProvider, uuidGenerator);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public SessionGenerator get() {
        return newInstance((TimeProvider) this.f33359a.get(), (UuidGenerator) this.f33360b.get());
    }
}
