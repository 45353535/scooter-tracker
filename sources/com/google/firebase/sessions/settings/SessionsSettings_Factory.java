package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import kf.a;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.sessions.LocalOverrideSettingsProvider", "com.google.firebase.sessions.RemoteSettingsProvider"})
@DaggerGenerated
public final class SessionsSettings_Factory implements Factory<SessionsSettings> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f33494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f33495b;

    public SessionsSettings_Factory(a aVar, a aVar2) {
        this.f33494a = aVar;
        this.f33495b = aVar2;
    }

    public static SessionsSettings_Factory create(a aVar, a aVar2) {
        return new SessionsSettings_Factory(aVar, aVar2);
    }

    public static SessionsSettings newInstance(SettingsProvider settingsProvider, SettingsProvider settingsProvider2) {
        return new SessionsSettings(settingsProvider, settingsProvider2);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public SessionsSettings get() {
        return newInstance((SettingsProvider) this.f33494a.get(), (SettingsProvider) this.f33495b.get());
    }
}
