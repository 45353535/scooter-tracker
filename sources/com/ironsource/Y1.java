package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f42107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f42108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f42110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Map<String, ? extends Object> f42111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private com.ironsource.mediationsdk.h f42112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private Map<String, Object> f42113g;

    public Y1(@NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f42107a = name;
        this.f42108b = z10;
        this.f42110d = "";
        this.f42111e = MapsKt.emptyMap();
        this.f42113g = new HashMap();
    }

    @NotNull
    public final String a() {
        return this.f42107a;
    }

    public final boolean b() {
        return this.f42108b;
    }

    @NotNull
    public final Map<String, Object> c() {
        return this.f42113g;
    }

    @Nullable
    public final com.ironsource.mediationsdk.h d() {
        return this.f42112f;
    }

    public final boolean e() {
        return this.f42108b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y1)) {
            return false;
        }
        Y1 y12 = (Y1) obj;
        return Intrinsics.areEqual(this.f42107a, y12.f42107a) && this.f42108b == y12.f42108b;
    }

    @NotNull
    public final Map<String, Object> f() {
        return this.f42111e;
    }

    @NotNull
    public final String g() {
        return this.f42107a;
    }

    @NotNull
    public final String h() {
        return this.f42110d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f42107a.hashCode() * 31;
        boolean z10 = this.f42108b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final boolean i() {
        return this.f42109c;
    }

    @NotNull
    public String toString() {
        return "AuctionInstanceInfo(name=" + this.f42107a + ", bidder=" + this.f42108b + ")";
    }

    @NotNull
    public final Y1 a(@NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Y1(name, z10);
    }

    public final void b(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f42111e = map;
    }

    public static /* synthetic */ Y1 a(Y1 y12, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = y12.f42107a;
        }
        if ((i10 & 2) != 0) {
            z10 = y12.f42108b;
        }
        return y12.a(str, z10);
    }

    public final void a(boolean z10) {
        this.f42109c = z10;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f42110d = str;
    }

    public final void a(@Nullable com.ironsource.mediationsdk.h hVar) {
        this.f42112f = hVar;
    }

    public final void a(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f42113g = map;
    }
}
