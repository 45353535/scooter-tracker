package io.appmetrica.analytics.impl;

import com.ironsource.C4240b4;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class O4 implements InterfaceC5060e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76187b;

    public O4(@NotNull X4 x42) {
        this.f76186a = String.format("component_%s.db", Arrays.copyOf(new Object[]{x42.d() ? C4240b4.i.Z : x42.b()}, 1));
        this.f76187b = "db_metrica_" + x42;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5060e7
    @NotNull
    public final String a() {
        return this.f76187b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5060e7
    @NotNull
    public final String b() {
        return this.f76186a;
    }
}
