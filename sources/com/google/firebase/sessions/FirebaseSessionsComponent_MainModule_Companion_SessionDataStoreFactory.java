package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Blocking"})
@DaggerGenerated
public final class FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory implements Factory<DataStore<SessionData>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f33286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf.a f33287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kf.a f33288c;

    public FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory(kf.a aVar, kf.a aVar2, kf.a aVar3) {
        this.f33286a = aVar;
        this.f33287b = aVar2;
        this.f33288c = aVar3;
    }

    public static FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory create(kf.a aVar, kf.a aVar2, kf.a aVar3) {
        return new FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory(aVar, aVar2, aVar3);
    }

    public static DataStore<SessionData> sessionDataStore(Context context, CoroutineContext coroutineContext, SessionDataSerializer sessionDataSerializer) {
        return (DataStore) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.sessionDataStore(context, coroutineContext, sessionDataSerializer));
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public DataStore<SessionData> get() {
        return sessionDataStore((Context) this.f33286a.get(), (CoroutineContext) this.f33287b.get(), (SessionDataSerializer) this.f33288c.get());
    }
}
