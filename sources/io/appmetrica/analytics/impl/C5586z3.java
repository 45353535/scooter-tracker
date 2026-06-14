package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5586z3 implements Z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f78603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y7 f78604b;

    public C5586z3(@Nullable Map<String, String> map, @NotNull Y7 y72) {
        this.f78603a = map;
        this.f78604b = y72;
    }

    @NotNull
    public final C5586z3 a(@Nullable Map<String, String> map, @NotNull Y7 y72) {
        return new C5586z3(map, y72);
    }

    @Nullable
    public final Map<String, String> b() {
        return this.f78603a;
    }

    @NotNull
    public final Y7 c() {
        return this.f78604b;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.f78603a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5586z3)) {
            return false;
        }
        C5586z3 c5586z3 = (C5586z3) obj;
        return Intrinsics.areEqual(this.f78603a, c5586z3.f78603a) && this.f78604b == c5586z3.f78604b;
    }

    public final int hashCode() {
        Map map = this.f78603a;
        return this.f78604b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "Candidate(clids=" + this.f78603a + ", source=" + this.f78604b + ')';
    }

    public static C5586z3 a(C5586z3 c5586z3, Map map, Y7 y72, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = c5586z3.f78603a;
        }
        if ((i10 & 2) != 0) {
            y72 = c5586z3.f78604b;
        }
        c5586z3.getClass();
        return new C5586z3(map, y72);
    }

    @Override // io.appmetrica.analytics.impl.Z7
    @NotNull
    public final Y7 a() {
        return this.f78604b;
    }
}
