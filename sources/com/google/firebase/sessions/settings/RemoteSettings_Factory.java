package com.google.firebase.sessions.settings;

import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import kf.a;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class RemoteSettings_Factory implements Factory<RemoteSettings> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f33477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f33478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f33479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f33480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f33481e;

    public RemoteSettings_Factory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.f33477a = aVar;
        this.f33478b = aVar2;
        this.f33479c = aVar3;
        this.f33480d = aVar4;
        this.f33481e = aVar5;
    }

    public static RemoteSettings_Factory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new RemoteSettings_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static RemoteSettings newInstance(TimeProvider timeProvider, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo, CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, SettingsCache settingsCache) {
        return new RemoteSettings(timeProvider, firebaseInstallationsApi, applicationInfo, crashlyticsSettingsFetcher, settingsCache);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public RemoteSettings get() {
        return newInstance((TimeProvider) this.f33477a.get(), (FirebaseInstallationsApi) this.f33478b.get(), (ApplicationInfo) this.f33479c.get(), (CrashlyticsSettingsFetcher) this.f33480d.get(), (SettingsCache) this.f33481e.get());
    }
}
