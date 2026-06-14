package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5538x5 implements Yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78550a;

    public C5538x5(@NotNull String str) {
        this.f78550a = str;
    }

    @NotNull
    public final C5538x5 a(@NotNull String str) {
        return new C5538x5(str);
    }

    @NotNull
    public final String b() {
        return this.f78550a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5538x5) && Intrinsics.areEqual(this.f78550a, ((C5538x5) obj).f78550a);
    }

    public final int hashCode() {
        return this.f78550a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f78550a + ')';
    }

    public static C5538x5 a(C5538x5 c5538x5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c5538x5.f78550a;
        }
        c5538x5.getClass();
        return new C5538x5(str);
    }

    @Override // io.appmetrica.analytics.impl.Yc
    @NotNull
    public final String a() {
        return this.f78550a;
    }
}
