package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
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
public final class FirebaseSessions_Factory implements Factory<FirebaseSessions> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f33291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf.a f33292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kf.a f33293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kf.a f33294d;

    public FirebaseSessions_Factory(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4) {
        this.f33291a = aVar;
        this.f33292b = aVar2;
        this.f33293c = aVar3;
        this.f33294d = aVar4;
    }

    public static FirebaseSessions_Factory create(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4) {
        return new FirebaseSessions_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static FirebaseSessions newInstance(FirebaseApp firebaseApp, SessionsSettings sessionsSettings, CoroutineContext coroutineContext, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        return new FirebaseSessions(firebaseApp, sessionsSettings, coroutineContext, sessionsActivityLifecycleCallbacks);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public FirebaseSessions get() {
        return newInstance((FirebaseApp) this.f33291a.get(), (SessionsSettings) this.f33292b.get(), (CoroutineContext) this.f33293c.get(), (SessionsActivityLifecycleCallbacks) this.f33294d.get());
    }
}
