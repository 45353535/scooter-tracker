package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5453tk implements Pc {
    @Override // io.appmetrica.analytics.impl.Pc
    public final void a(@NotNull Context context) {
        Vm vm = (Vm) Tm.a(C5306nm.class);
        ProtobufStateStorage<Object> protobufStateStorageA = vm.a(context, vm.b(context));
        C5306nm c5306nm = (C5306nm) protobufStateStorageA.read();
        C5281mm c5281mmA = c5306nm.a(c5306nm.f77855m);
        c5281mmA.f77784o = 0L;
        protobufStateStorageA.save(new C5306nm(c5281mmA));
    }
}
