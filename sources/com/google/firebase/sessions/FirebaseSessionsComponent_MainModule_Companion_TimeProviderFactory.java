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
public final class FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory implements Factory<TimeProvider> {

    private static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory f33289a = new FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory();
    }

    public static FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory create() {
        return InstanceHolder.f33289a;
    }

    public static TimeProvider timeProvider() {
        return (TimeProvider) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.timeProvider());
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public TimeProvider get() {
        return timeProvider();
    }
}
