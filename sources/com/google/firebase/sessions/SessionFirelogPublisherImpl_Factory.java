package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
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
public final class SessionFirelogPublisherImpl_Factory implements Factory<SessionFirelogPublisherImpl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f33352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf.a f33353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kf.a f33354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kf.a f33355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kf.a f33356e;

    public SessionFirelogPublisherImpl_Factory(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4, kf.a aVar5) {
        this.f33352a = aVar;
        this.f33353b = aVar2;
        this.f33354c = aVar3;
        this.f33355d = aVar4;
        this.f33356e = aVar5;
    }

    public static SessionFirelogPublisherImpl_Factory create(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4, kf.a aVar5) {
        return new SessionFirelogPublisherImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static SessionFirelogPublisherImpl newInstance(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, SessionsSettings sessionsSettings, EventGDTLoggerInterface eventGDTLoggerInterface, CoroutineContext coroutineContext) {
        return new SessionFirelogPublisherImpl(firebaseApp, firebaseInstallationsApi, sessionsSettings, eventGDTLoggerInterface, coroutineContext);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public SessionFirelogPublisherImpl get() {
        return newInstance((FirebaseApp) this.f33352a.get(), (FirebaseInstallationsApi) this.f33353b.get(), (SessionsSettings) this.f33354c.get(), (EventGDTLoggerInterface) this.f33355d.get(), (CoroutineContext) this.f33356e.get());
    }
}
