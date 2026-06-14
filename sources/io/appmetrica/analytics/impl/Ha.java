package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface Ha extends SimpleAdvertisingIdGetter, InterfaceC5331om {
    @NotNull
    AdvertisingIdsHolder a();

    @NotNull
    AdvertisingIdsHolder a(@NotNull Li li);

    @Override // io.appmetrica.analytics.impl.InterfaceC5331om
    /* synthetic */ void a(@NonNull C5204jm c5204jm);

    void b(boolean z10);

    void c(boolean z10);

    @NotNull
    AdvertisingIdsHolder getIdentifiers();

    void init();
}
