package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class U4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E5 f76553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lc f76554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lc f76555c;

    public U4(@NotNull S6 s62, @NotNull Vg vg2) {
        C5597ze c5597ze = new C5597ze(s62);
        this.f76553a = new E5(s62);
        this.f76554b = new Lc(c5597ze, new T4(vg2));
        this.f76555c = new Lc(c5597ze, S4.f76391a);
    }

    @NotNull
    public final List<K8> a() {
        return CollectionsKt.listOf((Object[]) new K8[]{this.f76553a, this.f76554b});
    }

    @NotNull
    public final List<K8> b() {
        return CollectionsKt.listOf(this.f76555c);
    }
}
