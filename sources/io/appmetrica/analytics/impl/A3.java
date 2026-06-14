package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class A3 implements W7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5586z3 f75490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f75491b;

    public A3(@NotNull C5586z3 c5586z3, @NotNull List<C5586z3> list) {
        this.f75490a = c5586z3;
        this.f75491b = list;
    }

    @NotNull
    public final A3 a(@NotNull C5586z3 c5586z3, @NotNull List<C5586z3> list) {
        return new A3(c5586z3, list);
    }

    @Override // io.appmetrica.analytics.impl.W7
    public final Object b() {
        return this.f75490a;
    }

    @NotNull
    public final C5586z3 c() {
        return this.f75490a;
    }

    @NotNull
    public final List<C5586z3> d() {
        return this.f75491b;
    }

    @NotNull
    public final C5586z3 e() {
        return this.f75490a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A3)) {
            return false;
        }
        A3 a32 = (A3) obj;
        return Intrinsics.areEqual(this.f75490a, a32.f75490a) && Intrinsics.areEqual(this.f75491b, a32.f75491b);
    }

    public final int hashCode() {
        return this.f75491b.hashCode() + (this.f75490a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ClidsInfo(chosen=" + this.f75490a + ", candidates=" + this.f75491b + ')';
    }

    public static A3 a(A3 a32, C5586z3 c5586z3, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c5586z3 = a32.f75490a;
        }
        if ((i10 & 2) != 0) {
            list = a32.f75491b;
        }
        a32.getClass();
        return new A3(c5586z3, list);
    }

    @Override // io.appmetrica.analytics.impl.W7
    @NotNull
    public final List<C5586z3> a() {
        return this.f75491b;
    }
}
