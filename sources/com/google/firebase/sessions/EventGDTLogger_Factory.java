package com.google.firebase.sessions;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class EventGDTLogger_Factory implements Factory<EventGDTLogger> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f33273a;

    public EventGDTLogger_Factory(kf.a aVar) {
        this.f33273a = aVar;
    }

    public static EventGDTLogger_Factory create(kf.a aVar) {
        return new EventGDTLogger_Factory(aVar);
    }

    public static EventGDTLogger newInstance(Provider<TransportFactory> provider) {
        return new EventGDTLogger(provider);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public EventGDTLogger get() {
        return newInstance((Provider) this.f33273a.get());
    }
}
