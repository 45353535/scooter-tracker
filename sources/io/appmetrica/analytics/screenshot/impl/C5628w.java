package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5628w implements InterfaceC5615i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f79049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f79050b;

    public C5628w(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f79049a = clientContext;
        this.f79050b = u10;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC5615i
    @NotNull
    public final List<T> a() {
        return CollectionsKt.listOf((Object[]) new T[]{new C5610d(this.f79049a, this.f79050b), new C5627v(this.f79049a, this.f79050b), new g0(this.f79049a, this.f79050b)});
    }
}
