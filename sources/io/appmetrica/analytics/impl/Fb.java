package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Fb implements ConfigProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5058e5 f75770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f75771b = lf.i.a(new Eb(this));

    public Fb(@NotNull C5058e5 c5058e5) {
        this.f75770a = c5058e5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5351ph getConfig() {
        return (C5351ph) this.f75771b.getValue();
    }
}
