package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.time.Clock;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic", "javax.inject.Named"})
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f24559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf.a f24560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kf.a f24561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kf.a f24562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kf.a f24563e;

    public SQLiteEventStore_Factory(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4, kf.a aVar5) {
        this.f24559a = aVar;
        this.f24560b = aVar2;
        this.f24561c = aVar3;
        this.f24562d = aVar4;
        this.f24563e = aVar5;
    }

    public static SQLiteEventStore_Factory create(kf.a aVar, kf.a aVar2, kf.a aVar3, kf.a aVar4, kf.a aVar5) {
        return new SQLiteEventStore_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, kf.a aVar) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2, aVar);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public SQLiteEventStore get() {
        return newInstance((Clock) this.f24559a.get(), (Clock) this.f24560b.get(), this.f24561c.get(), this.f24562d.get(), this.f24563e);
    }
}
