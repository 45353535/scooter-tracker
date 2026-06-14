package com.google.firebase.sessions;

import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
public final class FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory implements Factory<UuidGenerator> {

    private static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory f33290a = new FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory();
    }

    public static FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory create() {
        return InstanceHolder.f33290a;
    }

    public static UuidGenerator uuidGenerator() {
        return (UuidGenerator) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.uuidGenerator());
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public UuidGenerator get() {
        return uuidGenerator();
    }
}
