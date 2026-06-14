package com.google.firebase.sessions.settings;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import kf.a;

/* JADX INFO: loaded from: classes9.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class LocalOverrideSettings_Factory implements Factory<LocalOverrideSettings> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f33448a;

    public LocalOverrideSettings_Factory(a aVar) {
        this.f33448a = aVar;
    }

    public static LocalOverrideSettings_Factory create(a aVar) {
        return new LocalOverrideSettings_Factory(aVar);
    }

    public static LocalOverrideSettings newInstance(Context context) {
        return new LocalOverrideSettings(context);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, kf.a
    public LocalOverrideSettings get() {
        return newInstance((Context) this.f33448a.get());
    }
}
