package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class V3 implements InterfaceC5060e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76580a = "client.db";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76581b = "metrica_client_data.db";

    @Override // io.appmetrica.analytics.impl.InterfaceC5060e7
    @NotNull
    public final String a() {
        return this.f76581b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5060e7
    @NotNull
    public final String b() {
        return this.f76580a;
    }
}
