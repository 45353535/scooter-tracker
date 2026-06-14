package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class po implements Ra {
    @Override // io.appmetrica.analytics.impl.Ra
    @Nullable
    public final String a(@NotNull Context context) {
        C5306nm c5306nm;
        try {
            Um umA = Tm.a(C5306nm.class);
            if (umA == null) {
                return null;
            }
            Vm vm = (Vm) umA;
            ProtobufStateStorage<Object> protobufStateStorageA = vm.a(context, vm.a(context));
            if (protobufStateStorageA == null || (c5306nm = (C5306nm) protobufStateStorageA.read()) == null) {
                return null;
            }
            return c5306nm.f77843a;
        } catch (Throwable unused) {
            return null;
        }
    }
}
