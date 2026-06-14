package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Fd extends AbstractC5017cf implements InterfaceC5579yl {
    public Fd(@NotNull Oa oa2, @Nullable String str) {
        super(oa2, str);
    }

    @Nullable
    public final String c(@NotNull String str, @Nullable String str2) {
        return this.f76970a.getString(f(str), str2);
    }

    @NotNull
    public final InterfaceC5579yl d(@NotNull String str, @Nullable String str2) {
        return (InterfaceC5579yl) b(f(str), str2);
    }

    public final boolean e(@NotNull String str) {
        return this.f76970a.a(f(str));
    }

    @NotNull
    public abstract String f(@NotNull String str);

    @NotNull
    public InterfaceC5579yl g(@NotNull String str) {
        return (InterfaceC5579yl) d(f(str));
    }

    public Fd(@NotNull Oa oa2) {
        this(oa2, null);
    }

    @NotNull
    public final InterfaceC5579yl d(@NotNull String str, int i10) {
        return (InterfaceC5579yl) b(f(str), i10);
    }

    public final int c(@NotNull String str, int i10) {
        return this.f76970a.getInt(f(str), i10);
    }

    @NotNull
    public final InterfaceC5579yl d(@NotNull String str, long j10) {
        return (InterfaceC5579yl) b(f(str), j10);
    }

    @NotNull
    public final InterfaceC5579yl d(@NotNull String str, boolean z10) {
        return (InterfaceC5579yl) b(f(str), z10);
    }

    public final long c(@NotNull String str, long j10) {
        return this.f76970a.getLong(f(str), j10);
    }

    public final boolean c(@NotNull String str, boolean z10) {
        return this.f76970a.getBoolean(f(str), z10);
    }
}
