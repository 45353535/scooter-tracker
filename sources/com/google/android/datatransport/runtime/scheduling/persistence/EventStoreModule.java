package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Module;

/* JADX INFO: loaded from: classes7.dex */
@Module
public abstract class EventStoreModule {
    static String a() {
        return "com.google.android.datatransport.events";
    }

    static String b(Context context) {
        return context.getPackageName();
    }

    static int c() {
        return SchemaManager.f24565e;
    }

    static EventStoreConfig d() {
        return EventStoreConfig.f24546a;
    }
}
