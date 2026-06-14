package io.appmetrica.analytics.impl;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Lc implements K8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ae f76068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f76069b;

    public Lc(@NotNull Ae ae2, @NotNull Function0<Integer> function0) {
        this.f76068a = ae2;
        this.f76069b = function0;
    }

    @Override // io.appmetrica.analytics.impl.K8
    public final boolean b() {
        return ((C5597ze) this.f76068a).f78632b.get() >= ((long) ((Number) this.f76069b.invoke()).intValue());
    }
}
