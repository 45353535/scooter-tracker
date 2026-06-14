package com.ironsource;

import com.ironsource.C4475p0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private C4475p0.a f41017a;

    public H(@NotNull C4475p0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f41017a = performance;
    }

    @NotNull
    public final C4475p0.a a() {
        return this.f41017a;
    }

    @NotNull
    public final C4475p0.a b() {
        return this.f41017a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && this.f41017a == ((H) obj).f41017a;
    }

    public int hashCode() {
        return this.f41017a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdInstancePerformance(performance=" + this.f41017a + ")";
    }

    @NotNull
    public final H a(@NotNull C4475p0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        return new H(performance);
    }

    public final void b(@NotNull C4475p0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f41017a = aVar;
    }

    public static /* synthetic */ H a(H h10, C4475p0.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = h10.f41017a;
        }
        return h10.a(aVar);
    }
}
