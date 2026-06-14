package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5144hd implements ModuleServiceLifecycleController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T1 f77305a;

    public C5144hd(@NotNull T1 t12) {
        this.f77305a = t12;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(@NotNull final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f77305a.b(new S1() { // from class: io.appmetrica.analytics.impl.iq
            @Override // io.appmetrica.analytics.impl.S1
            public final void a(Intent intent) {
                C5144hd.a(moduleServiceLifecycleObserver, intent);
            }
        });
        this.f77305a.a(new S1() { // from class: io.appmetrica.analytics.impl.jq
            @Override // io.appmetrica.analytics.impl.S1
            public final void a(Intent intent) {
                C5144hd.b(moduleServiceLifecycleObserver, intent);
            }
        });
    }
}
