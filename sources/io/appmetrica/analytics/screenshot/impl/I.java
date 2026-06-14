package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class I implements InterfaceC5615i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f78958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f78959b;

    public I(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f78958a = clientContext;
        this.f78959b = u10;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC5615i
    @NotNull
    public final List<T> a() {
        return CollectionsKt.listOf((Object[]) new T[]{new C5627v(this.f78958a, this.f78959b), new g0(this.f78958a, this.f78959b)});
    }
}
