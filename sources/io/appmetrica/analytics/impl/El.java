package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class El implements S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75743a;

    public El(@NotNull Context context) {
        this.f75743a = context;
    }

    @Override // io.appmetrica.analytics.impl.S2, io.appmetrica.analytics.impl.InterfaceC5331om
    public final void a(@NotNull C5204jm c5204jm) {
    }

    @NotNull
    public final Context b() {
        return this.f75743a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }
}
