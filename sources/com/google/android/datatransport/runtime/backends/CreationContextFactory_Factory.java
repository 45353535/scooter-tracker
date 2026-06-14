package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.time.Clock;
import kf.a;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f24394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f24395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f24396c;

    public CreationContextFactory_Factory(a aVar, a aVar2, a aVar3) {
        this.f24394a = aVar;
        this.f24395b = aVar2;
        this.f24396c = aVar3;
    }

    public static CreationContextFactory_Factory create(a aVar, a aVar2, a aVar3) {
        return new CreationContextFactory_Factory(aVar, aVar2, aVar3);
    }

    public static CreationContextFactory newInstance(Context context, Clock clock, Clock clock2) {
        return new CreationContextFactory(context, clock, clock2);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public CreationContextFactory get() {
        return newInstance((Context) this.f24394a.get(), (Clock) this.f24395b.get(), (Clock) this.f24396c.get());
    }
}
