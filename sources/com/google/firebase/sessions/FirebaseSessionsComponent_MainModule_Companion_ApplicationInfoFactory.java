package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory implements Factory<ApplicationInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f33283a;

    public FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(kf.a aVar) {
        this.f33283a = aVar;
    }

    public static ApplicationInfo applicationInfo(FirebaseApp firebaseApp) {
        return (ApplicationInfo) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.applicationInfo(firebaseApp));
    }

    public static FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory create(kf.a aVar) {
        return new FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(aVar);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public ApplicationInfo get() {
        return applicationInfo((FirebaseApp) this.f33283a.get());
    }
}
