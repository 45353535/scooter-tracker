package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class SessionDataSerializer_Factory implements Factory<SessionDataSerializer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f33323a;

    public SessionDataSerializer_Factory(kf.a aVar) {
        this.f33323a = aVar;
    }

    public static SessionDataSerializer_Factory create(kf.a aVar) {
        return new SessionDataSerializer_Factory(aVar);
    }

    public static SessionDataSerializer newInstance(SessionGenerator sessionGenerator) {
        return new SessionDataSerializer(sessionGenerator);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public SessionDataSerializer get() {
        return newInstance((SessionGenerator) this.f33323a.get());
    }
}
