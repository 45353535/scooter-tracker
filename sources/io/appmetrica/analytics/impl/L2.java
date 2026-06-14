package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class L2 implements ModulePreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5579yl f76046a;

    public L2(@NotNull InterfaceC5579yl interfaceC5579yl) {
        this.f76046a = interfaceC5579yl;
    }

    @NotNull
    public abstract String a(@NotNull String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(@NotNull String str, boolean z10) {
        return ((Fd) this.f76046a).c(str, z10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(@NotNull String str, int i10) {
        return ((Fd) this.f76046a).c(str, i10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(@NotNull String str, long j10) {
        return ((Fd) this.f76046a).c(a(str), j10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    @Nullable
    public final String getString(@NotNull String str, @Nullable String str2) {
        return ((Fd) this.f76046a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(@NotNull String str, boolean z10) {
        Fd fd2 = (Fd) this.f76046a;
        ((AbstractC5017cf) ((InterfaceC5579yl) fd2.b(fd2.f(a(str)), z10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(@NotNull String str, int i10) {
        Fd fd2 = (Fd) this.f76046a;
        ((AbstractC5017cf) ((InterfaceC5579yl) fd2.b(fd2.f(str), i10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(@NotNull String str, long j10) {
        Fd fd2 = (Fd) this.f76046a;
        ((AbstractC5017cf) ((InterfaceC5579yl) fd2.b(fd2.f(a(str)), j10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(@NotNull String str, @Nullable String str2) {
        Fd fd2 = (Fd) this.f76046a;
        ((AbstractC5017cf) ((InterfaceC5579yl) fd2.b(fd2.f(a(str)), str2))).b();
    }
}
