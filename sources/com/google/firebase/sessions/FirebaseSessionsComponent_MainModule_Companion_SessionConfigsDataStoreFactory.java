package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import com.google.firebase.sessions.settings.SessionConfigs;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Blocking"})
@DaggerGenerated
public final class FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory implements Factory<DataStore<SessionConfigs>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f33284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf.a f33285b;

    public FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory(kf.a aVar, kf.a aVar2) {
        this.f33284a = aVar;
        this.f33285b = aVar2;
    }

    public static FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory create(kf.a aVar, kf.a aVar2) {
        return new FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory(aVar, aVar2);
    }

    public static DataStore<SessionConfigs> sessionConfigsDataStore(Context context, CoroutineContext coroutineContext) {
        return (DataStore) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.sessionConfigsDataStore(context, coroutineContext));
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public DataStore<SessionConfigs> get() {
        return sessionConfigsDataStore((Context) this.f33284a.get(), (CoroutineContext) this.f33285b.get());
    }
}
