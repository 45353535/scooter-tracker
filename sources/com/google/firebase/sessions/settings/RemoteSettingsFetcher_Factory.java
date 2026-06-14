package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import kf.a;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Blocking"})
@DaggerGenerated
public final class RemoteSettingsFetcher_Factory implements Factory<RemoteSettingsFetcher> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f33475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f33476b;

    public RemoteSettingsFetcher_Factory(a aVar, a aVar2) {
        this.f33475a = aVar;
        this.f33476b = aVar2;
    }

    public static RemoteSettingsFetcher_Factory create(a aVar, a aVar2) {
        return new RemoteSettingsFetcher_Factory(aVar, aVar2);
    }

    public static RemoteSettingsFetcher newInstance(ApplicationInfo applicationInfo, CoroutineContext coroutineContext) {
        return new RemoteSettingsFetcher(applicationInfo, coroutineContext);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public RemoteSettingsFetcher get() {
        return newInstance((ApplicationInfo) this.f33475a.get(), (CoroutineContext) this.f33476b.get());
    }
}
