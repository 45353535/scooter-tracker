package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class SessionsActivityLifecycleCallbacks_Factory implements Factory<SessionsActivityLifecycleCallbacks> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f33370a;

    public SessionsActivityLifecycleCallbacks_Factory(kf.a aVar) {
        this.f33370a = aVar;
    }

    public static SessionsActivityLifecycleCallbacks_Factory create(kf.a aVar) {
        return new SessionsActivityLifecycleCallbacks_Factory(aVar);
    }

    public static SessionsActivityLifecycleCallbacks newInstance(SharedSessionRepository sharedSessionRepository) {
        return new SessionsActivityLifecycleCallbacks(sharedSessionRepository);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public SessionsActivityLifecycleCallbacks get() {
        return newInstance((SharedSessionRepository) this.f33370a.get());
    }
}
