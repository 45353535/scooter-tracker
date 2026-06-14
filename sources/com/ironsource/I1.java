package com.ironsource;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f41073a;

    public I1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final Map<String, String> a() {
        return this.f41073a;
    }

    @NotNull
    public final Map<String, String> b() {
        return this.f41073a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I1) && Intrinsics.areEqual(this.f41073a, ((I1) obj).f41073a);
    }

    public int hashCode() {
        return this.f41073a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f41073a + ")";
    }

    public I1(@NotNull Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        this.f41073a = mediationTypes;
    }

    @NotNull
    public final I1 a(@NotNull Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        return new I1(mediationTypes);
    }

    public /* synthetic */ I1(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ I1 a(I1 i12, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = i12.f41073a;
        }
        return i12.a(map);
    }
}
