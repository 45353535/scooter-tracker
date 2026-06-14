package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistryModule;
import com.google.android.datatransport.runtime.dagger.BindsInstance;
import com.google.android.datatransport.runtime.dagger.Component;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule;
import com.google.android.datatransport.runtime.time.TimeModule;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
@Component(modules = {BackendRegistryModule.class, EventStoreModule.class, ExecutionModule.class, SchedulingModule.class, SchedulingConfigModule.class, TimeModule.class})
abstract class TransportRuntimeComponent implements Closeable, AutoCloseable {

    @Component.Builder
    interface Builder {
        TransportRuntimeComponent build();

        @BindsInstance
        Builder setApplicationContext(Context context);
    }

    TransportRuntimeComponent() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m().close();
    }

    abstract EventStore m();

    abstract TransportRuntime n();
}
