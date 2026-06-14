package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
@DaggerGenerated
public final class SchemaManager_Factory implements Factory<SchemaManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf.a f24576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf.a f24577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kf.a f24578c;

    public SchemaManager_Factory(kf.a aVar, kf.a aVar2, kf.a aVar3) {
        this.f24576a = aVar;
        this.f24577b = aVar2;
        this.f24578c = aVar3;
    }

    public static SchemaManager_Factory create(kf.a aVar, kf.a aVar2, kf.a aVar3) {
        return new SchemaManager_Factory(aVar, aVar2, aVar3);
    }

    public static SchemaManager newInstance(Context context, String str, int i10) {
        return new SchemaManager(context, str, i10);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public SchemaManager get() {
        return newInstance((Context) this.f24576a.get(), (String) this.f24577b.get(), ((Integer) this.f24578c.get()).intValue());
    }
}
