package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5228kk implements InterfaceC5060e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77620a = "service_main.db";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77621b = "metrica_data.db";

    @Override // io.appmetrica.analytics.impl.InterfaceC5060e7
    @NotNull
    public final String a() {
        return this.f77621b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5060e7
    @NotNull
    public final String b() {
        return this.f77620a;
    }
}
