package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4573ue {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private static Boolean f45560b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4573ue f45559a = new C4573ue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static EnumC4556te f45561c = EnumC4556te.NOT_INIT;

    private C4573ue() {
    }

    @NotNull
    public final synchronized EnumC4556te a() {
        return f45561c;
    }

    @NotNull
    public final EnumC4556te b() {
        Boolean bool = f45560b;
        if (bool == null ? true : Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return EnumC4556te.NOT_INIT;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return f45561c;
        }
        throw new lf.m();
    }

    public final synchronized void a(@NotNull EnumC4556te enumC4556te) {
        Intrinsics.checkNotNullParameter(enumC4556te, "<set-?>");
        f45561c = enumC4556te;
    }

    public final void a(boolean z10) {
        f45560b = Boolean.valueOf(z10);
    }
}
